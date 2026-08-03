package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.l4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0502l4 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6323a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6324b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6325c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6326d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6327e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Boolean f6328f;

    public C0502l4(io.appmetrica.analytics.impl.C0450j4 c0450j4) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        java.lang.Boolean bool;
        z2 = c0450j4.f6153a;
        this.f6323a = z2;
        z3 = c0450j4.f6154b;
        this.f6324b = z3;
        z4 = c0450j4.f6155c;
        this.f6325c = z4;
        z5 = c0450j4.f6156d;
        this.f6326d = z5;
        z6 = c0450j4.f6157e;
        this.f6327e = z6;
        bool = c0450j4.f6158f;
        this.f6328f = bool;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || io.appmetrica.analytics.impl.C0502l4.class != obj.getClass()) {
            return false;
        }
        io.appmetrica.analytics.impl.C0502l4 c0502l4 = (io.appmetrica.analytics.impl.C0502l4) obj;
        if (this.f6323a != c0502l4.f6323a || this.f6324b != c0502l4.f6324b || this.f6325c != c0502l4.f6325c || this.f6326d != c0502l4.f6326d || this.f6327e != c0502l4.f6327e) {
            return false;
        }
        java.lang.Boolean bool = this.f6328f;
        java.lang.Boolean bool2 = c0502l4.f6328f;
        return bool != null ? bool.equals(bool2) : bool2 == null;
    }

    public final int hashCode() {
        int i2 = (((((((((this.f6323a ? 1 : 0) * 31) + (this.f6324b ? 1 : 0)) * 31) + (this.f6325c ? 1 : 0)) * 31) + (this.f6326d ? 1 : 0)) * 31) + (this.f6327e ? 1 : 0)) * 31;
        java.lang.Boolean bool = this.f6328f;
        return i2 + (bool != null ? bool.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "CollectingFlags{permissionsCollectingEnabled=" + this.f6323a + ", featuresCollectingEnabled=" + this.f6324b + ", googleAid=" + this.f6325c + ", simInfo=" + this.f6326d + ", huaweiOaid=" + this.f6327e + ", sslPinning=" + this.f6328f + '}';
    }
}
