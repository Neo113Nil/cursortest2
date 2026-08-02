package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class v20 extends AbstractC0628qr implements y30 {

    /* JADX INFO: renamed from: l */
    public ib1 f8000l;

    /* JADX INFO: renamed from: m */
    public long f8001m;

    /* JADX INFO: renamed from: n */
    public boolean f8002n;

    @Override // p000.ib1
    public final void cancel() {
        set(4);
        this.f6569k = null;
        this.f8000l.cancel();
    }

    @Override // p000.y30
    /* JADX INFO: renamed from: e */
    public final void mo933e(ib1 ib1Var) {
        if (jb1.m2846d(this.f8000l, ib1Var)) {
            this.f8000l = ib1Var;
            this.f6568j.mo933e(this);
            ib1Var.request(Long.MAX_VALUE);
        }
    }

    @Override // p000.y30
    public final void onComplete() {
        if (this.f8002n) {
            return;
        }
        this.f8002n = true;
        this.f6568j.onComplete();
    }

    @Override // p000.y30
    public final void onError(Throwable th) {
        if (this.f8002n) {
            vt1.m5196h(th);
        } else {
            this.f8002n = true;
            this.f6568j.onError(th);
        }
    }

    @Override // p000.y30
    public final void onNext(Object obj) {
        if (this.f8002n) {
            return;
        }
        long j = this.f8001m;
        if (j != 0) {
            this.f8001m = j + 1;
            return;
        }
        this.f8002n = true;
        this.f8000l.cancel();
        m4133c(obj);
    }
}
