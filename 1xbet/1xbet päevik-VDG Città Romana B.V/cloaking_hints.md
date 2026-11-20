# Cloaking hints — 1xbet päevik (WinZone Journal)

- Play title «1xbet päevik» ≠ application-label «WinZone Journal».
- LAUNCHER = `FactoryMainActivity` (Grill factory SDK), not Flutter `MainActivity`.
- Embedded Base64 config (`a3.d`): GET `https://merovaxil.bid/hkY6qq1F?sub_id_5=201`, `responseMode=http_status`, `expectedStatus=302`, `httpUrlSource=request`, `fallbackUrl=null`, `queryParams=[]`.
- Gate: `f2.h.b()` HttpURLConnection GET, header `User-Agent` (WebView UA without `; wv`), `Accept: application/json`, no redirect follow.
- Match (HTTP 302) → AppsFlyer init (`devKey=CdQrhDp7JHZzFjQNnjnuCG`) + `WebView.loadUrl` of request URL.
- No match → `startActivity(MainActivity)` Flutter white app.
- `b3/s0,d1,l0,e1` = Flutter `webview_flutter_android` plugin, not the gate.
- Pipeline hosts `config.ru` / `dispatchers.io` / `systemuioverlay.top`: language split in `splits0.xml`, Kotlin/Flutter tokens — not gate hosts.
