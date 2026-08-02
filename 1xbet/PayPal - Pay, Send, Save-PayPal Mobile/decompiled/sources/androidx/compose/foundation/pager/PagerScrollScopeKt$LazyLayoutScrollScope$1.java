package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\f\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012"}, d2 = {"Landroidx/compose/foundation/pager/PagerScrollScopeKt$LazyLayoutScrollScope$1;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "index", "offset", "", "snapToItem", "(II)V", "targetIndex", "targetOffset", "calculateDistanceTo", "(II)I", "", "pixels", "scrollBy", "(F)F", "getFirstVisibleItemIndex", "()I", "firstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "getLastVisibleItemIndex", "lastVisibleItemIndex", "getItemCount", "itemCount"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PagerScrollScopeKt$LazyLayoutScrollScope$1 implements androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope, androidx.compose.foundation.gestures.ScrollScope {
    final /* synthetic */ androidx.compose.foundation.pager.PagerState getHighResolutionOutputSizeshNQ4ISI;
    private final /* synthetic */ androidx.compose.foundation.gestures.ScrollScope getHighSpeedVideoFpsRanges;

    PagerScrollScopeKt$LazyLayoutScrollScope$1(androidx.compose.foundation.gestures.ScrollScope scrollScope, androidx.compose.foundation.pager.PagerState pagerState) {
        this.getHighResolutionOutputSizeshNQ4ISI = pagerState;
        this.getHighSpeedVideoFpsRanges = scrollScope;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final int getFirstVisibleItemIndex() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getFirstVisiblePage();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final int getFirstVisibleItemScrollOffset() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getFirstVisiblePageOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final int getLastVisibleItemIndex() {
        return ((androidx.compose.foundation.pager.PageInfo) kotlin.collections.CollectionsKt.last((java.util.List) this.getHighResolutionOutputSizeshNQ4ISI.getLayoutInfo().getVisiblePagesInfo())).getIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final int getItemCount() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getPageCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final void snapToItem(int index, int offset) {
        this.getHighResolutionOutputSizeshNQ4ISI.snapToItem$foundation(index, offset / this.getHighResolutionOutputSizeshNQ4ISI.getPageSizeWithSpacing$foundation(), true);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final int calculateDistanceTo(int targetIndex, int targetOffset) {
        return (int) (kotlin.ranges.RangesKt.coerceIn(androidx.compose.foundation.pager.PagerScrollPositionKt.currentAbsoluteScrollOffset(this.getHighResolutionOutputSizeshNQ4ISI) + kotlin.math.MathKt.roundToInt((((targetIndex - this.getHighResolutionOutputSizeshNQ4ISI.getCurrentPage()) * this.getHighResolutionOutputSizeshNQ4ISI.getPageSizeWithSpacing$foundation()) - (this.getHighResolutionOutputSizeshNQ4ISI.getCurrentPageOffsetFraction() * this.getHighResolutionOutputSizeshNQ4ISI.getPageSizeWithSpacing$foundation())) + targetOffset), this.getHighResolutionOutputSizeshNQ4ISI.getMinScrollOffset(), this.getHighResolutionOutputSizeshNQ4ISI.getMaxScrollOffset()) - androidx.compose.foundation.pager.PagerScrollPositionKt.currentAbsoluteScrollOffset(this.getHighResolutionOutputSizeshNQ4ISI));
    }

    @Override // androidx.compose.foundation.gestures.ScrollScope
    public final float scrollBy(float pixels) {
        return this.getHighSpeedVideoFpsRanges.scrollBy(pixels);
    }
}
