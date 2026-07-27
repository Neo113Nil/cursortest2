package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final LocationFilter f9701a;

    /* renamed from: b, reason: collision with root package name */
    public final CacheArguments f9702b;

    public i(LocationFilter locationFilter, CacheArguments cacheArguments) {
        this.f9701a = locationFilter;
        this.f9702b = cacheArguments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!i.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.location.impl.LocationConfig");
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.i.a(this.f9701a, iVar.f9701a) && kotlin.jvm.internal.i.a(this.f9702b, iVar.f9702b);
    }

    public final int hashCode() {
        return this.f9702b.hashCode() + (this.f9701a.hashCode() * 31);
    }

    public final String toString() {
        return "LocationConfig(locationFilter=" + this.f9701a + ", cacheArguments=" + this.f9702b + ')';
    }

    public /* synthetic */ i() {
        this(new LocationFilter(0L, 0.0f, 3, null), new CacheArguments(0L, 0L, 3, null));
    }
}
