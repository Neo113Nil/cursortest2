package t;

import E.D0;
import a.AbstractC0444a;
import i4.InterfaceC2015a;
import u.n0;
import u.o0;
import u.t0;
import x0.P;
import x0.Q;
import x0.Z;
import z0.AbstractC2739O;
import z0.InterfaceC2765w;

/* renamed from: t.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2382D extends b0.o implements InterfaceC2765w {

    /* renamed from: A, reason: collision with root package name */
    public C2384F f19332A;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC2015a f19333B;

    /* renamed from: C, reason: collision with root package name */
    public w f19334C;

    /* renamed from: D, reason: collision with root package name */
    public long f19335D;

    /* renamed from: E, reason: collision with root package name */
    public b0.h f19336E;

    /* renamed from: y, reason: collision with root package name */
    public t0 f19337y;

    /* renamed from: z, reason: collision with root package name */
    public C2383E f19338z;

    @Override // z0.InterfaceC2765w
    public final int a(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return n5.f(i);
    }

    @Override // z0.InterfaceC2765w
    public final int b(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return n5.T(i);
    }

    @Override // z0.InterfaceC2765w
    public final int e(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return n5.U(i);
    }

    @Override // z0.InterfaceC2765w
    public final P f(Q q5, x0.N n5, long j5) {
        if (this.f19337y.f19937a.e() == this.f19337y.f19940d.getValue()) {
            this.f19336E = null;
        } else if (this.f19336E == null) {
            if (this.f19337y.f().a(v.f19415k, v.f19416l)) {
                N n6 = this.f19332A.f19343a;
            } else {
                N n7 = this.f19332A.f19343a;
            }
            this.f19336E = b0.c.f7137k;
        }
        boolean t5 = q5.t();
        X3.w wVar = X3.w.f6091k;
        if (t5) {
            Z e3 = n5.e(j5);
            long b3 = AbstractC0444a.b(e3.f20973k, e3.f20974l);
            this.f19335D = b3;
            return q5.i((int) (b3 >> 32), (int) (4294967295L & b3), wVar, new D0(e3, 4));
        }
        if (!((Boolean) this.f19333B.invoke()).booleanValue()) {
            Z e5 = n5.e(j5);
            return q5.i(e5.f20973k, e5.f20974l, wVar, new D0(e5, 5));
        }
        w wVar2 = this.f19334C;
        o0 o0Var = wVar2.f19419a;
        C2383E c2383e = wVar2.f19422d;
        C2384F c2384f = wVar2.f19423e;
        n0 a5 = o0Var != null ? o0Var.a(new x(c2383e, c2384f, 0), new x(c2383e, c2384f, 1)) : null;
        o0 o0Var2 = wVar2.f19420b;
        n0 a6 = o0Var2 != null ? o0Var2.a(new x(c2383e, c2384f, 2), new x(c2383e, c2384f, 3)) : null;
        if (wVar2.f19421c.f19937a.e() == v.f19415k) {
            N n8 = c2384f.f19343a;
        } else {
            N n9 = c2384f.f19343a;
        }
        o0 o0Var3 = wVar2.f;
        A.s sVar = new A.s(a5, a6, o0Var3 != null ? o0Var3.a(t.f19409p, new A.s(r4, c2383e, c2384f, 10)) : null, 9);
        Z e6 = n5.e(j5);
        long b5 = AbstractC0444a.b(e6.f20973k, e6.f20974l);
        long j6 = !W0.l.a(this.f19335D, s.f19405a) ? this.f19335D : b5;
        long d5 = W0.b.d(j5, b5);
        b0.h hVar = this.f19336E;
        return q5.i((int) (d5 >> 32), (int) (d5 & 4294967295L), wVar, new C2380B(e6, W0.j.c(hVar != null ? hVar.a(j6, d5, W0.m.f6016k) : 0L, 0L), 0L, sVar, 0));
    }

    @Override // z0.InterfaceC2765w
    public final int h(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return n5.L(i);
    }

    @Override // b0.o
    public final void o0() {
        this.f19335D = s.f19405a;
    }
}
