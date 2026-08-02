package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"$\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00000\nj\b\u0012\u0004\u0012\u00020\u0000`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "T", "", "firstVisibleIndex", "lastVisibleIndex", "", "positionedItems", "stickingItems", "updatedVisibleItems", "(IILjava/util/List;Ljava/util/List;)Ljava/util/List;", "Ljava/util/Comparator;", "Lkotlin/getOutputStallDuration;", "Camera2StreamConfigurationMap", "Ljava/util/Comparator;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyLayoutMeasuredItemKt {
    private static final java.util.Comparator<androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem> Camera2StreamConfigurationMap = new java.util.Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemKt$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            int highResolutionOutputSizeshNQ4ISI;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemKt.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) obj, (androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) obj2);
            return highResolutionOutputSizeshNQ4ISI;
        }
    };

    public static final <T extends androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem> java.util.List<T> updatedVisibleItems(int i, int i2, java.util.List<? extends T> list, java.util.List<? extends T> list2) {
        if (list.isEmpty()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<T> mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) list2);
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            T t = list.get(i3);
            int index = t.getIndex();
            if (i <= index && index <= i2) {
                mutableList.add(t);
            }
        }
        kotlin.collections.CollectionsKt.sortWith(mutableList, Camera2StreamConfigurationMap);
        return mutableList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem lazyLayoutMeasuredItem, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem lazyLayoutMeasuredItem2) {
        return kotlin.jvm.internal.Intrinsics.compare(lazyLayoutMeasuredItem.getIndex(), lazyLayoutMeasuredItem2.getIndex());
    }
}
