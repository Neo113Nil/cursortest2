package G1;

/* loaded from: classes.dex */
public final class b implements java.util.concurrent.Executor, java.io.Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLongFieldUpdater f566h = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(G1.b.class, "parkedWorkersStack");

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLongFieldUpdater f567i = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(G1.b.class, "controlState");

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f568j = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(G1.b.class, "_isTerminated");

    /* renamed from: k, reason: collision with root package name */
    public static final C.j f569k = new C.j(3, "NOT_IN_STACK");
    private volatile int _isTerminated;

    /* renamed from: a, reason: collision with root package name */
    public final int f570a;

    /* renamed from: b, reason: collision with root package name */
    public final int f571b;

    /* renamed from: c, reason: collision with root package name */
    public final long f572c;
    private volatile long controlState;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f573d;

    /* renamed from: e, reason: collision with root package name */
    public final G1.e f574e;

    /* renamed from: f, reason: collision with root package name */
    public final G1.e f575f;

    /* renamed from: g, reason: collision with root package name */
    public final E1.s f576g;
    private volatile long parkedWorkersStack;

    public b(int i2, int i3, long j2, java.lang.String str) {
        this.f570a = i2;
        this.f571b = i3;
        this.f572c = j2;
        this.f573d = str;
        if (i2 < 1) {
            throw new java.lang.IllegalArgumentException(B1.a.g(i2, "Core pool size ", " should be at least 1").toString());
        }
        if (i3 < i2) {
            throw new java.lang.IllegalArgumentException(B1.a.h("Max pool size ", i3, i2, " should be greater than or equals to core pool size ").toString());
        }
        if (i3 > 2097150) {
            throw new java.lang.IllegalArgumentException(B1.a.g(i3, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j2 <= 0) {
            throw new java.lang.IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.f574e = new G1.e();
        this.f575f = new G1.e();
        this.f576g = new E1.s((i2 + 1) * 2);
        this.controlState = i2 << 42;
        this._isTerminated = 0;
    }

    public final int a() {
        synchronized (this.f576g) {
            try {
                if (f568j.get(this) != 0) {
                    return -1;
                }
                java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f567i;
                long j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 & 2097151);
                int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.f570a) {
                    return 0;
                }
                if (i2 >= this.f571b) {
                    return 0;
                }
                int i4 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i4 <= 0 || this.f576g.b(i4) != null) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.");
                }
                G1.a aVar = new G1.a(this, i4);
                this.f576g.c(i4, aVar);
                if (i4 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.");
                }
                int i5 = i3 + 1;
                aVar.start();
                return i5;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void b(java.lang.Runnable runnable, G1.i iVar, boolean z2) {
        G1.h jVar;
        int i2;
        G1.k.f591f.getClass();
        long nanoTime = java.lang.System.nanoTime();
        if (runnable instanceof G1.h) {
            jVar = (G1.h) runnable;
            jVar.f582a = nanoTime;
            jVar.f583b = iVar;
        } else {
            jVar = new G1.j(runnable, nanoTime, iVar);
        }
        boolean z3 = false;
        boolean z4 = jVar.f583b.f584a == 1;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f567i;
        long addAndGet = z4 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        G1.a aVar = currentThread instanceof G1.a ? (G1.a) currentThread : null;
        if (aVar == null || !kotlin.jvm.internal.i.a(aVar.f565h, this)) {
            aVar = null;
        }
        if (aVar != null && (i2 = aVar.f560c) != 5 && (jVar.f583b.f584a != 0 || i2 != 2)) {
            aVar.f564g = true;
            G1.m mVar = aVar.f558a;
            if (z2) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                G1.h hVar = (G1.h) G1.m.f595b.getAndSet(mVar, jVar);
                jVar = hVar == null ? null : mVar.a(hVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f583b.f584a == 1 ? this.f575f.a(jVar) : this.f574e.a(jVar))) {
                throw new java.util.concurrent.RejectedExecutionException(B1.a.j(new java.lang.StringBuilder(), this.f573d, " was terminated"));
            }
        }
        if (z2 && aVar != null) {
            z3 = true;
        }
        if (z4) {
            if (z3 || k() || j(addAndGet)) {
                return;
            }
            k();
            return;
        }
        if (z3 || k() || j(atomicLongFieldUpdater.get(this))) {
            return;
        }
        k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i2;
        G1.h hVar;
        if (f568j.compareAndSet(this, 0, 1)) {
            java.lang.Thread currentThread = java.lang.Thread.currentThread();
            G1.a aVar = currentThread instanceof G1.a ? (G1.a) currentThread : null;
            if (aVar == null || !kotlin.jvm.internal.i.a(aVar.f565h, this)) {
                aVar = null;
            }
            synchronized (this.f576g) {
                i2 = (int) (f567i.get(this) & 2097151);
            }
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    java.lang.Object b2 = this.f576g.b(i3);
                    kotlin.jvm.internal.i.b(b2);
                    G1.a aVar2 = (G1.a) b2;
                    if (aVar2 != aVar) {
                        while (aVar2.isAlive()) {
                            java.util.concurrent.locks.LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        G1.m mVar = aVar2.f558a;
                        G1.e eVar = this.f575f;
                        mVar.getClass();
                        G1.h hVar2 = (G1.h) G1.m.f595b.getAndSet(mVar, null);
                        if (hVar2 != null) {
                            eVar.a(hVar2);
                        }
                        while (true) {
                            G1.h b3 = mVar.b();
                            if (b3 == null) {
                                break;
                            } else {
                                eVar.a(b3);
                            }
                        }
                    }
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.f575f.b();
            this.f574e.b();
            while (true) {
                if (aVar != null) {
                    hVar = aVar.a(true);
                }
                hVar = (G1.h) this.f574e.d();
                if (hVar == null && (hVar = (G1.h) this.f575f.d()) == null) {
                    break;
                }
                try {
                    hVar.run();
                } catch (java.lang.Throwable th) {
                    java.lang.Thread currentThread2 = java.lang.Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(5);
            }
            f566h.set(this, 0L);
            f567i.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        b(runnable, G1.k.f592g, false);
    }

    public final void g(G1.a aVar, int i2, int i3) {
        while (true) {
            long j2 = f566h.get(this);
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i4 == i2) {
                if (i3 == 0) {
                    java.lang.Object c2 = aVar.c();
                    while (true) {
                        if (c2 == f569k) {
                            i4 = -1;
                            break;
                        }
                        if (c2 == null) {
                            i4 = 0;
                            break;
                        }
                        G1.a aVar2 = (G1.a) c2;
                        int b2 = aVar2.b();
                        if (b2 != 0) {
                            i4 = b2;
                            break;
                        }
                        c2 = aVar2.c();
                    }
                } else {
                    i4 = i3;
                }
            }
            if (i4 >= 0) {
                if (f566h.compareAndSet(this, j2, i4 | j3)) {
                    return;
                }
            }
        }
    }

    public final boolean j(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.f570a;
        if (i2 < i3) {
            int a2 = a();
            if (a2 == 1 && i3 > 1) {
                a();
            }
            if (a2 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        C.j jVar;
        int i2;
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f566h;
            long j2 = atomicLongFieldUpdater.get(this);
            G1.a aVar = (G1.a) this.f576g.b((int) (2097151 & j2));
            if (aVar == null) {
                aVar = null;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                java.lang.Object c2 = aVar.c();
                while (true) {
                    jVar = f569k;
                    if (c2 == jVar) {
                        i2 = -1;
                        break;
                    }
                    if (c2 == null) {
                        i2 = 0;
                        break;
                    }
                    G1.a aVar2 = (G1.a) c2;
                    i2 = aVar2.b();
                    if (i2 != 0) {
                        break;
                    }
                    c2 = aVar2.c();
                }
                if (i2 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j2, j3 | i2)) {
                    aVar.g(jVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (G1.a.f557i.compareAndSet(aVar, -1, 0)) {
                java.util.concurrent.locks.LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        E1.s sVar = this.f576g;
        int a2 = sVar.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < a2; i7++) {
            G1.a aVar = (G1.a) sVar.b(i7);
            if (aVar != null) {
                G1.m mVar = aVar.f558a;
                mVar.getClass();
                int i8 = G1.m.f595b.get(mVar) != null ? (G1.m.f596c.get(mVar) - G1.m.f597d.get(mVar)) + 1 : G1.m.f596c.get(mVar) - G1.m.f597d.get(mVar);
                int b2 = H.j.b(aVar.f560c);
                if (b2 == 0) {
                    i2++;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(i8);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (b2 == 1) {
                    i3++;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(i8);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (b2 == 2) {
                    i4++;
                } else if (b2 == 3) {
                    i5++;
                    if (i8 > 0) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append(i8);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (b2 == 4) {
                    i6++;
                }
            }
        }
        long j2 = f567i.get(this);
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(this.f573d);
        sb4.append('@');
        sb4.append(z1.AbstractC1068v.b(this));
        sb4.append("[Pool Size {core = ");
        int i9 = this.f570a;
        sb4.append(i9);
        sb4.append(", max = ");
        sb4.append(this.f571b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i2);
        sb4.append(", blocking = ");
        sb4.append(i3);
        sb4.append(", parked = ");
        sb4.append(i4);
        sb4.append(", dormant = ");
        sb4.append(i5);
        sb4.append(", terminated = ");
        sb4.append(i6);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f574e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f575f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j2));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j2) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i9 - ((int) ((j2 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
