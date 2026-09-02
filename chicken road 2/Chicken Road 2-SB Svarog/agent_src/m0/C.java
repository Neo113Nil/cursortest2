package m0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class C extends D implements InterfaceC0065w {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f886g = AtomicReferenceFieldUpdater.newUpdater(C.class, Object.class, "_queue");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f887h = AtomicReferenceFieldUpdater.newUpdater(C.class, Object.class, "_delayed");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f888i = AtomicIntegerFieldUpdater.newUpdater(C.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // m0.AbstractC0059p
    public final void f(Y.i iVar, Runnable runnable) {
        m(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r6 = j();
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
    public void m(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f886g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f888i.get(this) != 0) {
                break;
            }
            if (obj != null) {
                if (!(obj instanceof r0.o)) {
                    if (obj != AbstractC0062t.f945b) {
                        r0.o oVar = new r0.o(8, true);
                        oVar.a((Runnable) obj);
                        oVar.a(runnable);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                r0.o oVar2 = (r0.o) obj;
                int a2 = oVar2.a(runnable);
                if (a2 == 0) {
                    break;
                }
                if (a2 == 1) {
                    r0.o c2 = oVar2.c();
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
        RunnableC0063u.f953j.m(runnable);
    }

    public final boolean n() {
        X.c cVar = this.f891f;
        if (cVar != null ? cVar.isEmpty() : true) {
            Object obj = f886g.get(this);
            if (obj != null) {
                if (obj instanceof r0.o) {
                    long j2 = r0.o.f1187f.get((r0.o) obj);
                    return ((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30));
                }
                if (obj == AbstractC0062t.f945b) {
                }
            }
            return true;
        }
        return false;
    }

    public final long o() {
        Runnable runnable;
        if (!l()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f886g;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                runnable = null;
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof r0.o)) {
                    if (obj != AbstractC0062t.f945b) {
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
                r0.o oVar = (r0.o) obj;
                Object d2 = oVar.d();
                if (d2 != r0.o.f1188g) {
                    runnable = (Runnable) d2;
                    break;
                }
                r0.o c2 = oVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            X.c cVar = this.f891f;
            if (((cVar == null || cVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = f886g.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof r0.o) {
                        long j2 = r0.o.f1187f.get((r0.o) obj2);
                        if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == AbstractC0062t.f945b) {
                        return Long.MAX_VALUE;
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    @Override // m0.D
    public void shutdown() {
        a0.f916a.set(null);
        f888i.set(this, 1);
        io.flutter.plugin.platform.i iVar = AbstractC0062t.f945b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f886g;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof r0.o)) {
                    if (obj != iVar) {
                        r0.o oVar = new r0.o(8, true);
                        oVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((r0.o) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, iVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (o() <= 0) {
        }
        System.nanoTime();
    }
}
