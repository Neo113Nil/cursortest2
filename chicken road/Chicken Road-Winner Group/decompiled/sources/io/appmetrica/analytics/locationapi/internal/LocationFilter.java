package io.appmetrica.analytics.locationapi.internal;

import kotlin.jvm.internal.f;

/* loaded from: classes.dex */
public final class LocationFilter {

    /* renamed from: a, reason: collision with root package name */
    private final long f8785a;

    /* renamed from: b, reason: collision with root package name */
    private final float f8786b;

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
        return this.f8785a == locationFilter.f8785a && this.f8786b == locationFilter.f8786b;
    }

    public final float getUpdateDistanceInterval() {
        return this.f8786b;
    }

    public final long getUpdateTimeInterval() {
        return this.f8785a;
    }

    public int hashCode() {
        return Float.hashCode(this.f8786b) + (Long.hashCode(this.f8785a) * 31);
    }

    public String toString() {
        return "LocationFilter(updateTimeInterval=" + this.f8785a + ", updateDistanceInterval=" + this.f8786b + ')';
    }

    public LocationFilter(long j3, float f) {
        this.f8785a = j3;
        this.f8786b = f;
    }

    public /* synthetic */ LocationFilter(long j3, float f, int i3, f fVar) {
        this((i3 & 1) != 0 ? 5000L : j3, (i3 & 2) != 0 ? 10.0f : f);
    }
}
