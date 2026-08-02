package W5;

import U5.AbstractC0438e;
import U5.AbstractC0457y;
import U5.C0453u;
import io.sentry.SentryBaseEvent;
import java.io.IOException;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import w1.C1726n0;

/* loaded from: classes2.dex */
public final class T extends AbstractC0457y {

    /* renamed from: s, reason: collision with root package name */
    public static final Logger f7030s;

    /* renamed from: t, reason: collision with root package name */
    public static final Set f7031t;

    /* renamed from: u, reason: collision with root package name */
    public static final boolean f7032u;

    /* renamed from: v, reason: collision with root package name */
    public static final boolean f7033v;

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f7034w;

    /* renamed from: x, reason: collision with root package name */
    public static String f7035x;

    /* renamed from: a, reason: collision with root package name */
    public final C0542t1 f7036a;

    /* renamed from: b, reason: collision with root package name */
    public final Random f7037b = new Random();

    /* renamed from: c, reason: collision with root package name */
    public volatile Q f7038c = Q.f6920a;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f7039d = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final String f7040e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7041f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7042g;

    /* renamed from: h, reason: collision with root package name */
    public final f2 f7043h;

    /* renamed from: i, reason: collision with root package name */
    public final long f7044i;
    public final U5.p0 j;

    /* renamed from: k, reason: collision with root package name */
    public final D3.p f7045k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7046l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7047m;

    /* renamed from: n, reason: collision with root package name */
    public Executor f7048n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f7049o;

    /* renamed from: p, reason: collision with root package name */
    public final S1 f7050p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7051q;

    /* renamed from: r, reason: collision with root package name */
    public AbstractC0438e f7052r;

