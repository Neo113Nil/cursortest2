package com.pgl.ssdk;

/* loaded from: classes7.dex */
public final class o<A, B> {

    /* renamed from: a, reason: collision with root package name */
    private final A f11640a;
    private final B b;

    public o(A a2, B b) {
        this.f11640a = a2;
        this.b = b;
    }

    public static <A, B> o<A, B> a(A a2, B b) {
        return new o<>(a2, b);
    }

    public A a() {
        return this.f11640a;
    }

    public B b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        A a2 = this.f11640a;
        if (a2 == null) {
            if (oVar.f11640a != null) {
                return false;
            }
        } else if (!a2.equals(oVar.f11640a)) {
            return false;
        }
        B b = this.b;
        B b2 = oVar.b;
        if (b == null) {
            if (b2 != null) {
                return false;
            }
        } else if (!b.equals(b2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        A a2 = this.f11640a;
        int hashCode = ((a2 == null ? 0 : a2.hashCode()) + 31) * 31;
        B b = this.b;
        return hashCode + (b != null ? b.hashCode() : 0);
    }
}
