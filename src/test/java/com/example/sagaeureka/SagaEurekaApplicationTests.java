package com.example.sagaeureka;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@Slf4j
@ActiveProfiles("test")
@SpringBootTest
class SagaEurekaApplicationTests {

    @Test
    void contextLoads() {
        log.info("gateway 실행 성공");
    }

}
