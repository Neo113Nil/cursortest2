package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u000f*\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\u0011\u0010\r\u001a\u00020\t8\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010!"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsProviderModifierNode;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "p0", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "p1", "", "p2", "Landroidx/compose/foundation/gestures/Orientation;", "p3", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;ZLandroidx/compose/foundation/gestures/Orientation;)V", "getHighSpeedVideoSizes", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsProviderModifierNode;", "", "Camera2StreamConfigurationMap", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsProviderModifierNode;)V", "", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/gestures/Orientation;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class LazyLayoutBeyondBoundsModifierElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsProviderModifierNode> {
    private final androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.Orientation getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRanges;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
    }

    public LazyLayoutBeyondBoundsModifierElement(androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState, androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo, boolean z, androidx.compose.foundation.gestures.Orientation orientation) {
        this.Camera2StreamConfigurationMap = lazyLayoutBeyondBoundsState;
        this.getHighResolutionOutputSizeshNQ4ISI = lazyLayoutBeyondBoundsInfo;
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighSpeedVideoSizes = orientation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsProviderModifierNode create() {
        return new androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsProviderModifierNode(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsProviderModifierNode p0) {
        p0.update(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int hashCode = this.Camera2StreamConfigurationMap.hashCode();
        return (((((hashCode * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode()) * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRanges)) * 31) + this.getHighSpeedVideoSizes.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierElement) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, lazyLayoutBeyondBoundsModifierElement.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, lazyLayoutBeyondBoundsModifierElement.getHighResolutionOutputSizeshNQ4ISI) && this.getHighSpeedVideoFpsRanges == lazyLayoutBeyondBoundsModifierElement.getHighSpeedVideoFpsRanges && this.getHighSpeedVideoSizes == lazyLayoutBeyondBoundsModifierElement.getHighSpeedVideoSizes;
    }
}
