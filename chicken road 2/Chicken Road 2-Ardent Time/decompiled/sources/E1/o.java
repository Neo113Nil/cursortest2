package E1;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final A1.c f296a;

    static {
        java.lang.String str;
        int i2 = E1.w.f305a;
        java.lang.Object obj = null;
        try {
            str = java.lang.System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (java.lang.SecurityException unused) {
            str = null;
        }
        if (str != null) {
            java.lang.Boolean.parseBoolean(str);
        }
        try {
            java.util.Iterator it = x1.d.F(x1.d.E(java.util.Arrays.asList(new A1.a()).iterator())).iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    int a2 = ((A1.a) obj).a();
                    do {
                        java.lang.Object next = it.next();
                        int a3 = ((A1.a) next).a();
                        if (a2 < a3) {
                            obj = next;
                            a2 = a3;
                        }
                    } while (it.hasNext());
                }
            }
            A1.a aVar = (A1.a) obj;
            if (aVar == null) {
                throw new java.lang.IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            try {
                aVar.getClass();
                android.os.Looper mainLooper = android.os.Looper.getMainLooper();
                if (mainLooper == null) {
                    throw new java.lang.IllegalStateException("The main looper is not available");
                }
                f296a = new A1.c(A1.d.a(mainLooper));
            } catch (java.lang.Throwable th) {
                aVar.getClass();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            throw new java.util.ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
