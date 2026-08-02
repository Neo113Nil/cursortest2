package com.adobe.marketing.mobile.launch.rulesengine;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\fJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0010"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/LaunchRule;", "Lcom/adobe/marketing/mobile/rulesengine/Rule;", "Lcom/adobe/marketing/mobile/rulesengine/Evaluable;", "condition", "", "Lcom/adobe/marketing/mobile/launch/rulesengine/RuleConsequence;", "consequenceList", "Lcom/adobe/marketing/mobile/launch/rulesengine/RuleMeta;", com.adjust.sdk.Constants.REFERRER_API_META, "<init>", "(Lcom/adobe/marketing/mobile/rulesengine/Evaluable;Ljava/util/List;Lcom/adobe/marketing/mobile/launch/rulesengine/RuleMeta;)V", "component1", "()Lcom/adobe/marketing/mobile/rulesengine/Evaluable;", "component2", "()Ljava/util/List;", "component3", "()Lcom/adobe/marketing/mobile/launch/rulesengine/RuleMeta;", "copy", "(Lcom/adobe/marketing/mobile/rulesengine/Evaluable;Ljava/util/List;Lcom/adobe/marketing/mobile/launch/rulesengine/RuleMeta;)Lcom/adobe/marketing/mobile/launch/rulesengine/LaunchRule;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "getEvaluable", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/adobe/marketing/mobile/rulesengine/Evaluable;", "getCondition", "Ljava/util/List;", "getConsequenceList", "Lcom/adobe/marketing/mobile/launch/rulesengine/RuleMeta;", "getMeta"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class LaunchRule implements com.adobe.marketing.mobile.rulesengine.Rule {
    public static final int $stable = 8;
    private final com.adobe.marketing.mobile.rulesengine.Evaluable condition;
    private final java.util.List<com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence> consequenceList;
    private final com.adobe.marketing.mobile.launch.rulesengine.RuleMeta meta;

    public LaunchRule(com.adobe.marketing.mobile.rulesengine.Evaluable evaluable, java.util.List<com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence> list, com.adobe.marketing.mobile.launch.rulesengine.RuleMeta ruleMeta) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ruleMeta, "");
        this.condition = evaluable;
        this.consequenceList = list;
        this.meta = ruleMeta;
    }

    public final com.adobe.marketing.mobile.rulesengine.Evaluable getCondition() {
        return this.condition;
    }

    public final java.util.List<com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence> getConsequenceList() {
        return this.consequenceList;
    }

    public /* synthetic */ LaunchRule(com.adobe.marketing.mobile.rulesengine.Evaluable evaluable, java.util.List list, com.adobe.marketing.mobile.launch.rulesengine.RuleMeta ruleMeta, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(evaluable, list, (i & 4) != 0 ? new com.adobe.marketing.mobile.launch.rulesengine.RuleMeta(false, 1, null) : ruleMeta);
    }

    public final com.adobe.marketing.mobile.launch.rulesengine.RuleMeta getMeta() {
        return this.meta;
    }

    @Override // com.adobe.marketing.mobile.rulesengine.Rule
    public final com.adobe.marketing.mobile.rulesengine.Evaluable getEvaluable() {
        return this.condition;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LaunchRule(condition=");
        sb.append(this.condition);
        sb.append(", consequenceList=");
        sb.append(this.consequenceList);
        sb.append(", meta=");
        sb.append(this.meta);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.condition.hashCode() * 31) + this.consequenceList.hashCode()) * 31) + this.meta.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.adobe.marketing.mobile.launch.rulesengine.LaunchRule)) {
            return false;
        }
        com.adobe.marketing.mobile.launch.rulesengine.LaunchRule launchRule = (com.adobe.marketing.mobile.launch.rulesengine.LaunchRule) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.condition, launchRule.condition) && kotlin.jvm.internal.Intrinsics.areEqual(this.consequenceList, launchRule.consequenceList) && kotlin.jvm.internal.Intrinsics.areEqual(this.meta, launchRule.meta);
    }

    public final com.adobe.marketing.mobile.launch.rulesengine.LaunchRule copy(com.adobe.marketing.mobile.rulesengine.Evaluable condition, java.util.List<com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence> consequenceList, com.adobe.marketing.mobile.launch.rulesengine.RuleMeta meta) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(condition, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consequenceList, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(meta, "");
        return new com.adobe.marketing.mobile.launch.rulesengine.LaunchRule(condition, consequenceList, meta);
    }

    /* renamed from: component3, reason: from getter */
    public final com.adobe.marketing.mobile.launch.rulesengine.RuleMeta getMeta() {
        return this.meta;
    }

    public final java.util.List<com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence> component2() {
        return this.consequenceList;
    }

    /* renamed from: component1, reason: from getter */
    public final com.adobe.marketing.mobile.rulesengine.Evaluable getCondition() {
        return this.condition;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.adobe.marketing.mobile.launch.rulesengine.LaunchRule copy$default(com.adobe.marketing.mobile.launch.rulesengine.LaunchRule launchRule, com.adobe.marketing.mobile.rulesengine.Evaluable evaluable, java.util.List list, com.adobe.marketing.mobile.launch.rulesengine.RuleMeta ruleMeta, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            evaluable = launchRule.condition;
        }
        if ((i & 2) != 0) {
            list = launchRule.consequenceList;
        }
        if ((i & 4) != 0) {
            ruleMeta = launchRule.meta;
        }
        return launchRule.copy(evaluable, list, ruleMeta);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LaunchRule(com.adobe.marketing.mobile.rulesengine.Evaluable evaluable, java.util.List<com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence> list) {
        this(evaluable, list, null, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
    }
}
