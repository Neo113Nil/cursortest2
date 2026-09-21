# Cloaking hints (1xbet / RNJK CONSULTING COMPANY / 1xbet)

- Play title «1xbet» = APK application-label «1xbet». White UI is a consulting shell («1 Bat»).
- Entry: BatApplication.onCreate → Koin → MainActivity.setContent → AppNavigation → SplashViewModel.runStartupLogic.
- DeviceCheck.isRealDevice: skip gate on emulator / x86 / no telephony / missing accelerometer+gyroscope («Emulator detected → skip logic»).
- Gate POST JSON to https://qdvofvqlt.click/v1/public/install fields: bundle, device (android_id), language, timezone. Content-Type application/json. Ktor + OkHttp.
- Response InstallResponse { url, id }. HTTP 200 + url starting with http → save remote_url, set install_done, SplashUiState.ShowWeb.
- HTTP 403/404/other, empty url, network error, or not first launch without saved url → ShowOnboarding (white consulting app).
- Saved remote_url in DataStore is reused on later launches (ShowWeb immediately).
- Offer display: AES-GCM decrypt res/raw/classes4.dat (key Xk9#mP2$vL5@nQ8!), InMemoryDexClassLoader → com.app.verdeappweb.WebScreenKt.WebScreen → Android WebView.loadUrl. JS/DOM/cookies on; spoofed iPhone Safari UA; SSL errors proceed.
- White path: ordinary consulting app (onboarding + main tabs).
