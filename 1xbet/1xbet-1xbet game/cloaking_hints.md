# Cloaking hints (1xbet / 1xbet game / 1 xbet)

- Play title «1xbet» ≠ APK application-label «1 xbet».
- Flutter package `two2_bet` (XbetApp). Entry: pairip Application.attachBaseContext (Play license) → MainActivity (FlutterActivity) → SplashLoadingPage.
- Local scan hits `c1/h.java` / `c1/i.java` loadUrl + shouldOverrideUrlLoading are url_launcher WebViewClient (io.flutter.plugins.urllauncher.WebViewActivity), not a separate first-party cloak class.
- Gate: Firebase Remote Config fetchAndActivate. Project xbet-ec209 / 907115118082.
- Fetch: POST https://firebaseremoteconfig.googleapis.com/v1/projects/907115118082/namespaces/firebase:fetch
- Body fields: appInstanceId, appInstanceIdToken, appId, countryCode, languageCode, platformVersion, timeZone, appVersion, appBuild, packageName, sdkVersion, analyticsUserProperties; optional customSignals / firstOpenTime.
- Headers: If-None-Match, X-Goog-Api-Key, X-Android-Package, X-Android-Cert, X-Google-GFE-Can-Retry, X-Goog-Firebase-Installations-Auth, Content-Type, Accept.
- Dart keys: s and f (error «Remote Config keys s/f are both empty»). Defaults JSON: `{"banner":false,"bannerLink":""}` and `{"articles":[],"terms":{...},"privacy":{...}}`.
- Mapper: `_parseBanner` / HomeBannerConfig / bannerVisible / `_openBannerLink`.
- Offer open: url_launcher (launchUrl / openUrlInApp) → Custom Tabs and/or in-app WebViewActivity.
- White path: ordinary Flutter shell remains when banner is false / bannerLink empty.
- Prefs: FlutterSharedPreferences (app_locale_v1, user_profile_v1, bet_entries_v1); frc_*_firebase_settings; com.google.android.gms.appid.
- systemuioverlay.top / config.ru from naive domain extractors are false positives (SystemUiOverlay.top, Remote Config).
