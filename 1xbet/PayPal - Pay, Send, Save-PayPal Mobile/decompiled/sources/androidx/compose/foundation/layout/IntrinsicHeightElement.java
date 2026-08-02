package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B0\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\t*\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n8\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicHeightElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/IntrinsicHeightNode;", "Landroidx/compose/foundation/layout/IntrinsicSize;", "p0", "", "p1", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "p2", "<init>", "(Landroidx/compose/foundation/layout/IntrinsicSize;ZLkotlin/jvm/functions/Function1;)V", "getHighResolutionOutputSizeshNQ4ISI", "()Landroidx/compose/foundation/layout/IntrinsicHeightNode;", "Camera2StreamConfigurationMap", "(Landroidx/compose/foundation/layout/IntrinsicHeightNode;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/layout/IntrinsicSize;", "getHighSpeedVideoSizes", "Z", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class IntrinsicHeightElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.layout.IntrinsicHeightNode> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.compose.foundation.layout.IntrinsicSize getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public IntrinsicHeightElement(androidx.compose.foundation.layout.IntrinsicSize intrinsicSize, boolean z, kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function1) {
        this.getHighSpeedVideoFpsRangesFor = intrinsicSize;
        this.getHighSpeedVideoSizes = z;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.layout.IntrinsicHeightNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.layout.IntrinsicHeightNode(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.foundation.layout.IntrinsicHeightNode p0) {
        p0.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor);
        p0.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        androidx.compose.foundation.layout.IntrinsicHeightElement intrinsicHeightElement = p0 instanceof androidx.compose.foundation.layout.IntrinsicHeightElement ? (androidx.compose.foundation.layout.IntrinsicHeightElement) p0 : null;
        return intrinsicHeightElement != null && this.getHighSpeedVideoFpsRangesFor == intrinsicHeightElement.getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoSizes == intrinsicHeightElement.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (this.getHighSpeedVideoFpsRangesFor.hashCode() * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoSizes);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        this.getHighResolutionOutputSizeshNQ4ISI.invoke(inspectorInfo);
    }
}
