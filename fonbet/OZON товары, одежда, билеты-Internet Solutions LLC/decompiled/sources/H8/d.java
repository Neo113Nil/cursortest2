package H8;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f10697b;

    /* renamed from: a, reason: collision with root package name */
    private final HashSet f10698a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar;
        d dVar2 = f10697b;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (d.class) {
            try {
                dVar = f10697b;
                if (dVar == null) {
                    dVar = new d();
                    f10697b = dVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    final Set<e> b() {
        Set<e> unmodifiableSet;
        synchronized (this.f10698a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f10698a);
        }
        return unmodifiableSet;
    }
}
