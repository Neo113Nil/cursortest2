# Cloaking hints — Betclic (SAPPHIRE BOX LTD)

- Play title: Betclic
- application-label внутри APK (локальный съём): Hoop Challenge
- package: com.hoop.tosser.gamme
- version: 1.0 (versionCode 2), APKS ~2 MB, arm64-v8a
- Папки Play Collector в git не было. APKPure `d.apkpure.net` — 404. APKCombo домен истёк. APKCube карточка есть (PairIP «Download anyway» + Hold to verify), бинарь скачать не удалось.
- Разрешения по скану APKCube: `AD_ID`, `INTERNET`, `ACCESS_NETWORK_STATE`, `ACCESS_WIFI_STATE`, `DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION`, `CHECK_LICENSE`.
- minSdk 26 (Requires Android 8.0+), target Android 16 (API 36).
- Локальный скан agent_src (first-party): `loadUrl` в `flow/offer/BubbleDune.java`, `BreezeBasket.java`, `FinchTulip.java`. Пакет `flow/offer` + классы `*Kt.java` (Kotlin).
- PairIP: модалка лицензии на APKCube + `CHECK_LICENSE`.
- domain_checks: config.ru.
- Клоака = да: белая оболочка (Play «Betclic» ≠ APK «Hoop Challenge») + INTERNET + loadUrl в оффер-потоке.
