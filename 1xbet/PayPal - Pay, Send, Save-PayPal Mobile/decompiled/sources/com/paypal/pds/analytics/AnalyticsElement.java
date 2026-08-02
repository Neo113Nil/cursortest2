package com.paypal.pds.analytics;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0012\u001a\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÀ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0014\u001a\u00020\u00002\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR,\u0010\u0006\u001a\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0013"}, d2 = {"Lcom/paypal/pds/analytics/AnalyticsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcom/paypal/pds/analytics/AnalyticsNode;", "", "Lcom/paypal/pds/analytics/TypedKey;", "", "params", "<init>", "(Ljava/util/Map;)V", "create", "()Lcom/paypal/pds/analytics/AnalyticsNode;", "node", "", "update", "(Lcom/paypal/pds/analytics/AnalyticsNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1$analytics_release", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/paypal/pds/analytics/AnalyticsElement;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getParams$analytics_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AnalyticsElement extends androidx.compose.ui.node.ModifierNodeElement<com.paypal.pds.analytics.AnalyticsNode> {
    public static final int $stable = 0;
    private final java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object> params;

    public AnalyticsElement(java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.params = map;
    }

    public final java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object> getParams$analytics_release() {
        return this.params;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create, reason: avoid collision after fix types in other method */
    public final com.paypal.pds.analytics.AnalyticsNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new com.paypal.pds.analytics.AnalyticsNode(this.params);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(com.paypal.pds.analytics.AnalyticsNode node) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(node, "");
        node.setParams(this.params);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inspectorInfo, "");
        inspectorInfo.setName("PdsAnalyticsElement");
        inspectorInfo.getProperties().set("params", this.params);
    }

    public final java.lang.String toString() {
        java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object> map = this.params;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AnalyticsElement(params=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.params.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.pds.analytics.AnalyticsElement) && kotlin.jvm.internal.Intrinsics.areEqual(this.params, ((com.paypal.pds.analytics.AnalyticsElement) other).params);
    }

    public final com.paypal.pds.analytics.AnalyticsElement copy(java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, ? extends java.lang.Object> params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
        return new com.paypal.pds.analytics.AnalyticsElement(params);
    }

    public final java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object> component1$analytics_release() {
        return this.params;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.pds.analytics.AnalyticsElement copy$default(com.paypal.pds.analytics.AnalyticsElement analyticsElement, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = analyticsElement.params;
        }
        return analyticsElement.copy(map);
    }
}
