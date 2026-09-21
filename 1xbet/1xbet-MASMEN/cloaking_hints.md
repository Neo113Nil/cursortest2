# Cloaking hints (1xbet / MASMEN / Alpine Blizzard)

- Play title «1xbet» ≠ APK application-label «Alpine Blizzard».
- Launcher: `com.alpine.blizzardboard.ref.RefActivity` (MAIN/LAUNCHER). White: `GameActivity`.
- Pairip `Application` wraps `BlizzardApp` and runs Play license check in `attachBaseContext`.
- `CircuitBreakerGate` decrypts `assets/ds.bin` (AES-GCM) and loads `com.alpine.blizzardboard.ref.dsp.DataSyncProvider` in memory (WebView + WebViewClient).
- Gate URL AES-GCM in `RefActivity.ENDPOINT_ENCRYPTED` → `https://quickanchorsource.site/enjp`.
- Request: GET with `?user=` / `&user=` UUID from SharedPreferences `prefs`/`uuid`; header `User-Agent` = `WebSettings.getDefaultUserAgent`.
- Response body decrypted with the same key (`getLink`). Gray if starts with http and does not contain `none`/`null` → `isGray=true`.
- Offer: preloader «SPECIAL GIFT» / «FROST BONUS!» / «Limited Time Offer» / «TAP TO CLAIM», then `ACTION_VIEW` in the external browser.
- White: `_accept()` → `GameActivity`. Timeout 60s or HTTP/decrypt failure also white.
- Hidden DEX also has encrypted `getStartUrl` → `https://matrixnativenode.site/bsbo`; launch path does not call `getStartUrl()`.
