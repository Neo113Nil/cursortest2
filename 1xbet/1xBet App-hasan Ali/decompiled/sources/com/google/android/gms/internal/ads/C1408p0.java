package com.google.android.gms.internal.ads;

import B.C0072a;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1408p0 implements F {

    /* renamed from: d, reason: collision with root package name */
    public HG f14921d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0737a0 f14922e;

    /* renamed from: g, reason: collision with root package name */
    public C5 f14923g;

    /* renamed from: h, reason: collision with root package name */
    public K f14924h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f14925j;

    /* renamed from: k, reason: collision with root package name */
    public C1363o0 f14926k;

    /* renamed from: l, reason: collision with root package name */
    public int f14927l;

    /* renamed from: m, reason: collision with root package name */
    public long f14928m;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f14918a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    public final C1617tm f14919b = new C1617tm(0, new byte[32768]);

    /* renamed from: c, reason: collision with root package name */
    public final C0072a f14920c = new C0072a();
    public int f = 0;

    @Override // com.google.android.gms.internal.ads.F
    public final void d(long j5, long j6) {
        if (j5 == 0) {
            this.f = 0;
        } else {
            C1363o0 c1363o0 = this.f14926k;
            if (c1363o0 != null) {
                c1363o0.b(j6);
            }
        }
        this.f14928m = j6 != 0 ? -1L : 0L;
        this.f14927l = 0;
        this.f14919b.g(0);
    }

    @Override // com.google.android.gms.internal.ads.F
    public final boolean e(G g5) {
        C5 a5 = new P(0).a((B) g5, AbstractC1561sb.f15525k);
        if (a5 != null) {
            int length = a5.f7964k.length;
        }
        C1617tm c1617tm = new C1617tm(4);
        ((B) g5).G(c1617tm.f15724a, 0, 4, false);
        return c1617tm.D() == 1716281667;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    @Override // com.google.android.gms.internal.ads.F
    public final int f(G g5, C0072a c0072a) {
        K k5;
        int i;
        HG hg;
        U j5;
        HG hg2;
        long j6;
        boolean z3;
        long j7;
        boolean z5;
        boolean z6 = true;
        int i5 = this.f;
        C5 c5 = null;
        if (i5 == 0) {
            ((B) g5).f7754p = 0;
            B b3 = (B) g5;
            long b5 = b3.b();
            C5 a5 = new P(0).a(b3, null);
            if (a5 != null && a5.f7964k.length != 0) {
                c5 = a5;
            }
            b3.k((int) (b3.b() - b5));
            this.f14923g = c5;
            this.f = 1;
            return 0;
        }
        byte[] bArr = this.f14918a;
        if (i5 == 1) {
            ((B) g5).G(bArr, 0, 42, false);
            ((B) g5).f7754p = 0;
            this.f = 2;
            return 0;
        }
        int i6 = 3;
        if (i5 == 2) {
            C1617tm c1617tm = new C1617tm(4);
            ((B) g5).F(c1617tm.f15724a, 0, 4, false);
            if (c1617tm.D() != 1716281667) {
                throw B7.a(null, "Failed to read FLAC stream marker.");
            }
            this.f = 3;
            return 0;
        }
        if (i5 != 3) {
            long j8 = 0;
            if (i5 == 4) {
                ((B) g5).f7754p = 0;
                C1617tm c1617tm2 = new C1617tm(2);
                B b6 = (B) g5;
                b6.G(c1617tm2.f15724a, 0, 2, false);
                int z7 = c1617tm2.z();
                if ((z7 >> 2) != 16382) {
                    b6.f7754p = 0;
                    throw B7.a(null, "First frame does not start with sync code.");
                }
                b6.f7754p = 0;
                this.f14925j = z7;
                HG hg3 = this.f14921d;
                int i7 = AbstractC1260lo.f14419a;
                long j9 = b6.f7752n;
                K k6 = this.f14924h;
                k6.getClass();
                if (k6.f10097k != null) {
                    j5 = new J(0, j9, k6);
                    i = 0;
                    hg2 = hg3;
                } else {
                    long j10 = b6.f7751m;
                    if (j10 == -1 || k6.f10096j <= 0) {
                        i = 0;
                        hg = hg3;
                        j5 = new J(k6.a(), 0L);
                    } else {
                        int i8 = this.f14925j;
                        Mt mt = new Mt(2, k6);
                        G3 g32 = new G3(k6, i8);
                        long a6 = k6.a();
                        int i9 = k6.f10091c;
                        int i10 = k6.f10092d;
                        if (i10 > 0) {
                            j6 = ((i10 + i9) / 2) + 1;
                            i = 0;
                            hg = hg3;
                        } else {
                            int i11 = k6.f10090b;
                            long j11 = 4096;
                            int i12 = k6.f10089a;
                            if (i12 == i11 && i12 > 0) {
                                j11 = i12;
                            }
                            i = 0;
                            hg = hg3;
                            j6 = (((j11 * k6.f10094g) * k6.f10095h) / 8) + 64;
                        }
                        C1363o0 c1363o0 = new C1363o0(mt, g32, a6, k6.f10096j, j9, j10, j6, Math.max(6, i9));
                        this.f14926k = c1363o0;
                        j5 = c1363o0.f14741a;
                    }
                    hg2 = hg;
                }
                hg2.x(j5);
                this.f = 5;
                return i;
            }
            this.f14922e.getClass();
            this.f14924h.getClass();
            C1363o0 c1363o02 = this.f14926k;
            if (c1363o02 != null && c1363o02.f14743c != null) {
                return c1363o02.a((B) g5, c0072a);
            }
            if (this.f14928m == -1) {
                ((B) g5).f7754p = 0;
                B b7 = (B) g5;
                b7.g(1, false);
                byte[] bArr2 = new byte[1];
                b7.G(bArr2, 0, 1, false);
                int i13 = bArr2[0] & 1;
                boolean z8 = 1 == i13;
                b7.g(2, false);
                r9 = 1 != i13 ? 6 : 7;
                C1617tm c1617tm3 = new C1617tm(r9);
                byte[] bArr3 = c1617tm3.f15724a;
                int i14 = 0;
                while (i14 < r9) {
                    int f = b7.f(bArr3, i14, r9 - i14);
                    if (f == -1) {
                        break;
                    }
                    i14 += f;
                }
                c1617tm3.i(i14);
                b7.f7754p = 0;
                try {
                    j8 = c1617tm3.F();
                    if (!z8) {
                        j8 *= r4.f10090b;
                    }
                } catch (NumberFormatException unused) {
                    z6 = false;
                }
                if (!z6) {
                    throw B7.a(null, null);
                }
                this.f14928m = j8;
            } else {
                C1617tm c1617tm4 = this.f14919b;
                int i15 = c1617tm4.f15726c;
                if (i15 < 32768) {
                    int e3 = ((B) g5).e(c1617tm4.f15724a, i15, 32768 - i15);
                    z3 = e3 == -1;
                    if (!z3) {
                        c1617tm4.i(i15 + e3);
                    } else if (c1617tm4.o() == 0) {
                        long j12 = this.f14928m * 1000000;
                        K k7 = this.f14924h;
                        int i16 = AbstractC1260lo.f14419a;
                        this.f14922e.d(j12 / k7.f10093e, 1, this.f14927l, 0, null);
                        return -1;
                    }
                } else {
                    z3 = false;
                }
                int i17 = c1617tm4.f15725b;
                int i18 = this.f14927l;
                int i19 = this.i;
                if (i18 < i19) {
                    c1617tm4.k(Math.min(i19 - i18, c1617tm4.o()));
                }
                this.f14924h.getClass();
                int i20 = c1617tm4.f15725b;
                while (true) {
                    int i21 = c1617tm4.f15726c - 16;
                    C0072a c0072a2 = this.f14920c;
                    if (i20 <= i21) {
                        c1617tm4.j(i20);
                        if (AbstractC1803xs.G(c1617tm4, this.f14924h, this.f14925j, c0072a2)) {
                            c1617tm4.j(i20);
                            j7 = c0072a2.f658a;
                            break;
                        }
                        i20++;
                    } else {
                        if (z3) {
                            while (true) {
                                int i22 = c1617tm4.f15726c;
                                if (i20 > i22 - this.i) {
                                    c1617tm4.j(i22);
                                    break;
                                }
                                c1617tm4.j(i20);
                                try {
                                    z5 = AbstractC1803xs.G(c1617tm4, this.f14924h, this.f14925j, c0072a2);
                                } catch (IndexOutOfBoundsException unused2) {
                                    z5 = false;
                                }
                                if (c1617tm4.f15725b <= c1617tm4.f15726c && z5) {
                                    c1617tm4.j(i20);
                                    j7 = c0072a2.f658a;
                                    break;
                                }
                                i20++;
                            }
                        } else {
                            c1617tm4.j(i20);
                        }
                        j7 = -1;
                    }
                }
                int i23 = c1617tm4.f15725b - i17;
                c1617tm4.j(i17);
                this.f14922e.c(i23, c1617tm4);
                int i24 = this.f14927l + i23;
                this.f14927l = i24;
                if (j7 != -1) {
                    long j13 = this.f14928m * 1000000;
                    K k8 = this.f14924h;
                    int i25 = AbstractC1260lo.f14419a;
                    this.f14922e.d(j13 / k8.f10093e, 1, i24, 0, null);
                    this.f14927l = 0;
                    this.f14928m = j7;
                }
                if (c1617tm4.o() < 16) {
                    int o5 = c1617tm4.o();
                    byte[] bArr4 = c1617tm4.f15724a;
                    System.arraycopy(bArr4, c1617tm4.f15725b, bArr4, 0, o5);
                    c1617tm4.j(0);
                    c1617tm4.i(o5);
                    return 0;
                }
            }
            return 0;
        }
        ?? r1 = 0;
        K k9 = this.f14924h;
        while (true) {
            ((B) g5).f7754p = r1;
            byte[] bArr5 = new byte[4];
            C0826c0 c0826c0 = new C0826c0(4, bArr5);
            B b8 = (B) g5;
            b8.G(bArr5, r1, 4, r1);
            boolean w5 = c0826c0.w();
            int f5 = c0826c0.f(r9);
            int f6 = c0826c0.f(24) + 4;
            if (f5 == 0) {
                byte[] bArr6 = new byte[38];
                b8.F(bArr6, r1, 38, r1);
                k9 = new K(4, bArr6);
            } else {
                if (k9 == null) {
                    throw new IllegalArgumentException();
                }
                if (f5 == i6) {
                    C1617tm c1617tm5 = new C1617tm(f6);
                    b8.F(c1617tm5.f15724a, 0, f6, false);
                    k9 = new K(k9.f10089a, k9.f10090b, k9.f10091c, k9.f10092d, k9.f10093e, k9.f10094g, k9.f10095h, k9.f10096j, AbstractC1668us.B(c1617tm5), k9.f10098l);
                } else {
                    C5 c52 = k9.f10098l;
                    if (f5 == 4) {
                        C1617tm c1617tm6 = new C1617tm(f6);
                        b8.F(c1617tm6.f15724a, 0, f6, false);
                        c1617tm6.k(4);
                        C5 A3 = AbstractC1668us.A(Arrays.asList((String[]) AbstractC1668us.K(c1617tm6, false, false).f15382l));
                        if (c52 != null) {
                            A3 = c52.b(A3);
                        }
                        k5 = new K(k9.f10089a, k9.f10090b, k9.f10091c, k9.f10092d, k9.f10093e, k9.f10094g, k9.f10095h, k9.f10096j, k9.f10097k, A3);
                    } else if (f5 == 6) {
                        C1617tm c1617tm7 = new C1617tm(f6);
                        b8.F(c1617tm7.f15724a, 0, f6, false);
                        c1617tm7.k(4);
                        C5 c53 = new C5(AbstractC1044gv.n(A0.a(c1617tm7)));
                        if (c52 != null) {
                            c53 = c52.b(c53);
                        }
                        k5 = new K(k9.f10089a, k9.f10090b, k9.f10091c, k9.f10092d, k9.f10093e, k9.f10094g, k9.f10095h, k9.f10096j, k9.f10097k, c53);
                    } else {
                        b8.k(f6);
                    }
                    k9 = k5;
                }
            }
            int i26 = AbstractC1260lo.f14419a;
            this.f14924h = k9;
            if (w5) {
                this.i = Math.max(k9.f10091c, 6);
                this.f14922e.e(this.f14924h.b(bArr, this.f14923g));
                this.f = 4;
                return 0;
            }
            r1 = 0;
            i6 = 3;
            r9 = 7;
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void h(H h3) {
        HG hg = (HG) h3;
        this.f14921d = hg;
        this.f14922e = hg.w(0, 1);
        hg.v();
    }

    @Override // com.google.android.gms.internal.ads.F
    public final List j() {
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        return C1761wv.f16184o;
    }
}
