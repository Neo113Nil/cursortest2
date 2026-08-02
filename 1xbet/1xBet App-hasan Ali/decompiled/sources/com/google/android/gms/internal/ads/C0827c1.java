package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0827c1 implements InterfaceC1006g1, U {

    /* renamed from: a, reason: collision with root package name */
    public final long f12947a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12948b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12949c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12950d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12951e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final long f12952g;

    /* renamed from: h, reason: collision with root package name */
    public final int f12953h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final long f12954j;

    public C0827c1(int i, int i5, long j5, long j6) {
        long max;
        this.f12947a = j5;
        this.f12948b = j6;
        this.f12949c = i5 == -1 ? 1 : i5;
        this.f12951e = i;
        if (j5 == -1) {
            this.f12950d = -1L;
            max = -9223372036854775807L;
        } else {
            long j7 = j5 - j6;
            this.f12950d = j7;
            max = (Math.max(0L, j7) * 8000000) / i;
        }
        this.f = max;
        this.f12952g = j6;
        this.f12953h = i;
        this.i = i5;
        this.f12954j = j5 == -1 ? -1L : j5;
    }

    @Override // com.google.android.gms.internal.ads.U
    public final long a() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1006g1
    public final long b(long j5) {
        return (Math.max(0L, j5 - this.f12948b) * 8000000) / this.f12951e;
    }

    @Override // com.google.android.gms.internal.ads.U
    public final T c(long j5) {
        long j6 = this.f12950d;
        long j7 = this.f12948b;
        if (j6 == -1) {
            V v4 = new V(0L, j7);
            return new T(v4, v4);
        }
        int i = this.f12951e;
        long j8 = this.f12949c;
        long j9 = (((i * j5) / 8000000) / j8) * j8;
        if (j6 != -1) {
            j9 = Math.min(j9, j6 - j8);
        }
        long max = Math.max(j9, 0L) + j7;
        long max2 = (Math.max(0L, max - j7) * 8000000) / i;
        V v5 = new V(max2, max);
        if (j6 != -1 && max2 < j5) {
            long j10 = max + j8;
            if (j10 < this.f12947a) {
                return new T(v5, new V((Math.max(0L, j10 - j7) * 8000000) / i, j10));
            }
        }
        return new T(v5, v5);
    }

    @Override // com.google.android.gms.internal.ads.U
    public final boolean g() {
        return this.f12950d != -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1006g1
    public final int i() {
        return this.f12953h;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1006g1
    public final long j() {
        return this.f12954j;
    }
}
