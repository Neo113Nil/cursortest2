package I4;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final E4.e f1316a;

    static {
        String str;
        int i2 = w.f1325a;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = A4.g.P(A4.g.N(Arrays.asList(new E4.a()).iterator())).iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    int a6 = ((E4.a) obj).a();
                    do {
                        Object next = it.next();
                        int a7 = ((E4.a) next).a();
                        if (a6 < a7) {
                            obj = next;
                            a6 = a7;
                        }
                    } while (it.hasNext());
                }
            }
            E4.a aVar = (E4.a) obj;
            if (aVar == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            try {
                aVar.getClass();
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper == null) {
                    throw new IllegalStateException("The main looper is not available");
                }
                f1316a = new E4.e(E4.f.a(mainLooper));
            } catch (Throwable th) {
                aVar.getClass();
                throw th;
            }
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
