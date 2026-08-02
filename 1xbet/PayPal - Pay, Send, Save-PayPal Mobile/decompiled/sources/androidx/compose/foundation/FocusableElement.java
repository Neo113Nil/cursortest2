package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\t*\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/foundation/FocusableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/FocusableNode;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "p0", "<init>", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "Camera2StreamConfigurationMap", "()Landroidx/compose/foundation/FocusableNode;", "", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/foundation/FocusableNode;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FocusableElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.FocusableNode> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.interaction.MutableInteractionSource getHighResolutionOutputSizeshNQ4ISI;

    public FocusableElement(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource) {
        this.getHighResolutionOutputSizeshNQ4ISI = mutableInteractionSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.FocusableNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.FocusableNode(this.getHighResolutionOutputSizeshNQ4ISI, 0, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.foundation.FocusableNode p0) {
        p0.update(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof androidx.compose.foundation.FocusableElement) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, ((androidx.compose.foundation.FocusableElement) p0).getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.getHighResolutionOutputSizeshNQ4ISI;
        if (mutableInteractionSource != null) {
            return mutableInteractionSource.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusable");
        inspectorInfo.getProperties().set("enabled", java.lang.Boolean.TRUE);
        inspectorInfo.getProperties().set("interactionSource", this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
