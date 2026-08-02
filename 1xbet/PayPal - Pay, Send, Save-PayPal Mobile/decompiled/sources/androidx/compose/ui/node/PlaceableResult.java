package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\r\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\b\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/ui/node/PlaceableResult;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/layout/MeasureResult;", "p0", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "p1", "<init>", "(Landroidx/compose/ui/layout/MeasureResult;Landroidx/compose/ui/node/LookaheadCapablePlaceable;)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/layout/MeasureResult;", "Camera2StreamConfigurationMap", "()Landroidx/compose/ui/layout/MeasureResult;", "(Landroidx/compose/ui/layout/MeasureResult;)V", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "getHighSpeedVideoSizes", "", "isValidOwnerScope", "()Z", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PlaceableResult implements androidx.compose.ui.node.OwnerScope {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.layout.MeasureResult getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.node.LookaheadCapablePlaceable getHighSpeedVideoSizes;

    public PlaceableResult(androidx.compose.ui.layout.MeasureResult measureResult, androidx.compose.ui.node.LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.getHighSpeedVideoFpsRanges = measureResult;
        this.getHighSpeedVideoSizes = lookaheadCapablePlaceable;
    }

    /* renamed from: Camera2StreamConfigurationMap, reason: from getter */
    public final androidx.compose.ui.layout.MeasureResult getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
    public final androidx.compose.ui.node.LookaheadCapablePlaceable getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.MeasureResult measureResult) {
        this.getHighSpeedVideoFpsRanges = measureResult;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public final boolean isValidOwnerScope() {
        return this.getHighSpeedVideoSizes.getCoordinates().isAttached();
    }
}
