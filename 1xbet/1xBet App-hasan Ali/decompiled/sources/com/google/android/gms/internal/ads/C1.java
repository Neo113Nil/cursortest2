package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class C1 implements H1 {

    /* renamed from: k, reason: collision with root package name */
    public final G1 f7930k;

    /* renamed from: l, reason: collision with root package name */
    public final long f7931l;

    /* renamed from: m, reason: collision with root package name */
    public final long f7932m;

    /* renamed from: n, reason: collision with root package name */
    public final J1 f7933n;

    /* renamed from: o, reason: collision with root package name */
    public int f7934o;

    /* renamed from: p, reason: collision with root package name */
    public long f7935p;

    /* renamed from: q, reason: collision with root package name */
    public long f7936q;

    /* renamed from: r, reason: collision with root package name */
    public long f7937r;

    /* renamed from: s, reason: collision with root package name */
    public long f7938s;

    /* renamed from: t, reason: collision with root package name */
    public long f7939t;

    /* renamed from: u, reason: collision with root package name */
    public long f7940u;

    /* renamed from: v, reason: collision with root package name */
    public long f7941v;

    public C1(J1 j12, long j5, long j6, long j7, long j8, boolean z3) {
        AbstractC1668us.S(j5 >= 0 && j6 > j5);
        this.f7933n = j12;
        this.f7931l = j5;
        this.f7932m = j6;
        if (j7 == j6 - j5 || z3) {
            this.f7935p = j8;
            this.f7934o = 4;
        } else {
            this.f7934o = 0;
        }
        this.f7930k = new G1();
    }

    @Override // com.google.android.gms.internal.ads.H1
    public final /* bridge */ /* synthetic */ U b() {
        if (this.f7935p != 0) {
            return new B1(this);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.H1
    public final void c(long j5) {
        this.f7937r = Math.max(0L, Math.min(j5, this.f7935p - 1));
        this.f7934o = 2;
        this.f7938s = this.f7931l;
        this.f7939t = this.f7932m;
        this.f7940u = 0L;
        this.f7941v = this.f7935p;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    @Override // com.google.android.gms.internal.ads.H1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long g(B b3) {
        G1 g12;
        long j5;
        long j6;
        long j7;
        G1 g13;
        long max;
        long j8;
        G1 g14;
        int i = this.f7934o;
        long j9 = this.f7932m;
        G1 g15 = this.f7930k;
        if (i == 0) {
            g12 = g15;
            j5 = 0;
            long j10 = b3.f7752n;
            this.f7936q = j10;
            this.f7934o = 1;
            long j11 = (-65307) + j9;
            if (j11 > j10) {
                return j11;
            }
        } else if (i != 1) {
            if (i == 2) {
                j6 = 2;
                long j12 = this.f7938s;
                long j13 = this.f7939t;
                if (j12 != j13) {
                    long j14 = b3.f7752n;
                    if (g15.b(b3, j13)) {
                        g15.a(b3, false);
                        b3.f7754p = 0;
                        long j15 = this.f7937r;
                        long j16 = g15.f9153b;
                        long j17 = j15 - j16;
                        int i5 = g15.f9155d + g15.f9156e;
                        if (j17 < 0 || j17 >= 72000) {
                            if (j17 < 0) {
                                this.f7939t = j14;
                                this.f7941v = j16;
                                j7 = -1;
                            } else {
                                j7 = -1;
                                this.f7938s = b3.f7752n + i5;
                                this.f7940u = j16;
                            }
                            long j18 = this.f7939t;
                            long j19 = this.f7938s;
                            long j20 = j18 - j19;
                            if (j20 < 100000) {
                                this.f7939t = j19;
                                max = j19;
                            } else {
                                long j21 = i5;
                                long j22 = j17 <= 0 ? 2L : 1L;
                                g13 = g15;
                                long j23 = b3.f7752n;
                                Long.signum(j21);
                                max = Math.max(j19, Math.min(((j17 * j20) / (this.f7941v - this.f7940u)) + (j23 - (j21 * j22)), j18 + j7));
                                if (max != j7) {
                                    return max;
                                }
                                this.f7934o = 3;
                                j8 = j7;
                                g14 = g13;
                            }
                        }
                    } else {
                        max = this.f7938s;
                        if (max == j14) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j7 = -1;
                    }
                    g13 = g15;
                    if (max != j7) {
                    }
                }
                max = -1;
                j7 = -1;
                g13 = g15;
                if (max != j7) {
                }
            } else {
                if (i != 3) {
                    return -1L;
                }
                j8 = -1;
                g14 = g15;
                j6 = 2;
            }
            while (true) {
                g14.b(b3, j8);
                g14.a(b3, false);
                if (g14.f9153b > this.f7937r) {
                    b3.f7754p = 0;
                    this.f7934o = 4;
                    return -(this.f7940u + j6);
                }
                b3.k(g14.f9155d + g14.f9156e);
                this.f7938s = b3.f7752n;
                this.f7940u = g14.f9153b;
                j8 = -1;
            }
        } else {
            g12 = g15;
            j5 = 0;
        }
        g12.f9152a = 0;
        g12.f9153b = j5;
        g12.f9154c = 0;
        g12.f9155d = 0;
        g12.f9156e = 0;
        if (!g12.b(b3, -1L)) {
            throw new EOFException();
        }
        g12.a(b3, false);
        b3.k(g12.f9155d + g12.f9156e);
        long j24 = g12.f9153b;
        while ((g12.f9152a & 4) != 4 && g12.b(b3, -1L) && b3.f7752n < j9 && g12.a(b3, true)) {
            try {
                b3.k(g12.f9155d + g12.f9156e);
                j24 = g12.f9153b;
            } catch (EOFException unused) {
            }
        }
        this.f7935p = j24;
        this.f7934o = 4;
        return this.f7936q;
    }
}
