# Cloaking hints (1xbet / FAABS CONSULTS LIMITED / Win Slitherlink)

- Play title «1xbet» ≠ APK application-label «Win Slitherlink».
- RN main component: `SpinAndShootGameNeww`.
- Entry: pairip Application.attachBaseContext (license check) → MainApplication.onCreate → MainActivity (React Native).
- First-party modules: AdvertisingIdModule (GAID), AppInfoModule (package/version), CustomTabsPaymentModule.open(url), CustomWebViewManager (PAYMENT_REQUEST), InstallReferrer stub (empty).
- JS bundle: Firebase Realtime Database, offerUrl, showWebViewFlag, isCustomTabs, Whitelist, IP lookup (api.ipify.org, api64.ipify.org, icanhazip.com, checkip.amazonaws.com), spoofed Pixel 7 Chrome UA.
- Firebase project: winslither-hi243 (default RTDB winslither-hi243-default-rtdb.firebaseio.com).
- Offer display: RN WebView / Custom WebView / Custom Tabs (URL bar hidden) / InAppBrowser.
- White path: ordinary puzzle app remains on screen.
- TabsHost is_bot hit is false positive (isBottomNavigationMenuInvalidated).
