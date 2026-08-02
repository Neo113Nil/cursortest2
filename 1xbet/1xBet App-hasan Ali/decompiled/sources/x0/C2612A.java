package x0;

import n.AbstractC2107A;
import z0.AbstractC2739O;
import z0.InterfaceC2765w;

/* renamed from: x0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2612A extends b0.o implements InterfaceC2765w {

    /* renamed from: y, reason: collision with root package name */
    public i4.f f20910y;

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
        return (P) this.f20910y.b(q5, n5, new W0.a(j5));
    }

    @Override // z0.InterfaceC2765w
    public final /* synthetic */ int h(AbstractC2739O abstractC2739O, N n5, int i) {
        return AbstractC2107A.l(this, abstractC2739O, n5, i);
    }

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f20910y + ')';
    }
}
