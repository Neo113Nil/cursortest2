package w4;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import n.AbstractC2107A;
import p4.AbstractC2282w;
import u4.o;

/* loaded from: classes.dex */
public final class c implements Executor, Closeable, AutoCloseable {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f20548r = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f20549s = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20550t = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* renamed from: u, reason: collision with root package name */
    public static final H3.g f20551u = new H3.g("NOT_IN_STACK", 5);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: k, reason: collision with root package name */
    public final int f20552k;

    /* renamed from: l, reason: collision with root package name */
    public final int f20553l;

    /* renamed from: m, reason: collision with root package name */
    public final long f20554m;

    /* renamed from: n, reason: collision with root package name */
    public final String f20555n;

    /* renamed from: o, reason: collision with root package name */
    public final f f20556o;

    /* renamed from: p, reason: collision with root package name */
    public final f f20557p;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* renamed from: q, reason: collision with root package name */
    public final o f20558q;

    public c(int i, int i5, long j5, String str) {
        this.f20552k = i;
        this.f20553l = i5;
        this.f20554m = j5;
        this.f20555n = str;
        if (i < 1) {
            throw new IllegalArgumentException(L1.a.l(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i5 < i) {
            throw new IllegalArgumentException(L1.a.k(i5, i, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i5 > 2097150) {
            throw new IllegalArgumentException(L1.a.l(i5, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j5 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j5 + " must be positive").toString());
        }
        this.f20556o = new f();
        this.f20557p = new f();
        this.f20558q = new o((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void f(c cVar, Runnable runnable, int i) {
        cVar.d(runnable, false, (i & 4) == 0);
    }

    public final int b() {
        synchronized (this.f20558q) {
            try {
                if (f20550t.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f20549s;
                long j5 = atomicLongFieldUpdater.get(this);
                int i = (int) (j5 & 2097151);
                int i5 = i - ((int) ((j5 & 4398044413952L) >> 21));
                if (i5 < 0) {
                    i5 = 0;
                }
                if (i5 >= this.f20552k) {
                    return 0;
                }
                if (i >= this.f20553l) {
                    return 0;
                }
                int i6 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i6 <= 0 || this.f20558q.b(i6) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i6);
                this.f20558q.c(i6, aVar);
                if (i6 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i7 = i5 + 1;
                aVar.start();
                return i7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i;
        i iVar;
        if (f20550t.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            a aVar = currentThread instanceof a ? (a) currentThread : null;
            if (aVar == null || !kotlin.jvm.internal.l.a(aVar.f20541r, this)) {
                aVar = null;
            }
            synchronized (this.f20558q) {
                i = (int) (f20549s.get(this) & 2097151);
            }
            if (1 <= i) {
                int i5 = 1;
                while (true) {
                    Object b3 = this.f20558q.b(i5);
                    kotlin.jvm.internal.l.c(b3);
                    a aVar2 = (a) b3;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        m mVar = aVar2.f20534k;
                        f fVar = this.f20557p;
                        mVar.getClass();
                        i iVar2 = (i) m.f20573b.getAndSet(mVar, null);
                        if (iVar2 != null) {
                            fVar.a(iVar2);
                        }
                        while (true) {
                            i b5 = mVar.b();
                            if (b5 == null) {
                                break;
                            } else {
                                fVar.a(b5);
                            }
                        }
                    }
                    if (i5 == i) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            this.f20557p.b();
            this.f20556o.b();
            while (true) {
                if (aVar != null) {
                    iVar = aVar.a(true);
                }
                iVar = (i) this.f20556o.d();
                if (iVar == null && (iVar = (i) this.f20557p.d()) == null) {
                    break;
                }
                try {
                    iVar.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(b.f20546o);
            }
            f20548r.set(this, 0L);
            f20549s.set(this, 0L);
        }
    }

    public final void d(Runnable runnable, boolean z3, boolean z5) {
        i jVar;
        b bVar;
        k.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f20564k = nanoTime;
            jVar.f20565l = z3;
        } else {
            jVar = new j(runnable, nanoTime, z3);
        }
        boolean z6 = jVar.f20565l;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20549s;
        long addAndGet = z6 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !kotlin.jvm.internal.l.a(aVar.f20541r, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f20536m) != b.f20546o && (jVar.f20565l || bVar != b.f20543l)) {
            aVar.f20540q = true;
            m mVar = aVar.f20534k;
            if (z5) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f20573b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f20565l ? this.f20557p.a(jVar) : this.f20556o.a(jVar))) {
                throw new RejectedExecutionException(AbstractC2107A.u(new StringBuilder(), this.f20555n, " was terminated"));
            }
        }
        boolean z7 = z5 && aVar != null;
        if (z6) {
            if (z7 || k() || i(addAndGet)) {
                return;
            }
            k();
            return;
        }
        if (z7 || k() || i(atomicLongFieldUpdater.get(this))) {
            return;
        }
        k();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f(this, runnable, 6);
    }

    public final void h(a aVar, int i, int i5) {
        while (true) {
            long j5 = f20548r.get(this);
            int i6 = (int) (2097151 & j5);
            long j6 = (2097152 + j5) & (-2097152);
            if (i6 == i) {
                if (i5 == 0) {
                    Object c5 = aVar.c();
                    while (true) {
                        if (c5 == f20551u) {
                            i6 = -1;
                            break;
                        }
                        if (c5 == null) {
                            i6 = 0;
                            break;
                        }
                        a aVar2 = (a) c5;
                        int b3 = aVar2.b();
                        if (b3 != 0) {
                            i6 = b3;
                            break;
                        }
                        c5 = aVar2.c();
                    }
                } else {
                    i6 = i5;
                }
            }
            if (i6 >= 0) {
                if (f20548r.compareAndSet(this, j5, i6 | j6)) {
                    return;
                }
            }
        }
    }

    public final boolean i(long j5) {
        int i = ((int) (2097151 & j5)) - ((int) ((j5 & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i5 = this.f20552k;
        if (i < i5) {
            int b3 = b();
            if (b3 == 1 && i5 > 1) {
                b();
            }
            if (b3 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        H3.g gVar;
        int i;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f20548r;
            long j5 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f20558q.b((int) (2097151 & j5));
            if (aVar == null) {
                aVar = null;
            } else {
                long j6 = (2097152 + j5) & (-2097152);
                Object c5 = aVar.c();
                while (true) {
                    gVar = f20551u;
                    if (c5 == gVar) {
                        i = -1;
                        break;
                    }
                    if (c5 == null) {
                        i = 0;
                        break;
                    }
                    a aVar2 = (a) c5;
                    i = aVar2.b();
                    if (i != 0) {
                        break;
                    }
                    c5 = aVar2.c();
                }
                if (i >= 0 && atomicLongFieldUpdater.compareAndSet(this, j5, j6 | i)) {
                    aVar.g(gVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f20533s.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        o oVar = this.f20558q;
        int a5 = oVar.a();
        int i = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 1; i9 < a5; i9++) {
            a aVar = (a) oVar.b(i9);
            if (aVar != null) {
                m mVar = aVar.f20534k;
                mVar.getClass();
                int i10 = m.f20573b.get(mVar) != null ? (m.f20574c.get(mVar) - m.f20575d.get(mVar)) + 1 : m.f20574c.get(mVar) - m.f20575d.get(mVar);
                int ordinal = aVar.f20536m.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i10);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i5++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i10);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i6++;
                } else if (ordinal == 3) {
                    i7++;
                    if (i10 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i10);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        throw new D2.e();
                    }
                    i8++;
                }
            }
        }
        long j5 = f20549s.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f20555n);
        sb4.append('@');
        sb4.append(AbstractC2282w.i(this));
        sb4.append("[Pool Size {core = ");
        int i11 = this.f20552k;
        sb4.append(i11);
        sb4.append(", max = ");
        sb4.append(this.f20553l);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i5);
        sb4.append(", parked = ");
        sb4.append(i6);
        sb4.append(", dormant = ");
        sb4.append(i7);
        sb4.append(", terminated = ");
        sb4.append(i8);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f20556o.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f20557p.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j5));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j5) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i11 - ((int) ((j5 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
