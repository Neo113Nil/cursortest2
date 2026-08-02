package t0;

import E.C0096e0;
import P.C0299j0;
import a.AbstractC0444a;
import a3.AbstractC0467k;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.RectF;
import h0.C1988b;
import h0.C1989c;
import h0.C1990d;
import h0.C1991e;
import i0.AbstractC2005j;
import i0.C1994A;
import i0.C1995B;
import i0.C1997b;
import i0.C2001f;
import i0.C2003h;
import i0.C2006k;
import i0.InterfaceC2009n;
import i0.K;
import i0.M;
import java.util.Iterator;
import java.util.Map;
import k0.C2021a;
import k0.C2022b;
import k0.C2023c;
import k0.C2027g;
import k0.C2028h;
import n.AbstractC2107A;
import p4.C2268h;
import t.C2380B;
import v.C2503A;
import v.C2521p;
import v.C2522q;
import v.C2523s;
import v.C2524t;
import v.C2525u;
import v.v0;
import x.C2589k0;
import x.C2604s0;
import x0.C2628n;
import x0.InterfaceC2637x;
import z0.C2732H;
import z0.InterfaceC2742a;
import z0.e0;

/* loaded from: classes.dex */
public final class F extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f19445l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f19446m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(int i, Object obj) {
        super(1);
        this.f19445l = i;
        this.f19446m = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x032f  */
    /* JADX WARN: Type inference failed for: r2v39, types: [x0.Z, z0.a] */
    @Override // i4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj) {
        int i;
        C2006k c2006k;
        C2006k c2006k2;
        i0.w wVar;
        boolean z3;
        long j5;
        C2022b c2022b;
        float f;
        float f5;
        v3.e eVar;
        long A3;
        float d5;
        Bitmap bitmap;
        switch (this.f19445l) {
            case 0:
                Throwable th = (Throwable) obj;
                E e3 = (E) this.f19446m;
                C2268h c2268h = e3.f19441m;
                if (c2268h != null) {
                    c2268h.g(th);
                }
                e3.f19441m = null;
                return W3.o.f6046a;
            case 1:
                f0.c cVar = (f0.c) obj;
                C2525u c2525u = (C2525u) this.f19446m;
                if (cVar.c() * c2525u.f20314B < 0.0f || C1991e.c(cVar.f16923k.d()) <= 0.0f) {
                    return cVar.a(C2522q.f20291m);
                }
                float f6 = 2;
                float min = Math.min(W0.f.a(c2525u.f20314B, 0.0f) ? 1.0f : (float) Math.ceil(cVar.c() * c2525u.f20314B), (float) Math.ceil(C1991e.c(cVar.f16923k.d()) / f6));
                float f7 = min / f6;
                long d6 = G4.d.d(f7, f7);
                long d7 = AbstractC0444a.d(C1991e.d(cVar.f16923k.d()) - min, C1991e.b(cVar.f16923k.d()) - min);
                float f8 = min * f6;
                boolean z5 = f8 > C1991e.c(cVar.f16923k.d());
                i0.D a5 = c2525u.f20316D.a(cVar.f16923k.d(), cVar.f16923k.getLayoutDirection(), cVar);
                if (!(a5 instanceof C1994A)) {
                    if (!(a5 instanceof i0.C)) {
                        boolean z6 = z5;
                        if (!(a5 instanceof C1995B)) {
                            throw new D2.e();
                        }
                        M m5 = c2525u.f20315C;
                        if (z6) {
                            d6 = 0;
                        }
                        long j6 = d6;
                        if (z6) {
                            d7 = cVar.f16923k.d();
                        }
                        return cVar.a(new C2380B(m5, j6, d7, z6 ? C2027g.f17547b : new C2028h(min, 0.0f, 0, 0, 30), 1));
                    }
                    M m6 = c2525u.f20315C;
                    C1990d c1990d = ((i0.C) a5).f17220a;
                    if (N4.b.I(c1990d)) {
                        return cVar.a(new C2524t(z5, m6, c1990d.f17201e, f7, min, d6, d7, new C2028h(min, 0.0f, 0, 0, 30)));
                    }
                    boolean z7 = z5;
                    if (c2525u.f20313A == null) {
                        c2525u.f20313A = new C2521p();
                    }
                    C2521p c2521p = c2525u.f20313A;
                    kotlin.jvm.internal.l.c(c2521p);
                    C2003h c2003h = c2521p.f20290d;
                    if (c2003h == null) {
                        c2003h = AbstractC2005j.a();
                        c2521p.f20290d = c2003h;
                    }
                    c2003h.c();
                    AbstractC0467k.g(c2003h, c1990d);
                    if (!z7) {
                        C2003h a6 = AbstractC2005j.a();
                        AbstractC0467k.g(a6, new C1990d(min, min, c1990d.b() - min, c1990d.a() - min, v.r.e(min, c1990d.f17201e), v.r.e(min, c1990d.f), v.r.e(min, c1990d.f17202g), v.r.e(min, c1990d.f17203h)));
                        c2003h.b(c2003h, a6, 0);
                    }
                    return cVar.a(new K(10, c2003h, m6));
                }
                M m7 = c2525u.f20315C;
                C1994A c1994a = (C1994A) a5;
                if (z5) {
                    return cVar.a(new K(9, c1994a, m7));
                }
                if (AbstractC2107A.A(m7)) {
                    c2006k = new C2006k(5, m7.f17262e);
                    i = 1;
                } else {
                    i = 0;
                    c2006k = null;
                }
                C2003h c2003h2 = c1994a.f17218a;
                C1989c a7 = c2003h2.a();
                if (c2525u.f20313A == null) {
                    c2525u.f20313A = new C2521p();
                }
                C2521p c2521p2 = c2525u.f20313A;
                kotlin.jvm.internal.l.c(c2521p2);
                C2003h c2003h3 = c2521p2.f20290d;
                if (c2003h3 == null) {
                    c2003h3 = AbstractC2005j.a();
                    c2521p2.f20290d = c2003h3;
                }
                c2003h3.c();
                float f9 = a7.f17193a;
                boolean isNaN = Float.isNaN(f9);
                float f10 = a7.f17196d;
                float f11 = a7.f17195c;
                float f12 = a7.f17194b;
                if (isNaN || Float.isNaN(f12) || Float.isNaN(f11) || Float.isNaN(f10)) {
                    AbstractC2005j.b("Invalid rectangle, make sure no value is NaN");
                }
                if (c2003h3.f17280b == null) {
                    c2003h3.f17280b = new RectF();
                }
                RectF rectF = c2003h3.f17280b;
                kotlin.jvm.internal.l.c(rectF);
                rectF.set(f9, f12, f11, f10);
                RectF rectF2 = c2003h3.f17280b;
                kotlin.jvm.internal.l.c(rectF2);
                c2003h3.f17279a.addRect(rectF2, Path.Direction.CCW);
                c2003h3.b(c2003h3, c2003h2, 0);
                kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
                float f13 = a7.f17195c;
                float f14 = a7.f17193a;
                float f15 = a7.f17196d;
                float f16 = a7.f17194b;
                long b3 = AbstractC0444a.b((int) Math.ceil(f13 - f14), (int) Math.ceil(f15 - f16));
                C2521p c2521p3 = c2525u.f20313A;
                kotlin.jvm.internal.l.c(c2521p3);
                C2001f c2001f = c2521p3.f20287a;
                C1997b c1997b = c2521p3.f20288b;
                if (c2001f != null) {
                    c2006k2 = c2006k;
                    wVar = new i0.w(c2001f.a());
                } else {
                    c2006k2 = c2006k;
                    wVar = null;
                }
                try {
                    try {
                        if (wVar == null || wVar.f17300a != 0) {
                            i0.w wVar3 = c2001f != null ? new i0.w(c2001f.a()) : null;
                            if (!AbstractC2107A.A(wVar3) || i != wVar3.f17300a) {
                                z3 = false;
                                if (c2001f != null && c1997b != null) {
                                    d5 = C1991e.d(cVar.f16923k.d());
                                    bitmap = c2001f.f17276a;
                                    if (d5 <= bitmap.getWidth() && C1991e.b(cVar.f16923k.d()) <= bitmap.getHeight() && z3) {
                                        j5 = b3;
                                        c2022b = c2521p3.f20289c;
                                        if (c2022b == null) {
                                            c2022b = new C2022b();
                                            c2521p3.f20289c = c2022b;
                                        }
                                        long d02 = AbstractC0444a.d0(j5);
                                        W0.m layoutDirection = cVar.f16923k.getLayoutDirection();
                                        C2021a c2021a = c2022b.f17539k;
                                        W0.c cVar2 = c2021a.f17535a;
                                        C2022b c2022b2 = c2022b;
                                        W0.m mVar = c2021a.f17536b;
                                        C2003h c2003h4 = c2003h3;
                                        InterfaceC2009n interfaceC2009n = c2021a.f17537c;
                                        long j7 = c2021a.f17538d;
                                        c2021a.f17535a = cVar;
                                        c2021a.f17536b = layoutDirection;
                                        c2021a.f17537c = c1997b;
                                        c2021a.f17538d = d02;
                                        c1997b.k();
                                        AbstractC0467k.m(c2022b2, i0.p.f17289b, d02, 58);
                                        f = -f14;
                                        f5 = -f16;
                                        eVar = c2022b2.f17540l;
                                        ((C2023c) eVar.f20432l).B(f, f5);
                                        AbstractC0467k.k(c2022b2, c1994a.f17218a, m7, 0.0f, new C2028h(f8, 0.0f, 0, 0, 30), 52);
                                        float f17 = 1;
                                        float d8 = (C1991e.d(eVar.A()) + f17) / C1991e.d(eVar.A());
                                        float b5 = (C1991e.b(eVar.A()) + f17) / C1991e.b(eVar.A());
                                        long Q5 = c2022b2.Q();
                                        C2001f c2001f2 = c2001f;
                                        A3 = eVar.A();
                                        eVar.v().k();
                                        C1997b c1997b2 = c1997b;
                                        ((C2023c) eVar.f20432l).z(d8, b5, Q5);
                                        AbstractC0467k.k(c2022b2, c2003h4, m7, 0.0f, null, 28);
                                        ((C2023c) eVar.f20432l).B(-f, -f5);
                                        c1997b2.j();
                                        c2021a.f17535a = cVar2;
                                        c2021a.f17536b = mVar;
                                        c2021a.f17537c = interfaceC2009n;
                                        c2021a.f17538d = j7;
                                        c2001f2.f17276a.prepareToDraw();
                                        wVar2.f17624k = c2001f2;
                                        return cVar.a(new C2523s(a7, wVar2, j5, c2006k2));
                                    }
                                }
                                j5 = b3;
                                c2001f = i0.F.f((int) (b3 >> 32), (int) (j5 & 4294967295L), i);
                                c2521p3.f20287a = c2001f;
                                c1997b = i0.F.a(c2001f);
                                c2521p3.f20288b = c1997b;
                                c2022b = c2521p3.f20289c;
                                if (c2022b == null) {
                                }
                                long d022 = AbstractC0444a.d0(j5);
                                W0.m layoutDirection2 = cVar.f16923k.getLayoutDirection();
                                C2021a c2021a2 = c2022b.f17539k;
                                W0.c cVar22 = c2021a2.f17535a;
                                C2022b c2022b22 = c2022b;
                                W0.m mVar2 = c2021a2.f17536b;
                                C2003h c2003h42 = c2003h3;
                                InterfaceC2009n interfaceC2009n2 = c2021a2.f17537c;
                                long j72 = c2021a2.f17538d;
                                c2021a2.f17535a = cVar;
                                c2021a2.f17536b = layoutDirection2;
                                c2021a2.f17537c = c1997b;
                                c2021a2.f17538d = d022;
                                c1997b.k();
                                AbstractC0467k.m(c2022b22, i0.p.f17289b, d022, 58);
                                f = -f14;
                                f5 = -f16;
                                eVar = c2022b22.f17540l;
                                ((C2023c) eVar.f20432l).B(f, f5);
                                AbstractC0467k.k(c2022b22, c1994a.f17218a, m7, 0.0f, new C2028h(f8, 0.0f, 0, 0, 30), 52);
                                float f172 = 1;
                                float d82 = (C1991e.d(eVar.A()) + f172) / C1991e.d(eVar.A());
                                float b52 = (C1991e.b(eVar.A()) + f172) / C1991e.b(eVar.A());
                                long Q52 = c2022b22.Q();
                                C2001f c2001f22 = c2001f;
                                A3 = eVar.A();
                                eVar.v().k();
                                C1997b c1997b22 = c1997b;
                                ((C2023c) eVar.f20432l).z(d82, b52, Q52);
                                AbstractC0467k.k(c2022b22, c2003h42, m7, 0.0f, null, 28);
                                ((C2023c) eVar.f20432l).B(-f, -f5);
                                c1997b22.j();
                                c2021a2.f17535a = cVar22;
                                c2021a2.f17536b = mVar2;
                                c2021a2.f17537c = interfaceC2009n2;
                                c2021a2.f17538d = j72;
                                c2001f22.f17276a.prepareToDraw();
                                wVar2.f17624k = c2001f22;
                                return cVar.a(new C2523s(a7, wVar2, j5, c2006k2));
                            }
                        }
                        if (c2001f != null) {
                            d5 = C1991e.d(cVar.f16923k.d());
                            bitmap = c2001f.f17276a;
                            if (d5 <= bitmap.getWidth()) {
                                j5 = b3;
                                c2022b = c2521p3.f20289c;
                                if (c2022b == null) {
                                }
                                long d0222 = AbstractC0444a.d0(j5);
                                W0.m layoutDirection22 = cVar.f16923k.getLayoutDirection();
                                C2021a c2021a22 = c2022b.f17539k;
                                W0.c cVar222 = c2021a22.f17535a;
                                C2022b c2022b222 = c2022b;
                                W0.m mVar22 = c2021a22.f17536b;
                                C2003h c2003h422 = c2003h3;
                                InterfaceC2009n interfaceC2009n22 = c2021a22.f17537c;
                                long j722 = c2021a22.f17538d;
                                c2021a22.f17535a = cVar;
                                c2021a22.f17536b = layoutDirection22;
                                c2021a22.f17537c = c1997b;
                                c2021a22.f17538d = d0222;
                                c1997b.k();
                                AbstractC0467k.m(c2022b222, i0.p.f17289b, d0222, 58);
                                f = -f14;
                                f5 = -f16;
                                eVar = c2022b222.f17540l;
                                ((C2023c) eVar.f20432l).B(f, f5);
                                AbstractC0467k.k(c2022b222, c1994a.f17218a, m7, 0.0f, new C2028h(f8, 0.0f, 0, 0, 30), 52);
                                float f1722 = 1;
                                float d822 = (C1991e.d(eVar.A()) + f1722) / C1991e.d(eVar.A());
                                float b522 = (C1991e.b(eVar.A()) + f1722) / C1991e.b(eVar.A());
                                long Q522 = c2022b222.Q();
                                C2001f c2001f222 = c2001f;
                                A3 = eVar.A();
                                eVar.v().k();
                                C1997b c1997b222 = c1997b;
                                ((C2023c) eVar.f20432l).z(d822, b522, Q522);
                                AbstractC0467k.k(c2022b222, c2003h422, m7, 0.0f, null, 28);
                                ((C2023c) eVar.f20432l).B(-f, -f5);
                                c1997b222.j();
                                c2021a22.f17535a = cVar222;
                                c2021a22.f17536b = mVar22;
                                c2021a22.f17537c = interfaceC2009n22;
                                c2021a22.f17538d = j722;
                                c2001f222.f17276a.prepareToDraw();
                                wVar2.f17624k = c2001f222;
                                return cVar.a(new C2523s(a7, wVar2, j5, c2006k2));
                            }
                        }
                        ((C2023c) eVar.f20432l).z(d822, b522, Q522);
                        AbstractC0467k.k(c2022b222, c2003h422, m7, 0.0f, null, 28);
                        ((C2023c) eVar.f20432l).B(-f, -f5);
                        c1997b222.j();
                        c2021a22.f17535a = cVar222;
                        c2021a22.f17536b = mVar22;
                        c2021a22.f17537c = interfaceC2009n22;
                        c2021a22.f17538d = j722;
                        c2001f222.f17276a.prepareToDraw();
                        wVar2.f17624k = c2001f222;
                        return cVar.a(new C2523s(a7, wVar2, j5, c2006k2));
                    } finally {
                        eVar.v().j();
                        eVar.P(A3);
                    }
                    AbstractC0467k.k(c2022b222, c1994a.f17218a, m7, 0.0f, new C2028h(f8, 0.0f, 0, 0, 30), 52);
                    float f17222 = 1;
                    float d8222 = (C1991e.d(eVar.A()) + f17222) / C1991e.d(eVar.A());
                    float b5222 = (C1991e.b(eVar.A()) + f17222) / C1991e.b(eVar.A());
                    long Q5222 = c2022b222.Q();
                    C2001f c2001f2222 = c2001f;
                    A3 = eVar.A();
                    eVar.v().k();
                    C1997b c1997b2222 = c1997b;
                } catch (Throwable th2) {
                    ((C2023c) eVar.f20432l).B(-f, -f5);
                    throw th2;
                }
                z3 = true;
                j5 = b3;
                c2001f = i0.F.f((int) (b3 >> 32), (int) (j5 & 4294967295L), i);
                c2521p3.f20287a = c2001f;
                c1997b = i0.F.a(c2001f);
                c2521p3.f20288b = c1997b;
                c2022b = c2521p3.f20289c;
                if (c2022b == null) {
                }
                long d02222 = AbstractC0444a.d0(j5);
                W0.m layoutDirection222 = cVar.f16923k.getLayoutDirection();
                C2021a c2021a222 = c2022b.f17539k;
                W0.c cVar2222 = c2021a222.f17535a;
                C2022b c2022b2222 = c2022b;
                W0.m mVar222 = c2021a222.f17536b;
                C2003h c2003h4222 = c2003h3;
                InterfaceC2009n interfaceC2009n222 = c2021a222.f17537c;
                long j7222 = c2021a222.f17538d;
                c2021a222.f17535a = cVar;
                c2021a222.f17536b = layoutDirection222;
                c2021a222.f17537c = c1997b;
                c2021a222.f17538d = d02222;
                c1997b.k();
                AbstractC0467k.m(c2022b2222, i0.p.f17289b, d02222, 58);
                f = -f14;
                f5 = -f16;
                eVar = c2022b2222.f17540l;
                ((C2023c) eVar.f20432l).B(f, f5);
                break;
            case 2:
                long j8 = ((C1988b) obj).f17191a;
                C2503A c2503a = (C2503A) this.f19446m;
                if (c2503a.f20125E) {
                    c2503a.f20126F.invoke();
                }
                return W3.o.f6046a;
            case 3:
                float floatValue = ((Number) obj).floatValue();
                v0 v0Var = (v0) this.f19446m;
                float h3 = v0Var.f20322a.h() + floatValue + v0Var.f20326e;
                float s2 = AbstractC0444a.s(h3, 0.0f, v0Var.f20325d.h());
                boolean z8 = h3 == s2;
                C0299j0 c0299j0 = v0Var.f20322a;
                float h4 = s2 - c0299j0.h();
                int round = Math.round(h4);
                c0299j0.i(c0299j0.h() + round);
                v0Var.f20326e = h4 - round;
                if (!z8) {
                    floatValue = h4;
                }
                return Float.valueOf(floatValue);
            case 4:
                ((w.m) this.f19446m).f20478a.setValue(new w.k(((C1988b) obj).f17191a));
                return W3.o.f6046a;
            case 5:
                ((C0096e0) this.f19446m).invoke();
                return W3.o.f6046a;
            case 6:
                ((C2589k0) this.f19446m).f20812P.f20792C = (InterfaceC2637x) obj;
                return W3.o.f6046a;
            case 7:
                long j9 = ((C1988b) obj).f17191a;
                C2604s0 c2604s0 = (C2604s0) this.f19446m;
                return new C1988b(C2604s0.a(c2604s0, c2604s0.f20869h, j9, c2604s0.f20868g));
            case 8:
                InterfaceC2742a interfaceC2742a = (InterfaceC2742a) obj;
                if (interfaceC2742a.A()) {
                    if (interfaceC2742a.a().f21641b) {
                        interfaceC2742a.v();
                    }
                    Iterator it = interfaceC2742a.a().f21645g.entrySet().iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        C2732H c2732h = (C2732H) this.f19446m;
                        if (hasNext) {
                            Map.Entry entry = (Map.Entry) it.next();
                            C2732H.a(c2732h, (C2628n) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC2742a.r());
                        } else {
                            e0 e0Var = interfaceC2742a.r().f21795A;
                            kotlin.jvm.internal.l.c(e0Var);
                            while (!e0Var.equals(c2732h.f21640a.r())) {
                                for (C2628n c2628n : c2732h.b(e0Var).keySet()) {
                                    C2732H.a(c2732h, c2628n, c2732h.c(e0Var, c2628n), e0Var);
                                }
                                e0Var = e0Var.f21795A;
                                kotlin.jvm.internal.l.c(e0Var);
                            }
                        }
                    }
                }
                return W3.o.f6046a;
            default:
                ((R.e) this.f19446m).c((b0.n) obj);
                return Boolean.TRUE;
        }
    }
}
