package com.adobe.marketing.mobile.launch.rulesengine;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u001e\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ<\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/RuleConsequence;", "", "", "id", "type", "", "detail", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/adobe/marketing/mobile/launch/rulesengine/RuleConsequence;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/Map;", "getDetail", "Ljava/lang/String;", "getId", "getType"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RuleConsequence {
    public static final int $stable = 8;
    private final java.util.Map<java.lang.String, java.lang.Object> detail;
    private final java.lang.String id;
    private final java.lang.String type;

    public RuleConsequence(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.id = str;
        this.type = str2;
        this.detail = map;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getDetail() {
        return this.detail;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RuleConsequence(id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", detail=");
        sb.append(this.detail);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + this.detail.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence)) {
            return false;
        }
        com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence ruleConsequence = (com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, ruleConsequence.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, ruleConsequence.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.detail, ruleConsequence.detail);
    }

    public final com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence copy(java.lang.String id, java.lang.String type, java.util.Map<java.lang.String, ? extends java.lang.Object> detail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detail, "");
        return new com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence(id, type, detail);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> component3() {
        return this.detail;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence copy$default(com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence ruleConsequence, java.lang.String str, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = ruleConsequence.id;
        }
        if ((i & 2) != 0) {
            str2 = ruleConsequence.type;
        }
        if ((i & 4) != 0) {
            map = ruleConsequence.detail;
        }
        return ruleConsequence.copy(str, str2, map);
    }
}
