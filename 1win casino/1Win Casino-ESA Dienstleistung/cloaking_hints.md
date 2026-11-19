# Cloaking

- Play title: 1Win Casino
- APK label: Win
- Entry: MainActivity.onCreate → MainPrefsStoreService.init
- If SharedPreferences `cfg` / key `redirect_url` already has a URL → ACTION_VIEW that URL
- Else GET `https://long-bar-525e.ostroverskoanzela.workers.dev/?app=<package>`
- Headers: `X-Device-Model` = Build.MODEL, `Accept-Language` = `en-US,en;q=0.9` (hardcoded), `User-Agent` = WebSettings.getDefaultUserAgent
- Strings XOR (nibble-swap ^ 0x29) in XorUtil
- Parse: final request URL. If it does **not** contain `workers.dev` → save `redirect_url`, ACTION_VIEW
- If URL still contains `workers.dev` (or network error) → MainRecoveryMgrService → MainActivity2 (white NEON ARCADE)
- Body is also checked for `"status":"ok"`, but both branches of that check are Fallback
- Splash layout `activity_main.xml` has ProgressBar only; no WebView widget
- Offer is not loaded in-app; opened via ACTION_VIEW
- onResume re-opens saved redirectUrl
