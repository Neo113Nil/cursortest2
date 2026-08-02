package com.google.common.collect;

/* loaded from: classes4.dex */
final class Platform {
    static int reduceExponentIfGwt(int i) {
        return i;
    }

    static int reduceIterationsIfGwt(int i) {
        return i;
    }

    static <K, V> java.util.Map<K, V> newHashMapWithExpectedSize(int i) {
        return com.google.common.collect.CompactHashMap.createWithExpectedSize(i);
    }

    static <K, V> java.util.Map<K, V> newLinkedHashMapWithExpectedSize(int i) {
        return com.google.common.collect.CompactLinkedHashMap.createWithExpectedSize(i);
    }

    static <E> java.util.Set<E> newHashSetWithExpectedSize(int i) {
        return com.google.common.collect.CompactHashSet.createWithExpectedSize(i);
    }

    static <E> java.util.Set<E> newLinkedHashSetWithExpectedSize(int i) {
        return com.google.common.collect.CompactLinkedHashSet.createWithExpectedSize(i);
    }

    static <K, V> java.util.Map<K, V> preservesInsertionOrderOnPutsMap() {
        return com.google.common.collect.CompactHashMap.create();
    }

    static <K, V> java.util.Map<K, V> preservesInsertionOrderOnPutsMapWithExpectedSize(int i) {
        return com.google.common.collect.Maps.newLinkedHashMapWithExpectedSize(i);
    }

    static <E> java.util.Set<E> preservesInsertionOrderOnAddsSet() {
        return com.google.common.collect.CompactHashSet.create();
    }

    static <T> T[] newArray(T[] tArr, int i) {
        if (tArr.length != 0) {
            tArr = (T[]) java.util.Arrays.copyOf(tArr, 0);
        }
        return (T[]) java.util.Arrays.copyOf(tArr, i);
    }

    static <T> T[] copy(java.lang.Object[] objArr, int i, int i2, T[] tArr) {
        return (T[]) java.util.Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    static com.google.common.collect.MapMaker tryWeakKeys(com.google.common.collect.MapMaker mapMaker) {
        return mapMaker.weakKeys();
    }

    static <E extends java.lang.Enum<E>> java.lang.Class<E> getDeclaringClassOrObjectForJ2cl(E e) {
        return e.getDeclaringClass();
    }

    private Platform() {
    }
}
