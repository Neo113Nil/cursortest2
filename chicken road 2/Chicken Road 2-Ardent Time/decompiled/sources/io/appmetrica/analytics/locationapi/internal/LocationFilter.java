package io.appmetrica.analytics.locationapi.internal;

/* loaded from: classes.dex */
public final class LocationFilter {

    /* renamed from: a, reason: collision with root package name */
    private final long f7265a;

    /* renamed from: b, reason: collision with root package name */
    private final float f7266b;

    public LocationFilter() {
        this(0L, 0.0f, 3, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!io.appmetrica.analytics.locationapi.internal.LocationFilter.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.locationapi.internal.LocationFilter");
        }
        io.appmetrica.analytics.locationapi.internal.LocationFilter locationFilter = (io.appmetrica.analytics.locationapi.internal.LocationFilter) obj;
        return this.f7265a == locationFilter.f7265a && this.f7266b == locationFilter.f7266b;
    }

    public final float getUpdateDistanceInterval() {
        return this.f7266b;
    }

    public final long getUpdateTimeInterval() {
        return this.f7265a;
    }

    public int hashCode() {
        return java.lang.Float.hashCode(this.f7266b) + (java.lang.Long.hashCode(this.f7265a) * 31);
    }

    public java.lang.String toString() {
        return "LocationFilter(updateTimeInterval=" + this.f7265a + ", updateDistanceInterval=" + this.f7266b + ')';
    }

    public LocationFilter(long j2, float f2) {
        this.f7265a = j2;
        this.f7266b = f2;
    }

    public /* synthetic */ LocationFilter(long j2, float f2, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? 5000L : j2, (i2 & 2) != 0 ? 10.0f : f2);
    }
}
