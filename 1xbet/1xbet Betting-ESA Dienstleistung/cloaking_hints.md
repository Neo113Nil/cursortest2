# Cloaking

- Play title: 1xbet Betting
- APK label: Win
- Entry: MainActivity.onCreate
- If SharedPreferences `local` / key `dest` already has a URL → ACTION_VIEW that URL
- Else GET `https://long-bar-525e.ostroverskoanzela.workers.dev/?app=<package>`
- Headers: `X-Device-Model` = Build.MODEL, `Accept-Language` = `en-US,en;q=0.9` (hardcoded), `User-Agent` = WebSettings.getDefaultUserAgent
- Strings XOR-decoded in MainDecoderService.bin (key stream 43682*(i+1) & 255) via CoreTextStoreHandler
- Parse: final request URL. If it does **not** contain `workers.dev` → save `dest`, ACTION_VIEW
- If URL still contains `workers.dev` (or network error) → loadFallbackGame → MainActivity2
- Body is also checked for `"status":"ok"`, but both branches of that check are Fallback
- Splash layout has no WebView widget
- Offer is not loaded in-app; opened via ACTION_VIEW
- onResume re-opens saved redirectUrl
