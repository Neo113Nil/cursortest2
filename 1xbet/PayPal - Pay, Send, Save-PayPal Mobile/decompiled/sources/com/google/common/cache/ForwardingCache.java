package com.google.common.cache;

/* loaded from: classes9.dex */
public abstract class ForwardingCache<K, V> extends com.google.common.collect.ForwardingObject implements com.google.common.cache.Cache<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    public abstract com.google.common.cache.Cache<K, V> delegate();

    protected ForwardingCache() {
    }

    @Override // com.google.common.cache.Cache
    public V getIfPresent(java.lang.Object obj) {
        return delegate().getIfPresent(obj);
    }

    @Override // com.google.common.cache.Cache
    public V get(K k, java.util.concurrent.Callable<? extends V> callable) throws java.util.concurrent.ExecutionException {
        return delegate().get(k, callable);
    }

    @Override // com.google.common.cache.Cache
    public com.google.common.collect.ImmutableMap<K, V> getAllPresent(java.lang.Iterable<? extends java.lang.Object> iterable) {
        return delegate().getAllPresent(iterable);
    }

    @Override // com.google.common.cache.Cache
    public void put(K k, V v) {
        delegate().put(k, v);
    }

    @Override // com.google.common.cache.Cache
    public void putAll(java.util.Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    @Override // com.google.common.cache.Cache
    public void invalidate(java.lang.Object obj) {
        delegate().invalidate(obj);
    }

    @Override // com.google.common.cache.Cache
    public void invalidateAll(java.lang.Iterable<? extends java.lang.Object> iterable) {
        delegate().invalidateAll(iterable);
    }

    @Override // com.google.common.cache.Cache
    public void invalidateAll() {
        delegate().invalidateAll();
    }

    @Override // com.google.common.cache.Cache
    public long size() {
        return delegate().size();
    }

    @Override // com.google.common.cache.Cache
    public com.google.common.cache.CacheStats stats() {
        return delegate().stats();
    }

    @Override // com.google.common.cache.Cache
    public java.util.concurrent.ConcurrentMap<K, V> asMap() {
        return delegate().asMap();
    }

    @Override // com.google.common.cache.Cache
    public void cleanUp() {
        delegate().cleanUp();
    }

    public static abstract class SimpleForwardingCache<K, V> extends com.google.common.cache.ForwardingCache<K, V> {
        private final com.google.common.cache.Cache<K, V> delegate;

        protected SimpleForwardingCache(com.google.common.cache.Cache<K, V> cache) {
            this.delegate = (com.google.common.cache.Cache) com.google.common.base.Preconditions.checkNotNull(cache);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        public final com.google.common.cache.Cache<K, V> delegate() {
            return this.delegate;
        }
    }
}
