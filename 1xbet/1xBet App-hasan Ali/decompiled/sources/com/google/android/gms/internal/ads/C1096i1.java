package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1096i1 implements InterfaceC1006g1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f13857a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13858b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13859c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13860d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13861e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f13862g;

    public C1096i1(long j5, int i, long j6, int i5, long j7, long[] jArr) {
        this.f13857a = j5;
        this.f13858b = i;
        this.f13859c = j6;
        this.f13860d = i5;
        this.f13861e = j7;
        this.f13862g = jArr;
        this.f = j7 != -1 ? j5 + j7 : -1L;
    }

    @Override // com.google.android.gms.internal.ads.U
    public final long a() {
        return this.f13859c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1006g1
    public final long b(long j5) {
        if (!g()) {
            return 0L;
        }
        long j6 = j5 - this.f13857a;
        if (j6 <= this.f13858b) {
            return 0L;
        }
        long[] jArr = this.f13862g;
        AbstractC1668us.F(jArr);
        double d5 = (j6 * 256.0d) / this.f13861e;
        int j7 = AbstractC1260lo.j(jArr, (long) d5, true);
        long j8 = this.f13859c;
        long j9 = (j7 * j8) / 100;
        long j10 = jArr[j7];
        int i = j7 + 1;
        long j11 = (j8 * i) / 100;
        return Math.round((j10 == (j7 == 99 ? 256L : jArr[i]) ? 0.0d : (d5 - j10) / (r0 - j10)) * (j11 - j9)) + j9;
    }

    @Override // com.google.android.gms.internal.ads.U
    public final T c(long j5) {
        double d5;
        double d6;
        boolean g5 = g();
        int i = this.f13858b;
        long j6 = this.f13857a;
        if (!g5) {
            V v4 = new V(0L, j6 + i);
            return new T(v4, v4);
        }
        long j7 = this.f13859c;
        long max = Math.max(0L, Math.min(j5, j7));
        double d7 = (max * 100.0d) / j7;
        double d8 = 0.0d;
        if (d7 <= 0.0d) {
            d5 = 256.0d;
        } else if (d7 >= 100.0d) {
            d5 = 256.0d;
            d8 = 256.0d;
        } else {
            int i5 = (int) d7;
            long[] jArr = this.f13862g;
            AbstractC1668us.F(jArr);
            double d9 = jArr[i5];
            if (i5 == 99) {
                d5 = 256.0d;
                d6 = 256.0d;
            } else {
                d5 = 256.0d;
                d6 = jArr[i5 + 1];
            }
            d8 = ((d6 - d9) * (d7 - i5)) + d9;
        }
        long j8 = this.f13861e;
        V v5 = new V(max, Math.max(i, Math.min(Math.round((d8 / d5) * j8), j8 - 1)) + j6);
        return new T(v5, v5);
    }

    @Override // com.google.android.gms.internal.ads.U
    public final boolean g() {
        return this.f13862g != null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1006g1
    public final int i() {
        return this.f13860d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1006g1
    public final long j() {
        return this.f;
    }
}
