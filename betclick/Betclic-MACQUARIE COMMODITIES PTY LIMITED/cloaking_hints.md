# Cloaking hints — Betclic (MACQUARIE COMMODITIES PTY LIMITED)

- Play title: Betclic
- application-label (факт разбора / пайплайн): Dash Rush
- package: com.dashrush3219.app
- Папки Play Collector в git не было.
- Бинарь: APKCube APKS ~3 MB, arm64-v8a, version 1.0 build 1, fromGooglePlay=true. Скачивание APKS после кнопки Download anyway упирается в hold-to-verify / captcha.
- android.permission.INTERNET есть (APKCube: «Full network access»).
- com.google.android.gms.permission.AD_ID есть (APKCube: «Ad id»).
- pairip=true (модалка APKCube: Google PairIP license check), com.android.vending.CHECK_LICENSE.
- ACCESS_NETWORK_STATE, ACCESS_WIFI_STATE, DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION.
- WebView/Custom Tabs по карточке APKCube не показаны; jadx-исходников в git нет.
- Пайплайн перечислил first-party: MainActivity, ClimbActivity, FrameActivity, LoadActivity, SwipeActivity.
- Политика конфиденциальности: https://sites.google.com/view/dash-rush-/ (Dash Rush).
- Карточка Play: букмекерский текст и чужие скриншоты Betclic; жанр Casual; 5,000+ установок; обновлено 20 Oct 2026.
- domain_checks: com.dashrush3219.app (пакет как «домен», DNS не резолвится), dispatchers.io (4/92; часто строка Kotlin Dispatchers.IO, без jadx не доказано).
- Клоака = да: белая оболочка (имя в магазине ≠ имя в APK) + интернет + рекламный номер + PairIP.
