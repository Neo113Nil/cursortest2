package u;

import E.C0106k;
import P.AbstractC0329z;
import P.C0301k0;
import P.C0302l;
import P.C0305m0;
import P.C0315s;
import P.C0326x0;
import P.S0;
import k4.AbstractC2036a;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final J2.a f19937a;

    /* renamed from: b, reason: collision with root package name */
    public final t0 f19938b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19939c;

    /* renamed from: d, reason: collision with root package name */
    public final C0305m0 f19940d;

    /* renamed from: e, reason: collision with root package name */
    public final C0305m0 f19941e;
    public final C0301k0 f = new C0301k0(0);

    /* renamed from: g, reason: collision with root package name */
    public final C0301k0 f19942g = new C0301k0(Long.MIN_VALUE);

    /* renamed from: h, reason: collision with root package name */
    public final C0305m0 f19943h;
    public final Z.p i;

    /* renamed from: j, reason: collision with root package name */
    public final Z.p f19944j;

    /* renamed from: k, reason: collision with root package name */
    public final C0305m0 f19945k;

    /* renamed from: l, reason: collision with root package name */
    public final P.H f19946l;

    public t0(J2.a aVar, t0 t0Var, String str) {
        this.f19937a = aVar;
        this.f19938b = t0Var;
        this.f19939c = str;
        this.f19940d = AbstractC0329z.t(aVar.e());
        this.f19941e = AbstractC0329z.t(new q0(aVar.e(), aVar.e()));
        Boolean bool = Boolean.FALSE;
        this.f19943h = AbstractC0329z.t(bool);
        this.i = new Z.p();
        this.f19944j = new Z.p();
        this.f19945k = AbstractC0329z.t(bool);
        this.f19946l = AbstractC0329z.o(new t.o(this, 1));
        aVar.i(this);
    }

    public final void a(Object obj, C0315s c0315s, int i) {
        c0315s.Z(-1493585151);
        int i5 = (c0315s.f(obj) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i5 |= c0315s.f(this) ? 32 : 16;
        }
        if ((i5 & 19) == 18 && c0315s.B()) {
            c0315s.S();
        } else if (g()) {
            c0315s.X(1823992347);
            c0315s.q(false);
        } else {
            c0315s.X(1822507602);
            q(obj);
            if (kotlin.jvm.internal.l.a(obj, this.f19937a.e())) {
                C0301k0 c0301k0 = this.f19942g;
                if (((S0) Z.l.u(c0301k0.f4479l, c0301k0)).f4395c == Long.MIN_VALUE && !((Boolean) this.f19943h.getValue()).booleanValue()) {
                    c0315s.X(1823982427);
                    c0315s.q(false);
                    c0315s.q(false);
                }
            }
            c0315s.X(1822738893);
            Object M5 = c0315s.M();
            P.Z z3 = C0302l.f4480a;
            if (M5 == z3) {
                P.C c5 = new P.C(AbstractC0329z.m(c0315s));
                c0315s.i0(c5);
                M5 = c5;
            }
            InterfaceC2280u interfaceC2280u = ((P.C) M5).f4253k;
            boolean h3 = ((i5 & 112) == 32) | c0315s.h(interfaceC2280u);
            Object M6 = c0315s.M();
            if (h3 || M6 == z3) {
                M6 = new i0.K(5, interfaceC2280u, this);
                c0315s.i0(M6);
            }
            AbstractC0329z.d(interfaceC2280u, this, (i4.c) M6, c0315s);
            c0315s.q(false);
            c0315s.q(false);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0106k(i, 2, this, obj);
        }
    }

    public final long b() {
        Z.p pVar = this.i;
        int size = pVar.size();
        long j5 = 0;
        for (int i = 0; i < size; i++) {
            C0301k0 c0301k0 = ((r0) pVar.get(i)).f19910v;
            j5 = Math.max(j5, ((S0) Z.l.u(c0301k0.f4479l, c0301k0)).f4395c);
        }
        Z.p pVar2 = this.f19944j;
        int size2 = pVar2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            j5 = Math.max(j5, ((t0) pVar2.get(i5)).b());
        }
        return j5;
    }

    public final void c() {
        Z.p pVar = this.i;
        int size = pVar.size();
        for (int i = 0; i < size; i++) {
            r0 r0Var = (r0) pVar.get(i);
            r0Var.f19904p = null;
            r0Var.f19903o = null;
            r0Var.f19907s = false;
        }
        Z.p pVar2 = this.f19944j;
        int size2 = pVar2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ((t0) pVar2.get(i5)).c();
        }
    }

    public final boolean d() {
        Z.p pVar = this.i;
        int size = pVar.size();
        for (int i = 0; i < size; i++) {
            if (((r0) pVar.get(i)).f19903o != null) {
                return true;
            }
        }
        Z.p pVar2 = this.f19944j;
        int size2 = pVar2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            if (((t0) pVar2.get(i5)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        t0 t0Var = this.f19938b;
        if (t0Var != null) {
            return t0Var.e();
        }
        C0301k0 c0301k0 = this.f;
        return ((S0) Z.l.u(c0301k0.f4479l, c0301k0)).f4395c;
    }

    public final p0 f() {
        return (p0) this.f19941e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.f19945k.getValue()).booleanValue();
    }

    public final void h(long j5, boolean z3) {
        C0301k0 c0301k0 = this.f19942g;
        long j6 = ((S0) Z.l.u(c0301k0.f4479l, c0301k0)).f4395c;
        J2.a aVar = this.f19937a;
        if (j6 == Long.MIN_VALUE) {
            c0301k0.h(j5);
            ((C0305m0) aVar.f2693a).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((C0305m0) aVar.f2693a).getValue()).booleanValue()) {
            ((C0305m0) aVar.f2693a).setValue(Boolean.TRUE);
        }
        this.f19943h.setValue(Boolean.FALSE);
        Z.p pVar = this.i;
        int size = pVar.size();
        boolean z5 = true;
        for (int i = 0; i < size; i++) {
            r0 r0Var = (r0) pVar.get(i);
            boolean booleanValue = ((Boolean) r0Var.f19905q.getValue()).booleanValue();
            C0305m0 c0305m0 = r0Var.f19905q;
            if (!booleanValue) {
                long d5 = z3 ? r0Var.b().d() : j5;
                r0Var.e(r0Var.b().c(d5));
                r0Var.f19909u = r0Var.b().g(d5);
                m0 b3 = r0Var.b();
                b3.getClass();
                if (AbstractC2462i.a(b3, d5)) {
                    c0305m0.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) c0305m0.getValue()).booleanValue()) {
                z5 = false;
            }
        }
        Z.p pVar2 = this.f19944j;
        int size2 = pVar2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            t0 t0Var = (t0) pVar2.get(i5);
            Object value = t0Var.f19940d.getValue();
            J2.a aVar2 = t0Var.f19937a;
            if (!kotlin.jvm.internal.l.a(value, aVar2.e())) {
                t0Var.h(j5, z3);
            }
            if (!kotlin.jvm.internal.l.a(t0Var.f19940d.getValue(), aVar2.e())) {
                z5 = false;
            }
        }
        if (z5) {
            i();
        }
    }

    public final void i() {
        this.f19942g.h(Long.MIN_VALUE);
        J2.a aVar = this.f19937a;
        if (aVar instanceof C2441L) {
            aVar.h(this.f19940d.getValue());
        }
        o(0L);
        ((C0305m0) aVar.f2693a).setValue(Boolean.FALSE);
        Z.p pVar = this.f19944j;
        int size = pVar.size();
        for (int i = 0; i < size; i++) {
            ((t0) pVar.get(i)).i();
        }
    }

    public final void j(float f) {
        Z.p pVar = this.i;
        int size = pVar.size();
        for (int i = 0; i < size; i++) {
            r0 r0Var = (r0) pVar.get(i);
            r0Var.getClass();
            if (f == -4.0f || f == -5.0f) {
                m0 m0Var = r0Var.f19904p;
                if (m0Var != null) {
                    r0Var.b().a(m0Var.f19876c);
                    r0Var.f19903o = null;
                    r0Var.f19904p = null;
                }
                Object obj = f == -4.0f ? r0Var.b().f19877d : r0Var.b().f19876c;
                r0Var.b().a(obj);
                r0Var.b().i(obj);
                r0Var.e(obj);
                r0Var.f19910v.h(r0Var.b().d());
            } else {
                r0Var.f19906r.i(f);
            }
        }
        Z.p pVar2 = this.f19944j;
        int size2 = pVar2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ((t0) pVar2.get(i5)).j(f);
        }
    }

    public final void k() {
        Z.p pVar = this.i;
        int size = pVar.size();
        for (int i = 0; i < size; i++) {
            ((r0) pVar.get(i)).f19906r.i(-2.0f);
        }
        Z.p pVar2 = this.f19944j;
        int size2 = pVar2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ((t0) pVar2.get(i5)).k();
        }
    }

    public final void l(Object obj, Object obj2) {
        this.f19942g.h(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        J2.a aVar = this.f19937a;
        ((C0305m0) aVar.f2693a).setValue(bool);
        boolean g5 = g();
        C0305m0 c0305m0 = this.f19940d;
        if (!g5 || !kotlin.jvm.internal.l.a(aVar.e(), obj) || !kotlin.jvm.internal.l.a(c0305m0.getValue(), obj2)) {
            if (!kotlin.jvm.internal.l.a(aVar.e(), obj) && (aVar instanceof C2441L)) {
                aVar.h(obj);
            }
            c0305m0.setValue(obj2);
            this.f19945k.setValue(Boolean.TRUE);
            this.f19941e.setValue(new q0(obj, obj2));
        }
        Z.p pVar = this.f19944j;
        int size = pVar.size();
        for (int i = 0; i < size; i++) {
            t0 t0Var = (t0) pVar.get(i);
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>", t0Var);
            if (t0Var.g()) {
                t0Var.l(t0Var.f19937a.e(), t0Var.f19940d.getValue());
            }
        }
        Z.p pVar2 = this.i;
        int size2 = pVar2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ((r0) pVar2.get(i5)).d(0L);
        }
    }

    public final void m(long j5) {
        C0301k0 c0301k0 = this.f19942g;
        if (((S0) Z.l.u(c0301k0.f4479l, c0301k0)).f4395c == Long.MIN_VALUE) {
            c0301k0.h(j5);
        }
        o(j5);
        this.f19943h.setValue(Boolean.FALSE);
        Z.p pVar = this.i;
        int size = pVar.size();
        for (int i = 0; i < size; i++) {
            ((r0) pVar.get(i)).d(j5);
        }
        Z.p pVar2 = this.f19944j;
        int size2 = pVar2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            t0 t0Var = (t0) pVar2.get(i5);
            if (!kotlin.jvm.internal.l.a(t0Var.f19940d.getValue(), t0Var.f19937a.e())) {
                t0Var.m(j5);
            }
        }
    }

    public final void n(C2446Q c2446q) {
        Z.p pVar = this.i;
        int size = pVar.size();
        for (int i = 0; i < size; i++) {
            r0 r0Var = (r0) pVar.get(i);
            if (!kotlin.jvm.internal.l.a(r0Var.b().f19876c, r0Var.b().f19877d)) {
                r0Var.f19904p = r0Var.b();
                r0Var.f19903o = c2446q;
            }
            C0305m0 c0305m0 = r0Var.f19908t;
            r0Var.f19902n.setValue(new m0(r0Var.f19912x, r0Var.f19899k, c0305m0.getValue(), c0305m0.getValue(), r0Var.f19909u.c()));
            r0Var.f19910v.h(r0Var.b().d());
            r0Var.f19907s = true;
        }
        Z.p pVar2 = this.f19944j;
        int size2 = pVar2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ((t0) pVar2.get(i5)).n(c2446q);
        }
    }

    public final void o(long j5) {
        if (this.f19938b == null) {
            this.f.h(j5);
        }
    }

    public final void p() {
        m0 m0Var;
        Z.p pVar = this.i;
        int size = pVar.size();
        for (int i = 0; i < size; i++) {
            r0 r0Var = (r0) pVar.get(i);
            C2446Q c2446q = r0Var.f19903o;
            if (c2446q != null && (m0Var = r0Var.f19904p) != null) {
                long V4 = AbstractC2036a.V(c2446q.f19703g * c2446q.f19701d);
                Object c5 = m0Var.c(V4);
                if (r0Var.f19907s) {
                    r0Var.b().i(c5);
                }
                r0Var.b().a(c5);
                r0Var.f19910v.h(r0Var.b().d());
                if (r0Var.f19906r.h() == -2.0f || r0Var.f19907s) {
                    r0Var.e(c5);
                } else {
                    r0Var.d(r0Var.f19913y.e());
                }
                if (V4 >= c2446q.f19703g) {
                    r0Var.f19903o = null;
                    r0Var.f19904p = null;
                } else {
                    c2446q.f19700c = false;
                }
            }
        }
        Z.p pVar2 = this.f19944j;
        int size2 = pVar2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ((t0) pVar2.get(i5)).p();
        }
    }

    public final void q(Object obj) {
        C0305m0 c0305m0 = this.f19940d;
        if (kotlin.jvm.internal.l.a(c0305m0.getValue(), obj)) {
            return;
        }
        this.f19941e.setValue(new q0(c0305m0.getValue(), obj));
        J2.a aVar = this.f19937a;
        if (!kotlin.jvm.internal.l.a(aVar.e(), c0305m0.getValue())) {
            aVar.h(c0305m0.getValue());
        }
        c0305m0.setValue(obj);
        C0301k0 c0301k0 = this.f19942g;
        if (((S0) Z.l.u(c0301k0.f4479l, c0301k0)).f4395c == Long.MIN_VALUE) {
            this.f19943h.setValue(Boolean.TRUE);
        }
        k();
    }

    public final String toString() {
        Z.p pVar = this.i;
        int size = pVar.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((r0) pVar.get(i)) + ", ";
        }
        return str;
    }
}
