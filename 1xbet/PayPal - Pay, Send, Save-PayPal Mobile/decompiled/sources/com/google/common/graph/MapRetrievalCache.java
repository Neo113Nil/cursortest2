package com.google.common.graph;

/* loaded from: classes9.dex */
final class MapRetrievalCache<K, V> extends com.google.common.graph.MapIteratorCache<K, V> {
    private volatile transient com.google.common.graph.MapRetrievalCache.CacheEntry<K, V> cacheEntry1;
    private volatile transient com.google.common.graph.MapRetrievalCache.CacheEntry<K, V> cacheEntry2;

    MapRetrievalCache(java.util.Map<K, V> map) {
        super(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.MapIteratorCache
    final V get(java.lang.Object obj) {
        com.google.common.base.Preconditions.checkNotNull(obj);
        V ifCached = getIfCached(obj);
        if (ifCached != null) {
            return ifCached;
        }
        V withoutCaching = getWithoutCaching(obj);
        if (withoutCaching != null) {
            addToCache(obj, withoutCaching);
        }
        return withoutCaching;
    }

    @Override // com.google.common.graph.MapIteratorCache
    final V getIfCached(java.lang.Object obj) {
        V v = (V) super.getIfCached(obj);
        if (v != null) {
            return v;
        }
        com.google.common.graph.MapRetrievalCache.CacheEntry<K, V> cacheEntry = this.cacheEntry1;
        if (cacheEntry != null && cacheEntry.key == obj) {
            return cacheEntry.value;
        }
        com.google.common.graph.MapRetrievalCache.CacheEntry<K, V> cacheEntry2 = this.cacheEntry2;
        if (cacheEntry2 == null || cacheEntry2.key != obj) {
            return null;
        }
        addToCache(cacheEntry2);
        return cacheEntry2.value;
    }

    @Override // com.google.common.graph.MapIteratorCache
    final void clearCache() {
        super.clearCache();
        this.cacheEntry1 = null;
        this.cacheEntry2 = null;
    }

    private void addToCache(K k, V v) {
        addToCache(new com.google.common.graph.MapRetrievalCache.CacheEntry<>(k, v));
    }

    private void addToCache(com.google.common.graph.MapRetrievalCache.CacheEntry<K, V> cacheEntry) {
        this.cacheEntry2 = this.cacheEntry1;
        this.cacheEntry1 = cacheEntry;
    }

    static final class CacheEntry<K, V> {
        final K key;
        final V value;

        CacheEntry(K k, V v) {
            this.key = k;
            this.value = v;
        }
    }
}
