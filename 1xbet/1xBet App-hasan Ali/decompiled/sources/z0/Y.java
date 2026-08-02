package z0;

import java.util.List;
import w0.AbstractC2540a;

/* loaded from: classes.dex */
public final class Y extends x0.Z implements x0.N, InterfaceC2742a, InterfaceC2743a0 {

    /* renamed from: A, reason: collision with root package name */
    public Object f21732A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f21733B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f21734C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f21735D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f21736E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f21737F;
    public boolean J;

    /* renamed from: N, reason: collision with root package name */
    public float f21743N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f21744O;

    /* renamed from: P, reason: collision with root package name */
    public i4.c f21745P;

    /* renamed from: R, reason: collision with root package name */
    public float f21747R;

    /* renamed from: T, reason: collision with root package name */
    public boolean f21749T;

    /* renamed from: p, reason: collision with root package name */
    public final C2735K f21750p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f21751q;

    /* renamed from: t, reason: collision with root package name */
    public boolean f21754t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f21755u;

    /* renamed from: x, reason: collision with root package name */
    public i4.c f21758x;

    /* renamed from: y, reason: collision with root package name */
    public float f21759y;

    /* renamed from: r, reason: collision with root package name */
    public int f21752r = Integer.MAX_VALUE;

    /* renamed from: s, reason: collision with root package name */
    public int f21753s = Integer.MAX_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public EnumC2729E f21756v = EnumC2729E.f21594m;

    /* renamed from: w, reason: collision with root package name */
    public long f21757w = 0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f21760z = true;

    /* renamed from: G, reason: collision with root package name */
    public final C2732H f21738G = new C2732H(this, 0);

    /* renamed from: H, reason: collision with root package name */
    public final R.e f21739H = new R.e(new Y[16]);

    /* renamed from: I, reason: collision with root package name */
    public boolean f21740I = true;
    public long K = W0.b.b(0, 0, 15);

    /* renamed from: L, reason: collision with root package name */
    public final X f21741L = new X(this, 1);

    /* renamed from: M, reason: collision with root package name */
    public final X f21742M = new X(this, 0);

    /* renamed from: Q, reason: collision with root package name */
    public long f21746Q = 0;

    /* renamed from: S, reason: collision with root package name */
    public final X f21748S = new X(this, 2);

    public Y(C2735K c2735k) {
        this.f21750p = c2735k;
    }

    @Override // z0.InterfaceC2742a
    public final boolean A() {
        return this.f21733B;
    }

    @Override // x0.N
    public final int L(int i) {
        C2735K c2735k = this.f21750p;
        if (!AbstractC2749f.r(c2735k.f21650a)) {
            l0();
            return c2735k.a().L(i);
        }
        U u5 = c2735k.f21664q;
        kotlin.jvm.internal.l.c(u5);
        return u5.L(i);
    }

    @Override // z0.InterfaceC2742a
    public final void O() {
        C2731G.W(this.f21750p.f21650a, false, 7);
    }

    @Override // x0.N
    public final int T(int i) {
        C2735K c2735k = this.f21750p;
        if (!AbstractC2749f.r(c2735k.f21650a)) {
            l0();
            return c2735k.a().T(i);
        }
        U u5 = c2735k.f21664q;
        kotlin.jvm.internal.l.c(u5);
        return u5.T(i);
    }

    @Override // x0.N
    public final int U(int i) {
        C2735K c2735k = this.f21750p;
        if (!AbstractC2749f.r(c2735k.f21650a)) {
            l0();
            return c2735k.a().U(i);
        }
        U u5 = c2735k.f21664q;
        kotlin.jvm.internal.l.c(u5);
        return u5.U(i);
    }

    @Override // x0.Z
    public final int W() {
        return this.f21750p.a().W();
    }

