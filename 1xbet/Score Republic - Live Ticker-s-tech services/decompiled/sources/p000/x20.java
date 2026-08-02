package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class x20 implements y30, InterfaceC0187eu {

    /* JADX INFO: renamed from: j */
    public final xm0 f8753j;

    /* JADX INFO: renamed from: k */
    public ib1 f8754k;

    /* JADX INFO: renamed from: l */
    public long f8755l;

    /* JADX INFO: renamed from: m */
    public boolean f8756m;

    public x20(xm0 xm0Var) {
        this.f8753j = xm0Var;
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        this.f8754k.cancel();
        this.f8754k = jb1.f3893j;
    }

    @Override // p000.y30
    /* JADX INFO: renamed from: e */
    public final void mo933e(ib1 ib1Var) {
        if (jb1.m2846d(this.f8754k, ib1Var)) {
            this.f8754k = ib1Var;
            this.f8753j.mo975a(this);
            ib1Var.request(Long.MAX_VALUE);
        }
    }

    @Override // p000.y30
    public final void onComplete() {
        this.f8754k = jb1.f3893j;
        if (this.f8756m) {
            return;
        }
        this.f8756m = true;
        this.f8753j.onComplete();
    }

    @Override // p000.y30
    public final void onError(Throwable th) {
        if (this.f8756m) {
            vt1.m5196h(th);
            return;
        }
        this.f8756m = true;
        this.f8754k = jb1.f3893j;
        this.f8753j.onError(th);
    }

    @Override // p000.y30
    public final void onNext(Object obj) {
        if (this.f8756m) {
            return;
        }
        long j = this.f8755l;
        if (j != 0) {
            this.f8755l = j + 1;
            return;
        }
        this.f8756m = true;
        this.f8754k.cancel();
        this.f8754k = jb1.f3893j;
        this.f8753j.mo976b(obj);
    }
}
