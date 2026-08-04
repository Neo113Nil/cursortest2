package W5;

import U5.AbstractC0438e;
import U5.AbstractC0457y;
import U5.C0434a;

/* JADX INFO: loaded from: classes2.dex */
public final class R1 extends AbstractC0457y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0434a f7015d = new C0434a("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0457y f7016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0508i f7017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U5.p0 f7018c;

    public R1(T t7, C0508i c0508i, U5.p0 p0Var) {
        this.f7016a = t7;
        this.f7017b = c0508i;
        this.f7018c = p0Var;
    }

    @Override // U5.AbstractC0457y
    public String f() {
        return this.f7016a.f();
    }

    @Override // U5.AbstractC0457y
    public final void k() {
        this.f7016a.k();
    }

    @Override // U5.AbstractC0457y
    public final void m() {
        this.f7016a.m();
        C0508i c0508i = this.f7017b;
        U5.p0 p0Var = c0508i.f7236b;
        p0Var.f();
        p0Var.execute(new A1.K0(c0508i, 16));
    }

    @Override // U5.AbstractC0457y
    public final void n(AbstractC0438e abstractC0438e) {
        this.f7016a.n(new Q1(this, abstractC0438e));
    }

    public final String toString() {
        D3.j jVarU0 = p003a.a.u0(this);
        jVarU0.a(this.f7016a, "delegate");
        return jVarU0.toString();
    }
}
