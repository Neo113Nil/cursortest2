package W5;

import U5.AbstractC0439f;
import U5.C0437d;
import U5.C0443j;
import U5.C0445l;
import U5.C0452t;
import U5.EnumC0446m;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import p155w1.C1052y0;

/* JADX INFO: loaded from: classes2.dex */
public final class Q0 extends U5.Q implements U5.E {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final Logger f6922g0 = Logger.getLogger(Q0.class.getName());

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final Pattern f6923h0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final U5.l0 f6924i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final U5.l0 f6925j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final U5.l0 f6926k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final W0 f6927l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final B0 f6928m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final G f6929n0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public I0 f6930A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public volatile U5.L f6931B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f6932C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final HashSet f6933D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public LinkedHashSet f6934E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Object f6935F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final HashSet f6936G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final L f6937H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final p155w1.F0 f6938I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final AtomicBoolean f6939J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f6940K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f6941L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public volatile boolean f6942M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final CountDownLatch f6943N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final f2 f6944O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final p072k1.g f6945P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final C0523n f6946Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final C0517l f6947R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final U5.C f6948S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final N0 f6949T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public W0 f6950U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f6951V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final boolean f6952W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final p145u1.c f6953X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final long f6954Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final long f6955Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final boolean f6956a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final C0443j f6957b0;
    public final C0512j0 c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final U5.F f6958d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final C f6959d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6960e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final p148u5.c f6961e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final U5.h0 f6962f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f6963f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final U5.d0 f6964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h2 f6965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0514k f6966i;
    public final O0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Executor f6967k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1052y0 f6968l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final H0 f6969m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final H0 f6970n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f2 f6971o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final U5.p0 f6972p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0452t f6973q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0445l f6974r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f2 f6975s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f6976t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C f6977u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f2 f6978v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final N0 f6979w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f6980x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public R1 f6981y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f6982z;

    static {
        U5.l0 l0Var = U5.l0.f6544n;
        f6924i0 = l0Var.g("Channel shutdownNow invoked");
        f6925j0 = l0Var.g("Channel shutdown invoked");
        f6926k0 = l0Var.g("Subchannel shutdown invoked");
        f6927l0 = new W0(null, new HashMap(), new HashMap(), null, null, null);
        f6928m0 = new B0();
        f6929n0 = new G(1);
    }

