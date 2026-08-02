package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aD\u0010\b\u001a\u00020\u0000*\u00020\u00002.\u0010\u0007\u001a*\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00050\u0002\u0012\u0004\u0012\u00020\u00060\u0001H\u0080\b¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n*\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a5\u0010\u0016\u001a\u00020\u00002\u0012\u0010\u0013\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/runtime/PersistentCompositionLocalMap;", "Lkotlin/Function1;", "", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/ValueHolder;", "", "mutator", "mutate", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/PersistentCompositionLocalMap;", "T", "key", "", "contains", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;Landroidx/compose/runtime/CompositionLocal;)Z", "read", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/ProvidedValue;", "values", "parentScope", "previous", "updateCompositionMap", "([Landroidx/compose/runtime/ProvidedValue;Landroidx/compose/runtime/PersistentCompositionLocalMap;Landroidx/compose/runtime/PersistentCompositionLocalMap;)Landroidx/compose/runtime/PersistentCompositionLocalMap;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompositionLocalMapKt {
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.runtime.PersistentCompositionLocalMap] */
    public static final androidx.compose.runtime.PersistentCompositionLocalMap mutate(androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap, kotlin.jvm.functions.Function1<? super java.util.Map<androidx.compose.runtime.CompositionLocal<java.lang.Object>, androidx.compose.runtime.ValueHolder<java.lang.Object>>, kotlin.Unit> function1) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<androidx.compose.runtime.CompositionLocal<java.lang.Object>, androidx.compose.runtime.ValueHolder<java.lang.Object>> builder2 = persistentCompositionLocalMap.builder2();
        function1.invoke(builder2);
        return builder2.build2();
    }

    public static final <T> boolean contains(androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap, androidx.compose.runtime.CompositionLocal<T> compositionLocal) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(compositionLocal, "");
        return persistentCompositionLocalMap.containsKey(compositionLocal);
    }

    public static final <T> T read(androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap, androidx.compose.runtime.CompositionLocal<T> compositionLocal) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(compositionLocal, "");
        androidx.compose.runtime.ValueHolder valueHolder = persistentCompositionLocalMap.get((java.lang.Object) compositionLocal);
        if (valueHolder == null) {
            valueHolder = compositionLocal.getDefaultValueHolder$runtime();
        }
        return (T) valueHolder.readValue(persistentCompositionLocalMap);
    }

    public static /* synthetic */ androidx.compose.runtime.PersistentCompositionLocalMap updateCompositionMap$default(androidx.compose.runtime.ProvidedValue[] providedValueArr, androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap, androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            persistentCompositionLocalMap2 = androidx.compose.runtime.internal.PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();
        }
        return updateCompositionMap(providedValueArr, persistentCompositionLocalMap, persistentCompositionLocalMap2);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.runtime.PersistentCompositionLocalMap] */
    public static final androidx.compose.runtime.PersistentCompositionLocalMap updateCompositionMap(androidx.compose.runtime.ProvidedValue<?>[] providedValueArr, androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap, androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap2) {
        androidx.compose.runtime.PersistentCompositionLocalMap.Builder builder2 = androidx.compose.runtime.internal.PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf().builder2();
        androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap3 = persistentCompositionLocalMap2;
        for (androidx.compose.runtime.ProvidedValue<?> providedValue : providedValueArr) {
            androidx.compose.runtime.CompositionLocal<?> compositionLocal = providedValue.getCompositionLocal();
            kotlin.jvm.internal.Intrinsics.checkNotNull(compositionLocal, "");
            androidx.compose.runtime.ProvidableCompositionLocal providableCompositionLocal = (androidx.compose.runtime.ProvidableCompositionLocal) compositionLocal;
            if (providedValue.getCanOverride() || !contains(persistentCompositionLocalMap, providableCompositionLocal)) {
                androidx.compose.runtime.ValueHolder valueHolder = (androidx.compose.runtime.ValueHolder) persistentCompositionLocalMap3.get((java.lang.Object) providableCompositionLocal);
                kotlin.jvm.internal.Intrinsics.checkNotNull(providedValue, "");
                builder2.put(providableCompositionLocal, providableCompositionLocal.updatedStateOf$runtime(providedValue, valueHolder));
            }
        }
        return builder2.build2();
    }
}
