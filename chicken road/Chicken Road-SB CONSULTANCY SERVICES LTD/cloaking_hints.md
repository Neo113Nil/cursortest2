Play «Chicken Road» / application-label «Emberwatch». Package com.kartiop.locak.bahanab vc1.

Чеклист:
- Application: манифест android:name=com.pairip.application.Application (обёртка Play Integrity / PairIP). attachBaseContext вызывает LicenseClient.checkLicense, затем super → EmberApplication.
- EmberApplication.onCreate: стартует Koin (qvHpEybgrt / c00). Сети нет.
- Splash-Activity нет. Точка входа — MainActivity.onCreate: Jetpack Compose, экраны из extra «screen»: main / game / skins / howtoplay. Это локальные экраны осады Emberwatch, не URL.
- INTERNET в манифесте нет. HttpURLConnection / OkHttp / Volley / Retrofit / WebView / WebViewClient / Custom Tabs / ACTION_VIEW оффера в first-party и в dex нет.
- Remote Config / Firebase / рекламные SDK нет.
- SharedPreferences API нет. Локальный DataStore emberStore, файл files/datastore/emberwatch_archive.preferences_pb (сохранение осад).
- PairIP PAYWALL / showPaywallAndCloseApp — проверка лицензии Google Play (com.android.vending.CHECK_LICENSE), не оффер.
- config.ru в splits0.xml — языковой сплит AAB (language key=ru), не сетевой хост.
- Dispatchers.IO — kotlinx.coroutines, не домен.

Клоака = нет: развилки оффер/белая нет. Это локальная осада Emberwatch / EMBER TRAIL, в Play названная Chicken Road (ASO). После jadx доказано, что это ребрендинг карточки без фильтрации трафика.
