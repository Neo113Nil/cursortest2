package com.adobe.marketing.mobile.launch.rulesengine.json;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONConsequence;", "", "", "p0", "p1", "", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lcom/adobe/marketing/mobile/launch/rulesengine/RuleConsequence;", "toRuleConsequence$core_phoneRelease", "()Lcom/adobe/marketing/mobile/launch/rulesengine/RuleConsequence;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class JSONConsequence {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.adobe.marketing.mobile.launch.rulesengine.json.JSONConsequence.Companion INSTANCE = new com.adobe.marketing.mobile.launch.rulesengine.json.JSONConsequence.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;

    private JSONConsequence(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoSizes = str2;
        this.getHighSpeedVideoFpsRangesFor = map;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONConsequence$Companion;", "", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONConsequence;", "invoke", "(Lorg/json/JSONObject;)Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONConsequence;"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.adobe.marketing.mobile.launch.rulesengine.json.JSONConsequence invoke(org.json.JSONObject jsonObject) {
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            if (jsonObject == null) {
                return null;
            }
            java.lang.String optString = jsonObject.optString("id");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString, "");
            java.lang.String optString2 = jsonObject.optString("type");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString2, "");
            org.json.JSONObject optJSONObject = jsonObject.optJSONObject("detail");
            return new com.adobe.marketing.mobile.launch.rulesengine.json.JSONConsequence(optString, optString2, optJSONObject != null ? com.adobe.marketing.mobile.internal.util.JSONExtensionsKt.toMap(optJSONObject) : null, defaultConstructorMarker);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final /* synthetic */ com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence toRuleConsequence$core_phoneRelease() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.length() == 0) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "JSONConsequence", "Unable to find required field \"id\" in rules consequence.", new java.lang.Object[0]);
            return null;
        }
        if (this.getHighSpeedVideoSizes.length() == 0) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "JSONConsequence", "Unable to find required field \"type\" in rules consequence.", new java.lang.Object[0]);
            return null;
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.getHighSpeedVideoFpsRangesFor;
        if (map == null || map.isEmpty()) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "JSONConsequence", "Unable to find required field \"detail\" in rules consequence.", new java.lang.Object[0]);
            return null;
        }
        return new com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
    }

    public /* synthetic */ JSONConsequence(java.lang.String str, java.lang.String str2, java.util.Map map, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, map);
    }
}
