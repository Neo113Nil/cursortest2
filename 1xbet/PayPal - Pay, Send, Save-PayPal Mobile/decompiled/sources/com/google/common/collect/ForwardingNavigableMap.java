package com.google.common.collect;

/* loaded from: classes9.dex */
public abstract class ForwardingNavigableMap<K, V> extends com.google.common.collect.ForwardingSortedMap<K, V> implements java.util.NavigableMap<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public abstract java.util.NavigableMap<K, V> delegate();

    protected ForwardingNavigableMap() {
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> lowerEntry(K k) {
        return delegate().lowerEntry(k);
    }

    protected java.util.Map.Entry<K, V> standardLowerEntry(K k) {
        return headMap(k, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public K lowerKey(K k) {
        return delegate().lowerKey(k);
    }

    protected K standardLowerKey(K k) {
        return (K) com.google.common.collect.Maps.keyOrNull(lowerEntry(k));
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> floorEntry(K k) {
        return delegate().floorEntry(k);
    }

    protected java.util.Map.Entry<K, V> standardFloorEntry(K k) {
        return headMap(k, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public K floorKey(K k) {
        return delegate().floorKey(k);
    }

    protected K standardFloorKey(K k) {
        return (K) com.google.common.collect.Maps.keyOrNull(floorEntry(k));
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> ceilingEntry(K k) {
        return delegate().ceilingEntry(k);
    }

    protected java.util.Map.Entry<K, V> standardCeilingEntry(K k) {
        return tailMap(k, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(K k) {
        return delegate().ceilingKey(k);
    }

    protected K standardCeilingKey(K k) {
        return (K) com.google.common.collect.Maps.keyOrNull(ceilingEntry(k));
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> higherEntry(K k) {
        return delegate().higherEntry(k);
    }

    protected java.util.Map.Entry<K, V> standardHigherEntry(K k) {
        return tailMap(k, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public K higherKey(K k) {
        return delegate().higherKey(k);
    }

    protected K standardHigherKey(K k) {
        return (K) com.google.common.collect.Maps.keyOrNull(higherEntry(k));
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> firstEntry() {
        return delegate().firstEntry();
    }

    protected java.util.Map.Entry<K, V> standardFirstEntry() {
        return (java.util.Map.Entry) com.google.common.collect.Iterables.getFirst(entrySet(), null);
    }

    protected K standardFirstKey() {
        java.util.Map.Entry<K, V> firstEntry = firstEntry();
        if (firstEntry == null) {
            throw new java.util.NoSuchElementException();
        }
        return firstEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> lastEntry() {
        return delegate().lastEntry();
    }

    protected java.util.Map.Entry<K, V> standardLastEntry() {
        return (java.util.Map.Entry) com.google.common.collect.Iterables.getFirst(descendingMap().entrySet(), null);
    }

    protected K standardLastKey() {
        java.util.Map.Entry<K, V> lastEntry = lastEntry();
        if (lastEntry == null) {
            throw new java.util.NoSuchElementException();
        }
        return lastEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> pollFirstEntry() {
        return delegate().pollFirstEntry();
    }

    protected java.util.Map.Entry<K, V> standardPollFirstEntry() {
        return (java.util.Map.Entry) com.google.common.collect.Iterators.pollNext(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> pollLastEntry() {
        return delegate().pollLastEntry();
    }

    protected java.util.Map.Entry<K, V> standardPollLastEntry() {
        return (java.util.Map.Entry) com.google.common.collect.Iterators.pollNext(descendingMap().entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableMap<K, V> descendingMap() {
        return delegate().descendingMap();
    }

    protected class StandardDescendingMap extends com.google.common.collect.Maps.DescendingMap<K, V> {
        public StandardDescendingMap() {
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        java.util.NavigableMap<K, V> forward() {
            return com.google.common.collect.ForwardingNavigableMap.this;
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        protected java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
            return new java.util.Iterator<java.util.Map.Entry<K, V>>() { // from class: com.google.common.collect.ForwardingNavigableMap.StandardDescendingMap.1
                private java.util.Map.Entry<K, V> nextOrNull;
                private java.util.Map.Entry<K, V> toRemove = null;

                {
                    this.nextOrNull = com.google.common.collect.ForwardingNavigableMap.StandardDescendingMap.this.forward().lastEntry();
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.nextOrNull != null;
                }

                @Override // java.util.Iterator
                public java.util.Map.Entry<K, V> next() {
                    java.util.Map.Entry<K, V> entry = this.nextOrNull;
                    if (entry == null) {
                        throw new java.util.NoSuchElementException();
                    }
                    this.toRemove = entry;
                    this.nextOrNull = com.google.common.collect.ForwardingNavigableMap.StandardDescendingMap.this.forward().lowerEntry(this.nextOrNull.getKey());
                    return entry;
                }

                @Override // java.util.Iterator
                public void remove() {
                    if (this.toRemove == null) {
                        throw new java.lang.IllegalStateException("no calls to next() since the last call to remove()");
                    }
                    com.google.common.collect.ForwardingNavigableMap.StandardDescendingMap.this.forward().remove(this.toRemove.getKey());
                    this.toRemove = null;
                }
            };
        }
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableSet<K> navigableKeySet() {
        return delegate().navigableKeySet();
    }

    protected class StandardNavigableKeySet extends com.google.common.collect.Maps.NavigableKeySet<K, V> {
        public StandardNavigableKeySet() {
            super(com.google.common.collect.ForwardingNavigableMap.this);
        }
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableSet<K> descendingKeySet() {
        return delegate().descendingKeySet();
    }

    protected java.util.NavigableSet<K> standardDescendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    @Override // com.google.common.collect.ForwardingSortedMap
    protected java.util.SortedMap<K, V> standardSubMap(K k, K k2) {
        return subMap(k, true, k2, false);
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
        return delegate().subMap(k, z, k2, z2);
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableMap<K, V> headMap(K k, boolean z) {
        return delegate().headMap(k, z);
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableMap<K, V> tailMap(K k, boolean z) {
        return delegate().tailMap(k, z);
    }

    protected java.util.SortedMap<K, V> standardHeadMap(K k) {
        return headMap(k, false);
    }

    protected java.util.SortedMap<K, V> standardTailMap(K k) {
        return tailMap(k, true);
    }
}
