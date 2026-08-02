package androidx.compose.runtime;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a6\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\b2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\tH\u0086\n¢\u0006\u0004\b\n\u0010\u000b\u001a>\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\b2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0001\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0013\"\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0014\u001a#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u0016\u0010\u0017\u001a%\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u0019¢\u0006\u0004\b\u001b\u0010\u001c\u001aQ\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u00192*\u0010\u0001\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d0\u0013\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d¢\u0006\u0004\b\u001b\u0010\u001e\u001a;\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u0019*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d0\u001f¢\u0006\u0004\b \u0010!\u001a\u0019\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b#\u0010$\u001a-\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0001\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0013\"\u00028\u0000¢\u0006\u0004\b#\u0010%\u001a!\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b&\u0010'"}, d2 = {"T", "p0", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "p1", "Landroidx/compose/runtime/MutableState;", "mutableStateOf", "(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)Landroidx/compose/runtime/MutableState;", "Landroidx/compose/runtime/State;", "", "Lkotlin/reflect/KProperty;", "getValue", "(Landroidx/compose/runtime/State;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "p2", "", "setValue", "(Landroidx/compose/runtime/MutableState;Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "mutableStateListOf", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "", "([Ljava/lang/Object;)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "", "toMutableStateList", "(Ljava/util/Collection;)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "K", "V", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "mutableStateMapOf", "()Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "Lkotlin/Pair;", "([Lkotlin/Pair;)Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "", "toMutableStateMap", "(Ljava/lang/Iterable;)Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "mutableStateSetOf", "()Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "([Ljava/lang/Object;)Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "rememberUpdatedState", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class SnapshotStateKt__SnapshotStateKt {
    public static /* synthetic */ androidx.compose.runtime.MutableState mutableStateOf$default(java.lang.Object obj, androidx.compose.runtime.SnapshotMutationPolicy snapshotMutationPolicy, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            snapshotMutationPolicy = androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy();
        }
        return androidx.compose.runtime.SnapshotStateKt.mutableStateOf(obj, snapshotMutationPolicy);
    }

    public static final <T> androidx.compose.runtime.MutableState<T> mutableStateOf(T t, androidx.compose.runtime.SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return androidx.compose.runtime.SnapshotState_androidKt.createSnapshotMutableState(t, snapshotMutationPolicy);
    }

    public static final <T> T getValue(androidx.compose.runtime.State<? extends T> state, java.lang.Object obj, kotlin.reflect.KProperty<?> kProperty) {
        return state.getValue();
    }

    public static final <T> void setValue(androidx.compose.runtime.MutableState<T> mutableState, java.lang.Object obj, kotlin.reflect.KProperty<?> kProperty, T t) {
        mutableState.setValue(t);
    }

    public static final <T> androidx.compose.runtime.snapshots.SnapshotStateList<T> mutableStateListOf() {
        return new androidx.compose.runtime.snapshots.SnapshotStateList<>();
    }

    public static final <T> androidx.compose.runtime.snapshots.SnapshotStateList<T> mutableStateListOf(T... tArr) {
        androidx.compose.runtime.snapshots.SnapshotStateList<T> snapshotStateList = new androidx.compose.runtime.snapshots.SnapshotStateList<>();
        snapshotStateList.addAll(kotlin.collections.ArraysKt.toList(tArr));
        return snapshotStateList;
    }

    public static final <T> androidx.compose.runtime.snapshots.SnapshotStateList<T> toMutableStateList(java.util.Collection<? extends T> collection) {
        androidx.compose.runtime.snapshots.SnapshotStateList<T> snapshotStateList = new androidx.compose.runtime.snapshots.SnapshotStateList<>();
        snapshotStateList.addAll(collection);
        return snapshotStateList;
    }

    public static final <K, V> androidx.compose.runtime.snapshots.SnapshotStateMap<K, V> mutableStateMapOf() {
        return new androidx.compose.runtime.snapshots.SnapshotStateMap<>();
    }

    public static final <K, V> androidx.compose.runtime.snapshots.SnapshotStateMap<K, V> mutableStateMapOf(kotlin.Pair<? extends K, ? extends V>... pairArr) {
        androidx.compose.runtime.snapshots.SnapshotStateMap<K, V> snapshotStateMap = new androidx.compose.runtime.snapshots.SnapshotStateMap<>();
        snapshotStateMap.putAll(kotlin.collections.MapsKt.toMap(pairArr));
        return snapshotStateMap;
    }

    public static final <K, V> androidx.compose.runtime.snapshots.SnapshotStateMap<K, V> toMutableStateMap(java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> iterable) {
        androidx.compose.runtime.snapshots.SnapshotStateMap<K, V> snapshotStateMap = new androidx.compose.runtime.snapshots.SnapshotStateMap<>();
        snapshotStateMap.putAll(kotlin.collections.MapsKt.toMap(iterable));
        return snapshotStateMap;
    }

    public static final <T> androidx.compose.runtime.snapshots.SnapshotStateSet<T> mutableStateSetOf() {
        return new androidx.compose.runtime.snapshots.SnapshotStateSet<>();
    }

    public static final <T> androidx.compose.runtime.snapshots.SnapshotStateSet<T> mutableStateSetOf(T... tArr) {
        androidx.compose.runtime.snapshots.SnapshotStateSet<T> snapshotStateSet = new androidx.compose.runtime.snapshots.SnapshotStateSet<>();
        snapshotStateSet.addAll(kotlin.collections.ArraysKt.toSet(tArr));
        return snapshotStateSet;
    }

    public static final <T> androidx.compose.runtime.State<T> rememberUpdatedState(T t, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1058319986, i, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:340)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = mutableStateOf$default(t, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
        mutableState.setValue(t);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return mutableState;
    }
}
