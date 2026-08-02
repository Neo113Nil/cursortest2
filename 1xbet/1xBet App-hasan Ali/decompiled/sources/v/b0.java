package v;

import P.AbstractC0329z;
import P.C0305m0;
import a.AbstractC0444a;
import android.view.View;
import h0.C1988b;
import n.AbstractC2107A;
import p4.AbstractC2282w;
import z0.AbstractC2749f;
import z0.C2733I;
import z0.InterfaceC2757n;
import z0.InterfaceC2758o;

/* loaded from: classes.dex */
public final class b0 extends b0.o implements InterfaceC2758o, InterfaceC2757n, z0.v0, z0.i0 {

    /* renamed from: A, reason: collision with root package name */
    public m0 f20198A;

    /* renamed from: B, reason: collision with root package name */
    public View f20199B;

    /* renamed from: C, reason: collision with root package name */
    public W0.c f20200C;

    /* renamed from: D, reason: collision with root package name */
    public l0 f20201D;

    /* renamed from: F, reason: collision with root package name */
    public P.H f20203F;

    /* renamed from: H, reason: collision with root package name */
    public W0.l f20205H;

    /* renamed from: I, reason: collision with root package name */
    public r4.c f20206I;

    /* renamed from: y, reason: collision with root package name */
    public A.B f20207y;

    /* renamed from: z, reason: collision with root package name */
    public I.U f20208z;

    /* renamed from: E, reason: collision with root package name */
    public final C0305m0 f20202E = new C0305m0(null, P.Z.f4431m);

    /* renamed from: G, reason: collision with root package name */
    public long f20204G = 9205357640488583168L;

    public b0(A.B b3, I.U u5, m0 m0Var) {
        this.f20207y = b3;
        this.f20208z = u5;
        this.f20198A = m0Var;
    }

    public final void A0() {
        W0.c cVar = this.f20200C;
        if (cVar == null) {
            cVar = AbstractC2749f.v(this).f21607H;
            this.f20200C = cVar;
        }
        long j5 = ((C1988b) this.f20207y.c(cVar)).f17191a;
        if (!G4.d.C(j5) || !G4.d.C(y0())) {
            this.f20204G = 9205357640488583168L;
            l0 l0Var = this.f20201D;
            if (l0Var != null) {
                ((n0) l0Var).b();
                return;
            }
            return;
        }
        this.f20204G = C1988b.h(y0(), j5);
        if (this.f20201D == null) {
            z0();
        }
        l0 l0Var2 = this.f20201D;
        if (l0Var2 != null) {
            l0Var2.a(this.f20204G, 9205357640488583168L);
        }
        B0();
    }

    public final void B0() {
        W0.c cVar;
        l0 l0Var = this.f20201D;
        if (l0Var == null || (cVar = this.f20200C) == null) {
            return;
        }
        n0 n0Var = (n0) l0Var;
        long c5 = n0Var.c();
        W0.l lVar = this.f20205H;
        if (AbstractC2107A.A(lVar) && c5 == lVar.f6015a) {
            return;
        }
        this.f20208z.c(new W0.h(cVar.x(AbstractC0444a.d0(n0Var.c()))));
        this.f20205H = new W0.l(n0Var.c());
    }

    @Override // z0.i0
    public final void E() {
        AbstractC2749f.s(this, new Z(this, 2));
    }

    @Override // z0.InterfaceC2758o
    public final void T(z0.e0 e0Var) {
        this.f20202E.setValue(e0Var);
    }

    @Override // z0.v0
    public final /* synthetic */ boolean X() {
        return false;
    }

    @Override // z0.v0
    public final /* synthetic */ boolean Z() {
        return false;
    }

    @Override // z0.InterfaceC2757n
    public final /* synthetic */ void f0() {
    }

    @Override // z0.InterfaceC2757n
    public final void g(C2733I c2733i) {
        c2733i.a();
        r4.c cVar = this.f20206I;
        if (cVar != null) {
            cVar.q(W3.o.f6046a);
        }
    }

    @Override // z0.v0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // z0.v0
    public final void j0(H0.j jVar) {
        jVar.f(c0.f20214a, new Z(this, 1));
    }

    @Override // b0.o
    public final void o0() {
        E();
        this.f20206I = r4.j.a(0, 7, null);
        AbstractC2282w.p(k0(), null, new a0(this, null), 3);
    }

    @Override // b0.o
    public final void q0() {
        l0 l0Var = this.f20201D;
        if (l0Var != null) {
            ((n0) l0Var).b();
        }
        this.f20201D = null;
    }

    public final long y0() {
        if (this.f20203F == null) {
            this.f20203F = AbstractC0329z.o(new Z(this, 0));
        }
        P.H h3 = this.f20203F;
        if (h3 != null) {
            return ((C1988b) h3.getValue()).f17191a;
        }
        return 9205357640488583168L;
    }

    public final void z0() {
        l0 l0Var = this.f20201D;
        if (l0Var != null) {
            ((n0) l0Var).b();
        }
        View view = this.f20199B;
        if (view == null) {
            view = AbstractC2749f.x(this);
        }
        this.f20199B = view;
        W0.c cVar = this.f20200C;
        if (cVar == null) {
            cVar = AbstractC2749f.v(this).f21607H;
        }
        this.f20200C = cVar;
        this.f20201D = this.f20198A.b(view, cVar);
        B0();
    }
}
