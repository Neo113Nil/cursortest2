# Cloaking hints (Betclic / Grantania / XicXacXoe)

- Play title «Betclic» ≠ APK application-label «XicXacXoe» (strings.xml `app_name`). Белая оболочка по названию карточки.
- Application: стандартный, без `android:name`. Launcher: `com.grantania.xicxacxoe.MainActivity` — локальные крестики-нолики, без сети.
- `onCreate` только `setContentView(R.layout.activity_main)`. Нет `loadUrl`, `shouldOverrideUrlLoading`, WebView, Custom Tabs, ACTION_VIEW на URL.
- INTERNET в манифесте нет. OkHttp / HttpURLConnection / Volley / Retrofit / Firebase Remote Config в first-party нет.
- PairIP: `LicenseContentProvider.onCreate` → `LicenseClient` к `com.android.vending` (CHECK_LICENSE). Это лицензия Play, не gate/оффер.
- Кастомных доменов (в т.ч. clickpolicy.online) в dex/строках этой сборки 1.0 (vc1) нет.
- Сборка: APKCombo XAPK 1.0 vc1. На Play/APKCube видна более новая 1.0.1 vc2 (~8 MB APKS), скачать не удалось (captcha / нет gplaydl token).
