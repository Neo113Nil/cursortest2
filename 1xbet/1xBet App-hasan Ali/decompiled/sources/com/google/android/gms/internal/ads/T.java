package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final V f11607a;

    /* renamed from: b, reason: collision with root package name */
    public final V f11608b;

    public T(V v4, V v5) {
        this.f11607a = v4;
        this.f11608b = v5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && T.class == obj.getClass()) {
            T t5 = (T) obj;
            if (this.f11607a.equals(t5.f11607a) && this.f11608b.equals(t5.f11608b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11608b.hashCode() + (this.f11607a.hashCode() * 31);
    }

    public final String toString() {
        V v4 = this.f11607a;
        String v5 = v4.toString();
        V v6 = this.f11608b;
        return "[" + v5 + (v4.equals(v6) ? "" : ", ".concat(v6.toString())) + "]";
    }
}
