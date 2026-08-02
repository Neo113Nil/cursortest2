package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class di0 extends AbstractC0292hn implements InterfaceC0665rr {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1661p = AtomicIntegerFieldUpdater.newUpdater(di0.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: l */
    public final AbstractC0292hn f1662l;

    /* JADX INFO: renamed from: m */
    public final int f1663m;

    /* JADX INFO: renamed from: n */
    public final xj0 f1664n;

    /* JADX INFO: renamed from: o */
    public final Object f1665o;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public di0(AbstractC0292hn abstractC0292hn, int i) {
        if ((abstractC0292hn instanceof InterfaceC0665rr ? (InterfaceC0665rr) abstractC0292hn : null) == null) {
            int i2 = AbstractC0405kq.f4497a;
        }
        this.f1662l = abstractC0292hn;
        this.f1663m = i;
        this.f1664n = new xj0();
        this.f1665o = new Object();
    }

    @Override // p000.AbstractC0292hn
    /* JADX INFO: renamed from: o */
    public final void mo1225o(InterfaceC0180en interfaceC0180en, Runnable runnable) {
        this.f1664n.m5664a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1661p;
        if (atomicIntegerFieldUpdater.get(this) < this.f1663m) {
            synchronized (this.f1665o) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f1663m) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableM1226r = m1226r();
                if (runnableM1226r == null) {
                    return;
                }
                this.f1662l.mo1225o(this, new RunnableC0529o2(21, this, runnableM1226r));
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final Runnable m1226r() {
        while (true) {
            Runnable runnable = (Runnable) this.f1664n.m5667d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f1665o) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1661p;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f1664n.m5666c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // p000.AbstractC0292hn
    public final String toString() {
        return this.f1662l + ".limitedParallelism(" + this.f1663m + ')';
    }
}
