package W5;

import U5.C0452t;
import U5.InterfaceC0444k;

/* JADX INFO: renamed from: W5.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0524n0 implements InterfaceC0540t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0540t f7293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0527o0 f7294b;

    public C0524n0(C0527o0 c0527o0, InterfaceC0540t interfaceC0540t) {
        this.f7294b = c0527o0;
        this.f7293a = interfaceC0540t;
    }

    @Override // W5.e2
    public final void a(InterfaceC0444k interfaceC0444k) {
        this.f7293a.a(interfaceC0444k);
    }

    @Override // W5.e2
    public final boolean b() {
        return this.f7293a.b();
    }

    @Override // W5.InterfaceC0540t
    public final void c(int i7) {
        this.f7293a.c(i7);
    }

    @Override // W5.InterfaceC0540t
    public final void d(R4.c cVar) {
        this.f7293a.d(cVar);
    }

    @Override // W5.InterfaceC0540t
    public final void e(InterfaceC0546v interfaceC0546v) {
        p072k1.g gVar = this.f7294b.f7301b;
        ((A0) gVar.f14681b).c();
        ((f2) gVar.f14680a).d();
        this.f7293a.e(new h2(2, this, interfaceC0546v));
    }

    @Override // W5.InterfaceC0540t
    public final void f(U5.l0 l0Var) {
        this.f7293a.f(l0Var);
    }

    @Override // W5.e2
    public final void flush() {
        this.f7293a.flush();
    }

    @Override // W5.e2
    public final void g(p016b6.a aVar) {
        this.f7293a.g(aVar);
    }

    @Override // W5.InterfaceC0540t
    public final void h() {
        this.f7293a.h();
    }

    @Override // W5.e2
    public final void i(int i7) {
        this.f7293a.i(i7);
    }

    @Override // W5.InterfaceC0540t
    public final void j(int i7) {
        this.f7293a.j(i7);
    }

    @Override // W5.InterfaceC0540t
    public final void k(C0452t c0452t) {
        this.f7293a.k(c0452t);
    }

    @Override // W5.InterfaceC0540t
    public final void l(U5.r rVar) {
        this.f7293a.l(rVar);
    }

    @Override // W5.e2
    public final void m() {
        this.f7293a.m();
    }

    public final String toString() {
        D3.j jVarU0 = p003a.a.u0(this);
        jVarU0.a(this.f7293a, "delegate");
        return jVarU0.toString();
    }
}
