package com.google.common.cache;

@com.google.common.cache.ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public final class CacheStats {
    private final long evictionCount;
    private final long hitCount;
    private final long loadExceptionCount;
    private final long loadSuccessCount;
    private final long missCount;
    private final long totalLoadTime;

    public CacheStats(long hitCount, long missCount, long loadSuccessCount, long loadExceptionCount, long totalLoadTime, long evictionCount) {
        com.google.common.base.Preconditions.checkArgument(hitCount >= 0);
        com.google.common.base.Preconditions.checkArgument(missCount >= 0);
        com.google.common.base.Preconditions.checkArgument(loadSuccessCount >= 0);
        com.google.common.base.Preconditions.checkArgument(loadExceptionCount >= 0);
        com.google.common.base.Preconditions.checkArgument(totalLoadTime >= 0);
        com.google.common.base.Preconditions.checkArgument(evictionCount >= 0);
        this.hitCount = hitCount;
        this.missCount = missCount;
        this.loadSuccessCount = loadSuccessCount;
        this.loadExceptionCount = loadExceptionCount;
        this.totalLoadTime = totalLoadTime;
        this.evictionCount = evictionCount;
    }

    public long requestCount() {
        return com.google.common.math.LongMath.saturatedAdd(this.hitCount, this.missCount);
    }

    public long hitCount() {
        return this.hitCount;
    }

    public double hitRate() {
        long requestCount = requestCount();
        if (requestCount == 0) {
            return 1.0d;
        }
        return this.hitCount / requestCount;
    }

    public long missCount() {
        return this.missCount;
    }

    public double missRate() {
        long requestCount = requestCount();
        if (requestCount == 0) {
            return 0.0d;
        }
        return this.missCount / requestCount;
    }

    public long loadCount() {
        return com.google.common.math.LongMath.saturatedAdd(this.loadSuccessCount, this.loadExceptionCount);
    }

    public long loadSuccessCount() {
        return this.loadSuccessCount;
    }

    public long loadExceptionCount() {
        return this.loadExceptionCount;
    }

    public double loadExceptionRate() {
        long saturatedAdd = com.google.common.math.LongMath.saturatedAdd(this.loadSuccessCount, this.loadExceptionCount);
        if (saturatedAdd == 0) {
            return 0.0d;
        }
        return this.loadExceptionCount / saturatedAdd;
    }

    public long totalLoadTime() {
        return this.totalLoadTime;
    }

    public double averageLoadPenalty() {
        long saturatedAdd = com.google.common.math.LongMath.saturatedAdd(this.loadSuccessCount, this.loadExceptionCount);
        if (saturatedAdd == 0) {
            return 0.0d;
        }
        return this.totalLoadTime / saturatedAdd;
    }

    public long evictionCount() {
        return this.evictionCount;
    }

    public com.google.common.cache.CacheStats minus(com.google.common.cache.CacheStats other) {
        return new com.google.common.cache.CacheStats(java.lang.Math.max(0L, com.google.common.math.LongMath.saturatedSubtract(this.hitCount, other.hitCount)), java.lang.Math.max(0L, com.google.common.math.LongMath.saturatedSubtract(this.missCount, other.missCount)), java.lang.Math.max(0L, com.google.common.math.LongMath.saturatedSubtract(this.loadSuccessCount, other.loadSuccessCount)), java.lang.Math.max(0L, com.google.common.math.LongMath.saturatedSubtract(this.loadExceptionCount, other.loadExceptionCount)), java.lang.Math.max(0L, com.google.common.math.LongMath.saturatedSubtract(this.totalLoadTime, other.totalLoadTime)), java.lang.Math.max(0L, com.google.common.math.LongMath.saturatedSubtract(this.evictionCount, other.evictionCount)));
    }

    public com.google.common.cache.CacheStats plus(com.google.common.cache.CacheStats other) {
        return new com.google.common.cache.CacheStats(com.google.common.math.LongMath.saturatedAdd(this.hitCount, other.hitCount), com.google.common.math.LongMath.saturatedAdd(this.missCount, other.missCount), com.google.common.math.LongMath.saturatedAdd(this.loadSuccessCount, other.loadSuccessCount), com.google.common.math.LongMath.saturatedAdd(this.loadExceptionCount, other.loadExceptionCount), com.google.common.math.LongMath.saturatedAdd(this.totalLoadTime, other.totalLoadTime), com.google.common.math.LongMath.saturatedAdd(this.evictionCount, other.evictionCount));
    }

    public int hashCode() {
        return com.google.common.base.Objects.hashCode(java.lang.Long.valueOf(this.hitCount), java.lang.Long.valueOf(this.missCount), java.lang.Long.valueOf(this.loadSuccessCount), java.lang.Long.valueOf(this.loadExceptionCount), java.lang.Long.valueOf(this.totalLoadTime), java.lang.Long.valueOf(this.evictionCount));
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (!(object instanceof com.google.common.cache.CacheStats)) {
            return false;
        }
        com.google.common.cache.CacheStats cacheStats = (com.google.common.cache.CacheStats) object;
        return this.hitCount == cacheStats.hitCount && this.missCount == cacheStats.missCount && this.loadSuccessCount == cacheStats.loadSuccessCount && this.loadExceptionCount == cacheStats.loadExceptionCount && this.totalLoadTime == cacheStats.totalLoadTime && this.evictionCount == cacheStats.evictionCount;
    }

    public java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("hitCount", this.hitCount).add("missCount", this.missCount).add("loadSuccessCount", this.loadSuccessCount).add("loadExceptionCount", this.loadExceptionCount).add("totalLoadTime", this.totalLoadTime).add("evictionCount", this.evictionCount).toString();
    }
}
