package androidx.compose.runtime;

/* compiled from: CompositionLocalMap.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010\u0007\u001a \u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH\u0000\u001a%\u0010\r\u001a\u0002H\n\"\u0004\b\u0000\u0010\n*\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH\u0000¢\u0006\u0002\u0010\u000e\u001a=\u0010\u000f\u001a\u00020\u0001*\u00020\u00012.\u0010\u0010\u001a*\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00140\u0012\u0012\u0004\u0012\u00020\u00150\u0011H\u0080\b\u001a%\u0010\u0016\u001a\u0002H\n\"\u0004\b\u0000\u0010\n*\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH\u0000¢\u0006\u0002\u0010\u000e¨\u0006\u0017"}, d2 = {"updateCompositionMap", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "values", "", "Landroidx/compose/runtime/ProvidedValue;", "parentScope", "previous", "([Landroidx/compose/runtime/ProvidedValue;Landroidx/compose/runtime/PersistentCompositionLocalMap;Landroidx/compose/runtime/PersistentCompositionLocalMap;)Landroidx/compose/runtime/PersistentCompositionLocalMap;", "contains", "", "T", com.ironsource.X3.i.W, "Landroidx/compose/runtime/CompositionLocal;", "getValueOf", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "mutate", "mutator", "Lkotlin/Function1;", "", "", "Landroidx/compose/runtime/State;", "", "read", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CompositionLocalMapKt {
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.runtime.PersistentCompositionLocalMap] */
    public static final androidx.compose.runtime.PersistentCompositionLocalMap mutate(androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap, kotlin.jvm.functions.Function1<? super java.util.Map<androidx.compose.runtime.CompositionLocal<java.lang.Object>, androidx.compose.runtime.State<java.lang.Object>>, kotlin.Unit> function1) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<androidx.compose.runtime.CompositionLocal<java.lang.Object>, androidx.compose.runtime.State<? extends java.lang.Object>> builder2 = persistentCompositionLocalMap.builder2();
        function1.invoke(builder2);
        return builder2.build2();
    }

    public static final <T> boolean contains(androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap, androidx.compose.runtime.CompositionLocal<T> compositionLocal) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return persistentCompositionLocalMap.containsKey(compositionLocal);
    }

    public static final <T> T getValueOf(androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap, androidx.compose.runtime.CompositionLocal<T> compositionLocal) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        androidx.compose.runtime.State state = (androidx.compose.runtime.State) persistentCompositionLocalMap.get((java.lang.Object) compositionLocal);
        if (state != null) {
            return (T) state.getValue();
        }
        return null;
    }

    public static final <T> T read(androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap, androidx.compose.runtime.CompositionLocal<T> compositionLocal) {
        if (contains(persistentCompositionLocalMap, compositionLocal)) {
            return (T) getValueOf(persistentCompositionLocalMap, compositionLocal);
        }
        return compositionLocal.getDefaultValueHolder$runtime_release().getValue();
    }

    public static /* synthetic */ androidx.compose.runtime.PersistentCompositionLocalMap updateCompositionMap$default(androidx.compose.runtime.ProvidedValue[] providedValueArr, androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap, androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            persistentCompositionLocalMap2 = androidx.compose.runtime.internal.PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();
        }
        return updateCompositionMap(providedValueArr, persistentCompositionLocalMap, persistentCompositionLocalMap2);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.runtime.PersistentCompositionLocalMap] */
    public static final androidx.compose.runtime.PersistentCompositionLocalMap updateCompositionMap(androidx.compose.runtime.ProvidedValue<?>[] providedValueArr, androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap, androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap2) {
        androidx.compose.runtime.PersistentCompositionLocalMap.Builder builder2 = androidx.compose.runtime.internal.PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf().builder2();
        androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap3 = persistentCompositionLocalMap2;
        for (androidx.compose.runtime.ProvidedValue<?> providedValue : providedValueArr) {
            androidx.compose.runtime.CompositionLocal<?> compositionLocal = providedValue.getCompositionLocal();
            kotlin.jvm.internal.Intrinsics.checkNotNull(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            androidx.compose.runtime.ProvidableCompositionLocal providableCompositionLocal = (androidx.compose.runtime.ProvidableCompositionLocal) compositionLocal;
            if (providedValue.getCanOverride() || !contains(persistentCompositionLocalMap, providableCompositionLocal)) {
                builder2.put(providableCompositionLocal, providableCompositionLocal.updatedStateOf$runtime_release(providedValue.getValue(), (androidx.compose.runtime.State) persistentCompositionLocalMap3.get((java.lang.Object) providableCompositionLocal)));
            }
        }
        return builder2.build2();
    }
}
