package E;

import A0.C0014b1;
import A0.t1;
import P.C0305m0;
import a.AbstractC0444a;
import h0.C1989c;
import x0.InterfaceC2637x;

/* renamed from: E.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119y extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f1377l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f1378m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t1 f1379n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I.O f1380o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ P0.w f1381p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ P0.q f1382q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0119y(Z z3, boolean z5, t1 t1Var, I.O o5, P0.w wVar, P0.q qVar) {
        super(1);
        this.f1377l = z3;
        this.f1378m = z5;
        this.f1379n = t1Var;
        this.f1380o = o5;
        this.f1381p = wVar;
        this.f1382q = qVar;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        P0.C c5;
        InterfaceC2637x interfaceC2637x;
        InterfaceC2637x interfaceC2637x2;
        InterfaceC2637x interfaceC2637x3 = (InterfaceC2637x) obj;
        Z z3 = this.f1377l;
        z3.f1094h = interfaceC2637x3;
        F0 d5 = z3.d();
        if (d5 != null) {
            d5.f1030b = interfaceC2637x3;
        }
        if (this.f1378m) {
            O a5 = z3.a();
            O o5 = O.f1065l;
            P0.w wVar = this.f1381p;
            I.O o6 = this.f1380o;
            C0305m0 c0305m0 = z3.f1100o;
            if (a5 == o5) {
                if (((Boolean) z3.f1097l.getValue()).booleanValue() && ((Boolean) ((C0014b1) this.f1379n).f473a.getValue()).booleanValue()) {
                    o6.o();
                } else {
                    o6.k();
                }
                z3.f1098m.setValue(Boolean.valueOf(AbstractC0444a.R(o6, true)));
                z3.f1099n.setValue(Boolean.valueOf(AbstractC0444a.R(o6, false)));
                c0305m0.setValue(Boolean.valueOf(K0.N.b(wVar.f4680b)));
            } else if (z3.a() == O.f1066m) {
                c0305m0.setValue(Boolean.valueOf(AbstractC0444a.R(o6, true)));
            }
            P0.q qVar = this.f1382q;
            W.q(z3, wVar, qVar);
            F0 d6 = z3.d();
            if (d6 != null && (c5 = z3.f1092e) != null && z3.b() && (interfaceC2637x = d6.f1030b) != null && interfaceC2637x.F() && (interfaceC2637x2 = d6.f1031c) != null) {
                A.B b3 = new A.B(10, interfaceC2637x);
                C1989c P5 = G4.l.P(interfaceC2637x);
                C1989c s2 = interfaceC2637x.s(interfaceC2637x2, false);
                if (kotlin.jvm.internal.l.a((P0.C) c5.f4616a.f4683b.get(), c5)) {
                    c5.f4617b.b(wVar, qVar, d6.f1029a, b3, P5, s2);
                }
            }
        }
        return W3.o.f6046a;
    }
}
