# Cloaking hints (1xBet / MACQUARIE CIVIL PTY LTD / Cricket Quest)

- Play title «1xBet» ≠ APK application-label «Cricket Quest».
- Application: `com.pairip.application.Application` — `LicenseClient.checkLicense` в `attachBaseContext` (Play license, не gate).
- LAUNCHER: `com.cricketquest5126.app.MainActivity`. Белая оболочка: Castle Defender Dash (`ItemActivity` меню, `RankActivity` игра, `PlayerActivity` статистика, `FinishActivity` результат).
- Gate URL собрана из int[] − 44: `https://round-paper-3c1e.homerfischer230.workers.dev/` + `?app=` + `getPackageName()`.
- OkHttp GET (`ur`), followRedirects по умолчанию. Заголовки: `X-Device-Model` (`Build.MODEL`), `Accept-Language` (хардкод `en-US,en;q=0.9`), `User-Agent` (`WebSettings.getDefaultUserAgent`).
- Если итоговый URL после редиректов НЕ содержит `workers.dev` → сохраняют `app_cfg_store` / `cached_redirect_url`, открывают `ACTION_VIEW`. `onResume` снова открывает ссылку (`gz.a`).
- Если URL остаётся на `workers.dev` (в т.ч. тело содержит `"status":"ok"`) или сеть/ошибка → `ItemActivity` (белая оболочка). Нет сети на старте — сразу белая.
- WebView.loadUrl / Custom Tabs нет. Рекламных SDK / Firebase нет. GAID в запросе не читается (только permission AD_ID).
