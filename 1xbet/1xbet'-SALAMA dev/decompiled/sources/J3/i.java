package J3;

import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p155w1.L;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f3845a = new CopyOnWriteArrayList();

    public static P3.c a(String str) throws GeneralSecurityException {
        boolean zStartsWith;
        for (P3.c cVar : f3845a) {
            synchronized (cVar) {
                zStartsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
            }
            if (zStartsWith) {
                return cVar;
            }
        }
        throw new GeneralSecurityException(L.i("No KMS client does support: ", str));
    }
}
