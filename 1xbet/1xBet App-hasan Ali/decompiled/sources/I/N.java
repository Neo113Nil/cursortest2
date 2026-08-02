package I;

import A0.o1;
import E.F0;
import E.InterfaceC0104i0;
import E.Z;
import h0.C1988b;

/* loaded from: classes.dex */
public final class N implements InterfaceC0104i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f2421a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2422b;

    public N(O o5, boolean z3) {
        this.f2421a = o5;
        this.f2422b = z3;
    }

    @Override // E.InterfaceC0104i0
    public final void a() {
        O o5 = this.f2421a;
        o5.f2435o.setValue(null);
        o5.f2436p.setValue(null);
        o5.p(true);
    }

    @Override // E.InterfaceC0104i0
    public final void b() {
        O o5 = this.f2421a;
        o5.f2435o.setValue(null);
        o5.f2436p.setValue(null);
        o5.p(true);
    }

    @Override // E.InterfaceC0104i0
    public final void d() {
        F0 d5;
        boolean z3 = this.f2422b;
        E.N n5 = z3 ? E.N.f1061l : E.N.f1062m;
        O o5 = this.f2421a;
        o5.f2435o.setValue(n5);
        long i = o5.i(z3);
        float f = A.f2382a;
        long d6 = G4.d.d(C1988b.d(i), C1988b.e(i) - 1.0f);
        Z z5 = o5.f2426d;
        if (z5 == null || (d5 = z5.d()) == null) {
            return;
        }
        long e3 = d5.e(d6);
        o5.f2432l = e3;
        o5.f2436p.setValue(new C1988b(e3));
        o5.f2434n = 0L;
        o5.f2437q = -1;
        Z z6 = o5.f2426d;
        if (z6 != null) {
            z6.f1102q.setValue(Boolean.TRUE);
        }
        o5.p(false);
    }

    @Override // E.InterfaceC0104i0
    public final void e(long j5) {
        O o5 = this.f2421a;
        long h3 = C1988b.h(o5.f2434n, j5);
        o5.f2434n = h3;
        o5.f2436p.setValue(new C1988b(C1988b.h(o5.f2432l, h3)));
        P0.w j6 = o5.j();
        C1988b g5 = o5.g();
        kotlin.jvm.internal.l.c(g5);
        o1 o1Var = C0163p.f2512g;
        O.a(o5, j6, g5.f17191a, false, this.f2422b, o1Var, true);
        o5.p(false);
    }

    @Override // E.InterfaceC0104i0
    public final void onCancel() {
    }

    @Override // E.InterfaceC0104i0
    public final void c(long j5) {
    }
}