    public Q0(R0 r7, X5.f fVar, f2 f2Var, C1052y0 c1052y0, f2 f2Var2, ArrayList arrayList) {
        int i7;
        f2 f2Var3 = f2.f7216b;
        U5.p0 p0Var = new U5.p0(new E0(this, 0));
        this.f6972p = p0Var;
        C c3 = new C();
        c3.f6750b = new ArrayList();
        c3.f6749a = EnumC0446m.f6553d;
        this.f6977u = c3;
        this.f6933D = new HashSet(16, 0.75f);
        this.f6935F = new Object();
        this.f6936G = new HashSet(1, 0.75f);
        this.f6938I = new p155w1.F0(this);
        this.f6939J = new AtomicBoolean(false);
        this.f6943N = new CountDownLatch(1);
        this.f6963f0 = 1;
        this.f6950U = f6927l0;
        this.f6951V = false;
        this.f6953X = new p145u1.c(12);
        this.f6957b0 = U5.r.f6575d;
        p033e3.h hVar = new p033e3.h(this);
        this.c0 = new C0512j0(this, 1);
        C c4 = new C();
        c4.f6750b = this;
        this.f6959d0 = c4;
        String str = r7.f6997f;
        p113p3.f.k(str, "target");
        this.f6960e = str;
        U5.F f7 = new U5.F("Channel", str, U5.F.f6417d.incrementAndGet());
        this.f6958d = f7;
        this.f6971o = f2Var3;
        C1052y0 c1052y1 = r7.f6992a;
        p113p3.f.k(c1052y1, "executorPool");
        this.f6968l = c1052y1;
        Executor executor = (Executor) c2.a((b2) c1052y1.f17938b);
        p113p3.f.k(executor, "executor");
        this.f6967k = executor;
        C1052y0 c1052y2 = r7.f6993b;
        p113p3.f.k(c1052y2, "offloadExecutorPool");
        H0 h6 = new H0(c1052y2);
        this.f6970n = h6;
        C0514k c0514k = new C0514k(fVar, h6);
        this.f6966i = c0514k;
        O0 o7 = new O0(fVar.f7514d);
        this.j = o7;
        C0523n c0523n = new C0523n(f7, f2Var3.d(), AbstractC0486a1.h("Channel for '", str, "'"));
        this.f6946Q = c0523n;
        C0517l c0517l = new C0517l(c0523n, f2Var3);
        this.f6947R = c0517l;
        C0542t1 c0542t1 = AbstractC0494d0.f7174m;
        boolean z4 = r7.f7005o;
        this.f6956a0 = z4;
        h2 h2Var = new h2(r7.f6998g);
        this.f6965h = h2Var;
        U5.h0 h0Var = r7.f6995d;
        this.f6962f = h0Var;
        S1 s7 = new S1(z4, r7.f7001k, r7.f7002l, h2Var);
        X5.g gVar = (X5.g) r7.f7014x.f6064b;
        int iE = p136t.e.e(gVar.f7529g);
        if (iE == 0) {
            i7 = 443;
        } else {
            if (iE != 1) {
                throw new AssertionError(AbstractC0486a1.u(gVar.f7529g).concat(" not handled"));
            }
            i7 = 80;
        }
        Integer numValueOf = Integer.valueOf(i7);
        c0542t1.getClass();
        U5.d0 d0Var = new U5.d0(numValueOf, c0542t1, p0Var, s7, o7, c0517l, h6);
        this.f6964g = d0Var;
        c0514k.f7260a.getClass();
        this.f6981y = D(str, h0Var, d0Var, Collections.singleton(InetSocketAddress.class));
        this.f6969m = new H0(c1052y0);
        L l7 = new L(executor, p0Var);
        this.f6937H = l7;
        l7.b(hVar);
        this.f6978v = f2Var;
        boolean z7 = r7.f7007q;
        this.f6952W = z7;
        N0 n2 = new N0(this, this.f6981y.f());
        this.f6949T = n2;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            p113p3.f.k(null, "interceptor");
            throw null;
        }
        this.f6979w = n2;
        this.f6980x = new ArrayList(r7.f6996e);
        p113p3.f.k(f2Var2, "stopwatchSupplier");
        this.f6975s = f2Var2;
        long j = r7.j;
        if (j == -1) {
            this.f6976t = j;
        } else {
            p113p3.f.g(j >= R0.f6985A, "invalid idleTimeoutMillis %s", j);
            this.f6976t = r7.j;
        }
        C0 c0 = new C0(this, 5);
        ScheduledExecutorService scheduledExecutorService = fVar.f7514d;
        D3.p pVar = new D3.p(0);
        p148u5.c cVar = new p148u5.c();
        cVar.f16886e = c0;
        cVar.f16885d = p0Var;
        cVar.f16884c = scheduledExecutorService;
        cVar.f16887f = pVar;
        pVar.b();
        this.f6961e0 = cVar;
        C0452t c0452t = r7.f6999h;
        p113p3.f.k(c0452t, "decompressorRegistry");
        this.f6973q = c0452t;
        C0445l c0445l = r7.f7000i;
        p113p3.f.k(c0445l, "compressorRegistry");
        this.f6974r = c0445l;
        this.f6955Z = r7.f7003m;
        this.f6954Y = r7.f7004n;
        this.f6944O = new f2(14);
        this.f6945P = new p072k1.g(8);
        U5.C c7 = r7.f7006p;
        c7.getClass();
        this.f6948S = c7;
        if (z7) {
            return;
        }
        this.f6951V = true;
    }

    public static void A(Q0 q1) {
        if (!q1.f6942M && q1.f6939J.get() && q1.f6933D.isEmpty() && q1.f6936G.isEmpty()) {
            q1.f6947R.l(2, "Terminated");
            C1052y0 c1052y0 = q1.f6968l;
            c2.b((b2) c1052y0.f17938b, q1.f6967k);
            H0 h6 = q1.f6969m;
            synchronized (h6) {
                Executor executor = h6.f6815b;
                if (executor != null) {
                    c2.b((b2) h6.f6814a.f17938b, executor);
                    h6.f6815b = null;
                }
            }
            H0 h7 = q1.f6970n;
            synchronized (h7) {
                Executor executor2 = h7.f6815b;
                if (executor2 != null) {
                    c2.b((b2) h7.f6814a.f17938b, executor2);
                    h7.f6815b = null;
                }
            }
            q1.f6966i.close();
            q1.f6942M = true;
            q1.f6943N.countDown();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [U5.g0] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    public static R1 D(String str, U5.h0 h0Var, U5.d0 d0Var, Collection collection) {
        URI uri;
        ?? r7;
        String str2;
        String str3;
        String str4;
        E3.Q q7;
        E3.Q q8;
        StringBuilder sb = new StringBuilder();
        T t7 = null;
        try {
            uri = new URI(str);
        } catch (URISyntaxException e7) {
            sb.append(e7.getMessage());
            uri = null;
        }
        if (uri == null) {
            r7 = 0;
        } else {
            String scheme = uri.getScheme();
            if (scheme == null) {
                h0Var.getClass();
                r7 = 0;
            } else {
                synchronized (h0Var) {
                    q8 = h0Var.f6505c;
                }
                r7 = (U5.g0) q8.get(scheme.toLowerCase(Locale.US));
            }
        }
        if (r7 == 0 && !f6923h0.matcher(str).matches()) {
            try {
                synchronized (h0Var) {
                    str4 = h0Var.f6503a;
                }
                uri = new URI(str4, "", "/" + str, null);
                String scheme2 = uri.getScheme();
                if (scheme2 == null) {
                    r7 = 0;
                } else {
                    synchronized (h0Var) {
                        q7 = h0Var.f6505c;
                    }
                    r7 = (U5.g0) q7.get(scheme2.toLowerCase(Locale.US));
                }
            } catch (URISyntaxException e8) {
                throw new IllegalArgumentException(e8);
            }
        }
        if (r7 == 0) {
            if (sb.length() > 0) {
                str3 = " (" + ((Object) sb) + ")";
            } else {
                str3 = "";
            }
            throw new IllegalArgumentException(AbstractC0486a1.h("Could not find a NameResolverProvider for ", str, str3));
        }
        if (collection != null && !collection.containsAll(r7.a())) {
            throw new IllegalArgumentException(p155w1.L.j("Address types of NameResolver '", uri.getScheme(), "' for '", str, "' not supported by transport"));
        }
        if ("dns".equals(uri.getScheme())) {
            String path = uri.getPath();
            p113p3.f.k(path, "targetPath");
            if (!path.startsWith("/")) {
                throw new IllegalArgumentException(P6.b.z("the path component (%s) of the target (%s) must start with '/'", path, uri));
            }
            String strSubstring = path.substring(1);
            uri.getAuthority();
            t7 = new T(strSubstring, d0Var, AbstractC0494d0.f7177p, new D3.p(0), U.f7060a);
        }
        if (t7 != null) {
            f2 f2Var = new f2(7);
            O0 o7 = d0Var.f6486e;
            if (o7 == null) {
                throw new IllegalStateException("ScheduledExecutorService not set in Builder");
            }
            U5.p0 p0Var = d0Var.f6484c;
            return new R1(t7, new C0508i(f2Var, o7, p0Var), p0Var);
        }
        if (sb.length() > 0) {
            str2 = " (" + ((Object) sb) + ")";
        } else {
            str2 = "";
        }
        throw new IllegalArgumentException(AbstractC0486a1.h("cannot create a NameResolver for ", str, str2));
    }

    public static void y(Q0 q1) {
        q1.G(true);
        L l7 = q1.f6937H;
        l7.i(null);
        q1.f6947R.l(2, "Entering IDLE state");
        q1.f6977u.b(EnumC0446m.f6553d);
        Object[] objArr = {q1.f6935F, l7};
        C0512j0 c0512j0 = q1.c0;
        c0512j0.getClass();
        for (int i7 = 0; i7 < 2; i7++) {
            if (((Set) c0512j0.f364a).contains(objArr[i7])) {
                q1.C();
                return;
            }
        }
    }

    public static void z(Q0 q1) {
        if (q1.f6940K) {
            for (C0538s0 c0538s0 : q1.f6933D) {
                c0538s0.getClass();
                U5.l0 l0Var = f6924i0;
                RunnableC0518l0 runnableC0518l0 = new RunnableC0518l0(c0538s0, l0Var, 0);
                U5.p0 p0Var = c0538s0.f7349k;
                p0Var.execute(runnableC0518l0);
                p0Var.execute(new RunnableC0518l0(c0538s0, l0Var, 1));
            }
            Iterator it = q1.f6936G.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    public final void B(boolean z4) {
        ScheduledFuture scheduledFuture;
        p148u5.c cVar = this.f6961e0;
        cVar.f16883b = false;
        if (!z4 || (scheduledFuture = (ScheduledFuture) cVar.f16888g) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        cVar.f16888g = null;
    }

    public final void C() {
        this.f6972p.f();
        if (this.f6939J.get() || this.f6932C) {
            return;
        }
        if (((Set) this.c0.f364a).isEmpty()) {
            E();
        } else {
            B(false);
        }
        if (this.f6930A != null) {
            return;
        }
        this.f6947R.l(2, "Exiting idle mode");
        I0 i7 = new I0(this);
        h2 h2Var = this.f6965h;
        h2Var.getClass();
        i7.f6822d = new p155w1.F0(h2Var, i7);
        this.f6930A = i7;
        this.f6981y.n(new J0(this, i7, this.f6981y));
        this.f6982z = true;
    }

    public final void E() {
        long j = this.f6976t;
        if (j == -1) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        p148u5.c cVar = this.f6961e0;
        cVar.getClass();
        long nanos = timeUnit.toNanos(j);
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jA = ((D3.p) cVar.f16887f).a(timeUnit2) + nanos;
        cVar.f16883b = true;
        if (jA - cVar.f16882a < 0 || ((ScheduledFuture) cVar.f16888g) == null) {
            ScheduledFuture scheduledFuture = (ScheduledFuture) cVar.f16888g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            cVar.f16888g = ((ScheduledExecutorService) cVar.f16884c).schedule(new RunnableC0557y1(cVar, 1), nanos, timeUnit2);
        }
        cVar.f16882a = jA;
    }

    public final void F() {
        this.f6947R.l(1, "shutdown() called");
        if (this.f6939J.compareAndSet(false, true)) {
            C0 c0 = new C0(this, 3);
            U5.p0 p0Var = this.f6972p;
            p0Var.execute(c0);
            N0 n2 = this.f6949T;
            n2.f6886g.f6972p.execute(new L0(n2, 0));
            p0Var.execute(new C0(this, 0));
        }
    }

    public final void G(boolean z4) {
        this.f6972p.f();
        if (z4) {
            p113p3.f.q("nameResolver is not started", this.f6982z);
            p113p3.f.q("lbHelper is null", this.f6930A != null);
        }
        R1 r7 = this.f6981y;
        if (r7 != null) {
            r7.m();
            this.f6982z = false;
            if (z4) {
                String str = this.f6960e;
                U5.h0 h0Var = this.f6962f;
                U5.d0 d0Var = this.f6964g;
                this.f6966i.f7260a.getClass();
                this.f6981y = D(str, h0Var, d0Var, Collections.singleton(InetSocketAddress.class));
            } else {
                this.f6981y = null;
            }
        }
        I0 i7 = this.f6930A;
        if (i7 != null) {
            p155w1.F0 f7 = i7.f6822d;
            ((U5.N) f7.f17380c).f();
            f7.f17380c = null;
            this.f6930A = null;
        }
        this.f6931B = null;
    }

    @Override // U5.E
    public final U5.F f() {
        return this.f6958d;
    }

    @Override // U5.AbstractC0438e
    public final AbstractC0439f n(H2.r rVar, C0437d c0437d) {
        return this.f6979w.n(rVar, c0437d);
    }

    @Override // U5.Q
    public final boolean s(long j, TimeUnit timeUnit) {
        return this.f6943N.await(j, timeUnit);
    }

    @Override // U5.Q
    public final void t() {
        this.f6972p.execute(new C0(this, 1));
    }

    public final String toString() {
        D3.j jVarU0 = p003a.a.u0(this);
        jVarU0.b("logId", this.f6958d.f6420c);
        jVarU0.a(this.f6960e, "target");
        return jVarU0.toString();
    }

    @Override // U5.Q
    public final EnumC0446m u() {
        EnumC0446m enumC0446m = (EnumC0446m) this.f6977u.f6749a;
        if (enumC0446m == null) {
            throw new UnsupportedOperationException("Channel state API is not implemented");
        }
        if (enumC0446m == EnumC0446m.f6553d) {
            this.f6972p.execute(new C0(this, 2));
        }
        return enumC0446m;
    }

    @Override // U5.Q
    public final void v(EnumC0446m enumC0446m, K4.t tVar) {
        this.f6972p.execute(new H2.q(9, this, tVar, enumC0446m, false));
    }

    @Override // U5.Q
    public final /* bridge */ /* synthetic */ U5.Q w() {
        F();
        return this;
    }

    @Override // U5.Q
    public final U5.Q x() {
        this.f6947R.l(1, "shutdownNow() called");
        F();
        N0 n2 = this.f6949T;
        n2.f6886g.f6972p.execute(new L0(n2, 1));
        this.f6972p.execute(new C0(this, 4));
        return this;
    }
}
