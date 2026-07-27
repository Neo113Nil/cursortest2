package io.appmetrica.analytics.locationapi.internal;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.f;

/* loaded from: classes.dex */
public final class CacheArguments {

    /* renamed from: a, reason: collision with root package name */
    private final long f8783a;

    /* renamed from: b, reason: collision with root package name */
    private final long f8784b;

    public CacheArguments() {
        this(0L, 0L, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!CacheArguments.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.locationapi.internal.CacheArguments");
        }
        CacheArguments cacheArguments = (CacheArguments) obj;
        return this.f8783a == cacheArguments.f8783a && this.f8784b == cacheArguments.f8784b;
    }

    public final long getOutdatedTimeInterval() {
        return this.f8784b;
    }

    public final long getRefreshPeriod() {
        return this.f8783a;
    }

    public int hashCode() {
        return Long.hashCode(this.f8784b) + (Long.hashCode(this.f8783a) * 31);
    }

    public String toString() {
        return "CacheArguments(refreshPeriod=" + this.f8783a + ", outdatedTimeInterval=" + this.f8784b + ')';
    }

    public CacheArguments(long j3, long j4) {
        this.f8783a = j3;
        this.f8784b = j4;
    }

    public /* synthetic */ CacheArguments(long j3, long j4, int i3, f fVar) {
        this((i3 & 1) != 0 ? TimeUnit.SECONDS.toMillis(10L) : j3, (i3 & 2) != 0 ? TimeUnit.MINUTES.toMillis(2L) : j4);
    }
}
