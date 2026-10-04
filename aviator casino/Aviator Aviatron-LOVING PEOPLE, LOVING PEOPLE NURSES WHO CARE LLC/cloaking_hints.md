# Cloaking hints — Aviator: Aviatron (com.aviatron.avrt1349)

Локальный скан `is_bot` / `offer` / CustomTabs разобран до конца. Клоака = нет.

## CustomTabs (expo-web-browser)
`CustomTabsActivitiesHelper` / `WebBrowserModule` — штатный Expo SDK. URL в Java не зашит: его передаёт JS (`openBrowserAsync` / Linking `openURL`). В Hermes-бандле ссылки — политика конфиденциальности / условия (Google Docs), Play Store и forms.gle. Это не gate и не оффер после проверки.

## is_bot
- `TabsHost.java` — ложное срабатывание на `isBottomNavigationMenuInvalidated` (нижнее меню вкладок react-native-screens).
- `ApphudExtensionsKt.java` — ложное срабатывание на `isBothLoaded` (оба набора данных Apphud загружены).
Фильтра бот/белый трафик нет.

## offer
`ProductInfo.offer` / `Offer.java` — оффер Google Play Billing / подписка Apphud (`limited time offer` в paywall JSON). Не URL оффера клоаки.

## Точка входа
`com.pairip.application.Application.attachBaseContext` → проверка лицензии Play, затем `MainApplication.onCreate` → React Native / Expo. `MainActivity` грузит компонент `main`. `expo.modules.updates.ENABLED=false`. First-party HTTP-gate нет.

Play: «Aviator: Aviatron». APK-label: «Aviatron». Это не белая оболочка с другой игрой.
