package v;

import A0.C0040k0;
import A0.C0060u;
import g0.InterfaceC1960e;
import m4.InterfaceC2105h;
import p4.AbstractC2282w;
import y.C2648d;
import y.C2649e;
import y.C2654j;
import z0.AbstractC2749f;
import z0.AbstractC2756m;
import z0.InterfaceC2758o;

/* loaded from: classes.dex */
public final class N extends AbstractC2756m implements InterfaceC1960e, z0.v0, InterfaceC2758o, g0.p {

    /* renamed from: A, reason: collision with root package name */
    public g0.r f20170A;

    /* renamed from: B, reason: collision with root package name */
    public final L f20171B;

    /* renamed from: C, reason: collision with root package name */
    public final O f20172C;

    /* renamed from: D, reason: collision with root package name */
    public final P f20173D;

    public N(C2654j c2654j) {
        L l5 = new L();
        l5.f20166y = c2654j;
        y0(l5);
        this.f20171B = l5;
        O o5 = new O();
        y0(o5);
        this.f20172C = o5;
        P p5 = new P();
        y0(p5);
        this.f20173D = p5;
        y0(new g0.s(new E.q0(1, g0.u.f17064a, g0.u.class, "onDispatchEventsCompleted", "onDispatchEventsCompleted(Landroidx/compose/ui/focus/FocusTargetNode;)V", 0, 2), 3));
    }

    public final void B0(C2654j c2654j) {
        C2648d c2648d;
        L l5 = this.f20171B;
        if (kotlin.jvm.internal.l.a(l5.f20166y, c2654j)) {
            return;
        }
        C2654j c2654j2 = l5.f20166y;
        if (c2654j2 != null && (c2648d = l5.f20167z) != null) {
            c2654j2.b(new C2649e(c2648d));
        }
        l5.f20167z = null;
        l5.f20166y = c2654j;
    }

    @Override // z0.InterfaceC2758o
    public final void T(z0.e0 e0Var) {
        this.f20173D.T(e0Var);
    }

    @Override // z0.v0
    public final /* synthetic */ boolean X() {
        return false;
    }

    @Override // z0.v0
    public final /* synthetic */ boolean Z() {
        return false;
    }

    @Override // z0.v0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // z0.v0
    public final void j0(H0.j jVar) {
        g0.r rVar = this.f20170A;
        boolean z3 = false;
        if (rVar != null && rVar.a()) {
            z3 = true;
        }
        InterfaceC2105h[] interfaceC2105hArr = H0.u.f2183a;
        H0.v vVar = H0.s.f2165k;
        InterfaceC2105h interfaceC2105h = H0.u.f2183a[4];
        vVar.a(jVar, Boolean.valueOf(z3));
        jVar.f(H0.i.f2098v, new H0.a(null, new C0040k0(29, this)));
    }

    @Override // b0.o
    public final boolean l0() {
        return false;
    }

    @Override // g0.InterfaceC1960e
    public final void m(g0.r rVar) {
        Q y02;
        if (kotlin.jvm.internal.l.a(this.f20170A, rVar)) {
            return;
        }
        boolean a5 = rVar.a();
        B.w wVar = null;
        if (a5) {
            AbstractC2282w.p(k0(), null, new M(this, null), 3);
        }
        if (this.f7175x) {
            AbstractC2749f.o(this);
        }
        L l5 = this.f20171B;
        C2654j c2654j = l5.f20166y;
        if (c2654j != null) {
            if (a5) {
                C2648d c2648d = l5.f20167z;
                if (c2648d != null) {
                    l5.y0(c2654j, new C2649e(c2648d));
                    l5.f20167z = null;
                }
                C2648d c2648d2 = new C2648d();
                l5.y0(c2654j, c2648d2);
                l5.f20167z = c2648d2;
            } else {
                C2648d c2648d3 = l5.f20167z;
                if (c2648d3 != null) {
                    l5.y0(c2654j, new C2649e(c2648d3));
                    l5.f20167z = null;
                }
            }
        }
        P p5 = this.f20173D;
        if (a5 != p5.f20177y) {
            if (a5) {
                z0.e0 e0Var = p5.f20178z;
                if (e0Var != null && e0Var.I0().f7175x && (y02 = p5.y0()) != null) {
                    y02.y0(p5.f20178z);
                }
            } else {
                Q y03 = p5.y0();
                if (y03 != null) {
                    y03.y0(null);
                }
            }
            p5.f20177y = a5;
        }
        O o5 = this.f20172C;
        if (a5) {
            o5.getClass();
            kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
            AbstractC2749f.s(o5, new C0060u(12, wVar2, o5));
            B.w wVar3 = (B.w) wVar2.f17624k;
            if (wVar3 != null) {
                wVar3.a();
                wVar = wVar3;
            }
            o5.f20174y = wVar;
        } else {
            B.w wVar4 = o5.f20174y;
            if (wVar4 != null) {
                wVar4.b();
            }
            o5.f20174y = null;
        }
        o5.f20175z = a5;
        this.f20170A = rVar;
    }
}
