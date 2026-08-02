package w4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20573b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20574c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20575d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20576e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f20577a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final i a(i iVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20574c;
        if (atomicIntegerFieldUpdater.get(this) - f20575d.get(this) == 127) {
            return iVar;
        }
        if (iVar.f20565l) {
            f20576e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f20577a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, iVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final i b() {
        i iVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20575d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f20574c.get(this) == 0) {
                return null;
            }
            int i5 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (iVar = (i) this.f20577a.getAndSet(i5, null)) != null) {
                if (iVar.f20565l) {
                    f20576e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final i c(int i, boolean z3) {
        int i5 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f20577a;
        i iVar = (i) atomicReferenceArray.get(i5);
        if (iVar != null && iVar.f20565l == z3) {
            while (!atomicReferenceArray.compareAndSet(i5, iVar, null)) {
                if (atomicReferenceArray.get(i5) != iVar) {
                }
            }
            if (z3) {
                f20576e.decrementAndGet(this);
            }
            return iVar;
        }
        return null;
    }
}
