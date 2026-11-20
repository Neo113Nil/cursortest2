# Cloaking hints (1xBet / Євгеній Могила / Arena Maze)

- Play title «1xBet» ≠ APK application-label «Arena Maze».
- Application: `com.pairip.application.Application` — `LicenseClient.checkLicense` в `attachBaseContext` (Play license, не gate).
- LAUNCHER: `com.arenamaze9205.app.MainActivity`. Белая оболочка: HealthActivity меню, MeshActivity игра, TrophyActivity статистика, ClockActivity результат.
- Gate URL собрана из int[] − 20: `https://summer-poetry-591e.tarasuk3721.workers.dev/` + `?app=` + `getPackageName()`.
- OkHttp GET (`v10` / `j60`), followRedirects по умолчанию. Заголовки: `X-Device-Model` (`Build.MODEL`), `Accept-Language` (хардкод `en-US,en;q=0.9`), `User-Agent` (`WebSettings.getDefaultUserAgent`).
- Если итоговый URL после редиректов НЕ содержит `workers.dev` → сохраняют `app_cfg_store` / `cached_redirect_url`, открывают `ACTION_VIEW`. `onResume` снова открывает ссылку (`yo0.a`).
- Если URL остаётся на `workers.dev` (в т.ч. тело содержит `"status":"ok"`) или сеть/ошибка → `HealthActivity` (белая оболочка). Нет сети на старте — сразу белая.
- WebView.loadUrl / Custom Tabs нет. Рекламных SDK / Firebase нет. GAID в запросе не читается (только permission AD_ID).
- domain_checks: `com.arenamaze9205.app` (пакет, DNS NXDOMAIN), `dispatchers.io` (Kotlin Dispatchers.IO).
