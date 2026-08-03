package G1;

/* loaded from: classes.dex */
public final class a extends java.lang.Thread {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f557i = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(G1.a.class, "workerCtl");

    /* renamed from: a, reason: collision with root package name */
    public final G1.m f558a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.internal.p f559b;

    /* renamed from: c, reason: collision with root package name */
    public int f560c;

    /* renamed from: d, reason: collision with root package name */
    public long f561d;

    /* renamed from: e, reason: collision with root package name */
    public long f562e;

    /* renamed from: f, reason: collision with root package name */
    public int f563f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f564g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ G1.b f565h;
    private volatile int indexInArray;
    private volatile java.lang.Object nextParkedWorker;
    private volatile int workerCtl;

    public a(G1.b bVar, int i2) {
        this.f565h = bVar;
        setDaemon(true);
        this.f558a = new G1.m();
        this.f559b = new kotlin.jvm.internal.p();
        this.f560c = 4;
        this.nextParkedWorker = G1.b.f569k;
        t1.d.f8354a.getClass();
        this.f563f = t1.d.f8355b.a().nextInt();
        f(i2);
    }

    public final G1.h a(boolean z2) {
        G1.h e2;
        G1.h e3;
        G1.b bVar;
        long j2;
        int i2 = this.f560c;
        G1.h hVar = null;
        G1.m mVar = this.f558a;
        G1.b bVar2 = this.f565h;
        if (i2 != 1) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = G1.b.f567i;
            do {
                bVar = this.f565h;
                j2 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = G1.m.f595b;
                        G1.h hVar2 = (G1.h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar2 != null && hVar2.f583b.f584a == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, hVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != hVar2) {
                                    break;
                                }
                            }
                            hVar = hVar2;
                            break loop1;
                        }
                    }
                    int i3 = G1.m.f597d.get(mVar);
                    int i4 = G1.m.f596c.get(mVar);
                    while (true) {
                        if (i3 == i4 || G1.m.f598e.get(mVar) == 0) {
                            break;
                        }
                        i4--;
                        G1.h c2 = mVar.c(i4, true);
                        if (c2 != null) {
                            hVar = c2;
                            break;
                        }
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    G1.h hVar3 = (G1.h) bVar2.f575f.d();
                    return hVar3 == null ? i(1) : hVar3;
                }
            } while (!G1.b.f567i.compareAndSet(bVar, j2, j2 - 4398046511104L));
            this.f560c = 1;
        }
        if (z2) {
            boolean z3 = d(bVar2.f570a * 2) == 0;
            if (z3 && (e3 = e()) != null) {
                return e3;
            }
            mVar.getClass();
            G1.h hVar4 = (G1.h) G1.m.f595b.getAndSet(mVar, null);
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
            G1.h e4 = e();
            if (e4 != null) {
                return e4;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final java.lang.Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i2) {
        int i3 = this.f563f;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f563f = i6;
        int i7 = i2 - 1;
        return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
    }

    public final G1.h e() {
        int d2 = d(2);
        G1.b bVar = this.f565h;
        if (d2 == 0) {
            G1.h hVar = (G1.h) bVar.f574e.d();
            return hVar != null ? hVar : (G1.h) bVar.f575f.d();
        }
        G1.h hVar2 = (G1.h) bVar.f575f.d();
        return hVar2 != null ? hVar2 : (G1.h) bVar.f574e.d();
    }

    public final void f(int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f565h.f573d);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : java.lang.String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(java.lang.Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i2) {
        int i3 = this.f560c;
        boolean z2 = i3 == 1;
        if (z2) {
            G1.b.f567i.addAndGet(this.f565h, 4398046511104L);
        }
        if (i3 != i2) {
            this.f560c = i2;
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
    public final G1.h i(int i2) {
        int i3;
        G1.h hVar;
        long j2;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = G1.b.f567i;
        G1.b bVar = this.f565h;
        int i4 = (int) (atomicLongFieldUpdater.get(bVar) & 2097151);
        G1.h hVar2 = null;
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
            G1.a aVar = (G1.a) bVar.f576g.b(i6);
            if (aVar == null || aVar == this) {
                i3 = i6;
            } else {
                G1.m mVar = aVar.f558a;
                if (i2 == 3) {
                    hVar = mVar.b();
                } else {
                    mVar.getClass();
                    int i7 = G1.m.f597d.get(mVar);
                    int i8 = G1.m.f596c.get(mVar);
                    boolean z2 = i2 == 1;
                    while (i7 != i8 && (!z2 || G1.m.f598e.get(mVar) != 0)) {
                        int i9 = i7 + 1;
                        hVar = mVar.c(i7, z2);
                        if (hVar != null) {
                            break;
                        }
                        i7 = i9;
                    }
                    hVar = hVar2;
                }
                kotlin.jvm.internal.p pVar = this.f559b;
                if (hVar == null) {
                    while (true) {
                        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = G1.m.f595b;
                        G1.h hVar3 = (G1.h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar3 == null) {
                            break;
                        }
                        if (((hVar3.f583b.f584a == 1 ? 1 : 2) & i2) == 0) {
                            break;
                        }
                        G1.k.f591f.getClass();
                        i3 = i6;
                        long nanoTime = java.lang.System.nanoTime() - hVar3.f582a;
                        long j4 = G1.k.f587b;
                        if (nanoTime < j4) {
                            j2 = j4 - nanoTime;
                            hVar2 = null;
                            break;
                        }
                        do {
                            hVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar, hVar3, null)) {
                                pVar.f7960a = hVar3;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar) == hVar3);
                        i6 = i3;
                        hVar2 = null;
                    }
                } else {
                    pVar.f7960a = hVar;
                    i3 = i6;
                }
                j2 = -1;
                if (j2 == -1) {
                    G1.h hVar4 = (G1.h) pVar.f7960a;
                    pVar.f7960a = hVar2;
                    return hVar4;
                }
                if (j2 > 0) {
                    j3 = java.lang.Math.min(j3, j2);
                }
            }
            i5++;
            d2 = i3;
            hVar2 = null;
        }
        if (j3 == Long.MAX_VALUE) {
            j3 = 0;
        }
        this.f562e = j3;
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
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        int i2;
        loop0: while (true) {
            boolean z2 = false;
            while (true) {
                G1.b bVar = this.f565h;
                bVar.getClass();
                int i3 = 5;
                if (G1.b.f568j.get(bVar) == 0 && this.f560c != 5) {
                    G1.h a2 = a(this.f564g);
                    int i4 = 3;
                    if (a2 != null) {
                        this.f562e = 0L;
                        int i5 = a2.f583b.f584a;
                        this.f561d = 0L;
                        if (this.f560c == 3) {
                            this.f560c = 2;
                        }
                        G1.b bVar2 = this.f565h;
                        if (i5 != 0 && h(2) && !bVar2.k() && !bVar2.j(G1.b.f567i.get(bVar2))) {
                            bVar2.k();
                        }
                        bVar2.getClass();
                        try {
                            a2.run();
                        } catch (java.lang.Throwable th) {
                            java.lang.Thread currentThread = java.lang.Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        if (i5 != 0) {
                            G1.b.f567i.addAndGet(bVar2, -2097152L);
                            if (this.f560c != 5) {
                                this.f560c = 4;
                            }
                        }
                    } else {
                        this.f564g = false;
                        if (this.f562e == 0) {
                            java.lang.Object obj = this.nextParkedWorker;
                            C.j jVar = G1.b.f569k;
                            if (obj != jVar) {
                                f557i.set(this, -1);
                                while (this.nextParkedWorker != G1.b.f569k) {
                                    java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f557i;
                                    if (atomicIntegerFieldUpdater.get(this) == -1) {
                                        G1.b bVar3 = this.f565h;
                                        bVar3.getClass();
                                        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = G1.b.f568j;
                                        if (atomicIntegerFieldUpdater2.get(bVar3) == 0 && this.f560c != i3) {
                                            h(i4);
                                            java.lang.Thread.interrupted();
                                            if (this.f561d == 0) {
                                                this.f561d = java.lang.System.nanoTime() + this.f565h.f572c;
                                            }
                                            java.util.concurrent.locks.LockSupport.parkNanos(this.f565h.f572c);
                                            if (java.lang.System.nanoTime() - this.f561d >= 0) {
                                                this.f561d = 0L;
                                                G1.b bVar4 = this.f565h;
                                                synchronized (bVar4.f576g) {
                                                    try {
                                                        if (!(atomicIntegerFieldUpdater2.get(bVar4) != 0)) {
                                                            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater2 = G1.b.f567i;
                                                            if (((int) (atomicLongFieldUpdater2.get(bVar4) & 2097151)) > bVar4.f570a) {
                                                                if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                    int i6 = this.indexInArray;
                                                                    f(0);
                                                                    bVar4.g(this, i6, 0);
                                                                    int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(bVar4) & 2097151);
                                                                    if (andDecrement != i6) {
                                                                        java.lang.Object b2 = bVar4.f576g.b(andDecrement);
                                                                        kotlin.jvm.internal.i.b(b2);
                                                                        G1.a aVar = (G1.a) b2;
                                                                        bVar4.f576g.c(i6, aVar);
                                                                        aVar.f(i6);
                                                                        bVar4.g(aVar, andDecrement, i6);
                                                                    }
                                                                    bVar4.f576g.c(andDecrement, null);
                                                                    this.f560c = 5;
                                                                }
                                                            }
                                                        }
                                                    } catch (java.lang.Throwable th2) {
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
                                G1.b bVar5 = this.f565h;
                                bVar5.getClass();
                                if (this.nextParkedWorker == jVar) {
                                    do {
                                        atomicLongFieldUpdater = G1.b.f566h;
                                        j2 = atomicLongFieldUpdater.get(bVar5);
                                        i2 = this.indexInArray;
                                        this.nextParkedWorker = bVar5.f576g.b((int) (j2 & 2097151));
                                    } while (!atomicLongFieldUpdater.compareAndSet(bVar5, j2, ((j2 + 2097152) & (-2097152)) | i2));
                                }
                            }
                        } else {
                            if (z2) {
                                h(3);
                                java.lang.Thread.interrupted();
                                java.util.concurrent.locks.LockSupport.parkNanos(this.f562e);
                                this.f562e = 0L;
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
