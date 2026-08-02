package p4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public abstract class J extends K implements InterfaceC2259A {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18750q = AtomicReferenceFieldUpdater.newUpdater(J.class, Object.class, "_queue$volatile");

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18751r = AtomicReferenceFieldUpdater.newUpdater(J.class, Object.class, "_delayed$volatile");

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18752s = AtomicIntegerFieldUpdater.newUpdater(J.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // p4.AbstractC2277q
    public final void E(a4.h hVar, Runnable runnable) {
        O(runnable);
    }

    @Override // p4.K
    public final long L() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        H3.g gVar;
        Runnable runnable;
        H h3;
        if (!M()) {
            P();
            loop0: while (true) {
                atomicReferenceFieldUpdater = f18750q;
                Object obj = atomicReferenceFieldUpdater.get(this);
                gVar = AbstractC2282w.f18828c;
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof u4.l)) {
                    if (obj != gVar) {
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
                u4.l lVar = (u4.l) obj;
                Object d5 = lVar.d();
                if (d5 != u4.l.f20104g) {
                    runnable = (Runnable) d5;
                    break;
                }
                u4.l c5 = lVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c5) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            X3.k kVar = this.f18756o;
            if (((kVar == null || kVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof u4.l) {
                        long j5 = u4.l.f.get((u4.l) obj2);
                        if (((int) (1073741823 & j5)) != ((int) ((j5 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == gVar) {
                        return Long.MAX_VALUE;
                    }
                }
                I i = (I) f18751r.get(this);
                if (i != null) {
                    synchronized (i) {
                        H[] hArr = i.f20117a;
                        h3 = hArr != null ? hArr[0] : null;
                    }
                    if (h3 != null) {
                        long nanoTime = h3.f18747k - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void O(Runnable runnable) {
        P();
        if (!Q(runnable)) {
            RunnableC2283x.f18834t.O(runnable);
            return;
        }
        Thread J = J();
        if (Thread.currentThread() != J) {
            LockSupport.unpark(J);
        }
    }

    public final void P() {
        H h3;
        I i = (I) f18751r.get(this);
        if (i == null || u4.t.f20116b.get(i) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (i) {
                try {
                    H[] hArr = i.f20117a;
                    H h4 = hArr != null ? hArr[0] : null;
                    if (h4 != null) {
                        h3 = ((nanoTime - h4.f18747k) > 0L ? 1 : ((nanoTime - h4.f18747k) == 0L ? 0 : -1)) >= 0 ? Q(h4) : false ? i.c(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (h3 != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Q(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18750q;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(f18752s.get(this) != 0)) {
                if (obj != null) {
                    if (!(obj instanceof u4.l)) {
                        if (obj != AbstractC2282w.f18828c) {
                            u4.l lVar = new u4.l(8, true);
                            lVar.a((Runnable) obj);
                            lVar.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    u4.l lVar2 = (u4.l) obj;
                    int a5 = lVar2.a(runnable);
                    if (a5 == 0) {
                        break;
                    }
                    if (a5 == 1) {
                        u4.l c5 = lVar2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c5) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (a5 == 2) {
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
            } else {
                break;
            }
        }
        return false;
    }

    public final boolean R() {
        I i;
        X3.k kVar = this.f18756o;
        if (!(kVar != null ? kVar.isEmpty() : true) || ((i = (I) f18751r.get(this)) != null && u4.t.f20116b.get(i) != 0)) {
            return false;
        }
        Object obj = f18750q.get(this);
        if (obj != null) {
            if (obj instanceof u4.l) {
                long j5 = u4.l.f.get((u4.l) obj);
                return ((int) (1073741823 & j5)) == ((int) ((j5 & 1152921503533105152L) >> 30));
            }
            if (obj != AbstractC2282w.f18828c) {
                return false;
            }
        }
        return true;
    }

    public final void S(long j5, H h3) {
        int d5;
        Thread J;
        boolean z3 = f18752s.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18751r;
        if (z3) {
            d5 = 1;
        } else {
            I i = (I) atomicReferenceFieldUpdater.get(this);
            if (i == null) {
                I i5 = new I();
                i5.f18749c = j5;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, i5) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.l.c(obj);
                i = (I) obj;
            }
            d5 = h3.d(j5, i, this);
        }
        if (d5 != 0) {
            if (d5 == 1) {
                N(j5, h3);
                return;
            } else {
                if (d5 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        I i6 = (I) atomicReferenceFieldUpdater.get(this);
        if (i6 != null) {
            synchronized (i6) {
                H[] hArr = i6.f20117a;
                r4 = hArr != null ? hArr[0] : null;
            }
        }
        if (r4 != h3 || Thread.currentThread() == (J = J())) {
            return;
        }
        LockSupport.unpark(J);
    }

    @Override // p4.InterfaceC2259A
    public final void i(long j5, C2268h c2268h) {
        long j6 = j5 > 0 ? j5 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j5 : 0L;
        if (j6 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            G g5 = new G(this, j6 + nanoTime, c2268h);
            S(nanoTime, g5);
            c2268h.v(new C2265e(1, g5));
        }
    }

    @Override // p4.K
    public void shutdown() {
        H c5;
        k0.f18800a.set(null);
        f18752s.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18750q;
            Object obj = atomicReferenceFieldUpdater.get(this);
            H3.g gVar = AbstractC2282w.f18828c;
            if (obj != null) {
                if (!(obj instanceof u4.l)) {
                    if (obj != gVar) {
                        u4.l lVar = new u4.l(8, true);
                        lVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((u4.l) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, gVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (L() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            I i = (I) f18751r.get(this);
            if (i == null) {
                return;
            }
            synchronized (i) {
                c5 = u4.t.f20116b.get(i) > 0 ? i.c(0) : null;
            }
            if (c5 == null) {
                return;
            } else {
                N(nanoTime, c5);
            }
        }
    }
}
