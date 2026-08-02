package kotlin.reflect.jvm.internal.impl.utils;

/* loaded from: classes3.dex */
public final class CollectionsKt {
    public static final <K> java.util.Map<K, java.lang.Integer> mapToIndex(java.lang.Iterable<? extends K> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator<? extends K> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), java.lang.Integer.valueOf(i));
            i++;
        }
        return linkedHashMap;
    }

    public static final <T> void addIfNotNull(java.util.Collection<T> collection, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        if (t != null) {
            collection.add(t);
        }
    }

    public static final <K, V> java.util.HashMap<K, V> newHashMapWithExpectedSize(int i) {
        return new java.util.HashMap<>(i >= 3 ? i + (i / 3) + 1 : 3);
    }

    public static final <E> java.util.HashSet<E> newHashSetWithExpectedSize(int i) {
        return new java.util.HashSet<>(i >= 3 ? i + (i / 3) + 1 : 3);
    }

    public static final <E> java.util.LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int i) {
        return new java.util.LinkedHashSet<>(i >= 3 ? i + (i / 3) + 1 : 3);
    }

    public static final <T> java.util.List<T> compact(java.util.ArrayList<T> arrayList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "");
        int size = arrayList.size();
        if (size == 0) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        if (size == 1) {
            return kotlin.collections.CollectionsKt.listOf(kotlin.collections.CollectionsKt.first((java.util.List) arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
