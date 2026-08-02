package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003\"\u0018\u0010\b\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "", "visibleLinesAverageMainAxisSize", "(Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)I", "calculateContentSize", "getSingleAxisViewportSize", "singleAxisViewportSize", "getFirstVisibleItemLineIndex", "firstVisibleItemLineIndex"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyGridLayoutInfoKt {
    public static final int visibleLinesAverageMainAxisSize(androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo lazyGridLayoutInfo) {
        long size;
        boolean z = lazyGridLayoutInfo.getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical;
        java.util.List<androidx.compose.foundation.lazy.grid.LazyGridItemInfo> visibleItemsInfo = lazyGridLayoutInfo.getVisibleItemsInfo();
        if (visibleItemsInfo.isEmpty()) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < visibleItemsInfo.size()) {
            int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(z, lazyGridLayoutInfo, i);
            if (Camera2StreamConfigurationMap == -1) {
                i++;
            } else {
                int i4 = 0;
                while (i < visibleItemsInfo.size() && Camera2StreamConfigurationMap(z, lazyGridLayoutInfo, i) == Camera2StreamConfigurationMap) {
                    if (z) {
                        size = visibleItemsInfo.get(i).getSize() & 4294967295L;
                    } else {
                        size = visibleItemsInfo.get(i).getSize() >> 32;
                    }
                    i4 = java.lang.Math.max(i4, (int) size);
                    i++;
                }
                i2 += i4;
                i3++;
            }
        }
        return (i2 / i3) + lazyGridLayoutInfo.getMainAxisItemSpacing();
    }

    private static final int Camera2StreamConfigurationMap(boolean z, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo lazyGridLayoutInfo, int i) {
        return z ? lazyGridLayoutInfo.getVisibleItemsInfo().get(i).getRow() : lazyGridLayoutInfo.getVisibleItemsInfo().get(i).getColumn();
    }

    public static final int getSingleAxisViewportSize(androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo lazyGridLayoutInfo) {
        return (int) (lazyGridLayoutInfo.getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical ? lazyGridLayoutInfo.mo1826getViewportSizeYbymL2g() & 4294967295L : lazyGridLayoutInfo.mo1826getViewportSizeYbymL2g() >> 32);
    }

    public static final int getFirstVisibleItemLineIndex(androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo lazyGridLayoutInfo) {
        java.util.List<androidx.compose.foundation.lazy.grid.LazyGridItemInfo> visibleItemsInfo = lazyGridLayoutInfo.getVisibleItemsInfo();
        if (visibleItemsInfo.isEmpty()) {
            return 0;
        }
        if (lazyGridLayoutInfo.getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical) {
            return ((androidx.compose.foundation.lazy.grid.LazyGridItemInfo) kotlin.collections.CollectionsKt.first((java.util.List) visibleItemsInfo)).getRow();
        }
        return ((androidx.compose.foundation.lazy.grid.LazyGridItemInfo) kotlin.collections.CollectionsKt.first((java.util.List) visibleItemsInfo)).getColumn();
    }

    public static final int calculateContentSize(androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo lazyGridLayoutInfo) {
        int beforeContentPadding = lazyGridLayoutInfo.getBeforeContentPadding() + lazyGridLayoutInfo.getAfterContentPadding();
        if (lazyGridLayoutInfo.getTotalItemsCount() == 0) {
            return beforeContentPadding;
        }
        int ceil = (int) java.lang.Math.ceil(lazyGridLayoutInfo.getTotalItemsCount() / lazyGridLayoutInfo.getMaxSpan());
        return ((visibleLinesAverageMainAxisSize(lazyGridLayoutInfo) - lazyGridLayoutInfo.getMainAxisItemSpacing()) * ceil) + ((ceil - 1) * lazyGridLayoutInfo.getMainAxisItemSpacing()) + beforeContentPadding;
    }
}
