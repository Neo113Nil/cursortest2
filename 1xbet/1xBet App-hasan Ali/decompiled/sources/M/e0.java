package M;

import A0.I0;
import A0.o1;
import P.C0302l;
import P.C0315s;
import P.C0326x0;
import a.AbstractC0444a;
import h0.C1991e;
import k0.C2028h;
import k0.InterfaceC2025e;
import l4.C2059a;
import u.A0;
import u.AbstractC2453d;
import u.AbstractC2478z;
import u.B0;
import u.C2435F;
import u.C2438I;
import u.C2439J;
import u.C2440K;
import u.C2473u;
import v.AbstractC2528x;
import v.C2522q;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f3318a;

    /* renamed from: b, reason: collision with root package name */
    public static final b0.p f3319b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f3320c = 240;

    /* renamed from: d, reason: collision with root package name */
    public static final float f3321d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f3322e;
    public static final C2473u f;

    /* renamed from: g, reason: collision with root package name */
    public static final C2473u f3323g;

    /* renamed from: h, reason: collision with root package name */
    public static final C2473u f3324h;
    public static final C2473u i;

    /* renamed from: j, reason: collision with root package name */
    public static final C2473u f3325j;

    static {
        float f5 = 10;
        f3318a = f5;
        f3319b = androidx.compose.foundation.layout.b.h(H0.k.a(androidx.compose.ui.layout.a.b(c0.f3304l), true, C0237h.f3341o), 0.0f, f5, 1);
        float f6 = O.i.f3920b;
        f3321d = f6;
        f3322e = O.i.f3921c - (f6 * 2);
        f = new C2473u(0.2f, 0.0f, 0.8f);
        f3323g = new C2473u(0.4f, 0.0f, 1.0f);
        f3324h = new C2473u(0.0f, 0.0f, 0.65f);
        i = new C2473u(0.1f, 0.0f, 0.45f);
        f3325j = new C2473u(0.4f, 0.0f, 0.2f);
    }

    public static final void a(float f5, int i5, int i6, long j5, long j6, C0315s c0315s, b0.p pVar) {
        int i7;
        b0.p pVar2;
        c0315s.Z(-115871647);
        if (((i6 | 24576) & 9363) == 9362 && c0315s.B()) {
            c0315s.S();
            i7 = i5;
            pVar2 = pVar;
        } else {
            c0315s.U();
            if ((i6 & 1) == 0 || c0315s.z()) {
                i7 = Z.f3280b;
            } else {
                c0315s.S();
                i7 = i5;
            }
            c0315s.r();
            C2028h c2028h = new C2028h(((W0.c) c0315s.j(I0.f287h)).y(f5), 0.0f, i7, 0, 26);
            C2438I k5 = AbstractC2453d.k(c0315s);
            A0 a02 = B0.f19646b;
            o1 o1Var = AbstractC2478z.f19971b;
            C2435F f6 = AbstractC2453d.f(k5, 0, 5, a02, AbstractC2453d.j(AbstractC2453d.m(6660, 2, o1Var)), c0315s, 33208, 16);
            C2435F d5 = AbstractC2453d.d(k5, 286.0f, AbstractC2453d.j(AbstractC2453d.m(1332, 2, o1Var)), c0315s);
            C2.h hVar = new C2.h(14, (byte) 0);
            hVar.f833l = 1332;
            C2439J f7 = hVar.f(Float.valueOf(0.0f), 0);
            C2473u c2473u = f3325j;
            f7.f19684b = c2473u;
            hVar.f(Float.valueOf(290.0f), 666);
            C2435F d6 = AbstractC2453d.d(k5, 290.0f, AbstractC2453d.j(new C2440K(hVar)), c0315s);
            C2.h hVar2 = new C2.h(14, (byte) 0);
            hVar2.f833l = 1332;
            hVar2.f(Float.valueOf(0.0f), 666).f19684b = c2473u;
            hVar2.f(Float.valueOf(290.0f), hVar2.f833l);
            C2435F d7 = AbstractC2453d.d(k5, 290.0f, AbstractC2453d.j(new C2440K(hVar2)), c0315s);
            pVar2 = pVar;
            b0.p f8 = androidx.compose.foundation.layout.c.f(H0.k.a(pVar2, true, C2522q.f20293o), f3322e);
            boolean h3 = c0315s.h(c2028h) | c0315s.f(f6) | c0315s.f(d6) | c0315s.f(d7) | c0315s.f(d5);
            Object M5 = c0315s.M();
            if (h3 || M5 == C0302l.f4480a) {
                Object a0Var = new a0(j6, c2028h, f6, d6, d7, d5, f5, j5);
                c0315s.i0(a0Var);
                M5 = a0Var;
            }
            AbstractC2528x.a(f8, (i4.c) M5, c0315s, 0);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new b0(pVar2, j5, f5, j6, i7, i6);
        }
    }

    public static final void b(float f5, int i5, int i6, long j5, long j6, C0315s c0315s, b0.p pVar) {
        int i7;
        float f6;
        int i8;
        float f7;
        c0315s.Z(567589233);
        if (((i6 | (c0315s.f(pVar) ? 4 : 2) | 27648) & 9363) == 9362 && c0315s.B()) {
            c0315s.S();
            f7 = f5;
            i8 = i5;
        } else {
            c0315s.U();
            if ((i6 & 1) == 0 || c0315s.z()) {
                i7 = Z.f3279a;
                f6 = Z.f3281c;
            } else {
                c0315s.S();
                f6 = f5;
                i7 = i5;
            }
            c0315s.r();
            C2438I k5 = AbstractC2453d.k(c0315s);
            C2.h hVar = new C2.h(14, (byte) 0);
            hVar.f833l = 1800;
            hVar.f(Float.valueOf(0.0f), 0).f19684b = f;
            hVar.f(Float.valueOf(1.0f), 750);
            C2435F d5 = AbstractC2453d.d(k5, 1.0f, AbstractC2453d.j(new C2440K(hVar)), c0315s);
            C2.h hVar2 = new C2.h(14, (byte) 0);
            hVar2.f833l = 1800;
            hVar2.f(Float.valueOf(0.0f), 333).f19684b = f3323g;
            hVar2.f(Float.valueOf(1.0f), 1183);
            C2435F d6 = AbstractC2453d.d(k5, 1.0f, AbstractC2453d.j(new C2440K(hVar2)), c0315s);
            C2.h hVar3 = new C2.h(14, (byte) 0);
            hVar3.f833l = 1800;
            hVar3.f(Float.valueOf(0.0f), 1000).f19684b = f3324h;
            hVar3.f(Float.valueOf(1.0f), 1567);
            C2435F d7 = AbstractC2453d.d(k5, 1.0f, AbstractC2453d.j(new C2440K(hVar3)), c0315s);
            C2.h hVar4 = new C2.h(14, (byte) 0);
            hVar4.f833l = 1800;
            hVar4.f(Float.valueOf(0.0f), 1267).f19684b = i;
            hVar4.f(Float.valueOf(1.0f), 1800);
            C2435F d8 = AbstractC2453d.d(k5, 1.0f, AbstractC2453d.j(new C2440K(hVar4)), c0315s);
            b0.p g5 = androidx.compose.foundation.layout.c.g(H0.k.a(pVar.c(f3319b), true, C2522q.f20293o), f3320c, f3321d);
            boolean f8 = c0315s.f(d5) | c0315s.f(d6) | c0315s.f(d7) | c0315s.f(d8);
            Object M5 = c0315s.M();
            if (f8 || M5 == C0302l.f4480a) {
                Object d0Var = new d0(i7, f6, d5, j6, d6, j5, d7, d8);
                c0315s.i0(d0Var);
                M5 = d0Var;
            }
            AbstractC2528x.a(g5, (i4.c) M5, c0315s, 0);
            i8 = i7;
            f7 = f6;
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new b0(pVar, j5, j6, i8, f7, i6);
        }
    }

    public static final void c(InterfaceC2025e interfaceC2025e, float f5, float f6, long j5, float f7, int i5) {
        float d5 = C1991e.d(interfaceC2025e.d());
        float b3 = C1991e.b(interfaceC2025e.d());
        float f8 = 2;
        float f9 = b3 / f8;
        boolean z3 = interfaceC2025e.getLayoutDirection() == W0.m.f6016k;
        float f10 = (z3 ? f5 : 1.0f - f6) * d5;
        float f11 = (z3 ? f6 : 1.0f - f5) * d5;
        if (i5 == 0 || b3 > d5) {
            interfaceC2025e.P(j5, G4.d.d(f10, f9), G4.d.d(f11, f9), f7, (r19 & 16) != 0 ? 0 : 0);
            return;
        }
        float f12 = f7 / f8;
        C2059a c2059a = new C2059a(f12, d5 - f12);
        float floatValue = ((Number) AbstractC0444a.v(Float.valueOf(f10), c2059a)).floatValue();
        float floatValue2 = ((Number) AbstractC0444a.v(Float.valueOf(f11), c2059a)).floatValue();
        if (Math.abs(f6 - f5) > 0.0f) {
            interfaceC2025e.P(j5, G4.d.d(floatValue, f9), G4.d.d(floatValue2, f9), f7, (r19 & 16) != 0 ? 0 : i5);
        }
    }

    public static final void d(InterfaceC2025e interfaceC2025e, float f5, float f6, long j5, C2028h c2028h) {
        float f7 = 2;
        float f8 = c2028h.f17548b / f7;
        float d5 = C1991e.d(interfaceC2025e.d()) - (f7 * f8);
        interfaceC2025e.N(j5, f5, f6, G4.d.d(f8, f8), AbstractC0444a.d(d5, d5), c2028h);
    }
}
