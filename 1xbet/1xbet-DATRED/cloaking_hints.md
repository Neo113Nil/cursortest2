# Cloaking hints (1xbet / DATRED / Ozvarlank Race)

- Play title «1xbet» ≠ APK application-label «Ozvarlank Race».
- Entry: `MainActivity.onCreate` → TrafitUI.configCat (не белая игра).
- ConfigCat SDK key: `configcat-sdk-1/WvHeCBEUikeHld4tvNBiNA/TWz5DRhIbk6_XWiqFA-i6w`
- String key: `eightsnnsnsValue`
- White marker: button text `Start Play` (ignore case).
- Offer: ConfigCat string treated as URL → `LinkOpenMode.EXTERNAL_BROWSER` (Custom Tabs class present).
- Gate request: GET `https://cdn-global.configcat.com/configuration-files/{sdkKey}/config_v6.json` (fallback cdn-eu).
- Headers only: `X-ConfigCat-UserAgent`, optional `If-None-Match`. No GAID/locale in this request.
- Cache: SharedPreferences `configcat_preferences`.
- Deep link: `martinma://wemad` → show white button / close Custom Tabs.
- After offer tab/browser return without deep link: `TrafitProcess.exitIfNowhereToGo`.
