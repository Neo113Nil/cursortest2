# Cloaking hints (1xbet / SENOJTEK / Victory Revolution)

- Play title «1xbet» ≠ APK application-label «Victory Revolution».
- Entry: pairip Application.attachBaseContext (Play license check) → VictoryApp.onCreate → SplashActivity (LAUNCHER).
- Gate.kt decrypts assets/ds.bin (AES-GCM) and loads class DataSyncProvider via InMemoryDexClassLoader.
- SplashActivity._boot: POST https://plainvectorlab.site/api/v1/78d8 (URL XOR+AES-GCM).
- Request headers: User-Agent (stripped `; wv` and `Version/x.x`), user (UUID in SharedPreferences `prefs`), X-Referer (Play Install Referrer, saved as `referrer`). Empty POST body. 3 retries.
- Response: `shouldOpenWhite` if empty / none / null / white / false / 0 / [] / {} / `"white_page"` / `"whitepage"` / `:"white"` → MainActivity.
- Else `aes256gcm:` payload decrypted to URL; if http(s) and not white → ACTION_VIEW with `user` and `ua` query, then finish().
- DataSyncProvider: WebView + WebViewClient.shouldOverrideUrlLoading + loadUrl; hidden on splash. Offer shown via external browser, not Custom Tabs.
- White path: MainActivity (ordinary puzzle app). Fail / empty endpoint / DEX load fail → same.
