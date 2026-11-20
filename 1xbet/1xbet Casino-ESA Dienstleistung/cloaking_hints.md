# Cloaking

- Play title: 1xbet Casino
- APK label: Win
- Entry: MainActivity.onCreate
- If SharedPreferences `store` / key `redir` already has a URL → ACTION_VIEW that URL
- Else GET `https://long-bar-525e.ostroverskoanzela.workers.dev/?app=<package>`
- Headers: `X-Device-Model` = Build.MODEL, `Accept-Language` = `en-US,en;q=0.9` (hardcoded), `User-Agent` = WebSettings.getDefaultUserAgent
- Strings encoded in Ncoder.xrp (rotate-left-1 XOR 0xC3) via BaseTextPoolUtil
- Parse: final request URL. If it does **not** contain `workers.dev` → save `redir`, ACTION_VIEW
- If URL still contains `workers.dev` (or network error) → MainAltLoaderUtil → MainActivity2 (white Puzzle Forge)
- Body is also checked for `"status":"ok"`, but both branches of that check are Fallback
- Splash layout `activity_main.xml` has no WebView widget
- Offer is not loaded in-app; opened via ACTION_VIEW
- onResume re-opens saved redirectUrl
