package androidx.compose.animation;

import P.AbstractC0329z;
import P.C0302l;
import P.C0305m0;
import P.C0315s;
import P.C0326x0;
import P.InterfaceC0289e0;
import P.InterfaceC0314r0;
import P.W0;
import W3.o;
import X.d;
import b0.m;
import b0.p;
import i0.K;
import i4.InterfaceC2015a;
import i4.c;
import i4.e;
import java.util.LinkedHashMap;
import java.util.Map;
import k4.AbstractC2036a;
import kotlin.jvm.internal.l;
import n.AbstractC2107A;
import t.AbstractC2379A;
import t.C2383E;
import t.C2384F;
import t.C2385G;
import t.C2401m;
import t.C2402n;
import t.N;
import t.r;
import t.v;
import t.w;
import t.y;
import t.z;
import u.A0;
import u.B0;
import u.C2441L;
import u.o0;
import u.t0;
import u.y0;
import z0.C2751h;
import z0.C2752i;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:121:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(t0 t0Var, c cVar, p pVar, C2383E c2383e, C2384F c2384f, e eVar, d dVar, C0315s c0315s, int i) {
        int i5;
        J2.a aVar;
        C2383E c2383e2;
        boolean f;
        Object M5;
        C2384F c2384f2;
        C2384F c2384f3;
        N n5;
        N n6;
        t0 t0Var2;
        y yVar;
        boolean z3;
        o0 o0Var;
        boolean h3;
        Object M6;
        C2383E c2383e3;
        C2384F c2384f4;
        boolean f5;
        Object M7;
        p pVar2;
        Object M8;
        int p5;
        d dVar2;
        boolean z5;
        C0326x0 s2;
        c0315s.Z(-891967166);
        int i6 = i | (c0315s.f(t0Var) ? 4 : 2) | (c0315s.h(cVar) ? 32 : 16) | (c0315s.f(pVar) ? 256 : 128) | (c0315s.f(c2383e) ? 2048 : 1024) | (c0315s.f(c2384f) ? 16384 : 8192) | (c0315s.h(eVar) ? 131072 : 65536) | 1572864;
        if ((4793491 & i6) == 4793490 && c0315s.B()) {
            c0315s.S();
        } else {
            boolean booleanValue = ((Boolean) cVar.c(t0Var.f19940d.getValue())).booleanValue();
            J2.a aVar2 = t0Var.f19937a;
            if (booleanValue || ((Boolean) cVar.c(aVar2.e())).booleanValue() || t0Var.g() || t0Var.d()) {
                c0315s.X(1787977937);
                int i7 = i6 & 14;
                int i8 = i7 | 48;
                int i9 = i8 & 14;
                boolean z6 = ((i9 ^ 6) > 4 && c0315s.f(t0Var)) || (i8 & 6) == 4;
                Object M9 = c0315s.M();
                Object obj = C0302l.f4480a;
                if (z6 || M9 == obj) {
                    M9 = aVar2.e();
                    c0315s.i0(M9);
                }
                if (t0Var.g()) {
                    M9 = aVar2.e();
                }
                c0315s.X(-466616829);
                v b3 = b(t0Var, cVar, M9, c0315s);
                c0315s.q(false);
                Object value = t0Var.f19940d.getValue();
                c0315s.X(-466616829);
                v b5 = b(t0Var, cVar, value, c0315s);
                c0315s.q(false);
                int i10 = i9 | 3072;
                Object obj2 = y0.f19969a;
                int i11 = (i10 & 14) ^ 6;
                boolean z7 = (i11 > 4 && c0315s.f(t0Var)) || (i10 & 6) == 4;
                Object M10 = c0315s.M();
                if (z7 || M10 == obj) {
                    i5 = i10;
                    M10 = new t0(new C2441L(b3), t0Var, AbstractC2107A.u(new StringBuilder(), t0Var.f19939c, " > EnterExitTransition"));
                    c0315s.i0(M10);
                } else {
                    i5 = i10;
                }
                t0 t0Var3 = (t0) M10;
                boolean f6 = ((i11 > 4 && c0315s.f(t0Var)) || (i5 & 6) == 4) | c0315s.f(t0Var3);
                Object M11 = c0315s.M();
                if (f6 || M11 == obj) {
                    M11 = new K(6, t0Var, t0Var3);
                    c0315s.i0(M11);
                }
                AbstractC0329z.c(t0Var3, (c) M11, c0315s);
                if (t0Var.g()) {
                    t0Var3.l(b3, b5);
                } else {
                    t0Var3.q(b5);
                    t0Var3.f19945k.setValue(Boolean.FALSE);
                }
                InterfaceC0289e0 w5 = AbstractC0329z.w(eVar, c0315s);
                Object e3 = t0Var3.f19937a.e();
                C0305m0 c0305m0 = t0Var3.f19940d;
                Object invoke = eVar.invoke(e3, c0305m0.getValue());
                boolean f7 = c0315s.f(t0Var3) | c0315s.f(w5);
                Object M12 = c0315s.M();
                if (f7 || M12 == obj) {
                    M12 = new t.p(t0Var3, w5, null);
                    c0315s.i0(M12);
                }
                e eVar2 = (e) M12;
                Object M13 = c0315s.M();
                if (M13 == obj) {
                    M13 = AbstractC0329z.t(invoke);
                    c0315s.i0(M13);
                }
                InterfaceC0289e0 interfaceC0289e0 = (InterfaceC0289e0) M13;
                o oVar = o.f6046a;
                boolean h4 = c0315s.h(eVar2);
                Object M14 = c0315s.M();
                if (h4 || M14 == obj) {
                    M14 = new W0(eVar2, interfaceC0289e0, null);
                    c0315s.i0(M14);
                }
                AbstractC0329z.e(c0315s, (e) M14, oVar);
                J2.a aVar3 = t0Var3.f19937a;
                Object e5 = aVar3.e();
                v vVar = v.f19417m;
                if (e5 == vVar && c0305m0.getValue() == vVar && ((Boolean) interfaceC0289e0.getValue()).booleanValue()) {
                    c0315s.X(1790256282);
                    c0315s.q(false);
                    pVar2 = pVar;
                    c2384f2 = c2384f;
                    dVar2 = dVar;
                    z5 = false;
                } else {
                    c0315s.X(1788869559);
                    boolean z8 = i7 == 4;
                    Object M15 = c0315s.M();
                    if (z8 || M15 == obj) {
                        M15 = new r();
                        c0315s.i0(M15);
                    }
                    r rVar = (r) M15;
                    A0 a02 = AbstractC2379A.f19321a;
                    y yVar2 = y.f19427l;
                    boolean f8 = c0315s.f(t0Var3);
                    Object M16 = c0315s.M();
                    if (f8 || M16 == obj) {
                        M16 = AbstractC0329z.t(c2383e);
                        c0315s.i0(M16);
                    }
                    InterfaceC0289e0 interfaceC0289e02 = (InterfaceC0289e0) M16;
                    Object e6 = aVar3.e();
                    Object value2 = c0305m0.getValue();
                    v vVar2 = v.f19416l;
                    if (e6 == value2 && aVar3.e() == vVar2) {
                        if (t0Var3.g()) {
                            interfaceC0289e02.setValue(c2383e);
                        } else {
                            interfaceC0289e02.setValue(C2383E.f19339b);
                        }
                    } else if (c0305m0.getValue() == vVar2) {
                        C2383E c2383e4 = (C2383E) interfaceC0289e02.getValue();
                        c2383e4.getClass();
                        N n7 = c2383e.f19340a;
                        N n8 = c2383e4.f19340a;
                        aVar = aVar3;
                        C2385G c2385g = n7.f19353a;
                        if (c2385g == null) {
                            c2385g = n8.f19353a;
                        }
                        Map map = n8.f19355c;
                        l.f("<this>", map);
                        Map map2 = n7.f19355c;
                        l.f("map", map2);
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                        linkedHashMap.putAll(map2);
                        interfaceC0289e02.setValue(new C2383E(new N(c2385g, (AbstractC2036a) null, linkedHashMap, 16)));
                        c2383e2 = (C2383E) interfaceC0289e02.getValue();
                        f = c0315s.f(t0Var3);
                        M5 = c0315s.M();
                        if (!f || M5 == obj) {
                            M5 = AbstractC0329z.t(c2384f);
                            c0315s.i0(M5);
                        }
                        InterfaceC0289e0 interfaceC0289e03 = (InterfaceC0289e0) M5;
                        if (aVar.e() == c0305m0.getValue() || aVar.e() != vVar2) {
                            c2384f2 = c2384f;
                            if (c0305m0.getValue() != vVar2) {
                                C2384F c2384f5 = (C2384F) interfaceC0289e03.getValue();
                                c2384f5.getClass();
                                N n9 = c2384f2.f19343a;
                                N n10 = c2384f5.f19343a;
                                C2385G c2385g2 = n9.f19353a;
                                if (c2385g2 == null) {
                                    c2385g2 = n10.f19353a;
                                }
                                boolean z9 = n9.f19354b || n10.f19354b;
                                Map map3 = n10.f19355c;
                                l.f("<this>", map3);
                                Map map4 = n9.f19355c;
                                l.f("map", map4);
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(map3);
                                linkedHashMap2.putAll(map4);
                                interfaceC0289e03.setValue(new C2384F(new N(c2385g2, (AbstractC2036a) null, z9, linkedHashMap2)));
                            }
                        } else if (t0Var3.g()) {
                            c2384f2 = c2384f;
                            interfaceC0289e03.setValue(c2384f2);
                        } else {
                            c2384f2 = c2384f;
                            interfaceC0289e03.setValue(C2384F.f19341b);
                        }
                        c2384f3 = (C2384F) interfaceC0289e03.getValue();
                        n5 = c2383e2.f19340a;
                        n6 = c2384f3.f19343a;
                        c0315s.X(-821278096);
                        c0315s.q(false);
                        c0315s.X(-821099041);
                        c0315s.q(false);
                        c0315s.X(-820883777);
                        c0315s.q(false);
                        if (n5.f19353a == null || n6.f19353a != null) {
                            t0Var2 = t0Var3;
                            yVar = yVar2;
                            z3 = false;
                            c0315s.X(-675252433);
                            c0315s.q(false);
                            o0Var = null;
                        } else {
                            c0315s.X(-675389204);
                            A0 a03 = B0.f19645a;
                            Object M17 = c0315s.M();
                            if (M17 == obj) {
                                M17 = "Built-in alpha";
                                c0315s.i0("Built-in alpha");
                            }
                            String str = (String) M17;
                            t0Var2 = t0Var3;
                            yVar = yVar2;
                            o0Var = y0.a(t0Var2, a03, str, c0315s, 384, 0);
                            z3 = false;
                            c0315s.q(false);
                        }
                        c0315s.X(-675057009);
                        c0315s.q(z3);
                        c0315s.X(-674835793);
                        c0315s.q(z3);
                        h3 = c0315s.h(o0Var) | c0315s.f(c2383e2) | c0315s.f(c2384f3) | c0315s.h(null) | c0315s.f(t0Var2) | c0315s.h(null);
                        M6 = c0315s.M();
                        if (!h3 || M6 == obj) {
                            M6 = new w(o0Var, null, t0Var2, c2383e2, c2384f3, null);
                            c2383e3 = c2383e2;
                            c2384f4 = c2384f3;
                            c0315s.i0(M6);
                        } else {
                            c2384f4 = c2384f3;
                            c2383e3 = c2383e2;
                        }
                        w wVar = (w) M6;
                        m mVar = m.f7161k;
                        f5 = c0315s.f(yVar) | c0315s.g(true);
                        M7 = c0315s.M();
                        if (!f5 || M7 == obj) {
                            M7 = new z(yVar, true);
                            c0315s.i0(M7);
                        }
                        p c5 = androidx.compose.ui.graphics.a.a(mVar, (c) M7).c(new EnterExitTransitionElement(t0Var2, c2383e3, c2384f4, yVar, wVar));
                        c0315s.X(1581766416);
                        c0315s.q(false);
                        p c6 = c5.c(mVar);
                        pVar2 = pVar;
                        p c7 = pVar2.c(c6);
                        M8 = c0315s.M();
                        if (M8 == obj) {
                            M8 = new C2401m(rVar);
                            c0315s.i0(M8);
                        }
                        C2401m c2401m = (C2401m) M8;
                        p5 = AbstractC0329z.p(c0315s);
                        InterfaceC0314r0 l5 = c0315s.l();
                        p c8 = b0.a.c(c0315s, c7);
                        InterfaceC2753j.f21834j.getClass();
                        InterfaceC2015a interfaceC2015a = C2752i.f21830b;
                        c0315s.b0();
                        if (c0315s.f4530S) {
                            c0315s.l0();
                        } else {
                            c0315s.k(interfaceC2015a);
                        }
                        AbstractC0329z.y(c0315s, C2752i.f21833e, c2401m);
                        AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
                        C2751h c2751h = C2752i.f;
                        if (!c0315s.f4530S || !l.a(c0315s.M(), Integer.valueOf(p5))) {
                            AbstractC2107A.y(p5, c0315s, p5, c2751h);
                        }
                        AbstractC0329z.y(c0315s, C2752i.f21831c, c8);
                        dVar2 = dVar;
                        dVar2.b(rVar, c0315s, 48);
                        c0315s.q(true);
                        z5 = false;
                        c0315s.q(false);
                    }
                    aVar = aVar3;
                    c2383e2 = (C2383E) interfaceC0289e02.getValue();
                    f = c0315s.f(t0Var3);
                    M5 = c0315s.M();
                    if (!f) {
                    }
                    M5 = AbstractC0329z.t(c2384f);
                    c0315s.i0(M5);
                    InterfaceC0289e0 interfaceC0289e032 = (InterfaceC0289e0) M5;
                    if (aVar.e() == c0305m0.getValue()) {
                    }
                    c2384f2 = c2384f;
                    if (c0305m0.getValue() != vVar2) {
                    }
                    c2384f3 = (C2384F) interfaceC0289e032.getValue();
                    n5 = c2383e2.f19340a;
                    n6 = c2384f3.f19343a;
                    c0315s.X(-821278096);
                    c0315s.q(false);
                    c0315s.X(-821099041);
                    c0315s.q(false);
                    c0315s.X(-820883777);
                    c0315s.q(false);
                    if (n5.f19353a == null || n6.f19353a != null) {
                    }
                    c0315s.X(-675057009);
                    c0315s.q(z3);
                    c0315s.X(-674835793);
                    c0315s.q(z3);
                    h3 = c0315s.h(o0Var) | c0315s.f(c2383e2) | c0315s.f(c2384f3) | c0315s.h(null) | c0315s.f(t0Var2) | c0315s.h(null);
                    M6 = c0315s.M();
                    if (h3) {
                    }
                    M6 = new w(o0Var, null, t0Var2, c2383e2, c2384f3, null);
                    c2383e3 = c2383e2;
                    c2384f4 = c2384f3;
                    c0315s.i0(M6);
                    w wVar2 = (w) M6;
                    m mVar2 = m.f7161k;
                    f5 = c0315s.f(yVar) | c0315s.g(true);
                    M7 = c0315s.M();
                    if (!f5) {
                    }
                    M7 = new z(yVar, true);
                    c0315s.i0(M7);
                    p c52 = androidx.compose.ui.graphics.a.a(mVar2, (c) M7).c(new EnterExitTransitionElement(t0Var2, c2383e3, c2384f4, yVar, wVar2));
                    c0315s.X(1581766416);
                    c0315s.q(false);
                    p c62 = c52.c(mVar2);
                    pVar2 = pVar;
                    p c72 = pVar2.c(c62);
                    M8 = c0315s.M();
                    if (M8 == obj) {
                    }
                    C2401m c2401m2 = (C2401m) M8;
                    p5 = AbstractC0329z.p(c0315s);
                    InterfaceC0314r0 l52 = c0315s.l();
                    p c82 = b0.a.c(c0315s, c72);
                    InterfaceC2753j.f21834j.getClass();
                    InterfaceC2015a interfaceC2015a2 = C2752i.f21830b;
                    c0315s.b0();
                    if (c0315s.f4530S) {
                    }
                    AbstractC0329z.y(c0315s, C2752i.f21833e, c2401m2);
                    AbstractC0329z.y(c0315s, C2752i.f21832d, l52);
                    C2751h c2751h2 = C2752i.f;
                    if (!c0315s.f4530S) {
                    }
                    AbstractC2107A.y(p5, c0315s, p5, c2751h2);
                    AbstractC0329z.y(c0315s, C2752i.f21831c, c82);
                    dVar2 = dVar;
                    dVar2.b(rVar, c0315s, 48);
                    c0315s.q(true);
                    z5 = false;
                    c0315s.q(false);
                }
                c0315s.q(z5);
                s2 = c0315s.s();
                if (s2 == null) {
                    s2.f4578d = new C2402n(t0Var, cVar, pVar2, c2383e, c2384f2, eVar, dVar2, i);
                    return;
                }
                return;
            }
            c0315s.X(1790262234);
            c0315s.q(false);
        }
        dVar2 = dVar;
        pVar2 = pVar;
        c2384f2 = c2384f;
        s2 = c0315s.s();
        if (s2 == null) {
        }
    }

    public static final v b(t0 t0Var, c cVar, Object obj, C0315s c0315s) {
        c0315s.T(-902048200, 0, t0Var, null);
        boolean g5 = t0Var.g();
        v vVar = v.f19415k;
        v vVar2 = v.f19417m;
        v vVar3 = v.f19416l;
        J2.a aVar = t0Var.f19937a;
        if (g5) {
            c0315s.X(2101296683);
            c0315s.q(false);
            if (((Boolean) cVar.c(obj)).booleanValue()) {
                vVar = vVar3;
            } else if (((Boolean) cVar.c(aVar.e())).booleanValue()) {
                vVar = vVar2;
            }
        } else {
            c0315s.X(2101530516);
            Object M5 = c0315s.M();
            if (M5 == C0302l.f4480a) {
                M5 = AbstractC0329z.t(Boolean.FALSE);
                c0315s.i0(M5);
            }
            InterfaceC0289e0 interfaceC0289e0 = (InterfaceC0289e0) M5;
            if (((Boolean) cVar.c(aVar.e())).booleanValue()) {
                interfaceC0289e0.setValue(Boolean.TRUE);
            }
            if (((Boolean) cVar.c(obj)).booleanValue()) {
                vVar = vVar3;
            } else if (((Boolean) interfaceC0289e0.getValue()).booleanValue()) {
                vVar = vVar2;
            }
            c0315s.q(false);
        }
        c0315s.q(false);
        return vVar;
    }
}
