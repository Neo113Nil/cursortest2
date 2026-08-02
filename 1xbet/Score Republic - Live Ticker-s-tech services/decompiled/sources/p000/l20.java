package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class l20 extends AtomicBoolean implements ib1 {

    /* JADX INFO: renamed from: j */
    public final y30 f4646j;

    /* JADX INFO: renamed from: k */
    public final Object f4647k;

    public l20(y30 y30Var, Object obj) {
        this.f4647k = obj;
        this.f4646j = y30Var;
    }

    @Override // p000.ib1
    public final void request(long j) {
        if (j <= 0 || !compareAndSet(false, true)) {
            return;
        }
        Object obj = this.f4647k;
        y30 y30Var = this.f4646j;
        y30Var.onNext(obj);
        y30Var.onComplete();
    }

    @Override // p000.ib1
    public final void cancel() {
    }
}
