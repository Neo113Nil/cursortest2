package com.nimbusds.jose.util.cache;

@net.jcip.annotations.Immutable
/* loaded from: classes10.dex */
public final class CachedObject<V> {
    private final long expirationTime;
    private final V object;
    private final long timestamp;

    public static long computeExpirationTime(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    public CachedObject(V v, long j, long j2) {
        if (v == null) {
            throw new java.lang.IllegalArgumentException("The object must not be null");
        }
        this.object = v;
        this.timestamp = j;
        this.expirationTime = j2;
    }

    public final V get() {
        return this.object;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final long getExpirationTime() {
        return this.expirationTime;
    }

    public final boolean isValid(long j) {
        return j < this.expirationTime;
    }

    public final boolean isExpired(long j) {
        return !isValid(j);
    }
}
