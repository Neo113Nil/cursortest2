package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1603tG {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15679a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15680b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15681c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15682d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15683e;

    public C1603tG(Object obj, int i, int i5, long j5, int i6) {
        this.f15679a = obj;
        this.f15680b = i;
        this.f15681c = i5;
        this.f15682d = j5;
        this.f15683e = i6;
    }

    public final C1603tG a(Object obj) {
        return this.f15679a.equals(obj) ? this : new C1603tG(obj, this.f15680b, this.f15681c, this.f15682d, this.f15683e);
    }

    public final boolean b() {
        return this.f15680b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1603tG)) {
            return false;
        }
        C1603tG c1603tG = (C1603tG) obj;
        return this.f15679a.equals(c1603tG.f15679a) && this.f15680b == c1603tG.f15680b && this.f15681c == c1603tG.f15681c && this.f15682d == c1603tG.f15682d && this.f15683e == c1603tG.f15683e;
    }

    public final int hashCode() {
        return ((((((((this.f15679a.hashCode() + 527) * 31) + this.f15680b) * 31) + this.f15681c) * 31) + ((int) this.f15682d)) * 31) + this.f15683e;
    }

    public C1603tG(Object obj, long j5) {
        this(obj, -1, -1, j5, -1);
    }

    public C1603tG(int i, long j5, Object obj) {
        this(obj, -1, -1, j5, i);
    }
}
