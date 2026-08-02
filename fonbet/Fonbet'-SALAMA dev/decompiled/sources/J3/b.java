package J3;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f3834a = new byte[0];

    public static g a(String str) {
        Map unmodifiableMap;
        AtomicReference atomicReference = n.f3855a;
        synchronized (n.class) {
            unmodifiableMap = Collections.unmodifiableMap(n.f3858d);
        }
        g gVar = (g) unmodifiableMap.get(str);
        if (gVar != null) {
            return gVar;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
