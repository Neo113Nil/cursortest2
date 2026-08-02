package com.paypal.pds.analytics;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0018\u0010\t\u001a\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\nJ(\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002HÀ\u0003¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\r\u001a\u00020\u00002 \b\u0002\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R2\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00028\u0011X\u0090\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/pds/analytics/AnalyticsChainHolderStub;", "Lcom/paypal/pds/analytics/AnalyticsChainHolder;", "", "", "Lcom/paypal/pds/analytics/TypedKey;", "", "chain", "<init>", "(Ljava/util/List;)V", "maps", "([Ljava/util/Map;)V", "component1$analytics_release", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/pds/analytics/AnalyticsChainHolderStub;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getChain$analytics_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AnalyticsChainHolderStub extends com.paypal.pds.analytics.AnalyticsChainHolder {
    public static final int $stable = 8;
    private final java.util.List<java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object>> chain;

    /* JADX WARN: Multi-variable type inference failed */
    public AnalyticsChainHolderStub(java.util.List<? extends java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, ? extends java.lang.Object>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.chain = list;
    }

    @Override // com.paypal.pds.analytics.AnalyticsChainHolder
    public final java.util.List<java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object>> getChain$analytics_release() {
        return this.chain;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnalyticsChainHolderStub(java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, ? extends java.lang.Object>... mapArr) {
        this((java.util.List<? extends java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, ? extends java.lang.Object>>) kotlin.collections.CollectionsKt.listOf(java.util.Arrays.copyOf(mapArr, mapArr.length)));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapArr, "");
    }

    public final java.lang.String toString() {
        java.util.List<java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object>> list = this.chain;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AnalyticsChainHolderStub(chain=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.chain.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.pds.analytics.AnalyticsChainHolderStub) && kotlin.jvm.internal.Intrinsics.areEqual(this.chain, ((com.paypal.pds.analytics.AnalyticsChainHolderStub) other).chain);
    }

    public final com.paypal.pds.analytics.AnalyticsChainHolderStub copy(java.util.List<? extends java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, ? extends java.lang.Object>> chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        return new com.paypal.pds.analytics.AnalyticsChainHolderStub(chain);
    }

    public final java.util.List<java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object>> component1$analytics_release() {
        return this.chain;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.pds.analytics.AnalyticsChainHolderStub copy$default(com.paypal.pds.analytics.AnalyticsChainHolderStub analyticsChainHolderStub, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = analyticsChainHolderStub.chain;
        }
        return analyticsChainHolderStub.copy(list);
    }
}
