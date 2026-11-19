# Cloaking hints (Betclic / COOK SIGNATURE PROPERTIES LLC / com.snevu.app)

- Play title «Betclic» ≠ APK application-label «Snevu».
- Launcher: MainActivity.onCreate.
- Gate URL (int[] − 31): `https://damp-voice-26da.lanmanzoda343.workers.dev/` + `?app=` + packageName.
- GET OkHttp: headers X-Device-Model (Build.MODEL), Accept-Language (`en-US,en;q=0.9` hardcoded), User-Agent (WebSettings.getDefaultUserAgent).
- SharedPreferences `app_cfg_store` / `cached_redirect_url`.
- If final URL contains `workers.dev` → WarriorActivity (white), both `"status":"ok"` branches.
- Else save URL and ACTION_VIEW (external browser). Fail/no network → WarriorActivity.
- WebView UI / Custom Tabs: нет. android.webkit.WebSettings только для User-Agent.
- Pairip Application + CHECK_LICENSE (не клоака).
