package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class m30 extends AbstractC0760ub {

    /* JADX INFO: renamed from: o */
    public final r60 f4965o;

    public m30(y30 y30Var, b90 b90Var) {
        super(y30Var);
        this.f4965o = b90Var;
    }

    @Override // p000.y30
    public final void onNext(Object obj) {
        if (this.f7749m) {
            return;
        }
        int i = this.f7750n;
        y30 y30Var = this.f7746j;
        if (i != 0) {
            y30Var.onNext(null);
            return;
        }
        try {
            Object objApply = this.f4965o.apply(obj);
            zg1.m5905p(objApply, "The mapper function returned a null value.");
            y30Var.onNext(objApply);
        } catch (Throwable th) {
            wo1.m5394u(th);
            this.f7747k.cancel();
            onError(th);
        }
    }

    @Override // p000.y71
    public final Object poll() {
        Object objPoll = this.f7748l.poll();
        if (objPoll == null) {
            return null;
        }
        Object objApply = this.f4965o.apply(objPoll);
        zg1.m5905p(objApply, "The mapper function returned a null value.");
        return objApply;
    }
}
