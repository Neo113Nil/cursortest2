package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final LocationFilter f8738a;

    /* renamed from: b, reason: collision with root package name */
    public final CacheArguments f8739b;

    public i(LocationFilter locationFilter, CacheArguments cacheArguments) {
        this.f8738a = locationFilter;
        this.f8739b = cacheArguments;
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
        return kotlin.jvm.internal.j.a(this.f8738a, iVar.f8738a) && kotlin.jvm.internal.j.a(this.f8739b, iVar.f8739b);
    }

    public final int hashCode() {
        return this.f8739b.hashCode() + (this.f8738a.hashCode() * 31);
    }

    public final String toString() {
        return "LocationConfig(locationFilter=" + this.f8738a + ", cacheArguments=" + this.f8739b + ')';
    }

    public /* synthetic */ i() {
        this(new LocationFilter(0L, 0.0f, 3, null), new CacheArguments(0L, 0L, 3, null));
    }
}
