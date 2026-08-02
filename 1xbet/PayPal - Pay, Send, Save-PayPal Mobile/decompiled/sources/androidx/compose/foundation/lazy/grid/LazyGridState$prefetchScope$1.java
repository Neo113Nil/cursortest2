package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J8\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0019\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\b\u000bH\u0016¢\u0006\u0004\b\u0006\u0010\r"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState$prefetchScope$1;", "Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchScope;", "", "lineIndex", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "scheduleLinePrefetch", "(I)Ljava/util/List;", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchResultScope;", "", "Lkotlin/ExtensionFunctionType;", "onPrefetchFinished", "(ILkotlin/jvm/functions/Function1;)Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridState$prefetchScope$1 implements androidx.compose.foundation.lazy.grid.LazyGridPrefetchScope {
    final /* synthetic */ androidx.compose.foundation.lazy.grid.LazyGridState getHighSpeedVideoSizes;

    LazyGridState$prefetchScope$1(androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState) {
        this.getHighSpeedVideoSizes = lazyGridState;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchScope
    public final java.util.List<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle> scheduleLinePrefetch(int lineIndex) {
        return scheduleLinePrefetch(lineIndex, null);
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchScope
    public final java.util.List<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle> scheduleLinePrefetch(final int lineIndex, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.grid.LazyGridPrefetchResultScope, kotlin.Unit> onPrefetchFinished) {
        androidx.compose.runtime.MutableState mutableState;
        androidx.compose.foundation.lazy.grid.LazyGridMeasureResult lazyGridMeasureResult;
        boolean z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = onPrefetchFinished == null ? null : new java.util.ArrayList();
        androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
        androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState = this.getHighSpeedVideoSizes;
        androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (!lazyGridState.getHasLookaheadOccurred()) {
                mutableState = lazyGridState.getHighSpeedVideoFpsRanges;
                lazyGridMeasureResult = (androidx.compose.foundation.lazy.grid.LazyGridMeasureResult) mutableState.getValue();
            } else {
                lazyGridMeasureResult = lazyGridState.getApproachLayoutInfo();
            }
            final androidx.compose.foundation.lazy.grid.LazyGridMeasureResult lazyGridMeasureResult2 = lazyGridMeasureResult;
            if (lazyGridMeasureResult2 != null) {
                kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
                intRef.element = 1;
                java.util.List<kotlin.Pair<java.lang.Integer, androidx.compose.ui.unit.Constraints>> invoke = lazyGridMeasureResult2.getPrefetchInfoRetriever().invoke(java.lang.Integer.valueOf(lineIndex));
                int size = invoke.size();
                int i = 0;
                while (i < size) {
                    kotlin.Pair<java.lang.Integer, androidx.compose.ui.unit.Constraints> pair = invoke.get(i);
                    androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState prefetchState = lazyGridState.getPrefetchState();
                    int intValue = pair.getFirst().intValue();
                    long getHighSpeedVideoFpsRangesFor = pair.getSecond().getGetHighSpeedVideoFpsRangesFor();
                    z = lazyGridState.getHighSpeedVideoSizes;
                    final java.util.ArrayList arrayList3 = arrayList2;
                    final kotlin.jvm.internal.Ref.IntRef intRef2 = intRef;
                    int i2 = i;
                    final java.util.List<kotlin.Pair<java.lang.Integer, androidx.compose.ui.unit.Constraints>> list = invoke;
                    arrayList.add(prefetchState.m1864schedulePrecompositionAndPremeasure_EkL_Y$foundation(intValue, getHighSpeedVideoFpsRangesFor, z, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$prefetchScope$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            kotlin.Unit Camera2StreamConfigurationMap;
                            Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.grid.LazyGridState$prefetchScope$1.Camera2StreamConfigurationMap(arrayList3, intRef2, list, onPrefetchFinished, lineIndex, lazyGridMeasureResult2, (androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchResultScope) obj);
                            return Camera2StreamConfigurationMap;
                        }
                    }));
                    i = i2 + 1;
                    size = size;
                    invoke = invoke;
                    intRef = intRef;
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            return arrayList;
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(java.util.List list, kotlin.jvm.internal.Ref.IntRef intRef, java.util.List list2, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.foundation.lazy.grid.LazyGridMeasureResult lazyGridMeasureResult, androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchResultScope prefetchResultScope) {
        long mo1866getSizeYEO4UFw;
        int placeablesCount = prefetchResultScope.getPlaceablesCount();
        int i2 = 0;
        for (int i3 = 0; i3 < placeablesCount; i3++) {
            if (lazyGridMeasureResult.getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical) {
                mo1866getSizeYEO4UFw = prefetchResultScope.mo1866getSizeYEO4UFw(i3) & 4294967295L;
            } else {
                mo1866getSizeYEO4UFw = prefetchResultScope.mo1866getSizeYEO4UFw(i3) >> 32;
            }
            i2 += (int) mo1866getSizeYEO4UFw;
        }
        if (list != null) {
            list.add(java.lang.Integer.valueOf(i2));
        }
        if (intRef.element != list2.size()) {
            intRef.element++;
        } else if (function1 != null && list != null) {
            function1.invoke(new androidx.compose.foundation.lazy.grid.LazyGridPrefetchResultScopeImpl(i, list));
        }
        return kotlin.Unit.INSTANCE;
    }
}
