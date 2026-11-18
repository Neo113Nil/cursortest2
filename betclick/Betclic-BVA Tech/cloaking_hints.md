# Cloaking hints (Betclic / BVA Tech / Mahjong Set)

- Play title «Betclic» ≠ APK application-label «Mahjong Set» (`strings.xml` `app_name`). Белая оболочка по названию карточки.
- Application: `com.pairip.application.Application` → `attachBaseContext` вызывает `LicenseClient.checkLicense`, затем `MahjongSet`.
- `MahjongSet.onCreate`: Hilt/Dagger граф, без HTTP. Launcher `MainActivity.onCreate`: AppCompat + Navigation (Count / Identify / Tiles / Cases / Settings).
- INTERNET в манифесте нет (ни в base, ни в сплитах). WebView / Custom Tabs / `loadUrl` / `shouldOverrideUrlLoading` / OkHttp / HttpURLConnection / Volley / Retrofit / Firebase Remote Config в first-party и в DEX нет. `android.intent.action.VIEW` в DEX нет.
- `offer_title` / `offer_body` / `showOffer` / `sample_offer_dismissed` — локальное предложение загрузить пять демо-кейсов маджонга («Ruth's last three estate sales»), не URL оффера.
- `config.ru` в `splits0.xml` — языковой сплит `split="config.ru"`, не сетевой хост.
- PairIP: `CHECK_LICENSE` / `PAYWALL_INTENT` — лицензия Google Play, не gate/оффер.
- DataStore ключи: `open_case_id`, `sample_offer_dismissed`, `show_corner_indices`. Room `mahjong.db` (таблицы `cases`, `case_counts`).
- `ACTION_SEND` + `createChooser` — шаринг текстового листа кейса. `ACTION_VIEW` нет.
- Сборка: APKPure XAPK Betclic 1.0 vc1 (base + config.arm64_v8a + config.en + config.mdpi). Папки Play Collector в git не было.
