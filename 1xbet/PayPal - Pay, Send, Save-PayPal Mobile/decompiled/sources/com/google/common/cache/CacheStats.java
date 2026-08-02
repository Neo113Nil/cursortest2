package com.google.common.cache;

/* loaded from: classes9.dex */
public final class CacheStats {
    private final long evictionCount;
    private final long hitCount;
    private final long loadExceptionCount;
    private final long loadSuccessCount;
    private final long missCount;
    private final long totalLoadTime;

    public CacheStats(long j, long j2, long j3, long j4, long j5, long j6) {
        com.google.common.base.Preconditions.checkArgument(j >= 0);
        com.google.common.base.Preconditions.checkArgument(j2 >= 0);
        com.google.common.base.Preconditions.checkArgument(j3 >= 0);
        com.google.common.base.Preconditions.checkArgument(j4 >= 0);
        com.google.common.base.Preconditions.checkArgument(j5 >= 0);
        com.google.common.base.Preconditions.checkArgument(j6 >= 0);
        this.hitCount = j;
        this.missCount = j2;
        this.loadSuccessCount = j3;
        this.loadExceptionCount = j4;
        this.totalLoadTime = j5;
        this.evictionCount = j6;
    }

    public final long requestCount() {
        return com.google.common.math.LongMath.saturatedAdd(this.hitCount, this.missCount);
    }

    public final long hitCount() {
        return this.hitCount;
    }

    public final double hitRate() {
        long requestCount = requestCount();
        if (requestCount == 0) {
            return 1.0d;
        }
        return this.hitCount / requestCount;
    }

    public final long missCount() {
        return this.missCount;
    }

    public final double missRate() {
        long requestCount = requestCount();
        if (requestCount == 0) {
            return 0.0d;
        }
        return this.missCount / requestCount;
    }

    public final long loadCount() {
        return com.google.common.math.LongMath.saturatedAdd(this.loadSuccessCount, this.loadExceptionCount);
    }

    public final long loadSuccessCount() {
        return this.loadSuccessCount;
    }

    public final long loadExceptionCount() {
        return this.loadExceptionCount;
    }

    public final double loadExceptionRate() {
        long saturatedAdd = com.google.common.math.LongMath.saturatedAdd(this.loadSuccessCount, this.loadExceptionCount);
        if (saturatedAdd == 0) {
            return 0.0d;
        }
        return this.loadExceptionCount / saturatedAdd;
    }

    public final long totalLoadTime() {
        return this.totalLoadTime;
    }

    public final double averageLoadPenalty() {
        long saturatedAdd = com.google.common.math.LongMath.saturatedAdd(this.loadSuccessCount, this.loadExceptionCount);
        if (saturatedAdd == 0) {
            return 0.0d;
        }
        return this.totalLoadTime / saturatedAdd;
    }

    public final long evictionCount() {
        return this.evictionCount;
    }

    public final com.google.common.cache.CacheStats minus(com.google.common.cache.CacheStats cacheStats) {
        return new com.google.common.cache.CacheStats(java.lang.Math.max(0L, com.google.common.math.LongMath.saturatedSubtract(this.hitCount, cacheStats.hitCount)), java.lang.Math.max(0L, com.google.common.math.LongMath.saturatedSubtract(this.missCount, cacheStats.missCount)), java.lang.Math.max(0L, com.google.common.math.LongMath.saturatedSubtract(this.loadSuccessCount, cacheStats.loadSuccessCount)), java.lang.Math.max(0L, com.google.common.math.LongMath.saturatedSubtract(this.loadExceptionCount, cacheStats.loadExceptionCount)), java.lang.Math.max(0L, com.google.common.math.LongMath.saturatedSubtract(this.totalLoadTime, cacheStats.totalLoadTime)), java.lang.Math.max(0L, com.google.common.math.LongMath.saturatedSubtract(this.evictionCount, cacheStats.evictionCount)));
    }

    public final com.google.common.cache.CacheStats plus(com.google.common.cache.CacheStats cacheStats) {
        return new com.google.common.cache.CacheStats(com.google.common.math.LongMath.saturatedAdd(this.hitCount, cacheStats.hitCount), com.google.common.math.LongMath.saturatedAdd(this.missCount, cacheStats.missCount), com.google.common.math.LongMath.saturatedAdd(this.loadSuccessCount, cacheStats.loadSuccessCount), com.google.common.math.LongMath.saturatedAdd(this.loadExceptionCount, cacheStats.loadExceptionCount), com.google.common.math.LongMath.saturatedAdd(this.totalLoadTime, cacheStats.totalLoadTime), com.google.common.math.LongMath.saturatedAdd(this.evictionCount, cacheStats.evictionCount));
    }

    public final int hashCode() {
        return java.util.Objects.hash(java.lang.Long.valueOf(this.hitCount), java.lang.Long.valueOf(this.missCount), java.lang.Long.valueOf(this.loadSuccessCount), java.lang.Long.valueOf(this.loadExceptionCount), java.lang.Long.valueOf(this.totalLoadTime), java.lang.Long.valueOf(this.evictionCount));
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.common.cache.CacheStats)) {
            return false;
        }
        com.google.common.cache.CacheStats cacheStats = (com.google.common.cache.CacheStats) obj;
        return this.hitCount == cacheStats.hitCount && this.missCount == cacheStats.missCount && this.loadSuccessCount == cacheStats.loadSuccessCount && this.loadExceptionCount == cacheStats.loadExceptionCount && this.totalLoadTime == cacheStats.totalLoadTime && this.evictionCount == cacheStats.evictionCount;
    }

    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("hitCount", this.hitCount).add("missCount", this.missCount).add("loadSuccessCount", this.loadSuccessCount).add("loadExceptionCount", this.loadExceptionCount).add("totalLoadTime", this.totalLoadTime).add("evictionCount", this.evictionCount).toString();
    }
}
