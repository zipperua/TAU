package taudemo;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import browser.BrowserGetter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)

public class SeleniumTest {
    private BrowserGetter browserGetter = new BrowserGetter();
    private WebDriver driver;

       @BeforeAll
    public void beforeAll(){
    driver = browserGetter.getChromeDriver();
        }

    @AfterAll
    public void afterAll() {
    driver.quit();
    }

    @Test
    public void openThePageAndCheckTheTitle(){
    String expectedTitle = "Example Title";
    driver.get("http://wwww.example.com");
    assertEquals(expectedTitle,driver.getTitle());
    }
}

