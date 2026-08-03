package androidx.compose.foundation.lazy;

/* compiled from: LazyListHeaders.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\u001aF\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0000¨\u0006\f"}, d2 = {"findOrComposeLazyListHeader", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "composedVisibleItems", "", "itemProvider", "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "headerIndexes", "", "", "beforeContentPadding", "layoutWidth", "layoutHeight", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyListHeadersKt {
    public static final androidx.compose.foundation.lazy.LazyListMeasuredItem findOrComposeLazyListHeader(java.util.List<androidx.compose.foundation.lazy.LazyListMeasuredItem> list, androidx.compose.foundation.lazy.LazyListMeasuredItemProvider lazyListMeasuredItemProvider, java.util.List<java.lang.Integer> list2, int i, int i2, int i3) {
        int index = ((androidx.compose.foundation.lazy.LazyListMeasuredItem) kotlin.collections.CollectionsKt.first((java.util.List) list)).getIndex();
        int size = list2.size();
        int i4 = 0;
        int i5 = -1;
        int i6 = -1;
        while (i4 < size && list2.get(i4).intValue() <= index) {
            i5 = list2.get(i4).intValue();
            i4++;
            i6 = ((i4 < 0 || i4 > kotlin.collections.CollectionsKt.getLastIndex(list2)) ? -1 : list2.get(i4)).intValue();
        }
        int size2 = list.size();
        int i7 = Integer.MIN_VALUE;
        int i8 = Integer.MIN_VALUE;
        int i9 = -1;
        for (int i10 = 0; i10 < size2; i10++) {
            androidx.compose.foundation.lazy.LazyListMeasuredItem lazyListMeasuredItem = list.get(i10);
            if (lazyListMeasuredItem.getIndex() == i5) {
                i7 = lazyListMeasuredItem.getOffset();
                i9 = i10;
            } else if (lazyListMeasuredItem.getIndex() == i6) {
                i8 = lazyListMeasuredItem.getOffset();
            }
        }
        if (i5 == -1) {
            return null;
        }
        androidx.compose.foundation.lazy.LazyListMeasuredItem andMeasure = lazyListMeasuredItemProvider.getAndMeasure(i5);
        andMeasure.setNonScrollableItem(true);
        int max = i7 != Integer.MIN_VALUE ? java.lang.Math.max(-i, i7) : -i;
        if (i8 != Integer.MIN_VALUE) {
            max = java.lang.Math.min(max, i8 - andMeasure.getSize());
        }
        andMeasure.position(max, i2, i3);
        if (i9 != -1) {
            list.set(i9, andMeasure);
        } else {
            list.add(0, andMeasure);
        }
        return andMeasure;
    }
}
