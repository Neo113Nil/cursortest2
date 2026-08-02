package p000;

/* JADX INFO: renamed from: ch */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0098ch extends AbstractC0269h0 {

    /* JADX INFO: renamed from: q */
    public final xe1 f1249q;

    public C0098ch(xe1 xe1Var) {
        this.f1249q = xe1Var;
    }

    @Override // p000.AbstractC0269h0
    /* JADX INFO: renamed from: i */
    public final void mo932i() {
        this.f1249q.mo272b("GrpcFuture was cancelled", null);
    }

    @Override // p000.AbstractC0269h0
    /* JADX INFO: renamed from: j */
    public final String mo550j() {
        C0809vn c0809vnM5362k = wm1.m5362k(this);
        c0809vnM5362k.m5172c(this.f1249q, "clientCall");
        return c0809vnM5362k.toString();
    }
}
