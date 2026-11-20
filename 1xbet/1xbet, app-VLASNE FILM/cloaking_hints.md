# Cloaking hints (1xbet, app / VLASNE FILM / Ultra Fanatics)

- Play title «1xbet, app» ≠ APK application-label «Ultra Fanatics».
- Entry: pairip Application.attachBaseContext (Play license check) → GameApp.onCreate (AppsFlyer + AdMob) → SplashActivity (LAUNCHER).
- Gate.kt decrypts assets/ds.bin (AES-GCM) and loads class DataSyncProvider via InMemoryDexClassLoader.
- SplashActivity._boot: POST https://steadywindowbridge.site/tk8w (URL XOR + AES-GCM).
- Request headers: User-Agent (stripped `; wv` and `Version/x.x`), user (UUID in SharedPreferences `prefs`), X-Referer (Play Install Referrer), campaignKey (AppsFlyer campaign), deviceIdKey (AppsFlyer UID), advertisingIdKey (GAID). Empty POST body. 3 retries.
- Response: `shouldOpenWhite` if empty / none / null / white / false / 0 / [] / {} / `"white_page"` / `"whitepage"` / `:"white"` → MainActivity.
- Else `aes256gcm:` payload decrypted to URL; if http(s) and not white → gift screen then ACTION_VIEW with `user` and `ua` query.
- DataSyncProvider: WebView + WebViewClient.shouldOverrideUrlLoading + loadUrl; hidden on splash. Offer shown via external browser, not Custom Tabs.
- White path: MainActivity (ordinary puzzle app). Fail / empty endpoint / DEX load fail → same.
