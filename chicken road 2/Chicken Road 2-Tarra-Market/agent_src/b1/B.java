package b1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class B extends C implements InterfaceC0033v {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f620f = AtomicReferenceFieldUpdater.newUpdater(B.class, Object.class, "_queue");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f621g = AtomicReferenceFieldUpdater.newUpdater(B.class, Object.class, "_delayed");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f622h = AtomicIntegerFieldUpdater.newUpdater(B.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // b1.AbstractC0028p
    public final void l(M0.i iVar, Runnable runnable) {
        s(runnable);
    }

    @Override // b1.C
    public void r() {
        Z.f649a.set(null);
        f622h.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f620f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            C0.a aVar = AbstractC0030s.f681b;
            if (obj != null) {
                if (!(obj instanceof g1.n)) {
                    if (obj != aVar) {
                        g1.n nVar = new g1.n(8, true);
                        nVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((g1.n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, aVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (u() <= 0) {
        }
        System.nanoTime();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r6 = o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (java.lang.Thread.currentThread() == r6) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        java.util.concurrent.locks.LockSupport.unpark(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void s(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f620f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f622h.get(this) != 0) {
                break;
            }
            if (obj != null) {
                if (!(obj instanceof g1.n)) {
                    if (obj != AbstractC0030s.f681b) {
                        g1.n nVar = new g1.n(8, true);
                        nVar.a((Runnable) obj);
                        nVar.a(runnable);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                g1.n nVar2 = (g1.n) obj;
                int a2 = nVar2.a(runnable);
                if (a2 == 0) {
                    break;
                }
                if (a2 == 1) {
                    g1.n c2 = nVar2.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else if (a2 == 2) {
                    break;
                }
            } else {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            }
        }
        RunnableC0031t.f689i.s(runnable);
    }

    public final boolean t() {
        L0.b bVar = this.f625e;
        if (!(bVar != null ? bVar.isEmpty() : true)) {
            return false;
        }
        Object obj = f620f.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof g1.n) {
            long j2 = g1.n.f1166f.get((g1.n) obj);
            if (((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC0030s.f681b) {
            return true;
        }
        return false;
    }

    public final long u() {
        Runnable runnable;
        if (q()) {
            return 0L;
        }
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f620f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof g1.n)) {
                if (obj != AbstractC0030s.f681b) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    runnable = (Runnable) obj;
                    break loop0;
                }
                break;
            }
            g1.n nVar = (g1.n) obj;
            Object d2 = nVar.d();
            if (d2 != g1.n.f1167g) {
                runnable = (Runnable) d2;
                break;
            }
            g1.n c2 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        L0.b bVar = this.f625e;
        if (((bVar == null || bVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = f620f.get(this);
        if (obj2 != null) {
            if (!(obj2 instanceof g1.n)) {
                if (obj2 != AbstractC0030s.f681b) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            long j2 = g1.n.f1166f.get((g1.n) obj2);
            if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }
}
