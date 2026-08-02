package p000;

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

/* JADX INFO: renamed from: ku */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0409ku extends vt1 {

    /* JADX INFO: renamed from: A */
    public static final Set f4557A;

    /* JADX INFO: renamed from: B */
    public static final boolean f4558B;

    /* JADX INFO: renamed from: C */
    public static final boolean f4559C;

    /* JADX INFO: renamed from: D */
    public static final boolean f4560D;

    /* JADX INFO: renamed from: E */
    public static String f4561E;

    /* JADX INFO: renamed from: z */
    public static final Logger f4562z;

    /* JADX INFO: renamed from: h */
    public final sy0 f4563h;

    /* JADX INFO: renamed from: k */
    public final String f4566k;

    /* JADX INFO: renamed from: l */
    public final String f4567l;

    /* JADX INFO: renamed from: m */
    public final int f4568m;

    /* JADX INFO: renamed from: n */
    public final q71 f4569n;

    /* JADX INFO: renamed from: o */
    public final long f4570o;

    /* JADX INFO: renamed from: p */
    public final gc1 f4571p;

    /* JADX INFO: renamed from: q */
    public final na1 f4572q;

    /* JADX INFO: renamed from: r */
    public boolean f4573r;

    /* JADX INFO: renamed from: s */
    public boolean f4574s;

    /* JADX INFO: renamed from: t */
    public Executor f4575t;

    /* JADX INFO: renamed from: u */
    public final boolean f4576u;

    /* JADX INFO: renamed from: v */
    public final z41 f4577v;

    /* JADX INFO: renamed from: w */
    public boolean f4578w;

    /* JADX INFO: renamed from: x */
    public wo1 f4579x;

    /* JADX INFO: renamed from: i */
    public final Random f4564i = new Random();

    /* JADX INFO: renamed from: y */
    public volatile int f4580y = 1;

    /* JADX INFO: renamed from: j */
    public final AtomicReference f4565j = new AtomicReference();

    static {
        Logger logger = Logger.getLogger(C0409ku.class.getName());
        f4562z = logger;
        f4557A = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f4558B = Boolean.parseBoolean(property);
        f4559C = Boolean.parseBoolean(property2);
        f4560D = Boolean.parseBoolean(property3);
        try {
            try {
                try {
                    if (Class.forName("zf0", true, C0409ku.class.getClassLoader()).asSubclass(zf0.class).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (Exception e) {
                    logger.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e);
                }
            } catch (Exception e2) {
                logger.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e2);
            }
        } catch (ClassCastException e3) {
            logger.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e3);
        } catch (ClassNotFoundException e4) {
            logger.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e4);
        }
    }

    public C0409ku(String str, cr0 cr0Var, q71 q71Var, na1 na1Var, boolean z) {
        a90.m127k(cr0Var, "args");
        this.f4569n = q71Var;
        URI uriCreate = URI.create("//".concat(str));
        a90.m121e(str, "Invalid DNS name: %s", uriCreate.getHost() != null);
        String authority = uriCreate.getAuthority();
        a90.m126j(authority, uriCreate, "nameUri (%s) doesn't have an authority");
        this.f4566k = authority;
        this.f4567l = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.f4568m = cr0Var.f1434a;
        } else {
            this.f4568m = uriCreate.getPort();
        }
        sy0 sy0Var = cr0Var.f1435b;
        a90.m127k(sy0Var, "proxyDetector");
        this.f4563h = sy0Var;
        long nanos = 0;
        if (!z) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j = 30;
            if (property != null) {
                try {
                    j = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    f4562z.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            nanos = j > 0 ? TimeUnit.SECONDS.toNanos(j) : j;
        }
        this.f4570o = nanos;
        this.f4572q = na1Var;
        gc1 gc1Var = cr0Var.f1436c;
        a90.m127k(gc1Var, "syncContext");
        this.f4571p = gc1Var;
        bl0 bl0Var = cr0Var.f1440g;
        this.f4575t = bl0Var;
        this.f4576u = bl0Var == null;
        z41 z41Var = cr0Var.f1437d;
        a90.m127k(z41Var, "serviceConfigParser");
        this.f4577v = z41Var;
    }

    /* JADX INFO: renamed from: r */
    public static Map m3088r(Map map, Random random, String str) {
        for (Map.Entry entry : map.entrySet()) {
            AbstractC0959zp.m5972A(entry, "Bad key: %s", f4557A.contains(entry.getKey()));
        }
        List listM5384i = wo1.m5384i("clientLanguage", map);
        if (listM5384i != null && !listM5384i.isEmpty()) {
            Iterator it = listM5384i.iterator();
            while (it.hasNext()) {
                if ("java".equalsIgnoreCase((String) it.next())) {
                }
            }
            return null;
        }
        Double dM5385j = wo1.m5385j("percentage", map);
        if (dM5385j != null) {
            int iIntValue = dM5385j.intValue();
            AbstractC0959zp.m5972A(dM5385j, "Bad percentage: %s", iIntValue >= 0 && iIntValue <= 100);
            if (random.nextInt(100) >= iIntValue) {
                return null;
            }
        }
        List listM5384i2 = wo1.m5384i("clientHostname", map);
        if (listM5384i2 != null && !listM5384i2.isEmpty()) {
            Iterator it2 = listM5384i2.iterator();
            while (it2.hasNext()) {
                if (((String) it2.next()).equals(str)) {
                }
            }
            return null;
        }
        Map mapM5387l = wo1.m5387l("serviceConfig", map);
        if (mapM5387l != null) {
            return mapM5387l;
        }
        throw new C0694sj(String.format("key '%s' missing in '%s'", map, "serviceConfig"), 8);
    }

    /* JADX INFO: renamed from: s */
    public static ArrayList m3089s() {
        List<String> list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.startsWith("grpc_config=")) {
                String strSubstring = str.substring(12);
                Logger logger = og0.f5723a;
                pg0 pg0Var = new pg0(new StringReader(strSubstring));
                try {
                    Object objM3691a = og0.m3691a(pg0Var);
                    try {
                        pg0Var.close();
                    } catch (IOException e) {
                        logger.log(Level.WARNING, "Failed to close", (Throwable) e);
                    }
                    if (!(objM3691a instanceof List)) {
                        throw new ClassCastException("wrong type " + objM3691a);
                    }
                    List list2 = (List) objM3691a;
                    wo1.m5379d(list2);
                    arrayList.addAll(list2);
                } catch (Throwable th) {
                    try {
                        pg0Var.close();
                    } catch (IOException e2) {
                        logger.log(Level.WARNING, "Failed to close", (Throwable) e2);
                    }
                    throw th;
                }
            } else {
                f4562z.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    @Override // p000.vt1
    /* JADX INFO: renamed from: d */
    public final String mo3090d() {
        return this.f4566k;
    }

    @Override // p000.vt1
    /* JADX INFO: renamed from: i */
    public final void mo3091i() {
        a90.m132p("not started", this.f4579x != null);
        m3095t();
    }

    @Override // p000.vt1
    /* JADX INFO: renamed from: k */
    public final void mo3092k() {
        if (this.f4574s) {
            return;
        }
        this.f4574s = true;
        Executor executor = this.f4575t;
        if (executor == null || !this.f4576u) {
            return;
        }
        r71.m4274b(this.f4569n, executor);
        this.f4575t = null;
    }

    @Override // p000.vt1
    /* JADX INFO: renamed from: l */
    public final void mo3093l(wo1 wo1Var) {
        a90.m132p("already started", this.f4579x == null);
        if (this.f4576u) {
            this.f4575t = (Executor) r71.m4273a(this.f4569n);
        }
        this.f4579x = wo1Var;
        m3095t();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: q */
    public final qd0 m3094q() {
        boolean z;
        dr0 dr0Var;
        dr0 dr0Var2;
        List listM1116q;
        dr0 dr0Var3;
        String str = this.f4567l;
        qd0 qd0Var = new qd0(14);
        try {
            qd0Var.f6472l = m3096u();
            if (!f4560D) {
                return qd0Var;
            }
            List list = Collections.EMPTY_LIST;
            int i = 0;
            if (!f4558B) {
                z = false;
            } else if ("localhost".equalsIgnoreCase(str)) {
                z = f4559C;
            } else if (str.contains(":")) {
                z = false;
            } else {
                boolean z2 = true;
                for (int i2 = 0; i2 < str.length(); i2++) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt != '.') {
                        z2 &= cCharAt >= '0' && cCharAt <= '9';
                    }
                }
                z = true ^ z2;
            }
            Object dr0Var4 = null;
            if (z && this.f4565j.get() != null) {
                dd0.m1158c();
                return null;
            }
            if (list.isEmpty()) {
                f4562z.log(Level.FINE, "No TXT records found for {0}", new Object[]{str});
            } else {
                Random random = this.f4564i;
                if (f4561E == null) {
                    try {
                        f4561E = InetAddress.getLocalHost().getHostName();
                    } catch (UnknownHostException e) {
                        dd0.m1163h(e);
                        return null;
                    }
                }
                String str2 = f4561E;
                try {
                    ArrayList arrayListM3089s = m3089s();
                    int size = arrayListM3089s.size();
                    Map mapM3088r = null;
                    while (i < size) {
                        Object obj = arrayListM3089s.get(i);
                        i++;
                        try {
                            mapM3088r = m3088r((Map) obj, random, str2);
                            if (mapM3088r != null) {
                                break;
                            }
                        } catch (RuntimeException e2) {
                            dr0Var = new dr0(ja1.f3877g.m2840h("failed to pick service config choice").m2839g(e2));
                        }
                    }
                    dr0Var = mapM3088r == null ? null : new dr0(mapM3088r);
                } catch (IOException | RuntimeException e3) {
                    dr0Var = new dr0(ja1.f3877g.m2840h("failed to parse TXT records").m2839g(e3));
                }
                if (dr0Var != null) {
                    ja1 ja1Var = dr0Var.f1802a;
                    if (ja1Var != null) {
                        dr0Var4 = new dr0(ja1Var);
                    } else {
                        Map map = (Map) dr0Var.f1803b;
                        z41 z41Var = this.f4577v;
                        z41Var.getClass();
                        try {
                            C0312i6 c0312i6 = z41Var.f9604d;
                            c0312i6.getClass();
                            if (map != null) {
                                try {
                                    listM1116q = d71.m1116q(d71.m1110e(map));
                                } catch (RuntimeException e4) {
                                    dr0Var3 = new dr0(ja1.f3877g.m2840h("can't parse load balancer configuration").m2839g(e4));
                                }
                            } else {
                                listM1116q = null;
                            }
                            dr0Var3 = (listM1116q == null || listM1116q.isEmpty()) ? null : d71.m1114o(listM1116q, (oj0) c0312i6.f3447k);
                            if (dr0Var3 != null) {
                                ja1 ja1Var2 = dr0Var3.f1802a;
                                if (ja1Var2 != null) {
                                    dr0Var4 = new dr0(ja1Var2);
                                } else {
                                    dr0Var4 = dr0Var3.f1803b;
                                }
                            }
                            dr0Var2 = new dr0(sl0.m4534a(map, z41Var.f9601a, z41Var.f9602b, z41Var.f9603c, dr0Var4));
                        } catch (RuntimeException e5) {
                            dr0Var2 = new dr0(ja1.f3877g.m2840h("failed to parse service config").m2839g(e5));
                        }
                        dr0Var4 = dr0Var2;
                    }
                }
            }
            qd0Var.f6473m = dr0Var4;
            return qd0Var;
        } catch (Exception e6) {
            qd0Var.f6471k = ja1.f3883m.m2840h("Unable to resolve host " + str).m2839g(e6);
            return qd0Var;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m3095t() {
        if (this.f4578w || this.f4574s) {
            return;
        }
        if (this.f4573r) {
            long j = this.f4570o;
            if (j != 0 && (j <= 0 || this.f4572q.m3509a() <= j)) {
                return;
            }
        }
        this.f4578w = true;
        this.f4575t.execute(new RunnableC0529o2(this, this.f4579x));
    }

    /* JADX INFO: renamed from: u */
    public final List m3096u() {
        try {
            try {
                int i = this.f4580y;
                String str = this.f4567l;
                if (i == 0) {
                    throw null;
                }
                List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
                ArrayList arrayList = new ArrayList(listUnmodifiableList.size());
                Iterator it = listUnmodifiableList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C0190ex(new InetSocketAddress((InetAddress) it.next(), this.f4568m)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e) {
                Object obj = fd1.f2380a;
                if (e instanceof RuntimeException) {
                    throw ((RuntimeException) e);
                }
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                f4562z.log(Level.FINE, "Address resolution failure", (Throwable) null);
            }
            throw th;
        }
    }
}
