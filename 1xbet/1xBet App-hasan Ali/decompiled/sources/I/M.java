package I;

import A0.o1;
import E.F0;
import E.InterfaceC0104i0;
import E.Z;
import P.C0305m0;
import a.AbstractC0444a;
import h0.C1988b;
import p0.InterfaceC2241a;

/* loaded from: classes.dex */
public final class M implements InterfaceC0104i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f2420b;

    public /* synthetic */ M(O o5, int i) {
        this.f2419a = i;
        this.f2420b = o5;
    }

    @Override // E.InterfaceC0104i0
    public final void a() {
        switch (this.f2419a) {
            case 0:
                O o5 = this.f2420b;
                o5.f2435o.setValue(null);
                o5.f2436p.setValue(null);
                break;
            default:
                i();
                break;
        }
    }

    @Override // E.InterfaceC0104i0
    public final void b() {
        switch (this.f2419a) {
            case 0:
                O o5 = this.f2420b;
                o5.f2435o.setValue(null);
                o5.f2436p.setValue(null);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r15v10, types: [i4.c, kotlin.jvm.internal.m] */
    @Override // E.InterfaceC0104i0
    public final void c(long j5) {
        F0 d5;
        long j6;
        F0 d6;
        F0 d7;
        switch (this.f2419a) {
            case 0:
                O o5 = this.f2420b;
                long i = o5.i(true);
                float f = A.f2382a;
                long d8 = G4.d.d(C1988b.d(i), C1988b.e(i) - 1.0f);
                Z z3 = o5.f2426d;
                if (z3 != null && (d5 = z3.d()) != null) {
                    long e3 = d5.e(d8);
                    o5.f2432l = e3;
                    o5.f2436p.setValue(new C1988b(e3));
                    o5.f2434n = 0L;
                    o5.f2435o.setValue(E.N.f1060k);
                    o5.p(false);
                    break;
                }
                break;
            default:
                O o6 = this.f2420b;
                if (o6.h()) {
                    C0305m0 c0305m0 = o6.f2435o;
                    if (((E.N) c0305m0.getValue()) == null) {
                        c0305m0.setValue(E.N.f1062m);
                        o6.f2437q = -1;
                        o6.k();
                        Z z5 = o6.f2426d;
                        if (z5 == null || (d7 = z5.d()) == null || !d7.c(j5)) {
                            j6 = j5;
                            Z z6 = o6.f2426d;
                            if (z6 != null && (d6 = z6.d()) != null) {
                                int a5 = o6.f2424b.a(d6.b(j6, true));
                                P0.w c5 = O.c(o6.j().f4679a, K0.F.b(a5, a5));
                                o6.f(false);
                                InterfaceC2241a interfaceC2241a = o6.f2429h;
                                if (interfaceC2241a != null) {
                                    interfaceC2241a.a();
                                }
                                o6.f2425c.c(c5);
                            }
                        } else if (o6.j().f4679a.f2829l.length() != 0) {
                            o6.f(false);
                            j6 = j5;
                            o6.f2433m = Integer.valueOf((int) (O.a(o6, P0.w.a(o6.j(), null, K0.N.f2801b, 5), j6, true, false, C0163p.f2511e, true) >> 32));
                        }
                        o6.n(E.O.f1064k);
                        o6.f2432l = j6;
                        o6.f2436p.setValue(new C1988b(j6));
                        o6.f2434n = 0L;
                        break;
                    }
                }
                break;
        }
    }

    @Override // E.InterfaceC0104i0
    public final void d() {
        int i = this.f2419a;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [i4.c, kotlin.jvm.internal.m] */
    @Override // E.InterfaceC0104i0
    public final void e(long j5) {
        F0 d5;
        InterfaceC2241a interfaceC2241a;
        F0 d6;
        switch (this.f2419a) {
            case 0:
                O o5 = this.f2420b;
                o5.f2434n = C1988b.h(o5.f2434n, j5);
                Z z3 = o5.f2426d;
                if (z3 != null && (d5 = z3.d()) != null) {
                    o5.f2436p.setValue(new C1988b(C1988b.h(o5.f2432l, o5.f2434n)));
                    P0.q qVar = o5.f2424b;
                    C1988b g5 = o5.g();
                    kotlin.jvm.internal.l.c(g5);
                    int a5 = qVar.a(d5.b(g5.f17191a, true));
                    long b3 = K0.F.b(a5, a5);
                    if (!K0.N.a(b3, o5.j().f4680b)) {
                        Z z5 = o5.f2426d;
                        if ((z5 == null || ((Boolean) z5.f1102q.getValue()).booleanValue()) && (interfaceC2241a = o5.f2429h) != null) {
                            interfaceC2241a.a();
                        }
                        o5.f2425c.c(O.c(o5.j().f4679a, b3));
                        break;
                    }
                }
                break;
            default:
                O o6 = this.f2420b;
                if (o6.h() && o6.j().f4679a.f2829l.length() != 0) {
                    o6.f2434n = C1988b.h(o6.f2434n, j5);
                    Z z6 = o6.f2426d;
                    if (z6 != null && (d6 = z6.d()) != null) {
                        o6.f2436p.setValue(new C1988b(C1988b.h(o6.f2432l, o6.f2434n)));
                        Integer num = o6.f2433m;
                        o1 o1Var = C0163p.f2511e;
                        if (num == null) {
                            C1988b g6 = o6.g();
                            kotlin.jvm.internal.l.c(g6);
                            if (!d6.c(g6.f17191a)) {
                                int a6 = o6.f2424b.a(d6.b(o6.f2432l, true));
                                P0.q qVar2 = o6.f2424b;
                                C1988b g7 = o6.g();
                                kotlin.jvm.internal.l.c(g7);
                                if (a6 == qVar2.a(d6.b(g7.f17191a, true))) {
                                    o1Var = C0163p.f2510d;
                                }
                                P0.w j6 = o6.j();
                                C1988b g8 = o6.g();
                                kotlin.jvm.internal.l.c(g8);
                                O.a(o6, j6, g8.f17191a, false, false, o1Var, true);
                                int i = K0.N.f2802c;
                            }
                        }
                        Integer num2 = o6.f2433m;
                        int intValue = num2 != null ? num2.intValue() : d6.b(o6.f2432l, false);
                        C1988b g9 = o6.g();
                        kotlin.jvm.internal.l.c(g9);
                        int b5 = d6.b(g9.f17191a, false);
                        if (o6.f2433m != null || intValue != b5) {
                            P0.w j7 = o6.j();
                            C1988b g10 = o6.g();
                            kotlin.jvm.internal.l.c(g10);
                            O.a(o6, j7, g10.f17191a, false, false, o1Var, true);
                            int i5 = K0.N.f2802c;
                        }
                    }
                    o6.p(false);
                    break;
                }
                break;
        }
    }

    public void i() {
        O o5 = this.f2420b;
        o5.f2435o.setValue(null);
        o5.f2436p.setValue(null);
        o5.p(true);
        o5.f2433m = null;
        boolean b3 = K0.N.b(o5.j().f4680b);
        o5.n(b3 ? E.O.f1066m : E.O.f1065l);
        Z z3 = o5.f2426d;
        if (z3 != null) {
            z3.f1098m.setValue(Boolean.valueOf(!b3 && AbstractC0444a.R(o5, true)));
        }
        Z z5 = o5.f2426d;
        if (z5 != null) {
            z5.f1099n.setValue(Boolean.valueOf(!b3 && AbstractC0444a.R(o5, false)));
        }
        Z z6 = o5.f2426d;
        if (z6 == null) {
            return;
        }
        z6.f1100o.setValue(Boolean.valueOf(b3 && AbstractC0444a.R(o5, true)));
    }

    @Override // E.InterfaceC0104i0
    public final void onCancel() {
        switch (this.f2419a) {
            case 0:
                break;
            default:
                i();
                break;
        }
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void j() {
    }
}
