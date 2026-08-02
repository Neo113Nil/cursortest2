package androidx.compose.runtime.internal;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a[\u0010\u0001\u001a\u00020\t2J\u0010\b\u001a&\u0012\"\b\u0001\u0012\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00070\u00040\u0003\"\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00070\u0004H\u0000¢\u0006\u0004\b\u0001\u0010\n"}, d2 = {"Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "persistentCompositionLocalHashMapOf", "()Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/ValueHolder;", "pairs", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "([Lkotlin/Pair;)Landroidx/compose/runtime/PersistentCompositionLocalMap;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PersistentCompositionLocalMapKt {
    public static final androidx.compose.runtime.internal.PersistentCompositionLocalHashMap persistentCompositionLocalHashMapOf() {
        return androidx.compose.runtime.internal.PersistentCompositionLocalHashMap.INSTANCE.getEmpty();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.runtime.PersistentCompositionLocalMap] */
    public static final androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalHashMapOf(kotlin.Pair<? extends androidx.compose.runtime.CompositionLocal<java.lang.Object>, ? extends androidx.compose.runtime.ValueHolder<java.lang.Object>>... pairArr) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<androidx.compose.runtime.CompositionLocal<java.lang.Object>, androidx.compose.runtime.ValueHolder<java.lang.Object>> builder2 = androidx.compose.runtime.internal.PersistentCompositionLocalHashMap.INSTANCE.getEmpty().builder2();
        kotlin.collections.MapsKt.putAll(builder2, pairArr);
        return builder2.build2();
    }
}
