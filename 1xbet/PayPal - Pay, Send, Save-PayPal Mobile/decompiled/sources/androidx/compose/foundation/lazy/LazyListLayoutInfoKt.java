package androidx.compose.foundation.lazy;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "", "visibleItemsAverageSize", "(Landroidx/compose/foundation/lazy/LazyListLayoutInfo;)I", "calculateContentSize", "getSingleAxisViewportSize", "singleAxisViewportSize"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyListLayoutInfoKt {
    public static final int visibleItemsAverageSize(androidx.compose.foundation.lazy.LazyListLayoutInfo lazyListLayoutInfo) {
        java.util.List<androidx.compose.foundation.lazy.LazyListItemInfo> visibleItemsInfo = lazyListLayoutInfo.getVisibleItemsInfo();
        if (visibleItemsInfo.isEmpty()) {
            return 0;
        }
        int size = visibleItemsInfo.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += visibleItemsInfo.get(i2).getSize();
        }
        return (i / visibleItemsInfo.size()) + lazyListLayoutInfo.getMainAxisItemSpacing();
    }

    public static final int calculateContentSize(androidx.compose.foundation.lazy.LazyListLayoutInfo lazyListLayoutInfo) {
        int beforeContentPadding = lazyListLayoutInfo.getBeforeContentPadding() + lazyListLayoutInfo.getAfterContentPadding();
        if (lazyListLayoutInfo.getTotalItemsCount() == 0) {
            return beforeContentPadding;
        }
        return ((visibleItemsAverageSize(lazyListLayoutInfo) - lazyListLayoutInfo.getMainAxisItemSpacing()) * lazyListLayoutInfo.getTotalItemsCount()) + ((lazyListLayoutInfo.getTotalItemsCount() - 1) * lazyListLayoutInfo.getMainAxisItemSpacing()) + beforeContentPadding;
    }

    public static final int getSingleAxisViewportSize(androidx.compose.foundation.lazy.LazyListLayoutInfo lazyListLayoutInfo) {
        long mo1788getViewportSizeYbymL2g;
        if (lazyListLayoutInfo.getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical) {
            mo1788getViewportSizeYbymL2g = lazyListLayoutInfo.mo1788getViewportSizeYbymL2g() & 4294967295L;
        } else {
            mo1788getViewportSizeYbymL2g = lazyListLayoutInfo.mo1788getViewportSizeYbymL2g() >> 32;
        }
        return (int) mo1788getViewportSizeYbymL2g;
    }
}