    @Override // x0.Z
    public final int X() {
        return this.f21750p.a().X();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:3:0x0005, B:5:0x0010, B:8:0x002b, B:10:0x002f, B:14:0x004b, B:17:0x0055, B:19:0x0063, B:21:0x006e, B:22:0x0072, B:23:0x0059, B:24:0x003b, B:26:0x0041, B:28:0x0045, B:29:0x0047, B:30:0x0086, B:32:0x008a, B:36:0x0092, B:37:0x0097, B:42:0x0018, B:44:0x001c, B:46:0x0020, B:48:0x0028, B:49:0x0024), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092 A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:3:0x0005, B:5:0x0010, B:8:0x002b, B:10:0x002f, B:14:0x004b, B:17:0x0055, B:19:0x0063, B:21:0x006e, B:22:0x0072, B:23:0x0059, B:24:0x003b, B:26:0x0041, B:28:0x0045, B:29:0x0047, B:30:0x0086, B:32:0x008a, B:36:0x0092, B:37:0x0097, B:42:0x0018, B:44:0x001c, B:46:0x0020, B:48:0x0028, B:49:0x0024), top: B:2:0x0005 }] */
    @Override // x0.Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(long j5, float f, i4.c cVar) {
        U u5;
        U u6;
        boolean z3;
        x0.Y placementScope;
        C2735K c2735k = this.f21750p;
        C2731G c2731g = c2735k.f21650a;
        boolean z5 = true;
        try {
            this.f21734C = true;
            if (W0.j.a(j5, this.f21757w)) {
                if (this.f21749T) {
                }
                u5 = c2735k.f21664q;
                if (u5 != null) {
                    C2735K c2735k2 = u5.f21709p;
                    if (AbstractC2749f.r(c2735k2.f21650a)) {
                        z3 = true;
                    } else {
                        if (u5.f21719z == EnumC2741Q.f21695m && !c2735k2.f21651b) {
                            c2735k2.f21652c = true;
                        }
                        z3 = c2735k2.f21652c;
                    }
                    if (z3) {
                        e0 e0Var = c2735k.a().f21795A;
                        C2731G c2731g2 = c2735k.f21650a;
                        if (e0Var == null || (placementScope = e0Var.f21684v) == null) {
                            placementScope = ((A0.F) AbstractC2734J.a(c2731g2)).getPlacementScope();
                        }
                        U u7 = c2735k.f21664q;
                        kotlin.jvm.internal.l.c(u7);
                        C2731G u8 = c2731g2.u();
                        if (u8 != null) {
                            u8.f21613P.f21656h = 0;
                        }
                        u7.f21712s = Integer.MAX_VALUE;
                        x0.Y.g(placementScope, u7, (int) (j5 >> 32), (int) (4294967295L & j5));
                    }
                }
                u6 = c2735k.f21664q;
                if (u6 != null || u6.f21714u) {
                    z5 = false;
                }
                if (z5) {
                    AbstractC2540a.b("Error: Placement happened before lookahead.");
                }
                o0(j5, f, cVar);
            }
            if (c2735k.f21658k || c2735k.f21657j || this.f21749T) {
                this.f21736E = true;
                this.f21749T = false;
            }
            k0();
            u5 = c2735k.f21664q;
            if (u5 != null) {
            }
            u6 = c2735k.f21664q;
            if (u6 != null) {
            }
            z5 = false;
            if (z5) {
            }
            o0(j5, f, cVar);
        } catch (Throwable th) {
            c2731g.Z(th);
            throw null;
        }
    }

    @Override // z0.InterfaceC2742a
    public final C2732H a() {
        return this.f21738G;
    }

    @Override // x0.N
    public final x0.Z e(long j5) {
        EnumC2729E enumC2729E;
        C2735K c2735k = this.f21750p;
        C2731G c2731g = c2735k.f21650a;
        EnumC2729E enumC2729E2 = c2731g.f21609L;
        EnumC2729E enumC2729E3 = EnumC2729E.f21594m;
        if (enumC2729E2 == enumC2729E3) {
            c2731g.c();
        }
        if (AbstractC2749f.r(c2735k.f21650a)) {
            U u5 = c2735k.f21664q;
            kotlin.jvm.internal.l.c(u5);
            u5.f21713t = enumC2729E3;
            u5.e(j5);
        }
        C2731G c2731g2 = c2735k.f21650a;
        C2731G u6 = c2731g2.u();
        if (u6 != null) {
            if (this.f21756v != enumC2729E3 && !c2731g2.f21611N) {
                AbstractC2540a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            C2735K c2735k2 = u6.f21613P;
            int ordinal = c2735k2.f21653d.ordinal();
            if (ordinal == 0) {
                enumC2729E = EnumC2729E.f21592k;
            } else {
                if (ordinal != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + c2735k2.f21653d);
                }
                enumC2729E = EnumC2729E.f21593l;
            }
            this.f21756v = enumC2729E;
        } else {
            this.f21756v = enumC2729E3;
        }
        p0(j5);
        return this;
    }

    @Override // x0.N
    public final int f(int i) {
        C2735K c2735k = this.f21750p;
        if (!AbstractC2749f.r(c2735k.f21650a)) {
            l0();
            return c2735k.a().f(i);
        }
        U u5 = c2735k.f21664q;
        kotlin.jvm.internal.l.c(u5);
        return u5.f(i);
    }

    public final List f0() {
        C2735K c2735k = this.f21750p;
        c2735k.f21650a.g0();
        boolean z3 = this.f21740I;
        R.e eVar = this.f21739H;
        if (!z3) {
            return eVar.g();
        }
        C2731G c2731g = c2735k.f21650a;
        R.e y5 = c2731g.y();
        Object[] objArr = y5.f5106k;
        int i = y5.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            C2731G c2731g2 = (C2731G) objArr[i5];
            if (eVar.f5108m <= i5) {
                eVar.c(c2731g2.f21613P.f21663p);
            } else {
                Y y6 = c2731g2.f21613P.f21663p;
                Object[] objArr2 = eVar.f5106k;
                Object obj = objArr2[i5];
                objArr2[i5] = y6;
            }
        }
        eVar.m(((R.b) c2731g.n()).f5100k.f5108m, eVar.f5108m);
        this.f21740I = false;
        return eVar.g();
    }

    public final void g0() {
        boolean z3 = this.f21733B;
        this.f21733B = true;
        C2731G c2731g = this.f21750p.f21650a;
        if (!z3) {
            c2731g.f21612O.f21768c.U0();
            if (c2731g.q()) {
                C2731G.W(c2731g, true, 6);
            } else if (c2731g.f21613P.f21654e) {
                C2731G.U(c2731g, true, 6);
            }
        }
        c0 c0Var = c2731g.f21612O;
        e0 e0Var = c0Var.f21768c.f21813z;
        for (e0 e0Var2 = c0Var.f21769d; !kotlin.jvm.internal.l.a(e0Var2, e0Var) && e0Var2 != null; e0Var2 = e0Var2.f21813z) {
            if (e0Var2.f21810R) {
                e0Var2.P0();
            }
        }
        R.e y5 = c2731g.y();
        Object[] objArr = y5.f5106k;
        int i = y5.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            C2731G c2731g2 = (C2731G) objArr[i5];
            if (c2731g2.v() != Integer.MAX_VALUE) {
                c2731g2.f21613P.f21663p.g0();
                C2731G.X(c2731g2);
            }
        }
    }

    @Override // z0.InterfaceC2742a
    public final void j(t0.F f) {
        R.e y5 = this.f21750p.f21650a.y();
        Object[] objArr = y5.f5106k;
        int i = y5.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            f.c(((C2731G) objArr[i5]).f21613P.f21663p);
        }
    }

    public final void j0() {
        if (this.f21733B) {
            this.f21733B = false;
            C2735K c2735k = this.f21750p;
            c0 c0Var = c2735k.f21650a.f21612O;
            e0 e0Var = c0Var.f21768c.f21813z;
            for (e0 e0Var2 = c0Var.f21769d; !kotlin.jvm.internal.l.a(e0Var2, e0Var) && e0Var2 != null; e0Var2 = e0Var2.f21813z) {
                b0.o K02 = e0Var2.K0(f0.g(1048576));
                if (K02 != null && (K02.f7162k.f7165n & 1048576) != 0) {
                    boolean g5 = f0.g(1048576);
                    b0.o I02 = e0Var2.I0();
                    if (g5 || (I02 = I02.f7166o) != null) {
                        for (b0.o K03 = e0Var2.K0(g5); K03 != null && (K03.f7165n & 1048576) != 0; K03 = K03.f7167p) {
                            if ((K03.f7164m & 1048576) != 0) {
                                b0.o oVar = K03;
                                R.e eVar = null;
                                while (oVar != null) {
                                    if ((oVar.f7164m & 1048576) != 0 && (oVar instanceof AbstractC2756m)) {
                                        int i = 0;
                                        for (b0.o oVar2 = ((AbstractC2756m) oVar).f21839z; oVar2 != null; oVar2 = oVar2.f7167p) {
                                            if ((oVar2.f7164m & 1048576) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    oVar = oVar2;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new R.e(new b0.o[16]);
                                                    }
                                                    if (oVar != null) {
                                                        eVar.c(oVar);
                                                        oVar = null;
                                                    }
                                                    eVar.c(oVar2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    oVar = AbstractC2749f.f(eVar);
                                }
                            }
                            if (K03 != I02) {
                            }
                        }
                    }
                }
                e0Var2.a1();
            }
            R.e y5 = c2735k.f21650a.y();
            Object[] objArr = y5.f5106k;
            int i5 = y5.f5108m;
            for (int i6 = 0; i6 < i5; i6++) {
                ((C2731G) objArr[i6]).f21613P.f21663p.j0();
            }
        }
    }

    @Override // x0.Z, x0.N
    public final Object k() {
        return this.f21732A;
    }

    public final void k0() {
        C2735K c2735k = this.f21750p;
        if (c2735k.f21659l > 0) {
            R.e y5 = c2735k.f21650a.y();
            Object[] objArr = y5.f5106k;
            int i = y5.f5108m;
            for (int i5 = 0; i5 < i; i5++) {
                C2731G c2731g = (C2731G) objArr[i5];
                C2735K c2735k2 = c2731g.f21613P;
                boolean z3 = c2735k2.f21657j;
                Y y6 = c2735k2.f21663p;
                if ((z3 || c2735k2.f21658k) && !y6.f21736E) {
                    c2731g.V(false);
                }
                y6.k0();
            }
        }
    }

    public final void l0() {
        C2735K c2735k = this.f21750p;
        C2731G.W(c2735k.f21650a, false, 7);
        C2731G c2731g = c2735k.f21650a;
        C2731G u5 = c2731g.u();
        if (u5 == null || c2731g.f21609L != EnumC2729E.f21594m) {
            return;
        }
        int ordinal = u5.f21613P.f21653d.ordinal();
        c2731g.f21609L = ordinal != 0 ? ordinal != 2 ? u5.f21609L : EnumC2729E.f21593l : EnumC2729E.f21592k;
    }

    @Override // z0.InterfaceC2743a0
    public final void m(boolean z3) {
        C2735K c2735k = this.f21750p;
        if (z3 != c2735k.a().f21681s) {
            c2735k.a().f21681s = z3;
            this.f21749T = true;
        }
    }

    public final void m0() {
        this.f21744O = true;
        C2735K c2735k = this.f21750p;
        C2731G u5 = c2735k.f21650a.u();
        float f = r().K;
        C2731G c2731g = c2735k.f21650a;
        c0 c0Var = c2731g.f21612O;
        e0 e0Var = c0Var.f21769d;
        while (e0Var != c0Var.f21768c) {
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator", e0Var);
            C2767y c2767y = (C2767y) e0Var;
            f += c2767y.K;
            e0Var = c2767y.f21813z;
        }
        if (f != this.f21743N) {
            this.f21743N = f;
            if (u5 != null) {
                u5.P();
            }
            if (u5 != null) {
                u5.C();
            }
        }
        if (this.f21733B) {
            c2731g.f21612O.f21768c.U0();
        } else {
            if (u5 != null) {
                u5.C();
            }
            g0();
            if (this.f21751q && u5 != null) {
                u5.V(false);
            }
        }
        if (u5 == null) {
            this.f21753s = 0;
        } else if (!this.f21751q) {
            C2735K c2735k2 = u5.f21613P;
            if (c2735k2.f21653d == EnumC2727C.f21587m) {
                if (this.f21753s != Integer.MAX_VALUE) {
                    AbstractC2540a.b("Place was called on a node which was placed already");
                }
                int i = c2735k2.i;
                this.f21753s = i;
                c2735k2.i = i + 1;
            }
        }
        v();
    }

    public final void n0(long j5) {
        C2735K c2735k = this.f21750p;
        EnumC2727C enumC2727C = c2735k.f21653d;
        EnumC2727C enumC2727C2 = EnumC2727C.f21589o;
        if (enumC2727C != enumC2727C2) {
            AbstractC2540a.b("layout state is not idle before measure starts");
        }
        this.K = j5;
        EnumC2727C enumC2727C3 = EnumC2727C.f21585k;
        c2735k.f21653d = enumC2727C3;
        this.f21735D = false;
        C2731G c2731g = c2735k.f21650a;
        p0 snapshotObserver = ((A0.F) AbstractC2734J.a(c2731g)).getSnapshotObserver();
        snapshotObserver.a(c2731g, snapshotObserver.f21845c, this.f21741L);
        if (c2735k.f21653d == enumC2727C3) {
            this.f21736E = true;
            this.f21737F = true;
            c2735k.f21653d = enumC2727C2;
        }
    }

    public final void o0(long j5, float f, i4.c cVar) {
        C2735K c2735k = this.f21750p;
        if (c2735k.f21650a.f21623Z) {
            AbstractC2540a.a("place is called on a deactivated node");
        }
        c2735k.f21653d = EnumC2727C.f21587m;
        this.f21757w = j5;
        this.f21759y = f;
        this.f21758x = cVar;
        this.f21744O = false;
        C2731G c2731g = c2735k.f21650a;
        n0 a5 = AbstractC2734J.a(c2731g);
        if (this.f21736E || !this.f21733B) {
            this.f21738G.f21644e = false;
            c2735k.f(false);
            this.f21745P = cVar;
            this.f21746Q = j5;
            this.f21747R = f;
            p0 snapshotObserver = ((A0.F) a5).getSnapshotObserver();
            snapshotObserver.a(c2731g, snapshotObserver.f, this.f21748S);
        } else {
            e0 a6 = c2735k.a();
            a6.Y0(W0.j.c(j5, a6.f20977o), f, cVar);
            m0();
        }
        c2735k.f21653d = EnumC2727C.f21589o;
        this.f21755u = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[Catch: all -> 0x0010, LOOP:0: B:22:0x0052->B:23:0x0054, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0064, B:27:0x007e, B:29:0x0088, B:33:0x0094), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p0(long j5) {
        boolean z3;
        int i;
        int i5;
        long j6;
        C2735K c2735k = this.f21750p;
        C2731G c2731g = c2735k.f21650a;
        C2731G c2731g2 = c2735k.f21650a;
        try {
            if (c2731g.f21623Z) {
                AbstractC2540a.a("measure is called on a deactivated node");
            }
            n0 a5 = AbstractC2734J.a(c2731g2);
            C2731G u5 = c2731g2.u();
            boolean z5 = true;
            if (!c2731g2.f21611N && (u5 == null || !u5.f21611N)) {
                z3 = false;
                c2731g2.f21611N = z3;
                if (!c2731g2.q() && W0.a.b(this.f20976n, j5)) {
                    ((A0.F) a5).o(c2731g2, false);
                    c2731g2.Y();
                    return false;
                }
                this.f21738G.f21643d = false;
                R.e y5 = c2731g2.y();
                Object[] objArr = y5.f5106k;
                i = y5.f5108m;
                for (i5 = 0; i5 < i; i5++) {
                    ((C2731G) objArr[i5]).f21613P.f21663p.f21738G.getClass();
                }
                this.f21754t = true;
                j6 = c2735k.a().f20975m;
                e0(j5);
                n0(j5);
                if (W0.l.a(c2735k.a().f20975m, j6) && c2735k.a().f20973k == this.f20973k && c2735k.a().f20974l == this.f20974l) {
                    z5 = false;
                }
                c0((c2735k.a().f20974l & 4294967295L) | (c2735k.a().f20973k << 32));
                return z5;
            }
            z3 = true;
            c2731g2.f21611N = z3;
            if (!c2731g2.q()) {
                ((A0.F) a5).o(c2731g2, false);
                c2731g2.Y();
                return false;
            }
            this.f21738G.f21643d = false;
            R.e y52 = c2731g2.y();
            Object[] objArr2 = y52.f5106k;
            i = y52.f5108m;
            while (i5 < i) {
            }
            this.f21754t = true;
            j6 = c2735k.a().f20975m;
            e0(j5);
            n0(j5);
            if (W0.l.a(c2735k.a().f20975m, j6)) {
                z5 = false;
            }
            c0((c2735k.a().f20974l & 4294967295L) | (c2735k.a().f20973k << 32));
            return z5;
        } catch (Throwable th) {
            c2731g.Z(th);
            throw null;
        }
    }

    @Override // z0.InterfaceC2742a
    public final C2761s r() {
        return this.f21750p.f21650a.f21612O.f21768c;
    }

    @Override // z0.InterfaceC2742a
    public final void requestLayout() {
        this.f21750p.f21650a.V(false);
    }

    @Override // z0.InterfaceC2742a
    public final InterfaceC2742a u() {
        C2735K c2735k;
        C2731G u5 = this.f21750p.f21650a.u();
        if (u5 == null || (c2735k = u5.f21613P) == null) {
            return null;
        }
        return c2735k.f21663p;
    }

    @Override // z0.InterfaceC2742a
    public final void v() {
        boolean z3;
        this.J = true;
        C2732H c2732h = this.f21738G;
        c2732h.h();
        boolean z5 = this.f21736E;
        C2735K c2735k = this.f21750p;
        if (z5) {
            R.e y5 = c2735k.f21650a.y();
            Object[] objArr = y5.f5106k;
            int i = y5.f5108m;
            for (int i5 = 0; i5 < i; i5++) {
                C2731G c2731g = (C2731G) objArr[i5];
                if (c2731g.q() && c2731g.r() == EnumC2729E.f21592k) {
                    C2735K c2735k2 = c2731g.f21613P;
                    Y y6 = c2735k2.f21663p;
                    W0.a aVar = y6.f21754t ? new W0.a(y6.f20976n) : null;
                    if (aVar != null) {
                        if (c2731g.f21609L == EnumC2729E.f21594m) {
                            c2731g.c();
                        }
                        z3 = c2735k2.f21663p.p0(aVar.f6000a);
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        C2731G.W(c2735k.f21650a, false, 7);
                    }
                }
            }
        }
        if (this.f21737F || (!r().f21683u && this.f21736E)) {
            this.f21736E = false;
            EnumC2727C enumC2727C = c2735k.f21653d;
            c2735k.f21653d = EnumC2727C.f21587m;
            c2735k.g(false);
            C2731G c2731g2 = c2735k.f21650a;
            p0 snapshotObserver = ((A0.F) AbstractC2734J.a(c2731g2)).getSnapshotObserver();
            snapshotObserver.a(c2731g2, snapshotObserver.f21847e, this.f21742M);
            c2735k.f21653d = enumC2727C;
            if (r().f21683u && c2735k.f21657j) {
                requestLayout();
            }
            this.f21737F = false;
        }
        if (c2732h.f21641b && c2732h.e()) {
            c2732h.g();
        }
        this.J = false;
    }
}
