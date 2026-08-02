package e6;

/* renamed from: e6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1053b {

    /* renamed from: a, reason: collision with root package name */
    public static final C1052a f12736a;

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    static {
        Object obj;
        Class<?> cls;
        C1052a c1052a;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (Throwable th) {
            obj = th;
            cls = null;
        }
        if (cls != null) {
            try {
                c1052a = (C1052a) cls.asSubclass(C1052a.class).getConstructor(C1054c.class).newInstance(C1052a.f12734a);
            } catch (Throwable th2) {
                obj = th2;
            }
            if (c1052a == null) {
                f12736a = c1052a;
            } else {
                f12736a = new C1052a();
            }
            if (obj == null) {
                try {
                    if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                        Class<?> cls2 = Class.forName("java.util.logging.Logger");
                        Object invoke = cls2.getMethod("getLogger", String.class).invoke(null, AbstractC1053b.class.getName());
                        Class<?> cls3 = Class.forName("java.util.logging.Level");
                        cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(invoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            return;
        }
        c1052a = null;
        if (c1052a == null) {
        }
        if (obj == null) {
        }
    }

    public static void a() {
        f12736a.getClass();
    }

    public static void b() {
        f12736a.getClass();
    }

    public static void c() {
        f12736a.getClass();
    }
}
