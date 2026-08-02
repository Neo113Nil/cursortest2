package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g61 extends AbstractC0102cl implements is0 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2634f = AtomicIntegerFieldUpdater.newUpdater(g61.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* JADX INFO: renamed from: e */
    public final long f2635e;

    public g61(long j, g61 g61Var, int i) {
        super(g61Var);
        this.f2635e = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // p000.AbstractC0102cl
    /* JADX INFO: renamed from: f */
    public final boolean mo956f() {
        return f2634f.get(this) == mo643k() && m953c() != null;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1989j() {
        return f2634f.addAndGet(this, -65536) == mo643k() && m953c() != null;
    }

    /* JADX INFO: renamed from: k */
    public abstract int mo643k();

    /* JADX INFO: renamed from: l */
    public abstract void mo644l(int i, InterfaceC0180en interfaceC0180en);

    /* JADX INFO: renamed from: m */
    public final void m1990m() {
        if (f2634f.incrementAndGet(this) == mo643k()) {
            m958h();
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m1991n() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f2634f;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == mo643k() && m953c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
