package x0;

import E.D0;
import n.AbstractC2107A;
import z0.A0;
import z0.AbstractC2739O;
import z0.InterfaceC2765w;

/* loaded from: classes.dex */
public final class d0 extends b0.o implements InterfaceC2765w, A0 {

    /* renamed from: y, reason: collision with root package name */
    public r f20988y;

    /* renamed from: z, reason: collision with root package name */
    public final i0.K f20989z;

    public d0(r rVar) {
        this.f20988y = rVar;
        this.f20989z = new i0.K(16, this, rVar);
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
        Z e3 = n5.e(j5);
        return q5.p(e3.f20973k, e3.f20974l, X3.w.f6091k, this.f20989z, new D0(e3, 7));
    }

    @Override // z0.InterfaceC2765w
    public final /* synthetic */ int h(AbstractC2739O abstractC2739O, N n5, int i) {
        return AbstractC2107A.l(this, abstractC2739O, n5, i);
    }

    @Override // z0.A0
    public final Object o() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }
}
