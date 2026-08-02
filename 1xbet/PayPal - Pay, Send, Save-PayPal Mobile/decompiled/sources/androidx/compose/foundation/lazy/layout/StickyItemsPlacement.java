package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b`\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015J'\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJU\u0010\u0013\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "", "", "firstVisibleItemIndex", "lastVisibleItemIndex", "Landroidx/collection/IntList;", "stickyItems", "getStickingIndices", "(IILandroidx/collection/IntList;)Landroidx/collection/IntList;", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "visibleStickyItems", "itemIndex", "itemSize", "itemOffset", "beforeContentPadding", "afterContentPadding", "layoutWidth", "layoutHeight", "calculateStickingItemOffset", "(Ljava/util/List;IIIIIII)I", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface StickyItemsPlacement {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.lazy.layout.StickyItemsPlacement.Companion INSTANCE = androidx.compose.foundation.lazy.layout.StickyItemsPlacement.Companion.getHighSpeedVideoSizes;

    int calculateStickingItemOffset(java.util.List<? extends androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem> visibleStickyItems, int itemIndex, int itemSize, int itemOffset, int beforeContentPadding, int afterContentPadding, int layoutWidth, int layoutHeight);

    androidx.collection.IntList getStickingIndices(int firstVisibleItemIndex, int lastVisibleItemIndex, androidx.collection.IntList stickyItems);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "StickToTopPlacement", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "getStickToTopPlacement", "()Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.foundation.lazy.layout.StickyItemsPlacement.Companion getHighSpeedVideoSizes = new androidx.compose.foundation.lazy.layout.StickyItemsPlacement.Companion();
        private static final androidx.compose.foundation.lazy.layout.StickyItemsPlacement StickToTopPlacement = new androidx.compose.foundation.lazy.layout.StickyItemsPlacement() { // from class: androidx.compose.foundation.lazy.layout.StickyItemsPlacement$Companion$StickToTopPlacement$1
            @Override // androidx.compose.foundation.lazy.layout.StickyItemsPlacement
            public final int calculateStickingItemOffset(java.util.List<? extends androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem> visibleStickyItems, int itemIndex, int itemSize, int itemOffset, int beforeContentPadding, int afterContentPadding, int layoutWidth, int layoutHeight) {
                androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem lazyLayoutMeasuredItem;
                int size = visibleStickyItems.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        lazyLayoutMeasuredItem = null;
                        break;
                    }
                    lazyLayoutMeasuredItem = visibleStickyItems.get(i);
                    if (lazyLayoutMeasuredItem.getIndex() != itemIndex) {
                        break;
                    }
                    i++;
                }
                androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem lazyLayoutMeasuredItem2 = lazyLayoutMeasuredItem;
                int highSpeedVideoFpsRangesFor = lazyLayoutMeasuredItem2 != null ? androidx.compose.foundation.lazy.layout.LazyLayoutStickyItemsKt.getHighSpeedVideoFpsRangesFor(lazyLayoutMeasuredItem2) : Integer.MIN_VALUE;
                int max = itemOffset == Integer.MIN_VALUE ? -beforeContentPadding : java.lang.Math.max(-beforeContentPadding, itemOffset);
                return highSpeedVideoFpsRangesFor != Integer.MIN_VALUE ? java.lang.Math.min(max, highSpeedVideoFpsRangesFor - itemSize) : max;
            }

            @Override // androidx.compose.foundation.lazy.layout.StickyItemsPlacement
            public final androidx.collection.IntList getStickingIndices(int firstVisibleItemIndex, int lastVisibleItemIndex, androidx.collection.IntList stickyItems) {
                if (lastVisibleItemIndex - firstVisibleItemIndex < 0 || stickyItems._size == 0) {
                    return androidx.collection.IntListKt.emptyIntList();
                }
                kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, stickyItems._size);
                int first = until.getFirst();
                int last = until.getLast();
                int i = -1;
                if (first <= last) {
                    while (stickyItems.get(first) <= firstVisibleItemIndex) {
                        i = stickyItems.get(first);
                        if (first == last) {
                            break;
                        }
                        first++;
                    }
                }
                if (i == -1) {
                    return androidx.collection.IntListKt.emptyIntList();
                }
                return androidx.collection.IntListKt.intListOf(i);
            }
        };

        private Companion() {
        }

        public final androidx.compose.foundation.lazy.layout.StickyItemsPlacement getStickToTopPlacement() {
            return StickToTopPlacement;
        }
    }
}
