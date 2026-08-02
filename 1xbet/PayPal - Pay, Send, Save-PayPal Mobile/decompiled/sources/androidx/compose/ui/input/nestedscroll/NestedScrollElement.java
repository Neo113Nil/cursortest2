package androidx.compose.ui.input.nestedscroll;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0004\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u000b*\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u0006\n\u0004\b\f\u0010\u001b"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "p0", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "p1", "<init>", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", "getHighResolutionOutputSizeshNQ4ISI", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;)V", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "getHighSpeedVideoSizes", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class NestedScrollElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.input.nestedscroll.NestedScrollNode> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.ui.input.nestedscroll.NestedScrollConnection getHighSpeedVideoFpsRanges;

    public NestedScrollElement(androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher) {
        this.getHighSpeedVideoFpsRanges = nestedScrollConnection;
        this.getHighResolutionOutputSizeshNQ4ISI = nestedScrollDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.input.nestedscroll.NestedScrollNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.ui.input.nestedscroll.NestedScrollNode(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.ui.input.nestedscroll.NestedScrollNode p0) {
        p0.updateNode$ui(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int hashCode = this.getHighSpeedVideoFpsRanges.hashCode();
        androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher = this.getHighResolutionOutputSizeshNQ4ISI;
        return (hashCode * 31) + (nestedScrollDispatcher != null ? nestedScrollDispatcher.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollElement)) {
            return false;
        }
        androidx.compose.ui.input.nestedscroll.NestedScrollElement nestedScrollElement = (androidx.compose.ui.input.nestedscroll.NestedScrollElement) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(nestedScrollElement.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(nestedScrollElement.getHighResolutionOutputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("nestedScroll");
        inspectorInfo.getProperties().set("connection", this.getHighSpeedVideoFpsRanges);
        inspectorInfo.getProperties().set("dispatcher", this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
