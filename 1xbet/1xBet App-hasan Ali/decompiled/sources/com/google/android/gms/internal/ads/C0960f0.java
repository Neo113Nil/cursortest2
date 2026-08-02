package com.google.android.gms.internal.ads;

import B.C0072a;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0960f0 implements F {

    /* renamed from: d, reason: collision with root package name */
    public final C1543s1 f13407d;

    /* renamed from: e, reason: collision with root package name */
    public int f13408e;

    /* renamed from: g, reason: collision with root package name */
    public C1005g0 f13409g;

    /* renamed from: j, reason: collision with root package name */
    public long f13411j;

    /* renamed from: k, reason: collision with root package name */
    public C1095i0 f13412k;

    /* renamed from: o, reason: collision with root package name */
    public int f13416o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13417p;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13406c = true;

    /* renamed from: a, reason: collision with root package name */
    public final C1617tm f13404a = new C1617tm(12);

    /* renamed from: b, reason: collision with root package name */
    public final E.H0 f13405b = new E.H0();
    public H f = new C1543s1(16);
    public C1095i0[] i = new C1095i0[0];

    /* renamed from: m, reason: collision with root package name */
    public long f13414m = -1;

    /* renamed from: n, reason: collision with root package name */
    public long f13415n = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f13413l = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f13410h = -9223372036854775807L;

    public C0960f0(C1543s1 c1543s1) {
        this.f13407d = c1543s1;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void d(long j5, long j6) {
        this.f13411j = -1L;
        this.f13412k = null;
        for (C1095i0 c1095i0 : this.i) {
            if (c1095i0.f13853j == 0) {
                c1095i0.f13852h = 0;
            } else {
                c1095i0.f13852h = c1095i0.f13856m[AbstractC1260lo.j(c1095i0.f13855l, j5, true)];
            }
        }
        if (j5 == 0) {
            this.f13408e = this.i.length != 0 ? 3 : 0;
        } else {
            this.f13408e = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final boolean e(G g5) {
        C1617tm c1617tm = this.f13404a;
        ((B) g5).G(c1617tm.f15724a, 0, 12, false);
        c1617tm.j(0);
        if (c1617tm.r() == 1179011410) {
            c1617tm.k(4);
            if (c1617tm.r() == 541677121) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x038e  */
    @Override // com.google.android.gms.internal.ads.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(G g5, C0072a c0072a) {
        boolean z3;
        C1095i0 c1095i0;
        E.H0 h02;
        long j5;
        C1095i0 c1095i02;
        long j6 = this.f13411j;
        if (j6 != -1) {
            long j7 = ((B) g5).f7752n;
            if (j6 < j7 || j6 > 262144 + j7) {
                c0072a.f658a = j6;
                z3 = true;
                this.f13411j = -1L;
                if (!z3) {
                    return 1;
                }
                int i = this.f13408e;
                C1095i0 c1095i03 = null;
                if (i == 0) {
                    if (!e(g5)) {
                        throw B7.a(null, "AVI Header List not found");
                    }
                    ((B) g5).k(12);
                    this.f13408e = 1;
                    return 0;
                }
                E.H0 h03 = this.f13405b;
                C1617tm c1617tm = this.f13404a;
                if (i == 1) {
                    ((B) g5).F(c1617tm.f15724a, 0, 12, false);
                    c1617tm.j(0);
                    h03.getClass();
                    h03.f1041a = c1617tm.r();
                    h03.f1042b = c1617tm.r();
                    int i5 = h03.f1041a;
                    if (i5 != 1414744396) {
                        throw B7.a(null, "LIST expected, found: " + i5);
                    }
                    int r5 = c1617tm.r();
                    if (r5 == 1819436136) {
                        this.f13413l = h03.f1042b;
                        this.f13408e = 2;
                        return 0;
                    }
                    throw B7.a(null, "hdrl expected, found: " + r5);
                }
                if (i == 2) {
                    int i6 = 2;
                    int i7 = this.f13413l - 4;
                    C1617tm c1617tm2 = new C1617tm(i7);
                    ((B) g5).F(c1617tm2.f15724a, 0, i7, false);
                    C1138j0 c5 = C1138j0.c(1819436136, c1617tm2);
                    int i8 = c5.f14044b;
                    if (i8 != 1819436136) {
                        throw B7.a(null, "Unexpected header list type " + i8);
                    }
                    C1005g0 c1005g0 = (C1005g0) c5.b(C1005g0.class);
                    if (c1005g0 == null) {
                        throw B7.a(null, "AviHeader not found");
                    }
                    this.f13409g = c1005g0;
                    this.f13410h = c1005g0.f13547c * c1005g0.f13545a;
                    ArrayList arrayList = new ArrayList();
                    C1761wv c1761wv = c5.f14043a;
                    int i9 = c1761wv.f16186n;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < i9) {
                        InterfaceC0915e0 interfaceC0915e0 = (InterfaceC0915e0) c1761wv.get(i10);
                        if (interfaceC0915e0.a() == 1819440243) {
                            C1138j0 c1138j0 = (C1138j0) interfaceC0915e0;
                            int i12 = i11 + 1;
                            C1050h0 c1050h0 = (C1050h0) c1138j0.b(C1050h0.class);
                            C1183k0 c1183k0 = (C1183k0) c1138j0.b(C1183k0.class);
                            if (c1050h0 == null) {
                                JB.l("AviExtractor", "Missing Stream Header");
                            } else if (c1183k0 == null) {
                                JB.l("AviExtractor", "Missing Stream Format");
                            } else {
                                long u5 = AbstractC1260lo.u(c1050h0.f13696d, c1050h0.f13694b * 1000000, c1050h0.f13695c, RoundingMode.DOWN);
                                C1407p c1407p = c1183k0.f14206a;
                                C1649uH c1649uH = new C1649uH(c1407p);
                                c1649uH.b(i11);
                                int i13 = c1050h0.f13697e;
                                if (i13 != 0) {
                                    c1649uH.f15849m = i13;
                                }
                                C1228l0 c1228l0 = (C1228l0) c1138j0.b(C1228l0.class);
                                if (c1228l0 != null) {
                                    c1649uH.f15840b = c1228l0.f14313a;
                                }
                                int b3 = AbstractC1593t6.b(c1407p.f14904m);
                                if (b3 != 1) {
                                    if (b3 == i6) {
                                        b3 = 2;
                                    }
                                }
                                InterfaceC0737a0 w5 = this.f.w(i11, b3);
                                w5.e(new C1407p(c1649uH));
                                c1095i0 = new C1095i0(i11, b3, u5, c1050h0.f13696d, w5);
                                this.f13410h = Math.max(this.f13410h, u5);
                                if (c1095i0 != null) {
                                    arrayList.add(c1095i0);
                                }
                                i11 = i12;
                            }
                            c1095i0 = null;
                            if (c1095i0 != null) {
                            }
                            i11 = i12;
                        }
                        i10++;
                        i6 = 2;
                    }
                    this.i = (C1095i0[]) arrayList.toArray(new C1095i0[0]);
                    this.f.v();
                    this.f13408e = 3;
                    return 0;
                }
                if (i == 3) {
                    long j8 = this.f13414m;
                    if (j8 != -1) {
                        h02 = h03;
                        if (((B) g5).f7752n != j8) {
                            this.f13411j = j8;
                            return 0;
                        }
                    } else {
                        h02 = h03;
                    }
                    ((B) g5).G(c1617tm.f15724a, 0, 12, false);
                    B b5 = (B) g5;
                    b5.f7754p = 0;
                    c1617tm.j(0);
                    h02.getClass();
                    E.H0 h04 = h02;
                    h04.f1041a = c1617tm.r();
                    h04.f1042b = c1617tm.r();
                    int r6 = c1617tm.r();
                    int i14 = h04.f1041a;
                    if (i14 == 1179011410) {
                        b5.k(12);
                        return 0;
                    }
                    if (i14 != 1414744396 || r6 != 1769369453) {
                        this.f13411j = b5.f7752n + h04.f1042b + 8;
                        return 0;
                    }
                    long j9 = b5.f7752n;
                    this.f13414m = j9;
                    long j10 = j9 + h04.f1042b + 8;
                    this.f13415n = j10;
                    if (!this.f13417p) {
                        C1005g0 c1005g02 = this.f13409g;
                        c1005g02.getClass();
                        if ((c1005g02.f13546b & 16) == 16) {
                            this.f13408e = 4;
                            this.f13411j = j10;
                            return 0;
                        }
                        this.f.x(new J(this.f13410h, 0L));
                        this.f13417p = true;
                    }
                    this.f13411j = b5.f7752n + 12;
                    this.f13408e = 6;
                    return 0;
                }
                if (i == 4) {
                    ((B) g5).F(c1617tm.f15724a, 0, 8, false);
                    c1617tm.j(0);
                    int r7 = c1617tm.r();
                    int r8 = c1617tm.r();
                    if (r7 != 829973609) {
                        this.f13411j = ((B) g5).f7752n + r8;
                        return 0;
                    }
                    this.f13408e = 5;
                    this.f13416o = r8;
                    return 0;
                }
                if (i != 5) {
                    if (((B) g5).f7752n >= this.f13415n) {
                        return -1;
                    }
                    C1095i0 c1095i04 = this.f13412k;
                    if (c1095i04 != null) {
                        int i15 = c1095i04.f13851g;
                        InterfaceC0737a0 interfaceC0737a0 = c1095i04.f13846a;
                        int b6 = i15 - interfaceC0737a0.b(g5, i15, false);
                        c1095i04.f13851g = b6;
                        boolean z5 = b6 == 0;
                        if (z5) {
                            if (c1095i04.f > 0) {
                                int i16 = c1095i04.f13852h;
                                interfaceC0737a0.d((c1095i04.f13849d * i16) / c1095i04.f13850e, Arrays.binarySearch(c1095i04.f13856m, i16) >= 0 ? 1 : 0, c1095i04.f, 0, null);
                            }
                            c1095i04.f13852h++;
                        }
                        if (!z5) {
                            return 0;
                        }
                        this.f13412k = null;
                        return 0;
                    }
                    B b7 = (B) g5;
                    if ((b7.f7752n & 1) == 1) {
                        b7.k(1);
                    }
                    b7.G(c1617tm.f15724a, 0, 12, false);
                    c1617tm.j(0);
                    int r9 = c1617tm.r();
                    if (r9 == 1414744396) {
                        c1617tm.j(8);
                        b7.k(c1617tm.r() != 1769369453 ? 8 : 12);
                        b7.f7754p = 0;
                        return 0;
                    }
                    int r10 = c1617tm.r();
                    if (r9 == 1263424842) {
                        this.f13411j = b7.f7752n + r10 + 8;
                        return 0;
                    }
                    b7.k(8);
                    b7.f7754p = 0;
                    for (C1095i0 c1095i05 : this.i) {
                        if (c1095i05.f13847b == r9 || c1095i05.f13848c == r9) {
                            c1095i03 = c1095i05;
                            break;
                        }
                    }
                    if (c1095i03 == null) {
                        this.f13411j = b7.f7752n + r10;
                        return 0;
                    }
                    c1095i03.f = r10;
                    c1095i03.f13851g = r10;
                    this.f13412k = c1095i03;
                    return 0;
                }
                C1617tm c1617tm3 = new C1617tm(this.f13416o);
                ((B) g5).F(c1617tm3.f15724a, 0, this.f13416o, false);
                if (c1617tm3.o() < 16) {
                    j5 = 0;
                } else {
                    int i17 = c1617tm3.f15725b;
                    c1617tm3.k(8);
                    long r11 = c1617tm3.r();
                    long j11 = this.f13414m;
                    j5 = r11 > j11 ? 0L : j11 + 8;
                    c1617tm3.j(i17);
                }
                while (c1617tm3.o() >= 16) {
                    int r12 = c1617tm3.r();
                    int r13 = c1617tm3.r();
                    long r14 = c1617tm3.r() + j5;
                    c1617tm3.r();
                    C1095i0[] c1095i0Arr = this.i;
                    int length = c1095i0Arr.length;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= length) {
                            c1095i02 = null;
                            break;
                        }
                        c1095i02 = c1095i0Arr[i18];
                        if (c1095i02.f13847b == r12 || c1095i02.f13848c == r12) {
                            break;
                        }
                        i18++;
                    }
                    if (c1095i02 != null) {
                        boolean z6 = (r13 & 16) == 16;
                        if (c1095i02.f13854k == -1) {
                            c1095i02.f13854k = r14;
                        }
                        if (z6) {
                            if (c1095i02.f13853j == c1095i02.f13856m.length) {
                                long[] jArr = c1095i02.f13855l;
                                c1095i02.f13855l = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = c1095i02.f13856m;
                                c1095i02.f13856m = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = c1095i02.f13855l;
                            int i19 = c1095i02.f13853j;
                            jArr2[i19] = r14;
                            c1095i02.f13856m[i19] = c1095i02.i;
                            c1095i02.f13853j = i19 + 1;
                        }
                        c1095i02.i++;
                    }
                }
                for (C1095i0 c1095i06 : this.i) {
                    c1095i06.f13855l = Arrays.copyOf(c1095i06.f13855l, c1095i06.f13853j);
                    c1095i06.f13856m = Arrays.copyOf(c1095i06.f13856m, c1095i06.f13853j);
                }
                this.f13417p = true;
                this.f.x(new J(2, this.f13410h, this));
                this.f13408e = 6;
                this.f13411j = this.f13414m;
                return 0;
            }
            ((B) g5).k((int) (j6 - j7));
        }
        z3 = false;
        this.f13411j = -1L;
        if (!z3) {
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void h(H h3) {
        this.f13408e = 0;
        if (this.f13406c) {
            h3 = new C0905dr(h3, this.f13407d);
        }
        this.f = h3;
        this.f13411j = -1L;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final List j() {
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        return C1761wv.f16184o;
    }
}
