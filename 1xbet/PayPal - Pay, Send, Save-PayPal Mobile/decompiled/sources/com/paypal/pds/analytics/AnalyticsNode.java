package com.paypal.pds.analytics;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0000\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0011B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bR4\u0010\u0006\u001a\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/pds/analytics/AnalyticsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "", "Lcom/paypal/pds/analytics/TypedKey;", "", "params", "<init>", "(Ljava/util/Map;)V", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "setParams", "traverseKey", "Ljava/lang/Object;", "getTraverseKey", "()Ljava/lang/Object;", "TraverseKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AnalyticsNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.TraversableNode {
    private java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, ? extends java.lang.Object> params;
    private final java.lang.Object traverseKey;

    /* renamed from: TraverseKey, reason: from kotlin metadata */
    public static final com.paypal.pds.analytics.AnalyticsNode.Companion INSTANCE = new com.paypal.pds.analytics.AnalyticsNode.Companion(null);
    public static final int $stable = 8;

    public AnalyticsNode(java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.params = map;
        this.traverseKey = INSTANCE;
    }

    public final java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object> getParams() {
        return this.params;
    }

    public final void setParams(java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.params = map;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final java.lang.Object getTraverseKey() {
        return this.traverseKey;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/analytics/AnalyticsNode$TraverseKey;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.pds.analytics.AnalyticsNode$TraverseKey, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
