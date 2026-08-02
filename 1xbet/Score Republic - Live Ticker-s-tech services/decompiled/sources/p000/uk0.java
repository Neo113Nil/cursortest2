package p000;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uk0 {

    /* JADX INFO: renamed from: a */
    public static final ha0 f7838a;

    static {
        String property;
        int i = lc1.f4761a;
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
            Iterator it = Arrays.asList(new C0161e4()).iterator();
            it.getClass();
            Iterator it2 = s61.m4485s(new C0548ol(new u61(it))).iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    ((C0161e4) next).getClass();
                    do {
                        ((C0161e4) it2.next()).getClass();
                    } while (it2.hasNext());
                }
            }
            if (((C0161e4) next) == null) {
                C0270h1.m2191g("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                f7838a = new ha0(ia0.m2580a(mainLooper), false);
            } else {
                C0270h1.m2191g("The main looper is not available");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
