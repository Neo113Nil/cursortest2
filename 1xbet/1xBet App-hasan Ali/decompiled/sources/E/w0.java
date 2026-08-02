package E;

import A0.C0028g0;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.InterfaceC0289e0;
import P.d1;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import h0.C1988b;
import i4.InterfaceC2015a;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;
import t3.AbstractC2425d;
import u.C2451c;
import u.C2465l;
import w.C2539b;
import x.C2565K;
import x.C2589k0;
import x.C2605t;
import y.C2654j;

/* loaded from: classes.dex */
public final class w0 extends kotlin.jvm.internal.m implements i4.f {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1363l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1364m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1365n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(int i, Object obj, Object obj2) {
        super(3);
        this.f1363l = i;
        this.f1364m = obj;
        this.f1365n = obj2;
    }

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f1363l) {
            case 0:
                C0315s c0315s = (C0315s) obj2;
                ((Number) obj3).intValue();
                c0315s.X(-102778667);
                Object M5 = c0315s.M();
                P.Z z3 = C0302l.f4480a;
                if (M5 == z3) {
                    P.C c5 = new P.C(AbstractC0329z.m(c0315s));
                    c0315s.i0(c5);
                    M5 = c5;
                }
                InterfaceC2280u interfaceC2280u = ((P.C) M5).f4253k;
                Object M6 = c0315s.M();
                if (M6 == z3) {
                    M6 = AbstractC0329z.t(null);
                    c0315s.i0(M6);
                }
                InterfaceC0289e0 interfaceC0289e0 = (InterfaceC0289e0) M6;
                InterfaceC0289e0 w5 = AbstractC0329z.w((i4.c) this.f1364m, c0315s);
                C2654j c2654j = (C2654j) this.f1365n;
                boolean f = c0315s.f(c2654j);
                Object M7 = c0315s.M();
                if (f || M7 == z3) {
                    M7 = new C0028g0(11, interfaceC0289e0, c2654j);
                    c0315s.i0(M7);
                }
                AbstractC0329z.c(c2654j, (i4.c) M7, c0315s);
                boolean h3 = c0315s.h(interfaceC2280u) | c0315s.f(c2654j) | c0315s.f(w5);
                Object M8 = c0315s.M();
                if (h3 || M8 == z3) {
                    v0 v0Var = new v0(interfaceC2280u, interfaceC0289e0, (C2654j) this.f1365n, w5, null);
                    c0315s.i0(v0Var);
                    M8 = v0Var;
                }
                SuspendPointerInputElement suspendPointerInputElement = new SuspendPointerInputElement(c2654j, null, new t0.z((i4.e) M8), 6);
                c0315s.q(false);
                break;
            case 1:
                C0315s c0315s2 = (C0315s) obj2;
                ((Number) obj3).intValue();
                c0315s2.X(759876635);
                Object M9 = c0315s2.M();
                P.Z z5 = C0302l.f4480a;
                if (M9 == z5) {
                    M9 = AbstractC0329z.o((InterfaceC2015a) this.f1365n);
                    c0315s2.i0(M9);
                }
                d1 d1Var = (d1) M9;
                Object M10 = c0315s2.M();
                if (M10 == z5) {
                    M10 = new C2451c(new C1988b(((C1988b) d1Var.getValue()).f17191a), I.G.f2402b, new C1988b(I.G.f2403c), 8);
                    c0315s2.i0(M10);
                }
                C2451c c2451c = (C2451c) M10;
                W3.o oVar = W3.o.f6046a;
                boolean h4 = c0315s2.h(c2451c);
                Object M11 = c0315s2.M();
                if (h4 || M11 == z5) {
                    M11 = new I.F(d1Var, c2451c, null);
                    c0315s2.i0(M11);
                }
                AbstractC0329z.e(c0315s2, (i4.e) M11, oVar);
                C2465l c2465l = c2451c.f19762c;
                boolean f5 = c0315s2.f(c2465l);
                Object M12 = c0315s2.M();
                if (f5 || M12 == z5) {
                    M12 = new I.C(c2465l, 0);
                    c0315s2.i0(M12);
                }
                b0.p pVar = (b0.p) ((i4.c) this.f1364m).c((InterfaceC2015a) M12);
                c0315s2.q(false);
                break;
            case 2:
                C0315s c0315s3 = (C0315s) obj2;
                ((Number) obj3).intValue();
                c0315s3.X(-353972293);
                v.U a5 = ((v.T) this.f1364m).a((C2654j) this.f1365n, c0315s3);
                boolean f6 = c0315s3.f(a5);
                Object M13 = c0315s3.M();
                if (f6 || M13 == C0302l.f4480a) {
                    M13 = new v.W(a5);
                    c0315s3.i0(M13);
                }
                v.W w6 = (v.W) M13;
                c0315s3.q(false);
                break;
            case 3:
                C0315s c0315s4 = (C0315s) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c0315s4.B()) {
                    c0315s4.S();
                } else {
                    Object M14 = c0315s4.M();
                    if (M14 == C0302l.f4480a) {
                        M14 = new w.h();
                        c0315s4.i0(M14);
                    }
                    w.h hVar = (w.h) M14;
                    hVar.f20464a.clear();
                    ((C0028g0) this.f1364m).c(hVar);
                    hVar.a((C2539b) this.f1365n, c0315s4, 0);
                }
                break;
            default:
                t0.s sVar = (t0.s) obj;
                t0.s sVar2 = (t0.s) obj2;
                long j5 = ((C1988b) obj3).f17191a;
                C2589k0 c2589k0 = (C2589k0) this.f1364m;
                if (((Boolean) c2589k0.f20800B.c(sVar)).booleanValue()) {
                    if (!c2589k0.f20805G) {
                        if (c2589k0.f20803E == null) {
                            c2589k0.f20803E = r4.j.a(Integer.MAX_VALUE, 6, null);
                        }
                        c2589k0.f20805G = true;
                        AbstractC2282w.p(c2589k0.k0(), null, new C2565K(c2589k0, null), 3);
                    }
                    AbstractC2425d.i((u0.c) this.f1365n, sVar);
                    long g5 = C1988b.g(sVar2.f19502c, j5);
                    r4.c cVar = c2589k0.f20803E;
                    if (cVar != null) {
                        cVar.q(new C2605t(g5));
                    }
                }
                break;
        }
        return W3.o.f6046a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(InterfaceC2015a interfaceC2015a, i4.c cVar) {
        super(3);
        this.f1363l = 1;
        this.f1365n = interfaceC2015a;
        this.f1364m = cVar;
    }
}
