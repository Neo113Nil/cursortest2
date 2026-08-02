package S7;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes9.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArrayList<m> f26023a = new CopyOnWriteArrayList<>();

    public static m a(String str) throws GeneralSecurityException {
        Iterator<m> it = f26023a.iterator();
        while (it.hasNext()) {
            m next = it.next();
            if (next.a(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException(Nk.a.b("No KMS client does support: ", str));
    }
}
