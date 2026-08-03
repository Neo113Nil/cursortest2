package androidx.compose.foundation.lazy.staggeredgrid;

/* compiled from: LazyStaggeredGridScrollPosition.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00126\u0010\u0005\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\u0010\fJ\u0010\u0010,\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0002H\u0002J\u0018\u0010-\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0002H\u0002J\u0018\u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0002H\u0016J\u0016\u00102\u001a\u0002032\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0007J\u0018\u00104\u001a\u0002032\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0002H\u0002J\u000e\u00105\u001a\u0002032\u0006\u00106\u001a\u000207J\u000e\u00108\u001a\u0002032\u0006\u0010(\u001a\u00020\u0002J\u0018\u00109\u001a\u00020\u00022\u0006\u0010:\u001a\u00020;2\u0006\u0010\u0017\u001a\u00020\u0002H\u0007R>\u0010\u0005\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R+\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R+\u0010$\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0016\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R+\u0010(\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u001d\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001b¨\u0006<"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "", "initialIndices", "initialOffsets", "fillIndices", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "targetIndex", "laneCount", "([I[ILkotlin/jvm/functions/Function2;)V", "hadFirstNotEmptyLayout", "", "<set-?>", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "getIndex", "()I", "setIndex", "(I)V", "index$delegate", "Landroidx/compose/runtime/MutableIntState;", "indices", "getIndices", "()[I", "setIndices", "([I)V", "indices$delegate", "Landroidx/compose/runtime/MutableState;", "lastKnownFirstItemKey", "", "nearestRangeState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getNearestRangeState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "scrollOffset", "getScrollOffset", "setScrollOffset", "scrollOffset$delegate", "scrollOffsets", "getScrollOffsets", "setScrollOffsets", "scrollOffsets$delegate", "calculateFirstVisibleIndex", "calculateFirstVisibleScrollOffset", "offsets", "equivalent", "a", "b", "requestPosition", "", "update", "updateFromMeasureResult", "measureResult", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "updateScrollOffset", "updateScrollPositionIfTheFirstItemWasMoved", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridScrollPosition implements androidx.compose.runtime.SnapshotMutationPolicy<int[]> {
    public static final int $stable = 8;
    private final kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Integer, int[]> fillIndices;
    private boolean hadFirstNotEmptyLayout;

    /* renamed from: index$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState index;

    /* renamed from: indices$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState indices;
    private java.lang.Object lastKnownFirstItemKey;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState nearestRangeState;

    /* renamed from: scrollOffset$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState scrollOffset;

    /* renamed from: scrollOffsets$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState scrollOffsets;

    /* JADX WARN: Type inference failed for: r1v1, types: [int[], java.lang.Object] */
    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public /* synthetic */ int[] merge(int[] iArr, int[] iArr2, int[] iArr3) {
        return androidx.compose.runtime.SnapshotMutationPolicy.CC.$default$merge(this, iArr, iArr2, iArr3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridScrollPosition(int[] iArr, int[] iArr2, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, int[]> function2) {
        this.fillIndices = function2;
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScrollPosition lazyStaggeredGridScrollPosition = this;
        this.indices = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(iArr, lazyStaggeredGridScrollPosition);
        this.index = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(calculateFirstVisibleIndex(iArr));
        this.scrollOffsets = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(iArr2, lazyStaggeredGridScrollPosition);
        this.scrollOffset = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(calculateFirstVisibleScrollOffset(iArr, iArr2));
        java.lang.Integer minOrNull = kotlin.collections.ArraysKt.minOrNull(iArr);
        this.nearestRangeState = new androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState(minOrNull != null ? minOrNull.intValue() : 0, 90, 200);
    }

    private final void setIndices(int[] iArr) {
        this.indices.setValue(iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] getIndices() {
        return (int[]) this.indices.getValue();
    }

    private final void setIndex(int i) {
        this.index.setIntValue(i);
    }

    public final int getIndex() {
        return this.index.getIntValue();
    }

    private final void setScrollOffsets(int[] iArr) {
        this.scrollOffsets.setValue(iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] getScrollOffsets() {
        return (int[]) this.scrollOffsets.getValue();
    }

    private final void setScrollOffset(int i) {
        this.scrollOffset.setIntValue(i);
    }

    public final int getScrollOffset() {
        return this.scrollOffset.getIntValue();
    }

    private final int calculateFirstVisibleScrollOffset(int[] indices, int[] offsets) {
        int calculateFirstVisibleIndex = calculateFirstVisibleIndex(indices);
        int length = offsets.length;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < length; i2++) {
            if (indices[i2] == calculateFirstVisibleIndex) {
                i = java.lang.Math.min(i, offsets[i2]);
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
        int calculateFirstVisibleIndex = calculateFirstVisibleIndex(measureResult.getFirstVisibleItemIndices());
        java.util.List<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem> visibleItemsInfo = measureResult.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                lazyStaggeredGridMeasuredItem = null;
                break;
            }
            lazyStaggeredGridMeasuredItem = visibleItemsInfo.get(i);
            if (lazyStaggeredGridMeasuredItem.getIndex() == calculateFirstVisibleIndex) {
                break;
            } else {
                i++;
            }
        }
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = lazyStaggeredGridMeasuredItem;
        this.lastKnownFirstItemKey = lazyStaggeredGridMeasuredItem2 != null ? lazyStaggeredGridMeasuredItem2.getKey() : null;
        this.nearestRangeState.update(calculateFirstVisibleIndex);
        if (this.hadFirstNotEmptyLayout || measureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            androidx.compose.runtime.snapshots.Snapshot createNonObservableSnapshot = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                androidx.compose.runtime.snapshots.Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                try {
                    update(measureResult.getFirstVisibleItemIndices(), measureResult.getFirstVisibleItemScrollOffsets());
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } finally {
                    createNonObservableSnapshot.restoreCurrent(makeCurrent);
                }
            } finally {
                createNonObservableSnapshot.dispose();
            }
        }
    }

    public final void updateScrollOffset(int[] scrollOffsets) {
        setScrollOffsets(scrollOffsets);
        setScrollOffset(calculateFirstVisibleScrollOffset(getIndices(), scrollOffsets));
    }

    public final void requestPosition(int index, int scrollOffset) {
        int[] invoke = this.fillIndices.invoke(java.lang.Integer.valueOf(index), java.lang.Integer.valueOf(getIndices().length));
        int length = invoke.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = scrollOffset;
        }
        update(invoke, iArr);
        this.nearestRangeState.update(index);
        this.lastKnownFirstItemKey = null;
    }

    public final int[] updateScrollPositionIfTheFirstItemWasMoved(androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider itemProvider, int[] indices) {
        java.lang.Object obj = this.lastKnownFirstItemKey;
        java.lang.Integer orNull = kotlin.collections.ArraysKt.getOrNull(indices, 0);
        int findIndexByKey = androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt.findIndexByKey(itemProvider, obj, orNull != null ? orNull.intValue() : 0);
        if (kotlin.collections.ArraysKt.contains(indices, findIndexByKey)) {
            return indices;
        }
        this.nearestRangeState.update(findIndexByKey);
        int[] invoke = this.fillIndices.invoke(java.lang.Integer.valueOf(findIndexByKey), java.lang.Integer.valueOf(indices.length));
        setIndices(invoke);
        setIndex(calculateFirstVisibleIndex(invoke));
        return invoke;
    }

    private final void update(int[] indices, int[] offsets) {
        setIndices(indices);
        setIndex(calculateFirstVisibleIndex(indices));
        setScrollOffsets(offsets);
        setScrollOffset(calculateFirstVisibleScrollOffset(indices, offsets));
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(int[] a2, int[] b) {
        return java.util.Arrays.equals(a2, b);
    }

    private final int calculateFirstVisibleIndex(int[] indices) {
        int i = Integer.MAX_VALUE;
        for (int i2 : indices) {
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
