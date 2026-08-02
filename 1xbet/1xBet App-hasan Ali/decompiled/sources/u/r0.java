package u;

import P.AbstractC0329z;
import P.C0297i0;
import P.C0301k0;
import P.C0305m0;
import P.S0;
import P.d1;

/* loaded from: classes.dex */
public final class r0 implements d1 {

    /* renamed from: k, reason: collision with root package name */
    public final A0 f19899k;

    /* renamed from: l, reason: collision with root package name */
    public final C0305m0 f19900l;

    /* renamed from: m, reason: collision with root package name */
    public final C0305m0 f19901m;

    /* renamed from: n, reason: collision with root package name */
    public final C0305m0 f19902n;

    /* renamed from: o, reason: collision with root package name */
    public C2446Q f19903o;

    /* renamed from: p, reason: collision with root package name */
    public m0 f19904p;

    /* renamed from: q, reason: collision with root package name */
    public final C0305m0 f19905q;

    /* renamed from: r, reason: collision with root package name */
    public final C0297i0 f19906r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f19907s;

    /* renamed from: t, reason: collision with root package name */
    public final C0305m0 f19908t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC2470q f19909u;

    /* renamed from: v, reason: collision with root package name */
    public final C0301k0 f19910v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f19911w;

    /* renamed from: x, reason: collision with root package name */
    public final C2456e0 f19912x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ t0 f19913y;

    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, java.util.Map] */
    public r0(t0 t0Var, Object obj, AbstractC2470q abstractC2470q, A0 a02) {
        this.f19913y = t0Var;
        this.f19899k = a02;
        C0305m0 t5 = AbstractC0329z.t(obj);
        this.f19900l = t5;
        Object obj2 = null;
        this.f19901m = AbstractC0329z.t(AbstractC2453d.l(7, null));
        this.f19902n = AbstractC0329z.t(new m0(c(), a02, obj, t5.getValue(), abstractC2470q));
        this.f19905q = AbstractC0329z.t(Boolean.TRUE);
        this.f19906r = new C0297i0(-1.0f);
        this.f19908t = AbstractC0329z.t(obj);
        this.f19909u = abstractC2470q;
        this.f19910v = new C0301k0(b().d());
        Float f = (Float) G0.f19673a.get(a02);
        if (f != null) {
            float floatValue = f.floatValue();
            AbstractC2470q abstractC2470q2 = (AbstractC2470q) a02.f19643a.c(obj);
            int b3 = abstractC2470q2.b();
            for (int i = 0; i < b3; i++) {
                abstractC2470q2.e(i, floatValue);
            }
            obj2 = this.f19899k.f19644b.c(abstractC2470q2);
        }
        this.f19912x = AbstractC2453d.l(3, obj2);
    }

    public final m0 b() {
        return (m0) this.f19902n.getValue();
    }

    public final InterfaceC2430A c() {
        return (InterfaceC2430A) this.f19901m.getValue();
    }

    public final void d(long j5) {
        if (this.f19906r.h() == -1.0f) {
            this.f19911w = true;
            if (kotlin.jvm.internal.l.a(b().f19876c, b().f19877d)) {
                e(b().f19876c);
            } else {
                e(b().c(j5));
                this.f19909u = b().g(j5);
            }
        }
    }

    public final void e(Object obj) {
        this.f19908t.setValue(obj);
    }

    public final void f(Object obj, boolean z3) {
        m0 m0Var = this.f19904p;
        Object obj2 = m0Var != null ? m0Var.f19876c : null;
        C0305m0 c0305m0 = this.f19900l;
        boolean a5 = kotlin.jvm.internal.l.a(obj2, c0305m0.getValue());
        C0301k0 c0301k0 = this.f19910v;
        C0305m0 c0305m02 = this.f19902n;
        if (a5) {
            c0305m02.setValue(new m0(this.f19912x, this.f19899k, obj, obj, this.f19909u.c()));
            this.f19907s = true;
            c0301k0.h(b().d());
            return;
        }
        InterfaceC2430A c5 = (!z3 || this.f19911w) ? c() : c() instanceof C2456e0 ? c() : this.f19912x;
        t0 t0Var = this.f19913y;
        c0305m02.setValue(new m0(t0Var.e() <= 0 ? c5 : new C2458f0(c5, t0Var.e()), this.f19899k, obj, c0305m0.getValue(), this.f19909u));
        c0301k0.h(b().d());
        this.f19907s = false;
        Boolean bool = Boolean.TRUE;
        C0305m0 c0305m03 = t0Var.f19943h;
        c0305m03.setValue(bool);
        if (t0Var.g()) {
            Z.p pVar = t0Var.i;
            int size = pVar.size();
            long j5 = 0;
            for (int i = 0; i < size; i++) {
                r0 r0Var = (r0) pVar.get(i);
                C0301k0 c0301k02 = r0Var.f19910v;
                j5 = Math.max(j5, ((S0) Z.l.u(c0301k02.f4479l, c0301k02)).f4395c);
                r0Var.d(0L);
            }
            c0305m03.setValue(Boolean.FALSE);
        }
    }

    public final void g(Object obj, Object obj2, InterfaceC2430A interfaceC2430A) {
        this.f19900l.setValue(obj2);
        this.f19901m.setValue(interfaceC2430A);
        if (kotlin.jvm.internal.l.a(b().f19877d, obj) && kotlin.jvm.internal.l.a(b().f19876c, obj2)) {
            return;
        }
        f(obj, false);
    }

    @Override // P.d1
    public final Object getValue() {
        return this.f19908t.getValue();
    }

    public final void h(Object obj, InterfaceC2430A interfaceC2430A) {
        if (this.f19907s) {
            m0 m0Var = this.f19904p;
            if (kotlin.jvm.internal.l.a(obj, m0Var != null ? m0Var.f19876c : null)) {
                return;
            }
        }
        C0305m0 c0305m0 = this.f19900l;
        boolean a5 = kotlin.jvm.internal.l.a(c0305m0.getValue(), obj);
        C0297i0 c0297i0 = this.f19906r;
        if (a5 && c0297i0.h() == -1.0f) {
            return;
        }
        c0305m0.setValue(obj);
        this.f19901m.setValue(interfaceC2430A);
        Object value = c0297i0.h() == -3.0f ? obj : this.f19908t.getValue();
        C0305m0 c0305m02 = this.f19905q;
        f(value, !((Boolean) c0305m02.getValue()).booleanValue());
        c0305m02.setValue(Boolean.valueOf(c0297i0.h() == -3.0f));
        if (c0297i0.h() >= 0.0f) {
            e(b().c((long) (c0297i0.h() * b().d())));
        } else if (c0297i0.h() == -3.0f) {
            e(obj);
        }
        this.f19907s = false;
        c0297i0.i(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.f19908t.getValue() + ", target: " + this.f19900l.getValue() + ", spec: " + c();
    }
}
