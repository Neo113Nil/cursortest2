# Cloaking hints (1xbet / FAACE INTERNATIONAL LTD / Win Poker)

- Play title «1xbet» ≠ APK application-label «Win Poker».
- RN main component: `SpinAndShootGameNeww`.
- Entry: pairip Application.attachBaseContext (license check) → MainApplication.onCreate → MainActivity (React Native).
- First-party modules: AdvertisingIdModule (GAID, not used in the offer GET), AppInfoModule (package/version), CustomTabsPaymentModule.open(url) with hidden URL bar, CustomWebViewManager (PAYMENT_REQUEST), InstallReferrer stub (empty).
- JS bundle: Firebase Realtime Database `/appConfig` (myGame, title, webViewUrl, serverCheckUrl), GET `{serverCheckUrl}/api/get-offer-url` with query adid, title, baseUrl, os_version, user_device_model, packageName, build_id, real_ip; response success / offerUrl / blocked.
- IP lookup: api.ipify.org, api64.ipify.org, icanhazip.com, checkip.amazonaws.com.
- Firebase project: winpoker-ksyc5 (RTDB https://winpoker-ksyc5-default-rtdb.firebaseio.com).
- Offer display: RN WebView (spoofed Pixel 7 Chrome UA) / Custom Tabs (URL bar hidden) / InAppBrowser.
- White path: ordinary puzzle app remains on screen (`No offer → game` / `myGame = false → game`).
- TabsHost is_bot hit is false positive (isBottomNavigationMenuInvalidated).
- adid in the gate request is a locally generated UUID in AsyncStorage key `adId`, not the Google advertising id.
