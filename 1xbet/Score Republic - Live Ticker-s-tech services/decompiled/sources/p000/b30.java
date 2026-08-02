package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class b30 extends AbstractC0760ub implements InterfaceC0142dl {

    /* JADX INFO: renamed from: o */
    public final nw0 f699o;

    public b30(y30 y30Var, nw0 nw0Var) {
        super(y30Var);
        this.f699o = nw0Var;
    }

    @Override // p000.InterfaceC0142dl
    /* JADX INFO: renamed from: d */
    public final boolean mo21d(Object obj) {
        if (this.f7749m) {
            return false;
        }
        int i = this.f7750n;
        y30 y30Var = this.f7746j;
        if (i != 0) {
            y30Var.onNext(null);
            return true;
        }
        try {
            boolean zTest = this.f699o.test(obj);
            if (zTest) {
                y30Var.onNext(obj);
            }
            return zTest;
        } catch (Throwable th) {
            wo1.m5394u(th);
            this.f7747k.cancel();
            onError(th);
            return true;
        }
    }

    @Override // p000.y30
    public final void onNext(Object obj) {
        if (mo21d(obj)) {
            return;
        }
        this.f7747k.request(1L);
    }

    @Override // p000.y71
    public final Object poll() {
        fz0 fz0Var = this.f7748l;
        while (true) {
            Object objPoll = fz0Var.poll();
            if (objPoll == null) {
                return null;
            }
            if (this.f699o.test(objPoll)) {
                return objPoll;
            }
            if (this.f7750n == 2) {
                fz0Var.request(1L);
            }
        }
    }
}
