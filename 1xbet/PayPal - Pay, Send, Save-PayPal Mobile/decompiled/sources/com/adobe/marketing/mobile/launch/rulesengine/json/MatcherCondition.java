package com.adobe.marketing.mobile.launch.rulesengine.json;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/json/MatcherCondition;", "Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONCondition;", "Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONDefinition;", "definition", "<init>", "(Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONDefinition;)V", "", "p0", "p1", "", "p2", "Lcom/adobe/marketing/mobile/rulesengine/Evaluable;", "getHighSpeedVideoSizes", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/adobe/marketing/mobile/rulesengine/Evaluable;", "toEvaluable", "()Lcom/adobe/marketing/mobile/rulesengine/Evaluable;", "Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONDefinition;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class MatcherCondition extends com.adobe.marketing.mobile.launch.rulesengine.json.JSONCondition {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.adobe.marketing.mobile.launch.rulesengine.json.JSONDefinition getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.adobe.marketing.mobile.launch.rulesengine.json.MatcherCondition.Companion INSTANCE = new com.adobe.marketing.mobile.launch.rulesengine.json.MatcherCondition.Companion(null);
    private static final java.util.Map<java.lang.String, java.lang.String> MATCHER_MAPPING = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("eq", "equals"), kotlin.TuplesKt.to("ne", "notEquals"), kotlin.TuplesKt.to("gt", "greaterThan"), kotlin.TuplesKt.to("ge", "greaterEqual"), kotlin.TuplesKt.to("lt", "lessThan"), kotlin.TuplesKt.to("le", "lessEqual"), kotlin.TuplesKt.to("co", "contains"), kotlin.TuplesKt.to("nc", "notContains"), kotlin.TuplesKt.to("sw", "startsWith"), kotlin.TuplesKt.to("ew", "endsWith"), kotlin.TuplesKt.to("ex", "exists"), kotlin.TuplesKt.to("nx", "notExist"));
    private static final java.util.Set<java.lang.String> Camera2StreamConfigurationMap = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"ne", "nc"});

    public MatcherCondition(com.adobe.marketing.mobile.launch.rulesengine.json.JSONDefinition jSONDefinition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jSONDefinition, "");
        this.getHighResolutionOutputSizeshNQ4ISI = jSONDefinition;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/json/MatcherCondition$Companion;", "", "<init>", "()V", "", "", "MATCHER_MAPPING", "Ljava/util/Map;", "getMATCHER_MAPPING$core_phoneRelease", "()Ljava/util/Map;", "", "Camera2StreamConfigurationMap", "Ljava/util/Set;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.Map<java.lang.String, java.lang.String> getMATCHER_MAPPING$core_phoneRelease() {
            return com.adobe.marketing.mobile.launch.rulesengine.json.MatcherCondition.MATCHER_MAPPING;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.adobe.marketing.mobile.launch.rulesengine.json.JSONCondition
    public final /* synthetic */ com.adobe.marketing.mobile.rulesengine.Evaluable toEvaluable() {
        java.lang.String str;
        com.adobe.marketing.mobile.rulesengine.LogicalExpression logicalExpression = null;
        if (this.getHighResolutionOutputSizeshNQ4ISI.getMatcher() == null || this.getHighResolutionOutputSizeshNQ4ISI.getKey() == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[key] or [matcher] is not String, failed to build Evaluable from definition JSON: \n ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.LOG_TAG, "MatcherCondition", sb.toString(), new java.lang.Object[0]);
            return null;
        }
        java.util.List<java.lang.Object> values = this.getHighResolutionOutputSizeshNQ4ISI.getValues();
        if (values == null) {
            values = kotlin.collections.CollectionsKt.emptyList();
        }
        int size = values.size();
        if (size == 0) {
            return getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI.getKey(), this.getHighResolutionOutputSizeshNQ4ISI.getMatcher(), null);
        }
        if (size == 1) {
            return getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI.getKey(), this.getHighResolutionOutputSizeshNQ4ISI.getMatcher(), values.get(0));
        }
        if (2 > size || size > Integer.MAX_VALUE) {
            return null;
        }
        java.util.List<java.lang.Object> list = values;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI.getKey(), this.getHighResolutionOutputSizeshNQ4ISI.getMatcher(), it.next()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            if (Camera2StreamConfigurationMap.contains(this.getHighResolutionOutputSizeshNQ4ISI.getMatcher())) {
                str = "and";
            } else {
                str = "or";
            }
            logicalExpression = new com.adobe.marketing.mobile.rulesengine.LogicalExpression(arrayList2, str);
        }
        return logicalExpression;
    }

    private static com.adobe.marketing.mobile.rulesengine.Evaluable getHighSpeedVideoSizes(java.lang.String p0, java.lang.String p1, java.lang.Object p2) {
        kotlin.Pair pair;
        java.lang.String str = MATCHER_MAPPING.get(p1);
        if (str == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to build Evaluable from [type:matcher] json, [definition.matcher = ");
            sb.append(p1);
            sb.append("] is not supported.");
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.LOG_TAG, "MatcherCondition", sb.toString(), new java.lang.Object[0]);
            return null;
        }
        if (p2 == null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("{{");
            sb2.append(p0);
            sb2.append("}}");
            return new com.adobe.marketing.mobile.rulesengine.UnaryExpression(new com.adobe.marketing.mobile.rulesengine.OperandMustacheToken(sb2.toString(), java.lang.Object.class), str);
        }
        if (p2 instanceof java.lang.String) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("{{string(");
            sb3.append(p0);
            sb3.append(")}}");
            pair = new kotlin.Pair(java.lang.String.class, sb3.toString());
        } else if (p2 instanceof java.lang.Integer) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("{{int(");
            sb4.append(p0);
            sb4.append(")}}");
            pair = new kotlin.Pair(java.lang.Number.class, sb4.toString());
        } else if (p2 instanceof java.lang.Double) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("{{double(");
            sb5.append(p0);
            sb5.append(")}}");
            pair = new kotlin.Pair(java.lang.Number.class, sb5.toString());
        } else if (p2 instanceof java.lang.Boolean) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{{bool(");
            sb6.append(p0);
            sb6.append(")}}");
            pair = new kotlin.Pair(java.lang.Boolean.class, sb6.toString());
        } else if (!(p2 instanceof java.lang.Float)) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("{{");
            sb7.append(p0);
            sb7.append("}}");
            pair = new kotlin.Pair(java.lang.Object.class, sb7.toString());
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("{{double(");
            sb8.append(p0);
            sb8.append(")}}");
            pair = new kotlin.Pair(java.lang.Number.class, sb8.toString());
        }
        java.lang.Class cls = (java.lang.Class) pair.component1();
        java.lang.String str2 = (java.lang.String) pair.component2();
        kotlin.jvm.internal.Intrinsics.checkNotNull(cls, "");
        return new com.adobe.marketing.mobile.rulesengine.ComparisonExpression(new com.adobe.marketing.mobile.rulesengine.OperandMustacheToken(str2, cls), str, new com.adobe.marketing.mobile.rulesengine.OperandLiteral(p2));
    }
}
