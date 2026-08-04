package I6;

import D6.t0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t0 f3752a;

    static {
        String property;
        int i7 = w.f3761a;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            Iterator it = Arrays.asList(new E6.a()).iterator();
            t6.h.e(it, "<this>");
            List listK0 = B6.d.K0(new B6.a(new B6.e(it, 1)));
            Iterator it2 = listK0.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int iB = ((E6.a) next).b();
                    do {
                        Object next2 = it2.next();
                        int iB2 = ((E6.a) next2).b();
                        if (iB < iB2) {
                            next = next2;
                            iB = iB2;
                        }
                    } while (it2.hasNext());
                }
            }
            E6.a aVar = (E6.a) next;
            if (aVar != null) {
                try {
                    t0 t0VarA = aVar.a(listK0);
                    if (t0VarA != null) {
                        f3752a = t0VarA;
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
