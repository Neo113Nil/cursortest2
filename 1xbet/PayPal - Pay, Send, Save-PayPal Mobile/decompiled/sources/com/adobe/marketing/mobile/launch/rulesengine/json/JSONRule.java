package com.adobe.marketing.mobile.launch.rulesengine.json;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONRule;", "", "Lorg/json/JSONObject;", "p0", "Lorg/json/JSONArray;", "p1", "p2", "<init>", "(Lorg/json/JSONObject;Lorg/json/JSONArray;Lorg/json/JSONObject;)V", "Lcom/adobe/marketing/mobile/ExtensionApi;", "extensionApi", "Lcom/adobe/marketing/mobile/launch/rulesengine/LaunchRule;", "toLaunchRule$core_phoneRelease", "(Lcom/adobe/marketing/mobile/ExtensionApi;)Lcom/adobe/marketing/mobile/launch/rulesengine/LaunchRule;", "condition", "Lorg/json/JSONObject;", "getCondition", "()Lorg/json/JSONObject;", "consequences", "Lorg/json/JSONArray;", "getConsequences", "()Lorg/json/JSONArray;", com.adjust.sdk.Constants.REFERRER_API_META, "getMeta", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class JSONRule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.adobe.marketing.mobile.launch.rulesengine.json.JSONRule.Companion INSTANCE = new com.adobe.marketing.mobile.launch.rulesengine.json.JSONRule.Companion(null);
    private final org.json.JSONObject condition;
    private final org.json.JSONArray consequences;
    private final org.json.JSONObject meta;

    private JSONRule(org.json.JSONObject jSONObject, org.json.JSONArray jSONArray, org.json.JSONObject jSONObject2) {
        this.condition = jSONObject;
        this.consequences = jSONArray;
        this.meta = jSONObject2;
    }

    public final org.json.JSONObject getCondition() {
        return this.condition;
    }

    public final org.json.JSONArray getConsequences() {
        return this.consequences;
    }

    public final org.json.JSONObject getMeta() {
        return this.meta;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONRule$Companion;", "", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONRule;", "invoke", "(Lorg/json/JSONObject;)Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONRule;"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.adobe.marketing.mobile.launch.rulesengine.json.JSONRule invoke(org.json.JSONObject jsonObject) {
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            if (jsonObject == null) {
                return null;
            }
            org.json.JSONObject jSONObject = jsonObject.getJSONObject("condition");
            org.json.JSONArray jSONArray = jsonObject.getJSONArray("consequences");
            org.json.JSONObject optJSONObject = jsonObject.optJSONObject(com.adjust.sdk.Constants.REFERRER_API_META);
            if (jSONObject == null || jSONArray == null) {
                com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.LOG_TAG, "JSONRule", "Failed to extract [rule.condition] or [rule.consequences].", new java.lang.Object[0]);
                return null;
            }
            return new com.adobe.marketing.mobile.launch.rulesengine.json.JSONRule(jSONObject, jSONArray, optJSONObject, defaultConstructorMarker);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final /* synthetic */ com.adobe.marketing.mobile.launch.rulesengine.LaunchRule toLaunchRule$core_phoneRelease(com.adobe.marketing.mobile.ExtensionApi extensionApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionApi, "");
        com.adobe.marketing.mobile.launch.rulesengine.json.JSONCondition build$core_phoneRelease = com.adobe.marketing.mobile.launch.rulesengine.json.JSONCondition.INSTANCE.build$core_phoneRelease(this.condition, extensionApi);
        com.adobe.marketing.mobile.rulesengine.Evaluable evaluable = build$core_phoneRelease != null ? build$core_phoneRelease.toEvaluable() : null;
        if (evaluable == null) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.LOG_TAG, "JSONRule", "Failed to build LaunchRule from JSON, the [rule.condition] can't be parsed to Evaluable.", new java.lang.Object[0]);
            return null;
        }
        return new com.adobe.marketing.mobile.launch.rulesengine.LaunchRule(evaluable, com.adobe.marketing.mobile.internal.util.JSONExtensionsKt.map(this.consequences, new kotlin.jvm.functions.Function1<java.lang.Object, com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence>() { // from class: com.adobe.marketing.mobile.launch.rulesengine.json.JSONRule$toLaunchRule$consequenceList$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence invoke(java.lang.Object obj) {
                com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence ruleConsequence$core_phoneRelease;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
                com.adobe.marketing.mobile.launch.rulesengine.json.JSONConsequence invoke = com.adobe.marketing.mobile.launch.rulesengine.json.JSONConsequence.INSTANCE.invoke(obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null);
                if (invoke == null || (ruleConsequence$core_phoneRelease = invoke.toRuleConsequence$core_phoneRelease()) == null) {
                    throw new java.lang.Exception();
                }
                return ruleConsequence$core_phoneRelease;
            }
        }), com.adobe.marketing.mobile.launch.rulesengine.json.JSONMeta.INSTANCE.invoke(this.meta).toMeta$core_phoneRelease());
    }

    public /* synthetic */ JSONRule(org.json.JSONObject jSONObject, org.json.JSONArray jSONArray, org.json.JSONObject jSONObject2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, jSONArray, jSONObject2);
    }
}
