# Cloaking hints — Chicken Road 2 (WGKIMS LTD)

Play-карточка: «Chicken Road 2». application-label в APK: «Florentia Codex». package: `com.kartiop.locak.spachfykas`.

Локальный скан `agent_src` (не SDK) дал хиты `cloak` в:

- `defpackage/b60.java` — строка игрового предмета: «Shadow cloak on. Guards cannot catch you for a while.» и спавн `rc0.CLOAK` на поле.
- `defpackage/d50.java` — отрисовка иконки предмета `rc0.CLOAK` на холсте Compose.
- `defpackage/a5.java` — подпись HUD «Cloak» (счётчик ходов плаща).

Это не gate/оффер/WebView. В enum `rc0`: PAGE, FLORIN, LANTERN, CLOAK («Shadow cloak»), HOURGLASS — предметы локальной игры.

Сеть: `android.permission.INTERNET` нет. OkHttp / HttpURLConnection / Volley / Retrofit / WebView / Custom Tabs / ACTION_VIEW / Firebase Remote Config в dex нет. Точка входа: `FlorentiaApp` (Kodein DI) + `MainActivity.onCreate` (Jetpack Compose, extra `screen`).

Вывод: белая оболочка на витрине (другое название в Play), внутри APK обычная офлайн-игра без развилки трафика. «Есть ли клоака» = нет.
