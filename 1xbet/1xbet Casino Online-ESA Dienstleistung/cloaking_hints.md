# Cloaking

- Play title: 1xbet Casino Online
- APK label: Win
- Entry: com.pairip.application.Application.attachBaseContext (Play CHECK_LICENSE), then MainActivity.onCreate
- If SharedPreferences `mem` / key `link` already has a URL → ACTION_VIEW that URL
- Else GET `https://long-bar-525e.ostroverskoanzela.workers.dev/?app=<package>`
- Headers: `X-Device-Model` = Build.MODEL, `Accept-Language` = `en-US,en;q=0.9` (hardcoded), `User-Agent` = WebSettings.getDefaultUserAgent
- Strings encoded in BaseCodecMgr.resolve (nibble-swap XOR 0x20)
- Parse: final request URL after OkHttp redirects. If it does **not** contain `workers.dev` → save `link`, ACTION_VIEW
- If URL still contains `workers.dev` (or network error) → loadFallbackGame → MainActivity2 (white «Карта развития»)
- Body is also checked for `"status":"ok"`, but both branches of that check are Fallback
- No WebView / Custom Tabs / loadUrl in first-party code
- Offer is not loaded in-app; opened via ACTION_VIEW
- onResume re-opens saved redirectUrl
