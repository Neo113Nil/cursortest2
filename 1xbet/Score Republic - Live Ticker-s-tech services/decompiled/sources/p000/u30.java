package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class u30 extends AtomicLong implements ib1 {

    /* JADX INFO: renamed from: j */
    public final y30 f7658j;

    /* JADX INFO: renamed from: k */
    public volatile v30 f7659k;

    /* JADX INFO: renamed from: l */
    public long f7660l;

    public u30(y30 y30Var) {
        this.f7658j = y30Var;
    }

    @Override // p000.ib1
    public final void cancel() {
        v30 v30Var;
        if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE || (v30Var = this.f7659k) == null) {
            return;
        }
        v30Var.m5049g(this);
        v30Var.m5047b();
    }

    @Override // p000.ib1
    public final void request(long j) {
        long j2;
        if (jb1.m2845c(j)) {
            do {
                j2 = get();
                if (j2 == Long.MIN_VALUE || j2 == Long.MAX_VALUE) {
                    break;
                }
            } while (!compareAndSet(j2, AbstractC0875xf.m5648c(j2, j)));
            v30 v30Var = this.f7659k;
            if (v30Var != null) {
                v30Var.m5047b();
            }
        }
    }
}
