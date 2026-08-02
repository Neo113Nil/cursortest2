package com.google.common.collect;

/* loaded from: classes9.dex */
abstract class AbstractNavigableMap<K, V> extends com.google.common.collect.Maps.IteratorBasedAbstractMap<K, V> implements java.util.NavigableMap<K, V> {
    abstract java.util.Iterator<java.util.Map.Entry<K, V>> descendingEntryIterator();

    @Override // java.util.AbstractMap, java.util.Map
    public abstract V get(java.lang.Object obj);

    AbstractNavigableMap() {
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> firstEntry() {
        return (java.util.Map.Entry) com.google.common.collect.Iterators.getNext(entryIterator(), null);
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> lastEntry() {
        return (java.util.Map.Entry) com.google.common.collect.Iterators.getNext(descendingEntryIterator(), null);
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> pollFirstEntry() {
        return (java.util.Map.Entry) com.google.common.collect.Iterators.pollNext(entryIterator());
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> pollLastEntry() {
        return (java.util.Map.Entry) com.google.common.collect.Iterators.pollNext(descendingEntryIterator());
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        java.util.Map.Entry<K, V> firstEntry = firstEntry();
        if (firstEntry == null) {
            throw new java.util.NoSuchElementException();
        }
        return firstEntry.getKey();
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        java.util.Map.Entry<K, V> lastEntry = lastEntry();
        if (lastEntry == null) {
            throw new java.util.NoSuchElementException();
        }
        return lastEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> lowerEntry(K k) {
        return headMap(k, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> floorEntry(K k) {
        return headMap(k, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> ceilingEntry(K k) {
        return tailMap(k, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> higherEntry(K k) {
        return tailMap(k, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public K lowerKey(K k) {
        return (K) com.google.common.collect.Maps.keyOrNull(lowerEntry(k));
    }

    @Override // java.util.NavigableMap
    public K floorKey(K k) {
        return (K) com.google.common.collect.Maps.keyOrNull(floorEntry(k));
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(K k) {
        return (K) com.google.common.collect.Maps.keyOrNull(ceilingEntry(k));
    }

    @Override // java.util.NavigableMap
    public K higherKey(K k) {
        return (K) com.google.common.collect.Maps.keyOrNull(higherEntry(k));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public java.util.SortedMap<K, V> subMap(K k, K k2) {
        return subMap(k, true, k2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public java.util.SortedMap<K, V> headMap(K k) {
        return headMap(k, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public java.util.SortedMap<K, V> tailMap(K k) {
        return tailMap(k, true);
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableSet<K> navigableKeySet() {
        return new com.google.common.collect.Maps.NavigableKeySet(this);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public java.util.Set<K> keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableSet<K> descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableMap<K, V> descendingMap() {
        return new com.google.common.collect.AbstractNavigableMap.DescendingMap();
    }

    final class DescendingMap extends com.google.common.collect.Maps.DescendingMap<K, V> {
        private DescendingMap() {
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        final java.util.NavigableMap<K, V> forward() {
            return com.google.common.collect.AbstractNavigableMap.this;
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        final java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
            return com.google.common.collect.AbstractNavigableMap.this.descendingEntryIterator();
        }
    }
}
