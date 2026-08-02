package i0;

import A0.C0028g0;
import n.AbstractC2107A;
import x0.P;
import x0.Q;
import x0.Z;
import z0.AbstractC2739O;
import z0.InterfaceC2765w;
import z0.v0;

/* renamed from: i0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2007l extends b0.o implements InterfaceC2765w, v0 {

    /* renamed from: y, reason: collision with root package name */
    public i4.c f17286y;

    public C2007l(i4.c cVar) {
        this.f17286y = cVar;
    }

    @Override // z0.v0
    public final /* synthetic */ boolean X() {
        return false;
    }

    @Override // z0.v0
    public final /* synthetic */ boolean Z() {
        return false;
    }

    @Override // z0.InterfaceC2765w
    public final /* synthetic */ int a(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return AbstractC2107A.c(this, abstractC2739O, n5, i);
    }

    @Override // z0.InterfaceC2765w
    public final /* synthetic */ int b(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return AbstractC2107A.f(this, abstractC2739O, n5, i);
    }

    @Override // z0.InterfaceC2765w
    public final /* synthetic */ int e(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return AbstractC2107A.i(this, abstractC2739O, n5, i);
    }

    @Override // z0.InterfaceC2765w
    public final P f(Q q5, x0.N n5, long j5) {
        Z e3 = n5.e(j5);
        return q5.i(e3.f20973k, e3.f20974l, X3.w.f6091k, new C0028g0(29, e3, this));
    }

    @Override // z0.InterfaceC2765w
    public final /* synthetic */ int h(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return AbstractC2107A.l(this, abstractC2739O, n5, i);
    }

    @Override // z0.v0
    public final boolean j() {
        return false;
    }

    @Override // b0.o
    public final boolean l0() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f17286y + ')';
    }

    @Override // z0.v0
    public final void j0(H0.j jVar) {
    }
}
