package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0014\u0010\u0018\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\t"}, d2 = {"Landroidx/compose/foundation/pager/PagerBeyondBoundsState;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "Landroidx/compose/foundation/pager/PagerState;", "state", "", "beyondViewportPageCount", "<init>", "(Landroidx/compose/foundation/pager/PagerState;I)V", "itemsPerViewport", "()I", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/pager/PagerState;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "getItemCount", "itemCount", "", "getHasVisibleItems", "()Z", "hasVisibleItems", "getFirstPlacedIndex", "firstPlacedIndex", "getLastPlacedIndex", "lastPlacedIndex"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PagerBeyondBoundsState implements androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.pager.PagerState Camera2StreamConfigurationMap;

    public PagerBeyondBoundsState(androidx.compose.foundation.pager.PagerState pagerState, int i) {
        this.Camera2StreamConfigurationMap = pagerState;
        this.getHighSpeedVideoSizes = i;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int getItemCount() {
        return this.Camera2StreamConfigurationMap.getPageCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final boolean getHasVisibleItems() {
        return !this.Camera2StreamConfigurationMap.getLayoutInfo().getVisiblePagesInfo().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int getFirstPlacedIndex() {
        return java.lang.Math.max(0, this.Camera2StreamConfigurationMap.getFirstVisiblePage() - this.getHighSpeedVideoSizes);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int getLastPlacedIndex() {
        return java.lang.Math.min(getItemCount() - 1, ((androidx.compose.foundation.pager.PageInfo) kotlin.collections.CollectionsKt.last((java.util.List) this.Camera2StreamConfigurationMap.getLayoutInfo().getVisiblePagesInfo())).getIndex() + this.getHighSpeedVideoSizes);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int itemsPerViewport() {
        if (this.Camera2StreamConfigurationMap.getLayoutInfo().getVisiblePagesInfo().size() == 0) {
            return 0;
        }
        int mainAxisViewportSize = androidx.compose.foundation.pager.PagerLayoutInfoKt.getMainAxisViewportSize(this.Camera2StreamConfigurationMap.getLayoutInfo());
        int pageSize = this.Camera2StreamConfigurationMap.getLayoutInfo().getPageSize() + this.Camera2StreamConfigurationMap.getLayoutInfo().getPageSpacing();
        if (pageSize == 0) {
            return 1;
        }
        return kotlin.ranges.RangesKt.coerceAtLeast(mainAxisViewportSize / pageSize, 1);
    }
}
