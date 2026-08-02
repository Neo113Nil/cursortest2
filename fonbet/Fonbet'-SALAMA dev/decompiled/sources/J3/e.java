package J3;

import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import v0.AbstractC1663a;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f3836b = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f3837a;

    public e(e eVar) {
        this.f3837a = new ConcurrentHashMap(eVar.f3837a);
    }

    public final synchronized d a(String str) {
        if (!this.f3837a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (d) this.f3837a.get(str);
    }

    public final synchronized void b(Q3.d dVar) {
        int k7 = dVar.k();
        if (!(k7 != 1 ? AbstractC1663a.b(k7) : AbstractC1663a.a(k7))) {
            throw new GeneralSecurityException("failed to register key manager " + dVar.getClass() + " as it is not FIPS compatible.");
        }
        c(new d(dVar));
    }

    public final synchronized void c(d dVar) {
        try {
            Q3.d dVar2 = dVar.f3835a;
            Class cls = (Class) dVar2.f5805b;
            if (!((Map) dVar2.f5806c).keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + dVar2.toString() + " does not support primitive class " + cls.getName());
            }
            String l7 = dVar2.l();
            d dVar3 = (d) this.f3837a.get(l7);
            if (dVar3 != null && !dVar3.f3835a.getClass().equals(dVar.f3835a.getClass())) {
                f3836b.warning("Attempted overwrite of a registered key manager for key type ".concat(l7));
                throw new GeneralSecurityException("typeUrl (" + l7 + ") is already registered with " + dVar3.f3835a.getClass().getName() + ", cannot be re-registered with " + dVar.f3835a.getClass().getName());
            }
            this.f3837a.putIfAbsent(l7, dVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public e() {
        this.f3837a = new ConcurrentHashMap();
    }
}
