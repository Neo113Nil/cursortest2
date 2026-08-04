package W5;

import A1.C0011c;
import C0.RunnableC0085d;
import U5.AbstractC0442i;
import U5.C0436c;
import U5.C0437d;
import U5.C0443j;
import U5.C0450q;
import U5.C0452t;
import U5.InterfaceC0444k;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p155w1.C1050x1;

/* JADX INFO: loaded from: classes2.dex */
public final class F0 implements InterfaceC0540t {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final U5.W f6769E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final U5.W f6770F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final U5.l0 f6771G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final Random f6772H;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ H2.r f6773A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C0437d f6774B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ C0450q f6775C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ C f6776D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H2.r f6777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f6778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U5.p0 f6779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f6780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final U5.b0 f6781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final O1 f6782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0500f0 f6783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6784h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f6785i;
    public final p145u1.c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f6786k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f6787l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final N1 f6788m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final R4.c f6789n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile J1 f6790o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f6791p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicInteger f6792q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicInteger f6793r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C1050x1 f6794s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f6795t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC0546v f6796u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0011c f6797v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C0011c f6798w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f6799x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public U5.l0 f6800y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f6801z;

    static {
        C0443j c0443j = U5.b0.f6457d;
        BitSet bitSet = U5.Y.f6448d;
        f6769E = new U5.W("grpc-previous-rpc-attempts", c0443j);
        f6770F = new U5.W("grpc-retry-pushback-ms", c0443j);
        f6771G = U5.l0.f6537f.g("Stream thrown away because RetriableStream committed");
        f6772H = new Random();
    }

    public F0(C c3, H2.r rVar, U5.b0 b0Var, C0437d c0437d, O1 o7, C0500f0 c0500f0, C0450q c0450q) {
        this.f6776D = c3;
        this.f6773A = rVar;
        this.f6774B = c0437d;
        this.f6775C = c0450q;
        Q0 q1 = (Q0) c3.f6750b;
        p145u1.c cVar = q1.f6953X;
        long j = q1.f6954Y;
        long j3 = q1.f6955Z;
        Executor executor = c0437d.f6475b;
        executor = executor == null ? q1.f6967k : executor;
        ScheduledExecutorService scheduledExecutorService = q1.f6966i.f7260a.f7514d;
        N1 n2 = (N1) c3.f6749a;
        this.f6779c = new U5.p0(new C0560z1());
        this.f6785i = new Object();
        this.f6789n = new R4.c(10);
        this.f6790o = new J1(new ArrayList(8), Collections.emptyList(), null, null, false, false, false, 0);
        this.f6791p = new AtomicBoolean();
        this.f6792q = new AtomicInteger();
        this.f6793r = new AtomicInteger();
        this.f6777a = rVar;
        this.j = cVar;
        this.f6786k = j;
        this.f6787l = j3;
        this.f6778b = executor;
        this.f6780d = scheduledExecutorService;
        this.f6781e = b0Var;
        this.f6782f = o7;
        if (o7 != null) {
            this.f6799x = o7.f6896b;
        }
        this.f6783g = c0500f0;
        p113p3.f.d("Should not provide both retryPolicy and hedgingPolicy", o7 == null || c0500f0 == null);
        this.f6784h = c0500f0 != null;
        this.f6788m = n2;
    }

