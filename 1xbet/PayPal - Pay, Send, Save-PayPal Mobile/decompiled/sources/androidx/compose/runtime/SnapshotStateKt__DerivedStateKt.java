package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\b\u001a\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a,\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0002\u001a\u00020\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\" \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014"}, d2 = {"T", "Lkotlin/Function0;", "p0", "Landroidx/compose/runtime/State;", "derivedStateOf", "(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "p1", "(Landroidx/compose/runtime/SnapshotMutationPolicy;Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/DerivedStateObserver;", "derivedStateObservers", "()Landroidx/compose/runtime/collection/MutableVector;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "observeDerivedStateRecalculations", "(Landroidx/compose/runtime/DerivedStateObserver;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "Landroidx/compose/runtime/internal/IntRef;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
/* loaded from: classes6.dex */
final /* synthetic */ class SnapshotStateKt__DerivedStateKt {
    private static final androidx.compose.runtime.internal.SnapshotThreadLocal<androidx.compose.runtime.internal.IntRef> getHighSpeedVideoFpsRanges = new androidx.compose.runtime.internal.SnapshotThreadLocal<>();
    private static final androidx.compose.runtime.internal.SnapshotThreadLocal<androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.DerivedStateObserver>> Camera2StreamConfigurationMap = new androidx.compose.runtime.internal.SnapshotThreadLocal<>();

    public static final <T> androidx.compose.runtime.State<T> derivedStateOf(kotlin.jvm.functions.Function0<? extends T> function0) {
        return new androidx.compose.runtime.DerivedSnapshotState(function0, null);
    }

    public static final <T> androidx.compose.runtime.State<T> derivedStateOf(androidx.compose.runtime.SnapshotMutationPolicy<T> snapshotMutationPolicy, kotlin.jvm.functions.Function0<? extends T> function0) {
        return new androidx.compose.runtime.DerivedSnapshotState(function0, snapshotMutationPolicy);
    }

    public static final androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.DerivedStateObserver> derivedStateObservers() {
        androidx.compose.runtime.internal.SnapshotThreadLocal<androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.DerivedStateObserver>> snapshotThreadLocal = Camera2StreamConfigurationMap;
        androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.DerivedStateObserver> mutableVector = snapshotThreadLocal.get();
        if (mutableVector != null) {
            return mutableVector;
        }
        androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.DerivedStateObserver> mutableVector2 = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.runtime.DerivedStateObserver[0], 0);
        snapshotThreadLocal.set(mutableVector2);
        return mutableVector2;
    }

    public static final <R> void observeDerivedStateRecalculations(androidx.compose.runtime.DerivedStateObserver derivedStateObserver, kotlin.jvm.functions.Function0<? extends R> function0) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.DerivedStateObserver> derivedStateObservers = androidx.compose.runtime.SnapshotStateKt.derivedStateObservers();
        try {
            derivedStateObservers.add(derivedStateObserver);
            function0.invoke();
        } finally {
            derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
        }
    }
}
