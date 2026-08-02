package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\n*\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0004\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\u0006\n\u0004\b \u0010\""}, d2 = {"Landroidx/compose/ui/layout/OnFirstVisibleElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/OnFirstVisibleNode;", "", "p0", "", "p1", "Landroidx/compose/ui/layout/LayoutBoundsHolder;", "p2", "Lkotlin/Function0;", "", "p3", "<init>", "(JFLandroidx/compose/ui/layout/LayoutBoundsHolder;Lkotlin/jvm/functions/Function0;)V", "getHighResolutionOutputSizeshNQ4ISI", "()Landroidx/compose/ui/layout/OnFirstVisibleNode;", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/layout/OnFirstVisibleNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", "J", "Camera2StreamConfigurationMap", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/layout/LayoutBoundsHolder;", "Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OnFirstVisibleElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.layout.OnFirstVisibleNode> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.layout.LayoutBoundsHolder getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;

    public OnFirstVisibleElement(long j, float f, androidx.compose.ui.layout.LayoutBoundsHolder layoutBoundsHolder, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoFpsRanges = f;
        this.getHighSpeedVideoSizes = layoutBoundsHolder;
        this.Camera2StreamConfigurationMap = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.layout.OnFirstVisibleNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.ui.layout.OnFirstVisibleNode(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.ui.layout.OnFirstVisibleNode p0) {
        p0.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI);
        p0.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges);
        p0.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap);
        p0.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes);
        p0.Camera2StreamConfigurationMap();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onFirstVisible");
        inspectorInfo.getProperties().set("minDurationMs", java.lang.Long.valueOf(this.getHighResolutionOutputSizeshNQ4ISI));
        inspectorInfo.getProperties().set("minFractionVisible", java.lang.Float.valueOf(this.getHighSpeedVideoFpsRanges));
        inspectorInfo.getProperties().set("viewportBounds", this.getHighSpeedVideoSizes);
        inspectorInfo.getProperties().set(com.sun.jna.Callback.METHOD_NAME, this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 != null && getClass() == p0.getClass()) {
            androidx.compose.ui.layout.OnFirstVisibleElement onFirstVisibleElement = (androidx.compose.ui.layout.OnFirstVisibleElement) p0;
            return this.getHighResolutionOutputSizeshNQ4ISI == onFirstVisibleElement.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoFpsRanges == onFirstVisibleElement.getHighSpeedVideoFpsRanges && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, onFirstVisibleElement.getHighSpeedVideoSizes) && this.Camera2StreamConfigurationMap == onFirstVisibleElement.Camera2StreamConfigurationMap;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
        int hashCode2 = java.lang.Float.hashCode(this.getHighSpeedVideoFpsRanges);
        androidx.compose.ui.layout.LayoutBoundsHolder layoutBoundsHolder = this.getHighSpeedVideoSizes;
        return (((((hashCode * 31) + hashCode2) * 31) + (layoutBoundsHolder != null ? layoutBoundsHolder.hashCode() : 0)) * 31) + this.Camera2StreamConfigurationMap.hashCode();
    }
}
