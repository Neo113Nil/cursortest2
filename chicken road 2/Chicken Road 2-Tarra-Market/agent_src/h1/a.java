package h1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1218i = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* renamed from: a, reason: collision with root package name */
    public final m f1219a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.internal.m f1220b;

    /* renamed from: c, reason: collision with root package name */
    public int f1221c;

    /* renamed from: d, reason: collision with root package name */
    public long f1222d;

    /* renamed from: e, reason: collision with root package name */
    public long f1223e;

    /* renamed from: f, reason: collision with root package name */
    public int f1224f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1225g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f1226h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    public a(b bVar, int i2) {
        this.f1226h = bVar;
        setDaemon(true);
        this.f1219a = new m();
        this.f1220b = new kotlin.jvm.internal.m();
        this.f1221c = 4;
        this.nextParkedWorker = b.f1230k;
        V0.e.f503a.getClass();
        this.f1224f = V0.e.f504b.a().nextInt();
        f(i2);
    }

    public final h a(boolean z2) {
        h e2;
        h e3;
        b bVar;
        long j2;
        int i2 = this.f1221c;
        h hVar = null;
        m mVar = this.f1219a;
        b bVar2 = this.f1226h;
        if (i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1228i;
            do {
                bVar = this.f1226h;
                j2 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f1256b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar2 != null && hVar2.f1244b.f1245a == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, hVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != hVar2) {
                                    break;
                                }
                            }
                            hVar = hVar2;
                            break loop1;
                        }
                    }
                    int i3 = m.f1258d.get(mVar);
                    int i4 = m.f1257c.get(mVar);
                    while (true) {
                        if (i3 == i4 || m.f1259e.get(mVar) == 0) {
                            break;
                        }
                        i4--;
                        h c2 = mVar.c(i4, true);
                        if (c2 != null) {
                            hVar = c2;
                            break;
                        }
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar3 = (h) bVar2.f1236f.d();
                    return hVar3 == null ? i(1) : hVar3;
                }
            } while (!b.f1228i.compareAndSet(bVar, j2, j2 - 4398046511104L));
            this.f1221c = 1;
        }
        if (z2) {
            boolean z3 = d(bVar2.f1231a * 2) == 0;
            if (z3 && (e3 = e()) != null) {
                return e3;
            }
            mVar.getClass();
            h hVar4 = (h) m.f1256b.getAndSet(mVar, null);
            if (hVar4 == null) {
                hVar4 = mVar.b();
            }
            if (hVar4 != null) {
                return hVar4;
            }
            if (!z3 && (e2 = e()) != null) {
                return e2;
            }
        } else {
            h e4 = e();
            if (e4 != null) {
                return e4;
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
        int i3 = this.f1224f;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f1224f = i6;
        int i7 = i2 - 1;
        return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
    }

    public final h e() {
        int d2 = d(2);
        b bVar = this.f1226h;
        if (d2 == 0) {
            h hVar = (h) bVar.f1235e.d();
            return hVar != null ? hVar : (h) bVar.f1236f.d();
        }
        h hVar2 = (h) bVar.f1236f.d();
        return hVar2 != null ? hVar2 : (h) bVar.f1235e.d();
    }

    public final void f(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1226h.f1234d);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i2) {
        int i3 = this.f1221c;
        boolean z2 = i3 == 1;
        if (z2) {
            b.f1228i.addAndGet(this.f1226h, 4398046511104L);
        }
        if (i3 != i2) {
            this.f1221c = i2;
        }
        return z2;
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
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1228i;
        b bVar = this.f1226h;
        int i4 = (int) (atomicLongFieldUpdater.get(bVar) & 2097151);
        h hVar2 = null;
        if (i4 < 2) {
            return null;
        }
        int d2 = d(i4);
        int i5 = 0;
        long j3 = Long.MAX_VALUE;
        while (i5 < i4) {
            int i6 = d2 + 1;
            if (i6 > i4) {
                i6 = 1;
            }
            a aVar = (a) bVar.f1237g.b(i6);
            if (aVar == null || aVar == this) {
                i3 = i6;
            } else {
                m mVar = aVar.f1219a;
                if (i2 == 3) {
                    hVar = mVar.b();
                } else {
                    mVar.getClass();
                    int i7 = m.f1258d.get(mVar);
                    int i8 = m.f1257c.get(mVar);
                    boolean z2 = i2 == 1;
                    while (i7 != i8 && (!z2 || m.f1259e.get(mVar) != 0)) {
                        int i9 = i7 + 1;
                        hVar = mVar.c(i7, z2);
                        if (hVar != null) {
                            break;
                        }
                        i7 = i9;
                    }
                    hVar = hVar2;
                }
                kotlin.jvm.internal.m mVar2 = this.f1220b;
                if (hVar == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f1256b;
                        h hVar3 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar3 == null) {
                            break;
                        }
                        if (((hVar3.f1244b.f1245a == 1 ? 1 : 2) & i2) == 0) {
                            break;
                        }
                        k.f1252f.getClass();
                        i3 = i6;
                        long nanoTime = System.nanoTime() - hVar3.f1243a;
                        long j4 = k.f1248b;
                        if (nanoTime < j4) {
                            j2 = j4 - nanoTime;
                            hVar2 = null;
                            break;
                        }
                        do {
                            hVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar, hVar3, null)) {
                                mVar2.f6080a = hVar3;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar) == hVar3);
                        i6 = i3;
                        hVar2 = null;
                    }
                } else {
                    mVar2.f6080a = hVar;
                    i3 = i6;
                }
                j2 = -1;
                if (j2 == -1) {
                    h hVar4 = (h) mVar2.f6080a;
                    mVar2.f6080a = hVar2;
                    return hVar4;
                }
                if (j2 > 0) {
                    j3 = Math.min(j3, j2);
                }
            }
            i5++;
            d2 = i3;
            hVar2 = null;
        }
        if (j3 == Long.MAX_VALUE) {
            j3 = 0;
        }
        this.f1223e = j3;
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
            boolean z2 = false;
            while (true) {
                b bVar = this.f1226h;
                bVar.getClass();
                int i3 = 5;
                if (b.f1229j.get(bVar) == 0 && this.f1221c != 5) {
                    h a2 = a(this.f1225g);
                    int i4 = 3;
                    if (a2 != null) {
                        this.f1223e = 0L;
                        int i5 = a2.f1244b.f1245a;
                        this.f1222d = 0L;
                        if (this.f1221c == 3) {
                            this.f1221c = 2;
                        }
                        b bVar2 = this.f1226h;
                        if (i5 != 0 && h(2) && !bVar2.j() && !bVar2.i(b.f1228i.get(bVar2))) {
                            bVar2.j();
                        }
                        bVar2.getClass();
                        try {
                            a2.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        if (i5 != 0) {
                            b.f1228i.addAndGet(bVar2, -2097152L);
                            if (this.f1221c != 5) {
                                this.f1221c = 4;
                            }
                        }
                    } else {
                        this.f1225g = false;
                        if (this.f1223e == 0) {
                            Object obj = this.nextParkedWorker;
                            C0.a aVar = b.f1230k;
                            if (obj != aVar) {
                                f1218i.set(this, -1);
                                while (this.nextParkedWorker != b.f1230k) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1218i;
                                    if (atomicIntegerFieldUpdater.get(this) == -1) {
                                        b bVar3 = this.f1226h;
                                        bVar3.getClass();
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = b.f1229j;
                                        if (atomicIntegerFieldUpdater2.get(bVar3) == 0 && this.f1221c != i3) {
                                            h(i4);
                                            Thread.interrupted();
                                            if (this.f1222d == 0) {
                                                this.f1222d = System.nanoTime() + this.f1226h.f1233c;
                                            }
                                            LockSupport.parkNanos(this.f1226h.f1233c);
                                            if (System.nanoTime() - this.f1222d >= 0) {
                                                this.f1222d = 0L;
                                                b bVar4 = this.f1226h;
                                                synchronized (bVar4.f1237g) {
                                                    try {
                                                        if (!(atomicIntegerFieldUpdater2.get(bVar4) != 0)) {
                                                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = b.f1228i;
                                                            if (((int) (atomicLongFieldUpdater2.get(bVar4) & 2097151)) > bVar4.f1231a) {
                                                                if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                    int i6 = this.indexInArray;
                                                                    f(0);
                                                                    bVar4.g(this, i6, 0);
                                                                    int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(bVar4) & 2097151);
                                                                    if (andDecrement != i6) {
                                                                        Object b2 = bVar4.f1237g.b(andDecrement);
                                                                        kotlin.jvm.internal.j.b(b2);
                                                                        a aVar2 = (a) b2;
                                                                        bVar4.f1237g.c(i6, aVar2);
                                                                        aVar2.f(i6);
                                                                        bVar4.g(aVar2, andDecrement, i6);
                                                                    }
                                                                    bVar4.f1237g.c(andDecrement, null);
                                                                    this.f1221c = 5;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                            }
                                            i3 = 5;
                                            i4 = 3;
                                        }
                                    }
                                }
                            } else {
                                b bVar5 = this.f1226h;
                                bVar5.getClass();
                                if (this.nextParkedWorker == aVar) {
                                    do {
                                        atomicLongFieldUpdater = b.f1227h;
                                        j2 = atomicLongFieldUpdater.get(bVar5);
                                        i2 = this.indexInArray;
                                        this.nextParkedWorker = bVar5.f1237g.b((int) (j2 & 2097151));
                                    } while (!atomicLongFieldUpdater.compareAndSet(bVar5, j2, ((j2 + 2097152) & (-2097152)) | i2));
                                }
                            }
                        } else {
                            if (z2) {
                                h(3);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f1223e);
                                this.f1223e = 0L;
                                break;
                            }
                            z2 = true;
                        }
                    }
                }
            }
        }
        h(5);
    }
}
