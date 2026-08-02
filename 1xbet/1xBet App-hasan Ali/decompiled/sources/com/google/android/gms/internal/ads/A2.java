package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class A2 implements F2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7507a;

    /* renamed from: b, reason: collision with root package name */
    public final C0826c0 f7508b;

    /* renamed from: c, reason: collision with root package name */
    public final C1617tm f7509c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7510d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7511e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC0737a0 f7512g;

    /* renamed from: h, reason: collision with root package name */
    public int f7513h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7514j;

    /* renamed from: k, reason: collision with root package name */
    public long f7515k;

    /* renamed from: l, reason: collision with root package name */
    public C1407p f7516l;

    /* renamed from: m, reason: collision with root package name */
    public int f7517m;

    /* renamed from: n, reason: collision with root package name */
    public long f7518n;

    public A2(int i, int i5, String str) {
        this.f7507a = i5;
        switch (i5) {
            case 1:
                C0826c0 c0826c0 = new C0826c0(16, new byte[16]);
                this.f7508b = c0826c0;
                this.f7509c = new C1617tm(c0826c0.f12943b);
                this.f7513h = 0;
                this.i = 0;
                this.f7514j = false;
                this.f7518n = -9223372036854775807L;
                this.f7510d = str;
                this.f7511e = i;
                break;
            default:
                C0826c0 c0826c02 = new C0826c0(128, new byte[128]);
                this.f7508b = c0826c02;
                this.f7509c = new C1617tm(c0826c02.f12943b);
                this.f7513h = 0;
                this.f7518n = -9223372036854775807L;
                this.f7510d = str;
                this.f7511e = i;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void b() {
        switch (this.f7507a) {
            case 0:
                this.f7513h = 0;
                this.i = 0;
                this.f7514j = false;
                this.f7518n = -9223372036854775807L;
                break;
            default:
                this.f7513h = 0;
                this.i = 0;
                this.f7514j = false;
                this.f7518n = -9223372036854775807L;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03bd  */
    @Override // com.google.android.gms.internal.ads.F2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C1617tm c1617tm) {
        int i;
        int j5;
        int i5;
        int i6;
        int i7;
        String str;
        int i8;
        int f;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        switch (this.f7507a) {
            case 0:
                AbstractC1668us.F(this.f7512g);
                while (c1617tm.o() > 0) {
                    int i18 = this.f7513h;
                    C1617tm c1617tm2 = this.f7509c;
                    if (i18 == 0) {
                        while (true) {
                            if (c1617tm.o() <= 0) {
                                break;
                            }
                            if (this.f7514j) {
                                int v4 = c1617tm.v();
                                if (v4 == 119) {
                                    this.f7514j = false;
                                    this.f7513h = 1;
                                    byte[] bArr = c1617tm2.f15724a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.i = 2;
                                } else {
                                    this.f7514j = v4 == 11;
                                }
                            } else {
                                this.f7514j = c1617tm.v() == 11;
                            }
                        }
                    } else if (i18 != 1) {
                        int min = Math.min(c1617tm.o(), this.f7517m - this.i);
                        this.f7512g.c(min, c1617tm);
                        int i19 = this.i + min;
                        this.i = i19;
                        if (i19 == this.f7517m) {
                            AbstractC1668us.a0(this.f7518n != -9223372036854775807L);
                            this.f7512g.d(this.f7518n, 1, this.f7517m, 0, null);
                            this.f7518n += this.f7515k;
                            this.f7513h = 0;
                        }
                    } else {
                        byte[] bArr2 = c1617tm2.f15724a;
                        int min2 = Math.min(c1617tm.o(), 128 - this.i);
                        c1617tm.f(bArr2, this.i, min2);
                        int i20 = this.i + min2;
                        this.i = i20;
                        if (i20 == 128) {
                            C0826c0 c0826c0 = this.f7508b;
                            c0826c0.s(0);
                            int i21 = (c0826c0.f12944c * 8) + c0826c0.f12945d;
                            c0826c0.u(40);
                            int f5 = c0826c0.f(5);
                            c0826c0.s(i21);
                            int[] iArr = JB.f9893d;
                            int[] iArr2 = JB.f9891b;
                            if (f5 > 10) {
                                c0826c0.u(16);
                                int f6 = c0826c0.f(2);
                                char c5 = f6 != 0 ? f6 != 1 ? f6 != 2 ? (char) 65535 : (char) 2 : (char) 1 : (char) 0;
                                c0826c0.u(3);
                                int f7 = c0826c0.f(11) + 1;
                                int f8 = c0826c0.f(2);
                                if (f8 == 3) {
                                    i8 = JB.f9892c[c0826c0.f(2)];
                                    f = 3;
                                    i9 = 6;
                                } else {
                                    f = c0826c0.f(2);
                                    int i22 = JB.f9890a[f];
                                    i8 = iArr2[f8];
                                    i9 = i22;
                                }
                                j5 = f7 + f7;
                                int i23 = (j5 * i8) / (i9 * 32);
                                int f9 = c0826c0.f(3);
                                boolean w5 = c0826c0.w();
                                i6 = iArr[f9] + (w5 ? 1 : 0);
                                c0826c0.u(10);
                                if (c0826c0.w()) {
                                    c0826c0.u(8);
                                }
                                if (f9 == 0) {
                                    c0826c0.u(5);
                                    if (c0826c0.w()) {
                                        c0826c0.u(8);
                                    }
                                    i10 = 0;
                                    f9 = 0;
                                } else {
                                    i10 = f9;
                                }
                                if (c5 == 1) {
                                    if (c0826c0.w()) {
                                        c0826c0.u(16);
                                    }
                                    c5 = 1;
                                }
                                if (c0826c0.w()) {
                                    if (i10 > 2) {
                                        c0826c0.u(2);
                                    }
                                    if ((i10 & 1) == 0 || i10 <= 2) {
                                        i14 = 6;
                                    } else {
                                        i14 = 6;
                                        c0826c0.u(6);
                                    }
                                    if ((i10 & 4) != 0) {
                                        c0826c0.u(i14);
                                    }
                                    if (w5 && c0826c0.w()) {
                                        c0826c0.u(5);
                                    }
                                    if (c5 == 0) {
                                        if (c0826c0.w()) {
                                            i15 = 6;
                                            c0826c0.u(6);
                                        } else {
                                            i15 = 6;
                                        }
                                        if (i10 == 0 && c0826c0.w()) {
                                            c0826c0.u(i15);
                                        }
                                        if (c0826c0.w()) {
                                            c0826c0.u(i15);
                                        }
                                        int f10 = c0826c0.f(2);
                                        if (f10 == 1) {
                                            c0826c0.u(5);
                                            i16 = 2;
                                        } else {
                                            if (f10 == 2) {
                                                c0826c0.u(12);
                                            } else if (f10 == 3) {
                                                int f11 = c0826c0.f(5);
                                                if (c0826c0.w()) {
                                                    c0826c0.u(5);
                                                    if (c0826c0.w()) {
                                                        i17 = 4;
                                                        c0826c0.u(4);
                                                    } else {
                                                        i17 = 4;
                                                    }
                                                    if (c0826c0.w()) {
                                                        c0826c0.u(i17);
                                                    }
                                                    if (c0826c0.w()) {
                                                        c0826c0.u(i17);
                                                    }
                                                    if (c0826c0.w()) {
                                                        c0826c0.u(i17);
                                                    }
                                                    if (c0826c0.w()) {
                                                        c0826c0.u(i17);
                                                    }
                                                    if (c0826c0.w()) {
                                                        c0826c0.u(i17);
                                                    }
                                                    if (c0826c0.w()) {
                                                        c0826c0.u(i17);
                                                    }
                                                    if (c0826c0.w()) {
                                                        if (c0826c0.w()) {
                                                            c0826c0.u(i17);
                                                        }
                                                        if (c0826c0.w()) {
                                                            c0826c0.u(i17);
                                                        }
                                                    }
                                                }
                                                if (c0826c0.w()) {
                                                    c0826c0.u(5);
                                                    if (c0826c0.w()) {
                                                        c0826c0.u(7);
                                                        if (c0826c0.w()) {
                                                            c0826c0.u(8);
                                                            i16 = 2;
                                                            c0826c0.u((f11 + i16) * 8);
                                                            c0826c0.j();
                                                        }
                                                    }
                                                }
                                                i16 = 2;
                                                c0826c0.u((f11 + i16) * 8);
                                                c0826c0.j();
                                            }
                                            i16 = 2;
                                        }
                                        if (i10 < i16) {
                                            if (c0826c0.w()) {
                                                c0826c0.u(14);
                                            }
                                            if (f9 == 0 && c0826c0.w()) {
                                                c0826c0.u(14);
                                            }
                                        }
                                        if (c0826c0.w()) {
                                            if (f == 0) {
                                                c0826c0.u(5);
                                                i11 = 0;
                                                c5 = 0;
                                                if (c0826c0.w()) {
                                                    c0826c0.u(5);
                                                    if (i10 == 2) {
                                                        c0826c0.u(4);
                                                        i10 = 2;
                                                    }
                                                    if (i10 >= 6) {
                                                        c0826c0.u(2);
                                                    }
                                                    if (c0826c0.w()) {
                                                        i13 = 8;
                                                        c0826c0.u(8);
                                                    } else {
                                                        i13 = 8;
                                                    }
                                                    if (i10 == 0 && c0826c0.w()) {
                                                        c0826c0.u(i13);
                                                    }
                                                    if (f8 < 3) {
                                                        c0826c0.t();
                                                    }
                                                }
                                                if (c5 == 0 && i11 != 3) {
                                                    c0826c0.t();
                                                }
                                                if (c5 == 2 || !(i11 == 3 || c0826c0.w())) {
                                                    i12 = 6;
                                                } else {
                                                    i12 = 6;
                                                    c0826c0.u(6);
                                                }
                                                str = (!c0826c0.w() && c0826c0.f(i12) == 1 && c0826c0.f(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                                i7 = i9 * 256;
                                                i = i23;
                                            } else {
                                                for (int i24 = 0; i24 < i9; i24++) {
                                                    if (c0826c0.w()) {
                                                        c0826c0.u(5);
                                                    }
                                                }
                                            }
                                        }
                                        i11 = f;
                                        c5 = 0;
                                        if (c0826c0.w()) {
                                        }
                                        if (c5 == 0) {
                                            c0826c0.t();
                                        }
                                        if (c5 == 2) {
                                        }
                                        i12 = 6;
                                        if (!c0826c0.w()) {
                                        }
                                        i7 = i9 * 256;
                                        i = i23;
                                    }
                                }
                                i11 = f;
                                if (c0826c0.w()) {
                                }
                                if (c5 == 0) {
                                }
                                if (c5 == 2) {
                                }
                                i12 = 6;
                                if (!c0826c0.w()) {
                                }
                                i7 = i9 * 256;
                                i = i23;
                            } else {
                                c0826c0.u(32);
                                int f12 = c0826c0.f(2);
                                String str2 = f12 == 3 ? null : "audio/ac3";
                                int f13 = c0826c0.f(6);
                                i = JB.f9894e[f13 / 2] * 1000;
                                j5 = JB.j(f12, f13);
                                c0826c0.u(8);
                                int f14 = c0826c0.f(3);
                                if ((f14 & 1) == 0 || f14 == 1) {
                                    i5 = 2;
                                } else {
                                    i5 = 2;
                                    c0826c0.u(2);
                                }
                                if ((f14 & 4) != 0) {
                                    c0826c0.u(i5);
                                }
                                if (f14 == i5) {
                                    c0826c0.u(i5);
                                }
                                int i25 = f12 < 3 ? iArr2[f12] : -1;
                                i6 = iArr[f14] + (c0826c0.w() ? 1 : 0);
                                i7 = 1536;
                                str = str2;
                                i8 = i25;
                            }
                            C1407p c1407p = this.f7516l;
                            if (c1407p == null || i6 != c1407p.f14886B || i8 != c1407p.f14887C || !Objects.equals(str, c1407p.f14904m)) {
                                C1649uH c1649uH = new C1649uH();
                                c1649uH.f15839a = this.f;
                                c1649uH.c(str);
                                c1649uH.f15831A = i6;
                                c1649uH.f15832B = i8;
                                c1649uH.f15842d = this.f7510d;
                                c1649uH.f = this.f7511e;
                                c1649uH.f15845h = i;
                                if ("audio/ac3".equals(str)) {
                                    c1649uH.f15844g = i;
                                }
                                C1407p c1407p2 = new C1407p(c1649uH);
                                this.f7516l = c1407p2;
                                this.f7512g.e(c1407p2);
                            }
                            this.f7517m = j5;
                            this.f7515k = (i7 * 1000000) / this.f7516l.f14887C;
                            c1617tm2.j(0);
                            this.f7512g.c(128, c1617tm2);
                            this.f7513h = 2;
                        }
                    }
                }
                break;
            default:
                AbstractC1668us.F(this.f7512g);
                while (c1617tm.o() > 0) {
                    int i26 = this.f7513h;
                    C1617tm c1617tm3 = this.f7509c;
                    if (i26 == 0) {
                        while (c1617tm.o() > 0) {
                            if (this.f7514j) {
                                int v5 = c1617tm.v();
                                this.f7514j = v5 == 172;
                                if (v5 != 64) {
                                    if (v5 == 65) {
                                        v5 = 65;
                                    }
                                }
                                this.f7513h = 1;
                                byte[] bArr3 = c1617tm3.f15724a;
                                bArr3[0] = -84;
                                bArr3[1] = v5 == 65 ? (byte) 65 : (byte) 64;
                                this.i = 2;
                            } else {
                                this.f7514j = c1617tm.v() == 172;
                            }
                        }
                    } else if (i26 != 1) {
                        int min3 = Math.min(c1617tm.o(), this.f7517m - this.i);
                        this.f7512g.c(min3, c1617tm);
                        int i27 = this.i + min3;
                        this.i = i27;
                        if (i27 == this.f7517m) {
                            AbstractC1668us.a0(this.f7518n != -9223372036854775807L);
                            this.f7512g.d(this.f7518n, 1, this.f7517m, 0, null);
                            this.f7518n += this.f7515k;
                            this.f7513h = 0;
                        }
                    } else {
                        byte[] bArr4 = c1617tm3.f15724a;
                        int min4 = Math.min(c1617tm.o(), 16 - this.i);
                        c1617tm.f(bArr4, this.i, min4);
                        int i28 = this.i + min4;
                        this.i = i28;
                        if (i28 == 16) {
                            C0826c0 c0826c02 = this.f7508b;
                            c0826c02.s(0);
                            C1586t a5 = AbstractC1561sb.a(c0826c02);
                            C1407p c1407p3 = this.f7516l;
                            int i29 = a5.f15621a;
                            if (c1407p3 == null || c1407p3.f14886B != 2 || i29 != c1407p3.f14887C || !"audio/ac4".equals(c1407p3.f14904m)) {
                                C1649uH c1649uH2 = new C1649uH();
                                c1649uH2.f15839a = this.f;
                                c1649uH2.c("audio/ac4");
                                c1649uH2.f15831A = 2;
                                c1649uH2.f15832B = i29;
                                c1649uH2.f15842d = this.f7510d;
                                c1649uH2.f = this.f7511e;
                                C1407p c1407p4 = new C1407p(c1649uH2);
                                this.f7516l = c1407p4;
                                this.f7512g.e(c1407p4);
                            }
                            this.f7517m = a5.f15622b;
                            this.f7515k = (a5.f15623c * 1000000) / this.f7516l.f14887C;
                            c1617tm3.j(0);
                            this.f7512g.c(16, c1617tm3);
                            this.f7513h = 2;
                        }
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void d(boolean z3) {
        int i = this.f7507a;
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void e(H h3, C0829c3 c0829c3) {
        switch (this.f7507a) {
            case 0:
                c0829c3.a();
                c0829c3.b();
                this.f = c0829c3.f12966e;
                c0829c3.b();
                this.f7512g = h3.w(c0829c3.f12965d, 1);
                break;
            default:
                c0829c3.a();
                c0829c3.b();
                this.f = c0829c3.f12966e;
                c0829c3.b();
                this.f7512g = h3.w(c0829c3.f12965d, 1);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void f(int i, long j5) {
        switch (this.f7507a) {
            case 0:
                this.f7518n = j5;
                break;
            default:
                this.f7518n = j5;
                break;
        }
    }

    private final void a(boolean z3) {
    }

    private final void g(boolean z3) {
    }
}
