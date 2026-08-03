package io.appmetrica.analytics.location.impl;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.locationapi.internal.LocationFilter f7215a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.locationapi.internal.CacheArguments f7216b;

    public i(io.appmetrica.analytics.locationapi.internal.LocationFilter locationFilter, io.appmetrica.analytics.locationapi.internal.CacheArguments cacheArguments) {
        this.f7215a = locationFilter;
        this.f7216b = cacheArguments;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!io.appmetrica.analytics.location.impl.i.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.location.impl.LocationConfig");
        }
        io.appmetrica.analytics.location.impl.i iVar = (io.appmetrica.analytics.location.impl.i) obj;
        return kotlin.jvm.internal.i.a(this.f7215a, iVar.f7215a) && kotlin.jvm.internal.i.a(this.f7216b, iVar.f7216b);
    }

    public final int hashCode() {
        return this.f7216b.hashCode() + (this.f7215a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "LocationConfig(locationFilter=" + this.f7215a + ", cacheArguments=" + this.f7216b + ')';
    }

    public /* synthetic */ i() {
        this(new io.appmetrica.analytics.locationapi.internal.LocationFilter(0L, 0.0f, 3, null), new io.appmetrica.analytics.locationapi.internal.CacheArguments(0L, 0L, 3, null));
    }
}
