# Cloaking hints (1xbet official app / BHP (TOWAGE SERVICES) PTY LTD / Grersi)

- Play title «1xbet official app» ≠ APK application-label «Grersi» (снято локально до анализа).
- Package: `com.grersi.app`. Developer email: enutoyarul286@gmail.com. Privacy: https://sites.google.com/view/grersi
- Локальный скан agent_src: `com/grersi/app/MainActivity.java` · offer.
- First-party activities (по списку разбора): MainActivity, BlockActivity, CoinActivity, DiamondActivity, EchoActivity.
- Папки Play Collector / agent_src / agent_base.apk в git не было. APKPure `/p/com.grersi.app` — 404. APKCube origin — Cloudflare 522. Aptoide — пакета нет. Бинарь скачать не удалось, jadx по этой копии не запускался.
- Permissions (карточка / chrome-stats): INTERNET, ACCESS_NETWORK_STATE, ACCESS_WIFI_STATE, AD_ID, CHECK_LICENSE, DYNAMIC_RECEIVER_NOT_EXPORTED.
- WebView/Custom Tabs/gate URL/поля запроса по байтам этой копии не прочитаны. Клоака=да по белой оболочке (Play≠label) + offer в MainActivity + сеть.
