package f0;

import A0.C0060u;
import a.AbstractC0444a;
import a3.AbstractC0467k;
import b0.o;
import e2.C1930k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import z0.AbstractC2749f;
import z0.C2733I;
import z0.InterfaceC2757n;
import z0.i0;

/* renamed from: f0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1938b extends o implements i0, InterfaceC1937a, InterfaceC2757n {

    /* renamed from: A, reason: collision with root package name */
    public i4.c f16920A;

    /* renamed from: y, reason: collision with root package name */
    public final c f16921y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f16922z;

    public C1938b(c cVar, i4.c cVar2) {
        this.f16921y = cVar;
        this.f16920A = cVar2;
        cVar.f16923k = this;
    }

    @Override // z0.i0
    public final void E() {
        y0();
    }

    @Override // f0.InterfaceC1937a
    public final W0.c c() {
        return AbstractC2749f.v(this).f21607H;
    }

    @Override // f0.InterfaceC1937a
    public final long d() {
        return AbstractC0444a.d0(AbstractC2749f.t(this, 128).f20975m);
    }

    @Override // z0.InterfaceC2757n
    public final void f0() {
        y0();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [i4.c, kotlin.jvm.internal.m] */
    @Override // z0.InterfaceC2757n
    public final void g(C2733I c2733i) {
        boolean z3 = this.f16922z;
        c cVar = this.f16921y;
        if (!z3) {
            cVar.f16924l = null;
            AbstractC2749f.s(this, new C0060u(8, this, cVar));
            if (cVar.f16924l == null) {
                throw AbstractC0467k.u("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f16922z = true;
        }
        C1930k c1930k = cVar.f16924l;
        l.c(c1930k);
        ((m) c1930k.f16910l).c(c2733i);
    }

    @Override // f0.InterfaceC1937a
    public final W0.m getLayoutDirection() {
        return AbstractC2749f.v(this).f21608I;
    }

    @Override // b0.o
    public final void p0() {
        y0();
    }

    @Override // b0.o
    public final void r0() {
        y0();
    }

    @Override // b0.o
    public final void s0() {
        y0();
    }

    public final void y0() {
        this.f16922z = false;
        this.f16921y.f16924l = null;
        AbstractC2749f.m(this);
    }

    @Override // b0.o
    public final void q0() {
    }
}
