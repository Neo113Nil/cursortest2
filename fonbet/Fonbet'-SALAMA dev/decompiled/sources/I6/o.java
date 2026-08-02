package I6;

import D6.t0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes2.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final t0 f3752a;

    static {
        String str;
        int i7 = w.f3761a;
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
            Iterator it = Arrays.asList(new E6.a()).iterator();
            t6.h.e(it, "<this>");
            List K02 = B6.d.K0(new B6.a(new B6.e(it, 1)));
            Iterator it2 = K02.iterator();
            if (it2.hasNext()) {
                obj = it2.next();
                if (it2.hasNext()) {
                    int b7 = ((E6.a) obj).b();
                    do {
                        Object next = it2.next();
                        int b8 = ((E6.a) next).b();
                        if (b7 < b8) {
                            obj = next;
                            b7 = b8;
                        }
                    } while (it2.hasNext());
                }
            }
            E6.a aVar = (E6.a) obj;
            if (aVar != null) {
                try {
                    t0 a2 = aVar.a(K02);
                    if (a2 != null) {
                        f3752a = a2;
                        return;
                    }
                } catch (Throwable th) {
                    aVar.c();
                    throw th;
                }
            }
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
