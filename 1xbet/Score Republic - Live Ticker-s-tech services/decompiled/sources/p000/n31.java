package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class n31 extends vt1 {

    /* JADX INFO: renamed from: k */
    public static final C0794v8 f5278k = new C0794v8("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");

    /* JADX INFO: renamed from: h */
    public final vt1 f5279h;

    /* JADX INFO: renamed from: i */
    public final C0012ab f5280i;

    /* JADX INFO: renamed from: j */
    public final gc1 f5281j;

    public n31(C0409ku c0409ku, C0012ab c0012ab, gc1 gc1Var) {
        this.f5279h = c0409ku;
        this.f5280i = c0012ab;
        this.f5281j = gc1Var;
    }

    @Override // p000.vt1
    /* JADX INFO: renamed from: d */
    public String mo3090d() {
        return this.f5279h.mo3090d();
    }

    @Override // p000.vt1
    /* JADX INFO: renamed from: i */
    public final void mo3091i() {
        this.f5279h.mo3091i();
    }

    @Override // p000.vt1
    /* JADX INFO: renamed from: k */
    public final void mo3092k() {
        this.f5279h.mo3092k();
        C0012ab c0012ab = this.f5280i;
        gc1 gc1Var = c0012ab.f123b;
        gc1Var.m2028d();
        gc1Var.execute(new RunnableC0944za(0, c0012ab));
    }

    @Override // p000.vt1
    /* JADX INFO: renamed from: l */
    public final void mo3093l(wo1 wo1Var) {
        this.f5279h.mo3093l(new m31(this, wo1Var));
    }

    public final String toString() {
        C0809vn c0809vnM5362k = wm1.m5362k(this);
        c0809vnM5362k.m5172c(this.f5279h, "delegate");
        return c0809vnM5362k.toString();
    }
}
