package z0;

import A0.C0060u;
import A0.S0;
import A0.q1;
import P.AbstractC0329z;
import P.C0305m0;
import P.C0328y0;
import P.InterfaceC0298j;
import P.e1;
import a0.AbstractC0447c;
import a0.C0446b;
import a3.AbstractC0467k;
import c0.C0533b;
import i0.InterfaceC2009n;
import java.util.List;
import k4.AbstractC2036a;
import l0.C2041b;
import n.C2138i;
import w0.AbstractC2540a;

/* renamed from: z0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2731G implements InterfaceC0298j, o0, InterfaceC2753j {

    /* renamed from: a0, reason: collision with root package name */
    public static final C2726B f21597a0 = new C2726B("Undefined intrinsics block and it is required");

    /* renamed from: b0, reason: collision with root package name */
    public static final C2725A f21598b0 = new C2725A();

    /* renamed from: c0, reason: collision with root package name */
    public static final S0 f21599c0 = new S0(5);

    /* renamed from: A, reason: collision with root package name */
    public boolean f21600A;

    /* renamed from: B, reason: collision with root package name */
    public H0.j f21601B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f21602C;

    /* renamed from: D, reason: collision with root package name */
    public final R.e f21603D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f21604E;

    /* renamed from: F, reason: collision with root package name */
    public x0.O f21605F;

    /* renamed from: G, reason: collision with root package name */
    public v3.g f21606G;

    /* renamed from: H, reason: collision with root package name */
    public W0.c f21607H;

    /* renamed from: I, reason: collision with root package name */
    public W0.m f21608I;
    public q1 J;
    public P.B K;

    /* renamed from: L, reason: collision with root package name */
    public EnumC2729E f21609L;

    /* renamed from: M, reason: collision with root package name */
    public EnumC2729E f21610M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f21611N;

    /* renamed from: O, reason: collision with root package name */
    public final c0 f21612O;

    /* renamed from: P, reason: collision with root package name */
    public final C2735K f21613P;

    /* renamed from: Q, reason: collision with root package name */
    public x0.K f21614Q;

    /* renamed from: R, reason: collision with root package name */
    public e0 f21615R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f21616S;

    /* renamed from: T, reason: collision with root package name */
    public b0.p f21617T;

    /* renamed from: U, reason: collision with root package name */
    public b0.p f21618U;

    /* renamed from: V, reason: collision with root package name */
    public Z0.c f21619V;

    /* renamed from: W, reason: collision with root package name */
    public Z0.d f21620W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f21621X;

    /* renamed from: Y, reason: collision with root package name */
    public int f21622Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f21623Z;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f21624k;

    /* renamed from: l, reason: collision with root package name */
    public int f21625l;

    /* renamed from: m, reason: collision with root package name */
    public long f21626m;

    /* renamed from: n, reason: collision with root package name */
    public long f21627n;

    /* renamed from: o, reason: collision with root package name */
    public long f21628o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f21629p;

    /* renamed from: q, reason: collision with root package name */
    public C2731G f21630q;

    /* renamed from: r, reason: collision with root package name */
    public int f21631r;

    /* renamed from: s, reason: collision with root package name */
    public final G.v f21632s;

    /* renamed from: t, reason: collision with root package name */
    public R.e f21633t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f21634u;

    /* renamed from: v, reason: collision with root package name */
    public C2731G f21635v;

    /* renamed from: w, reason: collision with root package name */
    public A0.F f21636w;

    /* renamed from: x, reason: collision with root package name */
    public Z0.q f21637x;

    /* renamed from: y, reason: collision with root package name */
    public int f21638y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f21639z;

    public C2731G(int i) {
        this(H0.k.f2107a.addAndGet(1), (i & 1) == 0);
    }

    public static void U(C2731G c2731g, boolean z3, int i) {
        C2731G u5;
        if ((i & 1) != 0) {
            z3 = false;
        }
        boolean z5 = (i & 2) != 0;
        boolean z6 = (i & 4) != 0;
        if (c2731g.f21630q == null) {
            AbstractC2540a.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        A0.F f = c2731g.f21636w;
        if (f == null || c2731g.f21639z || c2731g.f21624k) {
            return;
        }
        f.C(c2731g, true, z3, z5);
        if (z6) {
            U u6 = c2731g.f21613P.f21664q;
            kotlin.jvm.internal.l.c(u6);
            C2735K c2735k = u6.f21709p;
            C2731G u7 = c2735k.f21650a.u();
            EnumC2729E enumC2729E = c2735k.f21650a.f21609L;
            if (u7 == null || enumC2729E == EnumC2729E.f21594m) {
                return;
            }
            while (u7.f21609L == enumC2729E && (u5 = u7.u()) != null) {
                u7 = u5;
            }
            int ordinal = enumC2729E.ordinal();
            if (ordinal == 0) {
                if (u7.f21630q != null) {
                    U(u7, z3, 6);
                    return;
                } else {
                    W(u7, z3, 6);
                    return;
                }
            }
            if (ordinal != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (u7.f21630q != null) {
                u7.T(z3);
            } else {
                u7.V(z3);
            }
        }
    }

    public static void W(C2731G c2731g, boolean z3, int i) {
        A0.F f;
        C2731G u5;
        if ((i & 1) != 0) {
            z3 = false;
        }
        boolean z5 = (i & 2) != 0;
        boolean z6 = (i & 4) != 0;
        if (c2731g.f21639z || c2731g.f21624k || (f = c2731g.f21636w) == null) {
            return;
        }
        f.C(c2731g, false, z3, z5);
        if (z6) {
            C2735K c2735k = c2731g.f21613P.f21663p.f21750p;
            C2731G u6 = c2735k.f21650a.u();
            EnumC2729E enumC2729E = c2735k.f21650a.f21609L;
            if (u6 == null || enumC2729E == EnumC2729E.f21594m) {
                return;
            }
            while (u6.f21609L == enumC2729E && (u5 = u6.u()) != null) {
                u6 = u5;
            }
            int ordinal = enumC2729E.ordinal();
            if (ordinal == 0) {
                W(u6, z3, 6);
            } else {
                if (ordinal != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                u6.V(z3);
            }
        }
    }

    public static void X(C2731G c2731g) {
        int i = AbstractC2730F.f21596a[c2731g.f21613P.f21653d.ordinal()];
        C2735K c2735k = c2731g.f21613P;
        if (i != 1) {
            throw new IllegalStateException("Unexpected state " + c2735k.f21653d);
        }
        if (c2735k.f21654e) {
            U(c2731g, true, 6);
            return;
        }
        if (c2735k.f) {
            c2731g.T(true);
        }
        if (c2731g.q()) {
            W(c2731g, true, 6);
        } else if (c2731g.p()) {
            c2731g.V(true);
        }
    }

    private final String j(C2731G c2731g) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(c2731g);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(e(0));
        sb.append(" Other tree: ");
        C2731G c2731g2 = c2731g.f21635v;
        sb.append(c2731g2 != null ? c2731g2.e(0) : null);
        return sb.toString();
    }

    public final void A(long j5, C2760q c2760q, int i, boolean z3) {
        c0 c0Var = this.f21612O;
        e0 e0Var = c0Var.f21769d;
        i0.G g5 = e0.f21790T;
        c0Var.f21769d.N0(e0.f21793W, e0Var.F0(j5), c2760q, i, z3);
    }

    public final void B(int i, C2731G c2731g) {
        if (c2731g.f21635v != null && c2731g.f21636w != null) {
            AbstractC2540a.b(j(c2731g));
        }
        c2731g.f21635v = this;
        G.v vVar = this.f21632s;
        ((R.e) vVar.f1749l).a(i, c2731g);
        ((x0.J) vVar.f1750m).invoke();
        P();
        if (c2731g.f21624k) {
            this.f21631r++;
        }
        H();
        A0.F f = this.f21636w;
        if (f != null) {
            c2731g.b(f);
        }
        if (c2731g.f21613P.f21659l > 0) {
            C2735K c2735k = this.f21613P;
            c2735k.d(c2735k.f21659l + 1);
        }
        if (c2731g.f21622Y > 0) {
            b0(this.f21622Y + 1);
        }
    }

    public final void C() {
        if (this.f21616S) {
            c0 c0Var = this.f21612O;
            e0 e0Var = c0Var.f21768c;
            e0 e0Var2 = c0Var.f21769d.f21795A;
            this.f21615R = null;
            while (true) {
                if (kotlin.jvm.internal.l.a(e0Var, e0Var2)) {
                    break;
                }
                if ((e0Var != null ? e0Var.f21811S : null) != null) {
                    this.f21615R = e0Var;
                    break;
                }
                e0Var = e0Var != null ? e0Var.f21795A : null;
            }
        }
        e0 e0Var3 = this.f21615R;
        if (e0Var3 != null && e0Var3.f21811S == null) {
            throw AbstractC0467k.u("layer was not set");
        }
        if (e0Var3 != null) {
            e0Var3.P0();
            return;
        }
        C2731G u5 = u();
        if (u5 != null) {
            u5.C();
        }
    }

    public final void D() {
        c0 c0Var = this.f21612O;
        e0 e0Var = c0Var.f21769d;
        C2761s c2761s = c0Var.f21768c;
        while (e0Var != c2761s) {
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator", e0Var);
            C2767y c2767y = (C2767y) e0Var;
            m0 m0Var = c2767y.f21811S;
            if (m0Var != null) {
                m0Var.invalidate();
            }
            e0Var = c2767y.f21813z;
        }
        m0 m0Var2 = c0Var.f21768c.f21811S;
        if (m0Var2 != null) {
            m0Var2.invalidate();
        }
    }

    public final void E() {
        if (this.f21624k) {
            C2731G u5 = u();
            if (u5 != null) {
                u5.E();
                return;
            }
            return;
        }
        if (this.f21630q != null) {
            U(this, false, 7);
        } else {
            W(this, false, 7);
        }
    }

    public final void F() {
        if (W0.j.a(this.f21626m, 9223372034707292159L)) {
            return;
        }
        this.f21626m = 9223372034707292159L;
        R.e y5 = y();
        Object[] objArr = y5.f5106k;
        int i = y5.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            ((C2731G) objArr[i5]).F();
        }
    }

    public final void G() {
        if (this.f21602C) {
            return;
        }
        if (this.f21612O.f21767b.f7167p != null || this.f21618U != null) {
            this.f21600A = true;
            return;
        }
        H0.j jVar = this.f21601B;
        this.f21602C = true;
        kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
        wVar.f17624k = new H0.j();
        p0 snapshotObserver = ((A0.F) AbstractC2734J.a(this)).getSnapshotObserver();
        snapshotObserver.a(this, snapshotObserver.f21846d, new C0060u(13, this, wVar));
        this.f21602C = false;
        this.f21601B = (H0.j) wVar.f17624k;
        this.f21600A = false;
        A0.F f = (A0.F) AbstractC2734J.a(this);
        f.getSemanticsOwner().b(this, jVar);
        f.E();
    }

    public final void H() {
        C2731G c2731g;
        if (this.f21631r > 0) {
            this.f21634u = true;
        }
        if (!this.f21624k || (c2731g = this.f21635v) == null) {
            return;
        }
        c2731g.H();
    }

    public final boolean I() {
        return this.f21636w != null;
    }

    public final boolean J() {
        return this.f21613P.f21663p.f21733B;
    }

    public final Boolean K() {
        U u5 = this.f21613P.f21664q;
        if (u5 != null) {
            return Boolean.valueOf(u5.A());
        }
        return null;
    }

    public final void L() {
        C2731G u5;
        if (this.f21609L == EnumC2729E.f21594m) {
            d();
        }
        U u6 = this.f21613P.f21664q;
        kotlin.jvm.internal.l.c(u6);
        try {
            u6.f21710q = true;
            if (!u6.f21714u) {
                AbstractC2540a.b("replace() called on item that was not placed");
            }
            u6.f21708G = false;
            boolean A3 = u6.A();
            u6.m0(u6.f21717x, u6.f21718y);
            if (A3 && !u6.f21708G && (u5 = u6.f21709p.f21650a.u()) != null) {
                u5.T(false);
            }
            u6.f21710q = false;
        } catch (Throwable th) {
            u6.f21710q = false;
            throw th;
        }
    }

    public final void M(int i, int i5, int i6) {
        if (i == i5) {
            return;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = i > i5 ? i + i7 : i;
            int i9 = i > i5 ? i5 + i7 : (i5 + i6) - 2;
            G.v vVar = this.f21632s;
            Object l5 = ((R.e) vVar.f1749l).l(i8);
            x0.J j5 = (x0.J) vVar.f1750m;
            j5.invoke();
            ((R.e) vVar.f1749l).a(i9, (C2731G) l5);
            j5.invoke();
        }
        P();
        H();
        E();
    }

    public final void N(C2731G c2731g) {
        if (c2731g.f21613P.f21659l > 0) {
            this.f21613P.d(r0.f21659l - 1);
        }
        if (this.f21636w != null) {
            c2731g.f();
        }
        c2731g.f21635v = null;
        if (c2731g.f21622Y > 0) {
            b0(this.f21622Y - 1);
        }
        c2731g.f21612O.f21769d.f21795A = null;
        if (c2731g.f21624k) {
            this.f21631r--;
            R.e eVar = (R.e) c2731g.f21632s.f1749l;
            Object[] objArr = eVar.f5106k;
            int i = eVar.f5108m;
            for (int i5 = 0; i5 < i; i5++) {
                ((C2731G) objArr[i5]).f21612O.f21769d.f21795A = null;
            }
        }
        H();
        P();
    }

    public final void O() {
        this.f21629p = true;
        R.e y5 = y();
        Object[] objArr = y5.f5106k;
        int i = y5.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            ((C2731G) objArr[i5]).F();
        }
    }

    public final void P() {
        if (!this.f21624k) {
            this.f21604E = true;
            return;
        }
        C2731G u5 = u();
        if (u5 != null) {
            u5.P();
        }
    }

    public final void Q() {
        G.v vVar = this.f21632s;
        int i = ((R.e) vVar.f1749l).f5108m;
        while (true) {
            i--;
            R.e eVar = (R.e) vVar.f1749l;
            if (-1 >= i) {
                eVar.h();
                ((x0.J) vVar.f1750m).invoke();
                return;
            }
            N((C2731G) eVar.f5106k[i]);
        }
    }

    public final void R(int i, int i5) {
        if (i5 < 0) {
            AbstractC2540a.a("count (" + i5 + ") must be greater than 0");
        }
        int i6 = (i5 + i) - 1;
        if (i > i6) {
            return;
        }
        while (true) {
            G.v vVar = this.f21632s;
            N((C2731G) ((R.e) vVar.f1749l).f5106k[i6]);
            Object l5 = ((R.e) vVar.f1749l).l(i6);
            ((x0.J) vVar.f1750m).invoke();
            if (i6 == i) {
                return;
            } else {
                i6--;
            }
        }
    }

    public final void S() {
        C2731G u5;
        if (this.f21609L == EnumC2729E.f21594m) {
            d();
        }
        Y y5 = this.f21613P.f21663p;
        C2735K c2735k = y5.f21750p;
        try {
            y5.f21751q = true;
            if (!y5.f21755u) {
                AbstractC2540a.b("replace called on unplaced item");
            }
            boolean z3 = y5.f21733B;
            y5.o0(y5.f21757w, y5.f21759y, y5.f21758x);
            if (z3 && !y5.f21744O && (u5 = c2735k.f21650a.u()) != null) {
                u5.V(false);
            }
        } finally {
        }
    }

    public final void T(boolean z3) {
        A0.F f;
        if (this.f21624k || (f = this.f21636w) == null) {
            return;
        }
        f.D(this, true, z3);
    }

    public final void V(boolean z3) {
        A0.F f;
        if (this.f21624k || (f = this.f21636w) == null) {
            return;
        }
        f.D(this, false, z3);
    }

    public final void Y() {
        R.e y5 = y();
        Object[] objArr = y5.f5106k;
        int i = y5.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            C2731G c2731g = (C2731G) objArr[i5];
            EnumC2729E enumC2729E = c2731g.f21610M;
            c2731g.f21609L = enumC2729E;
            if (enumC2729E != EnumC2729E.f21594m) {
                c2731g.Y();
            }
        }
    }

    public final void Z(Throwable th) {
        P.B b3 = this.K;
        e1 e1Var = AbstractC0447c.f6365a;
        X.i iVar = (X.i) b3;
        iVar.getClass();
        C0446b c0446b = (C0446b) AbstractC0329z.u(iVar, e1Var);
        if (c0446b == null) {
            throw th;
        }
        AbstractC2036a.Y(th, new C0328y0(4, c0446b, this));
        throw th;
    }

    public final void a(b0.p pVar) {
        x0 x0Var;
        c0 c0Var;
        R.e eVar;
        C2745b0 c2745b0;
        c0 c0Var2 = this.f21612O;
        boolean d5 = c0Var2.d(16);
        boolean d6 = c0Var2.d(1024);
        this.f21617T = pVar;
        b0.o oVar = c0Var2.f;
        C2745b0 c2745b02 = c0Var2.f21767b;
        if (oVar == c2745b02) {
            AbstractC2540a.b("padChain called on already padded chain");
        }
        b0.o oVar2 = c0Var2.f;
        oVar2.f7166o = c2745b02;
        c2745b02.f7167p = oVar2;
        R.e eVar2 = c0Var2.f21771g;
        int i = eVar2 != null ? eVar2.f5108m : 0;
        R.e eVar3 = c0Var2.f21772h;
        if (eVar3 == null) {
            eVar3 = new R.e(new b0.n[16]);
        }
        R.e eVar4 = c0Var2.i;
        eVar4.c(pVar);
        t0.F f = null;
        while (true) {
            int i5 = eVar4.f5108m;
            if (i5 == 0) {
                break;
            }
            b0.p pVar2 = (b0.p) eVar4.l(i5 - 1);
            if (pVar2 instanceof b0.j) {
                b0.j jVar = (b0.j) pVar2;
                eVar4.c(jVar.f7158l);
                eVar4.c(jVar.f7157k);
            } else if (pVar2 instanceof b0.n) {
                eVar3.c(pVar2);
            } else {
                if (f == null) {
                    f = new t0.F(9, eVar3);
                }
                pVar2.j(f);
                f = f;
            }
        }
        int i6 = eVar3.f5108m;
        boolean z3 = true;
        x0 x0Var2 = c0Var2.f21770e;
        C2731G c2731g = c0Var2.f21766a;
        if (i6 == i) {
            b0.o oVar3 = c2745b02.f7167p;
            int i7 = 0;
            while (oVar3 != null && i7 < i) {
                if (eVar2 == null) {
                    throw AbstractC0467k.u("expected prior modifier list to be non-empty");
                }
                b0.n nVar = (b0.n) eVar2.f5106k[i7];
                b0.n nVar2 = (b0.n) eVar3.f5106k[i7];
                boolean z5 = kotlin.jvm.internal.l.a(nVar, nVar2) ? 2 : nVar.getClass() == nVar2.getClass();
                if (!z5) {
                    oVar3 = oVar3.f7166o;
                    break;
                }
                if (z5) {
                    c0.h(nVar, nVar2, oVar3);
                }
                oVar3 = oVar3.f7167p;
                i7++;
            }
            if (i7 >= i) {
                x0Var = x0Var2;
                c0Var2 = c0Var2;
                c0Var = c0Var2;
                eVar = eVar3;
                c2745b0 = c2745b02;
                z3 = false;
            } else {
                if (eVar2 == null) {
                    throw AbstractC0467k.u("expected prior modifier list to be non-empty");
                }
                if (oVar3 == null) {
                    throw AbstractC0467k.u("structuralUpdate requires a non-null tail");
                }
                x0Var = x0Var2;
                eVar = eVar3;
                b0.o oVar4 = oVar3;
                c0Var = c0Var2;
                c0Var.f(i7, eVar2, eVar, oVar4, !(c2731g.f21618U != null));
                c2745b0 = c2745b02;
            }
        } else {
            x0Var = x0Var2;
            b0.p pVar3 = c2731g.f21618U;
            if (pVar3 != null && i == 0) {
                b0.o oVar5 = c2745b02;
                for (int i8 = 0; i8 < eVar3.f5108m; i8++) {
                    oVar5 = c0.b((b0.n) eVar3.f5106k[i8], oVar5);
                }
                int i9 = 0;
                for (b0.o oVar6 = x0Var.f7166o; oVar6 != null && oVar6 != c2745b02; oVar6 = oVar6.f7166o) {
                    i9 |= oVar6.f7164m;
                    oVar6.f7165n = i9;
                }
                c0Var = c0Var2;
                eVar = eVar3;
                c2745b0 = c2745b02;
            } else if (i6 != 0) {
                if (eVar2 == null) {
                    eVar2 = new R.e(new b0.n[16]);
                }
                c0Var = c0Var2;
                eVar = eVar3;
                c2745b0 = c2745b02;
                c0Var.f(0, eVar2, eVar, c2745b0, !(pVar3 != null));
            } else {
                if (eVar2 == null) {
                    throw AbstractC0467k.u("expected prior modifier list to be non-empty");
                }
                b0.o oVar7 = c2745b02.f7167p;
                for (int i10 = 0; oVar7 != null && i10 < eVar2.f5108m; i10++) {
                    oVar7 = c0.c(oVar7).f7167p;
                }
                C2731G u5 = c2731g.u();
                C2761s c2761s = u5 != null ? u5.f21612O.f21768c : null;
                C2761s c2761s2 = c0Var2.f21768c;
                c2761s2.f21795A = c2761s;
                c0Var2.f21769d = c2761s2;
                c0Var = c0Var2;
                eVar = eVar3;
                c2745b0 = c2745b02;
                z3 = false;
            }
        }
        c0Var.f21771g = eVar;
        if (eVar2 != null) {
            eVar2.h();
        } else {
            eVar2 = null;
        }
        c0Var.f21772h = eVar2;
        b0.o oVar8 = c2745b0.f7167p;
        if (oVar8 == null) {
            oVar8 = x0Var;
        }
        oVar8.f7166o = null;
        c2745b0.f7167p = null;
        c2745b0.f7165n = -1;
        c2745b0.f7169r = null;
        if (oVar8 == c2745b0) {
            AbstractC2540a.b("trimChain did not update the head");
        }
        c0Var.f = oVar8;
        if (z3) {
            c0Var.g();
        }
        boolean d7 = c0Var.d(16);
        boolean d8 = c0Var.d(1024);
        this.f21613P.j();
        if (this.f21630q == null && c0Var.d(512)) {
            c0(this);
        }
        if (d5 == d7 && d6 == d8) {
            return;
        }
        I0.a rectManager = ((A0.F) AbstractC2734J.a(this)).getRectManager();
        rectManager.getClass();
        if (I()) {
            int i11 = this.f21625l & 67108863;
            B.K k5 = rectManager.f2552a;
            long[] jArr = (long[]) k5.f638c;
            int i12 = k5.f637b;
            for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
                int i14 = i13 + 2;
                long j5 = jArr[i14];
                if ((((int) j5) & 67108863) == i11) {
                    jArr[i14] = ((d7 ? 1L : 0L) * Long.MIN_VALUE) | (4611686018427387903L & j5) | ((d8 ? 1L : 0L) * 4611686018427387904L);
                    return;
                }
            }
        }
    }

    public final void a0(W0.c cVar) {
        if (kotlin.jvm.internal.l.a(this.f21607H, cVar)) {
            return;
        }
        this.f21607H = cVar;
        E();
        C2731G u5 = u();
        if (u5 != null) {
            u5.C();
        }
        D();
        for (b0.o oVar = this.f21612O.f; oVar != null; oVar = oVar.f7167p) {
            oVar.p0();
        }
    }

    public final void b(A0.F f) {
        C2731G c2731g;
        C0533b c0533b;
        H0.j w5;
        if (!(this.f21636w == null)) {
            AbstractC2540a.b("Cannot attach " + this + " as it already is attached.  Tree: " + e(0));
        }
        C2731G c2731g2 = this.f21635v;
        if (c2731g2 != null && !kotlin.jvm.internal.l.a(c2731g2.f21636w, f)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(f);
            sb.append(") than the parent's owner(");
            C2731G u5 = u();
            sb.append(u5 != null ? u5.f21636w : null);
            sb.append("). This tree: ");
            sb.append(e(0));
            sb.append(" Parent tree: ");
            C2731G c2731g3 = this.f21635v;
            sb.append(c2731g3 != null ? c2731g3.e(0) : null);
            AbstractC2540a.b(sb.toString());
        }
        C2731G u6 = u();
        C2735K c2735k = this.f21613P;
        if (u6 == null) {
            c2735k.f21663p.f21733B = true;
            U u7 = c2735k.f21664q;
            if (u7 != null) {
                u7.f21719z = EnumC2741Q.f21693k;
            }
        }
        c0 c0Var = this.f21612O;
        c0Var.f21769d.f21795A = u6 != null ? u6.f21612O.f21768c : null;
        this.f21636w = f;
        this.f21638y = (u6 != null ? u6.f21638y : -1) + 1;
        b0.p pVar = this.f21618U;
        if (pVar != null) {
            a(pVar);
        }
        this.f21618U = null;
        f.getLayoutNodes().g(this.f21625l, this);
        C2731G c2731g4 = this.f21635v;
        if (c2731g4 == null || (c2731g = c2731g4.f21630q) == null) {
            c2731g = this.f21630q;
        }
        c0(c2731g);
        if (this.f21630q == null && c0Var.d(512)) {
            c0(this);
        }
        if (!this.f21623Z) {
            for (b0.o oVar = c0Var.f; oVar != null; oVar = oVar.f7167p) {
                oVar.m0();
            }
        }
        R.e eVar = (R.e) this.f21632s.f1749l;
        Object[] objArr = eVar.f5106k;
        int i = eVar.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            ((C2731G) objArr[i5]).b(f);
        }
        if (!this.f21623Z) {
            c0Var.e();
        }
        E();
        if (u6 != null) {
            u6.E();
        }
        Z0.c cVar = this.f21619V;
        if (cVar != null) {
            cVar.c(f);
        }
        c2735k.j();
        if (!this.f21623Z && c0Var.d(8)) {
            G();
        }
        f.getClass();
        if (!A0.F.g() || (c0533b = f.f217P) == null || (w5 = w()) == null) {
            return;
        }
        if (w5.f2103k.b(H0.s.f2171q)) {
            c0533b.f7383g.a(this.f21625l);
            c0533b.f7378a.l(c0533b.f7380c, this.f21625l, true);
        }
    }

    public final void b0(int i) {
        C2731G u5;
        C2731G u6;
        int i5 = this.f21622Y;
        if (i5 != i) {
            if (i > 0 && i5 == 0 && (u6 = u()) != null) {
                u6.b0(u6.f21622Y + 1);
            }
            if (i == 0 && this.f21622Y > 0 && (u5 = u()) != null) {
                u5.b0(u5.f21622Y - 1);
            }
            this.f21622Y = i;
        }
    }

    public final void c() {
        this.f21610M = this.f21609L;
        this.f21609L = EnumC2729E.f21594m;
        R.e y5 = y();
        Object[] objArr = y5.f5106k;
        int i = y5.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            C2731G c2731g = (C2731G) objArr[i5];
            if (c2731g.f21609L != EnumC2729E.f21594m) {
                c2731g.c();
            }
        }
    }

    public final void c0(C2731G c2731g) {
        if (kotlin.jvm.internal.l.a(c2731g, this.f21630q)) {
            return;
        }
        this.f21630q = c2731g;
        C2735K c2735k = this.f21613P;
        if (c2731g != null) {
            if (c2735k.f21664q == null) {
                c2735k.f21664q = new U(c2735k);
            }
            c0 c0Var = this.f21612O;
            e0 e0Var = c0Var.f21768c.f21813z;
            for (e0 e0Var2 = c0Var.f21769d; !kotlin.jvm.internal.l.a(e0Var2, e0Var) && e0Var2 != null; e0Var2 = e0Var2.f21813z) {
                e0Var2.D0();
            }
        } else {
            c2735k.f21664q = null;
            c2735k.f = false;
            c2735k.f21654e = false;
        }
        E();
    }

    public final void d() {
        this.f21610M = this.f21609L;
        this.f21609L = EnumC2729E.f21594m;
        R.e y5 = y();
        Object[] objArr = y5.f5106k;
        int i = y5.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            C2731G c2731g = (C2731G) objArr[i5];
            if (c2731g.f21609L == EnumC2729E.f21593l) {
                c2731g.d();
            }
        }
    }

    public final void d0(x0.O o5) {
        if (kotlin.jvm.internal.l.a(this.f21605F, o5)) {
            return;
        }
        this.f21605F = o5;
        v3.g gVar = this.f21606G;
        if (gVar != null) {
            ((C0305m0) gVar.f20440m).setValue(o5);
        }
        E();
    }

    public final String e(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < i; i5++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        R.e y5 = y();
        Object[] objArr = y5.f5106k;
        int i6 = y5.f5108m;
        for (int i7 = 0; i7 < i6; i7++) {
            sb.append(((C2731G) objArr[i7]).e(i + 1));
        }
        String sb2 = sb.toString();
        if (i != 0) {
            return sb2;
        }
        String substring = sb2.substring(0, sb2.length() - 1);
        kotlin.jvm.internal.l.e("substring(...)", substring);
        return substring;
    }

    public final void e0(b0.p pVar) {
        if (this.f21624k && this.f21617T != b0.m.f7161k) {
            AbstractC2540a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.f21623Z) {
            AbstractC2540a.a("modifier is updated when deactivated");
        }
        if (!I()) {
            this.f21618U = pVar;
            return;
        }
        a(pVar);
        if (this.f21600A) {
            G();
        }
    }

    public final void f() {
        C0533b c0533b;
        C2732H c2732h;
        A0.F f = this.f21636w;
        if (f == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            C2731G u5 = u();
            sb.append(u5 != null ? u5.e(0) : null);
            AbstractC2540a.c(sb.toString());
            throw new D2.e();
        }
        C2731G u6 = u();
        C2735K c2735k = this.f21613P;
        if (u6 != null) {
            u6.C();
            u6.E();
            Y y5 = c2735k.f21663p;
            EnumC2729E enumC2729E = EnumC2729E.f21594m;
            y5.f21756v = enumC2729E;
            U u7 = c2735k.f21664q;
            if (u7 != null) {
                u7.f21713t = enumC2729E;
            }
        }
        C2732H c2732h2 = c2735k.f21663p.f21738G;
        c2732h2.f21641b = true;
        c2732h2.f21642c = false;
        c2732h2.f21643d = false;
        c2732h2.f21644e = false;
        c2732h2.f = null;
        U u8 = c2735k.f21664q;
        if (u8 != null && (c2732h = u8.f21702A) != null) {
            c2732h.f21641b = true;
            c2732h.f21642c = false;
            c2732h.f21643d = false;
            c2732h.f21644e = false;
            c2732h.f = null;
        }
        c0 c0Var = this.f21612O;
        e0 e0Var = c0Var.f21768c.f21813z;
        for (e0 e0Var2 = c0Var.f21769d; !kotlin.jvm.internal.l.a(e0Var2, e0Var) && e0Var2 != null; e0Var2 = e0Var2.f21813z) {
            e0Var2.a1();
        }
        Z0.d dVar = this.f21620W;
        if (dVar != null) {
            dVar.c(f);
        }
        b0.o oVar = c0Var.f21770e;
        for (b0.o oVar2 = oVar; oVar2 != null; oVar2 = oVar2.f7166o) {
            if (oVar2.f7175x) {
                oVar2.v0();
            }
        }
        this.f21639z = true;
        R.e eVar = (R.e) this.f21632s.f1749l;
        Object[] objArr = eVar.f5106k;
        int i = eVar.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            ((C2731G) objArr[i5]).f();
        }
        this.f21639z = false;
        while (oVar != null) {
            if (oVar.f7175x) {
                oVar.n0();
            }
            oVar = oVar.f7166o;
        }
        f.getLayoutNodes().f(this.f21625l);
        W w5 = f.f228b0;
        v3.e eVar2 = w5.f21724b;
        ((C2138i) eVar2.f20432l).h(this);
        ((C2138i) eVar2.f20433m).h(this);
        ((C2138i) eVar2.f20434n).h(this);
        ((R.e) w5.f21727e.f20439l).k(this);
        f.f219Q = true;
        f.getRectManager().j(this);
        if (A0.F.g() && (c0533b = f.f217P) != null) {
            if (c0533b.f7383g.e(this.f21625l)) {
                c0533b.f7378a.l(c0533b.f7380c, this.f21625l, false);
            }
        }
        this.f21636w = null;
        this.f21626m = 9223372034707292159L;
        c0(null);
        this.f21638y = 0;
        Y y6 = c2735k.f21663p;
        y6.f21753s = Integer.MAX_VALUE;
        y6.f21752r = Integer.MAX_VALUE;
        y6.f21733B = false;
        U u9 = c2735k.f21664q;
        if (u9 != null) {
            u9.f21712s = Integer.MAX_VALUE;
            u9.f21711r = Integer.MAX_VALUE;
            u9.f21719z = EnumC2741Q.f21695m;
        }
        if (c0Var.d(8)) {
            H0.j jVar = this.f21601B;
            this.f21601B = null;
            this.f21600A = false;
            f.getSemanticsOwner().b(this, jVar);
            f.E();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [R.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [R.e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void f0(q1 q1Var) {
        if (kotlin.jvm.internal.l.a(this.J, q1Var)) {
            return;
        }
        this.J = q1Var;
        b0.o oVar = this.f21612O.f;
        if ((oVar.f7165n & 16) != 0) {
            while (oVar != null) {
                if ((oVar.f7164m & 16) != 0) {
                    AbstractC2756m abstractC2756m = oVar;
                    ?? r32 = 0;
                    while (abstractC2756m != 0) {
                        if (abstractC2756m instanceof s0) {
                            ((s0) abstractC2756m).U();
                        } else if ((abstractC2756m.f7164m & 16) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                            b0.o oVar2 = abstractC2756m.f21839z;
                            int i = 0;
                            abstractC2756m = abstractC2756m;
                            r32 = r32;
                            while (oVar2 != null) {
                                if ((oVar2.f7164m & 16) != 0) {
                                    i++;
                                    r32 = r32;
                                    if (i == 1) {
                                        abstractC2756m = oVar2;
                                    } else {
                                        if (r32 == 0) {
                                            r32 = new R.e(new b0.o[16]);
                                        }
                                        if (abstractC2756m != 0) {
                                            r32.c(abstractC2756m);
                                            abstractC2756m = 0;
                                        }
                                        r32.c(oVar2);
                                    }
                                }
                                oVar2 = oVar2.f7167p;
                                abstractC2756m = abstractC2756m;
                                r32 = r32;
                            }
                            if (i == 1) {
                            }
                        }
                        abstractC2756m = AbstractC2749f.f(r32);
                    }
                }
                if ((oVar.f7165n & 16) == 0) {
                    return;
                } else {
                    oVar = oVar.f7167p;
                }
            }
        }
    }

    @Override // P.InterfaceC0298j
    public final void g() {
        Z0.q qVar = this.f21637x;
        if (qVar != null) {
            qVar.g();
        }
        x0.K k5 = this.f21614Q;
        if (k5 != null) {
            k5.g();
        }
        c0 c0Var = this.f21612O;
        e0 e0Var = c0Var.f21768c.f21813z;
        for (e0 e0Var2 = c0Var.f21769d; !kotlin.jvm.internal.l.a(e0Var2, e0Var) && e0Var2 != null; e0Var2 = e0Var2.f21813z) {
            e0Var2.V0();
        }
    }

    public final void g0() {
        if (this.f21631r <= 0 || !this.f21634u) {
            return;
        }
        this.f21634u = false;
        R.e eVar = this.f21633t;
        if (eVar == null) {
            eVar = new R.e(new C2731G[16]);
            this.f21633t = eVar;
        }
        eVar.h();
        R.e eVar2 = (R.e) this.f21632s.f1749l;
        Object[] objArr = eVar2.f5106k;
        int i = eVar2.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            C2731G c2731g = (C2731G) objArr[i5];
            if (c2731g.f21624k) {
                eVar.d(eVar.f5108m, c2731g.y());
            } else {
                eVar.c(c2731g);
            }
        }
        C2735K c2735k = this.f21613P;
        c2735k.f21663p.f21740I = true;
        U u5 = c2735k.f21664q;
        if (u5 != null) {
            u5.f21704C = true;
        }
    }

    @Override // P.InterfaceC0298j
    public final void h() {
        C0533b c0533b;
        Z0.q qVar = this.f21637x;
        if (qVar != null) {
            qVar.h();
        }
        x0.K k5 = this.f21614Q;
        if (k5 != null) {
            k5.c(true);
        }
        this.f21623Z = true;
        c0 c0Var = this.f21612O;
        for (b0.o oVar = c0Var.f21770e; oVar != null; oVar = oVar.f7166o) {
            if (oVar.f7175x) {
                oVar.t0();
            }
        }
        b0.o oVar2 = c0Var.f21770e;
        for (b0.o oVar3 = oVar2; oVar3 != null; oVar3 = oVar3.f7166o) {
            if (oVar3.f7175x) {
                oVar3.v0();
            }
        }
        while (oVar2 != null) {
            if (oVar2.f7175x) {
                oVar2.n0();
            }
            oVar2 = oVar2.f7166o;
        }
        if (I()) {
            this.f21601B = null;
            this.f21600A = false;
        }
        A0.F f = this.f21636w;
        if (f != null) {
            f.getRectManager().j(this);
            if (!A0.F.g() || (c0533b = f.f217P) == null) {
                return;
            }
            if (c0533b.f7383g.e(this.f21625l)) {
                c0533b.f7378a.l(c0533b.f7380c, this.f21625l, false);
            }
        }
    }

    public final void i(InterfaceC2009n interfaceC2009n, C2041b c2041b) {
        try {
            this.f21612O.f21769d.B0(interfaceC2009n, c2041b);
        } catch (Throwable th) {
            Z(th);
            throw null;
        }
    }

    public final void k() {
        if (this.f21630q != null) {
            U(this, false, 5);
        } else {
            W(this, false, 5);
        }
        Y y5 = this.f21613P.f21663p;
        W0.a aVar = y5.f21754t ? new W0.a(y5.f20976n) : null;
        if (aVar != null) {
            A0.F f = this.f21636w;
            if (f != null) {
                f.y(this, aVar.f6000a);
                return;
            }
            return;
        }
        A0.F f5 = this.f21636w;
        if (f5 != null) {
            f5.x(true);
        }
    }

    public final List l() {
        U u5 = this.f21613P.f21664q;
        kotlin.jvm.internal.l.c(u5);
        C2735K c2735k = u5.f21709p;
        c2735k.f21650a.n();
        boolean z3 = u5.f21704C;
        R.e eVar = u5.f21703B;
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
                U u6 = c2731g2.f21613P.f21664q;
                kotlin.jvm.internal.l.c(u6);
                eVar.c(u6);
            } else {
                U u7 = c2731g2.f21613P.f21664q;
                kotlin.jvm.internal.l.c(u7);
                Object[] objArr2 = eVar.f5106k;
                Object obj = objArr2[i5];
                objArr2[i5] = u7;
            }
        }
        eVar.m(((R.b) c2731g.n()).f5100k.f5108m, eVar.f5108m);
        u5.f21704C = false;
        return eVar.g();
    }

    public final List m() {
        return this.f21613P.f21663p.f0();
    }

    public final List n() {
        return y().g();
    }

    public final List o() {
        return ((R.e) this.f21632s.f1749l).g();
    }

    public final boolean p() {
        return this.f21613P.f21663p.f21736E;
    }

    public final boolean q() {
        return this.f21613P.f21663p.f21735D;
    }

    public final EnumC2729E r() {
        return this.f21613P.f21663p.f21756v;
    }

    public final EnumC2729E s() {
        EnumC2729E enumC2729E;
        U u5 = this.f21613P.f21664q;
        return (u5 == null || (enumC2729E = u5.f21713t) == null) ? EnumC2729E.f21594m : enumC2729E;
    }

    public final v3.g t() {
        v3.g gVar = this.f21606G;
        if (gVar != null) {
            return gVar;
        }
        v3.g gVar2 = new v3.g(this, this.f21605F);
        this.f21606G = gVar2;
        return gVar2;
    }

    public final String toString() {
        return A0.Z.D(this) + " children: " + ((R.b) n()).f5100k.f5108m + " measurePolicy: " + this.f21605F + " deactivated: " + this.f21623Z;
    }

    public final C2731G u() {
        C2731G c2731g = this.f21635v;
        while (c2731g != null && c2731g.f21624k) {
            c2731g = c2731g.f21635v;
        }
        return c2731g;
    }

    public final int v() {
        return this.f21613P.f21663p.f21753s;
    }

    public final H0.j w() {
        if (I() && !this.f21623Z && this.f21612O.d(8)) {
            return this.f21601B;
        }
        return null;
    }

    public final R.e x() {
        boolean z3 = this.f21604E;
        R.e eVar = this.f21603D;
        if (z3) {
            eVar.h();
            eVar.d(eVar.f5108m, y());
            X3.l.I0(eVar.f5106k, f21599c0, 0, eVar.f5108m);
            this.f21604E = false;
        }
        return eVar;
    }

    public final R.e y() {
        g0();
        if (this.f21631r == 0) {
            return (R.e) this.f21632s.f1749l;
        }
        R.e eVar = this.f21633t;
        kotlin.jvm.internal.l.c(eVar);
        return eVar;
    }

    @Override // z0.o0
    public final boolean z() {
        return I();
    }

    public C2731G(int i, boolean z3) {
        this.f21624k = z3;
        this.f21625l = i;
        this.f21626m = 9223372034707292159L;
        this.f21627n = 0L;
        this.f21628o = 9223372034707292159L;
        this.f21629p = true;
        this.f21632s = new G.v(24, new R.e(new C2731G[16]), new x0.J(5, this));
        this.f21603D = new R.e(new C2731G[16]);
        this.f21604E = true;
        this.f21605F = f21597a0;
        this.f21607H = AbstractC2734J.f21649a;
        this.f21608I = W0.m.f6016k;
        this.J = f21598b0;
        P.B.f4248a.getClass();
        this.K = P.A.f4246b;
        EnumC2729E enumC2729E = EnumC2729E.f21594m;
        this.f21609L = enumC2729E;
        this.f21610M = enumC2729E;
        this.f21612O = new c0(this);
        this.f21613P = new C2735K(this);
        this.f21616S = true;
        this.f21617T = b0.m.f7161k;
    }
}
