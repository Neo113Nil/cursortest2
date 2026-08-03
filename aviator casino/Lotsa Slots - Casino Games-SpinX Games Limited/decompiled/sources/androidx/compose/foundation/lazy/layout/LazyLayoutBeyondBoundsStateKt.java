package androidx.compose.foundation.lazy.layout;

/* compiled from: LazyLayoutBeyondBoundsState.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\b"}, d2 = {"calculateLazyLayoutPinnedIndices", "", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "pinnedItemList", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsStateKt {
    public static final java.util.List<java.lang.Integer> calculateLazyLayoutPinnedIndices(androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider lazyLayoutItemProvider, androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList lazyLayoutPinnedItemList, androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo) {
        kotlin.ranges.IntRange empty;
        if (!lazyLayoutBeyondBoundsInfo.hasIntervals() && lazyLayoutPinnedItemList.isEmpty()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (lazyLayoutBeyondBoundsInfo.hasIntervals()) {
            empty = new kotlin.ranges.IntRange(lazyLayoutBeyondBoundsInfo.getStart(), java.lang.Math.min(lazyLayoutBeyondBoundsInfo.getEnd(), lazyLayoutItemProvider.getItemCount() - 1));
        } else {
            empty = kotlin.ranges.IntRange.INSTANCE.getEMPTY();
        }
        androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList lazyLayoutPinnedItemList2 = lazyLayoutPinnedItemList;
        int size = lazyLayoutPinnedItemList2.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem pinnedItem = lazyLayoutPinnedItemList2.get(i);
            int findIndexByKey = androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt.findIndexByKey(lazyLayoutItemProvider, pinnedItem.getKey(), pinnedItem.getIndex());
            int first = empty.getFirst();
            if ((findIndexByKey > empty.getLast() || first > findIndexByKey) && findIndexByKey >= 0 && findIndexByKey < lazyLayoutItemProvider.getItemCount()) {
                arrayList.add(java.lang.Integer.valueOf(findIndexByKey));
            }
        }
        int first2 = empty.getFirst();
        int last = empty.getLast();
        if (first2 <= last) {
            while (true) {
                arrayList.add(java.lang.Integer.valueOf(first2));
                if (first2 == last) {
                    break;
                }
                first2++;
            }
        }
        return arrayList;
    }
}
