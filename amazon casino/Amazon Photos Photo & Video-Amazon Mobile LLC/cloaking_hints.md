# Cloaking hints (Amazon Photos)

- Play title «Amazon Photos Photo & Video» vs application-label «Amazon Photos»: same product, Play subtitle, not a white shell.
- `com.amazon.whispercloak.*`: WhisperJoin device-pairing crypto (AES-GCM, ECDH, JPAKE, BouncyCastle). No URL, HTTP, WebView, or offer/white fork.
- `FetchOffersRequest/Response` (CDRS): storage subscription offers, field `vendorId` / list `offers`. IAP via Google Play Billing, not a casino landing.
- Application `PhotosApplication.onCreate`: Koin DI, Minerva metrics prefs, Branch key `634347780306353`, MoEngage, WorkManager. No silent gate HTTP.
- Launcher: `LauncherActivity` MAIN/LAUNCHER → Home after MAP sign-in / onboarding. State.Blocked string: minimum age 13.
- WebView: HelpPageWebViewModel / ViewStorageWebViewModel / ReportAbuseWebViewFragment / VideoPlaybackWebViewFragment / MAPAndroidWebViewClient / RN RNCWebView. URLs from EndpointDataProvider (Amazon marketplace) or user/content, not a remote offer URL.
- Custom Tabs: MAP federated login (`chromeCustomTabLaunch`) + hardcoded `https://www.amazon-customtabtest.com` in identity URL list.
- Weblab `NetworkDelegate`: downloads Amazon experiment allocation files, not traffic cloaking.
- Firebase Remote Config: RN feature-team flags / metric denylist, not offer vs white app.
- is_bot hits: `isBottomSheetShown` / `isBottomSheetVisible` only.
- casino hits: Compose Material icons `CasinoKt` + OkHttp public suffix list.
