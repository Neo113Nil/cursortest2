# Cloaking hints (1xbet, app / BREAD APP / Nova Sport Rivals)

- Play title «1xbet, app» ≠ APK application-label «Nova Sport Rivals».
- Entry: pairip Application.attachBaseContext (Play license check) → App.onCreate (AppsFlyer + Firebase topic) → MainActivity (LAUNCHER, TWA LauncherActivity).
- shouldLaunchImmediately() = false. If prefs twa_shell.game_reached — launch TWA to launchUrl.
- Else background thread collects GAID, Play Install Referrer, AppsFlyer campaign; GET https://branchatlasgrid.site/api.
- Query + headers: user, deviceIdKey, advertisingIdKey, campaignKey, User-Agent, X-Referer, Accept.
- Response JSON field url: if http(s) → openOffer (Custom Tabs, fallback ACTION_VIEW) and finish; else game_reached + launchTwa (WebView fallback).
