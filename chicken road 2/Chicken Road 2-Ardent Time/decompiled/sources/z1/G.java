package z1;

/* loaded from: classes.dex */
public abstract class G extends z1.H implements z1.InterfaceC1071y {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f8525g = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(z1.G.class, java.lang.Object.class, "_queue");

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f8526h = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(z1.G.class, java.lang.Object.class, "_delayed");

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f8527i = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(z1.G.class, "_isCompleted");
    private volatile java.lang.Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile java.lang.Object _queue;

    @Override // z1.AbstractC1065s
    public final void l(k1.i iVar, java.lang.Runnable runnable) {
        u(runnable);
    }

    @Override // z1.H
    public final long r() {
        java.lang.Runnable runnable;
        if (s()) {
            return 0L;
        }
        loop0: while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8525g;
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof E1.n)) {
                if (obj != z1.AbstractC1068v.f8594b) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    runnable = (java.lang.Runnable) obj;
                    break loop0;
                }
                break;
            }
            E1.n nVar = (E1.n) obj;
            java.lang.Object d2 = nVar.d();
            if (d2 != E1.n.f291g) {
                runnable = (java.lang.Runnable) d2;
                break;
            }
            E1.n c2 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        i1.C0188g c0188g = this.f8531e;
        if (((c0188g == null || c0188g.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        java.lang.Object obj2 = f8525g.get(this);
        if (obj2 != null) {
            if (!(obj2 instanceof E1.n)) {
                if (obj2 != z1.AbstractC1068v.f8594b) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            long j2 = E1.n.f290f.get((E1.n) obj2);
            if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // z1.H
    public void t() {
        z1.h0.f8570a.set(null);
        f8527i.set(this, 1);
        loop0: while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8525g;
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            C.j jVar = z1.AbstractC1068v.f8594b;
            if (obj != null) {
                if (!(obj instanceof E1.n)) {
                    if (obj != jVar) {
                        E1.n nVar = new E1.n(8, true);
                        nVar.a((java.lang.Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((E1.n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, jVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (r() <= 0) {
        }
        java.lang.System.nanoTime();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r6 = p();
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
    public void u(java.lang.Runnable runnable) {
        loop0: while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8525g;
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (f8527i.get(this) != 0) {
                break;
            }
            if (obj != null) {
                if (!(obj instanceof E1.n)) {
                    if (obj != z1.AbstractC1068v.f8594b) {
                        E1.n nVar = new E1.n(8, true);
                        nVar.a((java.lang.Runnable) obj);
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
                E1.n nVar2 = (E1.n) obj;
                int a2 = nVar2.a(runnable);
                if (a2 == 0) {
                    break;
                }
                if (a2 == 1) {
                    E1.n c2 = nVar2.c();
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
        z1.RunnableC1069w.f8602j.u(runnable);
    }

    public final boolean v() {
        i1.C0188g c0188g = this.f8531e;
        if (!(c0188g != null ? c0188g.isEmpty() : true)) {
            return false;
        }
        java.lang.Object obj = f8525g.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof E1.n) {
            long j2 = E1.n.f290f.get((E1.n) obj);
            if (((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == z1.AbstractC1068v.f8594b) {
            return true;
        }
        return false;
    }
}
