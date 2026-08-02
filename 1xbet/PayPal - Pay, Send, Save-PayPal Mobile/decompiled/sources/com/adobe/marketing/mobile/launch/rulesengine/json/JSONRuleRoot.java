package com.adobe.marketing.mobile.launch.rulesengine.json;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONRuleRoot;", "", "", "p0", "Lorg/json/JSONArray;", "p1", "<init>", "(Ljava/lang/String;Lorg/json/JSONArray;)V", "Lcom/adobe/marketing/mobile/ExtensionApi;", "extensionApi", "", "Lcom/adobe/marketing/mobile/launch/rulesengine/LaunchRule;", "toLaunchRules", "(Lcom/adobe/marketing/mobile/ExtensionApi;)Ljava/util/List;", "jsonArray", "Lorg/json/JSONArray;", "getJsonArray", "()Lorg/json/JSONArray;", "version", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class JSONRuleRoot {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.adobe.marketing.mobile.launch.rulesengine.json.JSONRuleRoot.Companion INSTANCE = new com.adobe.marketing.mobile.launch.rulesengine.json.JSONRuleRoot.Companion(null);
    private final org.json.JSONArray jsonArray;
    private final java.lang.String version;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONRuleRoot$Companion;", "", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONRuleRoot;", "invoke", "(Lorg/json/JSONObject;)Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONRuleRoot;"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.adobe.marketing.mobile.launch.rulesengine.json.JSONRuleRoot invoke(org.json.JSONObject jsonObject) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
            java.lang.String optString = jsonObject.optString("version", "0");
            org.json.JSONArray optJSONArray = jsonObject.optJSONArray("rules");
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            if (optJSONArray == null) {
                com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.LOG_TAG, "JSONRuleRoot", "Failed to extract [launch_json.rules]", new java.lang.Object[0]);
                return null;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString, "");
            return new com.adobe.marketing.mobile.launch.rulesengine.json.JSONRuleRoot(optString, optJSONArray, defaultConstructorMarker);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private JSONRuleRoot(java.lang.String str, org.json.JSONArray jSONArray) {
        this.version = str;
        this.jsonArray = jSONArray;
    }

    public final org.json.JSONArray getJsonArray() {
        return this.jsonArray;
    }

    public final java.lang.String getVersion() {
        return this.version;
    }

    public final /* synthetic */ java.util.List toLaunchRules(final com.adobe.marketing.mobile.ExtensionApi extensionApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionApi, "");
        return com.adobe.marketing.mobile.internal.util.JSONExtensionsKt.map(this.jsonArray, new kotlin.jvm.functions.Function1<java.lang.Object, com.adobe.marketing.mobile.launch.rulesengine.LaunchRule>() { // from class: com.adobe.marketing.mobile.launch.rulesengine.json.JSONRuleRoot$toLaunchRules$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final com.adobe.marketing.mobile.launch.rulesengine.LaunchRule invoke(java.lang.Object obj) {
                com.adobe.marketing.mobile.launch.rulesengine.LaunchRule launchRule$core_phoneRelease;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
                com.adobe.marketing.mobile.launch.rulesengine.json.JSONRule invoke = com.adobe.marketing.mobile.launch.rulesengine.json.JSONRule.Companion.invoke(obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null);
                if (invoke == null || (launchRule$core_phoneRelease = invoke.toLaunchRule$core_phoneRelease(com.adobe.marketing.mobile.ExtensionApi.this)) == null) {
                    throw new java.lang.Exception();
                }
                return launchRule$core_phoneRelease;
            }

            {
                super(1);
            }
        });
    }

    public /* synthetic */ JSONRuleRoot(java.lang.String str, org.json.JSONArray jSONArray, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, jSONArray);
    }
}
