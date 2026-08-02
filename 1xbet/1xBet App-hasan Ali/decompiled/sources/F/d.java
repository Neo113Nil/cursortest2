package F;

import X3.w;
import g0.InterfaceC1960e;
import g0.r;
import i4.InterfaceC2015a;
import n.AbstractC2107A;
import t0.AbstractC2403A;
import t0.B;
import t0.H;
import t0.j;
import t0.k;
import x0.N;
import x0.P;
import x0.Q;
import x0.Z;
import z0.AbstractC2739O;
import z0.AbstractC2756m;
import z0.InterfaceC2765w;
import z0.s0;
import z0.y0;

/* loaded from: classes.dex */
public final class d extends AbstractC2756m implements InterfaceC2765w, s0, InterfaceC1960e {

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC2015a f1515A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f1516B;

    /* renamed from: C, reason: collision with root package name */
    public final H f1517C;

    public d(InterfaceC2015a interfaceC2015a) {
        this.f1515A = interfaceC2015a;
        b bVar = new b(this, null);
        j jVar = AbstractC2403A.f19430a;
        H h3 = new H(null, null, B.f19431k);
        h3.f19449A = bVar;
        y0(h3);
        this.f1517C = h3;
    }

    @Override // z0.s0
    public final boolean R() {
        return true;
    }

    @Override // z0.s0
    public final void U() {
        W();
    }

    @Override // z0.s0
    public final void W() {
        this.f1517C.W();
    }

    @Override // z0.InterfaceC2765w
    public final /* synthetic */ int a(AbstractC2739O abstractC2739O, N n5, int i) {
        return AbstractC2107A.c(this, abstractC2739O, n5, i);
    }

    @Override // z0.InterfaceC2765w
    public final /* synthetic */ int b(AbstractC2739O abstractC2739O, N n5, int i) {
        return AbstractC2107A.f(this, abstractC2739O, n5, i);
    }

    @Override // z0.InterfaceC2765w
    public final /* synthetic */ int e(AbstractC2739O abstractC2739O, N n5, int i) {
        return AbstractC2107A.i(this, abstractC2739O, n5, i);
    }

    @Override // z0.InterfaceC2765w
    public final P f(Q q5, N n5, long j5) {
        int K = q5.K(androidx.compose.foundation.text.handwriting.a.f6891a);
        int K5 = q5.K(androidx.compose.foundation.text.handwriting.a.f6892b);
        int i = K5 * 2;
        int i5 = K * 2;
        Z e3 = n5.e(W0.b.i(i, i5, j5));
        int i6 = e3.f20974l - i5;
        return q5.i(e3.f20973k - i, i6, w.f6091k, new c(e3, K5, K, 0));
    }

    @Override // z0.s0
    public final /* synthetic */ void g0() {
    }

    @Override // z0.InterfaceC2765w
    public final /* synthetic */ int h(AbstractC2739O abstractC2739O, N n5, int i) {
        return AbstractC2107A.l(this, abstractC2739O, n5, i);
    }

    @Override // g0.InterfaceC1960e
    public final void m(r rVar) {
        this.f1516B = rVar.a();
    }

    @Override // b0.o
    public final void p0() {
        W();
    }

    @Override // z0.s0
    public final long r() {
        return y0.f21873a;
    }

    @Override // z0.s0
    public final void v(j jVar, k kVar, long j5) {
        this.f1517C.v(jVar, kVar, j5);
    }
}
