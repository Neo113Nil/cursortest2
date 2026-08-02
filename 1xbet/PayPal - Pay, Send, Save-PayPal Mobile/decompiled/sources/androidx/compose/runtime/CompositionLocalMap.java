package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\bv\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J$\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/CompositionLocalMap;", "", "T", "Landroidx/compose/runtime/CompositionLocal;", "key", "get", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "Companion", "Landroidx/compose/runtime/PersistentCompositionLocalMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CompositionLocalMap {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.runtime.CompositionLocalMap.Companion INSTANCE = androidx.compose.runtime.CompositionLocalMap.Companion.getHighSpeedVideoFpsRanges;

    <T> T get(androidx.compose.runtime.CompositionLocal<T> key);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/runtime/CompositionLocalMap$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/CompositionLocalMap;", "Empty", "Landroidx/compose/runtime/CompositionLocalMap;", "getEmpty", "()Landroidx/compose/runtime/CompositionLocalMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.runtime.CompositionLocalMap.Companion getHighSpeedVideoFpsRanges = new androidx.compose.runtime.CompositionLocalMap.Companion();
        private static final androidx.compose.runtime.CompositionLocalMap Empty = androidx.compose.runtime.internal.PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();

        private Companion() {
        }

        public final androidx.compose.runtime.CompositionLocalMap getEmpty() {
            return Empty;
        }
    }
}
