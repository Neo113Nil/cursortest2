package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class kl0 extends a90 {

    /* JADX INFO: renamed from: E */
    public static final Logger f4410E = Logger.getLogger(kl0.class.getName());

    /* JADX INFO: renamed from: F */
    public static final long f4411F = 1800000;

    /* JADX INFO: renamed from: G */
    public static final long f4412G = 1000;

    /* JADX INFO: renamed from: H */
    public static final jg0 f4413H = new jg0(13, ca0.f1196p);

    /* JADX INFO: renamed from: I */
    public static final C0258gq f4414I = C0258gq.f2843d;

    /* JADX INFO: renamed from: J */
    public static final C0806vk f4415J = C0806vk.f8206b;

    /* JADX INFO: renamed from: K */
    public static final Method f4416K;

    /* JADX INFO: renamed from: A */
    public final boolean f4417A;

    /* JADX INFO: renamed from: B */
    public final boolean f4418B;

    /* JADX INFO: renamed from: C */
    public final an0 f4419C;

    /* JADX INFO: renamed from: D */
    public final jg0 f4420D;

    /* JADX INFO: renamed from: g */
    public final jg0 f4421g;

    /* JADX INFO: renamed from: h */
    public final jg0 f4422h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f4423i;

    /* JADX INFO: renamed from: j */
    public final gr0 f4424j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f4425k;

    /* JADX INFO: renamed from: l */
    public final String f4426l;

    /* JADX INFO: renamed from: m */
    public final String f4427m;

    /* JADX INFO: renamed from: n */
    public final C0258gq f4428n;

    /* JADX INFO: renamed from: o */
    public final C0806vk f4429o;

    /* JADX INFO: renamed from: p */
    public final long f4430p;

    /* JADX INFO: renamed from: q */
    public final int f4431q;

    /* JADX INFO: renamed from: r */
    public final int f4432r;

    /* JADX INFO: renamed from: s */
    public final long f4433s;

    /* JADX INFO: renamed from: t */
    public final long f4434t;

    /* JADX INFO: renamed from: u */
    public final boolean f4435u;

    /* JADX INFO: renamed from: v */
    public final je0 f4436v;

    /* JADX INFO: renamed from: w */
    public final boolean f4437w;

    /* JADX INFO: renamed from: x */
    public final boolean f4438x;

    /* JADX INFO: renamed from: y */
    public final boolean f4439y;

    /* JADX INFO: renamed from: z */
    public final boolean f4440z;

    static {
        Method declaredMethod;
        try {
            Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
            Class cls2 = Boolean.TYPE;
            declaredMethod = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e) {
            f4410E.log(Level.FINE, "Unable to apply census stats", (Throwable) e);
            declaredMethod = null;
        } catch (NoSuchMethodException e2) {
            f4410E.log(Level.FINE, "Unable to apply census stats", (Throwable) e2);
            declaredMethod = null;
        }
        f4416K = declaredMethod;
    }

    public kl0(String str, an0 an0Var, jg0 jg0Var) {
        gr0 gr0Var;
        jg0 jg0Var2 = f4413H;
        this.f4421g = jg0Var2;
        this.f4422h = jg0Var2;
        this.f4423i = new ArrayList();
        Logger logger = gr0.f2858d;
        synchronized (gr0.class) {
            try {
                if (gr0.f2859e == null) {
                    ArrayList arrayList = new ArrayList();
                    try {
                        boolean z = C0446lu.f4909a;
                        arrayList.add(C0446lu.class);
                    } catch (ClassNotFoundException e) {
                        gr0.f2858d.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e);
                    }
                    List<fr0> listM3408j = AbstractC0477mo.m3408j(fr0.class, Collections.unmodifiableList(arrayList), fr0.class.getClassLoader(), new aa0(7));
                    if (listM3408j.isEmpty()) {
                        gr0.f2858d.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                    }
                    gr0.f2859e = new gr0();
                    for (fr0 fr0Var : listM3408j) {
                        gr0.f2858d.fine("Service loader found " + fr0Var);
                        gr0 gr0Var2 = gr0.f2859e;
                        synchronized (gr0Var2) {
                            fr0Var.getClass();
                            gr0Var2.f2861b.add(fr0Var);
                        }
                    }
                    gr0.f2859e.m2141a();
                }
                gr0Var = gr0.f2859e;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4424j = gr0Var;
        this.f4425k = new ArrayList();
        this.f4427m = "pick_first";
        this.f4428n = f4414I;
        this.f4429o = f4415J;
        this.f4430p = f4411F;
        this.f4431q = 5;
        this.f4432r = 5;
        this.f4433s = 16777216L;
        this.f4434t = 1048576L;
        this.f4435u = true;
        this.f4436v = je0.f3913e;
        this.f4437w = true;
        this.f4438x = true;
        this.f4439y = true;
        this.f4440z = true;
        this.f4417A = true;
        this.f4418B = true;
        a90.m127k(str, "target");
        this.f4426l = str;
        this.f4419C = an0Var;
        this.f4420D = jg0Var;
    }

    /* JADX INFO: renamed from: N */
    public final vk0 m3048N() {
        SSLSocketFactory sSLSocketFactory;
        up0 up0Var;
        up0 up0Var2;
        it0 it0Var = (it0) this.f4419C.f254k;
        boolean z = it0Var.f3653n != Long.MAX_VALUE;
        jg0 jg0Var = it0Var.f3648i;
        jg0 jg0Var2 = it0Var.f3649j;
        int i = it0Var.f3652m;
        int iM292o = AbstractC0024an.m292o(i);
        if (iM292o == 0) {
            try {
                if (it0Var.f3650k == null) {
                    it0Var.f3650k = SSLContext.getInstance("Default", fw0.f2510d.f2511a).getSocketFactory();
                }
                sSLSocketFactory = it0Var.f3650k;
            } catch (GeneralSecurityException e) {
                C0270h1.m2189e("TLS Provider failure", e);
                return null;
            }
        } else {
            if (iM292o != 1) {
                throw new RuntimeException("Unknown negotiation type: ".concat(AbstractC0024an.m297t(i)));
            }
            sSLSocketFactory = null;
        }
        ht0 ht0Var = new ht0(jg0Var, jg0Var2, sSLSocketFactory, it0Var.f3651l, it0Var.f3656q, z, it0Var.f3653n, it0Var.f3654o, it0Var.f3655p, it0Var.f3657r, it0Var.f3647h);
        o31 o31Var = new o31(23);
        jg0 jg0Var3 = new jg0(13, ca0.f1196p);
        u90 u90Var = ca0.f1198r;
        ArrayList arrayList = new ArrayList(this.f4423i);
        synchronized (a90.class) {
        }
        if (this.f4438x) {
            Method method = f4416K;
            if (method != null) {
                try {
                    up0Var2 = (up0) method.invoke(null, Boolean.valueOf(this.f4439y), Boolean.valueOf(this.f4440z), Boolean.FALSE, Boolean.valueOf(this.f4417A));
                } catch (IllegalAccessException e2) {
                    f4410E.log(Level.FINE, "Unable to apply census stats", (Throwable) e2);
                    up0Var2 = null;
                } catch (InvocationTargetException e3) {
                    f4410E.log(Level.FINE, "Unable to apply census stats", (Throwable) e3);
                    up0Var2 = null;
                }
            } else {
                up0Var2 = null;
            }
            if (up0Var2 != null) {
                arrayList.add(0, up0Var2);
            }
        }
        if (this.f4418B) {
            try {
                up0Var = (up0) Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getClientInterceptor", null).invoke(null, null);
            } catch (ClassNotFoundException e4) {
                f4410E.log(Level.FINE, "Unable to apply census stats", (Throwable) e4);
                up0Var = null;
            } catch (IllegalAccessException e5) {
                f4410E.log(Level.FINE, "Unable to apply census stats", (Throwable) e5);
                up0Var = null;
            } catch (NoSuchMethodException e6) {
                f4410E.log(Level.FINE, "Unable to apply census stats", (Throwable) e6);
                up0Var = null;
            } catch (InvocationTargetException e7) {
                f4410E.log(Level.FINE, "Unable to apply census stats", (Throwable) e7);
                up0Var = null;
            }
            if (up0Var != null) {
                arrayList.add(0, up0Var);
            }
        }
        return new ml0(new jl0(this, ht0Var, o31Var, jg0Var3, u90Var, arrayList));
    }
}
