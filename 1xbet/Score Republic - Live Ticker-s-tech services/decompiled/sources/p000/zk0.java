package p000;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class zk0 implements InterfaceC0507nh {

    /* JADX INFO: renamed from: N */
    public static final jp0 f9815N;

    /* JADX INFO: renamed from: O */
    public static final jp0 f9816O;

    /* JADX INFO: renamed from: P */
    public static final ja1 f9817P;

    /* JADX INFO: renamed from: Q */
    public static final Random f9818Q;

    /* JADX INFO: renamed from: A */
    public final AtomicInteger f9819A;

    /* JADX INFO: renamed from: B */
    public oq0 f9820B;

    /* JADX INFO: renamed from: C */
    public long f9821C;

    /* JADX INFO: renamed from: D */
    public InterfaceC0581ph f9822D;

    /* JADX INFO: renamed from: E */
    public m81 f9823E;

    /* JADX INFO: renamed from: F */
    public m81 f9824F;

    /* JADX INFO: renamed from: G */
    public long f9825G;

    /* JADX INFO: renamed from: H */
    public ja1 f9826H;

    /* JADX INFO: renamed from: I */
    public boolean f9827I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ wp0 f9828J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ C0095ce f9829K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ C0697sm f9830L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ p90 f9831M;

    /* JADX INFO: renamed from: j */
    public final wp0 f9832j;

    /* JADX INFO: renamed from: k */
    public final Executor f9833k;

    /* JADX INFO: renamed from: l */
    public final gc1 f9834l;

    /* JADX INFO: renamed from: m */
    public final ScheduledExecutorService f9835m;

    /* JADX INFO: renamed from: n */
    public final np0 f9836n;

    /* JADX INFO: renamed from: o */
    public final k31 f9837o;

    /* JADX INFO: renamed from: p */
    public final eb0 f9838p;

    /* JADX INFO: renamed from: q */
    public final boolean f9839q;

    /* JADX INFO: renamed from: r */
    public final Object f9840r;

    /* JADX INFO: renamed from: s */
    public final an0 f9841s;

    /* JADX INFO: renamed from: t */
    public final long f9842t;

    /* JADX INFO: renamed from: u */
    public final long f9843u;

    /* JADX INFO: renamed from: v */
    public final j31 f9844v;

    /* JADX INFO: renamed from: w */
    public final xd0 f9845w;

    /* JADX INFO: renamed from: x */
    public volatile e31 f9846x;

    /* JADX INFO: renamed from: y */
    public final AtomicBoolean f9847y;

    /* JADX INFO: renamed from: z */
    public final AtomicInteger f9848z;

    static {
        x80 x80Var = np0.f5485d;
        BitSet bitSet = kp0.f4493d;
        f9815N = new jp0("grpc-previous-rpc-attempts", x80Var);
        f9816O = new jp0("grpc-retry-pushback-ms", x80Var);
        f9817P = ja1.f3876f.m2840h("Stream thrown away because RetriableStream committed");
        f9818Q = new Random();
    }

    public zk0(p90 p90Var, wp0 wp0Var, np0 np0Var, C0095ce c0095ce, k31 k31Var, eb0 eb0Var, C0697sm c0697sm) {
        this.f9831M = p90Var;
        this.f9828J = wp0Var;
        this.f9829K = c0095ce;
        this.f9830L = c0697sm;
        jl0 jl0Var = (jl0) p90Var.f6027j;
        an0 an0Var = jl0Var.f3991T;
        long j = jl0Var.f3992U;
        long j2 = jl0Var.f3993V;
        Executor executor = c0095ce.f1226b;
        executor = executor == null ? jl0Var.f4007h : executor;
        ScheduledExecutorService scheduledExecutorService = jl0Var.f4005f.f157j.f3319m;
        j31 j31Var = (j31) p90Var.f6028k;
        this.f9834l = new gc1(new t21());
        this.f9840r = new Object();
        this.f9845w = new xd0(0);
        this.f9846x = new e31(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);
        this.f9847y = new AtomicBoolean();
        this.f9848z = new AtomicInteger();
        this.f9819A = new AtomicInteger();
        this.f9832j = wp0Var;
        this.f9841s = an0Var;
        this.f9842t = j;
        this.f9843u = j2;
        this.f9833k = executor;
        this.f9835m = scheduledExecutorService;
        this.f9836n = np0Var;
        this.f9837o = k31Var;
        if (k31Var != null) {
            this.f9825G = k31Var.f4273b;
        }
        this.f9838p = eb0Var;
        a90.m122f("Should not provide both retryPolicy and hedgingPolicy", k31Var == null || eb0Var == null);
        this.f9839q = eb0Var != null;
        this.f9844v = j31Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m5925a(zk0 zk0Var, Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            zk0Var.m5930i();
            return;
        }
        synchronized (zk0Var.f9840r) {
            try {
                m81 m81Var = zk0Var.f9824F;
                if (m81Var == null) {
                    return;
                }
                m81Var.f5009k = true;
                Future future = (Future) m81Var.f5011m;
                m81 m81Var2 = new m81(zk0Var.f9840r);
                zk0Var.f9824F = m81Var2;
                if (future != null) {
                    future.cancel(false);
                }
                m81Var2.m3360i(zk0Var.f9835m.schedule(new RunnableC0529o2(29, zk0Var, m81Var2), num.intValue(), TimeUnit.MILLISECONDS));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.ra1
    /* JADX INFO: renamed from: C */
    public final void mo1600C() {
        m5928f(new w21(2));
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: D */
    public final void mo1601D() {
        m5928f(new w21(1));
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: G */
    public final void mo1604G(ja1 ja1Var) {
        i31 i31Var;
        i31 i31Var2 = new i31(0);
        i31Var2.f3418a = new nc1(4);
        u21 u21VarM5926b = m5926b(i31Var2);
        Object obj = this.f9840r;
        if (u21VarM5926b != null) {
            synchronized (obj) {
                this.f9846x = this.f9846x.m1359e(i31Var2);
            }
            u21VarM5926b.run();
            m5932l(ja1Var, EnumC0544oh.f5731j, new np0());
            return;
        }
        synchronized (obj) {
            try {
                if (this.f9846x.f1933c.contains(this.f9846x.f1936f)) {
                    i31Var = this.f9846x.f1936f;
                } else {
                    this.f9826H = ja1Var;
                    i31Var = null;
                }
                e31 e31Var = this.f9846x;
                this.f9846x = new e31(e31Var.f1932b, e31Var.f1933c, e31Var.f1934d, e31Var.f1936f, true, e31Var.f1931a, e31Var.f1938h, e31Var.f1935e);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i31Var != null) {
            i31Var.f3418a.mo1604G(ja1Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public final u21 m5926b(i31 i31Var) {
        List list;
        boolean z;
        Collection collectionSingleton;
        Future future;
        Future future2;
        synchronized (this.f9840r) {
            try {
                if (this.f9846x.f1936f != null) {
                    return null;
                }
                Collection collection = this.f9846x.f1933c;
                e31 e31Var = this.f9846x;
                a90.m132p("Already committed", e31Var.f1936f == null);
                List list2 = e31Var.f1932b;
                if (e31Var.f1933c.contains(i31Var)) {
                    list = null;
                    collectionSingleton = Collections.singleton(i31Var);
                    z = true;
                } else {
                    list = list2;
                    z = false;
                    collectionSingleton = Collections.EMPTY_LIST;
                }
                this.f9846x = new e31(list, collectionSingleton, e31Var.f1934d, i31Var, e31Var.f1937g, z, e31Var.f1938h, e31Var.f1935e);
                ((AtomicLong) this.f9841s.f254k).addAndGet(-this.f9821C);
                m81 m81Var = this.f9823E;
                if (m81Var != null) {
                    m81Var.f5009k = true;
                    Future future3 = (Future) m81Var.f5011m;
                    this.f9823E = null;
                    future = future3;
                } else {
                    future = null;
                }
                m81 m81Var2 = this.f9824F;
                if (m81Var2 != null) {
                    m81Var2.f5009k = true;
                    Future future4 = (Future) m81Var2.f5011m;
                    this.f9824F = null;
                    future2 = future4;
                } else {
                    future2 = null;
                }
                return new u21(this, collection, i31Var, future, future2, 0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.ra1
    /* JADX INFO: renamed from: c */
    public final void mo1624c(InterfaceC0951zh interfaceC0951zh) {
        m5928f(new v21(0, interfaceC0951zh));
    }

    /* JADX INFO: renamed from: d */
    public final i31 m5927d(int i, boolean z) {
        AtomicInteger atomicInteger;
        int i2;
        do {
            atomicInteger = this.f9819A;
            i2 = atomicInteger.get();
            if (i2 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i2, i2 + 1));
        i31 i31Var = new i31(i);
        z21 z21Var = new z21(new b31(this, i31Var));
        np0 np0Var = new np0();
        np0Var.m3580d(this.f9836n);
        if (i > 0) {
            np0Var.m3581e(f9815N, String.valueOf(i));
        }
        C0095ce c0095ce = this.f9829K;
        c0095ce.getClass();
        List list = c0095ce.f1228d;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(z21Var);
        C0547ok c0547okM919b = C0095ce.m919b(c0095ce);
        c0547okM919b.f5765d = Collections.unmodifiableList(arrayList);
        C0095ce c0095ce2 = new C0095ce(c0547okM919b);
        o80[] o80VarArrM908c = ca0.m908c(c0095ce2, np0Var, i, z);
        wp0 wp0Var = this.f9828J;
        InterfaceC0655rh interfaceC0655rhM3880c = this.f9831M.m3880c(new yv0(wp0Var, np0Var, c0095ce2));
        C0697sm c0697sm = this.f9830L;
        C0697sm c0697smM4538a = c0697sm.m4538a();
        try {
            InterfaceC0507nh interfaceC0507nhMo1527d = interfaceC0655rhM3880c.mo1527d(wp0Var, np0Var, c0095ce2, o80VarArrM908c);
            c0697sm.m4539c(c0697smM4538a);
            i31Var.f3418a = interfaceC0507nhMo1527d;
            return i31Var;
        } catch (Throwable th) {
            c0697sm.m4539c(c0697smM4538a);
            throw th;
        }
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: e */
    public final void mo1625e(int i) {
        m5928f(new x21(i, 1));
    }

    /* JADX INFO: renamed from: f */
    public final void m5928f(a31 a31Var) {
        Collection collection;
        synchronized (this.f9840r) {
            try {
                if (!this.f9846x.f1931a) {
                    this.f9846x.f1932b.add(a31Var);
                }
                collection = this.f9846x.f1933c;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            a31Var.mo22a((i31) it.next());
        }
    }

    @Override // p000.ra1
    public final void flush() {
        e31 e31Var = this.f9846x;
        if (e31Var.f1931a) {
            e31Var.f1936f.f3418a.flush();
        } else {
            m5928f(new w21(0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x008d, code lost:
    
        r2 = r3.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0092, code lost:
    
        if (r5 >= r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0094, code lost:
    
        r6 = r3.get(r5);
        r5 = r5 + 1;
        r6 = (p000.a31) r6;
        r6.mo22a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a1, code lost:
    
        if ((r6 instanceof p000.d31) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a3, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a4, code lost:
    
        r6 = r9.f9846x;
        r8 = r6.f1936f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a8, code lost:
    
        if (r8 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00aa, code lost:
    
        if (r8 == r10) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00af, code lost:
    
        if (r6.f1937g == false) goto L66;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5929g(i31 i31Var) {
        int iMin;
        boolean z = false;
        RunnableC0897y0 runnableC0897y0 = null;
        int i = 0;
        boolean z2 = false;
        ArrayList arrayList = null;
        while (true) {
            synchronized (this.f9840r) {
                try {
                    e31 e31Var = this.f9846x;
                    i31 i31Var2 = e31Var.f1936f;
                    if (i31Var2 == null || i31Var2 == i31Var) {
                        if (!e31Var.f1937g) {
                            if (i == e31Var.f1932b.size()) {
                                this.f9846x = e31Var.m1359e(i31Var);
                                if (!mo1633q()) {
                                    return;
                                } else {
                                    runnableC0897y0 = new RunnableC0897y0(22, this);
                                }
                            } else {
                                if (i31Var.f3419b) {
                                    return;
                                }
                                iMin = Math.min(i + 128, e31Var.f1932b.size());
                                if (arrayList == null) {
                                    arrayList = new ArrayList(e31Var.f1932b.subList(i, iMin));
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(e31Var.f1932b.subList(i, iMin));
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i = iMin;
        }
        if (runnableC0897y0 != null) {
            this.f9834l.execute(runnableC0897y0);
            return;
        }
        if (!z2) {
            i31Var.f3418a.mo1326n(new f50(this, i31Var, 27, z));
        }
        i31Var.f3418a.mo1604G(this.f9846x.f1936f == i31Var ? this.f9826H : f9817P);
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: h */
    public final void mo1626h(C0258gq c0258gq) {
        m5928f(new v21(2, c0258gq));
    }

    /* JADX INFO: renamed from: i */
    public final void m5930i() {
        Future future;
        synchronized (this.f9840r) {
            try {
                m81 m81Var = this.f9824F;
                future = null;
                if (m81Var != null) {
                    m81Var.f5009k = true;
                    Future future2 = (Future) m81Var.f5011m;
                    this.f9824F = null;
                    future = future2;
                }
                e31 e31Var = this.f9846x;
                if (!e31Var.f1938h) {
                    e31Var = new e31(e31Var.f1932b, e31Var.f1933c, e31Var.f1934d, e31Var.f1936f, e31Var.f1937g, e31Var.f1931a, true, e31Var.f1935e);
                }
                this.f9846x = e31Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m5931j(e31 e31Var) {
        return e31Var.f1936f == null && e31Var.f1935e < this.f9838p.f2051a && !e31Var.f1938h;
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: k */
    public final void mo1628k(int i) {
        m5928f(new x21(i, 0));
    }

    /* JADX INFO: renamed from: l */
    public final void m5932l(ja1 ja1Var, EnumC0544oh enumC0544oh, np0 np0Var) {
        this.f9820B = new oq0(ja1Var, enumC0544oh, np0Var, 3);
        if (this.f9819A.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.f9834l.execute(new RunnableC0452m(this, ja1Var, enumC0544oh, np0Var, 3));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m5933m(C0525nz c0525nz) {
        e31 e31Var = this.f9846x;
        if (!e31Var.f1931a) {
            m5928f(new y21(this, c0525nz));
            return;
        }
        InterfaceC0507nh interfaceC0507nh = e31Var.f1936f.f3418a;
        yx0 yx0Var = (yx0) this.f9832j.f8623o;
        yx0Var.getClass();
        interfaceC0507nh.mo1638w(new xx0(c0525nz, yx0Var.f9525a));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0068 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:27:0x0047, B:29:0x0057, B:31:0x005b, B:35:0x0068, B:38:0x0074), top: B:50:0x0047 }] */
    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: n */
    public final void mo1326n(InterfaceC0581ph interfaceC0581ph) {
        ja1 ja1Var;
        m81 m81Var;
        this.f9822D = interfaceC0581ph;
        f71 f71Var = ((jl0) this.f9831M.f6027j).f3977F;
        synchronized (f71Var.f2334k) {
            try {
                ja1Var = (ja1) f71Var.f2336m;
                m81Var = null;
                if (ja1Var == null) {
                    ((HashSet) f71Var.f2335l).add(this);
                    ja1Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ja1Var != null) {
            mo1604G(ja1Var);
            return;
        }
        synchronized (this.f9840r) {
            this.f9846x.f1932b.add(new d31(this));
        }
        i31 i31VarM5927d = m5927d(0, false);
        if (i31VarM5927d == null) {
            return;
        }
        if (this.f9839q) {
            synchronized (this.f9840r) {
                try {
                    this.f9846x = this.f9846x.m1355a(i31VarM5927d);
                    if (m5931j(this.f9846x)) {
                        j31 j31Var = this.f9844v;
                        if (j31Var == null) {
                            m81Var = new m81(this.f9840r);
                            this.f9824F = m81Var;
                        } else {
                            if (j31Var.f3810d.get() > j31Var.f3808b) {
                                m81Var = new m81(this.f9840r);
                                this.f9824F = m81Var;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (m81Var != null) {
                m81Var.m3360i(this.f9835m.schedule(new RunnableC0529o2(29, this, m81Var), this.f9838p.f2052b, TimeUnit.NANOSECONDS));
            }
        }
        m5929g(i31VarM5927d);
    }

    @Override // p000.ra1
    /* JADX INFO: renamed from: q */
    public final boolean mo1633q() {
        Iterator it = this.f9846x.f1933c.iterator();
        while (it.hasNext()) {
            if (((i31) it.next()).f3418a.mo1633q()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: s */
    public final void mo1327s(xd0 xd0Var) {
        e31 e31Var;
        synchronized (this.f9840r) {
            xd0Var.m5619a(this.f9845w, "closed");
            e31Var = this.f9846x;
        }
        if (e31Var.f1936f != null) {
            xd0 xd0Var2 = new xd0(0);
            e31Var.f1936f.f3418a.mo1327s(xd0Var2);
            xd0Var.m5619a(xd0Var2, "committed");
            return;
        }
        xd0 xd0Var3 = new xd0(0);
        for (i31 i31Var : e31Var.f1933c) {
            xd0 xd0Var4 = new xd0(0);
            i31Var.f3418a.mo1327s(xd0Var4);
            xd0Var3.f8895b.add(String.valueOf(xd0Var4));
        }
        xd0Var.m5619a(xd0Var3, "open");
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: u */
    public final void mo1636u(C0885xp c0885xp) {
        m5928f(new v21(1, c0885xp));
    }

    @Override // p000.ra1
    /* JADX INFO: renamed from: w */
    public final void mo1638w(xx0 xx0Var) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // p000.ra1
    /* JADX INFO: renamed from: z */
    public final void mo1641z() {
        e31 e31Var = this.f9846x;
        if (e31Var.f1931a) {
            e31Var.f1936f.f3418a.mo1641z();
        } else {
            m5928f(new w21(3));
        }
    }
}
