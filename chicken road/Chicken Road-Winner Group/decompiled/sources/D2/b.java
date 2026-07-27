package D2;

import B2.r;
import B2.v;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import w2.AbstractC1242v;

/* loaded from: classes.dex */
public final class b implements Executor, Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f300h = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f301i = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f302j = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");

    /* renamed from: k, reason: collision with root package name */
    public static final v f303k = new v("NOT_IN_STACK");
    private volatile int _isTerminated;

    /* renamed from: a, reason: collision with root package name */
    public final int f304a;

    /* renamed from: b, reason: collision with root package name */
    public final int f305b;

    /* renamed from: c, reason: collision with root package name */
    public final long f306c;
    private volatile long controlState;

    /* renamed from: d, reason: collision with root package name */
    public final String f307d;

    /* renamed from: e, reason: collision with root package name */
    public final e f308e;
    public final e f;

    /* renamed from: g, reason: collision with root package name */
    public final r f309g;
    private volatile long parkedWorkersStack;

    public b(int i3, int i4, long j3, String str) {
        this.f304a = i3;
        this.f305b = i4;
        this.f306c = j3;
        this.f307d = str;
        if (i3 < 1) {
            throw new IllegalArgumentException(B0.c.i(i3, "Core pool size ", " should be at least 1").toString());
        }
        if (i4 < i3) {
            throw new IllegalArgumentException(B0.c.g(i4, i3, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i4 > 2097150) {
            throw new IllegalArgumentException(B0.c.i(i4, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j3 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j3 + " must be positive").toString());
        }
        this.f308e = new e();
        this.f = new e();
        this.f309g = new r((i3 + 1) * 2);
        this.controlState = i3 << 42;
        this._isTerminated = 0;
    }

    public final int a() {
        synchronized (this.f309g) {
            try {
                if (f302j.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f301i;
                long j3 = atomicLongFieldUpdater.get(this);
                int i3 = (int) (j3 & 2097151);
                int i4 = i3 - ((int) ((j3 & 4398044413952L) >> 21));
                if (i4 < 0) {
                    i4 = 0;
                }
                if (i4 >= this.f304a) {
                    return 0;
                }
                if (i3 >= this.f305b) {
                    return 0;
                }
                int i5 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i5 <= 0 || this.f309g.b(i5) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i5);
                this.f309g.c(i5, aVar);
                if (i5 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i6 = i4 + 1;
                aVar.start();
                return i6;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, i iVar) {
        h jVar;
        int i3;
        AtomicReferenceArray atomicReferenceArray;
        k.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof h) {
            jVar = (h) runnable;
            jVar.f315a = nanoTime;
            jVar.f316b = iVar;
        } else {
            jVar = new j(runnable, nanoTime, iVar);
        }
        boolean z3 = jVar.f316b.f317a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f301i;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !kotlin.jvm.internal.j.a(aVar.f299h, this)) {
            aVar = null;
        }
        if (aVar != null && (i3 = aVar.f295c) != 5 && (jVar.f316b.f317a != 0 || i3 != 2)) {
            aVar.f298g = true;
            m mVar = aVar.f293a;
            mVar.getClass();
            jVar = (h) m.f327b.getAndSet(mVar, jVar);
            if (jVar == null) {
                jVar = null;
            } else {
                mVar.getClass();
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m.f328c;
                if (atomicIntegerFieldUpdater.get(mVar) - m.f329d.get(mVar) != 127) {
                    if (jVar.f316b.f317a == 1) {
                        m.f330e.incrementAndGet(mVar);
                    }
                    int i4 = atomicIntegerFieldUpdater.get(mVar) & 127;
                    while (true) {
                        atomicReferenceArray = mVar.f331a;
                        if (atomicReferenceArray.get(i4) == null) {
                            break;
                        } else {
                            Thread.yield();
                        }
                    }
                    atomicReferenceArray.lazySet(i4, jVar);
                    atomicIntegerFieldUpdater.incrementAndGet(mVar);
                    jVar = null;
                }
            }
        }
        if (jVar != null) {
            if (!(jVar.f316b.f317a == 1 ? this.f.a(jVar) : this.f308e.a(jVar))) {
                throw new RejectedExecutionException(B0.c.l(new StringBuilder(), this.f307d, " was terminated"));
            }
        }
        if (z3) {
            if (e() || d(addAndGet)) {
                return;
            }
            e();
            return;
        }
        if (e() || d(atomicLongFieldUpdater.get(this))) {
            return;
        }
        e();
    }

    public final void c(a aVar, int i3, int i4) {
        while (true) {
            long j3 = f300h.get(this);
            int i5 = (int) (2097151 & j3);
            long j4 = (2097152 + j3) & (-2097152);
            if (i5 == i3) {
                if (i4 == 0) {
                    Object c3 = aVar.c();
                    while (true) {
                        if (c3 == f303k) {
                            i5 = -1;
                            break;
                        }
                        if (c3 == null) {
                            i5 = 0;
                            break;
                        }
                        a aVar2 = (a) c3;
                        int b3 = aVar2.b();
                        if (b3 != 0) {
                            i5 = b3;
                            break;
                        }
                        c3 = aVar2.c();
                    }
                } else {
                    i5 = i4;
                }
            }
            if (i5 >= 0) {
                if (f300h.compareAndSet(this, j3, i5 | j4)) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i3;
        h hVar;
        if (f302j.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            a aVar = currentThread instanceof a ? (a) currentThread : null;
            if (aVar == null || !kotlin.jvm.internal.j.a(aVar.f299h, this)) {
                aVar = null;
            }
            synchronized (this.f309g) {
                i3 = (int) (f301i.get(this) & 2097151);
            }
            if (1 <= i3) {
                int i4 = 1;
                while (true) {
                    Object b3 = this.f309g.b(i4);
                    kotlin.jvm.internal.j.b(b3);
                    a aVar2 = (a) b3;
                    if (aVar2 != aVar) {
                        while (aVar2.isAlive()) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        m mVar = aVar2.f293a;
                        e eVar = this.f;
                        mVar.getClass();
                        h hVar2 = (h) m.f327b.getAndSet(mVar, null);
                        if (hVar2 != null) {
                            eVar.a(hVar2);
                        }
                        while (true) {
                            h a3 = mVar.a();
                            if (a3 == null) {
                                break;
                            } else {
                                eVar.a(a3);
                            }
                        }
                    }
                    if (i4 == i3) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            this.f.b();
            this.f308e.b();
            while (true) {
                if (aVar != null) {
                    hVar = aVar.a(true);
                }
                hVar = (h) this.f308e.d();
                if (hVar == null && (hVar = (h) this.f.d()) == null) {
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
            f300h.set(this, 0L);
            f301i.set(this, 0L);
        }
    }

    public final boolean d(long j3) {
        int i3 = ((int) (2097151 & j3)) - ((int) ((j3 & 4398044413952L) >> 21));
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = this.f304a;
        if (i3 < i4) {
            int a3 = a();
            if (a3 == 1 && i4 > 1) {
                a();
            }
            if (a3 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        v vVar;
        int i3;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f300h;
            long j3 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f309g.b((int) (2097151 & j3));
            if (aVar == null) {
                aVar = null;
            } else {
                long j4 = (2097152 + j3) & (-2097152);
                Object c3 = aVar.c();
                while (true) {
                    vVar = f303k;
                    if (c3 == vVar) {
                        i3 = -1;
                        break;
                    }
                    if (c3 == null) {
                        i3 = 0;
                        break;
                    }
                    a aVar2 = (a) c3;
                    i3 = aVar2.b();
                    if (i3 != 0) {
                        break;
                    }
                    c3 = aVar2.c();
                }
                if (i3 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j3, j4 | i3)) {
                    aVar.g(vVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f292i.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, k.f324g);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        r rVar = this.f309g;
        int a3 = rVar.a();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 1; i8 < a3; i8++) {
            a aVar = (a) rVar.b(i8);
            if (aVar != null) {
                m mVar = aVar.f293a;
                mVar.getClass();
                int i9 = m.f327b.get(mVar) != null ? (m.f328c.get(mVar) - m.f329d.get(mVar)) + 1 : m.f328c.get(mVar) - m.f329d.get(mVar);
                int b3 = M.j.b(aVar.f295c);
                if (b3 == 0) {
                    i3++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i9);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (b3 == 1) {
                    i4++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i9);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (b3 == 2) {
                    i5++;
                } else if (b3 == 3) {
                    i6++;
                    if (i9 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i9);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (b3 == 4) {
                    i7++;
                }
            }
        }
        long j3 = f301i.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f307d);
        sb4.append('@');
        sb4.append(AbstractC1242v.c(this));
        sb4.append("[Pool Size {core = ");
        int i10 = this.f304a;
        sb4.append(i10);
        sb4.append(", max = ");
        sb4.append(this.f305b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i3);
        sb4.append(", blocking = ");
        sb4.append(i4);
        sb4.append(", parked = ");
        sb4.append(i5);
        sb4.append(", dormant = ");
        sb4.append(i6);
        sb4.append(", terminated = ");
        sb4.append(i7);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f308e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j3));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j3) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i10 - ((int) ((j3 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
