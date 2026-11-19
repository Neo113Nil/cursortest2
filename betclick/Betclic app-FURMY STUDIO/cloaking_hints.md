# Cloaking hints (Betclic app / FURMY STUDIO / Racxitoon Drop)

- Play title «Betclic app» ≠ APK application-label «Racxitoon Drop».
- Application в манифесте: com.pairip.application.Application (Play Integrity / CHECK_LICENSE).
- Лаунчер: GateActivity (MAIN/LAUNCHER). MainActivity exported=false — белая оболочка.
- Сразу в onCreate: TavrixHub.open (Wagle). sdkKey `7VgMgKm3lOU4DSmCul3gnpatkxNPpRZT-JFnXJxiakI`, project `01a1794a-8ed2-7205-ad90-d43ed175e916`, environment `production`, stringKey `fagghsrf`, buttonText `Ready`, OneSignal `13db9420-ea5e-42a0-bd83-606603901775`, LinkOpenMode.CHROME_TAB, openInChromeTab=true (дефолт HubOptions).
- RemoteFlagClient: POST `https://api.wagle.sh/api.sdk.v1.SdkTokenService/RefreshSdkToken` (тело refreshToken), затем POST `https://api.wagle.sh/api.eval.v1.EvaluationService/Evaluate` (project, environment, flagKey, context.entityId, context.attributes={}).
- entity_id в SharedPreferences `tavrix_remote_flag` (значение `android-` + UUID). Язык/GAID/страна в запрос не кладут (attributes пустой объект).
- Ответ: поле value. Равно «Ready» (без учёта регистра) → белая кнопка → MainActivity. Иначе HTTP(S) URL → OneSignal permission → TabOpener Custom Tabs.
- WebView в first-party / Wagle для оффера нет (есть OSWebView у OneSignal). Deep link racxitoondrop://open (DeepLinkHost).
- hits is_bot в Align.java / TiledDrawable.java / ScrollPane.java — LibGDX isBottom/bottom, не фильтр ботов.
