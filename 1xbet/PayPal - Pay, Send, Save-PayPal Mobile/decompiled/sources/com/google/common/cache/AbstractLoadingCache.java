package com.google.common.cache;

/* loaded from: classes9.dex */
public abstract class AbstractLoadingCache<K, V> extends com.google.common.cache.AbstractCache<K, V> implements com.google.common.cache.LoadingCache<K, V> {
    protected AbstractLoadingCache() {
    }

    @Override // com.google.common.cache.LoadingCache
    public V getUnchecked(K k) {
        try {
            return get(k);
        } catch (java.util.concurrent.ExecutionException e) {
            throw new com.google.common.util.concurrent.UncheckedExecutionException(e.getCause());
        }
    }

    @Override // com.google.common.cache.LoadingCache
    public com.google.common.collect.ImmutableMap<K, V> getAll(java.lang.Iterable<? extends K> iterable) throws java.util.concurrent.ExecutionException {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (K k : iterable) {
            if (!linkedHashMap.containsKey(k)) {
                linkedHashMap.put(k, get(k));
            }
        }
        return com.google.common.collect.ImmutableMap.copyOf((java.util.Map) linkedHashMap);
    }

    @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
    public final V apply(K k) {
        return getUnchecked(k);
    }

    @Override // com.google.common.cache.LoadingCache
    public void refresh(K k) {
        throw new java.lang.UnsupportedOperationException();
    }
}
