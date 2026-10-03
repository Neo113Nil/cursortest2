# Cloaking hints (Betclic / Polish Gaming SPZoo / Beclc)

- Play title «Betclic» ≠ APK application-label «Beclc» (ещё строка app_name «BCLC Quize»).
- Application в манифесте: com.pairip.application.Application (attachBaseContext → LicenseClient.checkLicense), дальше com.bclc.quize.Application.
- Лаунчер: com.bclc.quize.MainActivity. Сразу в onCreate поднимает оболочку (quizShell / J1wAJx128MKj) с заставкой, WebView и Compose-панелью.
- Gate: тихий GET `https://cavid.site/collect_quiz_results/` (адрес AES/CBC/PKCS5Padding из XOR-кусков). OkHttp 4.12.0, interceptor кладёт заголовок User-Agent = System.getProperty("http.agent") либо запасной «BCLCQuize/1.0». Тела нет.
- Ответ: HTTP 2xx + текст, который после trim начинается с «http» → оффер. Иначе / ошибка / пусто → белая викторина.
- SharedPreferences `startup_prefs`, ключ `saved_url` (параметр destination). Пустая строка = белый путь.
- Показ оффера: WebView.loadUrl (KFN7mfUQmemo) + WebViewClient tukouzXbdFcR (diia.app / ua.gov.diia.app / intent / OR_BIBED_11 / OR_BIBED_15 / Chrome ACTION_VIEW). Custom Tabs SDK нет.
- config.ru в splits0.xml — языковой сплит, не сетевой хост.
