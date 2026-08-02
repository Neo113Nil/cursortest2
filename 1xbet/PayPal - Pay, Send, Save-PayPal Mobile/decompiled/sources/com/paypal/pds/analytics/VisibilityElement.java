package com.paypal.pds.analytics;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lcom/paypal/pds/analytics/VisibilityElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcom/paypal/pds/analytics/VisibilityNode;", "", "threshold", "", "kidKey", "<init>", "(FLjava/lang/String;)V", "create", "()Lcom/paypal/pds/analytics/VisibilityNode;", "node", "", "update", "(Lcom/paypal/pds/analytics/VisibilityNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "copy", "(FLjava/lang/String;)Lcom/paypal/pds/analytics/VisibilityElement;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class VisibilityElement extends androidx.compose.ui.node.ModifierNodeElement<com.paypal.pds.analytics.VisibilityNode> {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoSizes;

    public VisibilityElement(float f, java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = f;
        this.getHighSpeedVideoSizes = str;
    }

    public /* synthetic */ VisibilityElement(float f, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, (i & 2) != 0 ? null : str);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create, reason: avoid collision after fix types in other method */
    public final com.paypal.pds.analytics.VisibilityNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new com.paypal.pds.analytics.VisibilityNode(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(com.paypal.pds.analytics.VisibilityNode node) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(node, "");
        node.update(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inspectorInfo, "");
        inspectorInfo.setName("PdsVisibilityElement");
        inspectorInfo.getProperties().set("threshold", java.lang.Float.valueOf(this.getHighSpeedVideoFpsRanges));
        inspectorInfo.getProperties().set("kidKey", this.getHighSpeedVideoSizes);
    }

    public final java.lang.String toString() {
        float f = this.getHighSpeedVideoFpsRanges;
        java.lang.String str = this.getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VisibilityElement(getHighSpeedVideoFpsRanges=");
        sb.append(f);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int hashCode = java.lang.Float.hashCode(this.getHighSpeedVideoFpsRanges);
        java.lang.String str = this.getHighSpeedVideoSizes;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.pds.analytics.VisibilityElement)) {
            return false;
        }
        com.paypal.pds.analytics.VisibilityElement visibilityElement = (com.paypal.pds.analytics.VisibilityElement) other;
        return java.lang.Float.compare(this.getHighSpeedVideoFpsRanges, visibilityElement.getHighSpeedVideoFpsRanges) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, visibilityElement.getHighSpeedVideoSizes);
    }

    public final com.paypal.pds.analytics.VisibilityElement copy(float threshold, java.lang.String kidKey) {
        return new com.paypal.pds.analytics.VisibilityElement(threshold, kidKey);
    }

    public static /* synthetic */ com.paypal.pds.analytics.VisibilityElement copy$default(com.paypal.pds.analytics.VisibilityElement visibilityElement, float f, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = visibilityElement.getHighSpeedVideoFpsRanges;
        }
        if ((i & 2) != 0) {
            str = visibilityElement.getHighSpeedVideoSizes;
        }
        return visibilityElement.copy(f, str);
    }
}
