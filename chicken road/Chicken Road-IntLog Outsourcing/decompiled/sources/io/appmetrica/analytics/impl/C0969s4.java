package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.s4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0969s4 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9228a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9229b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9230c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9231d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9232e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f9233f;

    public C0969s4(C0918q4 c0918q4) {
        boolean z;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Boolean bool;
        z = c0918q4.f9049a;
        this.f9228a = z;
        z5 = c0918q4.f9050b;
        this.f9229b = z5;
        z6 = c0918q4.f9051c;
        this.f9230c = z6;
        z7 = c0918q4.f9052d;
        this.f9231d = z7;
        z8 = c0918q4.f9053e;
        this.f9232e = z8;
        bool = c0918q4.f9054f;
        this.f9233f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0969s4.class != obj.getClass()) {
            return false;
        }
        C0969s4 c0969s4 = (C0969s4) obj;
        if (this.f9228a != c0969s4.f9228a || this.f9229b != c0969s4.f9229b || this.f9230c != c0969s4.f9230c || this.f9231d != c0969s4.f9231d || this.f9232e != c0969s4.f9232e) {
            return false;
        }
        Boolean bool = this.f9233f;
        Boolean bool2 = c0969s4.f9233f;
        return bool != null ? bool.equals(bool2) : bool2 == null;
    }

    public final int hashCode() {
        int i2 = (((((((((this.f9228a ? 1 : 0) * 31) + (this.f9229b ? 1 : 0)) * 31) + (this.f9230c ? 1 : 0)) * 31) + (this.f9231d ? 1 : 0)) * 31) + (this.f9232e ? 1 : 0)) * 31;
        Boolean bool = this.f9233f;
        return i2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "CollectingFlags{permissionsCollectingEnabled=" + this.f9228a + ", featuresCollectingEnabled=" + this.f9229b + ", googleAid=" + this.f9230c + ", simInfo=" + this.f9231d + ", huaweiOaid=" + this.f9232e + ", sslPinning=" + this.f9233f + '}';
    }
}
