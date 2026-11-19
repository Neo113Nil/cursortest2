# Cloaking hints (1Win Casino and Betting / Kumar Strategic Consulting / Brevino Charge)

- Play title «1Win Casino and Betting» ≠ APK application-label «Brevino Charge».
- Application в манифесте: com.pairip.application.Application (attachBaseContext → LicenseClient.checkLicense), дальше BrevinoChargeApplication.
- Лаунчер: SplashActivity. onCreate: OneSignal init, Compose-заставка zn(8).
- SDK key `configcat-sdk-1/bi7fCHL9o0iBdnYpQE-HQQ/g8AKqSuolkm0xwaEkwDerw`, stringKey `xcbhhkfabkfa`, buttonText `Tap here`, OneSignal `23bcd20e-57ab-4604-93cd-5a9cb5989b50`, LinkOpenMode.BROWSER (t21.c), Custom Tabs реализованы в ur2.A.
- ConfigCatClient: GET `{cdn-global|cdn-eu}.configcat.com/configuration-files/{sdkKey}/config_v6.json`, заголовок X-ConfigCat-UserAgent `ConfigCat-Droid/l-10.2.0`, опционально If-None-Match. Кэш SharedPreferences `configcat_preferences`. User-объект не передают.
- SplashActivity.i: строка с «://» или «www.» = оффер-URL, иначе null. Таймаут 4000 мс, минимум заставки 1800 мс.
- Живой ответ ConfigCat на момент разбора: `xcbhhkfabkfa` = «Tap here» (белая строка, не URL).
- Оффер: PulseStartLink → je1 → ur2.A/B (ACTION_VIEW / Custom Tabs). Белый путь: MenuActivity.
- dispatchers.io в пайплайне = строка Kotlin Dispatchers, не сетевой хост этого APK.
- WebView в first-party нет.
