# Cloaking hints (1xbet / Олена Ющишина / Team Drift Win)

- Play title «1xbet» ≠ APK application-label «Team Drift Win».
- Application: `com.pairip.application.Application` — `LicenseClient.checkLicense` в `attachBaseContext` (Play license, не gate).
- LAUNCHER: `com.teamdriftwin1229.app.MainActivity`. Белая оболочка: OceanActivity меню, BossActivity игра, FinishActivity статистика, GateActivity экран результата (имя «Gate» — не сетевой gate).
- Gate URL собрана из int[] − 37: `https://cold-night-ad90.kovalcukviktoria820.workers.dev/` + `?app=` + `getPackageName()`.
- OkHttp GET (`ds` / `aw`), followRedirects по умолчанию. Заголовки: `X-Device-Model` (`Build.MODEL`), `Accept-Language` (хардкод `en-US,en;q=0.9`), `User-Agent` (`WebSettings.getDefaultUserAgent`).
- Если итоговый URL после редиректов НЕ содержит `workers.dev` → сохраняют `app_cfg_store` / `cached_redirect_url`, открывают `ACTION_VIEW`. Lifecycle ON_RESUME снова открывает ссылку (`je.a`).
- Если URL остаётся на `workers.dev` (в т.ч. тело содержит `"status":"ok"`) или сеть/ошибка → `OceanActivity` (белая оболочка). Нет сети на старте — сразу белая.
- WebView.loadUrl / Custom Tabs нет. Рекламных SDK / Firebase нет. GAID в запросе не читается (только permission AD_ID).
- domain_checks: `com.teamdriftwin1229.app` (пакет, DNS NXDOMAIN). Реальный gate: `cold-night-ad90.kovalcukviktoria820.workers.dev`.
