package E1;

/* loaded from: classes.dex */
public final class i extends z1.AbstractC1065s implements z1.InterfaceC1071y {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f279g = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(E1.i.class, "runningWorkers");

    /* renamed from: c, reason: collision with root package name */
    public final G1.l f280c;

    /* renamed from: d, reason: collision with root package name */
    public final int f281d;

    /* renamed from: e, reason: collision with root package name */
    public final E1.l f282e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f283f;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public i(G1.l lVar, int i2) {
        this.f280c = lVar;
        this.f281d = i2;
        if ((lVar instanceof z1.InterfaceC1071y ? (z1.InterfaceC1071y) lVar : null) == null) {
            int i3 = z1.AbstractC1070x.f8604a;
        }
        this.f282e = new E1.l();
        this.f283f = new java.lang.Object();
    }

    @Override // z1.AbstractC1065s
    public final void l(k1.i iVar, java.lang.Runnable runnable) {
        this.f282e.a(runnable);
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f279g;
        if (atomicIntegerFieldUpdater.get(this) < this.f281d) {
            synchronized (this.f283f) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f281d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                java.lang.Runnable o2 = o();
                if (o2 == null) {
                    return;
                }
                this.f280c.l(this, new D0.f(3, this, o2));
            }
        }
    }

    public final java.lang.Runnable o() {
        while (true) {
            java.lang.Runnable runnable = (java.lang.Runnable) this.f282e.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f283f) {
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f279g;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f282e.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
