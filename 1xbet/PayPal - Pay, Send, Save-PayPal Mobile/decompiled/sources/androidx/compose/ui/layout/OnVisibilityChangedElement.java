package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u000b*\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001b\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\""}, d2 = {"Landroidx/compose/ui/layout/OnVisibilityChangedElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/OnVisibilityChangedNode;", "", "p0", "", "p1", "Landroidx/compose/ui/layout/LayoutBoundsHolder;", "p2", "Lkotlin/Function1;", "", "", "p3", "<init>", "(JFLandroidx/compose/ui/layout/LayoutBoundsHolder;Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoSizes", "()Landroidx/compose/ui/layout/OnVisibilityChangedNode;", "(Landroidx/compose/ui/layout/OnVisibilityChangedNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRanges", "J", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/layout/LayoutBoundsHolder;", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OnVisibilityChangedElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.layout.OnVisibilityChangedNode> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final long Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.ui.layout.LayoutBoundsHolder getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public OnVisibilityChangedElement(long j, float f, androidx.compose.ui.layout.LayoutBoundsHolder layoutBoundsHolder, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1) {
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoFpsRanges = f;
        this.getHighResolutionOutputSizeshNQ4ISI = layoutBoundsHolder;
        this.getHighSpeedVideoSizes = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.layout.OnVisibilityChangedNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.ui.layout.OnVisibilityChangedNode(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.ui.layout.OnVisibilityChangedNode p0) {
        p0.setMinDurationMs(this.Camera2StreamConfigurationMap);
        p0.setMinFractionVisible(this.getHighSpeedVideoFpsRanges);
        p0.setCallback(this.getHighSpeedVideoSizes);
        p0.setViewportBounds(this.getHighResolutionOutputSizeshNQ4ISI);
        p0.forceUpdate();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onViewportVisibilityChanged");
        inspectorInfo.getProperties().set("minDurationMs", java.lang.Long.valueOf(this.Camera2StreamConfigurationMap));
        inspectorInfo.getProperties().set("minFractionVisible", java.lang.Float.valueOf(this.getHighSpeedVideoFpsRanges));
        inspectorInfo.getProperties().set("viewportRef", this.getHighResolutionOutputSizeshNQ4ISI);
        inspectorInfo.getProperties().set(com.sun.jna.Callback.METHOD_NAME, this.getHighSpeedVideoSizes);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 != null && getClass() == p0.getClass()) {
            androidx.compose.ui.layout.OnVisibilityChangedElement onVisibilityChangedElement = (androidx.compose.ui.layout.OnVisibilityChangedElement) p0;
            return this.Camera2StreamConfigurationMap == onVisibilityChangedElement.Camera2StreamConfigurationMap && this.getHighSpeedVideoFpsRanges == onVisibilityChangedElement.getHighSpeedVideoFpsRanges && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, onVisibilityChangedElement.getHighResolutionOutputSizeshNQ4ISI) && this.getHighSpeedVideoSizes == onVisibilityChangedElement.getHighSpeedVideoSizes;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.Camera2StreamConfigurationMap);
        int hashCode2 = java.lang.Float.hashCode(this.getHighSpeedVideoFpsRanges);
        androidx.compose.ui.layout.LayoutBoundsHolder layoutBoundsHolder = this.getHighResolutionOutputSizeshNQ4ISI;
        return (((((hashCode * 31) + hashCode2) * 31) + (layoutBoundsHolder != null ? layoutBoundsHolder.hashCode() : 0)) * 31) + this.getHighSpeedVideoSizes.hashCode();
    }
}
