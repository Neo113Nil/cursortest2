package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B&\u0012\u001d\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR+\u0010\u0010\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u000e\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/foundation/lazy/grid/GridSlotCache;", "Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "Lkotlin/ExtensionFunctionType;", "p0", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "p1", "invoke-0kLqBqw", "(Landroidx/compose/ui/unit/Density;J)Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "invoke", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function2;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "J", "getHighSpeedVideoSizes", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/lazy/grid/LazyGridSlots;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class GridSlotCache implements androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<androidx.compose.ui.unit.Density, androidx.compose.ui.unit.Constraints, androidx.compose.foundation.lazy.grid.LazyGridSlots> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.foundation.lazy.grid.LazyGridSlots getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private long getHighSpeedVideoSizes = androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private float getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public GridSlotCache(kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super androidx.compose.ui.unit.Constraints, androidx.compose.foundation.lazy.grid.LazyGridSlots> function2) {
        this.Camera2StreamConfigurationMap = function2;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider
    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final androidx.compose.foundation.lazy.grid.LazyGridSlots mo1811invoke0kLqBqw(androidx.compose.ui.unit.Density p0, long p1) {
        if (this.getHighSpeedVideoFpsRangesFor != null && androidx.compose.ui.unit.Constraints.m8548equalsimpl0(this.getHighSpeedVideoSizes, p1) && this.getHighResolutionOutputSizeshNQ4ISI == p0.getGetHighResolutionOutputSizeshNQ4ISI()) {
            androidx.compose.foundation.lazy.grid.LazyGridSlots lazyGridSlots = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(lazyGridSlots);
            return lazyGridSlots;
        }
        this.getHighSpeedVideoSizes = p1;
        this.getHighResolutionOutputSizeshNQ4ISI = p0.getGetHighResolutionOutputSizeshNQ4ISI();
        androidx.compose.foundation.lazy.grid.LazyGridSlots invoke = this.Camera2StreamConfigurationMap.invoke(p0, androidx.compose.ui.unit.Constraints.m8542boximpl(p1));
        this.getHighSpeedVideoFpsRangesFor = invoke;
        return invoke;
    }
}
