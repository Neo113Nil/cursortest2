package com.vungle.ads.internal;

/* loaded from: classes7.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11947a;
    public final int b;

    public m0(int i, int i2) {
        this.f11947a = i;
        this.b = i2;
    }

    public final int a() {
        return this.f11947a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f11947a == m0Var.f11947a && this.b == m0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f11947a) * 31);
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("Coordinate(x=").append(this.f11947a).append(", y=").append(this.b).append(')').toString();
    }
}
