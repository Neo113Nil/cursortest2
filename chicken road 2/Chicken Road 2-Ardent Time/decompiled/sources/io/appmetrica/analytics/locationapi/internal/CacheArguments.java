package io.appmetrica.analytics.locationapi.internal;

/* loaded from: classes.dex */
public final class CacheArguments {

    /* renamed from: a, reason: collision with root package name */
    private final long f7263a;

    /* renamed from: b, reason: collision with root package name */
    private final long f7264b;

    public CacheArguments() {
        this(0L, 0L, 3, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!io.appmetrica.analytics.locationapi.internal.CacheArguments.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.locationapi.internal.CacheArguments");
        }
        io.appmetrica.analytics.locationapi.internal.CacheArguments cacheArguments = (io.appmetrica.analytics.locationapi.internal.CacheArguments) obj;
        return this.f7263a == cacheArguments.f7263a && this.f7264b == cacheArguments.f7264b;
    }

    public final long getOutdatedTimeInterval() {
        return this.f7264b;
    }

    public final long getRefreshPeriod() {
        return this.f7263a;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f7264b) + (java.lang.Long.hashCode(this.f7263a) * 31);
    }

    public java.lang.String toString() {
        return "CacheArguments(refreshPeriod=" + this.f7263a + ", outdatedTimeInterval=" + this.f7264b + ')';
    }

    public CacheArguments(long j2, long j3) {
        this.f7263a = j2;
        this.f7264b = j3;
    }

    public /* synthetic */ CacheArguments(long j2, long j3, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? java.util.concurrent.TimeUnit.SECONDS.toMillis(10L) : j2, (i2 & 2) != 0 ? java.util.concurrent.TimeUnit.MINUTES.toMillis(2L) : j3);
    }
}
