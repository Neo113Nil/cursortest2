package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\f\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridScrollScopeKt$LazyLayoutScrollScope$1;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "index", "offset", "", "snapToItem", "(II)V", "targetIndex", "targetOffset", "calculateDistanceTo", "(II)I", "", "pixels", "scrollBy", "(F)F", "getFirstVisibleItemIndex", "()I", "firstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "getLastVisibleItemIndex", "lastVisibleItemIndex", "getItemCount", "itemCount"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyGridScrollScopeKt$LazyLayoutScrollScope$1 implements androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope, androidx.compose.foundation.gestures.ScrollScope {
    private final /* synthetic */ androidx.compose.foundation.gestures.ScrollScope getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.lazy.grid.LazyGridState getHighSpeedVideoSizes;

    LazyGridScrollScopeKt$LazyLayoutScrollScope$1(androidx.compose.foundation.gestures.ScrollScope scrollScope, androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState) {
        this.getHighSpeedVideoSizes = lazyGridState;
        this.getHighSpeedVideoFpsRanges = scrollScope;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final int getFirstVisibleItemIndex() {
        return this.getHighSpeedVideoSizes.getFirstVisibleItemIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final int getFirstVisibleItemScrollOffset() {
        return this.getHighSpeedVideoSizes.getFirstVisibleItemScrollOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final int getLastVisibleItemIndex() {
        androidx.compose.foundation.lazy.grid.LazyGridItemInfo lazyGridItemInfo = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) this.getHighSpeedVideoSizes.getLayoutInfo().getVisibleItemsInfo());
        if (lazyGridItemInfo != null) {
            return lazyGridItemInfo.getIndex();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final int getItemCount() {
        return this.getHighSpeedVideoSizes.getLayoutInfo().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final void snapToItem(int index, int offset) {
        this.getHighSpeedVideoSizes.snapToItemIndexInternal$foundation(index, offset, true);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final int calculateDistanceTo(int targetIndex, int targetOffset) {
        java.lang.Integer num;
        androidx.compose.foundation.lazy.grid.LazyGridItemInfo lazyGridItemInfo;
        androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo layoutInfo = this.getHighSpeedVideoSizes.getLayoutInfo();
        if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
            return 0;
        }
        int firstVisibleItemIndex = getFirstVisibleItemIndex();
        if (targetIndex > getLastVisibleItemIndex() || firstVisibleItemIndex > targetIndex) {
            int slotsPerLine$foundation = this.getHighSpeedVideoSizes.getSlotsPerLine$foundation();
            r2 = (androidx.compose.foundation.lazy.grid.LazyGridLayoutInfoKt.visibleLinesAverageMainAxisSize(layoutInfo) * (((targetIndex - getFirstVisibleItemIndex()) + ((slotsPerLine$foundation - 1) * ((targetIndex < getFirstVisibleItemIndex() ? 1 : 0) != 0 ? -1 : 1))) / slotsPerLine$foundation)) - getFirstVisibleItemScrollOffset();
        } else {
            java.util.List<androidx.compose.foundation.lazy.grid.LazyGridItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
            int size = visibleItemsInfo.size();
            int i = 0;
            while (true) {
                num = null;
                if (i >= size) {
                    lazyGridItemInfo = null;
                    break;
                }
                lazyGridItemInfo = visibleItemsInfo.get(i);
                if (lazyGridItemInfo.getIndex() == targetIndex) {
                    break;
                }
                i++;
            }
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo lazyGridItemInfo2 = lazyGridItemInfo;
            if (layoutInfo.getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical) {
                if (lazyGridItemInfo2 != null) {
                    num = java.lang.Integer.valueOf(androidx.compose.ui.unit.IntOffset.m8730getYimpl(lazyGridItemInfo2.getOffset()));
                }
            } else if (lazyGridItemInfo2 != null) {
                num = java.lang.Integer.valueOf(androidx.compose.ui.unit.IntOffset.m8729getXimpl(lazyGridItemInfo2.getOffset()));
            }
            if (num != null) {
                r2 = num.intValue();
            }
        }
        return r2 + targetOffset;
    }

    @Override // androidx.compose.foundation.gestures.ScrollScope
    public final float scrollBy(float pixels) {
        return this.getHighSpeedVideoFpsRanges.scrollBy(pixels);
    }
}
