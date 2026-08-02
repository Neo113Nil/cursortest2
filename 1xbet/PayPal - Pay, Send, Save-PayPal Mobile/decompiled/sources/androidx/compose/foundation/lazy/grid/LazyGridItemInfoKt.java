package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "lineIndex", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;Landroidx/compose/foundation/gestures/Orientation;)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyGridItemInfoKt {
    public static final int lineIndex(androidx.compose.foundation.lazy.grid.LazyGridItemInfo lazyGridItemInfo, androidx.compose.foundation.gestures.Orientation orientation) {
        if (orientation == androidx.compose.foundation.gestures.Orientation.Vertical) {
            return lazyGridItemInfo.getRow();
        }
        return lazyGridItemInfo.getColumn();
    }
}
