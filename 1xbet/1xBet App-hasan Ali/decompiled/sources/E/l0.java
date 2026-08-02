package E;

import A0.C0014b1;
import A0.t1;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import r.C2321G;
import t.C2396h;
import t.C2400l;

/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.m implements i4.f {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1224l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1225m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1226n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1227o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f1228p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(3);
        this.f1224l = i;
        this.f1225m = obj;
        this.f1226n = obj2;
        this.f1227o = obj3;
        this.f1228p = obj4;
    }

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        Object obj4;
        switch (this.f1224l) {
            case 0:
                b0.p pVar = (b0.p) obj;
                C0315s c0315s = (C0315s) obj2;
                ((Number) obj3).intValue();
                c0315s.X(-84507373);
                Object M5 = c0315s.M();
                Object obj5 = C0302l.f4480a;
                if (M5 == obj5) {
                    M5 = new G.o();
                    c0315s.i0(M5);
                }
                G.o oVar = (G.o) M5;
                i0.M m5 = (i0.M) this.f1225m;
                boolean z3 = m5.f17262e != 16;
                if (((Boolean) ((C0014b1) ((t1) c0315s.j(A0.I0.f298t))).f473a.getValue()).booleanValue()) {
                    Z z5 = (Z) this.f1226n;
                    if (z5.b()) {
                        P0.w wVar = (P0.w) this.f1227o;
                        long j5 = wVar.f4680b;
                        if (K0.N.b(j5) && z3) {
                            c0315s.X(808320157);
                            K0.N n5 = new K0.N(j5);
                            boolean h3 = c0315s.h(oVar);
                            Object M6 = c0315s.M();
                            if (h3 || M6 == obj5) {
                                M6 = new j0(oVar, null);
                                c0315s.i0(M6);
                            }
                            AbstractC0329z.f(wVar.f4679a, n5, (i4.e) M6, c0315s);
                            boolean h4 = c0315s.h(oVar);
                            Object obj6 = (P0.q) this.f1228p;
                            boolean h5 = h4 | c0315s.h(obj6) | c0315s.f(wVar) | c0315s.h(z5) | c0315s.f(m5);
                            Object M7 = c0315s.M();
                            if (h5 || M7 == obj5) {
                                M7 = new k0(oVar, obj6, wVar, z5, m5, 0);
                                c0315s.i0(M7);
                            }
                            obj4 = androidx.compose.ui.draw.a.c(pVar, (i4.c) M7);
                            c0315s.q(false);
                            c0315s.q(false);
                            return obj4;
                        }
                    }
                }
                c0315s.X(809534830);
                c0315s.q(false);
                obj4 = b0.m.f7161k;
                c0315s.q(false);
                return obj4;
            default:
                t.q qVar = (t.q) obj;
                C0315s c0315s2 = (C0315s) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= (intValue & 8) == 0 ? c0315s2.f(qVar) : c0315s2.h(qVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18 && c0315s2.B()) {
                    c0315s2.S();
                } else {
                    Z.p pVar2 = (Z.p) this.f1225m;
                    boolean f = c0315s2.f(pVar2);
                    Object obj7 = this.f1226n;
                    boolean h6 = f | c0315s2.h(obj7);
                    C2400l c2400l = (C2400l) this.f1227o;
                    boolean h7 = h6 | c0315s2.h(c2400l);
                    Object M8 = c0315s2.M();
                    P.Z z6 = C0302l.f4480a;
                    if (h7 || M8 == z6) {
                        M8 = new A.s(pVar2, obj7, c2400l, 8);
                        c0315s2.i0(M8);
                    }
                    AbstractC0329z.c(qVar, (i4.c) M8, c0315s2);
                    C2321G c2321g = c2400l.f19388d;
                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl", qVar);
                    c2321g.m(obj7, ((t.r) qVar).f19404a);
                    Object M9 = c0315s2.M();
                    if (M9 == z6) {
                        M9 = new C2396h();
                        c0315s2.i0(M9);
                    }
                    ((X.d) this.f1228p).e((C2396h) M9, obj7, c0315s2, 0);
                }
                return W3.o.f6046a;
        }
    }
}
