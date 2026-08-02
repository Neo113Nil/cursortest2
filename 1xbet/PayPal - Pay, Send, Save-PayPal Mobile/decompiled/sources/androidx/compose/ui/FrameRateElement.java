package androidx.compose.ui;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/ui/FrameRateElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/FrameRateModifierNode;", "", "p0", "<init>", "(F)V", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class FrameRateElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.FrameRateModifierNode> {
    private final float getHighSpeedVideoFpsRanges;

    public FrameRateElement(float f) {
        this.getHighSpeedVideoFpsRanges = f;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* synthetic */ void update(androidx.compose.ui.FrameRateModifierNode frameRateModifierNode) {
        androidx.compose.ui.FrameRateModifierNode frameRateModifierNode2 = frameRateModifierNode;
        if (frameRateModifierNode2.getFrameRate() != this.getHighSpeedVideoFpsRanges) {
            frameRateModifierNode2.setShouldUpdateFrameRates(true);
            frameRateModifierNode2.setFrameRate(this.getHighSpeedVideoFpsRanges);
            androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(frameRateModifierNode2);
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("FrameRateModifierNode");
        inspectorInfo.getProperties().set("frameRate", java.lang.Float.valueOf(this.getHighSpeedVideoFpsRanges));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final /* synthetic */ androidx.compose.ui.FrameRateModifierNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.ui.FrameRateModifierNode(this.getHighSpeedVideoFpsRanges);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FrameRateElement(getHighSpeedVideoFpsRanges=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return java.lang.Float.hashCode(this.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof androidx.compose.ui.FrameRateElement) && java.lang.Float.compare(this.getHighSpeedVideoFpsRanges, ((androidx.compose.ui.FrameRateElement) p0).getHighSpeedVideoFpsRanges) == 0;
    }
}
