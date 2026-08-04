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
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes2.dex */
public final class T extends AbstractC0457y {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Logger f7030s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Set f7031t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final boolean f7032u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f7033v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final boolean f7034w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static String f7035x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0542t1 f7036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Random f7037b = new Random();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Q f7038c = Q.f6920a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f7039d = new AtomicReference();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f2 f7043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f7044i;
    public final U5.p0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final D3.p f7045k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7046l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f7047m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Executor f7048n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f7049o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final S1 f7050p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f7051q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
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
        p113p3.f.k(d0Var, "args");
        this.f7043h = f2Var;
        p113p3.f.k(str, "name");
        URI uriCreate = URI.create("//".concat(str));
        p113p3.f.h(uriCreate.getHost() != null, "Invalid DNS name: %s", str);
        String authority = uriCreate.getAuthority();
        if (authority == null) {
            throw new NullPointerException(P6.b.z("nameUri (%s) doesn't have an authority", uriCreate));
        }
        this.f7040e = authority;
        this.f7041f = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.f7042g = d0Var.f6482a;
        } else {
            this.f7042g = uriCreate.getPort();
        }
        C0542t1 c0542t1 = d0Var.f6483b;
        p113p3.f.k(c0542t1, "proxyDetector");
        this.f7036a = c0542t1;
        long nanos = 0;
        if (!z4) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j = 30;
            if (property != null) {
                try {
                    j = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    f7030s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            nanos = j > 0 ? TimeUnit.SECONDS.toNanos(j) : j;
        }
        this.f7044i = nanos;
        this.f7045k = pVar;
        U5.p0 p0Var = d0Var.f6484c;
        p113p3.f.k(p0Var, "syncContext");
        this.j = p0Var;
        H0 h6 = d0Var.f6488g;
        this.f7048n = h6;
        this.f7049o = h6 == null;
        S1 s7 = d0Var.f6485d;
        p113p3.f.k(s7, "serviceConfigParser");
        this.f7050p = s7;
    }

    public static Map r(Map map, Random random, String str) {
        for (Map.Entry entry : map.entrySet()) {
            Q0.a.b0(f7031t.contains(entry.getKey()), "Bad key: %s", entry);
        }
        List listD = AbstractC0547v0.d("clientLanguage", map);
        if (listD != null && !listD.isEmpty()) {
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                if (SentryBaseEvent.DEFAULT_PLATFORM.equalsIgnoreCase((String) it.next())) {
                }
            }
            return null;
        }
        Double dE = AbstractC0547v0.e("percentage", map);
        if (dE != null) {
            int iIntValue = dE.intValue();
            Q0.a.b0(iIntValue >= 0 && iIntValue <= 100, "Bad percentage: %s", dE);
            if (random.nextInt(100) >= iIntValue) {
                return null;
            }
        }
        List listD2 = AbstractC0547v0.d("clientHostname", map);
        if (listD2 != null && !listD2.isEmpty()) {
            Iterator it2 = listD2.iterator();
            while (it2.hasNext()) {
                if (((String) it2.next()).equals(str)) {
                }
            }
            return null;
        }
        Map mapG = AbstractC0547v0.g("serviceConfig", map);
        if (mapG != null) {
            return mapG;
        }
        throw new A1.W(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    public static ArrayList s(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("grpc_config=")) {
                String strSubstring = str.substring(12);
                Logger logger = AbstractC0544u0.f7377a;
                Z4.a aVar = new Z4.a(new StringReader(strSubstring));
                try {
                    Object objA = AbstractC0544u0.a(aVar);
                    try {
                        aVar.close();
                    } catch (IOException e7) {
                        logger.log(Level.WARNING, "Failed to close", (Throwable) e7);
                    }
                    if (!(objA instanceof List)) {
                        throw new ClassCastException("wrong type " + objA);
                    }
                    List list2 = (List) objA;
                    AbstractC0547v0.a(list2);
                    arrayList.addAll(list2);
                } catch (Throwable th) {
                    try {
                        aVar.close();
                    } catch (IOException e8) {
                        logger.log(Level.WARNING, "Failed to close", (Throwable) e8);
                    }
                    throw th;
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
        p113p3.f.q("not started", this.f7052r != null);
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
        p113p3.f.q("already started", this.f7052r == null);
        if (this.f7049o) {
            this.f7048n = (Executor) c2.a(this.f7043h);
        }
        this.f7052r = abstractC0438e;
        t();
    }

    public final C1017n0 q() {
        U5.e0 e0Var;
        U5.e0 e0Var2;
        List listU;
        U5.e0 e0Var3;
        String str = this.f7041f;
        C1017n0 c1017n0 = new C1017n0(14);
        try {
            c1017n0.f17812c = u();
            if (f7034w) {
                List listEmptyList = Collections.emptyList();
                boolean z4 = false;
                if (f7032u) {
                    if ("localhost".equalsIgnoreCase(str)) {
                        z4 = f7033v;
                    } else if (!str.contains(":")) {
                        boolean z7 = true;
                        for (int i7 = 0; i7 < str.length(); i7++) {
                            char cCharAt = str.charAt(i7);
                            if (cCharAt != '.') {
                                z7 &= cCharAt >= '0' && cCharAt <= '9';
                            }
                        }
                        z4 = !z7;
                    }
                }
                if (z4 && this.f7039d.get() != null) {
                    throw new ClassCastException();
                }
                Object e0Var4 = null;
                if (listEmptyList.isEmpty()) {
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
                        Iterator it = s(listEmptyList).iterator();
                        Map mapR = null;
                        while (it.hasNext()) {
                            try {
                                mapR = r((Map) it.next(), random, str2);
                                if (mapR != null) {
                                    break;
                                }
                            } catch (RuntimeException e8) {
                                e0Var = new U5.e0(U5.l0.f6538g.g("failed to pick service config choice").f(e8));
                            }
                        }
                        e0Var = mapR == null ? null : new U5.e0(mapR);
                    } catch (IOException | RuntimeException e9) {
                        e0Var = new U5.e0(U5.l0.f6538g.g("failed to parse TXT records").f(e9));
                    }
                    if (e0Var != null) {
                        U5.l0 l0Var = e0Var.f6492a;
                        if (l0Var != null) {
                            e0Var4 = new U5.e0(l0Var);
                        } else {
                            Map map = (Map) e0Var.f6493b;
                            S1 s7 = this.f7050p;
                            s7.getClass();
                            try {
                                h2 h2Var = (h2) s7.f7029d;
                                h2Var.getClass();
                                if (map != null) {
                                    try {
                                        listU = Z1.u(Z1.p(map));
                                    } catch (RuntimeException e10) {
                                        e0Var3 = new U5.e0(U5.l0.f6538g.g("can't parse load balancer configuration").f(e10));
                                    }
                                } else {
                                    listU = null;
                                }
                                e0Var3 = (listU == null || listU.isEmpty()) ? null : Z1.t(listU, (U5.P) h2Var.f7232b);
                                if (e0Var3 != null) {
                                    U5.l0 l0Var2 = e0Var3.f6492a;
                                    if (l0Var2 != null) {
                                        e0Var4 = new U5.e0(l0Var2);
                                    } else {
                                        e0Var4 = e0Var3.f6493b;
                                    }
                                }
                                e0Var2 = new U5.e0(W0.a(map, s7.f7028c, s7.f7026a, s7.f7027b, e0Var4));
                            } catch (RuntimeException e11) {
                                e0Var2 = new U5.e0(U5.l0.f6538g.g("failed to parse service config").f(e11));
                            }
                            e0Var4 = e0Var2;
                        }
                    }
                }
                c1017n0.f17813d = e0Var4;
            }
            return c1017n0;
        } catch (Exception e12) {
            c1017n0.f17811b = U5.l0.f6544n.g("Unable to resolve host " + str).f(e12);
            return c1017n0;
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
                List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
                ArrayList arrayList = new ArrayList(listUnmodifiableList.size());
                Iterator it = listUnmodifiableList.iterator();
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
