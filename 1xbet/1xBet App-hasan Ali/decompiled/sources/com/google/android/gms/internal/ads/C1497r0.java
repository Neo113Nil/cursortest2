package com.google.android.gms.internal.ads;

import B.C0072a;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1497r0 implements F {

    /* renamed from: a, reason: collision with root package name */
    public final C1617tm f15197a = new C1617tm(4);

    /* renamed from: b, reason: collision with root package name */
    public final C1617tm f15198b = new C1617tm(9);

    /* renamed from: c, reason: collision with root package name */
    public final C1617tm f15199c = new C1617tm(11);

    /* renamed from: d, reason: collision with root package name */
    public final C1617tm f15200d = new C1617tm();

    /* renamed from: e, reason: collision with root package name */
    public final C1542s0 f15201e;
    public HG f;

    /* renamed from: g, reason: collision with root package name */
    public int f15202g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15203h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public int f15204j;

    /* renamed from: k, reason: collision with root package name */
    public int f15205k;

    /* renamed from: l, reason: collision with root package name */
    public int f15206l;

    /* renamed from: m, reason: collision with root package name */
    public long f15207m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f15208n;

    /* renamed from: o, reason: collision with root package name */
    public C1453q0 f15209o;

    /* renamed from: p, reason: collision with root package name */
    public C1632u0 f15210p;

    public C1497r0() {
        C1542s0 c1542s0 = new C1542s0(new E());
        c1542s0.f15402m = -9223372036854775807L;
        c1542s0.f15403n = new long[0];
        c1542s0.f15404o = new long[0];
        this.f15201e = c1542s0;
        this.f15202g = 1;
    }

    public final C1617tm a(B b3) {
        int i = this.f15206l;
        C1617tm c1617tm = this.f15200d;
        byte[] bArr = c1617tm.f15724a;
        if (i > bArr.length) {
            int length = bArr.length;
            c1617tm.h(0, new byte[Math.max(length + length, i)]);
        } else {
            c1617tm.j(0);
        }
        c1617tm.i(this.f15206l);
        b3.F(c1617tm.f15724a, 0, this.f15206l, false);
        return c1617tm;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void d(long j5, long j6) {
        if (j5 == 0) {
            this.f15202g = 1;
            this.f15203h = false;
        } else {
            this.f15202g = 3;
        }
        this.f15204j = 0;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final boolean e(G g5) {
        C1617tm c1617tm = this.f15197a;
        B b3 = (B) g5;
        b3.G(c1617tm.f15724a, 0, 3, false);
        c1617tm.j(0);
        if (c1617tm.x() == 4607062) {
            b3.G(c1617tm.f15724a, 0, 2, false);
            c1617tm.j(0);
            if ((c1617tm.z() & 250) == 0) {
                b3.G(c1617tm.f15724a, 0, 4, false);
                c1617tm.j(0);
                int q5 = c1617tm.q();
                ((B) g5).f7754p = 0;
                b3.g(q5, false);
                b3.G(c1617tm.f15724a, 0, 4, false);
                c1617tm.j(0);
                if (c1617tm.q() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x038b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0007 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(G g5, C0072a c0072a) {
        int i;
        long j5;
        int i5;
        long j6;
        int i6;
        int i7;
        int i8;
        AbstractC1668us.F(this.f);
        while (true) {
            int i9 = this.f15202g;
            int i10 = 8;
            if (i9 == 1) {
                C1617tm c1617tm = this.f15198b;
                if (!((B) g5).F(c1617tm.f15724a, 0, 9, true)) {
                    return -1;
                }
                c1617tm.j(0);
                c1617tm.k(4);
                int v4 = c1617tm.v();
                int i11 = v4 & 4;
                int i12 = v4 & 1;
                if (i11 != 0 && this.f15209o == null) {
                    this.f15209o = new C1453q0(this.f.w(8, 1));
                }
                if (i12 != 0 && this.f15210p == null) {
                    this.f15210p = new C1632u0(this.f.w(9, 2));
                }
                this.f.v();
                this.f15204j = c1617tm.q() - 5;
                this.f15202g = 2;
            } else if (i9 == 2) {
                ((B) g5).k(this.f15204j);
                this.f15204j = 0;
                this.f15202g = 3;
            } else if (i9 == 3) {
                C1617tm c1617tm2 = this.f15199c;
                if (!((B) g5).F(c1617tm2.f15724a, 0, 11, true)) {
                    return -1;
                }
                c1617tm2.j(0);
                this.f15205k = c1617tm2.v();
                this.f15206l = c1617tm2.x();
                this.f15207m = c1617tm2.x();
                this.f15207m = (this.f15207m | (c1617tm2.v() << 24)) * 1000;
                c1617tm2.k(3);
                this.f15202g = 4;
            } else {
                if (i9 != 4) {
                    throw new IllegalStateException();
                }
                boolean z3 = this.f15203h;
                C1542s0 c1542s0 = this.f15201e;
                if (z3) {
                    i = 0;
                    j5 = this.i + this.f15207m;
                } else {
                    i = 0;
                    j5 = c1542s0.f15402m == -9223372036854775807L ? 0L : this.f15207m;
                }
                long j7 = j5;
                int i13 = this.f15205k;
                if (i13 != 8) {
                    i10 = i13;
                } else if (this.f15209o != null) {
                    if (!this.f15208n) {
                        this.f.x(new J(-9223372036854775807L, 0L));
                        this.f15208n = true;
                    }
                    C1453q0 c1453q0 = this.f15209o;
                    C1617tm a5 = a((B) g5);
                    if (c1453q0.f15070m) {
                        a5.k(1);
                    } else {
                        int v5 = a5.v();
                        int i14 = v5 >> 4;
                        c1453q0.f15072o = i14;
                        InterfaceC0737a0 interfaceC0737a0 = (InterfaceC0737a0) c1453q0.f7794k;
                        if (i14 == 2) {
                            int i15 = C1453q0.f15069p[(v5 >> 2) & 3];
                            C1649uH c1649uH = new C1649uH();
                            c1649uH.c("audio/mpeg");
                            c1649uH.f15831A = 1;
                            c1649uH.f15832B = i15;
                            interfaceC0737a0.e(new C1407p(c1649uH));
                            c1453q0.f15071n = true;
                        } else if (i14 == 7 || i14 == 8) {
                            C1649uH c1649uH2 = new C1649uH();
                            c1649uH2.c(i14 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                            c1649uH2.f15831A = 1;
                            c1649uH2.f15832B = 8000;
                            interfaceC0737a0.e(new C1407p(c1649uH2));
                            c1453q0.f15071n = true;
                        } else if (i14 != 10) {
                            throw new C1587t0(AbstractC2107A.q("Audio format not supported: ", i14));
                        }
                        c1453q0.f15070m = true;
                    }
                    int i16 = c1453q0.f15072o;
                    InterfaceC0737a0 interfaceC0737a02 = (InterfaceC0737a0) c1453q0.f7794k;
                    if (i16 == 2) {
                        int o5 = a5.o();
                        interfaceC0737a02.c(o5, a5);
                        ((InterfaceC0737a0) c1453q0.f7794k).d(j7, 1, o5, 0, null);
                        i5 = i;
                    } else {
                        int v6 = a5.v();
                        if (v6 != 0 || c1453q0.f15071n) {
                            i5 = i;
                            if (c1453q0.f15072o != 10 || v6 == 1) {
                                int o6 = a5.o();
                                interfaceC0737a02.c(o6, a5);
                                ((InterfaceC0737a0) c1453q0.f7794k).d(j7, 1, o6, 0, null);
                            }
                        } else {
                            int o7 = a5.o();
                            byte[] bArr = new byte[o7];
                            a5.f(bArr, 0, o7);
                            C1541s c5 = AbstractC1561sb.c(new C0826c0(o7, bArr), false);
                            C1649uH c1649uH3 = new C1649uH();
                            i5 = i;
                            c1649uH3.c("audio/mp4a-latm");
                            c1649uH3.i = c5.f15399a;
                            c1649uH3.f15831A = c5.f15401c;
                            c1649uH3.f15832B = c5.f15400b;
                            c1649uH3.f15851o = Collections.singletonList(bArr);
                            interfaceC0737a02.e(new C1407p(c1649uH3));
                            c1453q0.f15071n = true;
                        }
                        i7 = 0;
                        i6 = 1;
                        j6 = -9223372036854775807L;
                        if (!this.f15203h && i7 != 0) {
                            this.f15203h = true;
                            this.i = c1542s0.f15402m != j6 ? -this.f15207m : 0L;
                        }
                        this.f15204j = 4;
                        this.f15202g = 2;
                        if (i6 != 0) {
                            return i5;
                        }
                    }
                    i7 = 1;
                    i6 = 1;
                    j6 = -9223372036854775807L;
                    if (!this.f15203h) {
                        this.f15203h = true;
                        this.i = c1542s0.f15402m != j6 ? -this.f15207m : 0L;
                    }
                    this.f15204j = 4;
                    this.f15202g = 2;
                    if (i6 != 0) {
                    }
                }
                i5 = i;
                if (i10 != 9) {
                    j6 = -9223372036854775807L;
                    if (i10 == 18 && !this.f15208n) {
                        C1617tm a6 = a((B) g5);
                        c1542s0.getClass();
                        c1542s0.getClass();
                        if (a6.v() == 2 && "onMetaData".equals(C1542s0.q1(a6)) && a6.o() != 0 && a6.v() == 8) {
                            HashMap r1 = C1542s0.r1(a6);
                            Object obj = r1.get("duration");
                            if (obj instanceof Double) {
                                double doubleValue = ((Double) obj).doubleValue();
                                if (doubleValue > 0.0d) {
                                    c1542s0.f15402m = (long) (doubleValue * 1000000.0d);
                                }
                            }
                            Object obj2 = r1.get("keyframes");
                            if (obj2 instanceof Map) {
                                Map map = (Map) obj2;
                                Object obj3 = map.get("filepositions");
                                Object obj4 = map.get("times");
                                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                    List list = (List) obj3;
                                    List list2 = (List) obj4;
                                    int size = list2.size();
                                    c1542s0.f15403n = new long[size];
                                    c1542s0.f15404o = new long[size];
                                    for (int i17 = 0; i17 < size; i17++) {
                                        Object obj5 = list.get(i17);
                                        Object obj6 = list2.get(i17);
                                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                            c1542s0.f15403n = new long[0];
                                            c1542s0.f15404o = new long[0];
                                            break;
                                        }
                                        c1542s0.f15403n[i17] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                        c1542s0.f15404o[i17] = ((Double) obj5).longValue();
                                    }
                                }
                            }
                        }
                        long j8 = c1542s0.f15402m;
                        if (j8 != -9223372036854775807L) {
                            this.f.x(new Q(j8, c1542s0.f15404o, c1542s0.f15403n));
                            this.f15208n = true;
                        }
                        i6 = 1;
                        i7 = i5;
                        if (!this.f15203h) {
                        }
                        this.f15204j = 4;
                        this.f15202g = 2;
                        if (i6 != 0) {
                        }
                    }
                    ((B) g5).k(this.f15206l);
                    i7 = i5;
                    i6 = i7;
                    if (!this.f15203h) {
                    }
                    this.f15204j = 4;
                    this.f15202g = 2;
                    if (i6 != 0) {
                    }
                } else if (this.f15210p != null) {
                    if (!this.f15208n) {
                        this.f.x(new J(-9223372036854775807L, 0L));
                        this.f15208n = true;
                    }
                    C1632u0 c1632u0 = this.f15210p;
                    C1617tm a7 = a((B) g5);
                    c1632u0.getClass();
                    int v7 = a7.v();
                    int i18 = v7 >> 4;
                    int i19 = v7 & 15;
                    if (i19 != 7) {
                        throw new C1587t0(AbstractC2107A.q("Video format not supported: ", i19));
                    }
                    c1632u0.f15761r = i18;
                    if (i18 != 5) {
                        int v8 = a7.v();
                        byte[] bArr2 = a7.f15724a;
                        int i20 = a7.f15725b;
                        int i21 = i20 + 1;
                        a7.f15725b = i21;
                        int i22 = bArr2[i20] & 255;
                        int i23 = i20 + 2;
                        a7.f15725b = i23;
                        int i24 = bArr2[i21] & 255;
                        a7.f15725b = i20 + 3;
                        long j9 = (bArr2[i23] & 255) | ((i22 << 24) >> 8) | (i24 << 8);
                        boolean z5 = true;
                        InterfaceC0737a0 interfaceC0737a03 = (InterfaceC0737a0) c1632u0.f7794k;
                        if (v8 == 0) {
                            if (!c1632u0.f15759p) {
                                byte[] bArr3 = new byte[a7.o()];
                                C1617tm c1617tm3 = new C1617tm(bArr3);
                                a7.f(bArr3, 0, a7.o());
                                C1631u a8 = C1631u.a(c1617tm3);
                                c1632u0.f15758o = a8.f15747b;
                                C1649uH c1649uH4 = new C1649uH();
                                c1649uH4.c("video/avc");
                                c1649uH4.i = a8.f15755l;
                                c1649uH4.f15855s = a8.f15748c;
                                c1649uH4.f15856t = a8.f15749d;
                                c1649uH4.f15859w = a8.f15754k;
                                c1649uH4.f15851o = a8.f15746a;
                                interfaceC0737a03.e(new C1407p(c1649uH4));
                                c1632u0.f15759p = true;
                            }
                        } else if (v8 == 1 && c1632u0.f15759p) {
                            int i25 = c1632u0.f15761r == 1 ? 1 : 0;
                            j6 = -9223372036854775807L;
                            if (c1632u0.f15760q) {
                                i8 = i25;
                            } else {
                                if (i25 != 0) {
                                    i8 = 1;
                                }
                                z5 = false;
                                if (z5) {
                                    i7 = 1;
                                    i6 = 1;
                                    if (!this.f15203h) {
                                    }
                                    this.f15204j = 4;
                                    this.f15202g = 2;
                                    if (i6 != 0) {
                                    }
                                }
                            }
                            C1617tm c1617tm4 = c1632u0.f15757n;
                            byte[] bArr4 = c1617tm4.f15724a;
                            bArr4[0] = 0;
                            bArr4[1] = 0;
                            bArr4[2] = 0;
                            int i26 = 4 - c1632u0.f15758o;
                            int i27 = 0;
                            while (a7.o() > 0) {
                                a7.f(c1617tm4.f15724a, i26, c1632u0.f15758o);
                                c1617tm4.j(0);
                                int y5 = c1617tm4.y();
                                C1617tm c1617tm5 = c1632u0.f15756m;
                                c1617tm5.j(0);
                                interfaceC0737a03.c(4, c1617tm5);
                                interfaceC0737a03.c(y5, a7);
                                i27 = i27 + 4 + y5;
                            }
                            ((InterfaceC0737a0) c1632u0.f7794k).d((j9 * 1000) + j7, i8, i27, 0, null);
                            c1632u0.f15760q = true;
                            if (z5) {
                            }
                        }
                        j6 = -9223372036854775807L;
                        z5 = false;
                        if (z5) {
                        }
                    } else {
                        j6 = -9223372036854775807L;
                    }
                    i7 = i5;
                    i6 = 1;
                    if (!this.f15203h) {
                    }
                    this.f15204j = 4;
                    this.f15202g = 2;
                    if (i6 != 0) {
                    }
                } else {
                    j6 = -9223372036854775807L;
                    ((B) g5).k(this.f15206l);
                    i7 = i5;
                    i6 = i7;
                    if (!this.f15203h) {
                    }
                    this.f15204j = 4;
                    this.f15202g = 2;
                    if (i6 != 0) {
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void h(H h3) {
        this.f = (HG) h3;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final List j() {
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        return C1761wv.f16184o;
    }
}
