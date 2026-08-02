package androidx.compose.foundation.lazy;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\f\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScrollScopeKt$LazyLayoutScrollScope$1;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "index", "offset", "", "snapToItem", "(II)V", "targetIndex", "targetOffset", "calculateDistanceTo", "(II)I", "", "pixels", "scrollBy", "(F)F", "getFirstVisibleItemIndex", "()I", "firstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "getLastVisibleItemIndex", "lastVisibleItemIndex", "getItemCount", "itemCount"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyListScrollScopeKt$LazyLayoutScrollScope$1 implements androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope, androidx.compose.foundation.gestures.ScrollScope {
    final /* synthetic */ androidx.compose.foundation.lazy.LazyListState getHighResolutionOutputSizeshNQ4ISI;
    private final /* synthetic */ androidx.compose.foundation.gestures.ScrollScope getHighSpeedVideoSizes;

    LazyListScrollScopeKt$LazyLayoutScrollScope$1(androidx.compose.foundation.gestures.ScrollScope scrollScope, androidx.compose.foundation.lazy.LazyListState lazyListState) {
        this.getHighResolutionOutputSizeshNQ4ISI = lazyListState;
        this.getHighSpeedVideoSizes = scrollScope;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final int getFirstVisibleItemIndex() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getFirstVisibleItemIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final int getFirstVisibleItemScrollOffset() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getFirstVisibleItemScrollOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final int getLastVisibleItemIndex() {
        androidx.compose.foundation.lazy.LazyListItemInfo lazyListItemInfo = (androidx.compose.foundation.lazy.LazyListItemInfo) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) this.getHighResolutionOutputSizeshNQ4ISI.getLayoutInfo().getVisibleItemsInfo());
        if (lazyListItemInfo != null) {
            return lazyListItemInfo.getIndex();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final int getItemCount() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getLayoutInfo().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final void snapToItem(int index, int offset) {
        this.getHighResolutionOutputSizeshNQ4ISI.snapToItemIndexInternal$foundation(index, offset, true);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final int calculateDistanceTo(int targetIndex, int targetOffset) {
        androidx.compose.foundation.lazy.LazyListItemInfo lazyListItemInfo;
        androidx.compose.foundation.lazy.LazyListLayoutInfo layoutInfo = this.getHighResolutionOutputSizeshNQ4ISI.getLayoutInfo();
        int i = 0;
        if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
            return 0;
        }
        int firstVisibleItemIndex = getFirstVisibleItemIndex();
        if (targetIndex > getLastVisibleItemIndex() || firstVisibleItemIndex > targetIndex) {
            i = (androidx.compose.foundation.lazy.LazyListLayoutInfoKt.visibleItemsAverageSize(layoutInfo) * (targetIndex - getFirstVisibleItemIndex())) - getFirstVisibleItemScrollOffset();
        } else {
            java.util.List<androidx.compose.foundation.lazy.LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
            int size = visibleItemsInfo.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    lazyListItemInfo = null;
                    break;
                }
                lazyListItemInfo = visibleItemsInfo.get(i2);
                if (lazyListItemInfo.getIndex() == targetIndex) {
                    break;
                }
                i2++;
            }
            androidx.compose.foundation.lazy.LazyListItemInfo lazyListItemInfo2 = lazyListItemInfo;
            if (lazyListItemInfo2 != null) {
                i = lazyListItemInfo2.getOffset();
            }
        }
        return i + targetOffset;
    }

    @Override // androidx.compose.foundation.gestures.ScrollScope
    public final float scrollBy(float pixels) {
        return this.getHighSpeedVideoSizes.scrollBy(pixels);
    }
}
