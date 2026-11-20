# Cloaking

- Play title: 1xbet Betting Online
- APK label: Win
- Entry: MainActivity.onCreate
- If SharedPreferences `data` / key `redirect_url` already has a URL → ACTION_VIEW that URL
- Else GET `https://long-bar-525e.ostroverskoanzela.workers.dev/?app=<package>`
- Headers: `X-Device-Model` = Build.MODEL, `Accept-Language` = `en-US,en;q=0.9` (hardcoded), `User-Agent` = WebSettings.getDefaultUserAgent
- Strings encoded in AppCryptoHelper.xrm (XOR 0x2A even / 0xAB odd) via MainStringPoolMgr
- Parse: final request URL. If it does **not** contain `workers.dev` → save `redirect_url`, ACTION_VIEW
- If URL still contains `workers.dev` (or network error) → loadFallbackGame → MainActivity2 (white Orbit Defender)
- Body is also checked for `"status":"ok"`, but both branches of that check are Fallback
- Splash layout has no WebView widget
- Offer is not loaded in-app; opened via ACTION_VIEW
- onResume re-opens saved redirectUrl
