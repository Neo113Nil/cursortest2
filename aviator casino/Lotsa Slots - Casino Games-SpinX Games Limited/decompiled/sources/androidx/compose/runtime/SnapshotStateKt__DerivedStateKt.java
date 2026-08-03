package androidx.compose.runtime;

/* compiled from: DerivedState.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000\u001a\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0007\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0007\u001a0\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0082\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0014\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0016\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0080\b\u001a*\u0010\u0017\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\b0\u0018H\u0082\b¢\u0006\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"calculationBlockNestedLevel", "Landroidx/compose/runtime/SnapshotThreadLocal;", "Landroidx/compose/runtime/internal/IntRef;", "derivedStateObservers", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/DerivedStateObserver;", "derivedStateOf", "Landroidx/compose/runtime/State;", "T", "calculation", "Lkotlin/Function0;", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "notifyObservers", "R", "derivedState", "Landroidx/compose/runtime/DerivedState;", "block", "notifyObservers$SnapshotStateKt__DerivedStateKt", "(Landroidx/compose/runtime/DerivedState;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "observeDerivedStateRecalculations", "", "observer", "withCalculationNestedLevel", "Lkotlin/Function1;", "withCalculationNestedLevel$SnapshotStateKt__DerivedStateKt", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "runtime_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
/* loaded from: classes.dex */
final /* synthetic */ class SnapshotStateKt__DerivedStateKt {
    private static final androidx.compose.runtime.SnapshotThreadLocal<androidx.compose.runtime.internal.IntRef> calculationBlockNestedLevel = new androidx.compose.runtime.SnapshotThreadLocal<>();
    private static final androidx.compose.runtime.SnapshotThreadLocal<androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.DerivedStateObserver>> derivedStateObservers = new androidx.compose.runtime.SnapshotThreadLocal<>();

    private static final <T> T withCalculationNestedLevel$SnapshotStateKt__DerivedStateKt(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.internal.IntRef, ? extends T> function1) {
        androidx.compose.runtime.internal.IntRef intRef = (androidx.compose.runtime.internal.IntRef) calculationBlockNestedLevel.get();
        if (intRef == null) {
            intRef = new androidx.compose.runtime.internal.IntRef(0);
            calculationBlockNestedLevel.set(intRef);
        }
        return function1.invoke(intRef);
    }

    public static final <T> androidx.compose.runtime.State<T> derivedStateOf(kotlin.jvm.functions.Function0<? extends T> function0) {
        return new androidx.compose.runtime.DerivedSnapshotState(function0, null);
    }

    public static final <T> androidx.compose.runtime.State<T> derivedStateOf(androidx.compose.runtime.SnapshotMutationPolicy<T> snapshotMutationPolicy, kotlin.jvm.functions.Function0<? extends T> function0) {
        return new androidx.compose.runtime.DerivedSnapshotState(function0, snapshotMutationPolicy);
    }

    public static final androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.DerivedStateObserver> derivedStateObservers() {
        androidx.compose.runtime.SnapshotThreadLocal<androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.DerivedStateObserver>> snapshotThreadLocal = derivedStateObservers;
        androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.DerivedStateObserver> mutableVector = snapshotThreadLocal.get();
        if (mutableVector != null) {
            return mutableVector;
        }
        androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.DerivedStateObserver> mutableVector2 = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.runtime.DerivedStateObserver[0], 0);
        snapshotThreadLocal.set(mutableVector2);
        return mutableVector2;
    }

    private static final <R> R notifyObservers$SnapshotStateKt__DerivedStateKt(androidx.compose.runtime.DerivedState<?> derivedState, kotlin.jvm.functions.Function0<? extends R> function0) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.DerivedStateObserver> derivedStateObservers2 = androidx.compose.runtime.SnapshotStateKt.derivedStateObservers();
        int size = derivedStateObservers2.getSize();
        int i = 0;
        if (size > 0) {
            androidx.compose.runtime.DerivedStateObserver[] content = derivedStateObservers2.getContent();
            int i2 = 0;
            do {
                content[i2].start(derivedState);
                i2++;
            } while (i2 < size);
        }
        try {
            R invoke = function0.invoke();
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            int size2 = derivedStateObservers2.getSize();
            if (size2 > 0) {
                androidx.compose.runtime.DerivedStateObserver[] content2 = derivedStateObservers2.getContent();
                do {
                    content2[i].done(derivedState);
                    i++;
                } while (i < size2);
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            return invoke;
        } catch (java.lang.Throwable th) {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            int size3 = derivedStateObservers2.getSize();
            if (size3 > 0) {
                androidx.compose.runtime.DerivedStateObserver[] content3 = derivedStateObservers2.getContent();
                do {
                    content3[i].done(derivedState);
                    i++;
                } while (i < size3);
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    public static final <R> void observeDerivedStateRecalculations(androidx.compose.runtime.DerivedStateObserver derivedStateObserver, kotlin.jvm.functions.Function0<? extends R> function0) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.DerivedStateObserver> derivedStateObservers2 = androidx.compose.runtime.SnapshotStateKt.derivedStateObservers();
        try {
            derivedStateObservers2.add(derivedStateObserver);
            function0.invoke();
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            derivedStateObservers2.removeAt(derivedStateObservers2.getSize() - 1);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }
}
