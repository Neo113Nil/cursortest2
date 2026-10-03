# Cloaking hints (Chicken Road 2 / Polar Ballroom Ltd / com.jorden.karto.vrenxalon 2.0)

- Play card title: Chicken Road 2. Internal product: FrescoApplication, Theme.FrescoMemoria, DataStore fresco_memoria.preferences_pb, API frescomemoria.space. strings.xml app_name in this 2.0 build is «Chicken Road 2».
- Entry: com.pairip.application.Application.attachBaseContext → LicenseClient.checkLicense (Google Play only) → FrescoApplication.onCreate (Hilt). LAUNCHER MainActivity (Compose).
- Gate POST https://frescomemoria.space/api/renaissance/frescoRestoration via Cronet.
- Body JSON keys: memory = advertisingId, puzzle = installReferrer, casual = androidId. Header User-Agent from WebSettings.getDefaultUserAgent. Content-Type application/json; charset=utf-8.
- Response Gson → RenaissanceData. Fork field workshopDeck: if equals «Celestial Codex» → vc1 Done (white app); else yc1 Tab(url=workshopDeck) opened with Custom Tabs (androidx.browser / ACTION_VIEW + android.support.customtabs.extra.SESSION). On error → wc1 Error, retry splash.
- Saved in DataStore key splash_restoration.
- config.ru = splits0.xml language split. lineheightstyle.alignment.top = Compose LineHeightStyle.Alignment.Top toString.
- No WebView widget / loadUrl. Custom Tabs = yes.
