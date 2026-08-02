package K6;

import D6.E;
import F2.W0;
import I6.s;
import W5.AbstractC0486a1;
import d1.n;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public final class b implements Executor, Closeable {
    private volatile int _isTerminated;

    /* renamed from: a, reason: collision with root package name */
    public final int f4151a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4152b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4153c;
    private volatile long controlState;

    /* renamed from: d, reason: collision with root package name */
    public final String f4154d;

    /* renamed from: e, reason: collision with root package name */
    public final e f4155e;

    /* renamed from: f, reason: collision with root package name */
    public final e f4156f;
    private volatile long parkedWorkersStack;

    /* renamed from: x, reason: collision with root package name */
    public final s f4157x;

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4149y = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");

    /* renamed from: z, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4150z = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");

    /* renamed from: A, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4147A = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");

    /* renamed from: B, reason: collision with root package name */
    public static final W0 f4148B = new W0("NOT_IN_STACK", 1);

    public b(int i7, int i8, long j, String str) {
        this.f4151a = i7;
        this.f4152b = i8;
        this.f4153c = j;
        this.f4154d = str;
        if (i7 < 1) {
            throw new IllegalArgumentException(AbstractC0486a1.f(i7, "Core pool size ", " should be at least 1").toString());
        }
        if (i8 < i7) {
            throw new IllegalArgumentException(AbstractC0486a1.e(i8, i7, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i8 > 2097150) {
            throw new IllegalArgumentException(AbstractC0486a1.f(i8, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f4155e = new e();
        this.f4156f = new e();
        this.f4157x = new s((i7 + 1) * 2);
        this.controlState = i7 << 42;
        this._isTerminated = 0;
    }

    public final int a() {
        synchronized (this.f4157x) {
            try {
                if (f4147A.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f4150z;
                long j = atomicLongFieldUpdater.get(this);
                int i7 = (int) (j & 2097151);
                int i8 = i7 - ((int) ((j & 4398044413952L) >> 21));
                if (i8 < 0) {
                    i8 = 0;
                }
                if (i8 >= this.f4151a) {
                    return 0;
                }
                if (i7 >= this.f4152b) {
                    return 0;
                }
                int i9 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i9 <= 0 || this.f4157x.b(i9) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i9);
                this.f4157x.c(i9, aVar);
                if (i9 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i10 = i8 + 1;
                aVar.start();
                return i10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Runnable runnable, n nVar, boolean z4) {
        h iVar;
        int i7;
        j.f4171f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof h) {
            iVar = (h) runnable;
            iVar.f4163a = nanoTime;
            iVar.f4164b = nVar;
        } else {
            iVar = new i(runnable, nanoTime, nVar);
        }
        boolean z7 = false;
        boolean z8 = iVar.f4164b.f12365a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4150z;
        long addAndGet = z8 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !t6.h.a(aVar.f4146y, this)) {
            aVar = null;
        }
        if (aVar != null && (i7 = aVar.f4141c) != 5 && (iVar.f4164b.f12365a != 0 || i7 != 2)) {
            aVar.f4145x = true;
            l lVar = aVar.f4139a;
            if (z4) {
                iVar = lVar.a(iVar);
            } else {
                lVar.getClass();
                h hVar = (h) l.f4175b.getAndSet(lVar, iVar);
                iVar = hVar == null ? null : lVar.a(hVar);
            }
        }
        if (iVar != null) {
            if (!(iVar.f4164b.f12365a == 1 ? this.f4156f.a(iVar) : this.f4155e.a(iVar))) {
                throw new RejectedExecutionException(e1.k.i(new StringBuilder(), this.f4154d, " was terminated"));
            }
        }
        if (z4 && aVar != null) {
            z7 = true;
        }
        if (z8) {
            if (z7 || f() || e(addAndGet)) {
                return;
            }
            f();
            return;
        }
        if (z7 || f() || e(atomicLongFieldUpdater.get(this))) {
            return;
        }
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i7;
        h hVar;
        if (f4147A.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            a aVar = currentThread instanceof a ? (a) currentThread : null;
            if (aVar == null || !t6.h.a(aVar.f4146y, this)) {
                aVar = null;
            }
            synchronized (this.f4157x) {
                i7 = (int) (f4150z.get(this) & 2097151);
            }
            if (1 <= i7) {
                int i8 = 1;
                while (true) {
                    Object b7 = this.f4157x.b(i8);
                    t6.h.b(b7);
                    a aVar2 = (a) b7;
                    if (aVar2 != aVar) {
                        while (aVar2.isAlive()) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        l lVar = aVar2.f4139a;
                        e eVar = this.f4156f;
                        lVar.getClass();
                        h hVar2 = (h) l.f4175b.getAndSet(lVar, null);
                        if (hVar2 != null) {
                            eVar.a(hVar2);
                        }
                        while (true) {
                            h b8 = lVar.b();
                            if (b8 == null) {
                                break;
                            } else {
                                eVar.a(b8);
                            }
                        }
                    }
                    if (i8 == i7) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            this.f4156f.b();
            this.f4155e.b();
            while (true) {
                if (aVar != null) {
                    hVar = aVar.a(true);
                }
                hVar = (h) this.f4155e.d();
                if (hVar == null && (hVar = (h) this.f4156f.d()) == null) {
                    break;
                }
                try {
                    hVar.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(5);
            }
            f4149y.set(this, 0L);
            f4150z.set(this, 0L);
        }
    }

    public final void d(a aVar, int i7, int i8) {
        while (true) {
            long j = f4149y.get(this);
            int i9 = (int) (2097151 & j);
            long j3 = (2097152 + j) & (-2097152);
            if (i9 == i7) {
                if (i8 == 0) {
                    Object c3 = aVar.c();
                    while (true) {
                        if (c3 == f4148B) {
                            i9 = -1;
                            break;
                        }
                        if (c3 == null) {
                            i9 = 0;
                            break;
                        }
                        a aVar2 = (a) c3;
                        int b7 = aVar2.b();
                        if (b7 != 0) {
                            i9 = b7;
                            break;
                        }
                        c3 = aVar2.c();
                    }
                } else {
                    i9 = i8;
                }
            }
            if (i9 >= 0) {
                if (f4149y.compareAndSet(this, j, i9 | j3)) {
                    return;
                }
            }
        }
    }

    public final boolean e(long j) {
        int i7 = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = this.f4151a;
        if (i7 < i8) {
            int a2 = a();
            if (a2 == 1 && i8 > 1) {
                a();
            }
            if (a2 > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(runnable, j.f4172g, false);
    }

    public final boolean f() {
        W0 w02;
        int i7;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4149y;
            long j = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f4157x.b((int) (2097151 & j));
            if (aVar == null) {
                aVar = null;
            } else {
                long j3 = (2097152 + j) & (-2097152);
                Object c3 = aVar.c();
                while (true) {
                    w02 = f4148B;
                    if (c3 == w02) {
                        i7 = -1;
                        break;
                    }
                    if (c3 == null) {
                        i7 = 0;
                        break;
                    }
                    a aVar2 = (a) c3;
                    i7 = aVar2.b();
                    if (i7 != 0) {
                        break;
                    }
                    c3 = aVar2.c();
                }
                if (i7 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j, j3 | i7)) {
                    aVar.g(w02);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f4138z.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        s sVar = this.f4157x;
        int a2 = sVar.a();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 1; i12 < a2; i12++) {
            a aVar = (a) sVar.b(i12);
            if (aVar != null) {
                l lVar = aVar.f4139a;
                lVar.getClass();
                int i13 = l.f4175b.get(lVar) != null ? (l.f4176c.get(lVar) - l.f4177d.get(lVar)) + 1 : l.f4176c.get(lVar) - l.f4177d.get(lVar);
                int e7 = t.e.e(aVar.f4141c);
                if (e7 == 0) {
                    i7++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i13);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (e7 == 1) {
                    i8++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i13);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (e7 == 2) {
                    i9++;
                } else if (e7 == 3) {
                    i10++;
                    if (i13 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i13);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (e7 == 4) {
                    i11++;
                }
            }
        }
        long j = f4150z.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f4154d);
        sb4.append('@');
        sb4.append(E.i(this));
        sb4.append("[Pool Size {core = ");
        int i14 = this.f4151a;
        sb4.append(i14);
        sb4.append(", max = ");
        sb4.append(this.f4152b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i7);
        sb4.append(", blocking = ");
        sb4.append(i8);
        sb4.append(", parked = ");
        sb4.append(i9);
        sb4.append(", dormant = ");
        sb4.append(i10);
        sb4.append(", terminated = ");
        sb4.append(i11);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f4155e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f4156f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i14 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
