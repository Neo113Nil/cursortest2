# Cloaking hints (Betclic / Zeta Mesh Software / M Check)

- Play title «Betclic» ≠ APK application-label «M Check» (`strings.xml` `app_name`). Расхождение названий есть.
- `android:name` = `com.pairip.application.Application` → `attachBaseContext` вызывает `LicenseClient.checkLicense`, затем `MCheckApp`.
- `MCheckApp.onCreate`: Room `mcheck.db` + DataStore `datastore/settings.preferences_pb`. Нет HTTP.
- Launcher `MainActivity.onCreate`: Jetpack Compose (`setContent` / `lq1.g`). Навигация Class / Bike / Checks / Notes / Sessions / Settings.
- INTERNET в манифесте нет. WebView / Custom Tabs / `loadUrl` / `shouldOverrideUrlLoading` / OkHttp / HttpURLConnection / Volley / Retrofit / Firebase Remote Config в first-party и в DEX нет.
- `class_sample_offer` / `sampleOffered` / `sample_dismissed` — локальная загрузка демо-класса «Oak class: twelve Year 5 bikes», не URL оффера.
- `Redirected` / `RedirectCancelled` — enum Compose-навигации (`tx`), не редирект на сайт.
- `config.ru` в `splits0.xml` — языковой сплит `split="config.ru"`, не сетевой хост.
- PairIP `CHECK_LICENSE` / `PAYWALL_INTENT` — лицензия Google Play, не gate/оффер.
- DataStore ключи: instructor, default_check, current_session, last_bike, sample_dismissed. Room таблицы checks, classes, bikes, sessions, results.
- `ACTION_SEND` + `createChooser` — шаринг текста «письма домой». `ACTION_VIEW` в DEX нет.
- Сборка: APKPure XAPK Betclic 1.0 vc1. Папки Play Collector в git не было.
