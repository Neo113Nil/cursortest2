package com.google.common.graph;

/* loaded from: classes9.dex */
class MapIteratorCache<K, V> {
    private final java.util.Map<K, V> backingMap;
    private volatile transient java.util.Map.Entry<K, V> cacheEntry;

    MapIteratorCache(java.util.Map<K, V> map) {
        this.backingMap = (java.util.Map) com.google.common.base.Preconditions.checkNotNull(map);
    }

    final V put(K k, V v) {
        com.google.common.base.Preconditions.checkNotNull(k);
        com.google.common.base.Preconditions.checkNotNull(v);
        clearCache();
        return this.backingMap.put(k, v);
    }

    final V remove(java.lang.Object obj) {
        com.google.common.base.Preconditions.checkNotNull(obj);
        clearCache();
        return this.backingMap.remove(obj);
    }

    final void clear() {
        clearCache();
        this.backingMap.clear();
    }

    V get(java.lang.Object obj) {
        com.google.common.base.Preconditions.checkNotNull(obj);
        V ifCached = getIfCached(obj);
        return ifCached == null ? getWithoutCaching(obj) : ifCached;
    }

    final V getWithoutCaching(java.lang.Object obj) {
        com.google.common.base.Preconditions.checkNotNull(obj);
        return this.backingMap.get(obj);
    }

    final boolean containsKey(java.lang.Object obj) {
        return getIfCached(obj) != null || this.backingMap.containsKey(obj);
    }

    final java.util.Set<K> unmodifiableKeySet() {
        return new java.util.AbstractSet<K>() { // from class: com.google.common.graph.MapIteratorCache.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public com.google.common.collect.UnmodifiableIterator<K> iterator() {
                final java.util.Iterator<java.util.Map.Entry<K, V>> it = com.google.common.graph.MapIteratorCache.this.backingMap.entrySet().iterator();
                return new com.google.common.collect.UnmodifiableIterator<K>(this) { // from class: com.google.common.graph.MapIteratorCache.1.1
                    final /* synthetic */ com.google.common.graph.MapIteratorCache.AnonymousClass1 this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    @Override // java.util.Iterator
                    public K next() {
                        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                        com.google.common.graph.MapIteratorCache.this.cacheEntry = entry;
                        return (K) entry.getKey();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return com.google.common.graph.MapIteratorCache.this.backingMap.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(java.lang.Object obj) {
                return com.google.common.graph.MapIteratorCache.this.containsKey(obj);
            }
        };
    }

    V getIfCached(java.lang.Object obj) {
        java.util.Map.Entry<K, V> entry = this.cacheEntry;
        if (entry == null || entry.getKey() != obj) {
            return null;
        }
        return entry.getValue();
    }

    void clearCache() {
        this.cacheEntry = null;
    }
}
