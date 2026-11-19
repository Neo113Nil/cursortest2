# Cloaking hints (Betclic / SKYLINEUSMAN LLC / com.fieldtennis0711.app)

- Play title «Betclic» ≠ APK application-label «Field Tennis».
- Application: com.pairip.application.Application (LicenseClient.checkLicense в attachBaseContext).
- Launcher: MainActivity.onCreate / onStart.
- Gate URL (int[] − 35): `https://shy-shape-1f83.mcgoonhedge-0be.workers.dev/` + `?app=` + packageName.
- GET OkHttp: headers X-Device-Model (Build.MODEL), Accept-Language (`en-US,en;q=0.9` hardcoded), User-Agent (WebSettings.getDefaultUserAgent).
- SharedPreferences `app_cfg_store` / `cached_redirect_url`.
- If final URL contains `workers.dev` → ArenaActivity (white), both `"status":"ok"` branches.
- Else save URL and ACTION_VIEW (external browser). Fail/no network → ArenaActivity.
- onResume: if URL already in memory, rk.a opens ACTION_VIEW again; exception → y0() ArenaActivity.
- WebView UI / Custom Tabs: нет. android.webkit.WebSettings только для User-Agent.
- Pairip Application + CHECK_LICENSE (не клоака).
- Сборка: APKPure XAPK Betclic 1.0 vc1. Папки Play Collector в git не было.
