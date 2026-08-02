package K6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4175b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4176c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4177d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4178e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f4179a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final h a(h hVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4176c;
        if (atomicIntegerFieldUpdater.get(this) - f4177d.get(this) == 127) {
            return hVar;
        }
        if (hVar.f4164b.f12365a == 1) {
            f4178e.incrementAndGet(this);
        }
        int i7 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f4179a;
            if (atomicReferenceArray.get(i7) == null) {
                atomicReferenceArray.lazySet(i7, hVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final h b() {
        h hVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4177d;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 - f4176c.get(this) == 0) {
                return null;
            }
            int i8 = i7 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i7, i7 + 1) && (hVar = (h) this.f4179a.getAndSet(i8, null)) != null) {
                if (hVar.f4164b.f12365a == 1) {
                    f4178e.decrementAndGet(this);
                }
                return hVar;
            }
        }
    }

    public final h c(int i7, boolean z4) {
        int i8 = i7 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f4179a;
        h hVar = (h) atomicReferenceArray.get(i8);
        if (hVar != null) {
            if ((hVar.f4164b.f12365a == 1) == z4) {
                while (!atomicReferenceArray.compareAndSet(i8, hVar, null)) {
                    if (atomicReferenceArray.get(i8) != hVar) {
                    }
                }
                if (z4) {
                    f4178e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }
}
