package com.adobe.marketing.mobile.launch.rulesengine.json;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/json/HistoricalCondition;", "Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONCondition;", "Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONDefinition;", "definition", "Lcom/adobe/marketing/mobile/ExtensionApi;", "extensionApi", "<init>", "(Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONDefinition;Lcom/adobe/marketing/mobile/ExtensionApi;)V", "Lcom/adobe/marketing/mobile/rulesengine/Evaluable;", "toEvaluable", "()Lcom/adobe/marketing/mobile/rulesengine/Evaluable;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONDefinition;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lcom/adobe/marketing/mobile/ExtensionApi;", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class HistoricalCondition extends com.adobe.marketing.mobile.launch.rulesengine.json.JSONCondition {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.adobe.marketing.mobile.launch.rulesengine.json.JSONDefinition getHighSpeedVideoFpsRanges;
    private final com.adobe.marketing.mobile.ExtensionApi getHighSpeedVideoSizes;

    public HistoricalCondition(com.adobe.marketing.mobile.launch.rulesengine.json.JSONDefinition jSONDefinition, com.adobe.marketing.mobile.ExtensionApi extensionApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jSONDefinition, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionApi, "");
        this.getHighSpeedVideoFpsRanges = jSONDefinition;
        this.getHighSpeedVideoSizes = extensionApi;
    }

    @Override // com.adobe.marketing.mobile.launch.rulesengine.json.JSONCondition
    public final com.adobe.marketing.mobile.rulesengine.Evaluable toEvaluable() {
        java.lang.Object value = this.getHighSpeedVideoFpsRanges.getValue();
        java.lang.String str = com.adobe.marketing.mobile.launch.rulesengine.json.MatcherCondition.INSTANCE.getMATCHER_MAPPING$core_phoneRelease().get(this.getHighSpeedVideoFpsRanges.getMatcher());
        if (this.getHighSpeedVideoFpsRanges.getEvents() == null || str == null || !(value instanceof java.lang.Integer)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to build Evaluable from definition JSON: \n ");
            sb.append(this.getHighSpeedVideoFpsRanges);
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.LOG_TAG, "HistoricalCondition", sb.toString(), new java.lang.Object[0]);
            return null;
        }
        java.lang.Long from = this.getHighSpeedVideoFpsRanges.getFrom();
        long longValue = from != null ? from.longValue() : 0L;
        java.lang.Long to = this.getHighSpeedVideoFpsRanges.getTo();
        long longValue2 = to != null ? to.longValue() : 0L;
        java.lang.String searchType = this.getHighSpeedVideoFpsRanges.getSearchType();
        if (searchType == null) {
            searchType = "any";
        }
        java.util.List<java.util.Map<java.lang.String, java.lang.Object>> events = this.getHighSpeedVideoFpsRanges.getEvents();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(events, 10));
        java.util.Iterator<T> it = events.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.adobe.marketing.mobile.EventHistoryRequest((java.util.Map) it.next(), longValue, longValue2));
            longValue = longValue;
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (kotlin.jvm.internal.Intrinsics.areEqual(searchType, com.adobe.marketing.mobile.launch.rulesengine.HistoricalEventsQueryingKt.SEARCH_TYPE_MOST_RECENT)) {
            return new com.adobe.marketing.mobile.rulesengine.ComparisonExpression(new com.adobe.marketing.mobile.rulesengine.OperandFunction(new com.adobe.marketing.mobile.rulesengine.FunctionBlock() { // from class: com.adobe.marketing.mobile.launch.rulesengine.json.HistoricalCondition$$ExternalSyntheticLambda0
                @Override // com.adobe.marketing.mobile.rulesengine.FunctionBlock
                public final java.lang.Object execute(java.lang.Object[] objArr) {
                    java.lang.Integer highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.launch.rulesengine.json.HistoricalCondition.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.launch.rulesengine.json.HistoricalCondition.this, objArr);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            }, arrayList2), str, new com.adobe.marketing.mobile.rulesengine.OperandLiteral(value));
        }
        return new com.adobe.marketing.mobile.rulesengine.ComparisonExpression(new com.adobe.marketing.mobile.rulesengine.OperandFunction(new com.adobe.marketing.mobile.rulesengine.FunctionBlock() { // from class: com.adobe.marketing.mobile.launch.rulesengine.json.HistoricalCondition$$ExternalSyntheticLambda1
            @Override // com.adobe.marketing.mobile.rulesengine.FunctionBlock
            public final java.lang.Object execute(java.lang.Object[] objArr) {
                java.lang.Integer Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = com.adobe.marketing.mobile.launch.rulesengine.json.HistoricalCondition.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.launch.rulesengine.json.HistoricalCondition.this, objArr);
                return Camera2StreamConfigurationMap;
            }
        }, arrayList2, searchType), str, new com.adobe.marketing.mobile.rulesengine.OperandLiteral(value));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Integer getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.launch.rulesengine.json.HistoricalCondition historicalCondition, java.lang.Object[] objArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(historicalCondition, "");
        int i = 0;
        try {
            java.lang.Object obj = objArr[0];
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            i = com.adobe.marketing.mobile.launch.rulesengine.HistoricalEventsQueryingKt.getMostRecentHistoricalEvent((java.util.List) obj, historicalCondition.getHighSpeedVideoSizes);
        } catch (java.lang.Exception unused) {
        }
        return java.lang.Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Integer Camera2StreamConfigurationMap(com.adobe.marketing.mobile.launch.rulesengine.json.HistoricalCondition historicalCondition, java.lang.Object[] objArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(historicalCondition, "");
        int i = 0;
        try {
            java.lang.Object obj = objArr[0];
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            java.lang.Object obj2 = objArr[1];
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
            i = com.adobe.marketing.mobile.launch.rulesengine.HistoricalEventsQueryingKt.getHistoricalEventCount((java.util.List) obj, (java.lang.String) obj2, historicalCondition.getHighSpeedVideoSizes);
        } catch (java.lang.Exception unused) {
        }
        return java.lang.Integer.valueOf(i);
    }
}
