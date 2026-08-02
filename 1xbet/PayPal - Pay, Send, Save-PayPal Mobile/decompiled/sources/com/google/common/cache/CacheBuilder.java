package com.google.common.cache;

/* loaded from: classes9.dex */
public final class CacheBuilder<K, V> {
    private static final int DEFAULT_CONCURRENCY_LEVEL = 4;
    private static final int DEFAULT_EXPIRATION_NANOS = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private static final int DEFAULT_REFRESH_NANOS = 0;
    static final int UNSET_INT = -1;
    com.google.common.base.Equivalence<java.lang.Object> keyEquivalence;
    com.google.common.cache.LocalCache.Strength keyStrength;
    com.google.common.cache.RemovalListener<? super K, ? super V> removalListener;
    com.google.common.base.Ticker ticker;
    com.google.common.base.Equivalence<java.lang.Object> valueEquivalence;
    com.google.common.cache.LocalCache.Strength valueStrength;
    com.google.common.cache.Weigher<? super K, ? super V> weigher;
    static final com.google.common.base.Supplier<? extends com.google.common.cache.AbstractCache.StatsCounter> NULL_STATS_COUNTER = com.google.common.base.Suppliers.ofInstance(new com.google.common.cache.AbstractCache.StatsCounter() { // from class: com.google.common.cache.CacheBuilder.1
        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordEviction() {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordHits(int i) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordLoadException(long j) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordLoadSuccess(long j) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordMisses(int i) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public com.google.common.cache.CacheStats snapshot() {
            return com.google.common.cache.CacheBuilder.EMPTY_STATS;
        }
    });
    static final com.google.common.cache.CacheStats EMPTY_STATS = new com.google.common.cache.CacheStats(0, 0, 0, 0, 0, 0);
    static final com.google.common.base.Supplier<com.google.common.cache.AbstractCache.StatsCounter> CACHE_STATS_COUNTER = new com.google.common.base.Supplier<com.google.common.cache.AbstractCache.StatsCounter>() { // from class: com.google.common.cache.CacheBuilder.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.Supplier
        public com.google.common.cache.AbstractCache.StatsCounter get() {
            return new com.google.common.cache.AbstractCache.SimpleStatsCounter();
        }
    };
    static final com.google.common.base.Ticker NULL_TICKER = new com.google.common.base.Ticker() { // from class: com.google.common.cache.CacheBuilder.3
        @Override // com.google.common.base.Ticker
        public long read() {
            return 0L;
        }
    };
    boolean strictParsing = true;
    int initialCapacity = -1;
    int concurrencyLevel = -1;
    long maximumSize = -1;
    long maximumWeight = -1;
    long expireAfterWriteNanos = -1;
    long expireAfterAccessNanos = -1;
    long refreshNanos = -1;
    com.google.common.base.Supplier<? extends com.google.common.cache.AbstractCache.StatsCounter> statsCounterSupplier = NULL_STATS_COUNTER;

    enum NullListener implements com.google.common.cache.RemovalListener<java.lang.Object, java.lang.Object> {
        INSTANCE;

        @Override // com.google.common.cache.RemovalListener
        public final void onRemoval(com.google.common.cache.RemovalNotification<java.lang.Object, java.lang.Object> removalNotification) {
        }
    }

    enum OneWeigher implements com.google.common.cache.Weigher<java.lang.Object, java.lang.Object> {
        INSTANCE;

        @Override // com.google.common.cache.Weigher
        public final int weigh(java.lang.Object obj, java.lang.Object obj2) {
            return 1;
        }
    }

    static final class LoggerHolder {
        static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.common.cache.CacheBuilder.class.getName());

        private LoggerHolder() {
        }
    }

    private CacheBuilder() {
    }

    public static com.google.common.cache.CacheBuilder<java.lang.Object, java.lang.Object> newBuilder() {
        return new com.google.common.cache.CacheBuilder<>();
    }

    public static com.google.common.cache.CacheBuilder<java.lang.Object, java.lang.Object> from(com.google.common.cache.CacheBuilderSpec cacheBuilderSpec) {
        return cacheBuilderSpec.toCacheBuilder().lenientParsing();
    }

    public static com.google.common.cache.CacheBuilder<java.lang.Object, java.lang.Object> from(java.lang.String str) {
        return from(com.google.common.cache.CacheBuilderSpec.parse(str));
    }

    final com.google.common.cache.CacheBuilder<K, V> lenientParsing() {
        this.strictParsing = false;
        return this;
    }

