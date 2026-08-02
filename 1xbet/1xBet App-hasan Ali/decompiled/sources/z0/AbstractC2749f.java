package z0;

import P.AbstractC0320u0;
import P.AbstractC0329z;
import a3.AbstractC0467k;
import android.view.View;
import i4.InterfaceC2015a;
import w0.AbstractC2540a;
import x0.C2628n;

/* renamed from: z0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2749f {

    /* renamed from: a, reason: collision with root package name */
    public static final k0 f21814a = new k0(1);

    public static final long a(float f, boolean z3, boolean z5) {
        return (((z3 ? 1L : 0L) | (z5 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void b(R.e eVar, b0.o oVar) {
        R.e y5 = v(oVar).y();
        int i = y5.f5108m - 1;
        Object[] objArr = y5.f5106k;
        if (i < objArr.length) {
            while (i >= 0) {
                eVar.c(((C2731G) objArr[i]).f21612O.f);
                i--;
            }
        }
    }

    public static final int c(AbstractC2739O abstractC2739O, C2628n c2628n) {
        AbstractC2739O m02 = abstractC2739O.m0();
        if (m02 == null) {
            AbstractC2540a.b("Child of " + abstractC2739O + " cannot be null when calculating alignment line");
        }
        if (abstractC2739O.q0().a().containsKey(c2628n)) {
            Integer num = (Integer) abstractC2739O.q0().a().get(c2628n);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int l02 = m02.l0(c2628n);
            if (l02 != Integer.MIN_VALUE) {
                m02.f21682t = true;
                abstractC2739O.f21683u = true;
                abstractC2739O.w0();
                m02.f21682t = false;
                abstractC2739O.f21683u = false;
                return c2628n instanceof C2628n ? l02 + ((int) (m02.s0() & 4294967295L)) : l02 + ((int) (m02.s0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final boolean d(C2746c c2746c) {
        x0 x0Var = v(c2746c).f21612O.f21770e;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode", x0Var);
        return x0Var.f21869y;
    }

    public static final b0.o e(InterfaceC2755l interfaceC2755l, int i) {
        b0.o oVar = ((b0.o) interfaceC2755l).f7162k.f7167p;
        if (oVar == null || (oVar.f7165n & i) == 0) {
            return null;
        }
        while (oVar != null) {
            int i5 = oVar.f7164m;
            if ((i5 & 2) != 0) {
                return null;
            }
            if ((i5 & i) != 0) {
                return oVar;
            }
            oVar = oVar.f7167p;
        }
        return null;
    }

    public static final b0.o f(R.e eVar) {
        int i;
        if (eVar == null || (i = eVar.f5108m) == 0) {
            return null;
        }
        return (b0.o) eVar.l(i - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC2765w g(b0.o oVar) {
        if ((oVar.f7164m & 2) != 0) {
            if (oVar instanceof InterfaceC2765w) {
                return (InterfaceC2765w) oVar;
            }
            if (oVar instanceof AbstractC2756m) {
                b0.o oVar2 = ((AbstractC2756m) oVar).f21839z;
                while (oVar2 != 0) {
                    if (oVar2 instanceof InterfaceC2765w) {
                        return (InterfaceC2765w) oVar2;
                    }
                    oVar2 = (!(oVar2 instanceof AbstractC2756m) || (oVar2.f7164m & 2) == 0) ? oVar2.f7167p : ((AbstractC2756m) oVar2).f21839z;
                }
            }
        }
        return null;
    }

    public static final int h(long j5, long j6) {
        boolean q5 = q(j5);
        if (q5 != q(j6)) {
            return q5 ? -1 : 1;
        }
        return (Math.min(l(j5), l(j6)) >= 0.0f && p(j5) != p(j6)) ? p(j5) ? -1 : 1 : (int) Math.signum(l(j5) - l(j6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object i(InterfaceC2754k interfaceC2754k, AbstractC0320u0 abstractC0320u0) {
        if (!((b0.o) interfaceC2754k).f7162k.f7175x) {
            AbstractC2540a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        X.i iVar = (X.i) v(interfaceC2754k).K;
        iVar.getClass();
        return AbstractC0329z.u(iVar, abstractC0320u0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [R.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [R.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final A0 j(InterfaceC2755l interfaceC2755l, Object obj) {
        c0 c0Var;
        b0.o oVar = (b0.o) interfaceC2755l;
        if (!oVar.f7162k.f7175x) {
            AbstractC2540a.b("visitAncestors called on an unattached node");
        }
        b0.o oVar2 = oVar.f7162k.f7166o;
        C2731G v4 = v(interfaceC2755l);
        while (v4 != null) {
            if ((v4.f21612O.f.f7165n & 262144) != 0) {
                while (oVar2 != null) {
                    if ((oVar2.f7164m & 262144) != 0) {
                        AbstractC2756m abstractC2756m = oVar2;
                        ?? r42 = 0;
                        while (abstractC2756m != 0) {
                            if (abstractC2756m instanceof A0) {
                                A0 a02 = (A0) abstractC2756m;
                                if (obj.equals(a02.o())) {
                                    return a02;
                                }
                            } else if ((abstractC2756m.f7164m & 262144) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                                b0.o oVar3 = abstractC2756m.f21839z;
                                int i = 0;
                                abstractC2756m = abstractC2756m;
                                r42 = r42;
                                while (oVar3 != null) {
                                    if ((oVar3.f7164m & 262144) != 0) {
                                        i++;
                                        r42 = r42;
                                        if (i == 1) {
                                            abstractC2756m = oVar3;
                                        } else {
                                            if (r42 == 0) {
                                                r42 = new R.e(new b0.o[16]);
                                            }
                                            if (abstractC2756m != 0) {
                                                r42.c(abstractC2756m);
                                                abstractC2756m = 0;
                                            }
                                            r42.c(oVar3);
                                        }
                                    }
                                    oVar3 = oVar3.f7167p;
                                    abstractC2756m = abstractC2756m;
                                    r42 = r42;
                                }
                                if (i == 1) {
                                }
                            }
                            abstractC2756m = f(r42);
                        }
                    }
                    oVar2 = oVar2.f7166o;
                }
            }
            v4 = v4.u();
            oVar2 = (v4 == null || (c0Var = v4.f21612O) == null) ? null : c0Var.f21770e;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, z0.A0, z0.l] */
    /* JADX WARN: Type inference failed for: r3v10, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r3v9 */
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
    public static final A0 k(A0 a02) {
        c0 c0Var;
        b0.o oVar = (b0.o) a02;
        if (!oVar.f7162k.f7175x) {
            AbstractC2540a.b("visitAncestors called on an unattached node");
        }
        b0.o oVar2 = oVar.f7162k.f7166o;
        C2731G v4 = v(a02);
        while (v4 != null) {
            if ((v4.f21612O.f.f7165n & 262144) != 0) {
                while (oVar2 != null) {
                    if ((oVar2.f7164m & 262144) != 0) {
                        AbstractC2756m abstractC2756m = oVar2;
                        ?? r5 = 0;
                        while (abstractC2756m != 0) {
                            if (abstractC2756m instanceof A0) {
                                A0 a03 = (A0) abstractC2756m;
                                if (kotlin.jvm.internal.l.a(a02.o(), a03.o()) && a02.getClass() == a03.getClass()) {
                                    return a03;
                                }
                            } else if ((abstractC2756m.f7164m & 262144) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                                b0.o oVar3 = abstractC2756m.f21839z;
                                int i = 0;
                                abstractC2756m = abstractC2756m;
                                r5 = r5;
                                while (oVar3 != null) {
                                    if ((oVar3.f7164m & 262144) != 0) {
                                        i++;
                                        r5 = r5;
                                        if (i == 1) {
                                            abstractC2756m = oVar3;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new R.e(new b0.o[16]);
                                            }
                                            if (abstractC2756m != 0) {
                                                r5.c(abstractC2756m);
                                                abstractC2756m = 0;
                                            }
                                            r5.c(oVar3);
                                        }
                                    }
                                    oVar3 = oVar3.f7167p;
                                    abstractC2756m = abstractC2756m;
                                    r5 = r5;
                                }
                                if (i == 1) {
                                }
                            }
                            abstractC2756m = f(r5);
                        }
                    }
                    oVar2 = oVar2.f7166o;
                }
            }
            v4 = v4.u();
            oVar2 = (v4 == null || (c0Var = v4.f21612O) == null) ? null : c0Var.f21770e;
        }
        return null;
    }

    public static final float l(long j5) {
        return Float.intBitsToFloat((int) (j5 >> 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(InterfaceC2757n interfaceC2757n) {
        if (((b0.o) interfaceC2757n).f7162k.f7175x) {
            t(interfaceC2757n, 1).P0();
        }
    }

    public static final void n(InterfaceC2765w interfaceC2765w) {
        v(interfaceC2765w).E();
    }

    public static final void o(v0 v0Var) {
        v(v0Var).G();
    }

    public static final boolean p(long j5) {
        return (j5 & 2) != 0;
    }

    public static final boolean q(long j5) {
        return (j5 & 1) != 0;
    }

    public static final boolean r(C2731G c2731g) {
        if (c2731g.f21630q == null) {
            return false;
        }
        C2731G u5 = c2731g.u();
        return (u5 != null ? u5.f21630q : null) == null || c2731g.f21613P.f21651b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void s(b0.o oVar, InterfaceC2015a interfaceC2015a) {
        j0 j0Var = oVar.f7168q;
        if (j0Var == null) {
            j0Var = new j0((i0) oVar);
            oVar.f7168q = j0Var;
        }
        ((A0.F) w(oVar)).getSnapshotObserver().a(j0Var, C2748e.f21781q, interfaceC2015a);
    }

    public static final e0 t(InterfaceC2755l interfaceC2755l, int i) {
        e0 e0Var = ((b0.o) interfaceC2755l).f7162k.f7169r;
        kotlin.jvm.internal.l.c(e0Var);
        if (e0Var.I0() != interfaceC2755l || !f0.g(i)) {
            return e0Var;
        }
        e0 e0Var2 = e0Var.f21813z;
        kotlin.jvm.internal.l.c(e0Var2);
        return e0Var2;
    }

    public static final e0 u(InterfaceC2755l interfaceC2755l) {
        if (!((b0.o) interfaceC2755l).f7162k.f7175x) {
            AbstractC2540a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        e0 t5 = t(interfaceC2755l, 2);
        if (!t5.I0().f7175x) {
            AbstractC2540a.b("LayoutCoordinates is not attached.");
        }
        return t5;
    }

    public static final C2731G v(InterfaceC2755l interfaceC2755l) {
        e0 e0Var = ((b0.o) interfaceC2755l).f7162k.f7169r;
        if (e0Var != null) {
            return e0Var.f21812y;
        }
        throw AbstractC0467k.u("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final n0 w(InterfaceC2755l interfaceC2755l) {
        A0.F f = v(interfaceC2755l).f21636w;
        if (f != null) {
            return f;
        }
        throw AbstractC0467k.u("This node does not have an owner.");
    }

    public static final View x(InterfaceC2755l interfaceC2755l) {
        if (!((b0.o) interfaceC2755l).f7162k.f7175x) {
            AbstractC2540a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) AbstractC2734J.a(v(interfaceC2755l));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, z0.A0, z0.l] */
    /* JADX WARN: Type inference failed for: r12v0, types: [i4.c] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [b0.o] */
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
    public static final void y(A0 a02, i4.c cVar) {
        c0 c0Var;
        b0.o oVar = (b0.o) a02;
        if (!oVar.f7162k.f7175x) {
            AbstractC2540a.b("visitAncestors called on an unattached node");
        }
        b0.o oVar2 = oVar.f7162k.f7166o;
        C2731G v4 = v(a02);
        while (v4 != null) {
            if ((v4.f21612O.f.f7165n & 262144) != 0) {
                while (oVar2 != null) {
                    if ((oVar2.f7164m & 262144) != 0) {
                        AbstractC2756m abstractC2756m = oVar2;
                        ?? r5 = 0;
                        while (abstractC2756m != 0) {
                            boolean z3 = true;
                            if (abstractC2756m instanceof A0) {
                                A0 a03 = (A0) abstractC2756m;
                                if (kotlin.jvm.internal.l.a(a02.o(), a03.o()) && a02.getClass() == a03.getClass()) {
                                    z3 = ((Boolean) cVar.c(a03)).booleanValue();
                                }
                                if (!z3) {
                                    return;
                                }
                            } else {
                                if (((abstractC2756m.f7164m & 262144) != 0) && (abstractC2756m instanceof AbstractC2756m)) {
                                    b0.o oVar3 = abstractC2756m.f21839z;
                                    int i = 0;
                                    abstractC2756m = abstractC2756m;
                                    r5 = r5;
                                    while (oVar3 != null) {
                                        if ((oVar3.f7164m & 262144) != 0) {
                                            i++;
                                            r5 = r5;
                                            if (i == 1) {
                                                abstractC2756m = oVar3;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new R.e(new b0.o[16]);
                                                }
                                                if (abstractC2756m != 0) {
                                                    r5.c(abstractC2756m);
                                                    abstractC2756m = 0;
                                                }
                                                r5.c(oVar3);
                                            }
                                        }
                                        oVar3 = oVar3.f7167p;
                                        abstractC2756m = abstractC2756m;
                                        r5 = r5;
                                    }
                                    if (i == 1) {
                                    }
                                }
                            }
                            abstractC2756m = f(r5);
                        }
                    }
                    oVar2 = oVar2.f7166o;
                }
            }
            v4 = v4.u();
            oVar2 = (v4 == null || (c0Var = v4.f21612O) == null) ? null : c0Var.f21770e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, z0.A0] */
    /* JADX WARN: Type inference failed for: r13v0, types: [i4.c] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [R.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [R.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void z(A0 a02, i4.c cVar) {
        b0.o oVar = (b0.o) a02;
        if (!oVar.f7162k.f7175x) {
            AbstractC2540a.b("visitSubtreeIf called on an unattached node");
        }
        R.e eVar = new R.e(new b0.o[16]);
        b0.o oVar2 = oVar.f7162k;
        b0.o oVar3 = oVar2.f7167p;
        if (oVar3 == null) {
            b(eVar, oVar2);
        } else {
            eVar.c(oVar3);
        }
        while (true) {
            int i = eVar.f5108m;
            if (i == 0) {
                return;
            }
            b0.o oVar4 = (b0.o) eVar.l(i - 1);
            if ((oVar4.f7165n & 262144) != 0) {
                for (b0.o oVar5 = oVar4; oVar5 != null; oVar5 = oVar5.f7167p) {
                    if ((oVar5.f7164m & 262144) != 0) {
                        AbstractC2756m abstractC2756m = oVar5;
                        ?? r7 = 0;
                        while (abstractC2756m != 0) {
                            if (abstractC2756m instanceof A0) {
                                A0 a03 = (A0) abstractC2756m;
                                z0 z0Var = (kotlin.jvm.internal.l.a(a02.o(), a03.o()) && a02.getClass() == a03.getClass()) ? (z0) cVar.c(a03) : z0.f21876k;
                                if (z0Var == z0.f21878m) {
                                    return;
                                }
                                if (z0Var == z0.f21877l) {
                                    break;
                                }
                            } else if ((abstractC2756m.f7164m & 262144) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                                b0.o oVar6 = abstractC2756m.f21839z;
                                int i5 = 0;
                                abstractC2756m = abstractC2756m;
                                r7 = r7;
                                while (oVar6 != null) {
                                    if ((oVar6.f7164m & 262144) != 0) {
                                        i5++;
                                        r7 = r7;
                                        if (i5 == 1) {
                                            abstractC2756m = oVar6;
                                        } else {
                                            if (r7 == 0) {
                                                r7 = new R.e(new b0.o[16]);
                                            }
                                            if (abstractC2756m != 0) {
                                                r7.c(abstractC2756m);
                                                abstractC2756m = 0;
                                            }
                                            r7.c(oVar6);
                                        }
                                    }
                                    oVar6 = oVar6.f7167p;
                                    abstractC2756m = abstractC2756m;
                                    r7 = r7;
                                }
                                if (i5 == 1) {
                                }
                            }
                            abstractC2756m = f(r7);
                        }
                    }
                }
            }
            b(eVar, oVar4);
        }
    }
}
