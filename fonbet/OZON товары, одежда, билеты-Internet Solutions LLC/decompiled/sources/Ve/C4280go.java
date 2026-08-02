package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.go, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4280go implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final C4252fp f31121a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f31122b;

    /* renamed from: c, reason: collision with root package name */
    public final Pc.a f31123c;

    /* renamed from: d, reason: collision with root package name */
    public final B6 f31124d;

    public C4280go(C4252fp c4252fp, Pc.a aVar, Pc.a aVar2, B6 b62) {
        this.f31121a = c4252fp;
        this.f31122b = aVar;
        this.f31123c = aVar2;
        this.f31124d = b62;
    }

    @Override // Pc.a
    public final Object get() {
        Yn fingerprintInteractor = (Yn) this.f31121a.get();
        Ib sPayStorage = (Ib) this.f31122b.get();
        Y9 reducer = (Y9) this.f31123c.get();
        Te metricFacade = (Te) this.f31124d.get();
        Intrinsics.checkNotNullParameter(fingerprintInteractor, "fingerprintInteractor");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        return new La(fingerprintInteractor, sPayStorage, reducer, metricFacade);
    }
}
