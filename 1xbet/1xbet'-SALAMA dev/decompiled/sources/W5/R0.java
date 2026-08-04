package W5;

import U5.AbstractC0438e;
import U5.AbstractC0457y;
import U5.C0443j;
import U5.C0445l;
import U5.C0452t;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import p155w1.C1052y0;

/* JADX INFO: loaded from: classes2.dex */
public final class R0 extends U5.S {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Method f6989E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1052y0 f6992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1052y0 f6993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f6994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final U5.h0 f6995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f6996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0452t f6999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0445l f7000i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f7001k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f7002l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f7003m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f7004n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f7005o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final U5.C f7006p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f7007q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f7008r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f7009s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f7010t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f7011u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f7012v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final A1.x0 f7013w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final R4.c f7014x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Logger f6990y = Logger.getLogger(R0.class.getName());

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final long f6991z = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final long f6985A = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final C1052y0 f6986B = new C1052y0(AbstractC0494d0.f7177p, 11);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final C0452t f6987C = C0452t.f6588d;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final C0445l f6988D = C0445l.f6533b;

    static {
        Method declaredMethod;
        try {
            Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
            Class cls2 = Boolean.TYPE;
            declaredMethod = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e7) {
            f6990y.log(Level.FINE, "Unable to apply census stats", (Throwable) e7);
            declaredMethod = null;
        } catch (NoSuchMethodException e8) {
            f6990y.log(Level.FINE, "Unable to apply census stats", (Throwable) e8);
            declaredMethod = null;
        }
        f6989E = declaredMethod;
    }

    public R0(String str, A1.x0 x0Var, R4.c cVar) {
        U5.h0 h0Var;
        C1052y0 c1052y0 = f6986B;
        this.f6992a = c1052y0;
        this.f6993b = c1052y0;
        this.f6994c = new ArrayList();
        Logger logger = U5.h0.f6501d;
        synchronized (U5.h0.class) {
            try {
                if (U5.h0.f6502e == null) {
                    ArrayList arrayList = new ArrayList();
                    try {
                        boolean z4 = U.f7060a;
                        arrayList.add(U.class);
                    } catch (ClassNotFoundException e7) {
                        U5.h0.f6501d.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e7);
                    }
                    List<U5.g0> listK = AbstractC0438e.k(U5.g0.class, Collections.unmodifiableList(arrayList), U5.g0.class.getClassLoader(), new C0443j(9));
                    if (listK.isEmpty()) {
                        U5.h0.f6501d.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                    }
                    U5.h0.f6502e = new U5.h0();
                    for (U5.g0 g0Var : listK) {
                        U5.h0.f6501d.fine("Service loader found " + g0Var);
                        U5.h0 h0Var2 = U5.h0.f6502e;
                        synchronized (h0Var2) {
                            p113p3.f.d("isAvailable() returned false", g0Var.b());
                            h0Var2.f6504b.add(g0Var);
                        }
                    }
                    U5.h0.f6502e.a();
                }
                h0Var = U5.h0.f6502e;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f6995d = h0Var;
        this.f6996e = new ArrayList();
        this.f6998g = "pick_first";
        this.f6999h = f6987C;
        this.f7000i = f6988D;
        this.j = f6991z;
        this.f7001k = 5;
        this.f7002l = 5;
        this.f7003m = 16777216L;
        this.f7004n = 1048576L;
        this.f7005o = true;
        this.f7006p = U5.C.f6412e;
        this.f7007q = true;
        this.f7008r = true;
        this.f7009s = true;
        this.f7010t = true;
        this.f7011u = true;
        this.f7012v = true;
        p113p3.f.k(str, "target");
        this.f6997f = str;
        this.f7013w = x0Var;
        this.f7014x = cVar;
    }

    @Override // U5.S
    public final U5.Q a() {
        SSLSocketFactory sSLSocketFactory;
        Method method;
        X5.g gVar = (X5.g) this.f7013w.f613b;
        boolean z4 = gVar.f7530h != Long.MAX_VALUE;
        int iE = p136t.e.e(gVar.f7529g);
        if (iE == 0) {
            try {
                if (gVar.f7527e == null) {
                    gVar.f7527e = SSLContext.getInstance("Default", Y5.j.f7803d.f7804a).getSocketFactory();
                }
                sSLSocketFactory = gVar.f7527e;
            } catch (GeneralSecurityException e7) {
                throw new RuntimeException("TLS Provider failure", e7);
            }
        } else {
            if (iE != 1) {
                throw new RuntimeException("Unknown negotiation type: ".concat(AbstractC0486a1.u(gVar.f7529g)));
            }
            sSLSocketFactory = null;
        }
        X5.f fVar = new X5.f(gVar.f7525c, gVar.f7526d, sSLSocketFactory, gVar.f7528f, gVar.f7532k, z4, gVar.f7530h, gVar.f7531i, gVar.j, gVar.f7533l, gVar.f7524b);
        f2 f2Var = new f2(7);
        C1052y0 c1052y0 = new C1052y0(AbstractC0494d0.f7177p, 11);
        f2 f2Var2 = AbstractC0494d0.f7179r;
        ArrayList arrayList = new ArrayList(this.f6994c);
        synchronized (AbstractC0457y.class) {
        }
        if (this.f7008r && (method = f6989E) != null) {
            try {
                if (method.invoke(null, Boolean.valueOf(this.f7009s), Boolean.valueOf(this.f7010t), Boolean.FALSE, Boolean.valueOf(this.f7011u)) != null) {
                    throw new ClassCastException();
                }
            } catch (IllegalAccessException e8) {
                f6990y.log(Level.FINE, "Unable to apply census stats", (Throwable) e8);
            } catch (InvocationTargetException e9) {
                f6990y.log(Level.FINE, "Unable to apply census stats", (Throwable) e9);
            }
        }
        if (this.f7012v) {
            try {
                if (Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getClientInterceptor", null).invoke(null, null) != null) {
                    throw new ClassCastException();
                }
            } catch (ClassNotFoundException e10) {
                f6990y.log(Level.FINE, "Unable to apply census stats", (Throwable) e10);
            } catch (IllegalAccessException e11) {
                f6990y.log(Level.FINE, "Unable to apply census stats", (Throwable) e11);
            } catch (NoSuchMethodException e12) {
                f6990y.log(Level.FINE, "Unable to apply census stats", (Throwable) e12);
            } catch (InvocationTargetException e13) {
                f6990y.log(Level.FINE, "Unable to apply census stats", (Throwable) e13);
            }
        }
        return new T0(new Q0(this, fVar, f2Var, c1052y0, f2Var2, arrayList));
    }
}
