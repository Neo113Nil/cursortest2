package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.x2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0811x2 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.EnumC0785w2 f7073a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Boolean f7074b;

    public C0811x2(io.appmetrica.analytics.impl.EnumC0785w2 enumC0785w2, java.lang.Boolean bool) {
        this.f7073a = enumC0785w2;
        this.f7074b = bool;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || io.appmetrica.analytics.impl.C0811x2.class != obj.getClass()) {
            return false;
        }
        io.appmetrica.analytics.impl.C0811x2 c0811x2 = (io.appmetrica.analytics.impl.C0811x2) obj;
        if (this.f7073a != c0811x2.f7073a) {
            return false;
        }
        java.lang.Boolean bool = this.f7074b;
        return bool != null ? bool.equals(c0811x2.f7074b) : c0811x2.f7074b == null;
    }

    public final int hashCode() {
        io.appmetrica.analytics.impl.EnumC0785w2 enumC0785w2 = this.f7073a;
        int hashCode = (enumC0785w2 != null ? enumC0785w2.hashCode() : 0) * 31;
        java.lang.Boolean bool = this.f7074b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "BackgroundRestrictionsState{mAppStandByBucket=" + this.f7073a + ", mBackgroundRestricted=" + this.f7074b + '}';
    }
}
