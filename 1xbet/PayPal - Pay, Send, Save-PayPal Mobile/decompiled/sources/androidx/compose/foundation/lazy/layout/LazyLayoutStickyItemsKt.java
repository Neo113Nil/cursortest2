package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\u001a\u007f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u0018\u0010\u0015\u001a\u00020\u0003*\u00020\u00008CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "T", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "", "firstVisibleItemIndex", "lastVisibleItemIndex", "", "positionedItems", "Landroidx/collection/IntList;", "stickyItems", "beforeContentPadding", "afterContentPadding", "layoutWidth", "layoutHeight", "Lkotlin/Function1;", "getAndMeasure", "", "applyStickyItems", "(Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;IILjava/util/List;Landroidx/collection/IntList;IIIILkotlin/jvm/functions/Function1;)Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I", "getHighSpeedVideoSizes"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyLayoutStickyItemsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long mo1794getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo1794getOffsetBjo55l4(0);
        return lazyLayoutMeasuredItem.isVertical() ? androidx.compose.ui.unit.IntOffset.m8730getYimpl(mo1794getOffsetBjo55l4) : androidx.compose.ui.unit.IntOffset.m8729getXimpl(mo1794getOffsetBjo55l4);
    }

    public static final <T extends androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem> java.util.List<T> applyStickyItems(androidx.compose.foundation.lazy.layout.StickyItemsPlacement stickyItemsPlacement, int i, int i2, java.util.List<T> list, androidx.collection.IntList intList, int i3, int i4, int i5, int i6, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends T> function1) {
        T remove;
        if (stickyItemsPlacement != null) {
            java.util.List<T> list2 = list;
            if (!list2.isEmpty() && intList._size != 0) {
                androidx.collection.IntList stickingIndices = stickyItemsPlacement.getStickingIndices(i, i2, intList);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
                int size = list2.size();
                for (int i7 = 0; i7 < size; i7++) {
                    T t = list.get(i7);
                    if (intList.contains(t.getIndex())) {
                        arrayList2.add(t);
                    }
                }
                java.util.ArrayList arrayList3 = arrayList2;
                int[] iArr = stickingIndices.content;
                int i8 = stickingIndices._size;
                for (int i9 = 0; i9 < i8; i9++) {
                    int i10 = iArr[i9];
                    java.util.Iterator<T> it = list.iterator();
                    int i11 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i11 = -1;
                            break;
                        }
                        if (it.next().getIndex() == i10) {
                            break;
                        }
                        i11++;
                    }
                    if (i11 == -1) {
                        remove = function1.invoke(java.lang.Integer.valueOf(i10));
                    } else {
                        remove = list.remove(i11);
                    }
                    T t2 = remove;
                    int calculateStickingItemOffset = stickyItemsPlacement.calculateStickingItemOffset(arrayList3, i10, t2.getMainAxisSizeWithSpacings(), i11 == -1 ? Integer.MIN_VALUE : getHighSpeedVideoFpsRangesFor(t2), i3, i4, i5, i6);
                    t2.setNonScrollableItem(true);
                    t2.position(calculateStickingItemOffset, 0, i5, i6);
                    arrayList.add(t2);
                }
                return arrayList;
            }
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }
}
