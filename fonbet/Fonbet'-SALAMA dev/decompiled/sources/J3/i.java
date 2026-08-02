package J3;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import w1.L;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f3845a = new CopyOnWriteArrayList();

    public static P3.c a(String str) {
        boolean startsWith;
        Iterator it = f3845a.iterator();
        while (it.hasNext()) {
            P3.c cVar = (P3.c) it.next();
            synchronized (cVar) {
                startsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
            }
            if (startsWith) {
                return cVar;
            }
        }
        throw new GeneralSecurityException(L.i("No KMS client does support: ", str));
    }
}
