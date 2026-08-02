package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class H2 implements F2 {

    /* renamed from: q, reason: collision with root package name */
    public static final double[] f9300q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f9301a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0737a0 f9302b;

    /* renamed from: c, reason: collision with root package name */
    public final C0709Wb f9303c;

    /* renamed from: d, reason: collision with root package name */
    public final C1617tm f9304d;

    /* renamed from: e, reason: collision with root package name */
    public final T2 f9305e;
    public final boolean[] f = new boolean[4];

    /* renamed from: g, reason: collision with root package name */
    public final G2 f9306g;

    /* renamed from: h, reason: collision with root package name */
    public long f9307h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9308j;

    /* renamed from: k, reason: collision with root package name */
    public long f9309k;

    /* renamed from: l, reason: collision with root package name */
    public long f9310l;

    /* renamed from: m, reason: collision with root package name */
    public long f9311m;

    /* renamed from: n, reason: collision with root package name */
    public long f9312n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9313o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9314p;

    public H2(C0709Wb c0709Wb) {
        C1617tm c1617tm;
        this.f9303c = c0709Wb;
        G2 g22 = new G2();
        g22.f9162d = new byte[128];
        this.f9306g = g22;
        if (c0709Wb != null) {
            this.f9305e = new T2(178);
            c1617tm = new C1617tm();
        } else {
            c1617tm = null;
            this.f9305e = null;
        }
        this.f9304d = c1617tm;
        this.f9310l = -9223372036854775807L;
        this.f9312n = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void b() {
        AbstractC1668us.f0(this.f);
        G2 g22 = this.f9306g;
        g22.f9159a = false;
        g22.f9160b = 0;
        g22.f9161c = 0;
        T2 t22 = this.f9305e;
        if (t22 != null) {
            t22.c();
        }
        this.f9307h = 0L;
        this.i = false;
        this.f9310l = -9223372036854775807L;
        this.f9312n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f2  */
    @Override // com.google.android.gms.internal.ads.F2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C1617tm c1617tm) {
        G2 g22;
        T2 t22;
        char c5;
        int i;
        int i5;
        long j5;
        boolean z3;
        boolean z5;
        long j6;
        int i6;
        float f;
        int i7;
        int i8;
        char c6 = 3;
        AbstractC1668us.F(this.f9302b);
        int i9 = c1617tm.f15725b;
        int i10 = c1617tm.f15726c;
        byte[] bArr = c1617tm.f15724a;
        this.f9307h += c1617tm.o();
        this.f9302b.c(c1617tm.o(), c1617tm);
        while (true) {
            int e3 = AbstractC1668us.e(bArr, i9, i10, this.f);
            g22 = this.f9306g;
            t22 = this.f9305e;
            if (e3 == i10) {
                break;
            }
            int i11 = e3 + 3;
            int i12 = c1617tm.f15724a[i11] & 255;
            int i13 = e3 - i9;
            if (this.f9308j) {
                c5 = c6;
            } else {
                if (i13 > 0) {
                    g22.a(bArr, i9, e3);
                }
                int i14 = i13 < 0 ? -i13 : 0;
                if (g22.f9159a) {
                    int i15 = g22.f9160b - i14;
                    g22.f9160b = i15;
                    if (g22.f9161c == 0 && i12 == 181) {
                        g22.f9161c = i15;
                    } else {
                        g22.f9159a = false;
                        String str = this.f9301a;
                        str.getClass();
                        byte[] copyOf = Arrays.copyOf(g22.f9162d, g22.f9160b);
                        int i16 = copyOf[4] & 255;
                        byte b3 = copyOf[5];
                        int i17 = copyOf[6] & 255;
                        int i18 = (i16 << 4) | ((b3 & 255) >> 4);
                        int i19 = (copyOf[7] & 240) >> 4;
                        int i20 = ((b3 & 15) << 8) | i17;
                        if (i19 != 2) {
                            if (i19 == 3) {
                                i7 = i20 * 16;
                                i8 = i18 * 9;
                            } else if (i19 != 4) {
                                f = 1.0f;
                            } else {
                                i7 = i20 * 121;
                                i8 = i18 * 100;
                            }
                            f = i7 / i8;
                        } else {
                            f = (i20 * 4) / (i18 * 3);
                        }
                        C1649uH c1649uH = new C1649uH();
                        c1649uH.f15839a = str;
                        c1649uH.c("video/mpeg2");
                        c1649uH.f15855s = i18;
                        c1649uH.f15856t = i20;
                        c1649uH.f15859w = f;
                        c1649uH.f15851o = Collections.singletonList(copyOf);
                        C1407p c1407p = new C1407p(c1649uH);
                        int i21 = (copyOf[7] & 15) - 1;
                        long j7 = 0;
                        if (i21 >= 0 && i21 < 8) {
                            double d5 = f9300q[i21];
                            byte b5 = copyOf[g22.f9161c + 9];
                            int i22 = (b5 & 96) >> 5;
                            if (i22 != (b5 & 31)) {
                                d5 = ((i22 + 1.0d) / (r5 + 1)) * d5;
                            }
                            j7 = (long) (1000000.0d / d5);
                        }
                        Pair create = Pair.create(c1407p, Long.valueOf(j7));
                        this.f9302b.e((C1407p) create.first);
                        this.f9309k = ((Long) create.second).longValue();
                        this.f9308j = true;
                        c5 = 3;
                    }
                } else if (i12 == 179) {
                    g22.f9159a = true;
                }
                c5 = 3;
                g22.a(G2.f9158e, 0, 3);
            }
            if (t22 != null) {
                if (i13 > 0) {
                    t22.b(bArr, i9, e3);
                    i6 = 0;
                } else {
                    i6 = -i13;
                }
                if (t22.e(i6)) {
                    int v4 = AbstractC1668us.v(t22.f11618d, (byte[]) t22.f11619e);
                    int i23 = AbstractC1260lo.f14419a;
                    byte[] bArr2 = (byte[]) t22.f11619e;
                    C1617tm c1617tm2 = this.f9304d;
                    c1617tm2.h(v4, bArr2);
                    this.f9303c.g(this.f9312n, c1617tm2);
                }
                if (i12 == 178) {
                    if (c1617tm.f15724a[e3 + 2] == 1) {
                        t22.d(178);
                    }
                    i = 178;
                    if (i != 0 || i == 179) {
                        i5 = i10 - e3;
                        if (this.f9314p && this.f9308j) {
                            j6 = this.f9312n;
                            if (j6 != -9223372036854775807L) {
                                this.f9302b.d(j6, this.f9313o ? 1 : 0, ((int) (this.f9307h - this.f9311m)) - i5, i5, null);
                            }
                        }
                        if (this.i || this.f9314p) {
                            this.f9311m = this.f9307h - i5;
                            j5 = this.f9310l;
                            if (j5 == -9223372036854775807L) {
                                long j8 = this.f9312n;
                                j5 = j8 != -9223372036854775807L ? j8 + this.f9309k : -9223372036854775807L;
                            }
                            this.f9312n = j5;
                            z3 = false;
                            this.f9313o = false;
                            this.f9310l = -9223372036854775807L;
                            z5 = true;
                            this.i = true;
                        } else {
                            z5 = true;
                            z3 = false;
                        }
                        if (i == 0) {
                            z3 = z5;
                        }
                        this.f9314p = z3;
                    } else if (i == 184) {
                        this.f9313o = true;
                    }
                    c6 = c5;
                    i9 = i11;
                }
            }
            i = i12;
            if (i != 0) {
            }
            i5 = i10 - e3;
            if (this.f9314p) {
                j6 = this.f9312n;
                if (j6 != -9223372036854775807L) {
                }
            }
            if (this.i) {
            }
            this.f9311m = this.f9307h - i5;
            j5 = this.f9310l;
            if (j5 == -9223372036854775807L) {
            }
            this.f9312n = j5;
            z3 = false;
            this.f9313o = false;
            this.f9310l = -9223372036854775807L;
            z5 = true;
            this.i = true;
            if (i == 0) {
            }
            this.f9314p = z3;
            c6 = c5;
            i9 = i11;
        }
        if (!this.f9308j) {
            g22.a(bArr, i9, i10);
        }
        if (t22 != null) {
            t22.b(bArr, i9, i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void d(boolean z3) {
        AbstractC1668us.F(this.f9302b);
        if (z3) {
            boolean z5 = this.f9313o;
            long j5 = this.f9307h - this.f9311m;
            this.f9302b.d(this.f9312n, z5 ? 1 : 0, (int) j5, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void e(H h3, C0829c3 c0829c3) {
        c0829c3.a();
        c0829c3.b();
        this.f9301a = c0829c3.f12966e;
        c0829c3.b();
        this.f9302b = h3.w(c0829c3.f12965d, 2);
        C0709Wb c0709Wb = this.f9303c;
        if (c0709Wb != null) {
            c0709Wb.r(h3, c0829c3);
        }
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void f(int i, long j5) {
        this.f9310l = j5;
    }
}
