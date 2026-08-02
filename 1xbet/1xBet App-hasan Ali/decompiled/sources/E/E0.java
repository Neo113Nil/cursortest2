package E;

import A0.C0060u;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.InterfaceC0289e0;
import P.K0;
import P.d1;
import a.AbstractC0444a;
import h0.C1988b;
import i4.InterfaceC2015a;
import n.AbstractC2107A;
import u.C2467n;
import z0.C2751h;
import z0.C2752i;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public final class E0 extends kotlin.jvm.internal.m implements i4.f {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1024l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1025m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E0(int i, Object obj) {
        super(3);
        this.f1024l = i;
        this.f1025m = obj;
    }

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        long a5;
        long a6;
        P.Z z3 = C0302l.f4480a;
        X3.w wVar = X3.w.f6091k;
        int i = 1;
        W3.o oVar = W3.o.f6046a;
        int i5 = 0;
        Object obj4 = this.f1025m;
        switch (this.f1024l) {
            case 0:
                long j5 = ((W0.a) obj3).f6000a;
                long j6 = ((C0) obj4).f;
                x0.Z e3 = ((x0.N) obj2).e(W0.a.a(j5, AbstractC0444a.t((int) (j6 >> 32), W0.a.j(j5), W0.a.h(j5)), 0, AbstractC0444a.t((int) (j6 & 4294967295L), W0.a.i(j5), W0.a.g(j5)), 0, 10));
                break;
            case 1:
                C0315s c0315s = (C0315s) obj2;
                ((Number) obj3).intValue();
                c0315s.X(1582736677);
                W0.c cVar = (W0.c) c0315s.j(A0.I0.f287h);
                O0.d dVar = (O0.d) c0315s.j(A0.I0.f289k);
                W0.m mVar = (W0.m) c0315s.j(A0.I0.f292n);
                K0.O o5 = (K0.O) obj4;
                boolean f = c0315s.f(o5) | c0315s.f(mVar);
                Object M5 = c0315s.M();
                if (f || M5 == z3) {
                    M5 = K0.F.h(o5, mVar);
                    c0315s.i0(M5);
                }
                K0.O o6 = (K0.O) M5;
                boolean f5 = c0315s.f(dVar) | c0315s.f(o6);
                Object M6 = c0315s.M();
                if (f5 || M6 == z3) {
                    K0.G g5 = o6.f2805a;
                    O0.o oVar2 = g5.f;
                    O0.l lVar = g5.f2766c;
                    if (lVar == null) {
                        lVar = O0.l.f4027m;
                    }
                    O0.j jVar = g5.f2767d;
                    int i6 = jVar != null ? jVar.f4024a : 0;
                    O0.k kVar = g5.f2768e;
                    M6 = ((O0.f) dVar).b(oVar2, lVar, i6, kVar != null ? kVar.f4025a : 65535);
                    c0315s.i0(M6);
                }
                d1 d1Var = (d1) M6;
                Object M7 = c0315s.M();
                Object obj5 = M7;
                if (M7 == z3) {
                    Object value = d1Var.getValue();
                    C0 c02 = new C0();
                    c02.f1004a = mVar;
                    c02.f1005b = cVar;
                    c02.f1006c = dVar;
                    c02.f1007d = o5;
                    c02.f1008e = value;
                    a6 = n0.a(o5, cVar, dVar, n0.f1241a, 1);
                    c02.f = a6;
                    c0315s.i0(c02);
                    obj5 = c02;
                }
                C0 c03 = (C0) obj5;
                Object value2 = d1Var.getValue();
                if (mVar != c03.f1004a || !kotlin.jvm.internal.l.a(cVar, c03.f1005b) || !kotlin.jvm.internal.l.a(dVar, c03.f1006c) || !kotlin.jvm.internal.l.a(o6, c03.f1007d) || !kotlin.jvm.internal.l.a(value2, c03.f1008e)) {
                    c03.f1004a = mVar;
                    c03.f1005b = cVar;
                    c03.f1006c = dVar;
                    c03.f1007d = o6;
                    c03.f1008e = value2;
                    a5 = n0.a(o6, cVar, dVar, n0.f1241a, 1);
                    c03.f = a5;
                }
                boolean h3 = c0315s.h(c03);
                Object M8 = c0315s.M();
                if (h3 || M8 == z3) {
                    M8 = new E0(i5, c03);
                    c0315s.i0(M8);
                }
                b0.p b3 = androidx.compose.ui.layout.a.b((i4.f) M8);
                c0315s.q(false);
                break;
            case 2:
                b0.p pVar = (b0.p) obj;
                C0315s c0315s2 = (C0315s) obj2;
                ((Number) obj3).intValue();
                c0315s2.X(1980580247);
                W0.c cVar2 = (W0.c) c0315s2.j(A0.I0.f287h);
                Object M9 = c0315s2.M();
                if (M9 == z3) {
                    M9 = AbstractC0329z.t(new W0.l(0L));
                    c0315s2.i0(M9);
                }
                InterfaceC0289e0 interfaceC0289e0 = (InterfaceC0289e0) M9;
                I.O o7 = (I.O) obj4;
                boolean h4 = c0315s2.h(o7);
                Object M10 = c0315s2.M();
                if (h4 || M10 == z3) {
                    M10 = new C0060u(7, o7, interfaceC0289e0);
                    c0315s2.i0(M10);
                }
                InterfaceC2015a interfaceC2015a = (InterfaceC2015a) M10;
                boolean f6 = c0315s2.f(cVar2);
                Object M11 = c0315s2.M();
                if (f6 || M11 == z3) {
                    M11 = new I.U(cVar2, interfaceC0289e0, i);
                    c0315s2.i0(M11);
                }
                C2467n c2467n = I.G.f2401a;
                b0.p a7 = b0.a.a(pVar, new w0(interfaceC2015a, (i4.c) M11));
                c0315s2.q(false);
                break;
            case 3:
                x0.Z e5 = ((x0.N) obj2).e(((W0.a) obj3).f6000a);
                break;
            case 4:
                long j7 = ((C1988b) obj3).f17191a;
                ((C0094d0) obj4).f1134m.c(((t0.s) obj2).f19502c);
                break;
            default:
                C0315s c0315s3 = ((K0) obj).f4329a;
                C0315s c0315s4 = (C0315s) obj2;
                ((Number) obj3).intValue();
                long j8 = c0315s4.f4531T;
                int i7 = (int) (j8 ^ (j8 >>> 32));
                b0.p c5 = b0.a.c(c0315s4, (b0.p) obj4);
                c0315s3.Y(509942095);
                InterfaceC2753j.f21834j.getClass();
                AbstractC0329z.y(c0315s3, C2752i.f21831c, c5);
                C2751h c2751h = C2752i.f;
                if (c0315s3.f4530S || !kotlin.jvm.internal.l.a(c0315s3.M(), Integer.valueOf(i7))) {
                    AbstractC2107A.y(i7, c0315s3, i7, c2751h);
                }
                c0315s3.q(false);
                break;
        }
        return oVar;
    }
}
