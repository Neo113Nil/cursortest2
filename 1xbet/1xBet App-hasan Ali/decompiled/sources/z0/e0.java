package z0;

import A0.C0022e0;
import A0.W0;
import a.AbstractC0444a;
import a3.AbstractC0467k;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.ViewParent;
import h0.C1987a;
import h0.C1988b;
import h0.C1989c;
import h0.C1990d;
import i0.AbstractC1998c;
import i0.AbstractC2005j;
import i0.C1994A;
import i0.C1995B;
import i0.C2003h;
import i0.C2006k;
import i0.InterfaceC2009n;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import k0.C2021a;
import k0.C2022b;
import l0.C2041b;
import l0.InterfaceC2043d;
import r.C2315A;
import r.C2316B;
import r.C2322H;
import t0.InterfaceC2409f;
import t3.AbstractC2425d;
import w0.AbstractC2540a;
import x0.C2628n;
import x0.InterfaceC2637x;

/* loaded from: classes.dex */
public abstract class e0 extends AbstractC2739O implements x0.N, InterfaceC2637x, o0 {

    /* renamed from: T, reason: collision with root package name */
    public static final i0.G f21790T;

    /* renamed from: U, reason: collision with root package name */
    public static final C2763u f21791U;

    /* renamed from: V, reason: collision with root package name */
    public static final float[] f21792V;

    /* renamed from: W, reason: collision with root package name */
    public static final C2747d f21793W;

    /* renamed from: X, reason: collision with root package name */
    public static final C2747d f21794X;

    /* renamed from: A, reason: collision with root package name */
    public e0 f21795A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f21796B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f21797C;

    /* renamed from: D, reason: collision with root package name */
    public i4.c f21798D;

    /* renamed from: E, reason: collision with root package name */
    public W0.c f21799E;

    /* renamed from: F, reason: collision with root package name */
    public W0.m f21800F;

    /* renamed from: H, reason: collision with root package name */
    public x0.P f21802H;

    /* renamed from: I, reason: collision with root package name */
    public C2315A f21803I;
    public float K;

    /* renamed from: L, reason: collision with root package name */
    public C1987a f21804L;

    /* renamed from: M, reason: collision with root package name */
    public C2763u f21805M;

    /* renamed from: N, reason: collision with root package name */
    public C2041b f21806N;

    /* renamed from: O, reason: collision with root package name */
    public InterfaceC2009n f21807O;

    /* renamed from: P, reason: collision with root package name */
    public C0022e0 f21808P;

    /* renamed from: R, reason: collision with root package name */
    public boolean f21810R;

    /* renamed from: S, reason: collision with root package name */
    public m0 f21811S;

    /* renamed from: y, reason: collision with root package name */
    public final C2731G f21812y;

    /* renamed from: z, reason: collision with root package name */
    public e0 f21813z;

    /* renamed from: G, reason: collision with root package name */
    public float f21801G = 0.8f;
    public long J = 0;

    /* renamed from: Q, reason: collision with root package name */
    public final d0 f21809Q = new d0(this, 1);

    static {
        i0.G g5 = new i0.G();
        g5.f17228l = 1.0f;
        g5.f17229m = 1.0f;
        g5.f17230n = 1.0f;
        long j5 = i0.v.f17299a;
        g5.f17232p = j5;
        g5.f17233q = j5;
        g5.f17235s = 8.0f;
        g5.f17236t = i0.N.f17263b;
        g5.f17237u = i0.F.f17222a;
        g5.f17239w = 9205357640488583168L;
        g5.f17240x = AbstractC2425d.a();
        g5.f17241y = W0.m.f6016k;
        g5.f17242z = 3;
        f21790T = g5;
        f21791U = new C2763u();
        f21792V = i0.z.a();
        f21793W = new C2747d(1);
        f21794X = new C2747d(2);
    }

    public e0(C2731G c2731g) {
        this.f21812y = c2731g;
        this.f21799E = c2731g.f21607H;
        this.f21800F = c2731g.f21608I;
    }

    public static e0 c1(InterfaceC2637x interfaceC2637x) {
        e0 e0Var;
        x0.M m5 = interfaceC2637x instanceof x0.M ? (x0.M) interfaceC2637x : null;
        if (m5 != null && (e0Var = m5.f20959k.f21691y) != null) {
            return e0Var;
        }
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator", interfaceC2637x);
        return (e0) interfaceC2637x;
    }

