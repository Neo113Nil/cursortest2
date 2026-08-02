package com.adobe.marketing.mobile.launch.rulesengine.json;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONCondition;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/rulesengine/Evaluable;", "toEvaluable", "()Lcom/adobe/marketing/mobile/rulesengine/Evaluable;", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class JSONCondition {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.adobe.marketing.mobile.launch.rulesengine.json.JSONCondition.Companion INSTANCE = new com.adobe.marketing.mobile.launch.rulesengine.json.JSONCondition.Companion(null);

    public abstract /* synthetic */ com.adobe.marketing.mobile.rulesengine.Evaluable toEvaluable();

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONCondition$Companion;", "", "<init>", "()V", "Lorg/json/JSONObject;", "jsonCondition", "Lcom/adobe/marketing/mobile/ExtensionApi;", "extensionApi", "Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONCondition;", "build$core_phoneRelease", "(Lorg/json/JSONObject;Lcom/adobe/marketing/mobile/ExtensionApi;)Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONCondition;"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final /* synthetic */ com.adobe.marketing.mobile.launch.rulesengine.json.JSONCondition build$core_phoneRelease(org.json.JSONObject jsonCondition, com.adobe.marketing.mobile.ExtensionApi extensionApi) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionApi, "");
            if (jsonCondition == null) {
                return null;
            }
            try {
                java.lang.String string = jsonCondition.getString("type");
                if (string != null) {
                    int hashCode = string.hashCode();
                    if (hashCode != 98629247) {
                        if (hashCode != 840862002) {
                            if (hashCode == 1950555338 && string.equals("historical")) {
                                com.adobe.marketing.mobile.launch.rulesengine.json.JSONDefinition.Companion companion = com.adobe.marketing.mobile.launch.rulesengine.json.JSONDefinition.INSTANCE;
                                org.json.JSONObject jSONObject = jsonCondition.getJSONObject("definition");
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "");
                                return new com.adobe.marketing.mobile.launch.rulesengine.json.HistoricalCondition(companion.buildDefinitionFromJSON$core_phoneRelease(jSONObject, extensionApi), extensionApi);
                            }
                        } else if (string.equals("matcher")) {
                            com.adobe.marketing.mobile.launch.rulesengine.json.JSONDefinition.Companion companion2 = com.adobe.marketing.mobile.launch.rulesengine.json.JSONDefinition.INSTANCE;
                            org.json.JSONObject jSONObject2 = jsonCondition.getJSONObject("definition");
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
                            return new com.adobe.marketing.mobile.launch.rulesengine.json.MatcherCondition(companion2.buildDefinitionFromJSON$core_phoneRelease(jSONObject2, extensionApi));
                        }
                    } else if (string.equals("group")) {
                        com.adobe.marketing.mobile.launch.rulesengine.json.JSONDefinition.Companion companion3 = com.adobe.marketing.mobile.launch.rulesengine.json.JSONDefinition.INSTANCE;
                        org.json.JSONObject jSONObject3 = jsonCondition.getJSONObject("definition");
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject3, "");
                        return new com.adobe.marketing.mobile.launch.rulesengine.json.GroupCondition(companion3.buildDefinitionFromJSON$core_phoneRelease(jSONObject3, extensionApi));
                    }
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported condition type - ");
                sb.append(string);
                com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.LOG_TAG, "JSONCondition", sb.toString(), new java.lang.Object[0]);
                return null;
            } catch (java.lang.Exception e) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to parse [rule.condition] JSON, the error is: ");
                sb2.append(e.getMessage());
                com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.LOG_TAG, "JSONCondition", sb2.toString(), new java.lang.Object[0]);
                return null;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
