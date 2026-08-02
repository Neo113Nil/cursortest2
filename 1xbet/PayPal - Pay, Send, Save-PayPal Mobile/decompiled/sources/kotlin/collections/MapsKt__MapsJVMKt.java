package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\u001a9\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\b\u0010\f\u001a;\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aE\u0010\u0014\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0011\u001a\u00028\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aA\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019\u001aG\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u0018\u0010\u001c\u001a[\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0001\u0010\u00012*\u0010\u001e\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u001d\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\u001f\u0010 \u001aa\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u001a2*\u0010\u001e\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u001d\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\u001f\u0010!\u001a9\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0000¢\u0006\u0004\b\"\u0010\u000f\u001a\u0017\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\nH\u0000¢\u0006\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"K", "V", "Lkotlin/Pair;", "pair", "", "mapOf", "(Lkotlin/Pair;)Ljava/util/Map;", "", "createMapBuilder", "()Ljava/util/Map;", "", "capacity", "(I)Ljava/util/Map;", "builder", "build", "(Ljava/util/Map;)Ljava/util/Map;", "Ljava/util/concurrent/ConcurrentMap;", "key", "Lkotlin/Function0;", "defaultValue", "getOrPut", "(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "Ljava/util/SortedMap;", "toSortedMap", "(Ljava/util/Map;)Ljava/util/SortedMap;", "Ljava/util/Comparator;", "comparator", "(Ljava/util/Map;Ljava/util/Comparator;)Ljava/util/SortedMap;", "", "pairs", "sortedMapOf", "([Lkotlin/Pair;)Ljava/util/SortedMap;", "(Ljava/util/Comparator;[Lkotlin/Pair;)Ljava/util/SortedMap;", "toSingletonMap", "expectedSize", "mapCapacity", "(I)I"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
/* loaded from: classes3.dex */
public class MapsKt__MapsJVMKt extends kotlin.collections.MapsKt__MapWithDefaultKt {
    public static final int mapCapacity(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final <K, V> java.util.Map<K, V> mapOf(kotlin.Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
        java.util.Map<K, V> singletonMap = java.util.Collections.singletonMap(pair.getFirst(), pair.getSecond());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singletonMap, "");
        return singletonMap;
    }

    public static final <K, V> java.util.Map<K, V> createMapBuilder() {
        return new kotlin.collections.builders.MapBuilder();
    }

    public static final <K, V> java.util.Map<K, V> createMapBuilder(int i) {
        return new kotlin.collections.builders.MapBuilder(i);
    }

    public static final <K, V> java.util.Map<K, V> build(java.util.Map<K, V> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        return ((kotlin.collections.builders.MapBuilder) map).build();
    }

    public static final <K, V> V getOrPut(java.util.concurrent.ConcurrentMap<K, V> concurrentMap, K k, kotlin.jvm.functions.Function0<? extends V> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(concurrentMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        V v = concurrentMap.get(k);
        if (v != null) {
            return v;
        }
        V invoke = function0.invoke();
        V putIfAbsent = concurrentMap.putIfAbsent(k, invoke);
        return putIfAbsent == null ? invoke : putIfAbsent;
    }

    public static final <K extends java.lang.Comparable<? super K>, V> java.util.SortedMap<K, V> toSortedMap(java.util.Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        return new java.util.TreeMap(map);
    }

    public static final <K, V> java.util.SortedMap<K, V> toSortedMap(java.util.Map<? extends K, ? extends V> map, java.util.Comparator<? super K> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "");
        java.util.TreeMap treeMap = new java.util.TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }

    public static final <K extends java.lang.Comparable<? super K>, V> java.util.SortedMap<K, V> sortedMapOf(kotlin.Pair<? extends K, ? extends V>... pairArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairArr, "");
        java.util.TreeMap treeMap = new java.util.TreeMap();
        kotlin.collections.MapsKt.putAll(treeMap, pairArr);
        return treeMap;
    }

    public static final <K, V> java.util.SortedMap<K, V> sortedMapOf(java.util.Comparator<? super K> comparator, kotlin.Pair<? extends K, ? extends V>... pairArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairArr, "");
        java.util.TreeMap treeMap = new java.util.TreeMap(comparator);
        kotlin.collections.MapsKt.putAll(treeMap, pairArr);
        return treeMap;
    }

    public static final <K, V> java.util.Map<K, V> toSingletonMap(java.util.Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.util.Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        java.util.Map<K, V> singletonMap = java.util.Collections.singletonMap(next.getKey(), next.getValue());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singletonMap, "");
        return singletonMap;
    }
}
