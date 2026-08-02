package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B&\u0012\u001d\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR+\u0010\u0010\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlotCache;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "Lkotlin/ExtensionFunctionType;", "p0", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "p1", "invoke-0kLqBqw", "(Landroidx/compose/ui/unit/Density;J)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "invoke", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoFpsRanges", "J", "Camera2StreamConfigurationMap", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyStaggeredGridSlotCache implements androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private float getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private long Camera2StreamConfigurationMap = androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<androidx.compose.ui.unit.Density, androidx.compose.ui.unit.Constraints, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridSlotCache(kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super androidx.compose.ui.unit.Constraints, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots> function2) {
        this.getHighSpeedVideoFpsRanges = function2;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider
    /* renamed from: invoke-0kLqBqw */
    public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots mo1881invoke0kLqBqw(androidx.compose.ui.unit.Density p0, long p1) {
        if (this.getHighSpeedVideoFpsRangesFor != null && androidx.compose.ui.unit.Constraints.m8548equalsimpl0(this.Camera2StreamConfigurationMap, p1) && this.getHighResolutionOutputSizeshNQ4ISI == p0.getGetHighResolutionOutputSizeshNQ4ISI()) {
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots lazyStaggeredGridSlots = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(lazyStaggeredGridSlots);
            return lazyStaggeredGridSlots;
        }
        this.Camera2StreamConfigurationMap = p1;
        this.getHighResolutionOutputSizeshNQ4ISI = p0.getGetHighResolutionOutputSizeshNQ4ISI();
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots invoke = this.getHighSpeedVideoFpsRanges.invoke(p0, androidx.compose.ui.unit.Constraints.m8542boximpl(p1));
        this.getHighSpeedVideoFpsRangesFor = invoke;
        return invoke;
    }
}
