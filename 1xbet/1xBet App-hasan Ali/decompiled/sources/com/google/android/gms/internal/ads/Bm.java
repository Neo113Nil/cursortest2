package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Bm {

    /* renamed from: c, reason: collision with root package name */
    public static final Bm f7876c = new Bm(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f7877a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7878b;

    static {
        new Bm(0, 0);
    }

    public Bm(int i, int i5) {
        boolean z3 = false;
        if ((i == -1 || i >= 0) && (i5 == -1 || i5 >= 0)) {
            z3 = true;
        }
        AbstractC1668us.S(z3);
        this.f7877a = i;
        this.f7878b = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Bm) {
            Bm bm = (Bm) obj;
            if (this.f7877a == bm.f7877a && this.f7878b == bm.f7878b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f7877a;
        return ((i >>> 16) | (i << 16)) ^ this.f7878b;
    }

    public final String toString() {
        return this.f7877a + "x" + this.f7878b;
    }
}