    final com.google.common.cache.CacheBuilder<K, V> keyEquivalence(com.google.common.base.Equivalence<java.lang.Object> equivalence) {
        com.google.common.base.Equivalence<java.lang.Object> equivalence2 = this.keyEquivalence;
        com.google.common.base.Preconditions.checkState(equivalence2 == null, "key equivalence was already set to %s", equivalence2);
        this.keyEquivalence = (com.google.common.base.Equivalence) com.google.common.base.Preconditions.checkNotNull(equivalence);
        return this;
    }

    final com.google.common.base.Equivalence<java.lang.Object> getKeyEquivalence() {
        return (com.google.common.base.Equivalence) com.google.common.base.MoreObjects.firstNonNull(this.keyEquivalence, getKeyStrength().defaultEquivalence());
    }

    final com.google.common.cache.CacheBuilder<K, V> valueEquivalence(com.google.common.base.Equivalence<java.lang.Object> equivalence) {
        com.google.common.base.Equivalence<java.lang.Object> equivalence2 = this.valueEquivalence;
        com.google.common.base.Preconditions.checkState(equivalence2 == null, "value equivalence was already set to %s", equivalence2);
        this.valueEquivalence = (com.google.common.base.Equivalence) com.google.common.base.Preconditions.checkNotNull(equivalence);
        return this;
    }

    final com.google.common.base.Equivalence<java.lang.Object> getValueEquivalence() {
        return (com.google.common.base.Equivalence) com.google.common.base.MoreObjects.firstNonNull(this.valueEquivalence, getValueStrength().defaultEquivalence());
    }

    public final com.google.common.cache.CacheBuilder<K, V> initialCapacity(int i) {
        int i2 = this.initialCapacity;
        com.google.common.base.Preconditions.checkState(i2 == -1, "initial capacity was already set to %s", i2);
        com.google.common.base.Preconditions.checkArgument(i >= 0);
        this.initialCapacity = i;
        return this;
    }

