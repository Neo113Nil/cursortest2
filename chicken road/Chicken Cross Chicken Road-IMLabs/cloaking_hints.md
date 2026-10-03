# Cloaking hints — Chicken Cross Chicken Road (IMLabs)

- Play / карточка: «Chicken Cross Chicken Road» (на странице Play: «Chicken Cross: Chicken Road»). application-label в APK: «Chicken Cross Road: Dodge Cars». Это одна и та же игра про курицу на дороге, не белая оболочка под другим жанром.
- package `com.chickencross.seahop`, versionName 1.0.1.1, versionCode 2.
- First-party Java: только `com.chickencross.seahop.R.java`. Логика игры — Unity IL2CPP (`libil2cpp.so` / `libgame.so` + global-metadata.dat), сборки `Assembly-CSharp.dll`, PostHog, Yodo1 MAS Unity bridge.
- Application: `com.pairip.application.Application` — в `attachBaseContext` только `LicenseClient.checkLicense` (проверка лицензии Google Play). Не gate оффер/белая.
- LAUNCHER: `com.unity3d.player.UnityPlayerGameActivity` — onCreate вызывает super, onCreateSurfaceView создаёт UnityPlayer и показывает игру. Нет Splash/MainActivity с HTTP-проверкой.
- Хит `p/haeg/w/s.java` · shouldOverrideUrlLoading — это не first-party клоака. Пакет `p.haeg.w` — обфусцированный AppHarbr (в коде AdSdk.GAM, AdFormat.NATIVE). Класс `s` оборачивает чужой WebViewClient рекламы, сообщает URL в `cy` и делегирует shouldOverrideUrlLoading дальше. Сам URL не грузит и развилку оффер/игра не делает. Yodo1 MAS подключает AppHarbr как ad quality (`Yodo1MasAdQualityHelperImpl`).
- WebView / loadUrl / Custom Tabs: рекламные SDK (Bigo landing WebViewActivityImpl + Chrome Custom Tabs `sg.bigo.ads.al.c`, AppLovin WebViewActivity, Pangle landing, Fyber, Moloco MRAID, BidMachine MRAID, ironSource OpenUrlActivity, Unity Ads FullScreenWebViewDisplay). Не first-party оффер после серверной проверки.
- First-party HTTP: нет. Сеть Yodo1 MAS (`https://sdk-mas.yodo1.com` init/config/ip_info) — конфиг медиации, не URL оффера.
- Remote config: `Yodo1MasAdQualityRemoteConfigHelper` сохраняет JSON качества рекламы в prefs `Yodo1Mas`. Не решает «оффер или обычное приложение».
- Custom Tabs: androidx.browser 1.8.0 + queries в манифесте; открытие — Bigo Ads Chrome Tabs для клика по объявлению.
- Домены OSS / adsbigo.com / akm.ssacdn.com — запасные CDN и хосты Bigo Ads, не gate.
- Cloaking = нет: обычная Unity-игра + Yodo1 MAS / рекламные сети. Нет тихого gate, нет серверного URL во встроенное окно «вместо игры».
