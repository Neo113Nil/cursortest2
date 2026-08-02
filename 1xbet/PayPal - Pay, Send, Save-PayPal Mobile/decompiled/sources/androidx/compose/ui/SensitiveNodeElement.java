package androidx.compose.ui;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/ui/SensitiveNodeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/SensitiveContentNode;", "", "p0", "<init>", "(Z)V", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Z", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class SensitiveNodeElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.SensitiveContentNode> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    public SensitiveNodeElement(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* synthetic */ void update(androidx.compose.ui.SensitiveContentNode sensitiveContentNode) {
        androidx.compose.ui.SensitiveContentNode sensitiveContentNode2 = sensitiveContentNode;
        boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
        sensitiveContentNode2.getHighSpeedVideoFpsRangesFor = z;
        if (z && !sensitiveContentNode2.Camera2StreamConfigurationMap) {
            androidx.compose.ui.node.DelegatableNodeKt.requireOwner(sensitiveContentNode2).incrementSensitiveComponentCount();
            sensitiveContentNode2.Camera2StreamConfigurationMap = true;
        } else {
            if (z || !sensitiveContentNode2.Camera2StreamConfigurationMap) {
                return;
            }
            androidx.compose.ui.node.DelegatableNodeKt.requireOwner(sensitiveContentNode2).decrementSensitiveComponentCount();
            sensitiveContentNode2.Camera2StreamConfigurationMap = false;
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("sensitiveContent");
        inspectorInfo.getProperties().set("isContentSensitive", java.lang.Boolean.valueOf(this.getHighResolutionOutputSizeshNQ4ISI));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* synthetic */ androidx.compose.ui.SensitiveContentNode create() {
        return new androidx.compose.ui.SensitiveContentNode(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SensitiveNodeElement(getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof androidx.compose.ui.SensitiveNodeElement) && this.getHighResolutionOutputSizeshNQ4ISI == ((androidx.compose.ui.SensitiveNodeElement) p0).getHighResolutionOutputSizeshNQ4ISI;
    }
}
