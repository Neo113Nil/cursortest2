package G1;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f595b = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(G1.m.class, java.lang.Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f596c = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(G1.m.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f597d = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(G1.m.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f598e = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(G1.m.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceArray f599a = new java.util.concurrent.atomic.AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile java.lang.Object lastScheduledTask;
    private volatile int producerIndex;

    public final G1.h a(G1.h hVar) {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f596c;
        if (atomicIntegerFieldUpdater.get(this) - f597d.get(this) == 127) {
            return hVar;
        }
        if (hVar.f583b.f584a == 1) {
            f598e.incrementAndGet(this);
        }
        int i2 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.f599a;
            if (atomicReferenceArray.get(i2) == null) {
                atomicReferenceArray.lazySet(i2, hVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            java.lang.Thread.yield();
        }
    }

    public final G1.h b() {
        G1.h hVar;
        while (true) {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f597d;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 - f596c.get(this) == 0) {
                return null;
            }
            int i3 = i2 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 + 1) && (hVar = (G1.h) this.f599a.getAndSet(i3, null)) != null) {
                if (hVar.f583b.f584a == 1) {
                    f598e.decrementAndGet(this);
                }
                return hVar;
            }
        }
    }

    public final G1.h c(int i2, boolean z2) {
        int i3 = i2 & 127;
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.f599a;
        G1.h hVar = (G1.h) atomicReferenceArray.get(i3);
        if (hVar != null) {
            if ((hVar.f583b.f584a == 1) == z2) {
                while (!atomicReferenceArray.compareAndSet(i3, hVar, null)) {
                    if (atomicReferenceArray.get(i3) != hVar) {
                    }
                }
                if (z2) {
                    f598e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }
}
