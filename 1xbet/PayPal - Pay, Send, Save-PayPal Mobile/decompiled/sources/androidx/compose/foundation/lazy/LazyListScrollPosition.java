package androidx.compose.foundation.lazy;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u001d\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0006R+\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u000eR+\u0010\f\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u000eR\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010'\u001a\u00020&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScrollPosition;", "", "", "initialIndex", "initialScrollOffset", "<init>", "(II)V", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureResult", "", "updateFromMeasureResult", "(Landroidx/compose/foundation/lazy/LazyListMeasureResult;)V", "scrollOffset", "updateScrollOffset", "(I)V", "index", "requestPositionAndForgetLastKnownKey", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "itemProvider", "updateScrollPositionIfTheFirstItemWasMoved", "(Landroidx/compose/foundation/lazy/LazyListItemProvider;I)I", "p0", "p1", "getHighSpeedVideoFpsRangesFor", "<set-?>", "index$delegate", "Landroidx/compose/runtime/MutableIntState;", "getIndex", "()I", "setIndex", "scrollOffset$delegate", "getScrollOffset", "setScrollOffset", "", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "nearestRangeState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getNearestRangeState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyListScrollPosition {
    public static final int $stable = 8;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.Object getHighSpeedVideoSizes;

    /* renamed from: index$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState index;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState nearestRangeState;

    /* renamed from: scrollOffset$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState scrollOffset;

    public LazyListScrollPosition(int i, int i2) {
        this.index = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(i);
        this.scrollOffset = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(i2);
        this.nearestRangeState = new androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState(i, 30, 100);
    }

    public /* synthetic */ LazyListScrollPosition(int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public final int getIndex() {
        return this.index.getIntValue();
    }

    public final void setIndex(int i) {
        this.index.setIntValue(i);
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

    public final void updateFromMeasureResult(androidx.compose.foundation.lazy.LazyListMeasureResult measureResult) {
        androidx.compose.foundation.lazy.LazyListMeasuredItem firstVisibleItem = measureResult.getFirstVisibleItem();
        this.getHighSpeedVideoSizes = firstVisibleItem != null ? firstVisibleItem.getKey() : null;
        if (this.getHighResolutionOutputSizeshNQ4ISI || measureResult.getTotalItemsCount() > 0) {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            int firstVisibleItemScrollOffset = measureResult.getFirstVisibleItemScrollOffset();
            if (firstVisibleItemScrollOffset < 0.0f) {
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("scrollOffset should be non-negative");
            }
            androidx.compose.foundation.lazy.LazyListMeasuredItem firstVisibleItem2 = measureResult.getFirstVisibleItem();
            getHighSpeedVideoFpsRangesFor(firstVisibleItem2 != null ? firstVisibleItem2.getIndex() : 0, firstVisibleItemScrollOffset);
        }
    }

    public final void requestPositionAndForgetLastKnownKey(int index, int scrollOffset) {
        getHighSpeedVideoFpsRangesFor(index, scrollOffset);
        this.getHighSpeedVideoSizes = null;
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved(androidx.compose.foundation.lazy.LazyListItemProvider itemProvider, int index) {
        int findIndexByKey = androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt.findIndexByKey(itemProvider, this.getHighSpeedVideoSizes, index);
        if (index != findIndexByKey) {
            setIndex(findIndexByKey);
            this.nearestRangeState.update(index);
        }
        return findIndexByKey;
    }

    private final void getHighSpeedVideoFpsRangesFor(int p0, int p1) {
        if (p0 < 0.0f) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Index should be non-negative (");
            sb.append(p0);
            sb.append(')');
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        setIndex(p0);
        this.nearestRangeState.update(p0);
        setScrollOffset(p1);
    }

    public final void updateScrollOffset(int scrollOffset) {
        if (scrollOffset < 0.0f) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("scrollOffset should be non-negative");
        }
        setScrollOffset(scrollOffset);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LazyListScrollPosition() {
        this(r2, r2, 3, null);
        int i = 0;
    }
}
