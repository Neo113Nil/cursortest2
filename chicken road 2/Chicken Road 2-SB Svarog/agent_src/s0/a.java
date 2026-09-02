package s0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1208j = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* renamed from: b, reason: collision with root package name */
    public final l f1209b;

    /* renamed from: c, reason: collision with root package name */
    public final g0.k f1210c;

    /* renamed from: d, reason: collision with root package name */
    public int f1211d;

    /* renamed from: e, reason: collision with root package name */
    public long f1212e;

    /* renamed from: f, reason: collision with root package name */
    public long f1213f;

    /* renamed from: g, reason: collision with root package name */
    public int f1214g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1215h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b f1216i;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    public a(b bVar, int i2) {
        this.f1216i = bVar;
        setDaemon(true);
        this.f1209b = new l();
        this.f1210c = new g0.k();
        this.f1211d = 4;
        this.nextParkedWorker = b.f1220l;
        h0.a aVar = h0.e.f549b;
        this.f1214g = h0.e.f549b.a().nextInt();
        f(i2);
    }

    public final h a(boolean z2) {
        h e2;
        h e3;
        long j2;
        int i2 = this.f1211d;
        b bVar = this.f1216i;
        h hVar = null;
        l lVar = this.f1209b;
        if (i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1218j;
            do {
                j2 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                    lVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f1245b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar2 != null && hVar2.f1234c.f38a == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, hVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(lVar) != hVar2) {
                                    break;
                                }
                            }
                            hVar = hVar2;
                            break loop1;
                        }
                    }
                    int i3 = l.f1247d.get(lVar);
                    int i4 = l.f1246c.get(lVar);
                    while (true) {
                        if (i3 == i4 || l.f1248e.get(lVar) == 0) {
                            break;
                        }
                        i4--;
                        h b2 = lVar.b(i4, true);
                        if (b2 != null) {
                            hVar = b2;
                            break;
                        }
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar3 = (h) bVar.f1226g.d();
                    return hVar3 == null ? i(1) : hVar3;
                }
            } while (!b.f1218j.compareAndSet(bVar, j2, j2 - 4398046511104L));
            this.f1211d = 1;
        }
        if (z2) {
            boolean z3 = d(bVar.f1221b * 2) == 0;
            if (z3 && (e3 = e()) != null) {
                return e3;
            }
            lVar.getClass();
            h hVar4 = (h) l.f1245b.getAndSet(lVar, null);
            if (hVar4 == null) {
                hVar4 = lVar.a();
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
        int i3 = this.f1214g;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f1214g = i6;
        int i7 = i2 - 1;
        return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
    }

    public final h e() {
        int d2 = d(2);
        b bVar = this.f1216i;
        if (d2 == 0) {
            h hVar = (h) bVar.f1225f.d();
            return hVar != null ? hVar : (h) bVar.f1226g.d();
        }
        h hVar2 = (h) bVar.f1226g.d();
        return hVar2 != null ? hVar2 : (h) bVar.f1225f.d();
    }

    public final void f(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1216i.f1224e);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i2) {
        int i3 = this.f1211d;
        boolean z2 = i3 == 1;
        if (z2) {
            b.f1218j.addAndGet(this.f1216i, 4398046511104L);
        }
        if (i3 != i2) {
            this.f1211d = i2;
        }
        return z2;
    }

    public final h i(int i2) {
        long j2;
        h hVar;
        long j3;
        long j4;
        h hVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1218j;
        b bVar = this.f1216i;
        int i3 = (int) (atomicLongFieldUpdater.get(bVar) & 2097151);
        h hVar3 = null;
        if (i3 < 2) {
            return null;
        }
        int d2 = d(i3);
        int i4 = 0;
        long j5 = Long.MAX_VALUE;
        while (i4 < i3) {
            d2++;
            if (d2 > i3) {
                d2 = 1;
            }
            a aVar = (a) bVar.f1227h.b(d2);
            if (aVar != null && aVar != this) {
                l lVar = aVar.f1209b;
                if (i2 == 3) {
                    hVar = lVar.a();
                    j2 = 0;
                } else {
                    lVar.getClass();
                    int i5 = l.f1247d.get(lVar);
                    int i6 = l.f1246c.get(lVar);
                    boolean z2 = i2 == 1;
                    while (true) {
                        if (i5 == i6) {
                            j2 = 0;
                            break;
                        }
                        j2 = 0;
                        if (!z2 || l.f1248e.get(lVar) != 0) {
                            int i7 = i5 + 1;
                            hVar = lVar.b(i5, z2);
                            if (hVar != null) {
                                break;
                            }
                            i5 = i7;
                        } else {
                            break;
                        }
                    }
                    hVar = hVar3;
                }
                g0.k kVar = this.f1210c;
                if (hVar != null) {
                    kVar.f546b = hVar;
                    hVar2 = hVar3;
                    j4 = -1;
                    j3 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f1245b;
                        h hVar4 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar4 == null) {
                            j3 = -1;
                            break;
                        }
                        j3 = -1;
                        if (((hVar4.f1234c.f38a == 1 ? 1 : 2) & i2) == 0) {
                            break;
                        }
                        j.f1241f.getClass();
                        l lVar2 = lVar;
                        long nanoTime = System.nanoTime() - hVar4.f1233b;
                        long j6 = j.f1237b;
                        if (nanoTime < j6) {
                            j4 = j6 - nanoTime;
                            hVar2 = null;
                            break;
                        }
                        do {
                            hVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(lVar2, hVar4, null)) {
                                kVar.f546b = hVar4;
                                j4 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(lVar2) == hVar4);
                        lVar = lVar2;
                        hVar3 = null;
                    }
                    j4 = -2;
                    hVar2 = hVar3;
                }
                if (j4 == j3) {
                    h hVar5 = (h) kVar.f546b;
                    kVar.f546b = hVar2;
                    return hVar5;
                }
                if (j4 > j2) {
                    j5 = Math.min(j5, j4);
                }
            }
            i4++;
            hVar3 = null;
        }
        if (j5 == Long.MAX_VALUE) {
            j5 = 0;
        }
        this.f1213f = j5;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j2;
        loop0: while (true) {
            boolean z2 = false;
            while (b.f1219k.get(this.f1216i) == 0 && this.f1211d != 5) {
                h a2 = a(this.f1215h);
                if (a2 != null) {
                    this.f1213f = 0L;
                    b bVar = this.f1216i;
                    int i2 = a2.f1234c.f38a;
                    this.f1212e = 0L;
                    if (this.f1211d == 3) {
                        this.f1211d = 2;
                    }
                    if (i2 != 0 && h(2) && !bVar.e() && !bVar.d(b.f1218j.get(bVar))) {
                        bVar.e();
                    }
                    try {
                        a2.run();
                    } catch (Throwable th) {
                        Thread currentThread = Thread.currentThread();
                        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                    }
                    if (i2 != 0) {
                        b.f1218j.addAndGet(bVar, -2097152L);
                        if (this.f1211d != 5) {
                            this.f1211d = 4;
                        }
                    }
                } else {
                    this.f1215h = false;
                    if (this.f1213f == 0) {
                        Object obj = this.nextParkedWorker;
                        io.flutter.plugin.platform.i iVar = b.f1220l;
                        if (obj != iVar) {
                            f1208j.set(this, -1);
                            while (this.nextParkedWorker != b.f1220l) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1208j;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    b bVar2 = this.f1216i;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = b.f1219k;
                                    if (atomicIntegerFieldUpdater2.get(bVar2) == 0 && this.f1211d != 5) {
                                        h(3);
                                        Thread.interrupted();
                                        if (this.f1212e == 0) {
                                            j2 = 2097151;
                                            this.f1212e = System.nanoTime() + this.f1216i.f1223d;
                                        } else {
                                            j2 = 2097151;
                                        }
                                        LockSupport.parkNanos(this.f1216i.f1223d);
                                        if (System.nanoTime() - this.f1212e >= 0) {
                                            this.f1212e = 0L;
                                            b bVar3 = this.f1216i;
                                            synchronized (bVar3.f1227h) {
                                                try {
                                                    if (!(atomicIntegerFieldUpdater2.get(bVar3) != 0)) {
                                                        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1218j;
                                                        if (((int) (atomicLongFieldUpdater.get(bVar3) & j2)) > bVar3.f1221b) {
                                                            if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                int i3 = this.indexInArray;
                                                                f(0);
                                                                bVar3.c(this, i3, 0);
                                                                int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(bVar3) & j2);
                                                                if (andDecrement != i3) {
                                                                    Object b2 = bVar3.f1227h.b(andDecrement);
                                                                    g0.h.b(b2);
                                                                    a aVar = (a) b2;
                                                                    bVar3.f1227h.c(i3, aVar);
                                                                    aVar.f(i3);
                                                                    bVar3.c(aVar, andDecrement, i3);
                                                                }
                                                                bVar3.f1227h.c(andDecrement, null);
                                                                this.f1211d = 5;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    throw th2;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            b bVar4 = this.f1216i;
                            if (this.nextParkedWorker == iVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = b.f1217i;
                                while (true) {
                                    long j3 = atomicLongFieldUpdater2.get(bVar4);
                                    int i4 = this.indexInArray;
                                    this.nextParkedWorker = bVar4.f1227h.b((int) (j3 & 2097151));
                                    b bVar5 = bVar4;
                                    if (b.f1217i.compareAndSet(bVar5, j3, ((j3 + 2097152) & (-2097152)) | i4)) {
                                        break;
                                    } else {
                                        bVar4 = bVar5;
                                    }
                                }
                            }
                        }
                    } else if (z2) {
                        h(3);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.f1213f);
                        this.f1213f = 0L;
                    } else {
                        z2 = true;
                    }
                }
            }
        }
        h(5);
    }
}
