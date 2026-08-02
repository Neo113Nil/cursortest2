package com.google.common.collect;

/* loaded from: classes9.dex */
public abstract class ForwardingSortedMap<K, V> extends com.google.common.collect.ForwardingMap<K, V> implements java.util.SortedMap<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public abstract java.util.SortedMap<K, V> delegate();

    protected ForwardingSortedMap() {
    }

    @Override // java.util.SortedMap
    public java.util.Comparator<? super K> comparator() {
        return delegate().comparator();
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        return delegate().firstKey();
    }

    @Override // java.util.SortedMap
    public java.util.SortedMap<K, V> headMap(K k) {
        return delegate().headMap(k);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return delegate().lastKey();
    }

    @Override // java.util.SortedMap
    public java.util.SortedMap<K, V> subMap(K k, K k2) {
        return delegate().subMap(k, k2);
    }

    @Override // java.util.SortedMap
    public java.util.SortedMap<K, V> tailMap(K k) {
        return delegate().tailMap(k);
    }

    protected class StandardKeySet extends com.google.common.collect.Maps.SortedKeySet<K, V> {
        public StandardKeySet() {
            super(com.google.common.collect.ForwardingSortedMap.this);
        }
    }

    static int unsafeCompare(java.util.Comparator<?> comparator, java.lang.Object obj, java.lang.Object obj2) {
        if (comparator == null) {
            return ((java.lang.Comparable) obj).compareTo(obj2);
        }
        return comparator.compare(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingMap
    protected boolean standardContainsKey(java.lang.Object obj) {
        try {
            return unsafeCompare(comparator(), tailMap(obj).firstKey(), obj) == 0;
        } catch (java.lang.ClassCastException | java.lang.NullPointerException | java.util.NoSuchElementException unused) {
            return false;
        }
    }

    protected java.util.SortedMap<K, V> standardSubMap(K k, K k2) {
        com.google.common.base.Preconditions.checkArgument(unsafeCompare(comparator(), k, k2) <= 0, "fromKey must be <= toKey");
        return tailMap(k).headMap(k2);
    }
}
