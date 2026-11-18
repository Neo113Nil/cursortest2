# Cloaking hints (Betclic / T&C WELDING / Route Card)

- Play title «Betclic» ≠ APK application-label «Route Card» (`strings.xml` `app_name`). Расхождение названий есть.
- `android:name` = `com.pairip.application.Application` → `attachBaseContext` вызывает `LicenseClient.checkLicense`, затем `RouteCardApp`.
- `RouteCardApp.onCreate`: Koin + канал уведомлений `leg_due`. Нет HTTP.
- Launcher `MainActivity.onCreate`: Jetpack Compose (`setContent`). `onStart`/`onStop`: будильник `DueAlarmReceiver` на срок этапа маршрута.
- INTERNET в манифесте нет. WebView / Custom Tabs / `loadUrl` / `shouldOverrideUrlLoading` / OkHttp / HttpURLConnection / Volley / Retrofit / Firebase Remote Config в first-party нет.
- Слово `offer_*` в строках — загрузка демо «six weeks of a trainee leader's night navigation», не URL оффера.
- `config.ru` в `splits0.xml` — языковой сплит `split="config.ru"`, не сетевой хост.
- `Dispatchers.IO` / `Dispatchers.Default` — Kotlin coroutines, не домен dispatchers.io.
- PairIP `CHECK_LICENSE` / `PAYWALL_INTENT` — лицензия Google Play, не gate/оффер.
- DataStore файл `datastore/settings.preferences_pb` — локальный темп и вибросигнал. Room `RouteDatabase` — карточки маршрутов.
- Сборка: APKPure XAPK Betclic 1.0 vc1. Папки Play Collector в git не было.
