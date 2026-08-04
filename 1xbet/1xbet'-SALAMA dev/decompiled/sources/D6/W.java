package D6;

import F2.W0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public abstract class W extends X implements J {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1808x = AtomicReferenceFieldUpdater.newUpdater(W.class, Object.class, "_queue");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1809y = AtomicReferenceFieldUpdater.newUpdater(W.class, Object.class, "_delayed");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1810z = AtomicIntegerFieldUpdater.newUpdater(W.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    public O a(long j, E0 e7, p065i6.i iVar) {
        return G.f1791a.a(j, e7, iVar);
    }

    @Override // D6.J
    public final void c(long j, C0130m c0130m) {
        long j3 = 0;
        if (j > 0) {
            j3 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j3 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            S s7 = new S(this, j3 + jNanoTime, c0130m);
            q(jNanoTime, s7);
            c0130m.u(new C0127j(s7, 1));
        }
    }

    @Override // D6.A
    public final void d(p065i6.i iVar, Runnable runnable) {
        n(runnable);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e8 A[Catch: all -> 0x00fc, TRY_LEAVE, TryCatch #0 {, blocks: (B:85:0x00e4, B:87:0x00e8), top: B:102:0x00e4 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fa  */
    @Override // D6.X
    public final long i() {
        Runnable runnable;
        V v6;
        U u4;
        long jNanoTime;
        U uB;
        if (j()) {
            return 0L;
        }
        V v7 = (V) f1809y.get(this);
        if (v7 != null && I6.y.f3766b.get(v7) != 0) {
            long jNanoTime2 = System.nanoTime();
            do {
                synchronized (v7) {
                    try {
                        U[] uArr = v7.f3767a;
                        U u7 = uArr != null ? uArr[0] : null;
                        if (u7 == null) {
                            uB = null;
                        } else {
                            uB = ((jNanoTime2 - u7.f1805a) > 0L ? 1 : ((jNanoTime2 - u7.f1805a) == 0L ? 0 : -1)) >= 0 ? o(u7) : false ? v7.b(0) : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (uB != null);
        }
        loop1: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1808x;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (obj instanceof I6.n) {
                    I6.n nVar = (I6.n) obj;
                    Object objD = nVar.d();
                    if (objD != I6.n.f3747g) {
                        runnable = (Runnable) objD;
                        break;
                    }
                    I6.n nVarC = nVar.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else if (obj != E.f1780c) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            runnable = (Runnable) obj;
                            break loop1;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                }
            }
            runnable = null;
            break;
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        p050g6.f fVar = this.f1814e;
        if (((fVar == null || fVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = f1808x.get(this);
        if (obj2 == null) {
            v6 = (V) f1809y.get(this);
            if (v6 != null) {
                synchronized (v6) {
                    U[] uArr2 = v6.f3767a;
                    u4 = uArr2 != null ? uArr2[0] : null;
                }
                if (u4 != null) {
                    jNanoTime = u4.f1805a - System.nanoTime();
                    if (jNanoTime < 0) {
                        return 0L;
                    }
                    return jNanoTime;
                }
            }
        } else if (obj2 instanceof I6.n) {
            long j = I6.n.f3746f.get((I6.n) obj2);
            if (!(((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30)))) {
                return 0L;
            }
            v6 = (V) f1809y.get(this);
            if (v6 != null) {
                synchronized (v6) {
                    U[] uArr3 = v6.f3767a;
                    if (uArr3 != null) {
                    }
                    if (u4 != null) {
                        jNanoTime = u4.f1805a - System.nanoTime();
                        if (jNanoTime < 0) {
                            return 0L;
                        }
                        return jNanoTime;
                    }
                }
            }
        } else if (obj2 != E.f1780c) {
            return 0L;
        }
        return Long.MAX_VALUE;
    }

    public void n(Runnable runnable) {
        if (!o(runnable)) {
            F.f1788A.n(runnable);
            return;
        }
        Thread threadG = g();
        if (Thread.currentThread() != threadG) {
            LockSupport.unpark(threadG);
        }
    }

    public final boolean o(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1808x;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f1810z.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof I6.n)) {
                if (obj == E.f1780c) {
                    return false;
                }
                I6.n nVar = new I6.n(8, true);
                nVar.a((Runnable) obj);
                nVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            I6.n nVar2 = (I6.n) obj;
            int iA = nVar2.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                I6.n nVarC = nVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final boolean p() {
        p050g6.f fVar = this.f1814e;
        if (!(fVar != null ? fVar.isEmpty() : true)) {
            return false;
        }
        V v6 = (V) f1809y.get(this);
        if (v6 != null && I6.y.f3766b.get(v6) != 0) {
            return false;
        }
        Object obj = f1808x.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof I6.n) {
            long j = I6.n.f3746f.get((I6.n) obj);
            if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == E.f1780c) {
            return true;
        }
        return false;
    }

    public final void q(long j, U u4) {
        int iA;
        Thread threadG;
        boolean z4 = f1810z.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1809y;
        U u7 = null;
        if (z4) {
            iA = 1;
        } else {
            V v6 = (V) atomicReferenceFieldUpdater.get(this);
            if (v6 == null) {
                V v7 = new V();
                v7.f1807c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, v7) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                t6.h.b(obj);
                v6 = (V) obj;
            }
            iA = u4.a(j, v6, this);
        }
        if (iA != 0) {
            if (iA == 1) {
                k(j, u4);
                return;
            } else {
                if (iA != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        V v8 = (V) atomicReferenceFieldUpdater.get(this);
        if (v8 != null) {
            synchronized (v8) {
                U[] uArr = v8.f3767a;
                u7 = uArr != null ? uArr[0] : null;
            }
        }
        if (u7 != u4 || Thread.currentThread() == (threadG = g())) {
            return;
        }
        LockSupport.unpark(threadG);
    }

    @Override // D6.X
    public void shutdown() {
        U uB;
        C0.f1776a.set(null);
        f1810z.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1808x;
            Object obj = atomicReferenceFieldUpdater.get(this);
            W0 w7 = E.f1780c;
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, w7)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof I6.n) {
                ((I6.n) obj).b();
                break;
            } else {
                if (obj == w7) {
                    break;
                }
                I6.n nVar = new I6.n(8, true);
                nVar.a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (i() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            V v6 = (V) f1809y.get(this);
            if (v6 == null) {
                return;
            }
            synchronized (v6) {
                uB = I6.y.f3766b.get(v6) > 0 ? v6.b(0) : null;
            }
            if (uB == null) {
                return;
            } else {
                k(jNanoTime, uB);
            }
        }
    }
}