    final int getInitialCapacity() {
        int i = this.initialCapacity;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    public final com.google.common.cache.CacheBuilder<K, V> concurrencyLevel(int i) {
        int i2 = this.concurrencyLevel;
        com.google.common.base.Preconditions.checkState(i2 == -1, "concurrency level was already set to %s", i2);
        com.google.common.base.Preconditions.checkArgument(i > 0);
        this.concurrencyLevel = i;
        return this;
    }

    final int getConcurrencyLevel() {
        int i = this.concurrencyLevel;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    public final com.google.common.cache.CacheBuilder<K, V> maximumSize(long j) {
        long j2 = this.maximumSize;
        com.google.common.base.Preconditions.checkState(j2 == -1, "maximum size was already set to %s", j2);
        long j3 = this.maximumWeight;
        com.google.common.base.Preconditions.checkState(j3 == -1, "maximum weight was already set to %s", j3);
        com.google.common.base.Preconditions.checkState(this.weigher == null, "maximum size can not be combined with weigher");
        com.google.common.base.Preconditions.checkArgument(j >= 0, "maximum size must not be negative");
        this.maximumSize = j;
        return this;
    }

    public final com.google.common.cache.CacheBuilder<K, V> maximumWeight(long j) {
        long j2 = this.maximumWeight;
        com.google.common.base.Preconditions.checkState(j2 == -1, "maximum weight was already set to %s", j2);
        long j3 = this.maximumSize;
        com.google.common.base.Preconditions.checkState(j3 == -1, "maximum size was already set to %s", j3);
        com.google.common.base.Preconditions.checkArgument(j >= 0, "maximum weight must not be negative");
        this.maximumWeight = j;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K1 extends K, V1 extends V> com.google.common.cache.CacheBuilder<K1, V1> weigher(com.google.common.cache.Weigher<? super K1, ? super V1> weigher) {
        com.google.common.base.Preconditions.checkState(this.weigher == null);
        if (this.strictParsing) {
            long j = this.maximumSize;
            com.google.common.base.Preconditions.checkState(j == -1, "weigher can not be combined with maximum size (%s provided)", j);
        }
        this.weigher = (com.google.common.cache.Weigher) com.google.common.base.Preconditions.checkNotNull(weigher);
        return this;
    }

    final long getMaximumWeight() {
        if (this.expireAfterWriteNanos == 0 || this.expireAfterAccessNanos == 0) {
            return 0L;
        }
        return this.weigher == null ? this.maximumSize : this.maximumWeight;
    }

    final <K1 extends K, V1 extends V> com.google.common.cache.Weigher<K1, V1> getWeigher() {
        return (com.google.common.cache.Weigher) com.google.common.base.MoreObjects.firstNonNull(this.weigher, com.google.common.cache.CacheBuilder.OneWeigher.INSTANCE);
    }

    public final com.google.common.cache.CacheBuilder<K, V> weakKeys() {
        return setKeyStrength(com.google.common.cache.LocalCache.Strength.WEAK);
    }

    final com.google.common.cache.CacheBuilder<K, V> setKeyStrength(com.google.common.cache.LocalCache.Strength strength) {
        com.google.common.cache.LocalCache.Strength strength2 = this.keyStrength;
        com.google.common.base.Preconditions.checkState(strength2 == null, "Key strength was already set to %s", strength2);
        this.keyStrength = (com.google.common.cache.LocalCache.Strength) com.google.common.base.Preconditions.checkNotNull(strength);
        return this;
    }

    final com.google.common.cache.LocalCache.Strength getKeyStrength() {
        return (com.google.common.cache.LocalCache.Strength) com.google.common.base.MoreObjects.firstNonNull(this.keyStrength, com.google.common.cache.LocalCache.Strength.STRONG);
    }

    public final com.google.common.cache.CacheBuilder<K, V> weakValues() {
        return setValueStrength(com.google.common.cache.LocalCache.Strength.WEAK);
    }

    public final com.google.common.cache.CacheBuilder<K, V> softValues() {
        return setValueStrength(com.google.common.cache.LocalCache.Strength.SOFT);
    }

    final com.google.common.cache.CacheBuilder<K, V> setValueStrength(com.google.common.cache.LocalCache.Strength strength) {
        com.google.common.cache.LocalCache.Strength strength2 = this.valueStrength;
        com.google.common.base.Preconditions.checkState(strength2 == null, "Value strength was already set to %s", strength2);
        this.valueStrength = (com.google.common.cache.LocalCache.Strength) com.google.common.base.Preconditions.checkNotNull(strength);
        return this;
    }

    final com.google.common.cache.LocalCache.Strength getValueStrength() {
        return (com.google.common.cache.LocalCache.Strength) com.google.common.base.MoreObjects.firstNonNull(this.valueStrength, com.google.common.cache.LocalCache.Strength.STRONG);
    }

    public final com.google.common.cache.CacheBuilder<K, V> expireAfterWrite(java.time.Duration duration) {
        return expireAfterWrite(toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public final com.google.common.cache.CacheBuilder<K, V> expireAfterWrite(long j, java.util.concurrent.TimeUnit timeUnit) {
        long j2 = this.expireAfterWriteNanos;
        com.google.common.base.Preconditions.checkState(j2 == -1, "expireAfterWrite was already set to %s ns", j2);
        com.google.common.base.Preconditions.checkArgument(j >= 0, "duration cannot be negative: %s %s", j, timeUnit);
        this.expireAfterWriteNanos = timeUnit.toNanos(j);
        return this;
    }

    final long getExpireAfterWriteNanos() {
        long j = this.expireAfterWriteNanos;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    public final com.google.common.cache.CacheBuilder<K, V> expireAfterAccess(java.time.Duration duration) {
        return expireAfterAccess(toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public final com.google.common.cache.CacheBuilder<K, V> expireAfterAccess(long j, java.util.concurrent.TimeUnit timeUnit) {
        long j2 = this.expireAfterAccessNanos;
        com.google.common.base.Preconditions.checkState(j2 == -1, "expireAfterAccess was already set to %s ns", j2);
        com.google.common.base.Preconditions.checkArgument(j >= 0, "duration cannot be negative: %s %s", j, timeUnit);
        this.expireAfterAccessNanos = timeUnit.toNanos(j);
        return this;
    }

    final long getExpireAfterAccessNanos() {
        long j = this.expireAfterAccessNanos;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    public final com.google.common.cache.CacheBuilder<K, V> refreshAfterWrite(java.time.Duration duration) {
        return refreshAfterWrite(toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public final com.google.common.cache.CacheBuilder<K, V> refreshAfterWrite(long j, java.util.concurrent.TimeUnit timeUnit) {
        com.google.common.base.Preconditions.checkNotNull(timeUnit);
        long j2 = this.refreshNanos;
        com.google.common.base.Preconditions.checkState(j2 == -1, "refresh was already set to %s ns", j2);
        com.google.common.base.Preconditions.checkArgument(j > 0, "duration must be positive: %s %s", j, timeUnit);
        this.refreshNanos = timeUnit.toNanos(j);
        return this;
    }

    final long getRefreshNanos() {
        long j = this.refreshNanos;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    public final com.google.common.cache.CacheBuilder<K, V> ticker(com.google.common.base.Ticker ticker) {
        com.google.common.base.Preconditions.checkState(this.ticker == null);
        this.ticker = (com.google.common.base.Ticker) com.google.common.base.Preconditions.checkNotNull(ticker);
        return this;
    }

    final com.google.common.base.Ticker getTicker(boolean z) {
        com.google.common.base.Ticker ticker = this.ticker;
        return ticker != null ? ticker : z ? com.google.common.base.Ticker.systemTicker() : NULL_TICKER;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K1 extends K, V1 extends V> com.google.common.cache.CacheBuilder<K1, V1> removalListener(com.google.common.cache.RemovalListener<? super K1, ? super V1> removalListener) {
        com.google.common.base.Preconditions.checkState(this.removalListener == null);
        this.removalListener = (com.google.common.cache.RemovalListener) com.google.common.base.Preconditions.checkNotNull(removalListener);
        return this;
    }

    final <K1 extends K, V1 extends V> com.google.common.cache.RemovalListener<K1, V1> getRemovalListener() {
        return (com.google.common.cache.RemovalListener) com.google.common.base.MoreObjects.firstNonNull(this.removalListener, com.google.common.cache.CacheBuilder.NullListener.INSTANCE);
    }

    public final com.google.common.cache.CacheBuilder<K, V> recordStats() {
        this.statsCounterSupplier = CACHE_STATS_COUNTER;
        return this;
    }

    final boolean isRecordingStats() {
        return this.statsCounterSupplier == CACHE_STATS_COUNTER;
    }

    final com.google.common.base.Supplier<? extends com.google.common.cache.AbstractCache.StatsCounter> getStatsCounterSupplier() {
        return this.statsCounterSupplier;
    }

    public final <K1 extends K, V1 extends V> com.google.common.cache.LoadingCache<K1, V1> build(com.google.common.cache.CacheLoader<? super K1, V1> cacheLoader) {
        checkWeightWithWeigher();
        return new com.google.common.cache.LocalCache.LocalLoadingCache(this, cacheLoader);
    }

    public final <K1 extends K, V1 extends V> com.google.common.cache.Cache<K1, V1> build() {
        checkWeightWithWeigher();
        checkNonLoadingCache();
        return new com.google.common.cache.LocalCache.LocalManualCache(this);
    }

    private void checkNonLoadingCache() {
        com.google.common.base.Preconditions.checkState(this.refreshNanos == -1, "refreshAfterWrite requires a LoadingCache");
    }

    private void checkWeightWithWeigher() {
        if (this.weigher == null) {
            com.google.common.base.Preconditions.checkState(this.maximumWeight == -1, "maximumWeight requires weigher");
        } else if (this.strictParsing) {
            com.google.common.base.Preconditions.checkState(this.maximumWeight != -1, "weigher requires maximumWeight");
        } else if (this.maximumWeight == -1) {
            com.google.common.cache.CacheBuilder.LoggerHolder.logger.log(java.util.logging.Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    public final java.lang.String toString() {
        com.google.common.base.MoreObjects.ToStringHelper stringHelper = com.google.common.base.MoreObjects.toStringHelper(this);
        int i = this.initialCapacity;
        if (i != -1) {
            stringHelper.add("initialCapacity", i);
        }
        int i2 = this.concurrencyLevel;
        if (i2 != -1) {
            stringHelper.add("concurrencyLevel", i2);
        }
        long j = this.maximumSize;
        if (j != -1) {
            stringHelper.add("maximumSize", j);
        }
        long j2 = this.maximumWeight;
        if (j2 != -1) {
            stringHelper.add("maximumWeight", j2);
        }
        if (this.expireAfterWriteNanos != -1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.expireAfterWriteNanos);
            sb.append("ns");
            stringHelper.add("expireAfterWrite", sb.toString());
        }
        if (this.expireAfterAccessNanos != -1) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(this.expireAfterAccessNanos);
            sb2.append("ns");
            stringHelper.add("expireAfterAccess", sb2.toString());
        }
        com.google.common.cache.LocalCache.Strength strength = this.keyStrength;
        if (strength != null) {
            stringHelper.add("keyStrength", com.google.common.base.Ascii.toLowerCase(strength.toString()));
        }
        com.google.common.cache.LocalCache.Strength strength2 = this.valueStrength;
        if (strength2 != null) {
            stringHelper.add("valueStrength", com.google.common.base.Ascii.toLowerCase(strength2.toString()));
        }
        if (this.keyEquivalence != null) {
            stringHelper.addValue("keyEquivalence");
        }
        if (this.valueEquivalence != null) {
            stringHelper.addValue("valueEquivalence");
        }
        if (this.removalListener != null) {
            stringHelper.addValue("removalListener");
        }
        return stringHelper.toString();
    }

    private static long toNanosSaturated(java.time.Duration duration) {
        try {
            return duration.toNanos();
        } catch (java.lang.ArithmeticException unused) {
            return duration.isNegative() ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
    }
}
