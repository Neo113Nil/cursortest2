package D2;

import B2.v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.q;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f292i = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* renamed from: a, reason: collision with root package name */
    public final m f293a;

    /* renamed from: b, reason: collision with root package name */
    public final q f294b;

    /* renamed from: c, reason: collision with root package name */
    public int f295c;

    /* renamed from: d, reason: collision with root package name */
    public long f296d;

    /* renamed from: e, reason: collision with root package name */
    public long f297e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f298g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f299h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    public a(b bVar, int i3) {
        this.f299h = bVar;
        setDaemon(true);
        this.f293a = new m();
        this.f294b = new q();
        this.f295c = 4;
        this.nextParkedWorker = b.f303k;
        q2.a aVar = q2.e.f10269a;
        this.f = q2.e.f10269a.a().nextInt();
        f(i3);
    }

    public final h a(boolean z3) {
        h e3;
        h e4;
        b bVar;
        long j3;
        int i3 = this.f295c;
        h hVar = null;
        m mVar = this.f293a;
        b bVar2 = this.f299h;
        if (i3 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f301i;
            do {
                bVar = this.f299h;
                j3 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j3) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f327b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar2 != null && hVar2.f316b.f317a == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, hVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != hVar2) {
                                    break;
                                }
                            }
                            hVar = hVar2;
                            break loop1;
                        }
                    }
                    int i4 = m.f329d.get(mVar);
                    int i5 = m.f328c.get(mVar);
                    while (true) {
                        if (i4 == i5 || m.f330e.get(mVar) == 0) {
                            break;
                        }
                        i5--;
                        h b3 = mVar.b(i5, true);
                        if (b3 != null) {
                            hVar = b3;
                            break;
                        }
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar3 = (h) bVar2.f.d();
                    return hVar3 == null ? i(1) : hVar3;
                }
            } while (!b.f301i.compareAndSet(bVar, j3, j3 - 4398046511104L));
            this.f295c = 1;
        }
        if (z3) {
            boolean z4 = d(bVar2.f304a * 2) == 0;
            if (z4 && (e4 = e()) != null) {
                return e4;
            }
            mVar.getClass();
            h hVar4 = (h) m.f327b.getAndSet(mVar, null);
            if (hVar4 == null) {
                hVar4 = mVar.a();
            }
            if (hVar4 != null) {
                return hVar4;
            }
            if (!z4 && (e3 = e()) != null) {
                return e3;
            }
        } else {
            h e5 = e();
            if (e5 != null) {
                return e5;
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

    public final int d(int i3) {
        int i4 = this.f;
        int i5 = i4 ^ (i4 << 13);
        int i6 = i5 ^ (i5 >> 17);
        int i7 = i6 ^ (i6 << 5);
        this.f = i7;
        int i8 = i3 - 1;
        return (i8 & i3) == 0 ? i7 & i8 : (i7 & Integer.MAX_VALUE) % i3;
    }

    public final h e() {
        int d3 = d(2);
        b bVar = this.f299h;
        if (d3 == 0) {
            h hVar = (h) bVar.f308e.d();
            return hVar != null ? hVar : (h) bVar.f.d();
        }
        h hVar2 = (h) bVar.f.d();
        return hVar2 != null ? hVar2 : (h) bVar.f308e.d();
    }

    public final void f(int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f299h.f307d);
        sb.append("-worker-");
        sb.append(i3 == 0 ? "TERMINATED" : String.valueOf(i3));
        setName(sb.toString());
        this.indexInArray = i3;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i3) {
        int i4 = this.f295c;
        boolean z3 = i4 == 1;
        if (z3) {
            b.f301i.addAndGet(this.f299h, 4398046511104L);
        }
        if (i4 != i3) {
            this.f295c = i3;
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a2, code lost:
    
        r7 = -2;
        r23 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h i(int i3) {
        int i4;
        long j3;
        h hVar;
        long j4;
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f301i;
        b bVar = this.f299h;
        int i5 = (int) (atomicLongFieldUpdater.get(bVar) & 2097151);
        h hVar2 = null;
        if (i5 < 2) {
            return null;
        }
        int d3 = d(i5);
        int i6 = 0;
        long j6 = Long.MAX_VALUE;
        while (i6 < i5) {
            int i7 = d3 + 1;
            if (i7 > i5) {
                i7 = 1;
            }
            a aVar = (a) bVar.f309g.b(i7);
            if (aVar == null || aVar == this) {
                i4 = i7;
            } else {
                m mVar = aVar.f293a;
                if (i3 == 3) {
                    hVar = mVar.a();
                    j3 = 0;
                } else {
                    mVar.getClass();
                    int i8 = m.f329d.get(mVar);
                    int i9 = m.f328c.get(mVar);
                    boolean z3 = i3 == 1;
                    while (true) {
                        if (i8 == i9) {
                            j3 = 0;
                            break;
                        }
                        j3 = 0;
                        if (!z3 || m.f330e.get(mVar) != 0) {
                            int i10 = i8 + 1;
                            hVar = mVar.b(i8, z3);
                            if (hVar != null) {
                                break;
                            }
                            i8 = i10;
                        } else {
                            break;
                        }
                    }
                    hVar = hVar2;
                }
                q qVar = this.f294b;
                if (hVar != null) {
                    qVar.f9672a = hVar;
                    i4 = i7;
                    j5 = -1;
                    j4 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f327b;
                        h hVar3 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar3 == null) {
                            j4 = -1;
                            break;
                        }
                        j4 = -1;
                        if (((hVar3.f316b.f317a == 1 ? 1 : 2) & i3) == 0) {
                            break;
                        }
                        k.f.getClass();
                        i4 = i7;
                        long nanoTime = System.nanoTime() - hVar3.f315a;
                        long j7 = k.f320b;
                        if (nanoTime < j7) {
                            j5 = j7 - nanoTime;
                            hVar2 = null;
                            break;
                        }
                        do {
                            hVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar, hVar3, null)) {
                                qVar.f9672a = hVar3;
                                j5 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar) == hVar3);
                        i7 = i4;
                        hVar2 = null;
                    }
                }
                if (j5 == j4) {
                    h hVar4 = (h) qVar.f9672a;
                    qVar.f9672a = hVar2;
                    return hVar4;
                }
                if (j5 > j3) {
                    j6 = Math.min(j6, j5);
                }
            }
            i6++;
            d3 = i4;
            hVar2 = null;
        }
        if (j6 == Long.MAX_VALUE) {
            j6 = 0;
        }
        this.f297e = j6;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        int i3;
        long j4;
        loop0: while (true) {
            boolean z3 = false;
            while (true) {
                b bVar = this.f299h;
                bVar.getClass();
                if (b.f302j.get(bVar) == 0 && this.f295c != 5) {
                    h a3 = a(this.f298g);
                    if (a3 != null) {
                        this.f297e = 0L;
                        int i4 = a3.f316b.f317a;
                        this.f296d = 0L;
                        if (this.f295c == 3) {
                            this.f295c = 2;
                        }
                        b bVar2 = this.f299h;
                        if (i4 != 0 && h(2) && !bVar2.e() && !bVar2.d(b.f301i.get(bVar2))) {
                            bVar2.e();
                        }
                        bVar2.getClass();
                        try {
                            a3.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        if (i4 != 0) {
                            b.f301i.addAndGet(bVar2, -2097152L);
                            if (this.f295c != 5) {
                                this.f295c = 4;
                            }
                        }
                    } else {
                        this.f298g = false;
                        if (this.f297e == 0) {
                            Object obj = this.nextParkedWorker;
                            v vVar = b.f303k;
                            long j5 = 2097151;
                            if (obj != vVar) {
                                f292i.set(this, -1);
                                while (this.nextParkedWorker != b.f303k) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f292i;
                                    if (atomicIntegerFieldUpdater.get(this) == -1) {
                                        b bVar3 = this.f299h;
                                        bVar3.getClass();
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = b.f302j;
                                        if (atomicIntegerFieldUpdater2.get(bVar3) == 0 && this.f295c != 5) {
                                            h(3);
                                            Thread.interrupted();
                                            if (this.f296d == 0) {
                                                j4 = j5;
                                                this.f296d = System.nanoTime() + this.f299h.f306c;
                                            } else {
                                                j4 = j5;
                                            }
                                            LockSupport.parkNanos(this.f299h.f306c);
                                            if (System.nanoTime() - this.f296d >= 0) {
                                                this.f296d = 0L;
                                                b bVar4 = this.f299h;
                                                synchronized (bVar4.f309g) {
                                                    try {
                                                        if (!(atomicIntegerFieldUpdater2.get(bVar4) != 0)) {
                                                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = b.f301i;
                                                            if (((int) (atomicLongFieldUpdater2.get(bVar4) & j4)) > bVar4.f304a) {
                                                                if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                    int i5 = this.indexInArray;
                                                                    f(0);
                                                                    bVar4.c(this, i5, 0);
                                                                    int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(bVar4) & j4);
                                                                    if (andDecrement != i5) {
                                                                        Object b3 = bVar4.f309g.b(andDecrement);
                                                                        kotlin.jvm.internal.j.b(b3);
                                                                        a aVar = (a) b3;
                                                                        bVar4.f309g.c(i5, aVar);
                                                                        aVar.f(i5);
                                                                        bVar4.c(aVar, andDecrement, i5);
                                                                    }
                                                                    bVar4.f309g.c(andDecrement, null);
                                                                    this.f295c = 5;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                            }
                                            j5 = j4;
                                        }
                                    }
                                }
                            } else {
                                b bVar5 = this.f299h;
                                bVar5.getClass();
                                if (this.nextParkedWorker == vVar) {
                                    do {
                                        atomicLongFieldUpdater = b.f300h;
                                        j3 = atomicLongFieldUpdater.get(bVar5);
                                        i3 = this.indexInArray;
                                        this.nextParkedWorker = bVar5.f309g.b((int) (j3 & 2097151));
                                    } while (!atomicLongFieldUpdater.compareAndSet(bVar5, j3, ((j3 + 2097152) & (-2097152)) | i3));
                                }
                            }
                        } else {
                            if (z3) {
                                h(3);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f297e);
                                this.f297e = 0L;
                                break;
                            }
                            z3 = true;
                        }
                    }
                }
            }
        }
        h(5);
    }
}
