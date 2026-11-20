# Cloaking hints (1xbet / BHP (TOWAGE SERVICES) PTY LTD / Ninnadi)

- Play title «1xbet» ≠ APK application-label «Ninnadi».
- Application: `com.pairip.application.Application` — `LicenseClient.checkLicense` в `attachBaseContext` (Play license, не gate).
- LAUNCHER: `com.ninnadi.app.MainActivity`. Белая оболочка: Ninnadi / sunset balloon (`StackActivity` меню, `TowerActivity` игра, `SwordActivity` статистика, `ScoutActivity` результат).
- Gate URL собрана из int[] − 21: `https://gentle-violet-669d.entoyarul286.workers.dev/` + `?app=` + `getPackageName()`.
- OkHttp GET (`ir`), followRedirects по умолчанию. Заголовки: `X-Device-Model` (`Build.MODEL`), `Accept-Language` (хардкод `en-US,en;q=0.9`), `User-Agent` (`WebSettings.getDefaultUserAgent`). Query: `app` = имя пакета.
- Если итоговый URL после редиректов НЕ содержит `workers.dev` → сохраняют `app_cfg_store` / `cached_redirect_url`, открывают `ACTION_VIEW`. `onResume` снова открывает ссылку.
- Если URL остаётся на `workers.dev` и тело содержит `"status":"ok"` → `g50` → `StackActivity`. Иначе (URL на workers.dev без ok / ошибка сети / нет сети) → `StackActivity`.
- WebView.loadUrl / Custom Tabs нет. Рекламных SDK / Firebase нет. GAID в запросе не читается (только permission AD_ID).
