package w2;

import e2.C0289d;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class G extends H implements InterfaceC1245y {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10466g = AtomicReferenceFieldUpdater.newUpdater(G.class, Object.class, "_queue");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10467h = AtomicReferenceFieldUpdater.newUpdater(G.class, Object.class, "_delayed");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f10468i = AtomicIntegerFieldUpdater.newUpdater(G.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // w2.AbstractC1239s
    public final void c(g2.h hVar, Runnable runnable) {
        n(runnable);
    }

    @Override // w2.H
    public final long l() {
        Runnable runnable;
        if (!m()) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10466g;
                Object obj = atomicReferenceFieldUpdater.get(this);
                runnable = null;
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof B2.n)) {
                    if (obj != AbstractC1242v.f10527b) {
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
                B2.n nVar = (B2.n) obj;
                Object d3 = nVar.d();
                if (d3 != B2.n.f172g) {
                    runnable = (Runnable) d3;
                    break;
                }
                B2.n c3 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            C0289d c0289d = this.f10471e;
            if (((c0289d == null || c0289d.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = f10466g.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof B2.n) {
                        long j3 = B2.n.f.get((B2.n) obj2);
                        if (((int) (1073741823 & j3)) != ((int) ((j3 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == AbstractC1242v.f10527b) {
                        return Long.MAX_VALUE;
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r6 = f();
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
    public void n(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10466g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f10468i.get(this) != 0) {
                break;
            }
            if (obj != null) {
                if (!(obj instanceof B2.n)) {
                    if (obj != AbstractC1242v.f10527b) {
                        B2.n nVar = new B2.n(8, true);
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
                B2.n nVar2 = (B2.n) obj;
                int a3 = nVar2.a(runnable);
                if (a3 == 0) {
                    break;
                }
                if (a3 == 1) {
                    B2.n c3 = nVar2.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else if (a3 == 2) {
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
        RunnableC1243w.f10534j.n(runnable);
    }

    public final boolean o() {
        C0289d c0289d = this.f10471e;
        if (c0289d != null ? c0289d.isEmpty() : true) {
            Object obj = f10466g.get(this);
            if (obj != null) {
                if (obj instanceof B2.n) {
                    long j3 = B2.n.f.get((B2.n) obj);
                    return ((int) (1073741823 & j3)) == ((int) ((j3 & 1152921503533105152L) >> 30));
                }
                if (obj == AbstractC1242v.f10527b) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // w2.H
    public void shutdown() {
        h0.f10506a.set(null);
        f10468i.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10466g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            B2.v vVar = AbstractC1242v.f10527b;
            if (obj != null) {
                if (!(obj instanceof B2.n)) {
                    if (obj != vVar) {
                        B2.n nVar = new B2.n(8, true);
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
                ((B2.n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, vVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (l() <= 0) {
        }
        System.nanoTime();
    }
}
