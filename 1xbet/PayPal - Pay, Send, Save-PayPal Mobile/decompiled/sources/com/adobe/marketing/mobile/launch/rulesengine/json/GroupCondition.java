package com.adobe.marketing.mobile.launch.rulesengine.json;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/json/GroupCondition;", "Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONCondition;", "Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONDefinition;", "definition", "<init>", "(Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONDefinition;)V", "Lcom/adobe/marketing/mobile/rulesengine/Evaluable;", "toEvaluable", "()Lcom/adobe/marketing/mobile/rulesengine/Evaluable;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONDefinition;", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class GroupCondition extends com.adobe.marketing.mobile.launch.rulesengine.json.JSONCondition {
    private final com.adobe.marketing.mobile.launch.rulesengine.json.JSONDefinition getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.List<java.lang.String> Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"or", "and"});

    public GroupCondition(com.adobe.marketing.mobile.launch.rulesengine.json.JSONDefinition jSONDefinition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jSONDefinition, "");
        this.getHighResolutionOutputSizeshNQ4ISI = jSONDefinition;
    }

    @Override // com.adobe.marketing.mobile.launch.rulesengine.json.JSONCondition
    public final /* synthetic */ com.adobe.marketing.mobile.rulesengine.Evaluable toEvaluable() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getLogic() == null || this.getHighResolutionOutputSizeshNQ4ISI.getConditions() == null || this.getHighResolutionOutputSizeshNQ4ISI.getConditions().isEmpty()) {
            return null;
        }
        java.lang.String logic = this.getHighResolutionOutputSizeshNQ4ISI.getLogic();
        java.util.Locale locale = java.util.Locale.ROOT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = logic.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (!Camera2StreamConfigurationMap.contains(lowerCase)) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.LOG_TAG, "GroupCondition", "Unsupported logical operator: ".concat(java.lang.String.valueOf(lowerCase)), new java.lang.Object[0]);
            return null;
        }
        java.util.List<com.adobe.marketing.mobile.launch.rulesengine.json.JSONCondition> conditions = this.getHighResolutionOutputSizeshNQ4ISI.getConditions();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(conditions, 10));
        java.util.Iterator<T> it = conditions.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.adobe.marketing.mobile.launch.rulesengine.json.JSONCondition) it.next()).toEvaluable());
        }
        return new com.adobe.marketing.mobile.rulesengine.LogicalExpression(arrayList, lowerCase);
    }
}
