package W5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class U1 extends Z1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicIntegerFieldUpdater f7068c;

    public U1(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f7068c = atomicIntegerFieldUpdater;
    }

    @Override // W5.Z1
    public final boolean r(W1 w7) {
        return this.f7068c.compareAndSet(w7, 0, -1);
    }

    @Override // W5.Z1
    public final void s(W1 w7) {
        this.f7068c.set(w7, 0);
    }
}
