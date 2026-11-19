# Cloaking hints (Betclic / UNDERWIK LLC / com.luckyfield7064.app)

- Play title «Betclic» ≠ APK application-label «Lucky Field».
- Application: com.pairip.application.Application (LicenseClient.checkLicense в attachBaseContext).
- Launcher: MainActivity.onCreate / onStart.
- Gate URL (int[] − 10): `https://dark-feather-edb6.luedeckrepasky.workers.dev/` + `?app=` + packageName.
- GET OkHttp: headers X-Device-Model (Build.MODEL), Accept-Language (`en-US,en;q=0.9` hardcoded), User-Agent (WebSettings.getDefaultUserAgent).
- SharedPreferences `app_cfg_store` / `cached_redirect_url`.
- If final URL contains `workers.dev` → LoadActivity (white), both `"status":"ok"` branches.
- Else save URL and ACTION_VIEW (external browser). Fail/no network → LoadActivity.
- onResume: if URL already in memory, vj.a opens ACTION_VIEW again; exception → la0.a LoadActivity.
- WebView UI / Custom Tabs: нет. android.webkit.WebSettings только для User-Agent.
- Pairip Application + CHECK_LICENSE (не клоака).
