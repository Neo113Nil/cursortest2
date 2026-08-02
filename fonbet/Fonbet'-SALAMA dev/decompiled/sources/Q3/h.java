package Q3;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import w1.V0;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final h f5810b = new h();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f5811a = new AtomicReference(new n(new V0(20)));

    public final Class a(Class cls) {
        HashMap hashMap = ((n) this.f5811a.get()).f5821b;
        if (hashMap.containsKey(cls)) {
            return ((J3.m) hashMap.get(cls)).a();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public final synchronized void b(l lVar) {
        V0 v02 = new V0((n) this.f5811a.get());
        v02.U(lVar);
        this.f5811a.set(new n(v02));
    }
}