    public final float A0(long j5, long j6) {
        if (X() >= Float.intBitsToFloat((int) (j6 >> 32)) && W() >= Float.intBitsToFloat((int) (j6 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long z02 = z0(j6);
        float intBitsToFloat = Float.intBitsToFloat((int) (z02 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (z02 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j5 >> 32));
        float max = Math.max(0.0f, intBitsToFloat3 < 0.0f ? -intBitsToFloat3 : intBitsToFloat3 - X());
        long floatToRawIntBits = (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j5 & 4294967295L)) < 0.0f ? -r9 : r9 - W())) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
        if (intBitsToFloat > 0.0f || intBitsToFloat2 > 0.0f) {
            int i = (int) (floatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= intBitsToFloat) {
                int i5 = (int) (floatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i5) <= intBitsToFloat2) {
                    float intBitsToFloat4 = Float.intBitsToFloat(i);
                    float intBitsToFloat5 = Float.intBitsToFloat(i5);
                    return (intBitsToFloat5 * intBitsToFloat5) + (intBitsToFloat4 * intBitsToFloat4);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void B0(InterfaceC2009n interfaceC2009n, C2041b c2041b) {
        boolean z3;
        Canvas canvas;
        boolean z5;
        boolean z6;
        float f;
        m0 m0Var = this.f21811S;
        if (m0Var == null) {
            long j5 = this.J;
            float f5 = (int) (j5 >> 32);
            float f6 = (int) (j5 & 4294967295L);
            interfaceC2009n.g(f5, f6);
            C0(interfaceC2009n, c2041b);
            interfaceC2009n.g(-f5, -f6);
            return;
        }
        W0 w02 = (W0) m0Var;
        w02.f();
        w02.f405D = w02.f407k.f17665a.F() > 0.0f;
        C2022b c2022b = w02.f419w;
        v3.e eVar = c2022b.f17540l;
        eVar.M(interfaceC2009n);
        eVar.f20433m = c2041b;
        C2041b c2041b2 = w02.f407k;
        InterfaceC2009n v4 = c2022b.B().v();
        C2041b c2041b3 = (C2041b) c2022b.B().f20433m;
        if (c2041b2.f17681s) {
            return;
        }
        c2041b2.a();
        InterfaceC2043d interfaceC2043d = c2041b2.f17665a;
        if (!interfaceC2043d.G()) {
            try {
                interfaceC2043d.f(c2041b2.f17666b, c2041b2.f17667c, c2041b2, c2041b2.f17669e);
            } catch (Throwable unused) {
            }
        }
        boolean z7 = interfaceC2043d.F() > 0.0f;
        if (z7) {
            v4.r();
        }
        Canvas a5 = AbstractC1998c.a(v4);
        boolean isHardwareAccelerated = a5.isHardwareAccelerated();
        if (!isHardwareAccelerated) {
            long j6 = c2041b2.f17682t;
            float f7 = (int) (j6 >> 32);
            float f8 = (int) (j6 & 4294967295L);
            long j7 = c2041b2.f17683u;
            float f9 = ((int) (j7 >> 32)) + f7;
            float f10 = f8 + ((int) (j7 & 4294967295L));
            float a6 = interfaceC2043d.a();
            C2006k x5 = interfaceC2043d.x();
            int K = interfaceC2043d.K();
            if (a6 < 1.0f || K != 3 || x5 != null || interfaceC2043d.v() == 1) {
                J2.b bVar = c2041b2.f17678p;
                if (bVar == null) {
                    bVar = i0.F.g();
                    c2041b2.f17678p = bVar;
                }
                bVar.c(a6);
                bVar.d(K);
                bVar.f(x5);
                f = f7;
                a5.saveLayer(f, f8, f9, f10, (Paint) bVar.f2696c);
            } else {
                a5.save();
                f = f7;
            }
            a5.translate(f, f8);
            a5.concat(interfaceC2043d.B());
        }
        boolean z8 = !isHardwareAccelerated && c2041b2.f17685w;
        if (z8) {
            v4.k();
            i0.D d5 = c2041b2.d();
            if (d5 instanceof C1995B) {
                v4.p(((C1995B) d5).f17219a);
            } else if (d5 instanceof i0.C) {
                C2003h c2003h = c2041b2.f17675m;
                if (c2003h != null) {
                    c2003h.f17279a.rewind();
                } else {
                    c2003h = AbstractC2005j.a();
                    c2041b2.f17675m = c2003h;
                }
                AbstractC0467k.g(c2003h, ((i0.C) d5).f17220a);
                v4.d(c2003h);
            } else {
                if (!(d5 instanceof C1994A)) {
                    throw new D2.e();
                }
                v4.d(((C1994A) d5).f17218a);
            }
        }
        if (c2041b3 != null) {
            A.v vVar = c2041b3.f17680r;
            if (!vVar.f132a) {
                i0.x.a("Only add dependencies during a tracking");
            }
            C2322H c2322h = (C2322H) vVar.f135d;
            if (c2322h != null) {
                c2322h.a(c2041b2);
            } else if (((C2041b) vVar.f133b) != null) {
                int i = r.P.f18958a;
                C2322H c2322h2 = new C2322H();
                C2041b c2041b4 = (C2041b) vVar.f133b;
                kotlin.jvm.internal.l.c(c2041b4);
                c2322h2.a(c2041b4);
                c2322h2.a(c2041b2);
                vVar.f135d = c2322h2;
                vVar.f133b = null;
            } else {
                vVar.f133b = c2041b2;
            }
            C2322H c2322h3 = (C2322H) vVar.f136e;
            if (c2322h3 != null) {
                z6 = !c2322h3.k(c2041b2);
            } else if (((C2041b) vVar.f134c) != c2041b2) {
                z6 = true;
            } else {
                vVar.f134c = null;
                z6 = false;
            }
            if (z6) {
                c2041b2.f17679q++;
            }
        }
        if (AbstractC1998c.a(v4).isHardwareAccelerated()) {
            z3 = z7;
            canvas = a5;
            z5 = z8;
            interfaceC2043d.I(v4);
        } else {
            C2022b c2022b2 = c2041b2.f17677o;
            if (c2022b2 == null) {
                c2022b2 = new C2022b();
                c2041b2.f17677o = c2022b2;
            }
            W0.c cVar = c2041b2.f17666b;
            W0.m mVar = c2041b2.f17667c;
            long d02 = AbstractC0444a.d0(c2041b2.f17683u);
            v3.e eVar2 = c2022b2.f17540l;
            C2021a c2021a = ((C2022b) eVar2.f20434n).f17539k;
            W0.c cVar2 = c2021a.f17535a;
            W0.m mVar2 = c2021a.f17536b;
            InterfaceC2009n v5 = eVar2.v();
            canvas = a5;
            z5 = z8;
            long A3 = eVar2.A();
            z3 = z7;
            C2041b c2041b5 = (C2041b) eVar2.f20433m;
            eVar2.N(cVar);
            eVar2.O(mVar);
            eVar2.M(v4);
            eVar2.P(d02);
            eVar2.f20433m = c2041b2;
            v4.k();
            try {
                c2041b2.c(c2022b2);
            } finally {
                v4.j();
                eVar2.N(cVar2);
                eVar2.O(mVar2);
                eVar2.M(v5);
                eVar2.P(A3);
                eVar2.f20433m = c2041b5;
            }
        }
        if (z5) {
            v4.j();
        }
        if (z3) {
            v4.m();
        }
        if (isHardwareAccelerated) {
            return;
        }
        canvas.restore();
    }

    public final void C0(InterfaceC2009n interfaceC2009n, C2041b c2041b) {
        InterfaceC2009n interfaceC2009n2;
        C2041b c2041b2;
        b0.o J02 = J0(4);
        if (J02 == null) {
            X0(interfaceC2009n, c2041b);
            return;
        }
        C2731G c2731g = this.f21812y;
        c2731g.getClass();
        C2733I sharedDrawScope = ((A0.F) AbstractC2734J.a(c2731g)).getSharedDrawScope();
        long d02 = AbstractC0444a.d0(this.f20975m);
        sharedDrawScope.getClass();
        R.e eVar = null;
        while (J02 != null) {
            if (J02 instanceof InterfaceC2757n) {
                interfaceC2009n2 = interfaceC2009n;
                c2041b2 = c2041b;
                sharedDrawScope.b(interfaceC2009n2, d02, this, (InterfaceC2757n) J02, c2041b2);
            } else {
                interfaceC2009n2 = interfaceC2009n;
                c2041b2 = c2041b;
                if ((J02.f7164m & 4) != 0 && (J02 instanceof AbstractC2756m)) {
                    int i = 0;
                    for (b0.o oVar = ((AbstractC2756m) J02).f21839z; oVar != null; oVar = oVar.f7167p) {
                        if ((oVar.f7164m & 4) != 0) {
                            i++;
                            if (i == 1) {
                                J02 = oVar;
                            } else {
                                if (eVar == null) {
                                    eVar = new R.e(new b0.o[16]);
                                }
                                if (J02 != null) {
                                    eVar.c(J02);
                                    J02 = null;
                                }
                                eVar.c(oVar);
                            }
                        }
                    }
                    if (i == 1) {
                        interfaceC2009n = interfaceC2009n2;
                        c2041b = c2041b2;
                    }
                }
            }
            J02 = AbstractC2749f.f(eVar);
            interfaceC2009n = interfaceC2009n2;
            c2041b = c2041b2;
        }
    }

    public abstract void D0();

    @Override // x0.InterfaceC2637x
    public final long E(long j5) {
        if (!I0().f7175x) {
            AbstractC2540a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return R0(x0.f0.h(this), ((A0.F) AbstractC2734J.a(this.f21812y)).J(j5));
    }

    public final e0 E0(e0 e0Var) {
        C2731G c2731g = e0Var.f21812y;
        C2731G c2731g2 = this.f21812y;
        if (c2731g == c2731g2) {
            b0.o I02 = e0Var.I0();
            b0.o I03 = I0();
            if (!I03.f7162k.f7175x) {
                AbstractC2540a.b("visitLocalAncestors called on an unattached node");
            }
            for (b0.o oVar = I03.f7162k.f7166o; oVar != null; oVar = oVar.f7166o) {
                if ((oVar.f7164m & 2) != 0 && oVar == I02) {
                    return e0Var;
                }
            }
            return this;
        }
        while (c2731g.f21638y > c2731g2.f21638y) {
            c2731g = c2731g.u();
            kotlin.jvm.internal.l.c(c2731g);
        }
        C2731G c2731g3 = c2731g2;
        while (c2731g3.f21638y > c2731g.f21638y) {
            c2731g3 = c2731g3.u();
            kotlin.jvm.internal.l.c(c2731g3);
        }
        while (c2731g != c2731g3) {
            c2731g = c2731g.u();
            c2731g3 = c2731g3.u();
            if (c2731g == null || c2731g3 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (c2731g3 != c2731g2) {
            if (c2731g != e0Var.f21812y) {
                return c2731g.f21612O.f21768c;
            }
            return e0Var;
        }
        return this;
    }

    @Override // x0.InterfaceC2637x
    public final boolean F() {
        return I0().f7175x;
    }

    public final long F0(long j5) {
        long j6 = this.J;
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) - ((int) (j6 >> 32));
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 & 4294967295L)) - ((int) (j6 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        m0 m0Var = this.f21811S;
        return m0Var != null ? ((W0) m0Var).c(floatToRawIntBits, true) : floatToRawIntBits;
    }

    @Override // x0.InterfaceC2637x
    public final void G(float[] fArr) {
        n0 a5 = AbstractC2734J.a(this.f21812y);
        g1(c1(x0.f0.h(this)), fArr);
        ((A0.F) ((InterfaceC2409f) a5)).v(fArr);
    }

    public abstract AbstractC2740P G0();

    public final long H0() {
        return this.f21799E.S(this.f21812y.J.g());
    }

    @Override // x0.InterfaceC2637x
    public final long I() {
        return this.f20975m;
    }

    public abstract b0.o I0();

    @Override // x0.InterfaceC2637x
    public final long J(long j5) {
        if (!I0().f7175x) {
            AbstractC2540a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        S0();
        for (e0 e0Var = this; e0Var != null; e0Var = e0Var.f21795A) {
            j5 = e0Var.d1(j5);
        }
        return j5;
    }

    public final b0.o J0(int i) {
        boolean g5 = f0.g(i);
        b0.o I02 = I0();
        if (!g5 && (I02 = I02.f7166o) == null) {
            return null;
        }
        for (b0.o K02 = K0(g5); K02 != null && (K02.f7165n & i) != 0; K02 = K02.f7167p) {
            if ((K02.f7164m & i) != 0) {
                return K02;
            }
            if (K02 == I02) {
                return null;
            }
        }
        return null;
    }

    public final b0.o K0(boolean z3) {
        b0.o I02;
        c0 c0Var = this.f21812y.f21612O;
        if (c0Var.f21769d == this) {
            return c0Var.f;
        }
        if (!z3) {
            e0 e0Var = this.f21795A;
            if (e0Var != null) {
                return e0Var.I0();
            }
            return null;
        }
        e0 e0Var2 = this.f21795A;
        if (e0Var2 == null || (I02 = e0Var2.I0()) == null) {
            return null;
        }
        return I02.f7167p;
    }

    public final void L0(b0.o oVar, C2747d c2747d, long j5, C2760q c2760q, int i, boolean z3) {
        if (oVar == null) {
            O0(c2747d, j5, c2760q, i, z3);
            return;
        }
        int i5 = c2760q.f21852m;
        C2316B c2316b = c2760q.f21850k;
        c2760q.d(i5 + 1, c2316b.f18905b);
        c2760q.f21852m++;
        c2316b.a(oVar);
        c2760q.f21851l.a(AbstractC2749f.a(-1.0f, z3, false));
        L0(AbstractC2749f.e(oVar, c2747d.b()), c2747d, j5, c2760q, i, z3);
        c2760q.f21852m = i5;
    }

    public final void M0(b0.o oVar, C2747d c2747d, long j5, C2760q c2760q, int i, boolean z3, float f) {
        if (oVar == null) {
            O0(c2747d, j5, c2760q, i, z3);
            return;
        }
        int i5 = c2760q.f21852m;
        C2316B c2316b = c2760q.f21850k;
        c2760q.d(i5 + 1, c2316b.f18905b);
        c2760q.f21852m++;
        c2316b.a(oVar);
        c2760q.f21851l.a(AbstractC2749f.a(f, z3, false));
        W0(AbstractC2749f.e(oVar, c2747d.b()), c2747d, j5, c2760q, i, z3, f, true);
        c2760q.f21852m = i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
    
        if (z0.AbstractC2749f.h(r18.c(), z0.AbstractC2749f.a(r2, r7, false)) > 0) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N0(C2747d c2747d, long j5, C2760q c2760q, int i, boolean z3) {
        boolean z5;
        boolean z6;
        b0.o J02 = J0(c2747d.b());
        if (!j1(j5)) {
            if (i == 1) {
                float A02 = A0(j5, H0());
                if ((Float.floatToRawIntBits(A02) & Integer.MAX_VALUE) < 2139095040) {
                    if (c2760q.f21852m != X3.n.N(c2760q)) {
                        if (AbstractC2749f.h(c2760q.c(), AbstractC2749f.a(A02, false, false)) <= 0) {
                            return;
                        }
                    }
                    M0(J02, c2747d, j5, c2760q, i, false, A02);
                    return;
                }
                return;
            }
            return;
        }
        if (J02 == null) {
            O0(c2747d, j5, c2760q, i, z3);
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        if (intBitsToFloat >= 0.0f && intBitsToFloat2 >= 0.0f && intBitsToFloat < X() && intBitsToFloat2 < W()) {
            L0(J02, c2747d, j5, c2760q, i, z3);
            return;
        }
        float A03 = i == 1 ? A0(j5, H0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(A03) & Integer.MAX_VALUE) < 2139095040) {
            if (c2760q.f21852m == X3.n.N(c2760q)) {
                z5 = z3;
            } else {
                z5 = z3;
            }
            z6 = true;
            W0(J02, c2747d, j5, c2760q, i, z5, A03, z6);
        }
        z5 = z3;
        z6 = false;
        W0(J02, c2747d, j5, c2760q, i, z5, A03, z6);
    }

    public void O0(C2747d c2747d, long j5, C2760q c2760q, int i, boolean z3) {
        e0 e0Var = this.f21813z;
        if (e0Var != null) {
            e0Var.N0(c2747d, e0Var.F0(j5), c2760q, i, z3);
        }
    }

    public final void P0() {
        m0 m0Var = this.f21811S;
        if (m0Var != null) {
            m0Var.invalidate();
            return;
        }
        e0 e0Var = this.f21795A;
        if (e0Var != null) {
            e0Var.P0();
        }
    }

    public final boolean Q0() {
        if (this.f21811S != null && this.f21801G <= 0.0f) {
            return true;
        }
        e0 e0Var = this.f21795A;
        if (e0Var != null) {
            return e0Var.Q0();
        }
        return false;
    }

    @Override // x0.InterfaceC2637x
    public final void R(InterfaceC2637x interfaceC2637x, float[] fArr) {
        e0 c12 = c1(interfaceC2637x);
        c12.S0();
        e0 E0 = E0(c12);
        i0.z.d(fArr);
        c12.g1(E0, fArr);
        f1(E0, fArr);
    }

    public final long R0(InterfaceC2637x interfaceC2637x, long j5) {
        if (interfaceC2637x instanceof x0.M) {
            x0.M m5 = (x0.M) interfaceC2637x;
            m5.f20959k.f21691y.S0();
            return m5.c(this, j5 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        e0 c12 = c1(interfaceC2637x);
        c12.S0();
        e0 E0 = E0(c12);
        while (c12 != E0) {
            j5 = c12.d1(j5);
            c12 = c12.f21795A;
            kotlin.jvm.internal.l.c(c12);
        }
        return y0(E0, j5);
    }

    public final void S0() {
        this.f21812y.f21613P.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r7v7, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [R.e] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [R.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void T0() {
        b0.o oVar;
        b0.o K02 = K0(f0.g(128));
        if (K02 == null || (K02.f7162k.f7165n & 128) == 0) {
            return;
        }
        Z.f d5 = Z.q.d();
        i4.c e3 = d5 != null ? d5.e() : null;
        Z.f g5 = Z.q.g(d5);
        try {
            boolean g6 = f0.g(128);
            if (g6) {
                oVar = I0();
            } else {
                oVar = I0().f7166o;
                if (oVar == null) {
                }
            }
            for (b0.o K03 = K0(g6); K03 != null; K03 = K03.f7167p) {
                if ((K03.f7165n & 128) == 0) {
                    break;
                }
                if ((K03.f7164m & 128) != 0) {
                    ?? r8 = 0;
                    AbstractC2756m abstractC2756m = K03;
                    while (abstractC2756m != 0) {
                        if (abstractC2756m instanceof InterfaceC2764v) {
                            ((InterfaceC2764v) abstractC2756m).s(this.f20975m);
                        } else if ((abstractC2756m.f7164m & 128) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                            b0.o oVar2 = abstractC2756m.f21839z;
                            int i = 0;
                            abstractC2756m = abstractC2756m;
                            r8 = r8;
                            while (oVar2 != null) {
                                if ((oVar2.f7164m & 128) != 0) {
                                    i++;
                                    r8 = r8;
                                    if (i == 1) {
                                        abstractC2756m = oVar2;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new R.e(new b0.o[16]);
                                        }
                                        if (abstractC2756m != 0) {
                                            r8.c(abstractC2756m);
                                            abstractC2756m = 0;
                                        }
                                        r8.c(oVar2);
                                    }
                                }
                                oVar2 = oVar2.f7167p;
                                abstractC2756m = abstractC2756m;
                                r8 = r8;
                            }
                            if (i == 1) {
                            }
                        }
                        abstractC2756m = AbstractC2749f.f(r8);
                    }
                }
                if (K03 == oVar) {
                    break;
                }
            }
        } finally {
            Z.q.k(d5, g5, e3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [R.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [R.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void U0() {
        boolean g5 = f0.g(128);
        b0.o I02 = I0();
        if (!g5 && (I02 = I02.f7166o) == null) {
            return;
        }
        for (b0.o K02 = K0(g5); K02 != null && (K02.f7165n & 128) != 0; K02 = K02.f7167p) {
            if ((K02.f7164m & 128) != 0) {
                AbstractC2756m abstractC2756m = K02;
                ?? r5 = 0;
                while (abstractC2756m != 0) {
                    if (abstractC2756m instanceof InterfaceC2764v) {
                        ((InterfaceC2764v) abstractC2756m).u(this);
                    } else if ((abstractC2756m.f7164m & 128) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                        b0.o oVar = abstractC2756m.f21839z;
                        int i = 0;
                        abstractC2756m = abstractC2756m;
                        r5 = r5;
                        while (oVar != null) {
                            if ((oVar.f7164m & 128) != 0) {
                                i++;
                                r5 = r5;
                                if (i == 1) {
                                    abstractC2756m = oVar;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new R.e(new b0.o[16]);
                                    }
                                    if (abstractC2756m != 0) {
                                        r5.c(abstractC2756m);
                                        abstractC2756m = 0;
                                    }
                                    r5.c(oVar);
                                }
                            }
                            oVar = oVar.f7167p;
                            abstractC2756m = abstractC2756m;
                            r5 = r5;
                        }
                        if (i == 1) {
                        }
                    }
                    abstractC2756m = AbstractC2749f.f(r5);
                }
            }
            if (K02 == I02) {
                return;
            }
        }
    }

    public final void V0() {
        this.f21796B = true;
        this.f21809Q.invoke();
        a1();
        if (W0.j.a(this.J, 0L)) {
            return;
        }
        this.f21812y.O();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [R.e] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [R.e] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    public final void W0(b0.o oVar, C2747d c2747d, long j5, C2760q c2760q, int i, boolean z3, float f, boolean z5) {
        b0.o f5;
        if (oVar == null) {
            O0(c2747d, j5, c2760q, i, z3);
            return;
        }
        int i5 = i;
        boolean z6 = z3;
        if (i5 == 3 || i5 == 4) {
            AbstractC2756m abstractC2756m = oVar;
            R.e eVar = null;
            while (true) {
                if (abstractC2756m == 0) {
                    break;
                }
                if (abstractC2756m instanceof s0) {
                    long r5 = ((s0) abstractC2756m).r();
                    int i6 = (int) (j5 >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i6);
                    C2731G c2731g = this.f21812y;
                    W0.m mVar = c2731g.f21608I;
                    int i7 = y0.f21874b;
                    long j6 = r5 & Long.MIN_VALUE;
                    W0.m mVar2 = W0.m.f6016k;
                    if (intBitsToFloat >= (-((j6 == 0 || mVar == mVar2) ? C2747d.a(0, r5) : C2747d.a(2, r5)))) {
                        if (Float.intBitsToFloat(i6) < X() + ((j6 == 0 || c2731g.f21608I == mVar2) ? C2747d.a(2, r5) : C2747d.a(0, r5))) {
                            int i8 = (int) (j5 & 4294967295L);
                            if (Float.intBitsToFloat(i8) >= (-C2747d.a(1, r5))) {
                                if (Float.intBitsToFloat(i8) < C2747d.a(3, r5) + W()) {
                                    int i9 = c2760q.f21852m;
                                    int N5 = X3.n.N(c2760q);
                                    r.x xVar = c2760q.f21851l;
                                    C2316B c2316b = c2760q.f21850k;
                                    if (i9 == N5) {
                                        int i10 = c2760q.f21852m;
                                        c2760q.d(i10 + 1, c2316b.f18905b);
                                        c2760q.f21852m++;
                                        c2316b.a(oVar);
                                        xVar.a(AbstractC2749f.a(0.0f, z6, true));
                                        W0(AbstractC2749f.e(oVar, c2747d.b()), c2747d, j5, c2760q, i5, z6, f, z5);
                                        c2760q.f21852m = i10;
                                        return;
                                    }
                                    long c5 = c2760q.c();
                                    int i11 = c2760q.f21852m;
                                    if (!AbstractC2749f.p(c5)) {
                                        if (AbstractC2749f.l(c5) > 0.0f) {
                                            int i12 = c2760q.f21852m;
                                            c2760q.d(i12 + 1, c2316b.f18905b);
                                            c2760q.f21852m++;
                                            c2316b.a(oVar);
                                            xVar.a(AbstractC2749f.a(0.0f, z6, true));
                                            W0(AbstractC2749f.e(oVar, c2747d.b()), c2747d, j5, c2760q, i, z6, f, z5);
                                            c2760q.f21852m = i12;
                                            return;
                                        }
                                        return;
                                    }
                                    int N6 = X3.n.N(c2760q);
                                    c2760q.f21852m = N6;
                                    c2760q.d(N6 + 1, c2316b.f18905b);
                                    c2760q.f21852m++;
                                    c2316b.a(oVar);
                                    xVar.a(AbstractC2749f.a(0.0f, z6, true));
                                    W0(AbstractC2749f.e(oVar, c2747d.b()), c2747d, j5, c2760q, i, z6, f, z5);
                                    c2760q.f21852m = N6;
                                    if (AbstractC2749f.l(c2760q.c()) < 0.0f) {
                                        c2760q.d(i11 + 1, c2760q.f21852m + 1);
                                    }
                                    c2760q.f21852m = i11;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    int i13 = 16;
                    if ((abstractC2756m.f7164m & 16) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                        b0.o oVar2 = abstractC2756m.f21839z;
                        int i14 = 0;
                        f5 = abstractC2756m;
                        eVar = eVar;
                        while (oVar2 != null) {
                            if ((oVar2.f7164m & 16) != 0) {
                                i14++;
                                eVar = eVar;
                                if (i14 == 1) {
                                    f5 = oVar2;
                                } else {
                                    if (eVar == null) {
                                        eVar = new R.e(new b0.o[i13]);
                                    }
                                    if (f5 != null) {
                                        eVar.c(f5);
                                        f5 = null;
                                    }
                                    eVar.c(oVar2);
                                }
                            }
                            oVar2 = oVar2.f7167p;
                            i13 = 16;
                            f5 = f5;
                            eVar = eVar;
                        }
                        if (i14 == 1) {
                            i5 = i;
                            z6 = z3;
                            abstractC2756m = f5;
                            eVar = eVar;
                        }
                    }
                    f5 = AbstractC2749f.f(eVar);
                    i5 = i;
                    z6 = z3;
                    abstractC2756m = f5;
                    eVar = eVar;
                }
            }
        }
        if (z5) {
            M0(oVar, c2747d, j5, c2760q, i, z3, f);
            return;
        }
        switch (c2747d.f21774k) {
            case 1:
                AbstractC2756m abstractC2756m2 = oVar;
                ?? r32 = 0;
                while (abstractC2756m2 != 0) {
                    if (abstractC2756m2 instanceof s0) {
                        ((s0) abstractC2756m2).g0();
                    } else if ((abstractC2756m2.f7164m & 16) != 0 && (abstractC2756m2 instanceof AbstractC2756m)) {
                        b0.o oVar3 = abstractC2756m2.f21839z;
                        int i15 = 0;
                        abstractC2756m2 = abstractC2756m2;
                        r32 = r32;
                        while (oVar3 != null) {
                            if ((oVar3.f7164m & 16) != 0) {
                                i15++;
                                r32 = r32;
                                if (i15 == 1) {
                                    abstractC2756m2 = oVar3;
                                } else {
                                    if (r32 == 0) {
                                        r32 = new R.e(new b0.o[16]);
                                    }
                                    if (abstractC2756m2 != 0) {
                                        r32.c(abstractC2756m2);
                                        abstractC2756m2 = 0;
                                    }
                                    r32.c(oVar3);
                                }
                            }
                            oVar3 = oVar3.f7167p;
                            abstractC2756m2 = abstractC2756m2;
                            r32 = r32;
                        }
                        if (i15 != 1) {
                            abstractC2756m2 = AbstractC2749f.f(r32);
                        }
                    }
                    abstractC2756m2 = AbstractC2749f.f(r32);
                }
                break;
        }
        W0(AbstractC2749f.e(oVar, c2747d.b()), c2747d, j5, c2760q, i, z3, f, false);
    }

    public abstract void X0(InterfaceC2009n interfaceC2009n, C2041b c2041b);

    public final void Y0(long j5, float f, i4.c cVar) {
        h1(cVar, false);
        boolean a5 = W0.j.a(this.J, j5);
        C2731G c2731g = this.f21812y;
        if (!a5) {
            ((A0.F) AbstractC2734J.a(c2731g)).O(-4.0f);
            this.J = j5;
            c2731g.f21613P.f21663p.k0();
            m0 m0Var = this.f21811S;
            if (m0Var != null) {
                ((W0) m0Var).d(j5);
            } else {
                e0 e0Var = this.f21795A;
                if (e0Var != null) {
                    e0Var.P0();
                }
            }
            c2731g.O();
            AbstractC2739O.u0(this);
            A0.F f5 = c2731g.f21636w;
            if (f5 != null) {
                f5.B(c2731g);
            }
        }
        this.K = f;
        if (!this.f21683u) {
            k0(q0());
        }
        if (this == c2731g.f21612O.f21769d) {
            ((A0.F) AbstractC2734J.a(c2731g)).getRectManager().g(c2731g, !c2731g.f21613P.f21663p.f21755u);
        }
    }

    public final void Z0(C1987a c1987a, boolean z3, boolean z5) {
        m0 m0Var = this.f21811S;
        if (m0Var != null) {
            if (this.f21797C) {
                if (z5) {
                    long H02 = H0();
                    float intBitsToFloat = Float.intBitsToFloat((int) (H02 >> 32)) / 2.0f;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (H02 & 4294967295L)) / 2.0f;
                    long j5 = this.f20975m;
                    c1987a.a(-intBitsToFloat, -intBitsToFloat2, ((int) (j5 >> 32)) + intBitsToFloat, ((int) (j5 & 4294967295L)) + intBitsToFloat2);
                } else if (z3) {
                    long j6 = this.f20975m;
                    c1987a.a(0.0f, 0.0f, (int) (j6 >> 32), (int) (j6 & 4294967295L));
                }
                if (c1987a.b()) {
                    return;
                }
            }
            W0 w02 = (W0) m0Var;
            float[] b3 = w02.b();
            if (!w02.f404C) {
                if (b3 == null) {
                    c1987a.f17187a = 0.0f;
                    c1987a.f17188b = 0.0f;
                    c1987a.f17189c = 0.0f;
                    c1987a.f17190d = 0.0f;
                } else {
                    i0.z.c(b3, c1987a);
                }
            }
        }
        long j7 = this.J;
        float f = (int) (j7 >> 32);
        c1987a.f17187a += f;
        c1987a.f17189c += f;
        float f5 = (int) (j7 & 4294967295L);
        c1987a.f17188b += f5;
        c1987a.f17190d += f5;
    }

    public final void a1() {
        if (this.f21811S != null) {
            h1(null, false);
            this.f21812y.V(false);
        }
    }

    @Override // x0.InterfaceC2637x
    public final long b(long j5) {
        if (!I0().f7175x) {
            AbstractC2540a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((A0.F) AbstractC2734J.a(this.f21812y)).w(J(j5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [R.e] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [R.e] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void b1(x0.P p5) {
        e0 e0Var;
        boolean z3;
        boolean z5;
        boolean z6 = true;
        x0.P p6 = this.f21802H;
        if (p5 != p6) {
            this.f21802H = p5;
            C2731G c2731g = this.f21812y;
            int i = 0;
            if (p6 == null || p5.getWidth() != p6.getWidth() || p5.c() != p6.c()) {
                int width = p5.getWidth();
                int c5 = p5.c();
                m0 m0Var = this.f21811S;
                if (m0Var != null) {
                    ((W0) m0Var).e((width << 32) | (c5 & 4294967295L));
                } else if (c2731g.J() && (e0Var = this.f21795A) != null) {
                    e0Var.P0();
                }
                c0((c5 & 4294967295L) | (width << 32));
                if (this.f21798D != null) {
                    i1(false);
                }
                boolean g5 = f0.g(4);
                b0.o I02 = I0();
                if (g5 || (I02 = I02.f7166o) != null) {
                    for (b0.o K02 = K0(g5); K02 != null && (K02.f7165n & 4) != 0; K02 = K02.f7167p) {
                        if ((K02.f7164m & 4) != 0) {
                            AbstractC2756m abstractC2756m = K02;
                            ?? r10 = 0;
                            while (abstractC2756m != 0) {
                                if (abstractC2756m instanceof InterfaceC2757n) {
                                    ((InterfaceC2757n) abstractC2756m).f0();
                                } else if ((abstractC2756m.f7164m & 4) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                                    b0.o oVar = abstractC2756m.f21839z;
                                    int i5 = 0;
                                    abstractC2756m = abstractC2756m;
                                    r10 = r10;
                                    while (oVar != null) {
                                        if ((oVar.f7164m & 4) != 0) {
                                            i5++;
                                            r10 = r10;
                                            if (i5 == 1) {
                                                abstractC2756m = oVar;
                                            } else {
                                                if (r10 == 0) {
                                                    r10 = new R.e(new b0.o[16]);
                                                }
                                                if (abstractC2756m != 0) {
                                                    r10.c(abstractC2756m);
                                                    abstractC2756m = 0;
                                                }
                                                r10.c(oVar);
                                            }
                                        }
                                        oVar = oVar.f7167p;
                                        abstractC2756m = abstractC2756m;
                                        r10 = r10;
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                abstractC2756m = AbstractC2749f.f(r10);
                            }
                        }
                        if (K02 == I02) {
                            break;
                        }
                    }
                }
                A0.F f = c2731g.f21636w;
                if (f != null) {
                    f.B(c2731g);
                }
            }
            C2315A c2315a = this.f21803I;
            if ((c2315a == null || c2315a.f18903e == 0) && p5.a().isEmpty()) {
                return;
            }
            C2315A c2315a2 = this.f21803I;
            Map a5 = p5.a();
            if (c2315a2 != null && c2315a2.f18903e == a5.size()) {
                Object[] objArr = c2315a2.f18900b;
                int[] iArr = c2315a2.f18901c;
                long[] jArr = c2315a2.f18899a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i6 = 0;
                loop0: while (true) {
                    long j5 = jArr[i6];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = i;
                        while (i8 < i7) {
                            if ((j5 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                Object obj = objArr[i9];
                                z5 = z6;
                                int i10 = iArr[i9];
                                Integer num = (Integer) a5.get((C2628n) obj);
                                if (num == null || num.intValue() != i10) {
                                    break loop0;
                                }
                            } else {
                                z5 = z6;
                            }
                            j5 >>= 8;
                            i8++;
                            z6 = z5;
                        }
                        z3 = z6;
                        if (i7 != 8) {
                            return;
                        }
                    } else {
                        z3 = z6;
                    }
                    if (i6 == length) {
                        return;
                    }
                    i6++;
                    z6 = z3;
                    i = 0;
                }
            }
            c2731g.f21613P.f21663p.f21738G.f();
            C2315A c2315a3 = this.f21803I;
            if (c2315a3 == null) {
                C2315A c2315a4 = r.K.f18952a;
                c2315a3 = new C2315A();
                this.f21803I = c2315a3;
            }
            c2315a3.a();
            for (Map.Entry entry : p5.a().entrySet()) {
                c2315a3.h(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    @Override // W0.c
    public final float c() {
        return this.f21812y.f21607H.c();
    }

    public final long d1(long j5) {
        m0 m0Var = this.f21811S;
        if (m0Var != null) {
            j5 = ((W0) m0Var).c(j5, false);
        }
        long j6 = this.J;
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) + ((int) (j6 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) + ((int) (j6 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final C1989c e1() {
        boolean z3 = I0().f7175x;
        C1989c c1989c = C1989c.f17192e;
        if (z3) {
            InterfaceC2637x h3 = x0.f0.h(this);
            C1987a c1987a = this.f21804L;
            if (c1987a == null) {
                c1987a = new C1987a();
                this.f21804L = c1987a;
            }
            long z02 = z0(H0());
            int i = (int) (z02 >> 32);
            c1987a.f17187a = -Float.intBitsToFloat(i);
            int i5 = (int) (z02 & 4294967295L);
            c1987a.f17188b = -Float.intBitsToFloat(i5);
            c1987a.f17189c = Float.intBitsToFloat(i) + X();
            c1987a.f17190d = Float.intBitsToFloat(i5) + W();
            e0 e0Var = this;
            while (e0Var != h3) {
                e0Var.Z0(c1987a, false, true);
                if (!c1987a.b()) {
                    e0Var = e0Var.f21795A;
                    kotlin.jvm.internal.l.c(e0Var);
                }
            }
            return new C1989c(c1987a.f17187a, c1987a.f17188b, c1987a.f17189c, c1987a.f17190d);
        }
        return c1989c;
    }

    public final void f1(e0 e0Var, float[] fArr) {
        float[] a5;
        if (kotlin.jvm.internal.l.a(e0Var, this)) {
            return;
        }
        e0 e0Var2 = this.f21795A;
        kotlin.jvm.internal.l.c(e0Var2);
        e0Var2.f1(e0Var, fArr);
        if (!W0.j.a(this.J, 0L)) {
            float[] fArr2 = f21792V;
            i0.z.d(fArr2);
            long j5 = this.J;
            i0.z.f(fArr2, -((int) (j5 >> 32)), -((int) (j5 & 4294967295L)));
            i0.z.e(fArr, fArr2);
        }
        m0 m0Var = this.f21811S;
        if (m0Var == null || (a5 = ((W0) m0Var).a()) == null) {
            return;
        }
        i0.z.e(fArr, a5);
    }

    @Override // x0.InterfaceC2637x
    public final long g(long j5) {
        if (!I0().f7175x) {
            AbstractC2540a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        InterfaceC2637x h3 = x0.f0.h(this);
        A0.F f = (A0.F) AbstractC2734J.a(this.f21812y);
        f.F();
        return R0(h3, C1988b.g(i0.z.b(j5, f.f233g0), h3.J(0L)));
    }

    public final void g1(e0 e0Var, float[] fArr) {
        e0 e0Var2 = this;
        while (!e0Var2.equals(e0Var)) {
            m0 m0Var = e0Var2.f21811S;
            if (m0Var != null) {
                i0.z.e(fArr, ((W0) m0Var).b());
            }
            if (!W0.j.a(e0Var2.J, 0L)) {
                float[] fArr2 = f21792V;
                i0.z.d(fArr2);
                i0.z.f(fArr2, (int) (r1 >> 32), (int) (r1 & 4294967295L));
                i0.z.e(fArr, fArr2);
            }
            e0Var2 = e0Var2.f21795A;
            kotlin.jvm.internal.l.c(e0Var2);
        }
    }

    @Override // x0.InterfaceC2632s
    public final W0.m getLayoutDirection() {
        return this.f21812y.f21608I;
    }

    @Override // x0.InterfaceC2637x
    public final long h(long j5) {
        long J = J(j5);
        A0.F f = (A0.F) AbstractC2734J.a(this.f21812y);
        f.F();
        return i0.z.b(J, f.f232f0);
    }

    public final void h1(i4.c cVar, boolean z3) {
        A0.F f;
        G.v vVar;
        Reference poll;
        R.e eVar;
        C0022e0 c0022e0;
        Reference poll2;
        R.e eVar2;
        Object obj;
        C2731G c2731g = this.f21812y;
        boolean z5 = (!z3 && this.f21798D == cVar && kotlin.jvm.internal.l.a(this.f21799E, c2731g.f21607H) && this.f21800F == c2731g.f21608I) ? false : true;
        this.f21799E = c2731g.f21607H;
        this.f21800F = c2731g.f21608I;
        boolean I5 = c2731g.I();
        d0 d0Var = this.f21809Q;
        if (!I5 || cVar == null) {
            this.f21798D = null;
            m0 m0Var = this.f21811S;
            if (m0Var != null) {
                W0 w02 = (W0) m0Var;
                if (!i0.F.l(w02.b())) {
                    c2731g.O();
                }
                w02.f410n = null;
                w02.f411o = null;
                w02.f413q = true;
                boolean z6 = w02.f416t;
                A0.F f5 = w02.f409m;
                if (z6) {
                    w02.f416t = false;
                    f5.z(w02, false);
                }
                i0.u uVar = w02.f408l;
                if (uVar != null) {
                    uVar.a(w02.f407k);
                    do {
                        vVar = f5.E0;
                        poll = ((ReferenceQueue) vVar.f1750m).poll();
                        eVar = (R.e) vVar.f1749l;
                        if (poll != null) {
                            eVar.k(poll);
                        }
                    } while (poll != null);
                    eVar.c(new WeakReference(w02, (ReferenceQueue) vVar.f1750m));
                    f5.f203H.remove(w02);
                }
                c2731g.f21616S = true;
                d0Var.invoke();
                if (I0().f7175x && c2731g.J() && (f = c2731g.f21636w) != null) {
                    f.B(c2731g);
                }
            }
            this.f21811S = null;
            this.f21810R = false;
            return;
        }
        this.f21798D = cVar;
        if (this.f21811S != null) {
            if (z5 && i1(true)) {
                c2731g.O();
                ((A0.F) AbstractC2734J.a(c2731g)).getRectManager().f(c2731g);
                return;
            }
            return;
        }
        n0 a5 = AbstractC2734J.a(c2731g);
        C0022e0 c0022e02 = this.f21808P;
        if (c0022e02 == null) {
            C0022e0 c0022e03 = new C0022e0(22, this, new d0(this, 0));
            this.f21808P = c0022e03;
            c0022e0 = c0022e03;
        } else {
            c0022e0 = c0022e02;
        }
        A0.F f6 = (A0.F) a5;
        do {
            G.v vVar2 = f6.E0;
            poll2 = ((ReferenceQueue) vVar2.f1750m).poll();
            eVar2 = (R.e) vVar2.f1749l;
            if (poll2 != null) {
                eVar2.k(poll2);
            }
        } while (poll2 != null);
        while (true) {
            int i = eVar2.f5108m;
            if (i == 0) {
                obj = null;
                break;
            } else {
                obj = ((Reference) eVar2.l(i - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        m0 m0Var2 = (m0) obj;
        if (m0Var2 != null) {
            W0 w03 = (W0) m0Var2;
            i0.u uVar2 = w03.f408l;
            if (uVar2 == null) {
                throw AbstractC0467k.u("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!w03.f407k.f17681s) {
                AbstractC2540a.a("layer should have been released before reuse");
            }
            w03.f407k = uVar2.b();
            w03.f413q = false;
            w03.f410n = c0022e0;
            w03.f411o = d0Var;
            w03.f402A = false;
            w03.f403B = false;
            w03.f404C = true;
            i0.z.d(w03.f414r);
            float[] fArr = w03.f415s;
            if (fArr != null) {
                i0.z.d(fArr);
            }
            w03.f421y = i0.N.f17263b;
            w03.f405D = false;
            long j5 = Integer.MAX_VALUE;
            w03.f412p = (j5 & 4294967295L) | (j5 << 32);
            w03.f422z = null;
            w03.f420x = 0;
        } else {
            m0Var2 = new W0(f6.getGraphicsContext().b(), f6.getGraphicsContext(), f6, c0022e0, d0Var);
        }
        W0 w04 = (W0) m0Var2;
        w04.e(this.f20975m);
        w04.d(this.J);
        this.f21811S = m0Var2;
        i1(true);
        c2731g.f21616S = true;
        d0Var.invoke();
    }

    public final boolean i1(boolean z3) {
        boolean z5;
        boolean z6;
        A0.F f;
        d0 d0Var;
        d0 d0Var2;
        m0 m0Var = this.f21811S;
        if (m0Var == null) {
            if (this.f21798D == null) {
                return false;
            }
            AbstractC2540a.b("null layer with a non-null layerBlock");
            return false;
        }
        i4.c cVar = this.f21798D;
        if (cVar == null) {
            throw AbstractC0467k.u("updateLayerParameters requires a non-null layerBlock");
        }
        i0.G g5 = f21790T;
        g5.f(1.0f);
        g5.g(1.0f);
        g5.a(1.0f);
        g5.h(0.0f);
        long j5 = i0.v.f17299a;
        g5.b(j5);
        g5.k(j5);
        if (g5.f17234r != 0.0f) {
            g5.f17227k |= 1024;
            g5.f17234r = 0.0f;
        }
        if (g5.f17235s != 8.0f) {
            g5.f17227k |= 2048;
            g5.f17235s = 8.0f;
        }
        long j6 = i0.N.f17263b;
        g5.l(j6);
        g5.j(i0.F.f17222a);
        g5.e(false);
        if (g5.f17242z != 3) {
            g5.f17227k |= 524288;
            g5.f17242z = 3;
        }
        g5.f17239w = 9205357640488583168L;
        g5.f17226A = null;
        g5.f17227k = 0;
        C2731G c2731g = this.f21812y;
        g5.f17240x = c2731g.f21607H;
        g5.f17241y = c2731g.f21608I;
        g5.f17239w = AbstractC0444a.d0(this.f20975m);
        ((A0.F) AbstractC2734J.a(c2731g)).getSnapshotObserver().a(this, C2748e.f21780p, new x0.J(6, cVar));
        C2763u c2763u = this.f21805M;
        if (c2763u == null) {
            c2763u = new C2763u();
            this.f21805M = c2763u;
        }
        C2763u c2763u2 = f21791U;
        c2763u2.getClass();
        c2763u2.f21863a = c2763u.f21863a;
        c2763u2.f21864b = c2763u.f21864b;
        c2763u2.f21865c = c2763u.f21865c;
        c2763u2.f21866d = c2763u.f21866d;
        c2763u2.f21867e = c2763u.f21867e;
        float f5 = g5.f17228l;
        c2763u.f21863a = f5;
        c2763u.f21864b = g5.f17229m;
        c2763u.f21865c = g5.f17234r;
        c2763u.f21866d = g5.f17235s;
        long j7 = g5.f17236t;
        c2763u.f21867e = j7;
        W0 w02 = (W0) m0Var;
        int i = w02.f420x | g5.f17227k;
        w02.f418v = g5.f17241y;
        w02.f417u = g5.f17240x;
        int i5 = i & 4096;
        if (i5 != 0) {
            w02.f421y = j7;
        }
        if ((i & 1) != 0) {
            InterfaceC2043d interfaceC2043d = w02.f407k.f17665a;
            if (interfaceC2043d.d() != f5) {
                interfaceC2043d.o(f5);
            }
        }
        if ((i & 2) != 0) {
            C2041b c2041b = w02.f407k;
            float f6 = g5.f17229m;
            InterfaceC2043d interfaceC2043d2 = c2041b.f17665a;
            if (interfaceC2043d2.H() != f6) {
                interfaceC2043d2.A(f6);
            }
        }
        if ((i & 4) != 0) {
            C2041b c2041b2 = w02.f407k;
            float f7 = g5.f17230n;
            InterfaceC2043d interfaceC2043d3 = c2041b2.f17665a;
            if (interfaceC2043d3.a() != f7) {
                interfaceC2043d3.c(f7);
            }
        }
        if ((i & 8) != 0) {
            InterfaceC2043d interfaceC2043d4 = w02.f407k.f17665a;
            if (interfaceC2043d4.s() != 0.0f) {
                interfaceC2043d4.t();
            }
        }
        if ((i & 16) != 0) {
            InterfaceC2043d interfaceC2043d5 = w02.f407k.f17665a;
            if (interfaceC2043d5.g() != 0.0f) {
                interfaceC2043d5.h();
            }
        }
        if ((i & 32) != 0) {
            C2041b c2041b3 = w02.f407k;
            float f8 = g5.f17231o;
            InterfaceC2043d interfaceC2043d6 = c2041b3.f17665a;
            if (interfaceC2043d6.F() != f8) {
                interfaceC2043d6.e(f8);
                c2041b3.f17670g = true;
                c2041b3.a();
            }
            if (g5.f17231o > 0.0f && !w02.f405D && (d0Var2 = w02.f411o) != null) {
                d0Var2.invoke();
            }
        }
        if ((i & 64) != 0) {
            C2041b c2041b4 = w02.f407k;
            long j8 = g5.f17232p;
            InterfaceC2043d interfaceC2043d7 = c2041b4.f17665a;
            if (!i0.p.c(j8, interfaceC2043d7.M())) {
                interfaceC2043d7.l(j8);
            }
        }
        if ((i & 128) != 0) {
            C2041b c2041b5 = w02.f407k;
            long j9 = g5.f17233q;
            InterfaceC2043d interfaceC2043d8 = c2041b5.f17665a;
            if (!i0.p.c(j9, interfaceC2043d8.k())) {
                interfaceC2043d8.z(j9);
            }
        }
        if ((i & 1024) != 0) {
            C2041b c2041b6 = w02.f407k;
            float f9 = g5.f17234r;
            InterfaceC2043d interfaceC2043d9 = c2041b6.f17665a;
            if (interfaceC2043d9.J() != f9) {
                interfaceC2043d9.i(f9);
            }
        }
        if ((i & 256) != 0) {
            InterfaceC2043d interfaceC2043d10 = w02.f407k.f17665a;
            if (interfaceC2043d10.w() != 0.0f) {
                interfaceC2043d10.b();
            }
        }
        if ((i & 512) != 0) {
            InterfaceC2043d interfaceC2043d11 = w02.f407k.f17665a;
            if (interfaceC2043d11.D() != 0.0f) {
                interfaceC2043d11.j();
            }
        }
        if ((i & 2048) != 0) {
            C2041b c2041b7 = w02.f407k;
            float f10 = g5.f17235s;
            InterfaceC2043d interfaceC2043d12 = c2041b7.f17665a;
            if (interfaceC2043d12.q() != f10) {
                interfaceC2043d12.E(f10);
            }
        }
        if (i5 != 0) {
            if (i0.N.a(w02.f421y, j6)) {
                C2041b c2041b8 = w02.f407k;
                if (!C1988b.b(c2041b8.f17684v, 9205357640488583168L)) {
                    c2041b8.f17684v = 9205357640488583168L;
                    c2041b8.f17665a.L(9205357640488583168L);
                }
            } else {
                C2041b c2041b9 = w02.f407k;
                long floatToRawIntBits = (Float.floatToRawIntBits(i0.N.c(w02.f421y) * ((int) (w02.f412p & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(i0.N.b(w02.f421y) * ((int) (w02.f412p >> 32))) << 32);
                if (!C1988b.b(c2041b9.f17684v, floatToRawIntBits)) {
                    c2041b9.f17684v = floatToRawIntBits;
                    c2041b9.f17665a.L(floatToRawIntBits);
                }
            }
        }
        if ((i & 16384) != 0) {
            C2041b c2041b10 = w02.f407k;
            boolean z7 = g5.f17238v;
            if (c2041b10.f17685w != z7) {
                c2041b10.f17685w = z7;
                c2041b10.f17670g = true;
                c2041b10.a();
            }
        }
        if ((131072 & i) != 0) {
            InterfaceC2043d interfaceC2043d13 = w02.f407k.f17665a;
        }
        if ((262144 & i) != 0) {
            InterfaceC2043d interfaceC2043d14 = w02.f407k.f17665a;
            if (!kotlin.jvm.internal.l.a(interfaceC2043d14.x(), null)) {
                interfaceC2043d14.n();
            }
        }
        if ((i & 524288) != 0) {
            C2041b c2041b11 = w02.f407k;
            int i6 = g5.f17242z;
            InterfaceC2043d interfaceC2043d15 = c2041b11.f17665a;
            if (interfaceC2043d15.K() != i6) {
                interfaceC2043d15.p(i6);
            }
        }
        if ((32768 & i) != 0) {
            InterfaceC2043d interfaceC2043d16 = w02.f407k.f17665a;
            if (interfaceC2043d16.v() != 0) {
                interfaceC2043d16.y(0);
            }
        }
        if ((i & 7963) != 0) {
            w02.f402A = true;
            w02.f403B = true;
        }
        if (kotlin.jvm.internal.l.a(w02.f422z, g5.f17226A)) {
            z5 = true;
            z6 = false;
        } else {
            i0.D d5 = g5.f17226A;
            w02.f422z = d5;
            if (d5 == null) {
                z5 = true;
            } else {
                C2041b c2041b12 = w02.f407k;
                if (d5 instanceof C1995B) {
                    C1989c c1989c = ((C1995B) d5).f17219a;
                    long floatToRawIntBits2 = Float.floatToRawIntBits(c1989c.f17193a);
                    float f11 = c1989c.f17194b;
                    c2041b12.f(0.0f, (floatToRawIntBits2 << 32) | (Float.floatToRawIntBits(f11) & 4294967295L), (Float.floatToRawIntBits(c1989c.f17195c - r14) << 32) | (Float.floatToRawIntBits(c1989c.f17196d - f11) & 4294967295L));
                } else if (d5 instanceof C1994A) {
                    c2041b12.f17673k = null;
                    c2041b12.i = 9205357640488583168L;
                    c2041b12.f17671h = 0L;
                    c2041b12.f17672j = 0.0f;
                    c2041b12.f17670g = true;
                    c2041b12.f17676n = false;
                    c2041b12.f17674l = ((C1994A) d5).f17218a;
                    c2041b12.a();
                } else {
                    if (!(d5 instanceof i0.C)) {
                        throw new D2.e();
                    }
                    i0.C c5 = (i0.C) d5;
                    C2003h c2003h = c5.f17221b;
                    if (c2003h != null) {
                        c2041b12.f17673k = null;
                        c2041b12.i = 9205357640488583168L;
                        c2041b12.f17671h = 0L;
                        c2041b12.f17672j = 0.0f;
                        z5 = true;
                        c2041b12.f17670g = true;
                        c2041b12.f17676n = false;
                        c2041b12.f17674l = c2003h;
                        c2041b12.a();
                    } else {
                        z5 = true;
                        c2041b12.f(Float.intBitsToFloat((int) (c5.f17220a.f17203h >> 32)), (Float.floatToRawIntBits(r7.f17197a) << 32) | (Float.floatToRawIntBits(r7.f17198b) & 4294967295L), (Float.floatToRawIntBits(r7.b()) << 32) | (Float.floatToRawIntBits(r7.a()) & 4294967295L));
                    }
                    if ((d5 instanceof C1994A) && Build.VERSION.SDK_INT < 33 && (d0Var = w02.f411o) != null) {
                        d0Var.invoke();
                    }
                }
                z5 = true;
                if (d5 instanceof C1994A) {
                    d0Var.invoke();
                }
            }
            z6 = z5;
        }
        w02.f420x = g5.f17227k;
        if (i != 0 || z6) {
            int i7 = Build.VERSION.SDK_INT;
            A0.F f12 = w02.f409m;
            if (i7 >= 26) {
                ViewParent parent = f12.getParent();
                if (parent != null) {
                    parent.onDescendantInvalidated(f12, f12);
                }
            } else {
                f12.invalidate();
            }
            if (f12.f247p) {
                f12.O(0.0f);
            }
        }
        boolean z8 = this.f21797C;
        this.f21797C = g5.f17238v;
        this.f21801G = g5.f17230n;
        boolean z9 = (c2763u2.f21863a == c2763u.f21863a && c2763u2.f21864b == c2763u.f21864b && c2763u2.f21865c == c2763u.f21865c && c2763u2.f21866d == c2763u.f21866d && i0.N.a(c2763u2.f21867e, c2763u.f21867e)) ? z5 : false;
        boolean z10 = !z9;
        if (z3 && ((!z9 || z8 != this.f21797C) && (f = c2731g.f21636w) != null)) {
            f.B(c2731g);
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r5 < r1.f17196d) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j1(long j5) {
        boolean z3;
        boolean z5;
        boolean z6;
        if ((((9187343241974906880L ^ (j5 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        m0 m0Var = this.f21811S;
        if (m0Var == null || !this.f21797C) {
            return true;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        C2041b c2041b = ((W0) m0Var).f407k;
        if (c2041b.f17685w) {
            i0.D d5 = c2041b.d();
            if (!(d5 instanceof C1995B)) {
                if (d5 instanceof i0.C) {
                    C1990d c1990d = ((i0.C) d5).f17220a;
                    float f = c1990d.f17197a;
                    if (intBitsToFloat >= f) {
                        float f5 = c1990d.f17199c;
                        if (intBitsToFloat < f5) {
                            float f6 = c1990d.f17198b;
                            if (intBitsToFloat2 >= f6) {
                                float f7 = c1990d.f17200d;
                                if (intBitsToFloat2 < f7) {
                                    long j6 = c1990d.f17201e;
                                    z3 = false;
                                    z5 = true;
                                    int i = (int) (j6 >> 32);
                                    float intBitsToFloat3 = Float.intBitsToFloat(i);
                                    long j7 = c1990d.f;
                                    int i5 = (int) (j7 >> 32);
                                    if (Float.intBitsToFloat(i5) + intBitsToFloat3 <= c1990d.b()) {
                                        long j8 = c1990d.f17203h;
                                        int i6 = (int) (j8 >> 32);
                                        float intBitsToFloat4 = Float.intBitsToFloat(i6);
                                        long j9 = c1990d.f17202g;
                                        int i7 = (int) (j9 >> 32);
                                        if (Float.intBitsToFloat(i7) + intBitsToFloat4 <= c1990d.b()) {
                                            int i8 = (int) (j6 & 4294967295L);
                                            int i9 = (int) (j8 & 4294967295L);
                                            if (Float.intBitsToFloat(i9) + Float.intBitsToFloat(i8) <= c1990d.a()) {
                                                int i10 = (int) (j7 & 4294967295L);
                                                int i11 = (int) (j9 & 4294967295L);
                                                if (Float.intBitsToFloat(i11) + Float.intBitsToFloat(i10) <= c1990d.a()) {
                                                    float intBitsToFloat5 = Float.intBitsToFloat(i) + f;
                                                    float intBitsToFloat6 = Float.intBitsToFloat(i8) + f6;
                                                    float intBitsToFloat7 = f5 - Float.intBitsToFloat(i5);
                                                    float intBitsToFloat8 = Float.intBitsToFloat(i10) + f6;
                                                    float intBitsToFloat9 = f5 - Float.intBitsToFloat(i7);
                                                    float intBitsToFloat10 = f7 - Float.intBitsToFloat(i11);
                                                    float intBitsToFloat11 = f7 - Float.intBitsToFloat(i9);
                                                    float intBitsToFloat12 = Float.intBitsToFloat(i6) + f;
                                                    if (intBitsToFloat < intBitsToFloat5 && intBitsToFloat2 < intBitsToFloat6) {
                                                        z6 = A0.Z.A(intBitsToFloat, intBitsToFloat2, intBitsToFloat5, intBitsToFloat6, c1990d.f17201e);
                                                    } else if (intBitsToFloat < intBitsToFloat12 && intBitsToFloat2 > intBitsToFloat11) {
                                                        z6 = A0.Z.A(intBitsToFloat, intBitsToFloat2, intBitsToFloat12, intBitsToFloat11, c1990d.f17203h);
                                                    } else if (intBitsToFloat <= intBitsToFloat7 || intBitsToFloat2 >= intBitsToFloat8) {
                                                        if (intBitsToFloat > intBitsToFloat9 && intBitsToFloat2 > intBitsToFloat10) {
                                                            z6 = A0.Z.A(intBitsToFloat, intBitsToFloat2, intBitsToFloat9, intBitsToFloat10, c1990d.f17202g);
                                                        }
                                                        z6 = z5;
                                                    } else {
                                                        z6 = A0.Z.A(intBitsToFloat, intBitsToFloat2, intBitsToFloat7, intBitsToFloat8, c1990d.f);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    C2003h a5 = AbstractC2005j.a();
                                    AbstractC0467k.g(a5, c1990d);
                                    z6 = A0.Z.z(intBitsToFloat, intBitsToFloat2, a5);
                                }
                            }
                        }
                    }
                } else {
                    z3 = false;
                    z5 = true;
                    if (!(d5 instanceof C1994A)) {
                        throw new D2.e();
                    }
                    z6 = A0.Z.z(intBitsToFloat, intBitsToFloat2, ((C1994A) d5).f17218a);
                }
                return z6 ? z5 : z3;
            }
            C1989c c1989c = ((C1995B) d5).f17219a;
            if (c1989c.f17193a <= intBitsToFloat) {
                if (intBitsToFloat < c1989c.f17195c) {
                    if (c1989c.f17194b <= intBitsToFloat2) {
                    }
                }
            }
            z3 = false;
            z5 = true;
            z6 = false;
            if (z6) {
            }
        }
        z3 = false;
        z5 = true;
        z6 = z5;
        if (z6) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [R.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [R.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // x0.Z, x0.N
    public final Object k() {
        C2731G c2731g = this.f21812y;
        if (!c2731g.f21612O.d(64)) {
            return null;
        }
        I0();
        Object obj = null;
        for (b0.o oVar = c2731g.f21612O.f21770e; oVar != null; oVar = oVar.f7166o) {
            if ((oVar.f7164m & 64) != 0) {
                AbstractC2756m abstractC2756m = oVar;
                ?? r5 = 0;
                while (abstractC2756m != 0) {
                    if (abstractC2756m instanceof q0) {
                        obj = ((q0) abstractC2756m).e0(obj);
                    } else if ((abstractC2756m.f7164m & 64) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                        b0.o oVar2 = abstractC2756m.f21839z;
                        int i = 0;
                        abstractC2756m = abstractC2756m;
                        r5 = r5;
                        while (oVar2 != null) {
                            if ((oVar2.f7164m & 64) != 0) {
                                i++;
                                r5 = r5;
                                if (i == 1) {
                                    abstractC2756m = oVar2;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new R.e(new b0.o[16]);
                                    }
                                    if (abstractC2756m != 0) {
                                        r5.c(abstractC2756m);
                                        abstractC2756m = 0;
                                    }
                                    r5.c(oVar2);
                                }
                            }
                            oVar2 = oVar2.f7167p;
                            abstractC2756m = abstractC2756m;
                            r5 = r5;
                        }
                        if (i == 1) {
                        }
                    }
                    abstractC2756m = AbstractC2749f.f(r5);
                }
            }
        }
        return obj;
    }

    @Override // x0.InterfaceC2637x
    public final InterfaceC2637x l() {
        if (!I0().f7175x) {
            AbstractC2540a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        S0();
        return this.f21812y.f21612O.f21769d.f21795A;
    }

    @Override // z0.AbstractC2739O
    public final AbstractC2739O m0() {
        return this.f21813z;
    }

    @Override // W0.c
    public final float n() {
        return this.f21812y.f21607H.n();
    }

    @Override // x0.InterfaceC2637x
    public final long o(InterfaceC2637x interfaceC2637x, long j5) {
        return R0(interfaceC2637x, j5);
    }

    @Override // z0.AbstractC2739O
    public final boolean o0() {
        return this.f21802H != null;
    }

    @Override // z0.AbstractC2739O
    public final C2731G p0() {
        return this.f21812y;
    }

    @Override // z0.AbstractC2739O
    public final x0.P q0() {
        x0.P p5 = this.f21802H;
        if (p5 != null) {
            return p5;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // z0.AbstractC2739O
    public final AbstractC2739O r0() {
        return this.f21795A;
    }

    @Override // x0.InterfaceC2637x
    public final C1989c s(InterfaceC2637x interfaceC2637x, boolean z3) {
        if (!I0().f7175x) {
            AbstractC2540a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!interfaceC2637x.F()) {
            AbstractC2540a.b("LayoutCoordinates " + interfaceC2637x + " is not attached!");
        }
        e0 c12 = c1(interfaceC2637x);
        c12.S0();
        e0 E0 = E0(c12);
        C1987a c1987a = this.f21804L;
        if (c1987a == null) {
            c1987a = new C1987a();
            this.f21804L = c1987a;
        }
        c1987a.f17187a = 0.0f;
        c1987a.f17188b = 0.0f;
        c1987a.f17189c = (int) (interfaceC2637x.I() >> 32);
        c1987a.f17190d = (int) (interfaceC2637x.I() & 4294967295L);
        while (c12 != E0) {
            c12.Z0(c1987a, z3, false);
            if (c1987a.b()) {
                return C1989c.f17192e;
            }
            c12 = c12.f21795A;
            kotlin.jvm.internal.l.c(c12);
        }
        x0(E0, c1987a, z3);
        return new C1989c(c1987a.f17187a, c1987a.f17188b, c1987a.f17189c, c1987a.f17190d);
    }

    @Override // z0.AbstractC2739O
    public final long s0() {
        return this.J;
    }

    @Override // z0.AbstractC2739O
    public final void w0() {
        Z(this.J, this.K, this.f21798D);
    }

    public final void x0(e0 e0Var, C1987a c1987a, boolean z3) {
        if (e0Var == this) {
            return;
        }
        e0 e0Var2 = this.f21795A;
        if (e0Var2 != null) {
            e0Var2.x0(e0Var, c1987a, z3);
        }
        long j5 = this.J;
        float f = (int) (j5 >> 32);
        c1987a.f17187a -= f;
        c1987a.f17189c -= f;
        float f5 = (int) (j5 & 4294967295L);
        c1987a.f17188b -= f5;
        c1987a.f17190d -= f5;
        m0 m0Var = this.f21811S;
        if (m0Var != null) {
            W0 w02 = (W0) m0Var;
            float[] a5 = w02.a();
            if (!w02.f404C) {
                if (a5 == null) {
                    c1987a.f17187a = 0.0f;
                    c1987a.f17188b = 0.0f;
                    c1987a.f17189c = 0.0f;
                    c1987a.f17190d = 0.0f;
                } else {
                    i0.z.c(a5, c1987a);
                }
            }
            if (this.f21797C && z3) {
                long j6 = this.f20975m;
                c1987a.a(0.0f, 0.0f, (int) (j6 >> 32), (int) (j6 & 4294967295L));
            }
        }
    }

    public final long y0(e0 e0Var, long j5) {
        if (e0Var == this) {
            return j5;
        }
        e0 e0Var2 = this.f21795A;
        return (e0Var2 == null || kotlin.jvm.internal.l.a(e0Var, e0Var2)) ? F0(j5) : F0(e0Var2.y0(e0Var, j5));
    }

    @Override // z0.o0
    public final boolean z() {
        return (this.f21811S == null || this.f21796B || !this.f21812y.I()) ? false : true;
    }

    public final long z0(long j5) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) - X();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) - W();
        float max = Math.max(0.0f, intBitsToFloat / 2.0f);
        float max2 = Math.max(0.0f, intBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
    }

    @Override // z0.AbstractC2739O
    public final InterfaceC2637x n0() {
        return this;
    }
}
