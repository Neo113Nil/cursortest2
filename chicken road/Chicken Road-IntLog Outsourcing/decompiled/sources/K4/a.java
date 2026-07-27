package K4;

import G0.C0051a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.s;
import w4.AbstractC1525d;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1416i = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* renamed from: a, reason: collision with root package name */
    public final m f1417a;

    /* renamed from: b, reason: collision with root package name */
    public final s f1418b;

    /* renamed from: c, reason: collision with root package name */
    public int f1419c;

    /* renamed from: d, reason: collision with root package name */
    public long f1420d;

    /* renamed from: e, reason: collision with root package name */
    public long f1421e;

    /* renamed from: f, reason: collision with root package name */
    public int f1422f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1423g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f1424h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    public a(b bVar, int i2) {
        this.f1424h = bVar;
        setDaemon(true);
        this.f1417a = new m();
        this.f1418b = new s();
        this.f1419c = 4;
        this.nextParkedWorker = b.f1428k;
        AbstractC1525d.f12228a.getClass();
        this.f1422f = AbstractC1525d.f12229b.a().nextInt();
        f(i2);
    }

    public final h a(boolean z) {
        h e3;
        h e6;
        b bVar;
        long j2;
        int i2 = this.f1419c;
        h hVar = null;
        m mVar = this.f1417a;
        b bVar2 = this.f1424h;
        if (i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1426i;
            do {
                bVar = this.f1424h;
                j2 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f1454b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar2 != null && hVar2.f1442b.f1443a == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, hVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != hVar2) {
                                    break;
                                }
                            }
                            hVar = hVar2;
                            break loop1;
                        }
                    }
                    int i3 = m.f1456d.get(mVar);
                    int i6 = m.f1455c.get(mVar);
                    while (true) {
                        if (i3 == i6 || m.f1457e.get(mVar) == 0) {
                            break;
                        }
                        i6--;
                        h c2 = mVar.c(i6, true);
                        if (c2 != null) {
                            hVar = c2;
                            break;
                        }
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar3 = (h) bVar2.f1434f.d();
                    return hVar3 == null ? i(1) : hVar3;
                }
            } while (!b.f1426i.compareAndSet(bVar, j2, j2 - 4398046511104L));
            this.f1419c = 1;
        }
        if (z) {
            boolean z5 = d(bVar2.f1429a * 2) == 0;
            if (z5 && (e6 = e()) != null) {
                return e6;
            }
            mVar.getClass();
            h hVar4 = (h) m.f1454b.getAndSet(mVar, null);
            if (hVar4 == null) {
                hVar4 = mVar.b();
            }
            if (hVar4 != null) {
                return hVar4;
            }
            if (!z5 && (e3 = e()) != null) {
                return e3;
            }
        } else {
            h e7 = e();
            if (e7 != null) {
                return e7;
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

    public final int d(int i2) {
        int i3 = this.f1422f;
        int i6 = i3 ^ (i3 << 13);
        int i7 = i6 ^ (i6 >> 17);
        int i8 = i7 ^ (i7 << 5);
        this.f1422f = i8;
        int i9 = i2 - 1;
        return (i9 & i2) == 0 ? i8 & i9 : (i8 & Integer.MAX_VALUE) % i2;
    }

    public final h e() {
        int d6 = d(2);
        b bVar = this.f1424h;
        if (d6 == 0) {
            h hVar = (h) bVar.f1433e.d();
            return hVar != null ? hVar : (h) bVar.f1434f.d();
        }
        h hVar2 = (h) bVar.f1434f.d();
        return hVar2 != null ? hVar2 : (h) bVar.f1433e.d();
    }

    public final void f(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1424h.f1432d);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i2) {
        int i3 = this.f1419c;
        boolean z = i3 == 1;
        if (z) {
            b.f1426i.addAndGet(this.f1424h, 4398046511104L);
        }
        if (i3 != i2) {
            this.f1419c = i2;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        r19 = r6;
        r6 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h i(int i2) {
        int i3;
        h hVar;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1426i;
        b bVar = this.f1424h;
        int i6 = (int) (atomicLongFieldUpdater.get(bVar) & 2097151);
        h hVar2 = null;
        if (i6 < 2) {
            return null;
        }
        int d6 = d(i6);
        int i7 = 0;
        long j6 = Long.MAX_VALUE;
        while (i7 < i6) {
            int i8 = d6 + 1;
            if (i8 > i6) {
                i8 = 1;
            }
            a aVar = (a) bVar.f1435g.b(i8);
            if (aVar == null || aVar == this) {
                i3 = i8;
            } else {
                m mVar = aVar.f1417a;
                if (i2 == 3) {
                    hVar = mVar.b();
                } else {
                    mVar.getClass();
                    int i9 = m.f1456d.get(mVar);
                    int i10 = m.f1455c.get(mVar);
                    boolean z = i2 == 1;
                    while (i9 != i10 && (!z || m.f1457e.get(mVar) != 0)) {
                        int i11 = i9 + 1;
                        hVar = mVar.c(i9, z);
                        if (hVar != null) {
                            break;
                        }
                        i9 = i11;
                    }
                    hVar = hVar2;
                }
                s sVar = this.f1418b;
                if (hVar == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f1454b;
                        h hVar3 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar3 == null) {
                            break;
                        }
                        if (((hVar3.f1442b.f1443a == 1 ? 1 : 2) & i2) == 0) {
                            break;
                        }
                        k.f1450f.getClass();
                        i3 = i8;
                        long nanoTime = System.nanoTime() - hVar3.f1441a;
                        long j7 = k.f1446b;
                        if (nanoTime < j7) {
                            j2 = j7 - nanoTime;
                            hVar2 = null;
                            break;
                        }
                        do {
                            hVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar, hVar3, null)) {
                                sVar.f10741a = hVar3;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar) == hVar3);
                        i8 = i3;
                        hVar2 = null;
                    }
                } else {
                    sVar.f10741a = hVar;
                    i3 = i8;
                }
                j2 = -1;
                if (j2 == -1) {
                    h hVar4 = (h) sVar.f10741a;
                    sVar.f10741a = hVar2;
                    return hVar4;
                }
                if (j2 > 0) {
                    j6 = Math.min(j6, j2);
                }
            }
            i7++;
            d6 = i3;
            hVar2 = null;
        }
        if (j6 == Long.MAX_VALUE) {
            j6 = 0;
        }
        this.f1421e = j6;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        int i2;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                b bVar = this.f1424h;
                bVar.getClass();
                int i3 = 5;
                if (b.f1427j.get(bVar) == 0 && this.f1419c != 5) {
                    h a6 = a(this.f1423g);
                    int i6 = 3;
                    if (a6 != null) {
                        this.f1421e = 0L;
                        int i7 = a6.f1442b.f1443a;
                        this.f1420d = 0L;
                        if (this.f1419c == 3) {
                            this.f1419c = 2;
                        }
                        b bVar2 = this.f1424h;
                        if (i7 != 0 && h(2) && !bVar2.q() && !bVar2.p(b.f1426i.get(bVar2))) {
                            bVar2.q();
                        }
                        bVar2.getClass();
                        try {
                            a6.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        if (i7 != 0) {
                            b.f1426i.addAndGet(bVar2, -2097152L);
                            if (this.f1419c != 5) {
                                this.f1419c = 4;
                            }
                        }
                    } else {
                        this.f1423g = false;
                        if (this.f1421e == 0) {
                            Object obj = this.nextParkedWorker;
                            C0051a c0051a = b.f1428k;
                            if (obj != c0051a) {
                                f1416i.set(this, -1);
                                while (this.nextParkedWorker != b.f1428k) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1416i;
                                    if (atomicIntegerFieldUpdater.get(this) == -1) {
                                        b bVar3 = this.f1424h;
                                        bVar3.getClass();
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = b.f1427j;
                                        if (atomicIntegerFieldUpdater2.get(bVar3) == 0 && this.f1419c != i3) {
                                            h(i6);
                                            Thread.interrupted();
                                            if (this.f1420d == 0) {
                                                this.f1420d = System.nanoTime() + this.f1424h.f1431c;
                                            }
                                            LockSupport.parkNanos(this.f1424h.f1431c);
                                            if (System.nanoTime() - this.f1420d >= 0) {
                                                this.f1420d = 0L;
                                                b bVar4 = this.f1424h;
                                                synchronized (bVar4.f1435g) {
                                                    try {
                                                        if (!(atomicIntegerFieldUpdater2.get(bVar4) != 0)) {
                                                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = b.f1426i;
                                                            if (((int) (atomicLongFieldUpdater2.get(bVar4) & 2097151)) > bVar4.f1429a) {
                                                                if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                    int i8 = this.indexInArray;
                                                                    f(0);
                                                                    bVar4.o(this, i8, 0);
                                                                    int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(bVar4) & 2097151);
                                                                    if (andDecrement != i8) {
                                                                        Object b6 = bVar4.f1435g.b(andDecrement);
                                                                        kotlin.jvm.internal.i.b(b6);
                                                                        a aVar = (a) b6;
                                                                        bVar4.f1435g.c(i8, aVar);
                                                                        aVar.f(i8);
                                                                        bVar4.o(aVar, andDecrement, i8);
                                                                    }
                                                                    bVar4.f1435g.c(andDecrement, null);
                                                                    this.f1419c = 5;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                            }
                                            i3 = 5;
                                            i6 = 3;
                                        }
                                    }
                                }
                            } else {
                                b bVar5 = this.f1424h;
                                bVar5.getClass();
                                if (this.nextParkedWorker == c0051a) {
                                    do {
                                        atomicLongFieldUpdater = b.f1425h;
                                        j2 = atomicLongFieldUpdater.get(bVar5);
                                        i2 = this.indexInArray;
                                        this.nextParkedWorker = bVar5.f1435g.b((int) (j2 & 2097151));
                                    } while (!atomicLongFieldUpdater.compareAndSet(bVar5, j2, ((j2 + 2097152) & (-2097152)) | i2));
                                }
                            }
                        } else {
                            if (z) {
                                h(3);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f1421e);
                                this.f1421e = 0L;
                                break;
                            }
                            z = true;
                        }
                    }
                }
            }
        }
        h(5);
    }
}
