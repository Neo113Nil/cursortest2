package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Zq implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Pc.a f30618a;

    /* renamed from: b, reason: collision with root package name */
    public final B6 f30619b;

    public Zq(Pc.a aVar, B6 b62) {
        this.f30618a = aVar;
        this.f30619b = b62;
    }

    @Override // Pc.a
    public final Object get() {
        Nh securePreferences = (Nh) this.f30618a.get();
        Te metricFacade = (Te) this.f30619b.get();
        Intrinsics.checkNotNullParameter(securePreferences, "securePreferences");
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        return new Y4(securePreferences, metricFacade);
    }
}
