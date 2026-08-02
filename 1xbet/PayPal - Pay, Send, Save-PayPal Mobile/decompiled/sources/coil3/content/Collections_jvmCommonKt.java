package coil3.content;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u001aC\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"", "K", "V", "", "initialCapacity", "", "loadFactor", "", "LruMutableMap", "(IF)Ljava/util/Map;", "", "toImmutableMap", "(Ljava/util/Map;)Ljava/util/Map;", "T", "", "toImmutableList", "(Ljava/util/List;)Ljava/util/List;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Collections_jvmCommonKt {
    public static /* synthetic */ java.util.Map LruMutableMap$default(int i, float f, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            f = 0.75f;
        }
        return LruMutableMap(i, f);
    }

    public static final <K, V> java.util.Map<K, V> LruMutableMap(int i, float f) {
        return new java.util.LinkedHashMap(i, f, true);
    }

    public static final <K, V> java.util.Map<K, V> toImmutableMap(java.util.Map<K, ? extends V> map) {
        int size = map.size();
        if (size == 0) {
            return kotlin.collections.MapsKt.emptyMap();
        }
        if (size == 1) {
            java.util.Map.Entry entry = (java.util.Map.Entry) kotlin.collections.CollectionsKt.first(map.entrySet());
            return java.util.Collections.singletonMap(entry.getKey(), entry.getValue());
        }
        return java.util.Collections.unmodifiableMap(new java.util.LinkedHashMap(map));
    }

    public static final <T> java.util.List<T> toImmutableList(java.util.List<? extends T> list) {
        int size = list.size();
        if (size == 0) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        if (size == 1) {
            return java.util.Collections.singletonList(kotlin.collections.CollectionsKt.first((java.util.List) list));
        }
        return java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
    }
}
