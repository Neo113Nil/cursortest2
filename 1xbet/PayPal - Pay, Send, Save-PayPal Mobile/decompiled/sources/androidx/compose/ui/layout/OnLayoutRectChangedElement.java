package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\b*\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001d\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\u0006\n\u0004\b\f\u0010\u001d"}, d2 = {"Landroidx/compose/ui/layout/OnLayoutRectChangedElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/OnLayoutRectChangedNode;", "", "p0", "p1", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "", "p2", "<init>", "(JJLkotlin/jvm/functions/Function1;)V", "getHighResolutionOutputSizeshNQ4ISI", "()Landroidx/compose/ui/layout/OnLayoutRectChangedNode;", "(Landroidx/compose/ui/layout/OnLayoutRectChangedNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", "J", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OnLayoutRectChangedElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.layout.OnLayoutRectChangedNode> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.spatial.RelativeLayoutBounds, kotlin.Unit> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final long getHighSpeedVideoSizes;
    private final long getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public OnLayoutRectChangedElement(long j, long j2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.spatial.RelativeLayoutBounds, kotlin.Unit> function1) {
        this.getHighSpeedVideoFpsRangesFor = j;
        this.getHighSpeedVideoSizes = j2;
        this.Camera2StreamConfigurationMap = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.layout.OnLayoutRectChangedNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.ui.layout.OnLayoutRectChangedNode(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.ui.layout.OnLayoutRectChangedNode p0) {
        p0.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor);
        p0.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes);
        p0.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap);
        p0.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onRectChanged");
        inspectorInfo.getProperties().set("throttleMillis", java.lang.Long.valueOf(this.getHighSpeedVideoFpsRangesFor));
        inspectorInfo.getProperties().set("debounceMillis", java.lang.Long.valueOf(this.getHighSpeedVideoSizes));
        inspectorInfo.getProperties().set(com.sun.jna.Callback.METHOD_NAME, this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.ui.layout.OnLayoutRectChangedElement)) {
            return false;
        }
        androidx.compose.ui.layout.OnLayoutRectChangedElement onLayoutRectChangedElement = (androidx.compose.ui.layout.OnLayoutRectChangedElement) p0;
        return this.getHighSpeedVideoFpsRangesFor == onLayoutRectChangedElement.getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoSizes == onLayoutRectChangedElement.getHighSpeedVideoSizes && this.Camera2StreamConfigurationMap == onLayoutRectChangedElement.Camera2StreamConfigurationMap;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (((java.lang.Long.hashCode(this.getHighSpeedVideoFpsRangesFor) * 31) + java.lang.Long.hashCode(this.getHighSpeedVideoSizes)) * 31) + this.Camera2StreamConfigurationMap.hashCode();
    }
}
