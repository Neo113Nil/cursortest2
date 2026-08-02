package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0011*\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001e\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0011\u0010!\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u0013\u0010\"\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u0006\n\u0004\b\"\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\u0006\n\u0004\b!\u0010$"}, d2 = {"Landroidx/compose/foundation/gestures/Scrollable2DElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/gestures/Scrollable2DNode;", "Landroidx/compose/foundation/gestures/Scrollable2DState;", "p0", "Landroidx/compose/foundation/OverscrollEffect;", "p1", "", "p2", "Landroidx/compose/foundation/gestures/FlingBehavior;", "p3", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "p4", "<init>", "(Landroidx/compose/foundation/gestures/Scrollable2DState;Landroidx/compose/foundation/OverscrollEffect;ZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "getHighSpeedVideoFpsRangesFor", "()Landroidx/compose/foundation/gestures/Scrollable2DNode;", "", "getHighSpeedVideoSizes", "(Landroidx/compose/foundation/gestures/Scrollable2DNode;)V", "", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "Landroidx/compose/foundation/gestures/Scrollable2DState;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/OverscrollEffect;", "Z", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class Scrollable2DElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.gestures.Scrollable2DNode> {
    private final androidx.compose.foundation.gestures.FlingBehavior Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.interaction.MutableInteractionSource getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.foundation.OverscrollEffect getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.Scrollable2DState getHighSpeedVideoFpsRanges;

    public Scrollable2DElement(androidx.compose.foundation.gestures.Scrollable2DState scrollable2DState, androidx.compose.foundation.OverscrollEffect overscrollEffect, boolean z, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource) {
        this.getHighSpeedVideoFpsRanges = scrollable2DState;
        this.getHighSpeedVideoFpsRangesFor = overscrollEffect;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.Camera2StreamConfigurationMap = flingBehavior;
        this.getHighSpeedVideoSizes = mutableInteractionSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.gestures.Scrollable2DNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.gestures.Scrollable2DNode(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.foundation.gestures.Scrollable2DNode p0) {
        p0.update(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int hashCode = this.getHighSpeedVideoFpsRanges.hashCode();
        androidx.compose.foundation.OverscrollEffect overscrollEffect = this.getHighSpeedVideoFpsRangesFor;
        int hashCode2 = overscrollEffect != null ? overscrollEffect.hashCode() : 0;
        int hashCode3 = java.lang.Boolean.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior = this.Camera2StreamConfigurationMap;
        int hashCode4 = flingBehavior != null ? flingBehavior.hashCode() : 0;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.getHighSpeedVideoSizes;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.gestures.Scrollable2DElement)) {
            return false;
        }
        androidx.compose.foundation.gestures.Scrollable2DElement scrollable2DElement = (androidx.compose.foundation.gestures.Scrollable2DElement) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, scrollable2DElement.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, scrollable2DElement.getHighSpeedVideoFpsRangesFor) && this.getHighResolutionOutputSizeshNQ4ISI == scrollable2DElement.getHighResolutionOutputSizeshNQ4ISI && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, scrollable2DElement.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, scrollable2DElement.getHighSpeedVideoSizes);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("scrollable2D");
        inspectorInfo.getProperties().set("state", this.getHighSpeedVideoFpsRanges);
        inspectorInfo.getProperties().set("overscrollEffect", this.getHighSpeedVideoFpsRangesFor);
        inspectorInfo.getProperties().set("enabled", java.lang.Boolean.valueOf(this.getHighResolutionOutputSizeshNQ4ISI));
        inspectorInfo.getProperties().set("flingBehavior", this.Camera2StreamConfigurationMap);
        inspectorInfo.getProperties().set("interactionSource", this.getHighSpeedVideoSizes);
    }
}
