package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.s4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0820s4 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8282a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8283b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8284c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8285d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8286e;
    public final Boolean f;

    public C0820s4(C0769q4 c0769q4) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Boolean bool;
        z3 = c0769q4.f8111a;
        this.f8282a = z3;
        z4 = c0769q4.f8112b;
        this.f8283b = z4;
        z5 = c0769q4.f8113c;
        this.f8284c = z5;
        z6 = c0769q4.f8114d;
        this.f8285d = z6;
        z7 = c0769q4.f8115e;
        this.f8286e = z7;
        bool = c0769q4.f;
        this.f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0820s4.class == obj.getClass()) {
            C0820s4 c0820s4 = (C0820s4) obj;
            if (this.f8282a != c0820s4.f8282a || this.f8283b != c0820s4.f8283b || this.f8284c != c0820s4.f8284c || this.f8285d != c0820s4.f8285d || this.f8286e != c0820s4.f8286e) {
                return false;
            }
            Boolean bool = this.f;
            Boolean bool2 = c0820s4.f;
            if (bool != null) {
                return bool.equals(bool2);
            }
            if (bool2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = (((((((((this.f8282a ? 1 : 0) * 31) + (this.f8283b ? 1 : 0)) * 31) + (this.f8284c ? 1 : 0)) * 31) + (this.f8285d ? 1 : 0)) * 31) + (this.f8286e ? 1 : 0)) * 31;
        Boolean bool = this.f;
        return i3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "CollectingFlags{permissionsCollectingEnabled=" + this.f8282a + ", featuresCollectingEnabled=" + this.f8283b + ", googleAid=" + this.f8284c + ", simInfo=" + this.f8285d + ", huaweiOaid=" + this.f8286e + ", sslPinning=" + this.f + '}';
    }
}
