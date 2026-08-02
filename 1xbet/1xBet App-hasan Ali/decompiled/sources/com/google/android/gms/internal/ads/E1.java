package com.google.android.gms.internal.ads;

import B.C0072a;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class E1 implements F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8446a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8447b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8448c;

    /* renamed from: d, reason: collision with root package name */
    public Object f8449d;

    public E1(int i) {
        this.f8446a = i;
        switch (i) {
            case 1:
                this.f8448c = new A2(0, 0, null);
                this.f8449d = new C1617tm(2786);
                break;
            case 2:
                this.f8448c = new A2(0, 1, null);
                this.f8449d = new C1617tm(16384);
                break;
        }
    }

    public boolean a(B b3) {
        G1 g12 = new G1();
        if (g12.a(b3, true) && (g12.f9152a & 2) == 2) {
            int min = Math.min(g12.f9156e, 8);
            C1617tm c1617tm = new C1617tm(min);
            b3.G(c1617tm.f15724a, 0, min, false);
            c1617tm.j(0);
            if (c1617tm.o() >= 5 && c1617tm.v() == 127 && c1617tm.D() == 1179402563) {
                this.f8449d = new D1();
                return true;
            }
            c1617tm.j(0);
            try {
                if (AbstractC1668us.T(1, c1617tm, true)) {
                    this.f8449d = new K1();
                    return true;
                }
            } catch (B7 unused) {
            }
            c1617tm.j(0);
            if (I1.e(c1617tm, I1.f9513o)) {
                this.f8449d = new I1();
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void d(long j5, long j6) {
        switch (this.f8446a) {
            case 0:
                J1 j12 = (J1) this.f8449d;
                if (j12 != null) {
                    F1 f12 = j12.f9663a;
                    G1 g12 = f12.f8645a;
                    g12.f9152a = 0;
                    g12.f9153b = 0L;
                    g12.f9154c = 0;
                    g12.f9155d = 0;
                    g12.f9156e = 0;
                    f12.f8646b.g(0);
                    f12.f8647c = -1;
                    f12.f8649e = false;
                    if (j5 != 0) {
                        if (j12.f9669h != 0) {
                            long j7 = (j12.i * j6) / 1000000;
                            j12.f9667e = j7;
                            H1 h1 = j12.f9666d;
                            int i = AbstractC1260lo.f14419a;
                            h1.c(j7);
                            j12.f9669h = 2;
                            break;
                        }
                    } else {
                        j12.b(!j12.f9672l);
                        break;
                    }
                }
                break;
            case 1:
                this.f8447b = false;
                ((A2) this.f8448c).b();
                break;
            default:
                this.f8447b = false;
                ((A2) this.f8448c).b();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final boolean e(G g5) {
        int j5;
        int i;
        int i5;
        int i6;
        switch (this.f8446a) {
            case 0:
                try {
                    break;
                }
            case 1:
                C1617tm c1617tm = new C1617tm(10);
                int i7 = 0;
                while (true) {
                    B b3 = (B) g5;
                    b3.G(c1617tm.f15724a, 0, 10, false);
                    c1617tm.j(0);
                    if (c1617tm.x() != 4801587) {
                        B b5 = (B) g5;
                        b5.f7754p = 0;
                        b3.g(i7, false);
                        int i8 = 0;
                        int i9 = i7;
                        while (true) {
                            b3.G(c1617tm.f15724a, 0, 6, false);
                            c1617tm.j(0);
                            if (c1617tm.z() != 2935) {
                                b5.f7754p = 0;
                                i9++;
                                if (i9 - i7 >= 8192) {
                                    break;
                                } else {
                                    b3.g(i9, false);
                                    i8 = 0;
                                }
                            } else {
                                i8++;
                                if (i8 >= 4) {
                                    break;
                                } else {
                                    byte[] bArr = c1617tm.f15724a;
                                    if (bArr.length < 6) {
                                        j5 = -1;
                                    } else if (((bArr[5] & 248) >> 3) > 10) {
                                        int i10 = (((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1;
                                        j5 = i10 + i10;
                                    } else {
                                        byte b6 = bArr[4];
                                        j5 = JB.j((b6 & 192) >> 6, b6 & 63);
                                    }
                                    if (j5 == -1) {
                                        break;
                                    } else {
                                        b3.g(j5 - 6, false);
                                    }
                                }
                            }
                        }
                    } else {
                        c1617tm.k(3);
                        int u5 = c1617tm.u();
                        i7 += u5 + 10;
                        b3.g(u5, false);
                    }
                }
            default:
                C1617tm c1617tm2 = new C1617tm(10);
                int i11 = 0;
                while (true) {
                    B b7 = (B) g5;
                    b7.G(c1617tm2.f15724a, 0, 10, false);
                    c1617tm2.j(0);
                    if (c1617tm2.x() != 4801587) {
                        B b8 = (B) g5;
                        b8.f7754p = 0;
                        b7.g(i11, false);
                        int i12 = 0;
                        int i13 = i11;
                        while (true) {
                            b7.G(c1617tm2.f15724a, 0, 7, false);
                            c1617tm2.j(0);
                            int z3 = c1617tm2.z();
                            if (z3 != 44096 && z3 != 44097) {
                                b8.f7754p = 0;
                                i13++;
                                if (i13 - i11 >= 8192) {
                                    break;
                                } else {
                                    b7.g(i13, false);
                                    i12 = 0;
                                }
                            } else {
                                i12++;
                                if (i12 >= 4) {
                                    break;
                                } else {
                                    byte[] bArr2 = c1617tm2.f15724a;
                                    if (bArr2.length < 7) {
                                        i6 = -1;
                                    } else {
                                        int i14 = (bArr2[3] & 255) | ((bArr2[2] & 255) << 8);
                                        if (i14 == 65535) {
                                            i = ((bArr2[4] & 255) << 16) | ((bArr2[5] & 255) << 8) | (bArr2[6] & 255);
                                            i5 = 7;
                                        } else {
                                            i = i14;
                                            i5 = 4;
                                        }
                                        if (z3 == 44097) {
                                            i5 += 2;
                                        }
                                        i6 = i + i5;
                                    }
                                    if (i6 == -1) {
                                        break;
                                    } else {
                                        b7.g(i6 - 7, false);
                                    }
                                }
                            }
                        }
                    } else {
                        c1617tm2.k(3);
                        int u6 = c1617tm2.u();
                        i11 += u6 + 10;
                        b7.g(u6, false);
                    }
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01df  */
    @Override // com.google.android.gms.internal.ads.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(G g5, C0072a c0072a) {
        int i;
        byte[] bArr;
        switch (this.f8446a) {
            case 0:
                AbstractC1668us.F((HG) this.f8448c);
                if (((J1) this.f8449d) == null) {
                    B b3 = (B) g5;
                    if (!a(b3)) {
                        throw B7.a(null, "Failed to determine bitstream type");
                    }
                    b3.f7754p = 0;
                }
                if (!this.f8447b) {
                    InterfaceC0737a0 w5 = ((HG) this.f8448c).w(0, 1);
                    ((HG) this.f8448c).v();
                    J1 j12 = (J1) this.f8449d;
                    j12.f9665c = (HG) this.f8448c;
                    j12.f9664b = w5;
                    j12.b(true);
                    this.f8447b = true;
                }
                J1 j13 = (J1) this.f8449d;
                AbstractC1668us.F(j13.f9664b);
                int i5 = AbstractC1260lo.f14419a;
                int i6 = j13.f9669h;
                F1 f12 = j13.f9663a;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            B b5 = (B) g5;
                            long g6 = j13.f9666d.g(b5);
                            if (g6 >= 0) {
                                c0072a.f658a = g6;
                                return 1;
                            }
                            if (g6 < -1) {
                                j13.d(-(g6 + 2));
                            }
                            if (!j13.f9672l) {
                                U b6 = j13.f9666d.b();
                                AbstractC1668us.F(b6);
                                j13.f9665c.x(b6);
                                j13.f9672l = true;
                            }
                            if (j13.f9671k > 0 || f12.a(b5)) {
                                j13.f9671k = 0L;
                                C1617tm c1617tm = f12.f8646b;
                                long a5 = j13.a(c1617tm);
                                if (a5 >= 0) {
                                    long j5 = j13.f9668g;
                                    if (j5 + a5 >= j13.f9667e) {
                                        j13.f9664b.c(c1617tm.f15726c, c1617tm);
                                        j13.f9664b.d((j5 * 1000000) / j13.i, 1, c1617tm.f15726c, 0, null);
                                        j13.f9667e = -1L;
                                    }
                                }
                                j13.f9668g += a5;
                            } else {
                                j13.f9669h = 3;
                            }
                        }
                        return -1;
                    }
                    ((B) g5).k((int) j13.f);
                    j13.f9669h = 2;
                    return 0;
                }
                while (true) {
                    B b7 = (B) g5;
                    if (f12.a(b7)) {
                        long j6 = b7.f7752n;
                        long j7 = j13.f;
                        j13.f9671k = j6 - j7;
                        C0709Wb c0709Wb = j13.f9670j;
                        C1617tm c1617tm2 = f12.f8646b;
                        if (j13.c(c1617tm2, j7, c0709Wb)) {
                            j13.f = ((B) g5).f7752n;
                        } else {
                            C1407p c1407p = (C1407p) j13.f9670j.f12040l;
                            j13.i = c1407p.f14887C;
                            if (!j13.f9673m) {
                                j13.f9664b.e(c1407p);
                                j13.f9673m = true;
                            }
                            B.N n5 = (B.N) j13.f9670j.f12041m;
                            if (n5 != null) {
                                j13.f9666d = n5;
                            } else {
                                long j8 = ((B) g5).f7751m;
                                if (j8 == -1) {
                                    j13.f9666d = new C1543s1(20);
                                } else {
                                    G1 g12 = f12.f8645a;
                                    i = 2;
                                    j13.f9666d = new C1(j13, j13.f, j8, g12.f9155d + g12.f9156e, g12.f9153b, (g12.f9152a & 4) != 0);
                                    j13.f9669h = i;
                                    bArr = c1617tm2.f15724a;
                                    if (bArr.length != 65025) {
                                        c1617tm2.h(c1617tm2.f15726c, Arrays.copyOf(bArr, Math.max(65025, c1617tm2.f15726c)));
                                    }
                                }
                            }
                            i = 2;
                            j13.f9669h = i;
                            bArr = c1617tm2.f15724a;
                            if (bArr.length != 65025) {
                            }
                        }
                    } else {
                        j13.f9669h = 3;
                    }
                }
                return 0;
            case 1:
                C1617tm c1617tm3 = (C1617tm) this.f8449d;
                int e3 = ((B) g5).e(c1617tm3.f15724a, 0, 2786);
                if (e3 == -1) {
                    return -1;
                }
                c1617tm3.j(0);
                c1617tm3.i(e3);
                boolean z3 = this.f8447b;
                A2 a22 = (A2) this.f8448c;
                if (!z3) {
                    a22.f7518n = 0L;
                    this.f8447b = true;
                }
                a22.c(c1617tm3);
                return 0;
            default:
                C1617tm c1617tm4 = (C1617tm) this.f8449d;
                int e5 = ((B) g5).e(c1617tm4.f15724a, 0, 16384);
                if (e5 == -1) {
                    return -1;
                }
                c1617tm4.j(0);
                c1617tm4.i(e5);
                boolean z5 = this.f8447b;
                A2 a23 = (A2) this.f8448c;
                if (!z5) {
                    a23.f7518n = 0L;
                    this.f8447b = true;
                }
                a23.c(c1617tm4);
                return 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void h(H h3) {
        switch (this.f8446a) {
            case 0:
                this.f8448c = (HG) h3;
                break;
            case 1:
                ((A2) this.f8448c).e(h3, new C0829c3(Integer.MIN_VALUE, 0, 1));
                HG hg = (HG) h3;
                hg.v();
                hg.x(new J(-9223372036854775807L, 0L));
                break;
            default:
                ((A2) this.f8448c).e(h3, new C0829c3(Integer.MIN_VALUE, 0, 1));
                HG hg2 = (HG) h3;
                hg2.v();
                hg2.x(new J(-9223372036854775807L, 0L));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final List j() {
        switch (this.f8446a) {
            case 0:
                C0954ev c0954ev = AbstractC1044gv.f13676l;
                break;
            case 1:
                C0954ev c0954ev2 = AbstractC1044gv.f13676l;
                break;
            default:
                C0954ev c0954ev3 = AbstractC1044gv.f13676l;
                break;
        }
        return C1761wv.f16184o;
    }
}
