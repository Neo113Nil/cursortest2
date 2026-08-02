package p000;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class cl0 extends AbstractC0477mo {

    /* JADX INFO: renamed from: h */
    public f71 f1285h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ jl0 f1286i;

    public cl0(jl0 jl0Var) {
        this.f1286i = jl0Var;
    }

    @Override // p000.AbstractC0477mo
    /* JADX INFO: renamed from: a */
    public final AbstractC0959zp mo960a(hj0 hj0Var) {
        jl0 jl0Var = this.f1286i;
        jl0Var.f4012m.m2028d();
        a90.m132p("Channel is being terminated", !jl0Var.f3979H);
        return new il0(jl0Var, hj0Var);
    }

    @Override // p000.AbstractC0477mo
    /* JADX INFO: renamed from: f */
    public final AbstractC0875xf mo961f() {
        return this.f1286i.f3985N;
    }

    @Override // p000.AbstractC0477mo
    /* JADX INFO: renamed from: g */
    public final ScheduledExecutorService mo962g() {
        return this.f1286i.f4006g;
    }

    @Override // p000.AbstractC0477mo
    /* JADX INFO: renamed from: h */
    public final gc1 mo963h() {
        return this.f1286i.f4012m;
    }

    @Override // p000.AbstractC0477mo
    /* JADX INFO: renamed from: m */
    public final void mo964m() {
        gc1 gc1Var = this.f1286i.f4012m;
        gc1Var.m2028d();
        gc1Var.execute(new RunnableC0897y0(14, this));
    }

    @Override // p000.AbstractC0477mo
    /* JADX INFO: renamed from: o */
    public final void mo965o(EnumC0474ml enumC0474ml, kj0 kj0Var) {
        gc1 gc1Var = this.f1286i.f4012m;
        gc1Var.m2028d();
        a90.m127k(enumC0474ml, "newState");
        a90.m127k(kj0Var, "newPicker");
        gc1Var.execute(new RunnableC0702sr(this, kj0Var, enumC0474ml, 3));
    }
}
