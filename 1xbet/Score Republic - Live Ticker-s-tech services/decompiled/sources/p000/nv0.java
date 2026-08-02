package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nv0 {

    /* JADX INFO: renamed from: a */
    public static final vc0 f5555a;

    static {
        Object obj;
        Class<?> cls;
        vc0 vc0Var;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (Throwable th) {
            obj = th;
            cls = null;
        }
        if (cls != null) {
            try {
                vc0Var = (vc0) cls.asSubclass(vc0.class).getConstructor(nc1.class).newInstance(vc0.f8173a);
            } catch (Throwable th2) {
                obj = th2;
                vc0Var = null;
            }
        } else {
            vc0Var = null;
        }
        if (vc0Var != null) {
            f5555a = vc0Var;
        } else {
            f5555a = new vc0();
        }
        if (obj != null) {
            try {
                if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                    Class<?> cls2 = Class.forName("java.util.logging.Logger");
                    Object objInvoke = cls2.getMethod("getLogger", String.class).invoke(null, nv0.class.getName());
                    Class<?> cls3 = Class.forName("java.util.logging.Level");
                    cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(objInvoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3595a() {
        f5555a.getClass();
    }

    /* JADX INFO: renamed from: b */
    public static void m3596b() {
        f5555a.getClass();
    }

    /* JADX INFO: renamed from: c */
    public static void m3597c() {
        f5555a.getClass();
    }
}
