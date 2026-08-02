package w4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.w;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20533s = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
    private volatile int indexInArray;

    /* renamed from: k, reason: collision with root package name */
    public final m f20534k;

    /* renamed from: l, reason: collision with root package name */
    public final w f20535l;

    /* renamed from: m, reason: collision with root package name */
    public b f20536m;

    /* renamed from: n, reason: collision with root package name */
    public long f20537n;
    private volatile Object nextParkedWorker;

    /* renamed from: o, reason: collision with root package name */
    public long f20538o;

    /* renamed from: p, reason: collision with root package name */
    public int f20539p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f20540q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f20541r;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(c cVar, int i) {
        this.f20541r = cVar;
        setDaemon(true);
        setContextClassLoader(cVar.getClass().getClassLoader());
        this.f20534k = new m();
        this.f20535l = new w();
        this.f20536m = b.f20545n;
        this.nextParkedWorker = c.f20551u;
        int nanoTime = (int) System.nanoTime();
        this.f20539p = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final i a(boolean z3) {
        i e3;
        i e5;
        c cVar;
        long j5;
        b bVar = this.f20536m;
        b bVar2 = b.f20542k;
        i iVar = null;
        m mVar = this.f20534k;
        c cVar2 = this.f20541r;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f20549s;
            do {
                cVar = this.f20541r;
                j5 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j5) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f20573b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 != null && iVar2.f20565l) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                    break;
                                }
                            }
                            iVar = iVar2;
                            break loop1;
                        }
                    }
                    int i = m.f20575d.get(mVar);
                    int i5 = m.f20574c.get(mVar);
                    while (true) {
                        if (i == i5 || m.f20576e.get(mVar) == 0) {
                            break;
                        }
                        i5--;
                        i c5 = mVar.c(i5, true);
                        if (c5 != null) {
                            iVar = c5;
                            break;
                        }
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar3 = (i) cVar2.f20557p.d();
                    return iVar3 == null ? i(1) : iVar3;
                }
            } while (!c.f20549s.compareAndSet(cVar, j5, j5 - 4398046511104L));
            this.f20536m = bVar2;
        }
        if (z3) {
            boolean z5 = d(cVar2.f20552k * 2) == 0;
            if (z5 && (e5 = e()) != null) {
                return e5;
            }
            mVar.getClass();
            i iVar4 = (i) m.f20573b.getAndSet(mVar, null);
            if (iVar4 == null) {
                iVar4 = mVar.b();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z5 && (e3 = e()) != null) {
                return e3;
            }
        } else {
            i e6 = e();
            if (e6 != null) {
                return e6;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i5 = this.f20539p;
        int i6 = i5 ^ (i5 << 13);
        int i7 = i6 ^ (i6 >> 17);
        int i8 = i7 ^ (i7 << 5);
        this.f20539p = i8;
        int i9 = i - 1;
        return (i9 & i) == 0 ? i8 & i9 : (i8 & Integer.MAX_VALUE) % i;
    }

    public final i e() {
        int d5 = d(2);
        c cVar = this.f20541r;
        if (d5 == 0) {
            i iVar = (i) cVar.f20556o.d();
            return iVar != null ? iVar : (i) cVar.f20557p.d();
        }
        i iVar2 = (i) cVar.f20557p.d();
        return iVar2 != null ? iVar2 : (i) cVar.f20556o.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20541r.f20555n);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f20536m;
        boolean z3 = bVar2 == b.f20542k;
        if (z3) {
            c.f20549s.addAndGet(this.f20541r, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f20536m = bVar;
        }
        return z3;
    }

    public final i i(int i) {
        int i5;
        long j5;
        i iVar;
        long j6;
        long j7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f20549s;
        c cVar = this.f20541r;
        int i6 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar2 = null;
        if (i6 < 2) {
            return null;
        }
        int d5 = d(i6);
        int i7 = 0;
        long j8 = Long.MAX_VALUE;
        while (i7 < i6) {
            int i8 = d5 + 1;
            if (i8 > i6) {
                i8 = 1;
            }
            a aVar = (a) cVar.f20558q.b(i8);
            if (aVar == null || aVar == this) {
                i5 = i8;
            } else {
                m mVar = aVar.f20534k;
                if (i == 3) {
                    iVar = mVar.b();
                    j5 = 0;
                } else {
                    mVar.getClass();
                    int i9 = m.f20575d.get(mVar);
                    int i10 = m.f20574c.get(mVar);
                    boolean z3 = i == 1;
                    while (true) {
                        if (i9 == i10) {
                            j5 = 0;
                            break;
                        }
                        j5 = 0;
                        if (!z3 || m.f20576e.get(mVar) != 0) {
                            int i11 = i9 + 1;
                            iVar = mVar.c(i9, z3);
                            if (iVar != null) {
                                break;
                            }
                            i9 = i11;
                        } else {
                            break;
                        }
                    }
                    iVar = iVar2;
                }
                w wVar = this.f20535l;
                if (iVar != null) {
                    wVar.f17624k = iVar;
                    i5 = i8;
                    j7 = -1;
                    j6 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f20573b;
                        i iVar3 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar3 == null) {
                            j6 = -1;
                            break;
                        }
                        j6 = -1;
                        if (((iVar3.f20565l ? 1 : 2) & i) == 0) {
                            break;
                        }
                        k.f.getClass();
                        i5 = i8;
                        long nanoTime = System.nanoTime() - iVar3.f20564k;
                        long j9 = k.f20568b;
                        if (nanoTime < j9) {
                            j7 = j9 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar, iVar3, null)) {
                                wVar.f17624k = iVar3;
                                j7 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar) == iVar3);
                        i8 = i5;
                        iVar2 = null;
                    }
                    j7 = -2;
                    i5 = i8;
                }
                if (j7 == j6) {
                    i iVar4 = (i) wVar.f17624k;
                    wVar.f17624k = iVar2;
                    return iVar4;
                }
                if (j7 > j5) {
                    j8 = Math.min(j8, j7);
                }
            }
            i7++;
            d5 = i5;
            iVar2 = null;
        }
        if (j8 == Long.MAX_VALUE) {
            j8 = 0;
        }
        this.f20538o = j8;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j5;
        int i;
        long j6;
        loop0: while (true) {
            boolean z3 = false;
            while (true) {
                c cVar = this.f20541r;
                cVar.getClass();
                if (c.f20550t.get(cVar) == 0) {
                    b bVar = this.f20536m;
                    b bVar2 = b.f20546o;
                    if (bVar == bVar2) {
                        break loop0;
                    }
                    i a5 = a(this.f20540q);
                    if (a5 != null) {
                        this.f20538o = 0L;
                        this.f20537n = 0L;
                        if (this.f20536m == b.f20544m) {
                            this.f20536m = b.f20543l;
                        }
                        boolean z5 = a5.f20565l;
                        c cVar2 = this.f20541r;
                        if (z5) {
                            if (h(b.f20543l) && !cVar2.k() && !cVar2.i(c.f20549s.get(cVar2))) {
                                cVar2.k();
                            }
                            cVar2.getClass();
                            try {
                                a5.run();
                            } catch (Throwable th) {
                                Thread currentThread = Thread.currentThread();
                                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                            }
                            c.f20549s.addAndGet(cVar2, -2097152L);
                            if (this.f20536m != bVar2) {
                                this.f20536m = b.f20545n;
                            }
                        } else {
                            cVar2.getClass();
                            try {
                                a5.run();
                            } catch (Throwable th2) {
                                Thread currentThread2 = Thread.currentThread();
                                currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                            }
                        }
                    } else {
                        this.f20540q = false;
                        if (this.f20538o == 0) {
                            Object obj = this.nextParkedWorker;
                            H3.g gVar = c.f20551u;
                            long j7 = 2097151;
                            if (obj != gVar) {
                                f20533s.set(this, -1);
                                while (this.nextParkedWorker != c.f20551u) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20533s;
                                    if (atomicIntegerFieldUpdater.get(this) == -1) {
                                        c cVar3 = this.f20541r;
                                        cVar3.getClass();
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c.f20550t;
                                        if (atomicIntegerFieldUpdater2.get(cVar3) != 0) {
                                            break;
                                        }
                                        b bVar3 = this.f20536m;
                                        b bVar4 = b.f20546o;
                                        if (bVar3 == bVar4) {
                                            break;
                                        }
                                        h(b.f20544m);
                                        Thread.interrupted();
                                        if (this.f20537n == 0) {
                                            j6 = j7;
                                            this.f20537n = System.nanoTime() + this.f20541r.f20554m;
                                        } else {
                                            j6 = j7;
                                        }
                                        LockSupport.parkNanos(this.f20541r.f20554m);
                                        if (System.nanoTime() - this.f20537n >= 0) {
                                            this.f20537n = 0L;
                                            c cVar4 = this.f20541r;
                                            synchronized (cVar4.f20558q) {
                                                try {
                                                    if (!(atomicIntegerFieldUpdater2.get(cVar4) != 0)) {
                                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f20549s;
                                                        if (((int) (atomicLongFieldUpdater2.get(cVar4) & j6)) > cVar4.f20552k) {
                                                            if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                int i5 = this.indexInArray;
                                                                f(0);
                                                                cVar4.h(this, i5, 0);
                                                                int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(cVar4) & j6);
                                                                if (andDecrement != i5) {
                                                                    Object b3 = cVar4.f20558q.b(andDecrement);
                                                                    kotlin.jvm.internal.l.c(b3);
                                                                    a aVar = (a) b3;
                                                                    cVar4.f20558q.c(i5, aVar);
                                                                    aVar.f(i5);
                                                                    cVar4.h(aVar, andDecrement, i5);
                                                                }
                                                                cVar4.f20558q.c(andDecrement, null);
                                                                this.f20536m = bVar4;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    throw th3;
                                                }
                                            }
                                        }
                                        j7 = j6;
                                    }
                                }
                            } else {
                                c cVar5 = this.f20541r;
                                cVar5.getClass();
                                if (this.nextParkedWorker == gVar) {
                                    do {
                                        atomicLongFieldUpdater = c.f20548r;
                                        j5 = atomicLongFieldUpdater.get(cVar5);
                                        i = this.indexInArray;
                                        this.nextParkedWorker = cVar5.f20558q.b((int) (j5 & 2097151));
                                    } while (!atomicLongFieldUpdater.compareAndSet(cVar5, j5, ((2097152 + j5) & (-2097152)) | i));
                                }
                            }
                        } else {
                            if (z3) {
                                h(b.f20544m);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f20538o);
                                this.f20538o = 0L;
                                break;
                            }
                            z3 = true;
                        }
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(b.f20546o);
    }
}
