package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class b51 extends AtomicInteger implements fz0 {

    /* JADX INFO: renamed from: j */
    public final Object f726j;

    /* JADX INFO: renamed from: k */
    public final y30 f727k;

    public b51(y30 y30Var, Object obj) {
        this.f727k = y30Var;
        this.f726j = obj;
    }

    @Override // p000.ib1
    public final void cancel() {
        lazySet(2);
    }

    @Override // p000.y71
    public final void clear() {
        lazySet(1);
    }

    @Override // p000.ez0
    /* JADX INFO: renamed from: f */
    public final int mo592f(int i) {
        return 1;
    }

    @Override // p000.y71
    public final boolean isEmpty() {
        return get() != 0;
    }

    @Override // p000.y71
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p000.y71
    public final Object poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f726j;
    }

    @Override // p000.ib1
    public final void request(long j) {
        if (jb1.m2845c(j) && compareAndSet(0, 1)) {
            Object obj = this.f726j;
            y30 y30Var = this.f727k;
            y30Var.onNext(obj);
            if (get() != 2) {
                y30Var.onComplete();
            }
        }
    }
}
