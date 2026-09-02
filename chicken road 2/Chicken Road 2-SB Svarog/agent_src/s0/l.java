package s0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1245b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1246c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1247d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1248e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f1249a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final h a() {
        h hVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1247d;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 - f1246c.get(this) == 0) {
                return null;
            }
            int i3 = i2 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 + 1) && (hVar = (h) this.f1249a.getAndSet(i3, null)) != null) {
                if (hVar.f1234c.f38a == 1) {
                    f1248e.decrementAndGet(this);
                }
                return hVar;
            }
        }
    }

    public final h b(int i2, boolean z2) {
        int i3 = i2 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f1249a;
        h hVar = (h) atomicReferenceArray.get(i3);
        if (hVar != null) {
            if ((hVar.f1234c.f38a == 1) == z2) {
                while (!atomicReferenceArray.compareAndSet(i3, hVar, null)) {
                    if (atomicReferenceArray.get(i3) != hVar) {
                    }
                }
                if (z2) {
                    f1248e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }
}
