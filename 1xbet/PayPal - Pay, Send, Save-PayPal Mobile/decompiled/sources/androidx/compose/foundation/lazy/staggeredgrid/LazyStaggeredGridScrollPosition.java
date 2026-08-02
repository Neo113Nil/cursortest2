package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\"\u0010\b\u001a\u001e\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\"R0\u0010%\u001a\u001e\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b'\u0010(R+\u0010\u0018\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b0\u0010(R+\u0010\u0019\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010+\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u00105R\u0018\u0010#\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u00109\u001a\u0002088\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "", "", "initialIndices", "initialOffsets", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "fillIndices", "<init>", "([I[ILkotlin/jvm/functions/Function2;)V", "p0", "getHighSpeedVideoFpsRanges", "([I)I", "p1", "([I[I)I", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measureResult", "", "updateFromMeasureResult", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;)V", "scrollOffsets", "updateScrollOffset", "([I)V", "index", "scrollOffset", "requestPositionAndForgetLastKnownKey", "(II)V", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "indices", "updateScrollPositionIfTheFirstItemWasMoved", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;[I)[I", "getHighSpeedVideoFpsRangesFor", "([I[I)V", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function2;", "getHighResolutionOutputSizeshNQ4ISI", "[I", "getIndices", "()[I", "<set-?>", "index$delegate", "Landroidx/compose/runtime/MutableIntState;", "getIndex", "()I", "setIndex", "(I)V", "getScrollOffsets", "scrollOffset$delegate", "getScrollOffset", "setScrollOffset", "", "Z", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "nearestRangeState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getNearestRangeState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyStaggeredGridScrollPosition {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Integer, int[]> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.lang.Object Camera2StreamConfigurationMap;

    /* renamed from: index$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState index;
    private int[] indices;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState nearestRangeState;

    /* renamed from: scrollOffset$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState scrollOffset;
    private int[] scrollOffsets;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridScrollPosition(int[] iArr, int[] iArr2, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, int[]> function2) {
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
        this.indices = iArr;
        this.index = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(getHighSpeedVideoFpsRanges(iArr));
        this.scrollOffsets = iArr2;
        this.scrollOffset = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(getHighSpeedVideoFpsRanges(iArr, iArr2));
        java.lang.Integer minOrNull = kotlin.collections.ArraysKt.minOrNull(iArr);
        this.nearestRangeState = new androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState(minOrNull != null ? minOrNull.intValue() : 0, 90, 200);
    }

    public final int[] getIndices() {
        return this.indices;
    }

    private final void setIndex(int i) {
        this.index.setIntValue(i);
    }

    public final int getIndex() {
        return this.index.getIntValue();
    }

    public final int[] getScrollOffsets() {
        return this.scrollOffsets;
    }

    private final void setScrollOffset(int i) {
        this.scrollOffset.setIntValue(i);
    }

    public final int getScrollOffset() {
        return this.scrollOffset.getIntValue();
    }

    private static int getHighSpeedVideoFpsRanges(int[] p0, int[] p1) {
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(p0);
        int length = p1.length;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < length; i2++) {
            if (p0[i2] == highSpeedVideoFpsRanges) {
                i = java.lang.Math.min(i, p1[i2]);
            }
        }
        if (i == Integer.MAX_VALUE) {
            return 0;
        }
        return i;
    }

    public final androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final void updateFromMeasureResult(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult measureResult) {
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem;
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(measureResult.getFirstVisibleItemIndices());
        java.util.List<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem> visibleItemsInfo = measureResult.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                lazyStaggeredGridMeasuredItem = null;
                break;
            }
            lazyStaggeredGridMeasuredItem = visibleItemsInfo.get(i);
            if (lazyStaggeredGridMeasuredItem.getIndex() == highSpeedVideoFpsRanges) {
                break;
            } else {
                i++;
            }
        }
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = lazyStaggeredGridMeasuredItem;
        this.Camera2StreamConfigurationMap = lazyStaggeredGridMeasuredItem2 != null ? lazyStaggeredGridMeasuredItem2.getKey() : null;
        this.nearestRangeState.update(highSpeedVideoFpsRanges);
        if (this.getHighSpeedVideoSizes || measureResult.getTotalItemsCount() > 0) {
            this.getHighSpeedVideoSizes = true;
            androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
            androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                getHighSpeedVideoFpsRangesFor(measureResult.getFirstVisibleItemIndices(), measureResult.getFirstVisibleItemScrollOffsets());
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } finally {
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            }
        }
    }

    public final void updateScrollOffset(int[] scrollOffsets) {
        this.scrollOffsets = scrollOffsets;
        setScrollOffset(getHighSpeedVideoFpsRanges(this.indices, scrollOffsets));
    }

    public final void requestPositionAndForgetLastKnownKey(int index, int scrollOffset) {
        int[] invoke = this.getHighResolutionOutputSizeshNQ4ISI.invoke(java.lang.Integer.valueOf(index), java.lang.Integer.valueOf(this.indices.length));
        int length = invoke.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = scrollOffset;
        }
        getHighSpeedVideoFpsRangesFor(invoke, iArr);
        this.nearestRangeState.update(index);
        this.Camera2StreamConfigurationMap = null;
    }

    public final int[] updateScrollPositionIfTheFirstItemWasMoved(androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider itemProvider, int[] indices) {
        java.lang.Object obj = this.Camera2StreamConfigurationMap;
        java.lang.Integer orNull = kotlin.collections.ArraysKt.getOrNull(indices, 0);
        int findIndexByKey = androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt.findIndexByKey(itemProvider, obj, orNull != null ? orNull.intValue() : 0);
        if (kotlin.collections.ArraysKt.contains(indices, findIndexByKey)) {
            return indices;
        }
        this.nearestRangeState.update(findIndexByKey);
        androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
        androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            int[] invoke = this.getHighResolutionOutputSizeshNQ4ISI.invoke(java.lang.Integer.valueOf(findIndexByKey), java.lang.Integer.valueOf(indices.length));
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            this.indices = invoke;
            setIndex(getHighSpeedVideoFpsRanges(invoke));
            return invoke;
        } catch (java.lang.Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(int[] p0, int[] p1) {
        this.indices = p0;
        setIndex(getHighSpeedVideoFpsRanges(p0));
        this.scrollOffsets = p1;
        setScrollOffset(getHighSpeedVideoFpsRanges(p0, p1));
    }

    private static int getHighSpeedVideoFpsRanges(int[] p0) {
        int i = Integer.MAX_VALUE;
        for (int i2 : p0) {
            if (i2 <= 0) {
                return 0;
            }
            if (i > i2) {
                i = i2;
            }
        }
        if (i == Integer.MAX_VALUE) {
            return 0;
        }
        return i;
    }
}
