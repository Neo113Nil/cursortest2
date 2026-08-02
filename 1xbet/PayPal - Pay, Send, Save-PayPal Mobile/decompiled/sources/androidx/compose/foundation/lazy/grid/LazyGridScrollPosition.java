package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u001d\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0006R+\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u000eR+\u0010\f\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u000eR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010'\u001a\u00020&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;", "", "", "initialIndex", "initialScrollOffset", "<init>", "(II)V", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureResult", "", "updateFromMeasureResult", "(Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;)V", "scrollOffset", "updateScrollOffset", "(I)V", "index", "requestPositionAndForgetLastKnownKey", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "itemProvider", "updateScrollPositionIfTheFirstItemWasMoved", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;I)I", "p0", "p1", "getHighResolutionOutputSizeshNQ4ISI", "<set-?>", "index$delegate", "Landroidx/compose/runtime/MutableIntState;", "getIndex", "()I", "setIndex", "scrollOffset$delegate", "getScrollOffset", "setScrollOffset", "", "Z", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "nearestRangeState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getNearestRangeState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyGridScrollPosition {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: index$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState index;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState nearestRangeState;

    /* renamed from: scrollOffset$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState scrollOffset;

    public LazyGridScrollPosition(int i, int i2) {
        this.index = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(i);
        this.scrollOffset = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(i2);
        this.nearestRangeState = new androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState(i, 90, 200);
    }

    public /* synthetic */ LazyGridScrollPosition(int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    private final void setIndex(int i) {
        this.index.setIntValue(i);
    }

    public final int getIndex() {
        return this.index.getIntValue();
    }

    private final void setScrollOffset(int i) {
        this.scrollOffset.setIntValue(i);
    }

    public final int getScrollOffset() {
        return this.scrollOffset.getIntValue();
    }

    public final androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final void updateFromMeasureResult(androidx.compose.foundation.lazy.grid.LazyGridMeasureResult measureResult) {
        androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] items;
        androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem lazyGridMeasuredItem;
        androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] items2;
        androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem lazyGridMeasuredItem2;
        androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine firstVisibleLine = measureResult.getFirstVisibleLine();
        this.getHighResolutionOutputSizeshNQ4ISI = (firstVisibleLine == null || (items2 = firstVisibleLine.getItems()) == null || (lazyGridMeasuredItem2 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) kotlin.collections.ArraysKt.firstOrNull(items2)) == null) ? null : lazyGridMeasuredItem2.getKey();
        if (this.getHighSpeedVideoFpsRanges || measureResult.getTotalItemsCount() > 0) {
            this.getHighSpeedVideoFpsRanges = true;
            int firstVisibleLineScrollOffset = measureResult.getFirstVisibleLineScrollOffset();
            if (firstVisibleLineScrollOffset < 0.0f) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("scrollOffset should be non-negative (");
                sb.append(firstVisibleLineScrollOffset);
                sb.append(')');
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException(sb.toString());
            }
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine firstVisibleLine2 = measureResult.getFirstVisibleLine();
            int i = 0;
            if (firstVisibleLine2 != null && (items = firstVisibleLine2.getItems()) != null && (lazyGridMeasuredItem = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) kotlin.collections.ArraysKt.firstOrNull(items)) != null) {
                i = lazyGridMeasuredItem.getIndex();
            }
            getHighResolutionOutputSizeshNQ4ISI(i, firstVisibleLineScrollOffset);
        }
    }

    public final void requestPositionAndForgetLastKnownKey(int index, int scrollOffset) {
        getHighResolutionOutputSizeshNQ4ISI(index, scrollOffset);
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved(androidx.compose.foundation.lazy.grid.LazyGridItemProvider itemProvider, int index) {
        int findIndexByKey = androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt.findIndexByKey(itemProvider, this.getHighResolutionOutputSizeshNQ4ISI, index);
        if (index != findIndexByKey) {
            setIndex(findIndexByKey);
            this.nearestRangeState.update(index);
        }
        return findIndexByKey;
    }

    public final void updateScrollOffset(int scrollOffset) {
        if (scrollOffset < 0.0f) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("scrollOffset should be non-negative");
        }
        setScrollOffset(scrollOffset);
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(int p0, int p1) {
        if (p0 < 0.0f) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("Index should be non-negative");
        }
        setIndex(p0);
        this.nearestRangeState.update(p0);
        setScrollOffset(p1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LazyGridScrollPosition() {
        this(r2, r2, 3, null);
        int i = 0;
    }
}
