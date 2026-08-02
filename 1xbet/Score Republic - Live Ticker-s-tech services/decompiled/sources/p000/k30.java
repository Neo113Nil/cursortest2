package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class k30 implements ft0, ib1 {

    /* JADX INFO: renamed from: j */
    public final y30 f4270j;

    /* JADX INFO: renamed from: k */
    public InterfaceC0187eu f4271k;

    public k30(y30 y30Var) {
        this.f4270j = y30Var;
    }

    @Override // p000.ft0
    /* JADX INFO: renamed from: a */
    public final void mo172a(InterfaceC0187eu interfaceC0187eu) {
        this.f4271k = interfaceC0187eu;
        this.f4270j.mo933e(this);
    }

    @Override // p000.ib1
    public final void cancel() {
        this.f4271k.mo480c();
    }

    @Override // p000.ft0
    public final void onComplete() {
        this.f4270j.onComplete();
    }

    @Override // p000.ft0
    public final void onError(Throwable th) {
        this.f4270j.onError(th);
    }

    @Override // p000.ft0
    public final void onNext(Object obj) {
        this.f4270j.onNext(obj);
    }

    @Override // p000.ib1
    public final void request(long j) {
    }
}
