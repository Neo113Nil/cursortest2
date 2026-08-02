package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: jn */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0365jn extends Thread {

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4030r = AtomicIntegerFieldUpdater.newUpdater(C0365jn.class, "workerCtl$volatile");
    private volatile int indexInArray;

    /* JADX INFO: renamed from: j */
    public final rk1 f4031j;

    /* JADX INFO: renamed from: k */
    public final k01 f4032k;

    /* JADX INFO: renamed from: l */
    public EnumC0402kn f4033l;

    /* JADX INFO: renamed from: m */
    public long f4034m;

    /* JADX INFO: renamed from: n */
    public long f4035n;
    private volatile Object nextParkedWorker;

    /* JADX INFO: renamed from: o */
    public int f4036o;

    /* JADX INFO: renamed from: p */
    public boolean f4037p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ ExecutorC0439ln f4038q;
    private volatile /* synthetic */ int workerCtl$volatile;

    public C0365jn(ExecutorC0439ln executorC0439ln, int i) {
        this.f4038q = executorC0439ln;
        setDaemon(true);
        setContextClassLoader(ExecutorC0439ln.class.getClassLoader());
        this.f4031j = new rk1();
        this.f4032k = new k01();
        this.f4033l = EnumC0402kn.f4457m;
        this.nextParkedWorker = ExecutorC0439ln.f4843t;
        int iNanoTime = (int) System.nanoTime();
        this.f4036o = iNanoTime == 0 ? 42 : iNanoTime;
        m2943f(i);
    }

    /* JADX INFO: renamed from: a */
    public final pc1 m2938a(boolean z) {
        pc1 pc1VarM2942e;
        pc1 pc1VarM2942e2;
        long j;
        EnumC0402kn enumC0402kn = this.f4033l;
        ExecutorC0439ln executorC0439ln = this.f4038q;
        rk1 rk1Var = this.f4031j;
        EnumC0402kn enumC0402kn2 = EnumC0402kn.f4454j;
        if (enumC0402kn != enumC0402kn2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0439ln.f4841r;
            do {
                j = atomicLongFieldUpdater.get(executorC0439ln);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    pc1 pc1VarM4370f = rk1Var.m4370f();
                    return (pc1VarM4370f == null && (pc1VarM4370f = (pc1) executorC0439ln.f4849o.m5667d()) == null) ? m2946i(1) : pc1VarM4370f;
                }
            } while (!ExecutorC0439ln.f4841r.compareAndSet(executorC0439ln, j, j - 4398046511104L));
            this.f4033l = enumC0402kn2;
        }
        if (z) {
            boolean z2 = m2941d(executorC0439ln.f4844j * 2) == 0;
            if (z2 && (pc1VarM2942e2 = m2942e()) != null) {
                return pc1VarM2942e2;
            }
            pc1 pc1VarM4368d = rk1Var.m4368d();
            if (pc1VarM4368d != null) {
                return pc1VarM4368d;
            }
            if (!z2 && (pc1VarM2942e = m2942e()) != null) {
                return pc1VarM2942e;
            }
        } else {
            pc1 pc1VarM2942e3 = m2942e();
            if (pc1VarM2942e3 != null) {
                return pc1VarM2942e3;
            }
        }
        return m2946i(3);
    }

    /* JADX INFO: renamed from: b */
    public final int m2939b() {
        return this.indexInArray;
    }

    /* JADX INFO: renamed from: c */
    public final Object m2940c() {
        return this.nextParkedWorker;
    }

    /* JADX INFO: renamed from: d */
    public final int m2941d(int i) {
        int i2 = this.f4036o;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f4036o = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    /* JADX INFO: renamed from: e */
    public final pc1 m2942e() {
        int iM2941d = m2941d(2);
        ExecutorC0439ln executorC0439ln = this.f4038q;
        d90 d90Var = executorC0439ln.f4849o;
        d90 d90Var2 = executorC0439ln.f4848n;
        if (iM2941d == 0) {
            pc1 pc1Var = (pc1) d90Var2.m5667d();
            return pc1Var != null ? pc1Var : (pc1) d90Var.m5667d();
        }
        pc1 pc1Var2 = (pc1) d90Var.m5667d();
        return pc1Var2 != null ? pc1Var2 : (pc1) d90Var2.m5667d();
    }

    /* JADX INFO: renamed from: f */
    public final void m2943f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4038q.f4847m);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* JADX INFO: renamed from: g */
    public final void m2944g(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2945h(EnumC0402kn enumC0402kn) {
        EnumC0402kn enumC0402kn2 = this.f4033l;
        boolean z = enumC0402kn2 == EnumC0402kn.f4454j;
        if (z) {
            ExecutorC0439ln.f4841r.addAndGet(this.f4038q, 4398046511104L);
        }
        if (enumC0402kn2 != enumC0402kn) {
            this.f4033l = enumC0402kn;
        }
        return z;
    }

    /* JADX INFO: renamed from: i */
    public final pc1 m2946i(int i) {
        pc1 pc1VarM4371g;
        long jM4372h;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0439ln.f4841r;
        ExecutorC0439ln executorC0439ln = this.f4038q;
        int i2 = (int) (atomicLongFieldUpdater.get(executorC0439ln) & 2097151);
        if (i2 < 2) {
            return null;
        }
        int iM2941d = m2941d(i2);
        long jMin = Long.MAX_VALUE;
        for (int i3 = 0; i3 < i2; i3++) {
            iM2941d++;
            if (iM2941d > i2) {
                iM2941d = 1;
            }
            C0365jn c0365jn = (C0365jn) executorC0439ln.f4850p.m4469b(iM2941d);
            if (c0365jn != null && c0365jn != this) {
                rk1 rk1Var = c0365jn.f4031j;
                if (i != 3) {
                    rk1Var.getClass();
                    int i4 = rk1.f6874d.get(rk1Var);
                    int i5 = rk1.f6873c.get(rk1Var);
                    boolean z = i == 1;
                    while (true) {
                        if (i4 == i5 || (z && rk1.f6875e.get(rk1Var) == 0)) {
                            pc1VarM4371g = null;
                            break;
                        }
                        int i6 = i4 + 1;
                        pc1VarM4371g = rk1Var.m4371g(i4, z);
                        if (pc1VarM4371g != null) {
                            break;
                        }
                        i4 = i6;
                    }
                } else {
                    pc1VarM4371g = rk1Var.m4369e();
                }
                k01 k01Var = this.f4032k;
                if (pc1VarM4371g != null) {
                    k01Var.f4243j = pc1VarM4371g;
                    jM4372h = -1;
                } else {
                    jM4372h = rk1Var.m4372h(i, k01Var);
                }
                if (jM4372h == -1) {
                    pc1 pc1Var = (pc1) k01Var.f4243j;
                    k01Var.f4243j = null;
                    return pc1Var;
                }
                if (jM4372h > 0) {
                    jMin = Math.min(jMin, jM4372h);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f4035n = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (ExecutorC0439ln.f4842s.get(this.f4038q) == 0) {
                    EnumC0402kn enumC0402kn = this.f4033l;
                    EnumC0402kn enumC0402kn2 = EnumC0402kn.f4458n;
                    if (enumC0402kn == enumC0402kn2) {
                        break loop0;
                    }
                    pc1 pc1VarM2938a = m2938a(this.f4037p);
                    if (pc1VarM2938a != null) {
                        this.f4035n = 0L;
                        ExecutorC0439ln executorC0439ln = this.f4038q;
                        this.f4034m = 0L;
                        if (this.f4033l == EnumC0402kn.f4456l) {
                            this.f4033l = EnumC0402kn.f4455k;
                        }
                        if (!pc1VarM2938a.f6088k) {
                            try {
                                pc1VarM2938a.run();
                                break;
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                break;
                            }
                        }
                        if (m2945h(EnumC0402kn.f4455k) && !executorC0439ln.m3234l() && !executorC0439ln.m3233j(ExecutorC0439ln.f4841r.get(executorC0439ln))) {
                            executorC0439ln.m3234l();
                        }
                        try {
                            pc1VarM2938a.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                        ExecutorC0439ln.f4841r.addAndGet(executorC0439ln, -2097152L);
                        if (this.f4033l == enumC0402kn2) {
                            break;
                        }
                        this.f4033l = EnumC0402kn.f4457m;
                        break;
                    }
                    this.f4037p = false;
                    if (this.f4035n == 0) {
                        Object obj = this.nextParkedWorker;
                        g72 g72Var = ExecutorC0439ln.f4843t;
                        if (obj != g72Var) {
                            f4030r.set(this, -1);
                            while (this.nextParkedWorker != ExecutorC0439ln.f4843t) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4030r;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                ExecutorC0439ln executorC0439ln2 = this.f4038q;
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = ExecutorC0439ln.f4842s;
                                if (atomicIntegerFieldUpdater2.get(executorC0439ln2) != 0) {
                                    break;
                                }
                                EnumC0402kn enumC0402kn3 = this.f4033l;
                                EnumC0402kn enumC0402kn4 = EnumC0402kn.f4458n;
                                if (enumC0402kn3 == enumC0402kn4) {
                                    break;
                                }
                                m2945h(EnumC0402kn.f4456l);
                                Thread.interrupted();
                                if (this.f4034m == 0) {
                                    j = 2097151;
                                    this.f4034m = System.nanoTime() + this.f4038q.f4846l;
                                } else {
                                    j = 2097151;
                                }
                                LockSupport.parkNanos(this.f4038q.f4846l);
                                if (System.nanoTime() - this.f4034m >= 0) {
                                    this.f4034m = 0L;
                                    ExecutorC0439ln executorC0439ln3 = this.f4038q;
                                    synchronized (executorC0439ln3.f4850p) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(executorC0439ln3) != 0)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0439ln.f4841r;
                                                if (((int) (atomicLongFieldUpdater.get(executorC0439ln3) & j)) > executorC0439ln3.f4844j) {
                                                    if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i = this.indexInArray;
                                                        m2943f(0);
                                                        executorC0439ln3.m3232i(this, i, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(executorC0439ln3) & j);
                                                        if (andDecrement != i) {
                                                            Object objM4469b = executorC0439ln3.f4850p.m4469b(andDecrement);
                                                            objM4469b.getClass();
                                                            C0365jn c0365jn = (C0365jn) objM4469b;
                                                            executorC0439ln3.f4850p.m4470c(i, c0365jn);
                                                            c0365jn.m2943f(i);
                                                            executorC0439ln3.m3232i(c0365jn, andDecrement, i);
                                                        }
                                                        executorC0439ln3.f4850p.m4470c(andDecrement, null);
                                                        this.f4033l = enumC0402kn4;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                            }
                        } else {
                            ExecutorC0439ln executorC0439ln4 = this.f4038q;
                            if (this.nextParkedWorker == g72Var) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = ExecutorC0439ln.f4840q;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(executorC0439ln4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = executorC0439ln4.f4850p.m4469b((int) (j2 & 2097151));
                                    ExecutorC0439ln executorC0439ln5 = executorC0439ln4;
                                    if (ExecutorC0439ln.f4840q.compareAndSet(executorC0439ln5, j2, ((j2 + 2097152) & (-2097152)) | ((long) i2))) {
                                        break;
                                    } else {
                                        executorC0439ln4 = executorC0439ln5;
                                    }
                                }
                            }
                        }
                    } else {
                        if (z) {
                            m2945h(EnumC0402kn.f4456l);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f4035n);
                            this.f4035n = 0L;
                            break;
                        }
                        z = true;
                    }
                } else {
                    break loop0;
                }
            }
        }
        m2945h(EnumC0402kn.f4458n);
    }
}
