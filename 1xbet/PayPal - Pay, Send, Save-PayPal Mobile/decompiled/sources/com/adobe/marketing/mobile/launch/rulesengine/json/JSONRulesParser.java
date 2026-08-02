package com.adobe.marketing.mobile.launch.rulesengine.json;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONRulesParser;", "", "<init>", "()V", "", "jsonString", "Lcom/adobe/marketing/mobile/ExtensionApi;", "extensionApi", "", "Lcom/adobe/marketing/mobile/launch/rulesengine/LaunchRule;", "parse", "(Ljava/lang/String;Lcom/adobe/marketing/mobile/ExtensionApi;)Ljava/util/List;"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class JSONRulesParser {
    public static final int $stable = 0;
    public static final com.adobe.marketing.mobile.launch.rulesengine.json.JSONRulesParser INSTANCE = new com.adobe.marketing.mobile.launch.rulesengine.json.JSONRulesParser();

    private JSONRulesParser() {
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> parse(java.lang.String jsonString, com.adobe.marketing.mobile.ExtensionApi extensionApi) {
        com.adobe.marketing.mobile.launch.rulesengine.json.JSONRuleRoot invoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionApi, "");
        try {
            java.lang.Object nextValue = new org.json.JSONTokener(jsonString).nextValue();
            if (!(nextValue instanceof org.json.JSONObject) || (invoke = com.adobe.marketing.mobile.launch.rulesengine.json.JSONRuleRoot.INSTANCE.invoke((org.json.JSONObject) nextValue)) == null) {
                return null;
            }
            return invoke.toLaunchRules(extensionApi);
        } catch (java.lang.Exception unused) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.LOG_TAG, "JSONRulesParser", "Failed to parse launch rules JSON: \n ".concat(java.lang.String.valueOf(jsonString)), new java.lang.Object[0]);
        }
        return null;
    }
}
