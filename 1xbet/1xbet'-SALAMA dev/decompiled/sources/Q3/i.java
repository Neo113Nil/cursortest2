package Q3;

import A1.W;
import V3.X;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import p155w1.F0;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f5812b = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f5813a = new AtomicReference(new s(new F0(6)));

    public final J3.b a(o oVar) {
        AtomicReference atomicReference = this.f5813a;
        s sVar = (s) atomicReference.get();
        sVar.getClass();
        X3.a aVar = (X3.a) oVar.f5823b;
        if (!sVar.f5834b.containsKey(new q(o.class, aVar))) {
            try {
                e eVar = new e();
                ((X) oVar.f5825d).ordinal();
                return eVar;
            } catch (GeneralSecurityException e7) {
                throw new W("Creating a LegacyProtoKey failed", e7);
            }
        }
        s sVar2 = (s) atomicReference.get();
        sVar2.getClass();
        q qVar = new q(o.class, aVar);
        HashMap map = sVar2.f5834b;
        if (map.containsKey(qVar)) {
            return ((a) map.get(qVar)).f5800b.a(oVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + qVar + " available");
    }

    public final synchronized void b(a aVar) {
        F0 f7 = new F0((s) this.f5813a.get());
        f7.F(aVar);
        this.f5813a.set(new s(f7));
    }

    public final synchronized void c(b bVar) {
        F0 f7 = new F0((s) this.f5813a.get());
        f7.G(bVar);
        this.f5813a.set(new s(f7));
    }

    public final synchronized void d(j jVar) {
        F0 f7 = new F0((s) this.f5813a.get());
        f7.I(jVar);
        this.f5813a.set(new s(f7));
    }

    public final synchronized void e(k kVar) {
        F0 f7 = new F0((s) this.f5813a.get());
        f7.J(kVar);
        this.f5813a.set(new s(f7));
    }
}
