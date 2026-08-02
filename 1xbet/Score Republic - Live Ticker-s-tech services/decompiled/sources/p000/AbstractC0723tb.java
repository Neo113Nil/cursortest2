package p000;

/* JADX INFO: renamed from: tb */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0723tb implements InterfaceC0142dl, fz0 {

    /* JADX INFO: renamed from: j */
    public final InterfaceC0142dl f7398j;

    /* JADX INFO: renamed from: k */
    public ib1 f7399k;

    /* JADX INFO: renamed from: l */
    public fz0 f7400l;

    /* JADX INFO: renamed from: m */
    public boolean f7401m;

    /* JADX INFO: renamed from: n */
    public int f7402n;

    public AbstractC0723tb(InterfaceC0142dl interfaceC0142dl) {
        this.f7398j = interfaceC0142dl;
    }

    /* JADX INFO: renamed from: a */
    public final void m4780a(Throwable th) {
        wo1.m5394u(th);
        this.f7399k.cancel();
        onError(th);
    }

    @Override // p000.ib1
    public final void cancel() {
        this.f7399k.cancel();
    }

    @Override // p000.y71
    public final void clear() {
        this.f7400l.clear();
    }

    @Override // p000.y30
    /* JADX INFO: renamed from: e */
    public final void mo933e(ib1 ib1Var) {
        if (jb1.m2846d(this.f7399k, ib1Var)) {
            this.f7399k = ib1Var;
            if (ib1Var instanceof fz0) {
                this.f7400l = (fz0) ib1Var;
            }
            this.f7398j.mo933e(this);
        }
    }

    @Override // p000.ez0
    /* JADX INFO: renamed from: f */
    public int mo592f(int i) {
        fz0 fz0Var = this.f7400l;
        if (fz0Var == null || (i & 4) != 0) {
            return 0;
        }
        int iMo592f = fz0Var.mo592f(i);
        if (iMo592f == 0) {
            return iMo592f;
        }
        this.f7402n = iMo592f;
        return iMo592f;
    }

    @Override // p000.y71
    public final boolean isEmpty() {
        return this.f7400l.isEmpty();
    }

    @Override // p000.y71
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p000.y30
    public void onComplete() {
        if (this.f7401m) {
            return;
        }
        this.f7401m = true;
        this.f7398j.onComplete();
    }

    @Override // p000.y30
    public void onError(Throwable th) {
        if (this.f7401m) {
            vt1.m5196h(th);
        } else {
            this.f7401m = true;
            this.f7398j.onError(th);
        }
    }

    @Override // p000.ib1
    public final void request(long j) {
        this.f7399k.request(j);
    }
}
