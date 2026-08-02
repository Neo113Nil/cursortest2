package com.google.android.gms.internal.ads;

import java.util.Collections;

/* loaded from: classes.dex */
public final class P2 implements F2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f11020a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11021b;

    /* renamed from: c, reason: collision with root package name */
    public final C1617tm f11022c;

    /* renamed from: d, reason: collision with root package name */
    public final C0826c0 f11023d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0737a0 f11024e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public C1407p f11025g;

    /* renamed from: h, reason: collision with root package name */
    public int f11026h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f11027j;

    /* renamed from: k, reason: collision with root package name */
    public int f11028k;

    /* renamed from: l, reason: collision with root package name */
    public long f11029l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11030m;

    /* renamed from: n, reason: collision with root package name */
    public int f11031n;

    /* renamed from: o, reason: collision with root package name */
    public int f11032o;

    /* renamed from: p, reason: collision with root package name */
    public int f11033p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f11034q;

    /* renamed from: r, reason: collision with root package name */
    public long f11035r;

    /* renamed from: s, reason: collision with root package name */
    public int f11036s;

    /* renamed from: t, reason: collision with root package name */
    public long f11037t;

    /* renamed from: u, reason: collision with root package name */
    public int f11038u;

    /* renamed from: v, reason: collision with root package name */
    public String f11039v;

    public P2(String str, int i) {
        this.f11020a = str;
        this.f11021b = i;
        C1617tm c1617tm = new C1617tm(1024);
        this.f11022c = c1617tm;
        byte[] bArr = c1617tm.f15724a;
        this.f11023d = new C0826c0(bArr.length, bArr);
        this.f11029l = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void b() {
        this.f11026h = 0;
        this.f11029l = -9223372036854775807L;
        this.f11030m = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0196, code lost:
    
        if (r23.f11030m == false) goto L68;
     */
    @Override // com.google.android.gms.internal.ads.F2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C1617tm c1617tm) {
        int f;
        int i;
        int i5;
        boolean w5;
        int i6;
        AbstractC1668us.F(this.f11024e);
        while (c1617tm.o() > 0) {
            int i7 = this.f11026h;
            if (i7 != 0) {
                if (i7 != 1) {
                    C0826c0 c0826c0 = this.f11023d;
                    C1617tm c1617tm2 = this.f11022c;
                    if (i7 != 2) {
                        int min = Math.min(c1617tm.o(), this.f11027j - this.i);
                        c1617tm.f(c0826c0.f12943b, this.i, min);
                        int i8 = this.i + min;
                        this.i = i8;
                        if (i8 == this.f11027j) {
                            c0826c0.s(0);
                            if (!c0826c0.w()) {
                                this.f11030m = true;
                                int f5 = c0826c0.f(1);
                                if (f5 == 1) {
                                    i5 = c0826c0.f(1);
                                    i = 1;
                                } else {
                                    i = f5;
                                    i5 = 0;
                                }
                                this.f11031n = i5;
                                if (i5 != 0) {
                                    throw B7.a(null, null);
                                }
                                if (i == 1) {
                                    c0826c0.f((c0826c0.f(2) + 1) * 8);
                                    i = 1;
                                }
                                if (!c0826c0.w()) {
                                    throw B7.a(null, null);
                                }
                                this.f11032o = c0826c0.f(6);
                                int f6 = c0826c0.f(4);
                                int f7 = c0826c0.f(3);
                                if (f6 != 0 || f7 != 0) {
                                    throw B7.a(null, null);
                                }
                                if (i == 0) {
                                    int i9 = (c0826c0.f12944c * 8) + c0826c0.f12945d;
                                    int a5 = c0826c0.a();
                                    C1541s c5 = AbstractC1561sb.c(c0826c0, true);
                                    this.f11039v = c5.f15399a;
                                    this.f11036s = c5.f15400b;
                                    this.f11038u = c5.f15401c;
                                    int a6 = a5 - c0826c0.a();
                                    c0826c0.s(i9);
                                    byte[] bArr = new byte[(a6 + 7) / 8];
                                    c0826c0.m(a6, bArr);
                                    C1649uH c1649uH = new C1649uH();
                                    c1649uH.f15839a = this.f;
                                    c1649uH.c("audio/mp4a-latm");
                                    c1649uH.i = this.f11039v;
                                    c1649uH.f15831A = this.f11038u;
                                    c1649uH.f15832B = this.f11036s;
                                    c1649uH.f15851o = Collections.singletonList(bArr);
                                    c1649uH.f15842d = this.f11020a;
                                    c1649uH.f = this.f11021b;
                                    C1407p c1407p = new C1407p(c1649uH);
                                    if (!c1407p.equals(this.f11025g)) {
                                        this.f11025g = c1407p;
                                        this.f11037t = 1024000000 / c1407p.f14887C;
                                        this.f11024e.e(c1407p);
                                    }
                                } else {
                                    int a7 = c0826c0.a();
                                    C1541s c6 = AbstractC1561sb.c(c0826c0, true);
                                    this.f11039v = c6.f15399a;
                                    this.f11036s = c6.f15400b;
                                    this.f11038u = c6.f15401c;
                                    c0826c0.u(c0826c0.f((c0826c0.f(2) + 1) * 8) - (a7 - c0826c0.a()));
                                }
                                int f8 = c0826c0.f(3);
                                this.f11033p = f8;
                                if (f8 == 0) {
                                    c0826c0.u(8);
                                } else if (f8 == 1) {
                                    c0826c0.u(9);
                                } else if (f8 == 3 || f8 == 4 || f8 == 5) {
                                    c0826c0.u(6);
                                } else {
                                    if (f8 != 6 && f8 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    c0826c0.u(1);
                                }
                                boolean w6 = c0826c0.w();
                                this.f11034q = w6;
                                this.f11035r = 0L;
                                if (w6) {
                                    if (i != 1) {
                                        do {
                                            w5 = c0826c0.w();
                                            this.f11035r = (this.f11035r << 8) + c0826c0.f(8);
                                        } while (w5);
                                    } else {
                                        this.f11035r = c0826c0.f((c0826c0.f(2) + 1) * 8);
                                    }
                                }
                                if (c0826c0.w()) {
                                    c0826c0.u(8);
                                }
                            }
                            if (this.f11031n != 0) {
                                throw B7.a(null, null);
                            }
                            if (this.f11032o != 0) {
                                throw B7.a(null, null);
                            }
                            if (this.f11033p != 0) {
                                throw B7.a(null, null);
                            }
                            int i10 = 0;
                            do {
                                f = c0826c0.f(8);
                                i10 += f;
                            } while (f == 255);
                            int i11 = (c0826c0.f12944c * 8) + c0826c0.f12945d;
                            if ((i11 & 7) == 0) {
                                c1617tm2.j(i11 >> 3);
                            } else {
                                c0826c0.m(i10 * 8, c1617tm2.f15724a);
                                c1617tm2.j(0);
                            }
                            this.f11024e.c(i10, c1617tm2);
                            AbstractC1668us.a0(this.f11029l != -9223372036854775807L);
                            this.f11024e.d(this.f11029l, 1, i10, 0, null);
                            this.f11029l += this.f11037t;
                            if (this.f11034q) {
                                c0826c0.u((int) this.f11035r);
                            }
                            this.f11026h = 0;
                        } else {
                            continue;
                        }
                    } else {
                        int v4 = ((this.f11028k & (-225)) << 8) | c1617tm.v();
                        this.f11027j = v4;
                        if (v4 > c1617tm2.f15724a.length) {
                            c1617tm2.g(v4);
                            byte[] bArr2 = c1617tm2.f15724a;
                            int length = bArr2.length;
                            c0826c0.f12943b = bArr2;
                            i6 = 0;
                            c0826c0.f12944c = 0;
                            c0826c0.f12945d = 0;
                            c0826c0.f12946e = length;
                        } else {
                            i6 = 0;
                        }
                        this.i = i6;
                        this.f11026h = 3;
                    }
                } else {
                    int v5 = c1617tm.v();
                    if ((v5 & 224) == 224) {
                        this.f11028k = v5;
                        this.f11026h = 2;
                    } else if (v5 != 86) {
                        this.f11026h = 0;
                    }
                }
            } else if (c1617tm.v() == 86) {
                this.f11026h = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void d(boolean z3) {
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void e(H h3, C0829c3 c0829c3) {
        c0829c3.a();
        c0829c3.b();
        this.f11024e = h3.w(c0829c3.f12965d, 1);
        c0829c3.b();
        this.f = c0829c3.f12966e;
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void f(int i, long j5) {
        this.f11029l = j5;
    }
}
