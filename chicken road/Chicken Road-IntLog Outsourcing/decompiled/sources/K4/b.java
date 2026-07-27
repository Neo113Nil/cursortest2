package K4;

import B0.o;
import D4.AbstractC0024y;
import G0.C0051a;
import I4.s;
import b2.AbstractC0279e;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class b implements Executor, Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1425h = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1426i = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1427j = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");

    /* renamed from: k, reason: collision with root package name */
    public static final C0051a f1428k = new C0051a("NOT_IN_STACK", 2);
    private volatile int _isTerminated;

    /* renamed from: a, reason: collision with root package name */
    public final int f1429a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1430b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1431c;
    private volatile long controlState;

    /* renamed from: d, reason: collision with root package name */
    public final String f1432d;

    /* renamed from: e, reason: collision with root package name */
    public final e f1433e;

    /* renamed from: f, reason: collision with root package name */
    public final e f1434f;

    /* renamed from: g, reason: collision with root package name */
    public final s f1435g;
    private volatile long parkedWorkersStack;

    public b(int i2, int i3, long j2, String str) {
        this.f1429a = i2;
        this.f1430b = i3;
        this.f1431c = j2;
        this.f1432d = str;
        if (i2 < 1) {
            throw new IllegalArgumentException(o.g(i2, "Core pool size ", " should be at least 1").toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(o.h("Max pool size ", i3, i2, " should be greater than or equals to core pool size ").toString());
        }
        if (i3 > 2097150) {
            throw new IllegalArgumentException(o.g(i3, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j2 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.f1433e = new e();
        this.f1434f = new e();
        this.f1435g = new s((i2 + 1) * 2);
        this.controlState = i2 << 42;
        this._isTerminated = 0;
    }

    public static /* synthetic */ void c(b bVar, Runnable runnable, boolean z, int i2) {
        i iVar = k.f1451g;
        if ((i2 & 4) != 0) {
            z = false;
        }
        bVar.b(runnable, iVar, z);
    }

    public final int a() {
        synchronized (this.f1435g) {
            try {
                if (f1427j.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f1426i;
                long j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 & 2097151);
                int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.f1429a) {
                    return 0;
                }
                if (i2 >= this.f1430b) {
                    return 0;
                }
                int i6 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i6 <= 0 || this.f1435g.b(i6) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i6);
                this.f1435g.c(i6, aVar);
                if (i6 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i7 = i3 + 1;
                aVar.start();
                return i7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, i iVar, boolean z) {
        h jVar;
        int i2;
        k.f1450f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof h) {
            jVar = (h) runnable;
            jVar.f1441a = nanoTime;
            jVar.f1442b = iVar;
        } else {
            jVar = new j(runnable, nanoTime, iVar);
        }
        boolean z5 = false;
        boolean z6 = jVar.f1442b.f1443a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1426i;
        long addAndGet = z6 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !kotlin.jvm.internal.i.a(aVar.f1424h, this)) {
            aVar = null;
        }
        if (aVar != null && (i2 = aVar.f1419c) != 5 && (jVar.f1442b.f1443a != 0 || i2 != 2)) {
            aVar.f1423g = true;
            m mVar = aVar.f1417a;
            if (z) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                h hVar = (h) m.f1454b.getAndSet(mVar, jVar);
                jVar = hVar == null ? null : mVar.a(hVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f1442b.f1443a == 1 ? this.f1434f.a(jVar) : this.f1433e.a(jVar))) {
                throw new RejectedExecutionException(AbstractC0279e.h(new StringBuilder(), this.f1432d, " was terminated"));
            }
        }
        if (z && aVar != null) {
            z5 = true;
        }
        if (z6) {
            if (z5 || q() || p(addAndGet)) {
                return;
            }
            q();
            return;
        }
        if (z5 || q() || p(atomicLongFieldUpdater.get(this))) {
            return;
        }
        q();
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
        h hVar;
        if (f1427j.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            a aVar = currentThread instanceof a ? (a) currentThread : null;
            if (aVar == null || !kotlin.jvm.internal.i.a(aVar.f1424h, this)) {
                aVar = null;
            }
            synchronized (this.f1435g) {
                i2 = (int) (f1426i.get(this) & 2097151);
            }
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    Object b6 = this.f1435g.b(i3);
                    kotlin.jvm.internal.i.b(b6);
                    a aVar2 = (a) b6;
                    if (aVar2 != aVar) {
                        while (aVar2.isAlive()) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        m mVar = aVar2.f1417a;
                        e eVar = this.f1434f;
                        mVar.getClass();
                        h hVar2 = (h) m.f1454b.getAndSet(mVar, null);
                        if (hVar2 != null) {
                            eVar.a(hVar2);
                        }
                        while (true) {
                            h b7 = mVar.b();
                            if (b7 == null) {
                                break;
                            } else {
                                eVar.a(b7);
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
            this.f1434f.b();
            this.f1433e.b();
            while (true) {
                if (aVar != null) {
                    hVar = aVar.a(true);
                }
                hVar = (h) this.f1433e.d();
                if (hVar == null && (hVar = (h) this.f1434f.d()) == null) {
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
            f1425h.set(this, 0L);
            f1426i.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(this, runnable, false, 6);
    }

    public final void o(a aVar, int i2, int i3) {
        while (true) {
            long j2 = f1425h.get(this);
            int i6 = (int) (2097151 & j2);
            long j6 = (2097152 + j2) & (-2097152);
            if (i6 == i2) {
                if (i3 == 0) {
                    Object c2 = aVar.c();
                    while (true) {
                        if (c2 == f1428k) {
                            i6 = -1;
                            break;
                        }
                        if (c2 == null) {
                            i6 = 0;
                            break;
                        }
                        a aVar2 = (a) c2;
                        int b6 = aVar2.b();
                        if (b6 != 0) {
                            i6 = b6;
                            break;
                        }
                        c2 = aVar2.c();
                    }
                } else {
                    i6 = i3;
                }
            }
            if (i6 >= 0) {
                if (f1425h.compareAndSet(this, j2, i6 | j6)) {
                    return;
                }
            }
        }
    }

    public final boolean p(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.f1429a;
        if (i2 < i3) {
            int a6 = a();
            if (a6 == 1 && i3 > 1) {
                a();
            }
            if (a6 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean q() {
        C0051a c0051a;
        int i2;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1425h;
            long j2 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f1435g.b((int) (2097151 & j2));
            if (aVar == null) {
                aVar = null;
            } else {
                long j6 = (2097152 + j2) & (-2097152);
                Object c2 = aVar.c();
                while (true) {
                    c0051a = f1428k;
                    if (c2 == c0051a) {
                        i2 = -1;
                        break;
                    }
                    if (c2 == null) {
                        i2 = 0;
                        break;
                    }
                    a aVar2 = (a) c2;
                    i2 = aVar2.b();
                    if (i2 != 0) {
                        break;
                    }
                    c2 = aVar2.c();
                }
                if (i2 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j2, j6 | i2)) {
                    aVar.g(c0051a);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f1416i.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        s sVar = this.f1435g;
        int a6 = sVar.a();
        int i2 = 0;
        int i3 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 1; i9 < a6; i9++) {
            a aVar = (a) sVar.b(i9);
            if (aVar != null) {
                m mVar = aVar.f1417a;
                mVar.getClass();
                int i10 = m.f1454b.get(mVar) != null ? (m.f1455c.get(mVar) - m.f1456d.get(mVar)) + 1 : m.f1455c.get(mVar) - m.f1456d.get(mVar);
                int b6 = O.j.b(aVar.f1419c);
                if (b6 == 0) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i10);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (b6 == 1) {
                    i3++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i10);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (b6 == 2) {
                    i6++;
                } else if (b6 == 3) {
                    i7++;
                    if (i10 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i10);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (b6 == 4) {
                    i8++;
                }
            }
        }
        long j2 = f1426i.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f1432d);
        sb4.append('@');
        sb4.append(AbstractC0024y.h(this));
        sb4.append("[Pool Size {core = ");
        int i11 = this.f1429a;
        sb4.append(i11);
        sb4.append(", max = ");
        sb4.append(this.f1430b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i2);
        sb4.append(", blocking = ");
        sb4.append(i3);
        sb4.append(", parked = ");
        sb4.append(i6);
        sb4.append(", dormant = ");
        sb4.append(i7);
        sb4.append(", terminated = ");
        sb4.append(i8);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f1433e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f1434f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j2));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j2) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i11 - ((int) ((j2 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
