package com.paypal.pds.analytics;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0015\u001a\u00020\n2\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010)\u001a\u00020(8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010."}, d2 = {"Lcom/paypal/pds/analytics/AnalyticsLeafElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcom/paypal/pds/analytics/AnalyticsLeafNode;", "", "key", "<init>", "(Ljava/lang/Object;)V", "create", "()Lcom/paypal/pds/analytics/AnalyticsLeafNode;", "node", "", "update", "(Lcom/paypal/pds/analytics/AnalyticsLeafNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "Lkotlin/Function1;", "Lcom/paypal/pds/analytics/AnalyticsEventScope;", "Lcom/paypal/pds/analytics/AnalyticsEvent;", "Lkotlin/ExtensionFunctionType;", "creator", "track", "(Lkotlin/jvm/functions/Function1;)V", "copy", "(Ljava/lang/Object;)Lcom/paypal/pds/analytics/AnalyticsLeafElement;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/paypal/pds/analytics/AnalyticsLeafNode;", "Lcom/paypal/pds/analytics/AnalyticsLeafState;", "state", "Lcom/paypal/pds/analytics/AnalyticsLeafState;", "getState", "()Lcom/paypal/pds/analytics/AnalyticsLeafState;", "setState", "(Lcom/paypal/pds/analytics/AnalyticsLeafState;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AnalyticsLeafElement extends androidx.compose.ui.node.ModifierNodeElement<com.paypal.pds.analytics.AnalyticsLeafNode> {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoFpsRangesFor;
    private com.paypal.pds.analytics.AnalyticsLeafNode getHighSpeedVideoSizes;
    private com.paypal.pds.analytics.AnalyticsLeafState state;

    public AnalyticsLeafElement(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.state = com.paypal.pds.analytics.AnalyticsLeafState.None.INSTANCE;
    }

    public /* synthetic */ AnalyticsLeafElement(java.lang.Object obj, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.Unit.INSTANCE : obj);
    }

    public final com.paypal.pds.analytics.AnalyticsLeafState getState() {
        return this.state;
    }

    public final void setState(com.paypal.pds.analytics.AnalyticsLeafState analyticsLeafState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsLeafState, "");
        this.state = analyticsLeafState;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create, reason: avoid collision after fix types in other method */
    public final com.paypal.pds.analytics.AnalyticsLeafNode getGetHighResolutionOutputSizeshNQ4ISI() {
        com.paypal.pds.analytics.AnalyticsLeafNode analyticsLeafNode = new com.paypal.pds.analytics.AnalyticsLeafNode(this.getHighSpeedVideoFpsRangesFor, new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.analytics.AnalyticsLeafElement$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.paypal.pds.analytics.AnalyticsLeafState analyticsLeafState;
                analyticsLeafState = com.paypal.pds.analytics.AnalyticsLeafElement.this.state;
                return analyticsLeafState;
            }
        });
        this.getHighSpeedVideoSizes = analyticsLeafNode;
        return analyticsLeafNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(com.paypal.pds.analytics.AnalyticsLeafNode node) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(node, "");
        this.getHighSpeedVideoSizes = node;
        node.update(new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.analytics.AnalyticsLeafElement$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.paypal.pds.analytics.AnalyticsLeafState analyticsLeafState;
                analyticsLeafState = com.paypal.pds.analytics.AnalyticsLeafElement.this.state;
                return analyticsLeafState;
            }
        });
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inspectorInfo, "");
        inspectorInfo.setName("PdsAnalyticsLeafElement");
        inspectorInfo.getProperties().set("key", this.getHighSpeedVideoFpsRangesFor);
    }

    public final void track(kotlin.jvm.functions.Function1<? super com.paypal.pds.analytics.AnalyticsEventScope, ? extends com.paypal.pds.analytics.AnalyticsEvent> creator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creator, "");
        com.paypal.pds.analytics.AnalyticsLeafNode analyticsLeafNode = this.getHighSpeedVideoSizes;
        if (analyticsLeafNode != null) {
            analyticsLeafNode.track(creator);
        }
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.getHighSpeedVideoFpsRangesFor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AnalyticsLeafElement(getHighSpeedVideoFpsRangesFor=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.pds.analytics.AnalyticsLeafElement) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, ((com.paypal.pds.analytics.AnalyticsLeafElement) other).getHighSpeedVideoFpsRangesFor);
    }

    public final com.paypal.pds.analytics.AnalyticsLeafElement copy(java.lang.Object key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return new com.paypal.pds.analytics.AnalyticsLeafElement(key);
    }

    public static /* synthetic */ com.paypal.pds.analytics.AnalyticsLeafElement copy$default(com.paypal.pds.analytics.AnalyticsLeafElement analyticsLeafElement, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = analyticsLeafElement.getHighSpeedVideoFpsRangesFor;
        }
        return analyticsLeafElement.copy(obj);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AnalyticsLeafElement() {
        this(r0, 1, r0);
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
    }
}
