package io.appmetrica.analytics.locationapi.internal;

import kotlin.jvm.internal.f;

/* loaded from: classes.dex */
public final class LocationFilter {

    /* renamed from: a, reason: collision with root package name */
    private final long f5387a;

    /* renamed from: b, reason: collision with root package name */
    private final float f5388b;

    public LocationFilter() {
        this(0L, 0.0f, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!LocationFilter.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.locationapi.internal.LocationFilter");
        }
        LocationFilter locationFilter = (LocationFilter) obj;
        return this.f5387a == locationFilter.f5387a && this.f5388b == locationFilter.f5388b;
    }

    public final float getUpdateDistanceInterval() {
        return this.f5388b;
    }

    public final long getUpdateTimeInterval() {
        return this.f5387a;
    }

    public int hashCode() {
        return Float.hashCode(this.f5388b) + (Long.hashCode(this.f5387a) * 31);
    }

    public String toString() {
        return "LocationFilter(updateTimeInterval=" + this.f5387a + ", updateDistanceInterval=" + this.f5388b + ')';
    }

    public LocationFilter(long j2, float f2) {
        this.f5387a = j2;
        this.f5388b = f2;
    }

    public /* synthetic */ LocationFilter(long j2, float f2, int i2, f fVar) {
        this((i2 & 1) != 0 ? 5000L : j2, (i2 & 2) != 0 ? 10.0f : f2);
    }
}