    public static void n(F0 f7, Integer num) {
        f7.getClass();
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            f7.s();
            return;
        }
        synchronized (f7.f6785i) {
            try {
                C0011c c0011c = f7.f6798w;
                if (c0011c != null) {
                    c0011c.f332b = true;
                    ScheduledFuture scheduledFuture = (ScheduledFuture) c0011c.f334d;
                    C0011c c0011c2 = new C0011c(f7.f6785i);
                    f7.f6798w = c0011c2;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    c0011c2.i(f7.f6780d.schedule(new E(21, f7, c0011c2), num.intValue(), TimeUnit.MILLISECONDS));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // W5.e2
    public final void a(InterfaceC0444k interfaceC0444k) {
        q(new B1(interfaceC0444k, 0));
    }

    @Override // W5.e2
    public final boolean b() {
        Iterator it = this.f6790o.f6832c.iterator();
        while (it.hasNext()) {
            if (((M1) it.next()).f6877a.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // W5.InterfaceC0540t
    public final void c(int i7) {
        q(new D1(i7, 1));
    }

    @Override // W5.InterfaceC0540t
    public final void d(R4.c cVar) {
        J1 j3;
        synchronized (this.f6785i) {
            cVar.y(this.f6789n, "closed");
            j3 = this.f6790o;
        }
        if (j3.f6835f != null) {
            R4.c cVar2 = new R4.c(10);
            j3.f6835f.f6877a.d(cVar2);
            cVar.y(cVar2, "committed");
            return;
        }
        R4.c cVar3 = new R4.c(10);
        for (M1 m7 : j3.f6832c) {
            R4.c cVar4 = new R4.c(10);
            m7.f6877a.d(cVar4);
            ((ArrayList) cVar3.f6064b).add(String.valueOf(cVar4));
        }
        cVar.y(cVar3, "open");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0068 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:27:0x0047, B:29:0x0057, B:31:0x005b, B:35:0x0068, B:38:0x0074), top: B:50:0x0047 }] */
    @Override // W5.InterfaceC0540t
    public final void e(InterfaceC0546v interfaceC0546v) {
        U5.l0 l0Var;
        C0011c c0011c;
        this.f6796u = interfaceC0546v;
        p155w1.F0 f7 = ((Q0) this.f6776D.f6750b).f6938I;
        synchronized (f7.f17379b) {
            try {
                l0Var = (U5.l0) f7.f17381d;
                c0011c = null;
                if (l0Var == null) {
                    ((HashSet) f7.f17380c).add(this);
                    l0Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (l0Var != null) {
            f(l0Var);
            return;
        }
        synchronized (this.f6785i) {
            this.f6790o.f6831b.add(new I1(this));
        }
        M1 m1P = p(0, false);
        if (m1P == null) {
            return;
        }
        if (this.f6784h) {
            synchronized (this.f6785i) {
                try {
                    this.f6790o = this.f6790o.a(m1P);
                    if (t(this.f6790o)) {
                        N1 n2 = this.f6788m;
                        if (n2 == null) {
                            c0011c = new C0011c(this.f6785i);
                            this.f6798w = c0011c;
                        } else {
                            if (n2.f6890d.get() > n2.f6888b) {
                                c0011c = new C0011c(this.f6785i);
                                this.f6798w = c0011c;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (c0011c != null) {
                c0011c.i(this.f6780d.schedule(new E(21, this, c0011c), this.f6783g.f7204b, TimeUnit.NANOSECONDS));
            }
        }
        r(m1P);
    }

    @Override // W5.InterfaceC0540t
    public final void f(U5.l0 l0Var) {
        M1 m7;
        M1 m8 = new M1(0);
        m8.f6877a = new C0504g1();
        A1 a1O = o(m8);
        if (a1O != null) {
            synchronized (this.f6785i) {
                this.f6790o = this.f6790o.e(m8);
            }
            a1O.run();
            u(l0Var, EnumC0543u.f7372a, new U5.b0());
            return;
        }
        synchronized (this.f6785i) {
            try {
                if (this.f6790o.f6832c.contains(this.f6790o.f6835f)) {
                    m7 = this.f6790o.f6835f;
                } else {
                    this.f6800y = l0Var;
                    m7 = null;
                }
                J1 j3 = this.f6790o;
                this.f6790o = new J1(j3.f6831b, j3.f6832c, j3.f6833d, j3.f6835f, true, j3.f6830a, j3.f6837h, j3.f6834e);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (m7 != null) {
            m7.f6877a.f(l0Var);
        }
    }

    @Override // W5.e2
    public final void flush() {
        J1 j3 = this.f6790o;
        if (j3.f6830a) {
            j3.f6835f.f6877a.flush();
        } else {
            q(new C1(0));
        }
    }

    @Override // W5.e2
    public final void g(p016b6.a aVar) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // W5.InterfaceC0540t
    public final void h() {
        q(new C1(1));
    }

    @Override // W5.e2
    public final void i(int i7) {
        J1 j3 = this.f6790o;
        if (j3.f6830a) {
            j3.f6835f.f6877a.i(i7);
        } else {
            q(new D1(i7, 2));
        }
    }

    @Override // W5.InterfaceC0540t
    public final void j(int i7) {
        q(new D1(i7, 0));
    }

    @Override // W5.InterfaceC0540t
    public final void k(C0452t c0452t) {
        q(new B1(c0452t, 2));
    }

    @Override // W5.InterfaceC0540t
    public final void l(U5.r rVar) {
        q(new B1(rVar, 1));
    }

    @Override // W5.e2
    public final void m() {
        q(new C1(2));
    }

    public final A1 o(M1 m7) {
        Collection collectionEmptyList;
        boolean z4;
        List list;
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        synchronized (this.f6785i) {
            try {
                if (this.f6790o.f6835f != null) {
                    return null;
                }
                Collection collection = this.f6790o.f6832c;
                J1 j3 = this.f6790o;
                p113p3.f.q("Already committed", j3.f6835f == null);
                if (j3.f6832c.contains(m7)) {
                    list = null;
                    collectionEmptyList = Collections.singleton(m7);
                    z4 = true;
                } else {
                    collectionEmptyList = Collections.emptyList();
                    z4 = false;
                    list = j3.f6831b;
                }
                this.f6790o = new J1(list, collectionEmptyList, j3.f6833d, m7, j3.f6836g, z4, j3.f6837h, j3.f6834e);
                ((AtomicLong) this.j.f16597b).addAndGet(-this.f6795t);
                C0011c c0011c = this.f6797v;
                if (c0011c != null) {
                    c0011c.f332b = true;
                    ScheduledFuture scheduledFuture3 = (ScheduledFuture) c0011c.f334d;
                    this.f6797v = null;
                    scheduledFuture = scheduledFuture3;
                } else {
                    scheduledFuture = null;
                }
                C0011c c0011c2 = this.f6798w;
                if (c0011c2 != null) {
                    c0011c2.f332b = true;
                    scheduledFuture2 = (ScheduledFuture) c0011c2.f334d;
                    this.f6798w = null;
                } else {
                    scheduledFuture2 = null;
                }
                return new A1(this, collection, m7, scheduledFuture, scheduledFuture2, 0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final M1 p(int i7, boolean z4) {
        AtomicInteger atomicInteger;
        int i8;
        do {
            atomicInteger = this.f6793r;
            i8 = atomicInteger.get();
            if (i8 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i8, i8 + 1));
        M1 m7 = new M1(i7);
        F1 f7 = new F1(new H1(this, m7));
        U5.b0 b0Var = new U5.b0();
        b0Var.d(this.f6781e);
        if (i7 > 0) {
            b0Var.f(f6769E, String.valueOf(i7));
        }
        C0437d c0437d = this.f6774B;
        c0437d.getClass();
        List list = c0437d.f6478e;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(f7);
        C0436c c0436cB = C0437d.b(c0437d);
        c0436cB.f6461a = Collections.unmodifiableList(arrayList);
        C0437d c0437d2 = new C0437d(c0436cB);
        AbstractC0442i[] abstractC0442iArrC = AbstractC0494d0.c(c0437d2, b0Var, i7, z4);
        H2.r rVar = this.f6773A;
        InterfaceC0549w interfaceC0549wA = this.f6776D.a(new C0539s1(rVar, b0Var, c0437d2));
        C0450q c0450q = this.f6775C;
        C0450q c0450qA = c0450q.a();
        try {
            InterfaceC0540t interfaceC0540tA = interfaceC0549wA.a(rVar, b0Var, c0437d2, abstractC0442iArrC);
            c0450q.c(c0450qA);
            m7.f6877a = interfaceC0540tA;
            return m7;
        } catch (Throwable th) {
            c0450q.c(c0450qA);
            throw th;
        }
    }

    public final void q(G1 g3) {
        Collection collection;
        synchronized (this.f6785i) {
            try {
                if (!this.f6790o.f6830a) {
                    this.f6790o.f6831b.add(g3);
                }
                collection = this.f6790o.f6832c;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            g3.a((M1) it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
    
        r0 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0093, code lost:
    
        if (r0.hasNext() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0095, code lost:
    
        r4 = (W5.G1) r0.next();
        r4.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a0, code lost:
    
        if ((r4 instanceof W5.I1) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a2, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        r4 = r8.f6790o;
        r5 = r4.f6835f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a7, code lost:
    
        if (r5 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a9, code lost:
    
        if (r5 == r9) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ae, code lost:
    
        if (r4.f6836g == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(M1 m7) {
        int iMin;
        int i7 = 0;
        RunnableC0085d runnableC0085d = null;
        boolean z4 = false;
        ArrayList arrayList = null;
        while (true) {
            synchronized (this.f6785i) {
                try {
                    J1 j3 = this.f6790o;
                    M1 m8 = j3.f6835f;
                    if (m8 == null || m8 == m7) {
                        if (!j3.f6836g) {
                            if (i7 == j3.f6831b.size()) {
                                this.f6790o = j3.e(m7);
                                if (!b()) {
                                    return;
                                } else {
                                    runnableC0085d = new RunnableC0085d(this, 22);
                                }
                            } else {
                                if (m7.f6878b) {
                                    return;
                                }
                                iMin = Math.min(i7 + 128, j3.f6831b.size());
                                if (arrayList == null) {
                                    arrayList = new ArrayList(j3.f6831b.subList(i7, iMin));
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(j3.f6831b.subList(i7, iMin));
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i7 = iMin;
        }
        if (runnableC0085d != null) {
            this.f6779c.execute(runnableC0085d);
            return;
        }
        if (!z4) {
            m7.f6877a.e(new h2(4, this, m7));
        }
        m7.f6877a.f(this.f6790o.f6835f == m7 ? this.f6800y : f6771G);
    }

    public final void s() {
        ScheduledFuture scheduledFuture;
        synchronized (this.f6785i) {
            try {
                C0011c c0011c = this.f6798w;
                scheduledFuture = null;
                if (c0011c != null) {
                    c0011c.f332b = true;
                    ScheduledFuture scheduledFuture2 = (ScheduledFuture) c0011c.f334d;
                    this.f6798w = null;
                    scheduledFuture = scheduledFuture2;
                }
                J1 j3 = this.f6790o;
                if (!j3.f6837h) {
                    j3 = new J1(j3.f6831b, j3.f6832c, j3.f6833d, j3.f6835f, j3.f6836g, j3.f6830a, true, j3.f6834e);
                }
                this.f6790o = j3;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final boolean t(J1 j3) {
        if (j3.f6835f == null) {
            if (j3.f6834e < this.f6783g.f7203a && !j3.f6837h) {
                return true;
            }
        }
        return false;
    }

    public final void u(U5.l0 l0Var, EnumC0543u enumC0543u, U5.b0 b0Var) {
        this.f6794s = new C1050x1(l0Var, enumC0543u, b0Var, 14);
        if (this.f6793r.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.f6779c.execute(new A2.c(this, l0Var, enumC0543u, b0Var, 10, false));
        }
    }

    public final void v(com.google.protobuf.C c3) {
        J1 j3 = this.f6790o;
        if (j3.f6830a) {
            j3.f6835f.f6877a.g(this.f6777a.e(c3));
        } else {
            q(new E1(this, c3));
        }
    }
}
