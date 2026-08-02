package p000;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: ln */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0439ln implements Executor, Closeable {

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ AtomicLongFieldUpdater f4840q = AtomicLongFieldUpdater.newUpdater(ExecutorC0439ln.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ AtomicLongFieldUpdater f4841r = AtomicLongFieldUpdater.newUpdater(ExecutorC0439ln.class, "controlState$volatile");

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4842s = AtomicIntegerFieldUpdater.newUpdater(ExecutorC0439ln.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: t */
    public static final g72 f4843t = new g72("NOT_IN_STACK", 3);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: j */
    public final int f4844j;

    /* JADX INFO: renamed from: k */
    public final int f4845k;

    /* JADX INFO: renamed from: l */
    public final long f4846l;

    /* JADX INFO: renamed from: m */
    public final String f4847m;

    /* JADX INFO: renamed from: n */
    public final d90 f4848n;

    /* JADX INFO: renamed from: o */
    public final d90 f4849o;

    /* JADX INFO: renamed from: p */
    public final s11 f4850p;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public ExecutorC0439ln(int i, int i2, long j, String str) {
        this.f4844j = i;
        this.f4845k = i2;
        this.f4846l = j;
        this.f4847m = str;
        if (i < 1) {
            C0270h1.m2186b(AbstractC0024an.m282e(i, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            C0270h1.m2186b(AbstractC0024an.m281d(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            C0270h1.m2186b(AbstractC0024an.m282e(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f4848n = new d90();
        this.f4849o = new d90();
        this.f4850p = new s11((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
        this._isTerminated$volatile = 0;
    }

    /* JADX INFO: renamed from: a */
    public final int m3230a() {
        synchronized (this.f4850p) {
            try {
                if (f4842s.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f4841r;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.f4844j) {
                    return 0;
                }
                if (i >= this.f4845k) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.f4850p.m4469b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C0365jn c0365jn = new C0365jn(this, i3);
                this.f4850p.m4470c(i3, c0365jn);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                c0365jn.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        pc1 pc1VarM2938a;
        if (f4842s.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            C0365jn c0365jn = null;
            C0365jn c0365jn2 = threadCurrentThread instanceof C0365jn ? (C0365jn) threadCurrentThread : null;
            if (c0365jn2 != null && c0365jn2.f4038q == this) {
                c0365jn = c0365jn2;
            }
            synchronized (this.f4850p) {
                i = (int) (f4841r.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objM4469b = this.f4850p.m4469b(i2);
                    objM4469b.getClass();
                    C0365jn c0365jn3 = (C0365jn) objM4469b;
                    if (c0365jn3 != c0365jn) {
                        while (c0365jn3.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(c0365jn3);
                            c0365jn3.join(10000L);
                        }
                        c0365jn3.f4031j.m4367c(this.f4849o);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f4849o.m5665b();
            this.f4848n.m5665b();
            while (true) {
                if (c0365jn != null) {
                    pc1VarM2938a = c0365jn.m2938a(true);
                    if (pc1VarM2938a == null) {
                        pc1VarM2938a = (pc1) this.f4848n.m5667d();
                        if (pc1VarM2938a == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    pc1VarM2938a = (pc1) this.f4848n.m5667d();
                    if (pc1VarM2938a == null && (pc1VarM2938a = (pc1) this.f4849o.m5667d()) == null) {
                        break;
                    }
                }
                try {
                    pc1VarM2938a.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (c0365jn != null) {
                c0365jn.m2945h(EnumC0402kn.f4458n);
            }
            f4840q.set(this, 0L);
            f4841r.set(this, 0L);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3231e(Runnable runnable, boolean z) {
        pc1 sc1Var;
        EnumC0402kn enumC0402kn;
        tc1.f7436f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof pc1) {
            sc1Var = (pc1) runnable;
            sc1Var.f6087j = jNanoTime;
            sc1Var.f6088k = z;
        } else {
            sc1Var = new sc1(runnable, jNanoTime, z);
        }
        boolean z2 = sc1Var.f6088k;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4841r;
        long jAddAndGet = z2 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C0365jn c0365jn = null;
        C0365jn c0365jn2 = threadCurrentThread instanceof C0365jn ? (C0365jn) threadCurrentThread : null;
        if (c0365jn2 != null && c0365jn2.f4038q == this) {
            c0365jn = c0365jn2;
        }
        if (c0365jn != null && (enumC0402kn = c0365jn.f4033l) != EnumC0402kn.f4458n && (sc1Var.f6088k || enumC0402kn != EnumC0402kn.f4455k)) {
            c0365jn.f4037p = true;
            sc1Var = c0365jn.f4031j.m4365a(sc1Var);
        }
        if (sc1Var != null) {
            if (!(sc1Var.f6088k ? this.f4849o.m5664a(sc1Var) : this.f4848n.m5664a(sc1Var))) {
                throw new RejectedExecutionException(AbstractC0024an.m285h(new StringBuilder(), this.f4847m, " was terminated"));
            }
        }
        if (z2) {
            if (m3234l() || m3233j(jAddAndGet)) {
                return;
            }
            m3234l();
            return;
        }
        if (m3234l() || m3233j(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m3234l();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m3231e(runnable, false);
    }

    /* JADX INFO: renamed from: i */
    public final void m3232i(C0365jn c0365jn, int i, int i2) {
        while (true) {
            long j = f4840q.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objM2940c = c0365jn.m2940c();
                    while (true) {
                        if (objM2940c == f4843t) {
                            i3 = -1;
                            break;
                        }
                        if (objM2940c == null) {
                            i3 = 0;
                            break;
                        }
                        C0365jn c0365jn2 = (C0365jn) objM2940c;
                        int iM2939b = c0365jn2.m2939b();
                        if (iM2939b != 0) {
                            i3 = iM2939b;
                            break;
                        }
                        objM2940c = c0365jn2.m2940c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                ExecutorC0439ln executorC0439ln = this;
                if (f4840q.compareAndSet(executorC0439ln, j, ((long) i3) | j2)) {
                    return;
                } else {
                    this = executorC0439ln;
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m3233j(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f4844j;
        if (i < i2) {
            int iM3230a = m3230a();
            if (iM3230a == 1 && i2 > 1) {
                m3230a();
            }
            if (iM3230a > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m3234l() {
        ExecutorC0439ln executorC0439ln;
        g72 g72Var;
        int iM2939b;
        while (true) {
            long j = f4840q.get(this);
            C0365jn c0365jn = (C0365jn) this.f4850p.m4469b((int) (2097151 & j));
            if (c0365jn == null) {
                c0365jn = null;
                executorC0439ln = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objM2940c = c0365jn.m2940c();
                while (true) {
                    g72Var = f4843t;
                    if (objM2940c == g72Var) {
                        iM2939b = -1;
                        break;
                    }
                    if (objM2940c == null) {
                        iM2939b = 0;
                        break;
                    }
                    C0365jn c0365jn2 = (C0365jn) objM2940c;
                    iM2939b = c0365jn2.m2939b();
                    if (iM2939b != 0) {
                        break;
                    }
                    objM2940c = c0365jn2.m2940c();
                    j = j;
                }
                if (iM2939b >= 0) {
                    ExecutorC0439ln executorC0439ln2 = this;
                    boolean zCompareAndSet = f4840q.compareAndSet(executorC0439ln2, j, ((long) iM2939b) | j2);
                    executorC0439ln = executorC0439ln2;
                    if (zCompareAndSet) {
                        c0365jn.m2944g(g72Var);
                    }
                    this = executorC0439ln;
                } else {
                    continue;
                }
            }
            if (c0365jn == null) {
                return false;
            }
            if (C0365jn.f4030r.compareAndSet(c0365jn, -1, 0)) {
                LockSupport.unpark(c0365jn);
                return true;
            }
            this = executorC0439ln;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        s11 s11Var = this.f4850p;
        int iM4468a = s11Var.m4468a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iM4468a; i6++) {
            C0365jn c0365jn = (C0365jn) s11Var.m4469b(i6);
            if (c0365jn != null) {
                int iM4366b = c0365jn.f4031j.m4366b();
                int iOrdinal = c0365jn.f4033l.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iM4366b);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iM4366b);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (iM4366b > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iM4366b);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new C0694sj(5);
                    }
                    i5++;
                }
            }
        }
        long j = f4841r.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f4847m);
        sb4.append('@');
        sb4.append(AbstractC0959zp.m5979g(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.f4844j;
        sb4.append(i7);
        sb4.append(", max = ");
        sb4.append(this.f4845k);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f4848n.m5666c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f4849o.m5666c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
