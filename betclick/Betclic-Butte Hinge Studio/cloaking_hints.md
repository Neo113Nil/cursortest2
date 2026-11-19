# Cloaking hints (Betclic / Butte Hinge Studio / com.leaguechartbet4479.app)

- Play title «Betclic» ≠ APK application-label «League Chart Bet».
- Application: com.pairip.application.Application (LicenseClient.checkLicense в attachBaseContext).
- Launcher: MainActivity.onCreate / onStart.
- Gate URL (int[] − 23): `https://gentle-salad-3999.woodcrestsu.workers.dev/` + `?app=` + packageName.
- GET OkHttp: headers X-Device-Model (Build.MODEL), Accept-Language (`en-US,en;q=0.9` hardcoded), User-Agent (WebSettings.getDefaultUserAgent).
- SharedPreferences `app_cfg_store` / `cached_redirect_url`.
- If final URL contains `workers.dev` → CardActivity (white), both `"status":"ok"` branches.
- Else save URL and ACTION_VIEW (external browser). Fail/no network → CardActivity.
- onResume: if URL already in memory, nq.a opens ACTION_VIEW again.
- WebView UI / Custom Tabs: нет. android.webkit.WebSettings только для User-Agent.
- Pairip Application + CHECK_LICENSE (не клоака).