    static {
        Logger logger = Logger.getLogger(T.class.getName());
        f7030s = logger;
        f7031t = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f7032u = Boolean.parseBoolean(property);
        f7033v = Boolean.parseBoolean(property2);
        f7034w = Boolean.parseBoolean(property3);
        try {
            try {
                try {
                    if (Class.forName("W5.t0", true, T.class.getClassLoader()).asSubclass(S.class).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (Exception e7) {
                    logger.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e7);
                }
            } catch (Exception e8) {
                logger.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e8);
            }
        } catch (ClassCastException e9) {
            logger.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e9);
        } catch (ClassNotFoundException e10) {
            logger.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e10);
        }
    }

    public T(String str, U5.d0 d0Var, f2 f2Var, D3.p pVar, boolean z4) {
        p3.f.k(d0Var, "args");
        this.f7043h = f2Var;
        p3.f.k(str, "name");
        URI create = URI.create("//".concat(str));
        p3.f.h(create.getHost() != null, "Invalid DNS name: %s", str);
        String authority = create.getAuthority();
        if (authority == null) {
            throw new NullPointerException(P6.b.z("nameUri (%s) doesn't have an authority", create));
        }
        this.f7040e = authority;
        this.f7041f = create.getHost();
        if (create.getPort() == -1) {
            this.f7042g = d0Var.f6482a;
        } else {
            this.f7042g = create.getPort();
        }
        C0542t1 c0542t1 = d0Var.f6483b;
        p3.f.k(c0542t1, "proxyDetector");
        this.f7036a = c0542t1;
        long j = 0;
        if (!z4) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j3 = 30;
            if (property != null) {
                try {
                    j3 = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    f7030s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            j = j3 > 0 ? TimeUnit.SECONDS.toNanos(j3) : j3;
        }
        this.f7044i = j;
        this.f7045k = pVar;
        U5.p0 p0Var = d0Var.f6484c;
        p3.f.k(p0Var, "syncContext");
        this.j = p0Var;
        H0 h02 = d0Var.f6488g;
        this.f7048n = h02;
        this.f7049o = h02 == null;
        S1 s12 = d0Var.f6485d;
        p3.f.k(s12, "serviceConfigParser");
        this.f7050p = s12;
    }

    public static Map r(Map map, Random random, String str) {
        for (Map.Entry entry : map.entrySet()) {
            Q0.a.b0(f7031t.contains(entry.getKey()), "Bad key: %s", entry);
        }
        List d7 = AbstractC0547v0.d("clientLanguage", map);
        if (d7 != null && !d7.isEmpty()) {
            Iterator it = d7.iterator();
            while (it.hasNext()) {
                if (SentryBaseEvent.DEFAULT_PLATFORM.equalsIgnoreCase((String) it.next())) {
                }
            }
            return null;
        }
        Double e7 = AbstractC0547v0.e("percentage", map);
        if (e7 != null) {
            int intValue = e7.intValue();
            Q0.a.b0(intValue >= 0 && intValue <= 100, "Bad percentage: %s", e7);
            if (random.nextInt(100) >= intValue) {
                return null;
            }
        }
        List d8 = AbstractC0547v0.d("clientHostname", map);
        if (d8 != null && !d8.isEmpty()) {
            Iterator it2 = d8.iterator();
            while (it2.hasNext()) {
                if (((String) it2.next()).equals(str)) {
                }
            }
            return null;
        }
        Map g3 = AbstractC0547v0.g("serviceConfig", map);
        if (g3 != null) {
            return g3;
        }
        throw new A1.W(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    public static ArrayList s(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("grpc_config=")) {
                String substring = str.substring(12);
                Logger logger = AbstractC0544u0.f7377a;
                Z4.a aVar = new Z4.a(new StringReader(substring));
                try {
                    Object a2 = AbstractC0544u0.a(aVar);
                    if (!(a2 instanceof List)) {
                        throw new ClassCastException("wrong type " + a2);
                    }
                    List list2 = (List) a2;
                    AbstractC0547v0.a(list2);
                    arrayList.addAll(list2);
                } finally {
                    try {
                        aVar.close();
                    } catch (IOException e7) {
                        logger.log(Level.WARNING, "Failed to close", (Throwable) e7);
                    }
                }
            } else {
                f7030s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    @Override // U5.AbstractC0457y
    public final String f() {
        return this.f7040e;
    }

    @Override // U5.AbstractC0457y
    public final void k() {
        p3.f.q("not started", this.f7052r != null);
        t();
    }

    @Override // U5.AbstractC0457y
    public final void m() {
        if (this.f7047m) {
            return;
        }
        this.f7047m = true;
        Executor executor = this.f7048n;
        if (executor == null || !this.f7049o) {
            return;
        }
        c2.b(this.f7043h, executor);
        this.f7048n = null;
    }

    @Override // U5.AbstractC0457y
    public final void n(AbstractC0438e abstractC0438e) {
        p3.f.q("already started", this.f7052r == null);
        if (this.f7049o) {
            this.f7048n = (Executor) c2.a(this.f7043h);
        }
        this.f7052r = abstractC0438e;
        t();
    }

    public final C1726n0 q() {
        U5.e0 e0Var;
        U5.e0 e0Var2;
        List u4;
        U5.e0 e0Var3;
        String str = this.f7041f;
        C1726n0 c1726n0 = new C1726n0(14);
        try {
            c1726n0.f17806c = u();
            if (f7034w) {
                List emptyList = Collections.emptyList();
                boolean z4 = false;
                if (f7032u) {
                    if ("localhost".equalsIgnoreCase(str)) {
                        z4 = f7033v;
                    } else if (!str.contains(":")) {
                        boolean z7 = true;
                        for (int i7 = 0; i7 < str.length(); i7++) {
                            char charAt = str.charAt(i7);
                            if (charAt != '.') {
                                z7 &= charAt >= '0' && charAt <= '9';
                            }
                        }
                        z4 = !z7;
                    }
                }
                if (z4 && this.f7039d.get() != null) {
                    throw new ClassCastException();
                }
                Object obj = null;
                if (emptyList.isEmpty()) {
                    f7030s.log(Level.FINE, "No TXT records found for {0}", new Object[]{str});
                } else {
                    Random random = this.f7037b;
                    if (f7035x == null) {
                        try {
                            f7035x = InetAddress.getLocalHost().getHostName();
                        } catch (UnknownHostException e7) {
                            throw new RuntimeException(e7);
                        }
                    }
                    String str2 = f7035x;
                    try {
                        Iterator it = s(emptyList).iterator();
                        Map map = null;
                        while (it.hasNext()) {
                            try {
                                map = r((Map) it.next(), random, str2);
                                if (map != null) {
                                    break;
                                }
                            } catch (RuntimeException e8) {
                                e0Var = new U5.e0(U5.l0.f6538g.g("failed to pick service config choice").f(e8));
                            }
                        }
                        e0Var = map == null ? null : new U5.e0(map);
                    } catch (IOException | RuntimeException e9) {
                        e0Var = new U5.e0(U5.l0.f6538g.g("failed to parse TXT records").f(e9));
                    }
                    if (e0Var != null) {
                        U5.l0 l0Var = e0Var.f6492a;
                        if (l0Var != null) {
                            obj = new U5.e0(l0Var);
                        } else {
                            Map map2 = (Map) e0Var.f6493b;
                            S1 s12 = this.f7050p;
                            s12.getClass();
                            try {
                                h2 h2Var = (h2) s12.f7029d;
                                h2Var.getClass();
                                if (map2 != null) {
                                    try {
                                        u4 = Z1.u(Z1.p(map2));
                                    } catch (RuntimeException e10) {
                                        e0Var3 = new U5.e0(U5.l0.f6538g.g("can't parse load balancer configuration").f(e10));
                                    }
                                } else {
                                    u4 = null;
                                }
                                e0Var3 = (u4 == null || u4.isEmpty()) ? null : Z1.t(u4, (U5.P) h2Var.f7232b);
                                if (e0Var3 != null) {
                                    U5.l0 l0Var2 = e0Var3.f6492a;
                                    if (l0Var2 != null) {
                                        obj = new U5.e0(l0Var2);
                                    } else {
                                        obj = e0Var3.f6493b;
                                    }
                                }
                                e0Var2 = new U5.e0(W0.a(map2, s12.f7028c, s12.f7026a, s12.f7027b, obj));
                            } catch (RuntimeException e11) {
                                e0Var2 = new U5.e0(U5.l0.f6538g.g("failed to parse service config").f(e11));
                            }
                            obj = e0Var2;
                        }
                    }
                }
                c1726n0.f17807d = obj;
            }
            return c1726n0;
        } catch (Exception e12) {
            c1726n0.f17805b = U5.l0.f6544n.g("Unable to resolve host " + str).f(e12);
            return c1726n0;
        }
    }

    public final void t() {
        if (this.f7051q || this.f7047m) {
            return;
        }
        if (this.f7046l) {
            long j = this.f7044i;
            if (j != 0 && (j <= 0 || this.f7045k.a(TimeUnit.NANOSECONDS) <= j)) {
                return;
            }
        }
        this.f7051q = true;
        this.f7048n.execute(new E(this, this.f7052r));
    }

    public final List u() {
        try {
            try {
                Q q7 = this.f7038c;
                String str = this.f7041f;
                q7.getClass();
                List unmodifiableList = Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
                ArrayList arrayList = new ArrayList(unmodifiableList.size());
                Iterator it = unmodifiableList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C0453u(new InetSocketAddress((InetAddress) it.next(), this.f7042g)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e7) {
                Object obj = D3.r.f1740a;
                if (e7 instanceof RuntimeException) {
                    throw ((RuntimeException) e7);
                }
                throw new RuntimeException(e7);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                f7030s.log(Level.FINE, "Address resolution failure", (Throwable) null);
            }
            throw th;
        }
    }
}
