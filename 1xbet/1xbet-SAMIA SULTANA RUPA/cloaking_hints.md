# Cloaking

- Play title: 1xbet
- APK label: Win
- Entry: com.pairip.application.Application.attachBaseContext (Play CHECK_LICENSE), then MainActivity.onCreate
- If SharedPreferences `store` / key `dst` already has a URL → ACTION_VIEW that URL
- Else GET `https://aged-pine-bec1.mitads7519.workers.dev/?app=com.slope.great.reel.vortex.donor.c1xbet`
- Headers: `X-Device-Model` = Build.MODEL, `Accept-Language` = `en-US,en;q=0.9` (hardcoded), `User-Agent` = WebSettings.getDefaultUserAgent
- Strings encoded in l6.p.d (index even XOR 57, odd XOR 34)
- Parse: final request URL after OkHttp redirects. If it does **not** contain `workers.dev` → save `dst`, ACTION_VIEW
- If URL still contains `workers.dev` (or network error) → loadFallbackGame → MainActivity2 (white «Карта развития»)
- Body is also checked for `"status":"ok"`, but both branches of that check are Fallback
- No WebView / Custom Tabs / loadUrl in first-party code
- Offer is not loaded in-app; opened via ACTION_VIEW
- onResume re-opens saved redirectUrl
