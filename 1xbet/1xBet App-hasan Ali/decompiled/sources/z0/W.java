package z0;

import n.C2138i;
import w0.AbstractC2540a;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final C2731G f21723a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21725c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21726d;
    public W0.a i;

    /* renamed from: b, reason: collision with root package name */
    public final v3.e f21724b = new v3.e(26);

    /* renamed from: e, reason: collision with root package name */
    public final v3.g f21727e = new v3.g(25);
    public final R.e f = new R.e(new C2731G[16]);

    /* renamed from: g, reason: collision with root package name */
    public final long f21728g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final R.e f21729h = new R.e(new V[16]);

    public W(C2731G c2731g) {
        this.f21723a = c2731g;
    }

    public static boolean b(C2731G c2731g, W0.a aVar) {
        boolean n02;
        C2731G c2731g2 = c2731g.f21630q;
        if (c2731g2 == null) {
            return false;
        }
        C2735K c2735k = c2731g.f21613P;
        if (aVar != null) {
            if (c2731g2 != null) {
                U u5 = c2735k.f21664q;
                kotlin.jvm.internal.l.c(u5);
                n02 = u5.n0(aVar.f6000a);
            }
            n02 = false;
        } else {
            U u6 = c2735k.f21664q;
            W0.a aVar2 = u6 != null ? u6.f21716w : null;
            if (aVar2 != null && c2731g2 != null) {
                kotlin.jvm.internal.l.c(u6);
                n02 = u6.n0(aVar2.f6000a);
            }
            n02 = false;
        }
        C2731G u7 = c2731g.u();
        if (n02 && u7 != null) {
            if (u7.f21630q == null) {
                C2731G.W(u7, false, 3);
                return n02;
            }
            if (c2731g.s() == EnumC2729E.f21592k) {
                C2731G.U(u7, false, 3);
                return n02;
            }
            if (c2731g.s() == EnumC2729E.f21593l) {
                u7.T(false);
            }
        }
        return n02;
    }

    public static boolean c(C2731G c2731g, W0.a aVar) {
        boolean z3;
        if (aVar != null) {
            if (c2731g.f21609L == EnumC2729E.f21594m) {
                c2731g.c();
            }
            z3 = c2731g.f21613P.f21663p.p0(aVar.f6000a);
        } else {
            Y y5 = c2731g.f21613P.f21663p;
            W0.a aVar2 = y5.f21754t ? new W0.a(y5.f20976n) : null;
            if (aVar2 != null) {
                if (c2731g.f21609L == EnumC2729E.f21594m) {
                    c2731g.c();
                }
                z3 = c2731g.f21613P.f21663p.p0(aVar2.f6000a);
            } else {
                c2731g.getClass();
                z3 = false;
            }
        }
        C2731G u5 = c2731g.u();
        if (z3 && u5 != null) {
            if (c2731g.r() == EnumC2729E.f21592k) {
                C2731G.W(u5, false, 3);
                return z3;
            }
            if (c2731g.r() == EnumC2729E.f21593l) {
                u5.V(false);
            }
        }
        return z3;
    }

    public static boolean h(C2731G c2731g) {
        U u5;
        C2732H c2732h;
        if (c2731g.f21613P.f21654e) {
            return (c2731g.s() == EnumC2729E.f21594m && ((u5 = c2731g.f21613P.f21664q) == null || (c2732h = u5.f21702A) == null || !c2732h.e())) ? false : true;
        }
        return false;
    }

    public static boolean i(C2731G c2731g) {
        if (!c2731g.q()) {
            return false;
        }
        do {
            if (c2731g.r() == EnumC2729E.f21594m && !c2731g.f21613P.f21663p.f21738G.e()) {
                C2731G u5 = c2731g.u();
                if ((u5 != null ? u5.f21613P.f21653d : null) != EnumC2727C.f21585k) {
                    return false;
                }
            }
            c2731g = c2731g.u();
            if (c2731g == null) {
                return false;
            }
        } while (!c2731g.J());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r4 < r2) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z3) {
        Object[] objArr;
        v3.g gVar = this.f21727e;
        if (z3) {
            gVar.getClass();
            C2731G c2731g = this.f21723a;
            if (c2731g.f21622Y > 0) {
                R.e eVar = (R.e) gVar.f20439l;
                eVar.h();
                eVar.c(c2731g);
                c2731g.f21621X = true;
            }
        }
        R.e eVar2 = (R.e) gVar.f20439l;
        int i = eVar2.f5108m;
        if (i != 0) {
            X3.l.I0(eVar2.f5106k, k0.f21836l, 0, i);
            int i5 = eVar2.f5108m;
            C2731G[] c2731gArr = (C2731G[]) gVar.f20440m;
            if (c2731gArr != null) {
                int length = c2731gArr.length;
                objArr = c2731gArr;
            }
            objArr = new C2731G[Math.max(16, i5)];
            gVar.f20440m = null;
            for (int i6 = 0; i6 < i5; i6++) {
                objArr[i6] = eVar2.f5106k[i6];
            }
            eVar2.h();
            for (int i7 = i5 - 1; -1 < i7; i7--) {
                C2731G c2731g2 = objArr[i7];
                kotlin.jvm.internal.l.c(c2731g2);
                if (c2731g2.f21621X) {
                    v3.g.v(c2731g2);
                }
                objArr[i7] = 0;
            }
            gVar.f20440m = objArr;
        }
    }

    public final void d() {
        R.e eVar = this.f21729h;
        int i = eVar.f5108m;
        if (i != 0) {
            Object[] objArr = eVar.f5106k;
            for (int i5 = 0; i5 < i; i5++) {
                V v4 = (V) objArr[i5];
                if (v4.f21720a.I()) {
                    boolean z3 = v4.f21721b;
                    boolean z5 = v4.f21722c;
                    C2731G c2731g = v4.f21720a;
                    if (z3) {
                        C2731G.U(c2731g, z5, 2);
                    } else {
                        C2731G.W(c2731g, z5, 2);
                    }
                }
            }
            eVar.h();
        }
    }

    public final void e(C2731G c2731g) {
        R.e y5 = c2731g.y();
        Object[] objArr = y5.f5106k;
        int i = y5.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            C2731G c2731g2 = (C2731G) objArr[i5];
            if (kotlin.jvm.internal.l.a(c2731g2.K(), Boolean.TRUE) && !c2731g2.f21623Z) {
                if (this.f21724b.r(c2731g2)) {
                    c2731g2.L();
                }
                e(c2731g2);
            }
        }
    }

    public final void f(C2731G c2731g, boolean z3) {
        if (!this.f21725c) {
            AbstractC2540a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z3 ? c2731g.f21613P.f21654e : c2731g.q()) {
            AbstractC2540a.a("node not yet measured");
        }
        g(c2731g, z3);
    }

    public final void g(C2731G c2731g, boolean z3) {
        U u5;
        C2732H c2732h;
        R.e y5 = c2731g.y();
        Object[] objArr = y5.f5106k;
        int i = y5.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            C2731G c2731g2 = (C2731G) objArr[i5];
            EnumC2729E enumC2729E = EnumC2729E.f21592k;
            if ((!z3 && (c2731g2.r() == enumC2729E || c2731g2.f21613P.f21663p.f21738G.e())) || (z3 && (c2731g2.s() == enumC2729E || ((u5 = c2731g2.f21613P.f21664q) != null && (c2732h = u5.f21702A) != null && c2732h.e())))) {
                boolean r5 = AbstractC2749f.r(c2731g2);
                C2735K c2735k = c2731g2.f21613P;
                if (r5 && !z3) {
                    if (c2735k.f21654e && this.f21724b.r(c2731g2)) {
                        m(c2731g2, true, false);
                    } else {
                        f(c2731g2, true);
                    }
                }
                if (z3 ? c2735k.f21654e : c2731g2.q()) {
                    m(c2731g2, z3, false);
                }
                if (!(z3 ? c2735k.f21654e : c2731g2.q())) {
                    g(c2731g2, z3);
                }
            }
        }
        if (z3 ? c2731g.f21613P.f21654e : c2731g.q()) {
            m(c2731g, z3, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2, types: [b0.o] */
    public final boolean j(A0.B b3) {
        boolean z3;
        b0.o oVar;
        b0.o oVar2;
        boolean z5;
        C2731G c2731g;
        boolean z6;
        v3.e eVar = this.f21724b;
        C2731G c2731g2 = this.f21723a;
        if (!c2731g2.I()) {
            AbstractC2540a.a("performMeasureAndLayout called with unattached root");
        }
        if (!c2731g2.J()) {
            AbstractC2540a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f21725c) {
            AbstractC2540a.a("performMeasureAndLayout called during measure layout");
        }
        int i = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        if (this.i != null) {
            this.f21725c = true;
            this.f21726d = true;
            try {
                boolean E5 = eVar.E();
                C2138i c2138i = (C2138i) eVar.f20432l;
                if (E5) {
                    z3 = false;
                    while (true) {
                        C2138i c2138i2 = (C2138i) eVar.f20434n;
                        C2138i c2138i3 = (C2138i) eVar.f20433m;
                        if (!((w0) c2138i.f18249l).isEmpty()) {
                            c2731g = (C2731G) ((w0) c2138i.f18249l).first();
                            c2138i.h(c2731g);
                            z6 = c2731g.f21630q != null;
                            z5 = false;
                        } else if (!((w0) c2138i3.f18249l).isEmpty()) {
                            c2731g = (C2731G) ((w0) c2138i3.f18249l).first();
                            c2138i3.h(c2731g);
                            z6 = c2731g.f21630q != null;
                            z5 = true;
                        } else {
                            if (((w0) c2138i2.f18249l).isEmpty()) {
                                break;
                            }
                            C2731G c2731g3 = (C2731G) ((w0) c2138i2.f18249l).first();
                            c2138i2.h(c2731g3);
                            z5 = true;
                            c2731g = c2731g3;
                            z6 = false;
                        }
                        boolean m5 = m(c2731g, z6, z5);
                        if (!z5) {
                            if (c2731g.f21613P.f) {
                                eVar.n(c2731g, EnumC2762t.f21859l);
                            }
                            if (c2731g.p()) {
                                eVar.n(c2731g, EnumC2762t.f21861n);
                            }
                        }
                        if (c2731g == c2731g2 && m5) {
                            z3 = true;
                        }
                    }
                    if (b3 != null) {
                        b3.invoke();
                    }
                } else {
                    z3 = false;
                }
            } finally {
            }
        } else {
            z3 = false;
        }
        R.e eVar2 = this.f;
        Object[] objArr = eVar2.f5106k;
        int i5 = eVar2.f5108m;
        int i6 = 0;
        while (i6 < i5) {
            c0 c0Var = ((C2731G) objArr[i6]).f21612O;
            C2761s c2761s = c0Var.f21768c;
            boolean g5 = f0.g(128);
            if (g5) {
                oVar = c2761s.f21856Y;
            } else {
                oVar = c2761s.f21856Y.f7166o;
                if (oVar == null) {
                    i6++;
                    i = 0;
                }
            }
            i0.G g6 = e0.f21790T;
            b0.o K02 = c2761s.K0(g5);
            while (K02 != null && (K02.f7165n & 128) != 0) {
                if ((K02.f7164m & 128) != 0) {
                    AbstractC2756m abstractC2756m = K02;
                    R.e eVar3 = null;
                    while (abstractC2756m != 0) {
                        if (abstractC2756m instanceof InterfaceC2764v) {
                            ((InterfaceC2764v) abstractC2756m).u(c0Var.f21768c);
                        } else if ((abstractC2756m.f7164m & 128) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                            b0.o oVar3 = abstractC2756m.f21839z;
                            oVar2 = abstractC2756m;
                            eVar3 = eVar3;
                            while (oVar3 != null) {
                                if ((oVar3.f7164m & 128) != 0) {
                                    i++;
                                    eVar3 = eVar3;
                                    if (i == 1) {
                                        oVar2 = oVar3;
                                    } else {
                                        if (eVar3 == null) {
                                            eVar3 = new R.e(new b0.o[16]);
                                        }
                                        if (oVar2 != null) {
                                            eVar3.c(oVar2);
                                            oVar2 = null;
                                        }
                                        eVar3.c(oVar3);
                                    }
                                }
                                oVar3 = oVar3.f7167p;
                                oVar2 = oVar2;
                                eVar3 = eVar3;
                            }
                            if (i == 1) {
                                i = 0;
                                abstractC2756m = oVar2;
                                eVar3 = eVar3;
                            }
                        }
                        oVar2 = AbstractC2749f.f(eVar3);
                        i = 0;
                        abstractC2756m = oVar2;
                        eVar3 = eVar3;
                    }
                }
                if (K02 != oVar) {
                    K02 = K02.f7167p;
                    i = 0;
                }
            }
            i6++;
            i = 0;
        }
        eVar2.h();
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, z0.G] */
    public final void k(C2731G c2731g, long j5) {
        b0.o oVar;
        b0.o oVar2;
        if (c2731g.f21623Z) {
            return;
        }
        C2731G c2731g2 = this.f21723a;
        if (c2731g.equals(c2731g2)) {
            AbstractC2540a.a("measureAndLayout called on root");
        }
        if (!c2731g2.I()) {
            AbstractC2540a.a("performMeasureAndLayout called with unattached root");
        }
        if (!c2731g2.J()) {
            AbstractC2540a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f21725c) {
            AbstractC2540a.a("performMeasureAndLayout called during measure layout");
        }
        boolean z3 = false;
        if (this.i != null) {
            this.f21725c = true;
            this.f21726d = false;
            try {
                v3.e eVar = this.f21724b;
                ((C2138i) eVar.f20432l).h(c2731g);
                ((C2138i) eVar.f20433m).h(c2731g);
                ((C2138i) eVar.f20434n).h(c2731g);
                boolean b3 = b(c2731g, new W0.a(j5));
                C2735K c2735k = c2731g.f21613P;
                if ((b3 || c2735k.f) && kotlin.jvm.internal.l.a(c2731g.K(), Boolean.TRUE)) {
                    c2731g.L();
                }
                e(c2731g);
                if (c2731g.f21609L == EnumC2729E.f21594m) {
                    c2731g.c();
                }
                boolean p02 = c2735k.f21663p.p0(j5);
                C2731G u5 = c2731g.u();
                if (p02 && u5 != null) {
                    if (c2731g.r() == EnumC2729E.f21592k) {
                        C2731G.W(u5, false, 3);
                    } else if (c2731g.r() == EnumC2729E.f21593l) {
                        u5.V(false);
                    }
                }
                if (c2731g.p() && c2731g.J()) {
                    c2731g.S();
                    v3.g gVar = this.f21727e;
                    gVar.getClass();
                    if (c2731g.f21622Y > 0) {
                        ((R.e) gVar.f20439l).c(c2731g);
                        c2731g.f21621X = true;
                    }
                }
                d();
            } finally {
            }
        }
        R.e eVar2 = this.f;
        Object[] objArr = eVar2.f5106k;
        int i = eVar2.f5108m;
        int i5 = 0;
        while (i5 < i) {
            c0 c0Var = ((C2731G) objArr[i5]).f21612O;
            C2761s c2761s = c0Var.f21768c;
            boolean g5 = f0.g(128);
            if (g5) {
                oVar = c2761s.f21856Y;
            } else {
                oVar = c2761s.f21856Y.f7166o;
                if (oVar == null) {
                    i5++;
                    z3 = false;
                }
            }
            i0.G g6 = e0.f21790T;
            b0.o K02 = c2761s.K0(g5);
            while (K02 != null && (K02.f7165n & 128) != 0) {
                if ((K02.f7164m & 128) != 0) {
                    AbstractC2756m abstractC2756m = K02;
                    R.e eVar3 = null;
                    while (abstractC2756m != 0) {
                        if (abstractC2756m instanceof InterfaceC2764v) {
                            ((InterfaceC2764v) abstractC2756m).u(c0Var.f21768c);
                        } else if ((abstractC2756m.f7164m & 128) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                            b0.o oVar3 = abstractC2756m.f21839z;
                            ?? r15 = z3;
                            oVar2 = abstractC2756m;
                            eVar3 = eVar3;
                            while (oVar3 != null) {
                                if ((oVar3.f7164m & 128) != 0) {
                                    r15++;
                                    eVar3 = eVar3;
                                    if (r15 == 1) {
                                        oVar2 = oVar3;
                                    } else {
                                        if (eVar3 == null) {
                                            eVar3 = new R.e(new b0.o[16]);
                                        }
                                        if (oVar2 != null) {
                                            eVar3.c(oVar2);
                                            oVar2 = null;
                                        }
                                        eVar3.c(oVar3);
                                    }
                                }
                                oVar3 = oVar3.f7167p;
                                oVar2 = oVar2;
                                eVar3 = eVar3;
                                r15 = r15;
                            }
                            if (r15 == 1) {
                                z3 = false;
                                abstractC2756m = oVar2;
                                eVar3 = eVar3;
                            }
                        }
                        oVar2 = AbstractC2749f.f(eVar3);
                        z3 = false;
                        abstractC2756m = oVar2;
                        eVar3 = eVar3;
                    }
                }
                if (K02 != oVar) {
                    K02 = K02.f7167p;
                    z3 = false;
                }
            }
            i5++;
            z3 = false;
        }
        eVar2.h();
    }

    public final void l() {
        v3.e eVar = this.f21724b;
        if (eVar.E()) {
            C2731G c2731g = this.f21723a;
            if (!c2731g.I()) {
                AbstractC2540a.a("performMeasureAndLayout called with unattached root");
            }
            if (!c2731g.J()) {
                AbstractC2540a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f21725c) {
                AbstractC2540a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.f21725c = true;
                this.f21726d = false;
                try {
                    if (!((w0) ((C2138i) eVar.f20434n).f18249l).isEmpty() && !((w0) ((C2138i) eVar.f20432l).f18249l).isEmpty()) {
                        if (c2731g.f21630q != null) {
                            o(c2731g, true);
                        } else {
                            n(c2731g);
                        }
                    }
                    o(c2731g, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.f21725c = false;
                        this.f21726d = false;
                    }
                }
            }
        }
    }

    public final boolean m(C2731G c2731g, boolean z3, boolean z5) {
        W0.a aVar;
        boolean z6;
        x0.Y placementScope;
        C2761s c2761s;
        C2731G u5;
        U u6;
        C2732H c2732h;
        if (!c2731g.f21623Z) {
            boolean J = c2731g.J();
            C2735K c2735k = c2731g.f21613P;
            if (J || c2735k.f21663p.f21734C || i(c2731g) || kotlin.jvm.internal.l.a(c2731g.K(), Boolean.TRUE) || h(c2731g) || c2735k.f21663p.f21738G.e() || ((u6 = c2735k.f21664q) != null && (c2732h = u6.f21702A) != null && c2732h.e())) {
                C2731G c2731g2 = this.f21723a;
                if (c2731g == c2731g2) {
                    aVar = this.i;
                    kotlin.jvm.internal.l.c(aVar);
                } else {
                    aVar = null;
                }
                if (z3) {
                    z6 = c2735k.f21654e ? b(c2731g, aVar) : false;
                    if (z5 && ((z6 || c2735k.f) && kotlin.jvm.internal.l.a(c2731g.K(), Boolean.TRUE))) {
                        c2731g.L();
                    }
                } else {
                    boolean c5 = c2731g.q() ? c(c2731g, aVar) : false;
                    if (z5 && c2731g.p() && (c2731g == c2731g2 || ((u5 = c2731g.u()) != null && u5.J() && c2735k.f21663p.f21734C))) {
                        if (c2731g == c2731g2) {
                            if (c2731g.f21609L == EnumC2729E.f21594m) {
                                c2731g.d();
                            }
                            C2731G u7 = c2731g.u();
                            if (u7 == null || (c2761s = u7.f21612O.f21768c) == null || (placementScope = c2761s.f21684v) == null) {
                                placementScope = ((A0.F) AbstractC2734J.a(c2731g)).getPlacementScope();
                            }
                            x0.Y.j(placementScope, c2735k.f21663p, 0, 0);
                        } else {
                            c2731g.S();
                        }
                        v3.g gVar = this.f21727e;
                        gVar.getClass();
                        if (c2731g.f21622Y > 0) {
                            ((R.e) gVar.f20439l).c(c2731g);
                            c2731g.f21621X = true;
                        }
                        ((A0.F) AbstractC2734J.a(c2731g)).getRectManager().e(c2731g);
                    }
                    z6 = c5;
                }
                d();
                return z6;
            }
        }
        return false;
    }

    public final void n(C2731G c2731g) {
        R.e y5 = c2731g.y();
        Object[] objArr = y5.f5106k;
        int i = y5.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            C2731G c2731g2 = (C2731G) objArr[i5];
            if (c2731g2.r() == EnumC2729E.f21592k || c2731g2.f21613P.f21663p.f21738G.e()) {
                if (AbstractC2749f.r(c2731g2)) {
                    o(c2731g2, true);
                } else {
                    n(c2731g2);
                }
            }
        }
    }

    public final void o(C2731G c2731g, boolean z3) {
        W0.a aVar;
        if (c2731g.f21623Z) {
            return;
        }
        if (c2731g == this.f21723a) {
            aVar = this.i;
            kotlin.jvm.internal.l.c(aVar);
        } else {
            aVar = null;
        }
        if (z3) {
            b(c2731g, aVar);
        } else {
            c(c2731g, aVar);
        }
    }

    public final boolean p(C2731G c2731g, boolean z3) {
        int ordinal = c2731g.f21613P.f21653d.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 || ordinal == 3) {
                this.f21729h.c(new V(c2731g, false, z3));
            } else {
                if (ordinal != 4) {
                    throw new D2.e();
                }
                if (!c2731g.q() || z3) {
                    c2731g.f21613P.f21663p.f21735D = true;
                    if (!c2731g.f21623Z && (c2731g.J() || i(c2731g))) {
                        C2731G u5 = c2731g.u();
                        if (u5 == null || !u5.q()) {
                            this.f21724b.n(c2731g, EnumC2762t.f21860m);
                        }
                        if (!this.f21726d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void q(long j5) {
        W0.a aVar = this.i;
        if (aVar == null ? false : W0.a.b(aVar.f6000a, j5)) {
            return;
        }
        if (this.f21725c) {
            AbstractC2540a.a("updateRootConstraints called while measuring");
        }
        this.i = new W0.a(j5);
        C2731G c2731g = this.f21723a;
        C2731G c2731g2 = c2731g.f21630q;
        C2735K c2735k = c2731g.f21613P;
        if (c2731g2 != null) {
            c2735k.f21654e = true;
        }
        c2735k.f21663p.f21735D = true;
        this.f21724b.n(c2731g, c2731g2 != null ? EnumC2762t.f21858k : EnumC2762t.f21860m);
    }
}
