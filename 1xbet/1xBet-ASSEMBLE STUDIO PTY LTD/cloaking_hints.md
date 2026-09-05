# Cloaking hints (1xBet / ASSEMBLE STUDIO PTY LTD / Carunda)

- Play title «1xBet» ≠ APK application-label «Carunda».
- Launcher: MainActivity (не игровое меню). Application = pairip LicenseClient.checkLicense в attachBaseContext.
- Два WebView: primaryCanvas (проверка) и secondaryCanvas (оффер / локальная страница).
- Сеть: qr — ConnectivityManager.getActiveNetworkInfo().isConnected().
- Онлайн: k9.g() → primaryCanvas.loadUrl(pv.a.a()) = https://richapp70.online/GqRd3kZx (строка собрана как char-5).
- Офлайн: k9.f() → secondaryCanvas.loadUrl(file:///android_asset/index.html) + кнопка «Play Game» → MainActivity1.
- hu (WebViewClient.onPageFinished):
  - URL содержит GqRd3kZx → lc.b() (показать primaryCanvas, скрыть прогресс и кнопку).
  - иначе и prefs пустые → срезать https:// или http://, сохранить в SharedPreferences jasdfqijsadfqw / nfllkansjenfas, открыть во втором WebView, скрыть primaryCanvas.
- onResume gw.a(): если сохранённый адрес не содержит GqRd3kZx — снова loadUrl во втором WebView.
- Нет OkHttp/HttpURLConnection, нет Custom Tabs, нет AdvertisingId, нет Firebase/рекламных SDK.
- Белая игра: Ocean Drift (MainActivity1–4), SQLite ocean_drift.db — не часть запроса проверки.
