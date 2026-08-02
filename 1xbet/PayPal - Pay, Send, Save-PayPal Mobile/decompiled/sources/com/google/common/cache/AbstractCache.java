package com.google.common.cache;

/* loaded from: classes9.dex */
public abstract class AbstractCache<K, V> implements com.google.common.cache.Cache<K, V> {

    public interface StatsCounter {
        void recordEviction();

        void recordHits(int i);

        void recordLoadException(long j);

        void recordLoadSuccess(long j);

        void recordMisses(int i);

        com.google.common.cache.CacheStats snapshot();
    }

    @Override // com.google.common.cache.Cache
    public void cleanUp() {
    }

    protected AbstractCache() {
    }

    @Override // com.google.common.cache.Cache
    public V get(K k, java.util.concurrent.Callable<? extends V> callable) throws java.util.concurrent.ExecutionException {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public com.google.common.collect.ImmutableMap<K, V> getAllPresent(java.lang.Iterable<? extends java.lang.Object> iterable) {
        V ifPresent;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : iterable) {
            if (!linkedHashMap.containsKey(obj) && (ifPresent = getIfPresent(obj)) != null) {
                linkedHashMap.put(obj, ifPresent);
            }
        }
        return com.google.common.collect.ImmutableMap.copyOf((java.util.Map) linkedHashMap);
    }

    @Override // com.google.common.cache.Cache
    public void put(K k, V v) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public void putAll(java.util.Map<? extends K, ? extends V> map) {
        for (java.util.Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.cache.Cache
    public long size() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public void invalidate(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public void invalidateAll(java.lang.Iterable<? extends java.lang.Object> iterable) {
        java.util.Iterator<? extends java.lang.Object> it = iterable.iterator();
        while (it.hasNext()) {
            invalidate(it.next());
        }
    }

    @Override // com.google.common.cache.Cache
    public void invalidateAll() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public com.google.common.cache.CacheStats stats() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public java.util.concurrent.ConcurrentMap<K, V> asMap() {
        throw new java.lang.UnsupportedOperationException();
    }

    public static final class SimpleStatsCounter implements com.google.common.cache.AbstractCache.StatsCounter {
        private final com.google.common.cache.LongAddable hitCount = com.google.common.cache.LongAddables.create();
        private final com.google.common.cache.LongAddable missCount = com.google.common.cache.LongAddables.create();
        private final com.google.common.cache.LongAddable loadSuccessCount = com.google.common.cache.LongAddables.create();
        private final com.google.common.cache.LongAddable loadExceptionCount = com.google.common.cache.LongAddables.create();
        private final com.google.common.cache.LongAddable totalLoadTime = com.google.common.cache.LongAddables.create();
        private final com.google.common.cache.LongAddable evictionCount = com.google.common.cache.LongAddables.create();

        private static long negativeToMaxValue(long j) {
            if (j >= 0) {
                return j;
            }
            return Long.MAX_VALUE;
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void recordHits(int i) {
            this.hitCount.add(i);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void recordMisses(int i) {
            this.missCount.add(i);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void recordLoadSuccess(long j) {
            this.loadSuccessCount.increment();
            this.totalLoadTime.add(j);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void recordLoadException(long j) {
            this.loadExceptionCount.increment();
            this.totalLoadTime.add(j);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void recordEviction() {
            this.evictionCount.increment();
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final com.google.common.cache.CacheStats snapshot() {
            return new com.google.common.cache.CacheStats(negativeToMaxValue(this.hitCount.sum()), negativeToMaxValue(this.missCount.sum()), negativeToMaxValue(this.loadSuccessCount.sum()), negativeToMaxValue(this.loadExceptionCount.sum()), negativeToMaxValue(this.totalLoadTime.sum()), negativeToMaxValue(this.evictionCount.sum()));
        }

        public final void incrementBy(com.google.common.cache.AbstractCache.StatsCounter statsCounter) {
            com.google.common.cache.CacheStats snapshot = statsCounter.snapshot();
            this.hitCount.add(snapshot.hitCount());
            this.missCount.add(snapshot.missCount());
            this.loadSuccessCount.add(snapshot.loadSuccessCount());
            this.loadExceptionCount.add(snapshot.loadExceptionCount());
            this.totalLoadTime.add(snapshot.totalLoadTime());
            this.evictionCount.add(snapshot.evictionCount());
        }
    }
}
