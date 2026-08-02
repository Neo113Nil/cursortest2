package com.google.common.cache;

import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.UncheckedExecutionException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public abstract class AbstractLoadingCache<K, V> extends AbstractCache<K, V> implements LoadingCache<K, V> {
    protected AbstractLoadingCache() {
    }

    @Override // com.google.common.cache.LoadingCache
    public V getUnchecked(K key) {
        try {
            return get(key);
        } catch (ExecutionException e) {
            throw new UncheckedExecutionException(e.getCause());
        }
    }

    @Override // com.google.common.cache.LoadingCache
    public ImmutableMap<K, V> getAll(Iterable<? extends K> keys) throws ExecutionException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (K k : keys) {
            if (!linkedHashMap.containsKey(k)) {
                linkedHashMap.put(k, get(k));
            }
        }
        return ImmutableMap.copyOf((Map) linkedHashMap);
    }

    @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
    public final V apply(K key) {
        return getUnchecked(key);
    }

    @Override // com.google.common.cache.LoadingCache
    public void refresh(K key) {
        throw new UnsupportedOperationException();
    }
}
