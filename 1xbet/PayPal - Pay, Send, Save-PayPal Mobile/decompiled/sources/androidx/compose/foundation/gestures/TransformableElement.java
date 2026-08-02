package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u000f*\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\r\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 "}, d2 = {"Landroidx/compose/foundation/gestures/TransformableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/gestures/TransformableNode;", "Landroidx/compose/foundation/gestures/TransformableState;", "p0", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "p1", "p2", "p3", "<init>", "(Landroidx/compose/foundation/gestures/TransformableState;Lkotlin/jvm/functions/Function1;ZZ)V", "getHighSpeedVideoSizes", "()Landroidx/compose/foundation/gestures/TransformableNode;", "", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/foundation/gestures/TransformableNode;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/gestures/TransformableState;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TransformableElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.gestures.TransformableNode> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.TransformableState getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final boolean Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public TransformableElement(androidx.compose.foundation.gestures.TransformableState transformableState, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, java.lang.Boolean> function1, boolean z, boolean z2) {
        this.getHighSpeedVideoSizes = transformableState;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoFpsRanges = z;
        this.Camera2StreamConfigurationMap = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.gestures.TransformableNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.gestures.TransformableNode(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.foundation.gestures.TransformableNode p0) {
        p0.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || getClass() != p0.getClass()) {
            return false;
        }
        androidx.compose.foundation.gestures.TransformableElement transformableElement = (androidx.compose.foundation.gestures.TransformableElement) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, transformableElement.getHighSpeedVideoSizes) && this.getHighResolutionOutputSizeshNQ4ISI == transformableElement.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoFpsRanges == transformableElement.getHighSpeedVideoFpsRanges && this.Camera2StreamConfigurationMap == transformableElement.Camera2StreamConfigurationMap;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int hashCode = this.getHighSpeedVideoSizes.hashCode();
        return (((((hashCode * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode()) * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRanges)) * 31) + java.lang.Boolean.hashCode(this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("transformable");
        inspectorInfo.getProperties().set("state", this.getHighSpeedVideoSizes);
        inspectorInfo.getProperties().set("canPan", this.getHighResolutionOutputSizeshNQ4ISI);
        inspectorInfo.getProperties().set("enabled", java.lang.Boolean.valueOf(this.Camera2StreamConfigurationMap));
        inspectorInfo.getProperties().set("lockRotationOnZoomPan", java.lang.Boolean.valueOf(this.getHighSpeedVideoFpsRanges));
    }
}
