package z0;

import java.util.Map;
import n.C2145o;
import r.C2321G;
import r.C2322H;
import w0.AbstractC2540a;
import x0.C2628n;
import x0.C2630p;
import x0.InterfaceC2637x;

/* renamed from: z0.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2739O extends x0.Z implements x0.Q, InterfaceC2743a0 {

    /* renamed from: p, reason: collision with root package name */
    public C2736L f21678p;

    /* renamed from: q, reason: collision with root package name */
    public i4.c f21679q;

    /* renamed from: r, reason: collision with root package name */
    public r0 f21680r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f21681s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f21682t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f21683u;

    /* renamed from: v, reason: collision with root package name */
    public final x0.L f21684v = new x0.L(0, this);

    /* renamed from: w, reason: collision with root package name */
    public C2145o f21685w;

    /* renamed from: x, reason: collision with root package name */
    public C2321G f21686x;

    public static void u0(e0 e0Var) {
        C2732H c2732h;
        e0 e0Var2 = e0Var.f21813z;
        C2731G c2731g = e0Var2 != null ? e0Var2.f21812y : null;
        C2731G c2731g2 = e0Var.f21812y;
        if (!kotlin.jvm.internal.l.a(c2731g, c2731g2)) {
            c2731g2.f21613P.f21663p.f21738G.f();
            return;
        }
        InterfaceC2742a u5 = c2731g2.f21613P.f21663p.u();
        if (u5 == null || (c2732h = ((Y) u5).f21738G) == null) {
            return;
        }
        c2732h.f();
    }

    @Override // W0.c
    public final /* synthetic */ float D(long j5) {
        return L1.a.c(j5, this);
    }

    @Override // W0.c
    public final /* synthetic */ int K(float f) {
        return L1.a.b(f, this);
    }

    @Override // W0.c
    public final /* synthetic */ long S(long j5) {
        return L1.a.f(j5, this);
    }

    @Override // W0.c
    public final /* synthetic */ float V(long j5) {
        return L1.a.e(j5, this);
    }

    @Override // W0.c
    public final long b0(float f) {
        return L1.a.g(i0(f), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f0(C2731G c2731g, C2630p c2630p) {
        char c5;
        long j5;
        long j6;
        long j7;
        C2321G c2321g;
        C2321G c2321g2;
        Object g5;
        long[] jArr;
        long[] jArr2;
        long j8;
        int i;
        char c6;
        long j9;
        long j10;
        int i5;
        int i6;
        int i7;
        C2321G c2321g3 = this.f21686x;
        char c7 = 7;
        long j11 = -9187201950435737472L;
        int i8 = 8;
        if (c2321g3 != null) {
            Object[] objArr = c2321g3.f18930c;
            long[] jArr3 = c2321g3.f18928a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i9 = 0;
                long j12 = 128;
                while (true) {
                    long j13 = jArr3[i9];
                    j6 = 255;
                    if ((((~j13) << c7) & j13 & j11) != j11) {
                        int i10 = 8 - ((~(i9 - length)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j13 & 255) < j12) {
                                c6 = c7;
                                C2322H c2322h = (C2322H) objArr[(i9 << 3) + i11];
                                j9 = j11;
                                Object[] objArr2 = c2322h.f18934b;
                                long[] jArr4 = c2322h.f18933a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j10 = j12;
                                    int i12 = 0;
                                    int i13 = i8;
                                    while (true) {
                                        int i14 = length2;
                                        long j14 = jArr4[i12];
                                        jArr2 = jArr3;
                                        j8 = j13;
                                        if ((((~j14) << c6) & j14 & j9) != j9) {
                                            int i15 = 8 - ((~(i12 - i14)) >>> 31);
                                            int i16 = 0;
                                            while (i16 < i15) {
                                                if ((j14 & 255) < j10) {
                                                    int i17 = (i12 << 3) + i16;
                                                    C2731G c2731g2 = (C2731G) ((B0) objArr2[i17]).get();
                                                    i6 = i16;
                                                    if (c2731g2 != null) {
                                                        boolean I5 = c2731g2.I();
                                                        i7 = i11;
                                                        if (I5) {
                                                        }
                                                    } else {
                                                        i7 = i11;
                                                    }
                                                    c2322h.l(i17);
                                                } else {
                                                    i6 = i16;
                                                    i7 = i11;
                                                }
                                                j14 >>= i13;
                                                i16 = i6 + 1;
                                                i11 = i7;
                                            }
                                            i = i11;
                                            if (i15 != i13) {
                                                break;
                                            }
                                        } else {
                                            i = i11;
                                        }
                                        length2 = i14;
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        j13 = j8;
                                        i11 = i;
                                        i13 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j8 = j13;
                                    i = i11;
                                    j10 = j12;
                                }
                                i5 = 8;
                            } else {
                                jArr2 = jArr3;
                                j8 = j13;
                                i = i11;
                                c6 = c7;
                                j9 = j11;
                                j10 = j12;
                                i5 = i8;
                            }
                            i8 = i5;
                            j13 = j8 >> i5;
                            c7 = c6;
                            j11 = j9;
                            j12 = j10;
                            i11 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c5 = c7;
                        j5 = j11;
                        j7 = j12;
                        if (i10 != i8) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c5 = c7;
                        j5 = j11;
                        j7 = j12;
                    }
                    if (i9 == length) {
                        break;
                    }
                    i9++;
                    c7 = c5;
                    j11 = j5;
                    j12 = j7;
                    jArr3 = jArr;
                    i8 = 8;
                }
                c2321g = this.f21686x;
                if (c2321g != null) {
                    long[] jArr5 = c2321g.f18928a;
                    int length3 = jArr5.length - 2;
                    if (length3 >= 0) {
                        int i18 = 0;
                        while (true) {
                            long j15 = jArr5[i18];
                            if ((((~j15) << c5) & j15 & j5) != j5) {
                                int i19 = 8 - ((~(i18 - length3)) >>> 31);
                                for (int i20 = 0; i20 < i19; i20++) {
                                    if ((j15 & j6) < j7) {
                                        int i21 = (i18 << 3) + i20;
                                        if (((C2322H) c2321g.f18930c[i21]).g()) {
                                            c2321g.l(i21);
                                        }
                                    }
                                    j15 >>= 8;
                                }
                                if (i19 != 8) {
                                    break;
                                }
                            }
                            if (i18 == length3) {
                                break;
                            } else {
                                i18++;
                            }
                        }
                    }
                }
                c2321g2 = this.f21686x;
                if (c2321g2 == null) {
                    c2321g2 = new C2321G();
                    this.f21686x = c2321g2;
                }
                g5 = c2321g2.g(c2630p);
                if (g5 == null) {
                    g5 = new C2322H();
                    c2321g2.m(c2630p, g5);
                }
                ((C2322H) g5).i(new B0(c2731g));
            }
        }
        c5 = 7;
        j5 = -9187201950435737472L;
        j6 = 255;
        j7 = 128;
        c2321g = this.f21686x;
        if (c2321g != null) {
        }
        c2321g2 = this.f21686x;
        if (c2321g2 == null) {
        }
        g5 = c2321g2.g(c2630p);
        if (g5 == null) {
        }
        ((C2322H) g5).i(new B0(c2731g));
    }

    public abstract int g0(C2628n c2628n);

    @Override // W0.c
    public final float h0(int i) {
        return i / c();
    }

    @Override // x0.Q
    public final x0.P i(int i, int i5, Map map, i4.c cVar) {
        return p(i, i5, map, null, cVar);
    }

    @Override // W0.c
    public final float i0(float f) {
        return f / c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j0(r0 r0Var, long j5, long j6) {
        C2322H c2322h;
        C2322H c2322h2;
        boolean z3;
        char c5;
        long j7;
        long j8;
        long j9;
        C2731G c2731g;
        boolean z5;
        int i;
        char c6;
        long j10;
        p0 snapshotObserver;
        C2321G c2321g = this.f21686x;
        C2145o c2145o = this.f21685w;
        if (c2145o == null) {
            c2145o = new C2145o();
            this.f21685w = c2145o;
        }
        C2145o c2145o2 = c2145o;
        A0.F f = p0().f21636w;
        if (f != null && (snapshotObserver = f.getSnapshotObserver()) != null) {
            snapshotObserver.a(r0Var, C2748e.f21778n, new C2737M(this, j5, j6, r0Var));
        }
        boolean t5 = t();
        int i5 = c2145o2.f18294a;
        int i6 = 0;
        while (true) {
            c2322h = (C2322H) c2145o2.f18298e;
            c2322h2 = (C2322H) c2145o2.f;
            if (i6 >= i5) {
                break;
            }
            byte b3 = ((byte[]) c2145o2.f18297d)[i6];
            if (b3 == 3) {
                C2630p c2630p = ((C2630p[]) c2145o2.f18295b)[i6];
                kotlin.jvm.internal.l.c(c2630p);
                c2322h2.i(c2630p);
            } else if (b3 != 0 && c2321g != null) {
                C2630p c2630p2 = ((C2630p[]) c2145o2.f18295b)[i6];
                kotlin.jvm.internal.l.c(c2630p2);
                C2322H c2322h3 = (C2322H) c2321g.k(c2630p2);
                if (c2322h3 != null) {
                    c2322h.j(c2322h3);
                }
            }
            i6++;
        }
        int i7 = c2145o2.f18294a;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            byte[] bArr = (byte[]) c2145o2.f18297d;
            if (bArr[i9] == 2) {
                i8++;
            } else if (i8 > 0) {
                C2630p[] c2630pArr = (C2630p[]) c2145o2.f18295b;
                c2630pArr[i9 - i8] = c2630pArr[i9];
            }
            bArr[i9] = 2;
        }
        int i10 = c2145o2.f18294a;
        for (int i11 = i10 - i8; i11 < i10; i11++) {
            ((C2630p[]) c2145o2.f18295b)[i11] = null;
        }
        c2145o2.f18294a -= i8;
        AbstractC2739O r02 = r0();
        Object[] objArr = c2322h2.f18934b;
        long[] jArr = c2322h2.f18933a;
        int length = jArr.length - 2;
        char c7 = 7;
        long j11 = -9187201950435737472L;
        int i12 = 8;
        if (length >= 0) {
            j8 = 128;
            int i13 = 0;
            while (true) {
                long j12 = jArr[i13];
                j9 = 255;
                if ((((~j12) << c7) & j12 & j11) != j11) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j12 & 255) < 128) {
                            c6 = c7;
                            C2630p c2630p3 = (C2630p) objArr[(i13 << 3) + i15];
                            j10 = j11;
                            AbstractC2739O abstractC2739O = r02 == null ? this : r02;
                            i = i12;
                            AbstractC2739O abstractC2739O2 = abstractC2739O;
                            while (true) {
                                C2145o c2145o3 = abstractC2739O2.f21685w;
                                if (c2145o3 != null) {
                                    z5 = t5;
                                    if (X3.l.p0((C2630p[]) c2145o3.f18295b, c2630p3)) {
                                        break;
                                    }
                                } else {
                                    z5 = t5;
                                }
                                AbstractC2739O r03 = abstractC2739O2.r0();
                                if (r03 == null) {
                                    break;
                                }
                                abstractC2739O2 = r03;
                                t5 = z5;
                            }
                            C2321G c2321g2 = abstractC2739O2.f21686x;
                            C2322H c2322h4 = c2321g2 != null ? (C2322H) c2321g2.k(c2630p3) : null;
                            if (c2322h4 != null) {
                                abstractC2739O.v0(c2322h4);
                            }
                        } else {
                            z5 = t5;
                            i = i12;
                            c6 = c7;
                            j10 = j11;
                        }
                        j12 >>= i;
                        i15++;
                        c7 = c6;
                        j11 = j10;
                        i12 = i;
                        t5 = z5;
                    }
                    z3 = t5;
                    c5 = c7;
                    j7 = j11;
                    if (i14 != i12) {
                        break;
                    }
                } else {
                    z3 = t5;
                    c5 = c7;
                    j7 = j11;
                }
                if (i13 == length) {
                    break;
                }
                i13++;
                c7 = c5;
                j11 = j7;
                t5 = z3;
                i12 = 8;
            }
        } else {
            z3 = t5;
            c5 = 7;
            j7 = -9187201950435737472L;
            j8 = 128;
            j9 = 255;
        }
        c2322h2.b();
        Object[] objArr2 = c2322h.f18934b;
        long[] jArr2 = c2322h.f18933a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i16 = 0;
            while (true) {
                long j13 = jArr2[i16];
                if ((((~j13) << c5) & j13 & j7) != j7) {
                    int i17 = 8 - ((~(i16 - length2)) >>> 31);
                    for (int i18 = 0; i18 < i17; i18++) {
                        if ((j13 & j9) < j8 && (c2731g = (C2731G) ((B0) objArr2[(i16 << 3) + i18]).get()) != null) {
                            if (z3) {
                                c2731g.T(false);
                            } else {
                                c2731g.V(false);
                            }
                        }
                        j13 >>= 8;
                    }
                    if (i17 != 8) {
                        break;
                    }
                }
                if (i16 == length2) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        c2322h.b();
    }

    public final void k0(x0.P p5) {
        long j5;
        long j6;
        C2321G c2321g = this.f21686x;
        if (!this.f21683u) {
            i4.c d5 = p5.d();
            if (d5 != null) {
                boolean z3 = this.f21679q != d5;
                if (z3 || !t0().f21665k) {
                    j5 = 0;
                    j6 = 9223372034707292159L;
                } else {
                    InterfaceC2637x n02 = n0();
                    long K = G4.l.K(n02.b(0L));
                    long I5 = n02.I();
                    j6 = K;
                    j5 = I5;
                    z3 = (W0.j.a(K, t0().f21666l) && W0.l.a(I5, t0().f21667m)) ? false : true;
                }
                if (z3) {
                    r0 r0Var = this.f21680r;
                    if (r0Var != null) {
                        r0Var.f21853k = p5;
                    } else {
                        r0Var = new r0(p5, this);
                        this.f21680r = r0Var;
                    }
                    j0(r0Var, j6, j5);
                    this.f21679q = p5.d();
                }
            } else if (c2321g != null) {
                Object[] objArr = c2321g.f18930c;
                long[] jArr = c2321g.f18928a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j7 = jArr[i];
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((255 & j7) < 128) {
                                    v0((C2322H) objArr[(i << 3) + i6]);
                                }
                                j7 >>= 8;
                            }
                            if (i5 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                c2321g.a();
            }
        }
    }

    public final int l0(C2628n c2628n) {
        int g02;
        if (o0() && (g02 = g0(c2628n)) != Integer.MIN_VALUE) {
            return g02 + ((int) (this.f20977o & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    @Override // z0.InterfaceC2743a0
    public final void m(boolean z3) {
        AbstractC2739O r02 = r0();
        C2731G p02 = r02 != null ? r02.p0() : null;
        if (kotlin.jvm.internal.l.a(p02, p0())) {
            this.f21681s = z3;
            return;
        }
        if ((p02 != null ? p02.f21613P.f21653d : null) != EnumC2727C.f21587m) {
            if ((p02 != null ? p02.f21613P.f21653d : null) != EnumC2727C.f21588n) {
                return;
            }
        }
        this.f21681s = z3;
    }

    public abstract AbstractC2739O m0();

    public abstract InterfaceC2637x n0();

    public abstract boolean o0();

    @Override // x0.Q
    public final x0.P p(int i, int i5, Map map, i0.K k5, i4.c cVar) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i5) != 0) {
            AbstractC2540a.b("Size(" + i + " x " + i5 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C2738N(i, i5, map, k5, cVar, this);
    }

    public abstract C2731G p0();

    public abstract x0.P q0();

    public abstract AbstractC2739O r0();

    public abstract long s0();

    @Override // x0.InterfaceC2632s
    public boolean t() {
        return false;
    }

    public final C2736L t0() {
        C2736L c2736l = this.f21678p;
        if (c2736l != null) {
            return c2736l;
        }
        C2736L c2736l2 = new C2736L(this);
        this.f21678p = c2736l2;
        return c2736l2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v0(C2322H c2322h) {
        C2731G c2731g;
        Object[] objArr = c2322h.f18934b;
        long[] jArr = c2322h.f18933a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j5 = jArr[i];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8 - ((~(i - length)) >>> 31);
                for (int i6 = 0; i6 < i5; i6++) {
                    if ((255 & j5) < 128 && (c2731g = (C2731G) ((B0) objArr[(i << 3) + i6]).get()) != null) {
                        if (t()) {
                            c2731g.T(false);
                        } else {
                            c2731g.V(false);
                        }
                    }
                    j5 >>= 8;
                }
                if (i5 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public abstract void w0();

    @Override // W0.c
    public final /* synthetic */ long x(long j5) {
        return L1.a.d(j5, this);
    }

    @Override // W0.c
    public final float y(float f) {
        return c() * f;
    }
}
