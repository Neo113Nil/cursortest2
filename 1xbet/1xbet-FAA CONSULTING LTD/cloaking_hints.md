# Cloaking hints (1xbet / FAA CONSULTING LTD / Win Aqua)

- Play title «1xbet» ≠ APK application-label «Win Aqua».
- RN main component: `SpinAndShootGameNeww`.
- Entry: MainApplication.onCreate → MainActivity (React Native).
- First-party modules: AdvertisingIdModule (GAID), AppInfoModule (package/version), CustomTabsPaymentModule.open(url) with URL bar hidden, CustomWebViewManager (PAYMENT_REQUEST), InstallReferrer stub (empty).
- JS bundle (Hermes): Firebase Realtime Database path `/appConfig`, fields serverCheckUrl / serverUrl / offerUrl / showWebViewFlag / myGame; gate HTTP `/api/get-offer-url`; IP lookup (api.ipify.org, api64.ipify.org, icanhazip.com, checkip.amazonaws.com); spoofed Pixel 7 Chrome UA; logs «No internet → game», «No offer → game», «No serverCheckUrl → game», «Server error → game», «myGame = false → game».
- Firebase project: winaqua-vssq7 (google_app_id 1:416076113263:android:e63d7c79e8b046804f349a).
- Offer display: RN WebView (`WebViewScreen` / RCTCustomWebView) / Custom Tabs (CustomTabsPaymentModule) / InAppBrowser.
- White path: ordinary puzzle app remains on screen.
- TabsHost is_bot hit is false positive (isBottomNavigationMenuInvalidated).
