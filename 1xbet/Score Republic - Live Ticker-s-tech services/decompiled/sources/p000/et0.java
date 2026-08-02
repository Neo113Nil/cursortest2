package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class et0 extends AtomicInteger implements dz0, Runnable {

    /* JADX INFO: renamed from: j */
    public final ft0 f2182j;

    /* JADX INFO: renamed from: k */
    public final Object f2183k;

    public et0(ft0 ft0Var, Object obj) {
        this.f2182j = ft0Var;
        this.f2183k = obj;
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        set(3);
    }

    @Override // p000.y71
    public final void clear() {
        lazySet(3);
    }

    @Override // p000.y71
    public final boolean isEmpty() {
        return get() != 1;
    }

    @Override // p000.y71
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p000.y71
    public final Object poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.f2183k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            Object obj = this.f2183k;
            ft0 ft0Var = this.f2182j;
            ft0Var.onNext(obj);
            if (get() == 2) {
                lazySet(3);
                ft0Var.onComplete();
            }
        }
    }
}
