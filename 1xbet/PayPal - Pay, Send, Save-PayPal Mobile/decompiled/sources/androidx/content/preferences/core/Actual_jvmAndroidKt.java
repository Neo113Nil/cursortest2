package androidx.content.preferences.core;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"K", "V", "", "map", "immutableMap", "(Ljava/util/Map;)Ljava/util/Map;", "T", "", "set", "immutableCopyOfSet", "(Ljava/util/Set;)Ljava/util/Set;", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Actual_jvmAndroidKt {
    public static final <K, V> java.util.Map<K, V> immutableMap(java.util.Map<K, ? extends V> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.util.Map<K, V> unmodifiableMap = java.util.Collections.unmodifiableMap(map);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "");
        return unmodifiableMap;
    }

    public static final <T> java.util.Set<T> immutableCopyOfSet(java.util.Set<? extends T> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        java.util.Set<T> unmodifiableSet = java.util.Collections.unmodifiableSet(kotlin.collections.CollectionsKt.toSet(set));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "");
        return unmodifiableSet;
    }

    public static final kotlinx.coroutines.CoroutineDispatcher ioDispatcher() {
        return kotlinx.coroutines.Dispatchers.getIO();
    }
}
