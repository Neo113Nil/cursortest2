package com.google.android.gms.internal.ads;

import B.C0072a;
import java.io.EOFException;
import java.math.RoundingMode;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0916e1 implements F {

    /* renamed from: e, reason: collision with root package name */
    public HG f13219e;
    public InterfaceC0737a0 f;

    /* renamed from: h, reason: collision with root package name */
    public int f13221h;
    public C5 i;

    /* renamed from: k, reason: collision with root package name */
    public long f13223k;

    /* renamed from: l, reason: collision with root package name */
    public long f13224l;

    /* renamed from: n, reason: collision with root package name */
    public int f13226n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC1006g1 f13227o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13228p;

    /* renamed from: a, reason: collision with root package name */
    public final C1617tm f13215a = new C1617tm(10);

    /* renamed from: b, reason: collision with root package name */
    public final S f13216b = new S();

    /* renamed from: c, reason: collision with root package name */
    public final N f13217c = new N();

    /* renamed from: j, reason: collision with root package name */
    public long f13222j = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public final P f13218d = new P(0);

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC0737a0 f13220g = new E();

    /* renamed from: m, reason: collision with root package name */
    public long f13225m = -1;

    public final void a() {
        InterfaceC1006g1 interfaceC1006g1 = this.f13227o;
        if ((interfaceC1006g1 instanceof C0827c1) && ((C0827c1) interfaceC1006g1).g()) {
            long j5 = this.f13225m;
            if (j5 == -1 || j5 == this.f13227o.j()) {
                return;
            }
            C0827c1 c0827c1 = (C0827c1) this.f13227o;
            this.f13227o = new C0827c1(c0827c1.f12953h, c0827c1.i, this.f13225m, c0827c1.f12952g);
            HG hg = this.f13219e;
            hg.getClass();
            hg.x(this.f13227o);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.b() > (r2 - 4)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(B b3) {
        InterfaceC1006g1 interfaceC1006g1 = this.f13227o;
        if (interfaceC1006g1 != null) {
            long j5 = interfaceC1006g1.j();
            if (j5 != -1) {
            }
        }
        return !b3.G(this.f13215a.f15724a, 0, 4, true);
    }

    public final boolean c(B b3, boolean z3) {
        int i;
        int i5;
        int b5;
        b3.f7754p = 0;
        if (b3.f7752n == 0) {
            C5 a5 = this.f13218d.a(b3, null);
            this.i = a5;
            if (a5 != null) {
                this.f13217c.a(a5);
            }
            i = (int) b3.b();
            if (!z3) {
                b3.k(i);
            }
            i5 = 0;
        } else {
            i = 0;
            i5 = 0;
        }
        int i6 = i5;
        int i7 = i6;
        while (true) {
            if (!b(b3)) {
                C1617tm c1617tm = this.f13215a;
                c1617tm.j(0);
                int q5 = c1617tm.q();
                if ((i5 == 0 || ((-128000) & q5) == (i5 & (-128000))) && (b5 = AbstractC1561sb.b(q5)) != -1) {
                    i6++;
                    if (i6 != 1) {
                        if (i6 == 4) {
                            break;
                        }
                    } else {
                        this.f13216b.a(q5);
                        i5 = q5;
                    }
                    b3.g(b5 - 4, false);
                } else {
                    int i8 = i7 + 1;
                    if (i7 == (true != z3 ? 131072 : 32768)) {
                        if (z3) {
                            return false;
                        }
                        a();
                        throw new EOFException();
                    }
                    if (z3) {
                        b3.f7754p = 0;
                        b3.g(i + i8, false);
                    } else {
                        b3.k(1);
                    }
                    i5 = 0;
                    i7 = i8;
                    i6 = 0;
                }
            } else if (i6 <= 0) {
                a();
                throw new EOFException();
            }
        }
        if (z3) {
            b3.k(i + i7);
        } else {
            b3.f7754p = 0;
        }
        this.f13221h = i5;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void d(long j5, long j6) {
        this.f13221h = 0;
        this.f13222j = -9223372036854775807L;
        this.f13223k = 0L;
        this.f13226n = 0;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final boolean e(G g5) {
        return c((B) g5, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x038e  */
    @Override // com.google.android.gms.internal.ads.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(G g5, C0072a c0072a) {
        C1617tm c1617tm;
        long j5;
        int i;
        int i5;
        N n5;
        C1617tm c1617tm2;
        int q5;
        long[] jArr;
        int i6;
        int i7;
        long j6;
        int i8;
        long j7;
        int i9;
        long j8;
        long j9;
        InterfaceC1006g1 c0827c1;
        C5 c5;
        C0872d1 c0872d1;
        InterfaceC1006g1 c0827c12;
        long j10;
        B b3;
        B b5;
        int v4;
        AbstractC1668us.F(this.f);
        int i10 = AbstractC1260lo.f14419a;
        if (this.f13221h == 0) {
            try {
                c((B) g5, false);
            } catch (EOFException unused) {
            }
        }
        InterfaceC1006g1 interfaceC1006g1 = this.f13227o;
        S s2 = this.f13216b;
        C1617tm c1617tm3 = this.f13215a;
        if (interfaceC1006g1 == null) {
            j5 = 1000000;
            C1617tm c1617tm4 = new C1617tm(s2.f11475b);
            ((B) g5).G(c1617tm4.f15724a, 0, s2.f11475b, false);
            if ((s2.f11474a & 1) != 0) {
                if (s2.f11477d != 1) {
                    i = 36;
                    if (c1617tm4.f15726c >= i + 4) {
                        c1617tm4.j(i);
                        i5 = c1617tm4.q();
                        if (i5 != 1483304551) {
                            if (i5 == 1231971951) {
                                i5 = 1231971951;
                            }
                        }
                        n5 = this.f13217c;
                        InterfaceC1006g1 interfaceC1006g12 = null;
                        if (i5 != 1231971951) {
                            if (i5 == 1447187017) {
                                B b6 = (B) g5;
                                long j11 = b6.f7752n;
                                c1617tm4.k(10);
                                int q6 = c1617tm4.q();
                                if (q6 <= 0) {
                                    b5 = b6;
                                    c1617tm2 = c1617tm3;
                                } else {
                                    int i11 = s2.f11476c;
                                    long u5 = AbstractC1260lo.u(q6, (i11 >= 32000 ? 1152 : 576) * 1000000, i11, RoundingMode.DOWN);
                                    int z3 = c1617tm4.z();
                                    int z5 = c1617tm4.z();
                                    int z6 = c1617tm4.z();
                                    c1617tm4.k(2);
                                    b3 = b6;
                                    long j12 = s2.f11475b + j11;
                                    long[] jArr2 = new long[z3];
                                    long[] jArr3 = new long[z3];
                                    int i12 = 0;
                                    while (i12 < z3) {
                                        c1617tm2 = c1617tm3;
                                        b5 = b3;
                                        jArr2[i12] = (i12 * u5) / z3;
                                        jArr3[i12] = Math.max(j11, j12);
                                        if (z6 == 1) {
                                            v4 = c1617tm4.v();
                                        } else if (z6 == 2) {
                                            v4 = c1617tm4.z();
                                        } else if (z6 == 3) {
                                            v4 = c1617tm4.x();
                                        } else if (z6 == 4) {
                                            v4 = c1617tm4.y();
                                        }
                                        j11 += v4 * z5;
                                        i12++;
                                        b3 = b5;
                                        c1617tm3 = c1617tm2;
                                        j12 = j12;
                                    }
                                    c1617tm2 = c1617tm3;
                                    long j13 = b3.f7751m;
                                    if (j13 != -1 && j13 != j11) {
                                        JB.l("VbriSeeker", "VBRI data size mismatch: " + j13 + ", " + j11);
                                    }
                                    c0827c1 = new C1051h1(jArr2, jArr3, u5, j11, s2.f11478e);
                                    b3.k(s2.f11475b);
                                    c5 = this.i;
                                    B b7 = (B) g5;
                                    long j14 = b7.f7752n;
                                    if (c5 != null) {
                                    }
                                    c0872d1 = null;
                                    if (this.f13228p) {
                                    }
                                    c1617tm = c1617tm2;
                                    this.f13227o = c0827c12;
                                    this.f13219e.x(c0827c12);
                                    C1649uH c1649uH = new C1649uH();
                                    c1649uH.c((String) s2.f11479g);
                                    c1649uH.f15849m = 4096;
                                    c1649uH.f15831A = s2.f11477d;
                                    c1649uH.f15832B = s2.f11476c;
                                    c1649uH.f15834D = n5.f10758a;
                                    c1649uH.f15835E = n5.f10759b;
                                    c1649uH.f15846j = this.i;
                                    if (this.f13227o.i() != -2147483647) {
                                    }
                                    this.f13220g.e(new C1407p(c1649uH));
                                    this.f13224l = b7.f7752n;
                                }
                                b3 = b5;
                                c0827c1 = null;
                                b3.k(s2.f11475b);
                                c5 = this.i;
                                B b72 = (B) g5;
                                long j142 = b72.f7752n;
                                if (c5 != null) {
                                }
                                c0872d1 = null;
                                if (this.f13228p) {
                                }
                                c1617tm = c1617tm2;
                                this.f13227o = c0827c12;
                                this.f13219e.x(c0827c12);
                                C1649uH c1649uH2 = new C1649uH();
                                c1649uH2.c((String) s2.f11479g);
                                c1649uH2.f15849m = 4096;
                                c1649uH2.f15831A = s2.f11477d;
                                c1649uH2.f15832B = s2.f11476c;
                                c1649uH2.f15834D = n5.f10758a;
                                c1649uH2.f15835E = n5.f10759b;
                                c1649uH2.f15846j = this.i;
                                if (this.f13227o.i() != -2147483647) {
                                }
                                this.f13220g.e(new C1407p(c1649uH2));
                                this.f13224l = b72.f7752n;
                            } else if (i5 != 1483304551) {
                                ((B) g5).f7754p = 0;
                                c1617tm2 = c1617tm3;
                                c0827c1 = null;
                                c5 = this.i;
                                B b722 = (B) g5;
                                long j1422 = b722.f7752n;
                                if (c5 != null) {
                                    InterfaceC1592t5[] interfaceC1592t5Arr = c5.f7964k;
                                    for (InterfaceC1592t5 interfaceC1592t5 : interfaceC1592t5Arr) {
                                        if (interfaceC1592t5 instanceof N0) {
                                            N0 n02 = (N0) interfaceC1592t5;
                                            int length = interfaceC1592t5Arr.length;
                                            int i13 = 0;
                                            while (true) {
                                                if (i13 >= length) {
                                                    j10 = -9223372036854775807L;
                                                    break;
                                                }
                                                InterfaceC1592t5 interfaceC1592t52 = interfaceC1592t5Arr[i13];
                                                if (interfaceC1592t52 instanceof P0) {
                                                    P0 p02 = (P0) interfaceC1592t52;
                                                    if (p02.f10099k.equals("TLEN")) {
                                                        j10 = AbstractC1260lo.s(Long.parseLong((String) p02.f11019m.get(0)));
                                                        break;
                                                    }
                                                }
                                                i13++;
                                            }
                                            int length2 = n02.f10763o.length;
                                            int i14 = length2 + 1;
                                            long[] jArr4 = new long[i14];
                                            long[] jArr5 = new long[i14];
                                            jArr4[0] = j1422;
                                            jArr5[0] = 0;
                                            long j15 = 0;
                                            int i15 = 1;
                                            while (i15 <= length2) {
                                                int i16 = i15 - 1;
                                                long j16 = j1422 + n02.f10761m + n02.f10763o[i16];
                                                j15 += n02.f10762n + n02.f10764p[i16];
                                                jArr4[i15] = j16;
                                                jArr5[i15] = j15;
                                                i15++;
                                                length2 = length2;
                                                j1422 = j16;
                                            }
                                            c0872d1 = new C0872d1(j10, jArr4, jArr5);
                                            if (this.f13228p) {
                                                if (c0872d1 != null) {
                                                    interfaceC1006g12 = c0872d1;
                                                } else if (c0827c1 != null) {
                                                    interfaceC1006g12 = c0827c1;
                                                }
                                                if (interfaceC1006g12 != null) {
                                                    interfaceC1006g12.g();
                                                    c0827c12 = interfaceC1006g12;
                                                } else {
                                                    c1617tm = c1617tm2;
                                                    b722.G(c1617tm.f15724a, 0, 4, false);
                                                    c1617tm.j(0);
                                                    s2.a(c1617tm.q());
                                                    c0827c12 = new C0827c1(s2.f11478e, s2.f11475b, b722.f7751m, b722.f7752n);
                                                    this.f13227o = c0827c12;
                                                    this.f13219e.x(c0827c12);
                                                    C1649uH c1649uH22 = new C1649uH();
                                                    c1649uH22.c((String) s2.f11479g);
                                                    c1649uH22.f15849m = 4096;
                                                    c1649uH22.f15831A = s2.f11477d;
                                                    c1649uH22.f15832B = s2.f11476c;
                                                    c1649uH22.f15834D = n5.f10758a;
                                                    c1649uH22.f15835E = n5.f10759b;
                                                    c1649uH22.f15846j = this.i;
                                                    if (this.f13227o.i() != -2147483647) {
                                                        c1649uH22.f15844g = this.f13227o.i();
                                                    }
                                                    this.f13220g.e(new C1407p(c1649uH22));
                                                    this.f13224l = b722.f7752n;
                                                }
                                            } else {
                                                c0827c12 = new C0961f1(-9223372036854775807L, 0L);
                                            }
                                            c1617tm = c1617tm2;
                                            this.f13227o = c0827c12;
                                            this.f13219e.x(c0827c12);
                                            C1649uH c1649uH222 = new C1649uH();
                                            c1649uH222.c((String) s2.f11479g);
                                            c1649uH222.f15849m = 4096;
                                            c1649uH222.f15831A = s2.f11477d;
                                            c1649uH222.f15832B = s2.f11476c;
                                            c1649uH222.f15834D = n5.f10758a;
                                            c1649uH222.f15835E = n5.f10759b;
                                            c1649uH222.f15846j = this.i;
                                            if (this.f13227o.i() != -2147483647) {
                                            }
                                            this.f13220g.e(new C1407p(c1649uH222));
                                            this.f13224l = b722.f7752n;
                                        }
                                    }
                                }
                                c0872d1 = null;
                                if (this.f13228p) {
                                }
                                c1617tm = c1617tm2;
                                this.f13227o = c0827c12;
                                this.f13219e.x(c0827c12);
                                C1649uH c1649uH2222 = new C1649uH();
                                c1649uH2222.c((String) s2.f11479g);
                                c1649uH2222.f15849m = 4096;
                                c1649uH2222.f15831A = s2.f11477d;
                                c1649uH2222.f15832B = s2.f11476c;
                                c1649uH2222.f15834D = n5.f10758a;
                                c1649uH2222.f15835E = n5.f10759b;
                                c1649uH2222.f15846j = this.i;
                                if (this.f13227o.i() != -2147483647) {
                                }
                                this.f13220g.e(new C1407p(c1649uH2222));
                                this.f13224l = b722.f7752n;
                            }
                        }
                        c1617tm2 = c1617tm3;
                        q5 = c1617tm4.q();
                        int y5 = (q5 & 1) == 0 ? c1617tm4.y() : -1;
                        long D5 = (q5 & 2) == 0 ? c1617tm4.D() : -1L;
                        if ((q5 & 4) != 4) {
                            long[] jArr6 = new long[100];
                            for (int i17 = 0; i17 < 100; i17++) {
                                jArr6[i17] = c1617tm4.v();
                            }
                            jArr = jArr6;
                        } else {
                            jArr = null;
                        }
                        if ((q5 & 8) != 0) {
                            c1617tm4.k(4);
                        }
                        if (c1617tm4.o() < 24) {
                            c1617tm4.k(21);
                            int x5 = c1617tm4.x();
                            i7 = x5 >> 12;
                            i6 = x5 & 4095;
                        } else {
                            i6 = -1;
                            i7 = -1;
                        }
                        j6 = y5;
                        i8 = s2.f11475b;
                        int i18 = s2.f11476c;
                        int i19 = s2.f11478e;
                        int i20 = s2.f;
                        if ((n5.f10758a != -1 || n5.f10759b == -1) && i7 != -1 && i6 != -1) {
                            n5.f10758a = i7;
                            n5.f10759b = i6;
                        }
                        B b8 = (B) g5;
                        long j17 = b8.f7752n;
                        j7 = b8.f7751m;
                        if (j7 != -1 || D5 == -1) {
                            i9 = i8;
                            j8 = j6;
                        } else {
                            j8 = j6;
                            long j18 = j17 + D5;
                            if (j7 != j18) {
                                i9 = i8;
                                JB.i("Mp3Extractor", "Data size mismatch between stream (" + j7 + ") and Xing frame (" + j18 + "), using Xing value.");
                            } else {
                                i9 = i8;
                            }
                        }
                        b8.k(s2.f11475b);
                        if (i5 != 1483304551) {
                            long t5 = (j8 == -1 || j8 == 0) ? -9223372036854775807L : AbstractC1260lo.t(i18, (j8 * i20) - 1);
                            if (t5 != -9223372036854775807L) {
                                c0827c1 = (D5 == -1 || jArr == null) ? new C1096i1(j17, i9, t5, i19, -1L, null) : new C1096i1(j17, i9, t5, i19, D5, jArr);
                                c5 = this.i;
                                B b7222 = (B) g5;
                                long j14222 = b7222.f7752n;
                                if (c5 != null) {
                                }
                                c0872d1 = null;
                                if (this.f13228p) {
                                }
                                c1617tm = c1617tm2;
                                this.f13227o = c0827c12;
                                this.f13219e.x(c0827c12);
                                C1649uH c1649uH22222 = new C1649uH();
                                c1649uH22222.c((String) s2.f11479g);
                                c1649uH22222.f15849m = 4096;
                                c1649uH22222.f15831A = s2.f11477d;
                                c1649uH22222.f15832B = s2.f11476c;
                                c1649uH22222.f15834D = n5.f10758a;
                                c1649uH22222.f15835E = n5.f10759b;
                                c1649uH22222.f15846j = this.i;
                                if (this.f13227o.i() != -2147483647) {
                                }
                                this.f13220g.e(new C1407p(c1649uH22222));
                                this.f13224l = b7222.f7752n;
                            }
                            c0827c1 = null;
                            c5 = this.i;
                            B b72222 = (B) g5;
                            long j142222 = b72222.f7752n;
                            if (c5 != null) {
                            }
                            c0872d1 = null;
                            if (this.f13228p) {
                            }
                            c1617tm = c1617tm2;
                            this.f13227o = c0827c12;
                            this.f13219e.x(c0827c12);
                            C1649uH c1649uH222222 = new C1649uH();
                            c1649uH222222.c((String) s2.f11479g);
                            c1649uH222222.f15849m = 4096;
                            c1649uH222222.f15831A = s2.f11477d;
                            c1649uH222222.f15832B = s2.f11476c;
                            c1649uH222222.f15834D = n5.f10758a;
                            c1649uH222222.f15835E = n5.f10759b;
                            c1649uH222222.f15846j = this.i;
                            if (this.f13227o.i() != -2147483647) {
                            }
                            this.f13220g.e(new C1407p(c1649uH222222));
                            this.f13224l = b72222.f7752n;
                        } else {
                            int i21 = i9;
                            long t6 = (j8 == -1 || j8 == 0) ? -9223372036854775807L : AbstractC1260lo.t(i18, (j8 * i20) - 1);
                            if (t6 != -9223372036854775807L) {
                                if (D5 != -1) {
                                    j7 = j17 + D5;
                                    j9 = D5 - i21;
                                } else if (j7 != -1) {
                                    j9 = (j7 - j17) - i21;
                                }
                                long j19 = j7;
                                long j20 = j9;
                                RoundingMode roundingMode = RoundingMode.HALF_UP;
                                c0827c1 = new C0827c1(AbstractC1400ot.t(AbstractC1260lo.u(j20, 8000000L, t6, roundingMode)), AbstractC1400ot.t(AbstractC1400ot.x(j20, j8, roundingMode)), j19, j17 + i21);
                                c5 = this.i;
                                B b722222 = (B) g5;
                                long j1422222 = b722222.f7752n;
                                if (c5 != null) {
                                }
                                c0872d1 = null;
                                if (this.f13228p) {
                                }
                                c1617tm = c1617tm2;
                                this.f13227o = c0827c12;
                                this.f13219e.x(c0827c12);
                                C1649uH c1649uH2222222 = new C1649uH();
                                c1649uH2222222.c((String) s2.f11479g);
                                c1649uH2222222.f15849m = 4096;
                                c1649uH2222222.f15831A = s2.f11477d;
                                c1649uH2222222.f15832B = s2.f11476c;
                                c1649uH2222222.f15834D = n5.f10758a;
                                c1649uH2222222.f15835E = n5.f10759b;
                                c1649uH2222222.f15846j = this.i;
                                if (this.f13227o.i() != -2147483647) {
                                }
                                this.f13220g.e(new C1407p(c1649uH2222222));
                                this.f13224l = b722222.f7752n;
                            }
                            c0827c1 = null;
                            c5 = this.i;
                            B b7222222 = (B) g5;
                            long j14222222 = b7222222.f7752n;
                            if (c5 != null) {
                            }
                            c0872d1 = null;
                            if (this.f13228p) {
                            }
                            c1617tm = c1617tm2;
                            this.f13227o = c0827c12;
                            this.f13219e.x(c0827c12);
                            C1649uH c1649uH22222222 = new C1649uH();
                            c1649uH22222222.c((String) s2.f11479g);
                            c1649uH22222222.f15849m = 4096;
                            c1649uH22222222.f15831A = s2.f11477d;
                            c1649uH22222222.f15832B = s2.f11476c;
                            c1649uH22222222.f15834D = n5.f10758a;
                            c1649uH22222222.f15835E = n5.f10759b;
                            c1649uH22222222.f15846j = this.i;
                            if (this.f13227o.i() != -2147483647) {
                            }
                            this.f13220g.e(new C1407p(c1649uH22222222));
                            this.f13224l = b7222222.f7752n;
                        }
                    }
                    if (c1617tm4.f15726c >= 40) {
                        c1617tm4.j(36);
                        if (c1617tm4.q() == 1447187017) {
                            i5 = 1447187017;
                            n5 = this.f13217c;
                            InterfaceC1006g1 interfaceC1006g122 = null;
                            if (i5 != 1231971951) {
                            }
                            c1617tm2 = c1617tm3;
                            q5 = c1617tm4.q();
                            if ((q5 & 1) == 0) {
                            }
                            if ((q5 & 2) == 0) {
                            }
                            if ((q5 & 4) != 4) {
                            }
                            if ((q5 & 8) != 0) {
                            }
                            if (c1617tm4.o() < 24) {
                            }
                            j6 = y5;
                            i8 = s2.f11475b;
                            int i182 = s2.f11476c;
                            int i192 = s2.f11478e;
                            int i202 = s2.f;
                            if (n5.f10758a != -1) {
                            }
                            n5.f10758a = i7;
                            n5.f10759b = i6;
                            B b82 = (B) g5;
                            long j172 = b82.f7752n;
                            j7 = b82.f7751m;
                            if (j7 != -1) {
                            }
                            i9 = i8;
                            j8 = j6;
                            b82.k(s2.f11475b);
                            if (i5 != 1483304551) {
                            }
                        }
                    }
                    i5 = 0;
                    n5 = this.f13217c;
                    InterfaceC1006g1 interfaceC1006g1222 = null;
                    if (i5 != 1231971951) {
                    }
                    c1617tm2 = c1617tm3;
                    q5 = c1617tm4.q();
                    if ((q5 & 1) == 0) {
                    }
                    if ((q5 & 2) == 0) {
                    }
                    if ((q5 & 4) != 4) {
                    }
                    if ((q5 & 8) != 0) {
                    }
                    if (c1617tm4.o() < 24) {
                    }
                    j6 = y5;
                    i8 = s2.f11475b;
                    int i1822 = s2.f11476c;
                    int i1922 = s2.f11478e;
                    int i2022 = s2.f;
                    if (n5.f10758a != -1) {
                    }
                    n5.f10758a = i7;
                    n5.f10759b = i6;
                    B b822 = (B) g5;
                    long j1722 = b822.f7752n;
                    j7 = b822.f7751m;
                    if (j7 != -1) {
                    }
                    i9 = i8;
                    j8 = j6;
                    b822.k(s2.f11475b);
                    if (i5 != 1483304551) {
                    }
                }
                i = 21;
                if (c1617tm4.f15726c >= i + 4) {
                }
                if (c1617tm4.f15726c >= 40) {
                }
                i5 = 0;
                n5 = this.f13217c;
                InterfaceC1006g1 interfaceC1006g12222 = null;
                if (i5 != 1231971951) {
                }
                c1617tm2 = c1617tm3;
                q5 = c1617tm4.q();
                if ((q5 & 1) == 0) {
                }
                if ((q5 & 2) == 0) {
                }
                if ((q5 & 4) != 4) {
                }
                if ((q5 & 8) != 0) {
                }
                if (c1617tm4.o() < 24) {
                }
                j6 = y5;
                i8 = s2.f11475b;
                int i18222 = s2.f11476c;
                int i19222 = s2.f11478e;
                int i20222 = s2.f;
                if (n5.f10758a != -1) {
                }
                n5.f10758a = i7;
                n5.f10759b = i6;
                B b8222 = (B) g5;
                long j17222 = b8222.f7752n;
                j7 = b8222.f7751m;
                if (j7 != -1) {
                }
                i9 = i8;
                j8 = j6;
                b8222.k(s2.f11475b);
                if (i5 != 1483304551) {
                }
            } else {
                if (s2.f11477d == 1) {
                    i = 13;
                    if (c1617tm4.f15726c >= i + 4) {
                    }
                    if (c1617tm4.f15726c >= 40) {
                    }
                    i5 = 0;
                    n5 = this.f13217c;
                    InterfaceC1006g1 interfaceC1006g122222 = null;
                    if (i5 != 1231971951) {
                    }
                    c1617tm2 = c1617tm3;
                    q5 = c1617tm4.q();
                    if ((q5 & 1) == 0) {
                    }
                    if ((q5 & 2) == 0) {
                    }
                    if ((q5 & 4) != 4) {
                    }
                    if ((q5 & 8) != 0) {
                    }
                    if (c1617tm4.o() < 24) {
                    }
                    j6 = y5;
                    i8 = s2.f11475b;
                    int i182222 = s2.f11476c;
                    int i192222 = s2.f11478e;
                    int i202222 = s2.f;
                    if (n5.f10758a != -1) {
                    }
                    n5.f10758a = i7;
                    n5.f10759b = i6;
                    B b82222 = (B) g5;
                    long j172222 = b82222.f7752n;
                    j7 = b82222.f7751m;
                    if (j7 != -1) {
                    }
                    i9 = i8;
                    j8 = j6;
                    b82222.k(s2.f11475b);
                    if (i5 != 1483304551) {
                    }
                }
                i = 21;
                if (c1617tm4.f15726c >= i + 4) {
                }
                if (c1617tm4.f15726c >= 40) {
                }
                i5 = 0;
                n5 = this.f13217c;
                InterfaceC1006g1 interfaceC1006g1222222 = null;
                if (i5 != 1231971951) {
                }
                c1617tm2 = c1617tm3;
                q5 = c1617tm4.q();
                if ((q5 & 1) == 0) {
                }
                if ((q5 & 2) == 0) {
                }
                if ((q5 & 4) != 4) {
                }
                if ((q5 & 8) != 0) {
                }
                if (c1617tm4.o() < 24) {
                }
                j6 = y5;
                i8 = s2.f11475b;
                int i1822222 = s2.f11476c;
                int i1922222 = s2.f11478e;
                int i2022222 = s2.f;
                if (n5.f10758a != -1) {
                }
                n5.f10758a = i7;
                n5.f10759b = i6;
                B b822222 = (B) g5;
                long j1722222 = b822222.f7752n;
                j7 = b822222.f7751m;
                if (j7 != -1) {
                }
                i9 = i8;
                j8 = j6;
                b822222.k(s2.f11475b);
                if (i5 != 1483304551) {
                }
            }
        } else {
            c1617tm = c1617tm3;
            j5 = 1000000;
            long j21 = this.f13224l;
            if (j21 != 0) {
                long j22 = ((B) g5).f7752n;
                if (j22 < j21) {
                    ((B) g5).k((int) (j21 - j22));
                }
            }
        }
        int i22 = this.f13226n;
        if (i22 == 0) {
            ((B) g5).f7754p = 0;
            B b9 = (B) g5;
            if (!b(b9)) {
                c1617tm.j(0);
                int q7 = c1617tm.q();
                if (((-128000) & q7) != (this.f13221h & (-128000)) || AbstractC1561sb.b(q7) == -1) {
                    b9.k(1);
                    this.f13221h = 0;
                    return 0;
                }
                s2.a(q7);
                if (this.f13222j == -9223372036854775807L) {
                    this.f13222j = this.f13227o.b(b9.f7752n);
                }
                int i23 = s2.f11475b;
                this.f13226n = i23;
                this.f13225m = b9.f7752n + i23;
                i22 = i23;
            }
            return -1;
        }
        int b10 = this.f13220g.b(g5, i22, true);
        if (b10 == -1) {
            return -1;
        }
        int i24 = this.f13226n - b10;
        this.f13226n = i24;
        if (i24 > 0) {
            return 0;
        }
        this.f13220g.d(this.f13222j + ((this.f13223k * j5) / s2.f11476c), 1, s2.f11475b, 0, null);
        this.f13223k += s2.f;
        this.f13226n = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void h(H h3) {
        HG hg = (HG) h3;
        this.f13219e = hg;
        InterfaceC0737a0 w5 = hg.w(0, 1);
        this.f = w5;
        this.f13220g = w5;
        this.f13219e.v();
    }

    @Override // com.google.android.gms.internal.ads.F
    public final List j() {
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        return C1761wv.f16184o;
    }
}
