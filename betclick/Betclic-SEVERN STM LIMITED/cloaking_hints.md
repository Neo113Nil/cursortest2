# Cloaking hints (Betclic / SEVERN STM LIMITED / Race Signals)

- Play title «Betclic» ≠ APK application-label «Race Signals» (`strings.xml` `app_name`, XAPK `name`). Белая оболочка по названию карточки.
- Application: `com.pairip.application.Application` → `attachBaseContext` вызывает `LicenseClient.checkLicense`, затем `RaceSignalsApp`.
- Launcher `MainActivity.onCreate`: ComponentActivity + Jetpack Compose (вкладки Mast / Flags / Sequence / Signals, настройки). HTTP нет.
- INTERNET в манифесте нет (ни в base, ни в сплитах). WebView / Custom Tabs / `loadUrl` / `shouldOverrideUrlLoading` / OkHttp / HttpURLConnection / Volley / Retrofit / Firebase Remote Config в DEX нет. `android.intent.action.VIEW` в DEX нет.
- `showSampleOffer` / `sampleOffered` / `sample_offered` — локальная загрузка четырёх демо-записей регаты («Load four Wednesday race nights»), не URL оффера.
- `config.ru` в `splits0.xml` — языковой сплит `split="config.ru"`, не сетевой хост.
- `Dispatchers.IO` — строка Kotlin coroutines, не домен dispatchers.io.
- PairIP: `CHECK_LICENSE` / `PAYWALL_INTENT` — лицензия Google Play, не gate/оффер.
- DataStore `getRaceSignalsStore`, ключи: `classFlagId`, `buzz`, `sampleOffered`, `showSampleOffer`, `sequence`. Room `race_signals.db` (таблицы `nights`, `signals`, `club_flags`).
- `ACTION_SEND` + `createChooser` — шаринг текстового листа сигналов. `ACTION_VIEW` нет.
- Сборка: APKPure XAPK Betclic 1.0 vc1 (base + config.arm64_v8a + config.en). Папки Play Collector в git не было. Сплита asset в этом XAPK нет.
