package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"androidx/compose/runtime/SnapshotStateKt__DerivedStateKt", "androidx/compose/runtime/SnapshotStateKt__ProduceStateKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotMutationPolicyKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotStateKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapshotStateKt {
    public static final <T extends R, R> androidx.compose.runtime.State<R> collectAsState(kotlinx.coroutines.flow.Flow<? extends T> flow, R r, kotlin.coroutines.CoroutineContext coroutineContext, androidx.compose.runtime.Composer composer, int i, int i2) {
        return androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.collectAsState(flow, r, coroutineContext, composer, i, i2);
    }

    public static final <T> androidx.compose.runtime.State<T> collectAsState(kotlinx.coroutines.flow.StateFlow<? extends T> stateFlow, kotlin.coroutines.CoroutineContext coroutineContext, androidx.compose.runtime.Composer composer, int i, int i2) {
        return androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.collectAsState(stateFlow, coroutineContext, composer, i, i2);
    }

    public static final androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.DerivedStateObserver> derivedStateObservers() {
        return androidx.compose.runtime.SnapshotStateKt__DerivedStateKt.derivedStateObservers();
    }

    public static final <T> androidx.compose.runtime.State<T> derivedStateOf(androidx.compose.runtime.SnapshotMutationPolicy<T> snapshotMutationPolicy, kotlin.jvm.functions.Function0<? extends T> function0) {
        return androidx.compose.runtime.SnapshotStateKt__DerivedStateKt.derivedStateOf(snapshotMutationPolicy, function0);
    }

    public static final <T> androidx.compose.runtime.State<T> derivedStateOf(kotlin.jvm.functions.Function0<? extends T> function0) {
        return androidx.compose.runtime.SnapshotStateKt__DerivedStateKt.derivedStateOf(function0);
    }

    public static final <T> T getValue(androidx.compose.runtime.State<? extends T> state, java.lang.Object obj, kotlin.reflect.KProperty<?> kProperty) {
        return (T) androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.getValue(state, obj, kProperty);
    }

    public static final <T> androidx.compose.runtime.snapshots.SnapshotStateList<T> mutableStateListOf() {
        return androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateListOf();
    }

    public static final <T> androidx.compose.runtime.snapshots.SnapshotStateList<T> mutableStateListOf(T... tArr) {
        return androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateListOf(tArr);
    }

    public static final <K, V> androidx.compose.runtime.snapshots.SnapshotStateMap<K, V> mutableStateMapOf() {
        return androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateMapOf();
    }

    public static final <K, V> androidx.compose.runtime.snapshots.SnapshotStateMap<K, V> mutableStateMapOf(kotlin.Pair<? extends K, ? extends V>... pairArr) {
        return androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateMapOf(pairArr);
    }

    public static final <T> androidx.compose.runtime.MutableState<T> mutableStateOf(T t, androidx.compose.runtime.SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf(t, snapshotMutationPolicy);
    }

    public static final <T> androidx.compose.runtime.snapshots.SnapshotStateSet<T> mutableStateSetOf() {
        return androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateSetOf();
    }

    public static final <T> androidx.compose.runtime.snapshots.SnapshotStateSet<T> mutableStateSetOf(T... tArr) {
        return androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateSetOf(tArr);
    }

    public static final <T> androidx.compose.runtime.SnapshotMutationPolicy<T> neverEqualPolicy() {
        return androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy();
    }

    public static final <R> void observeDerivedStateRecalculations(androidx.compose.runtime.DerivedStateObserver derivedStateObserver, kotlin.jvm.functions.Function0<? extends R> function0) {
        androidx.compose.runtime.SnapshotStateKt__DerivedStateKt.observeDerivedStateRecalculations(derivedStateObserver, function0);
    }

    public static final <T> androidx.compose.runtime.State<T> produceState(T t, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.ProduceStateScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, androidx.compose.runtime.Composer composer, int i) {
        return androidx.compose.runtime.SnapshotStateKt__ProduceStateKt.produceState(t, obj, obj2, obj3, function2, composer, i);
    }

    public static final <T> androidx.compose.runtime.State<T> produceState(T t, java.lang.Object obj, java.lang.Object obj2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.ProduceStateScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, androidx.compose.runtime.Composer composer, int i) {
        return androidx.compose.runtime.SnapshotStateKt__ProduceStateKt.produceState(t, obj, obj2, function2, composer, i);
    }

    public static final <T> androidx.compose.runtime.State<T> produceState(T t, java.lang.Object obj, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.ProduceStateScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, androidx.compose.runtime.Composer composer, int i) {
        return androidx.compose.runtime.SnapshotStateKt__ProduceStateKt.produceState(t, obj, function2, composer, i);
    }

    public static final <T> androidx.compose.runtime.State<T> produceState(T t, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.ProduceStateScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, androidx.compose.runtime.Composer composer, int i) {
        return androidx.compose.runtime.SnapshotStateKt__ProduceStateKt.produceState(t, function2, composer, i);
    }

    public static final <T> androidx.compose.runtime.State<T> produceState(T t, java.lang.Object[] objArr, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.ProduceStateScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, androidx.compose.runtime.Composer composer, int i) {
        return androidx.compose.runtime.SnapshotStateKt__ProduceStateKt.produceState((java.lang.Object) t, objArr, (kotlin.jvm.functions.Function2) function2, composer, i);
    }

    public static final <T> androidx.compose.runtime.SnapshotMutationPolicy<T> referentialEqualityPolicy() {
        return androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy();
    }

    public static final <T> androidx.compose.runtime.State<T> rememberUpdatedState(T t, androidx.compose.runtime.Composer composer, int i) {
        return androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.rememberUpdatedState(t, composer, i);
    }

    public static final <T> void setValue(androidx.compose.runtime.MutableState<T> mutableState, java.lang.Object obj, kotlin.reflect.KProperty<?> kProperty, T t) {
        androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.setValue(mutableState, obj, kProperty, t);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> snapshotFlow(kotlin.jvm.functions.Function0<? extends T> function0) {
        return androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.snapshotFlow(function0);
    }

    public static final <T> androidx.compose.runtime.SnapshotMutationPolicy<T> structuralEqualityPolicy() {
        return androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy();
    }

    public static final <T> androidx.compose.runtime.snapshots.SnapshotStateList<T> toMutableStateList(java.util.Collection<? extends T> collection) {
        return androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.toMutableStateList(collection);
    }

    public static final <K, V> androidx.compose.runtime.snapshots.SnapshotStateMap<K, V> toMutableStateMap(java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> iterable) {
        return androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.toMutableStateMap(iterable);
    }
}
