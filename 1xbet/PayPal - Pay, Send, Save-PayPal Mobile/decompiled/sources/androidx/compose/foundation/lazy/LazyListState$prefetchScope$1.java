package androidx.compose.foundation.lazy;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J2\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0019\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState$prefetchScope$1;", "Landroidx/compose/foundation/lazy/LazyListPrefetchScope;", "", "index", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListPrefetchResultScope;", "", "Lkotlin/ExtensionFunctionType;", "onPrefetchFinished", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "schedulePrefetch", "(ILkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyListState$prefetchScope$1 implements androidx.compose.foundation.lazy.LazyListPrefetchScope {
    final /* synthetic */ androidx.compose.foundation.lazy.LazyListState getHighSpeedVideoFpsRangesFor;

    LazyListState$prefetchScope$1(androidx.compose.foundation.lazy.LazyListState lazyListState) {
        this.getHighSpeedVideoFpsRangesFor = lazyListState;
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchScope
    public final androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle schedulePrefetch(final int index, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.LazyListPrefetchResultScope, kotlin.Unit> onPrefetchFinished) {
        androidx.compose.runtime.MutableState mutableState;
        boolean z;
        androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
        androidx.compose.foundation.lazy.LazyListState lazyListState = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            mutableState = lazyListState.getHighSpeedVideoFpsRanges;
            final androidx.compose.foundation.lazy.LazyListMeasureResult lazyListMeasureResult = (androidx.compose.foundation.lazy.LazyListMeasureResult) mutableState.getValue();
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState prefetchState = this.getHighSpeedVideoFpsRangesFor.getPrefetchState();
            long childConstraints = lazyListMeasureResult.getChildConstraints();
            z = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            return prefetchState.m1864schedulePrecompositionAndPremeasure_EkL_Y$foundation(index, childConstraints, z, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.LazyListState$prefetchScope$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.LazyListState$prefetchScope$1.Camera2StreamConfigurationMap(kotlin.jvm.functions.Function1.this, index, lazyListMeasureResult, (androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchResultScope) obj);
                    return Camera2StreamConfigurationMap;
                }
            });
        } catch (java.lang.Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(kotlin.jvm.functions.Function1 function1, int i, androidx.compose.foundation.lazy.LazyListMeasureResult lazyListMeasureResult, androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchResultScope prefetchResultScope) {
        long mo1866getSizeYEO4UFw;
        if (function1 != null) {
            int placeablesCount = prefetchResultScope.getPlaceablesCount();
            int i2 = 0;
            for (int i3 = 0; i3 < placeablesCount; i3++) {
                if (lazyListMeasureResult.getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical) {
                    mo1866getSizeYEO4UFw = prefetchResultScope.mo1866getSizeYEO4UFw(i3) & 4294967295L;
                } else {
                    mo1866getSizeYEO4UFw = prefetchResultScope.mo1866getSizeYEO4UFw(i3) >> 32;
                }
                i2 += (int) mo1866getSizeYEO4UFw;
            }
            function1.invoke(new androidx.compose.foundation.lazy.LazyListPrefetchResultScopeImpl(i, i2));
        }
        return kotlin.Unit.INSTANCE;
    }
}
