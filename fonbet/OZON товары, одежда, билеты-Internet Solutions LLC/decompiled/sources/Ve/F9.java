package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class F9 implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Pc.a f28975a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f28976b;

    /* renamed from: c, reason: collision with root package name */
    public final Pc.a f28977c;

    /* renamed from: d, reason: collision with root package name */
    public final Pc.a f28978d;

    /* renamed from: e, reason: collision with root package name */
    public final Pc.a f28979e;

    /* renamed from: f, reason: collision with root package name */
    public final Pc.a f28980f;

    /* renamed from: g, reason: collision with root package name */
    public final B6 f28981g;

    /* renamed from: h, reason: collision with root package name */
    public final C4609s7 f28982h;

    public F9(Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4, Pc.a aVar5, Pc.a aVar6, B6 b62, C4609s7 c4609s7) {
        this.f28975a = aVar;
        this.f28976b = aVar2;
        this.f28977c = aVar3;
        this.f28978d = aVar4;
        this.f28979e = aVar5;
        this.f28980f = aVar6;
        this.f28981g = b62;
        this.f28982h = c4609s7;
    }

    @Override // Pc.a
    public final Object get() {
        Vm dataContract = (Vm) this.f28975a.get();
        Ib sPayStorage = (Ib) this.f28976b.get();
        C4248fl featuresHandler = (C4248fl) this.f28977c.get();
        InterfaceC4686uq authHandler = (InterfaceC4686uq) this.f28978d.get();
        Y4 setCookieHandler = (Y4) this.f28979e.get();
        C4186dg seamlessAuthFeature = (C4186dg) this.f28980f.get();
        Te metricFacade = (Te) this.f28981g.get();
        InterfaceC4524p8 sPayRepository = (InterfaceC4524p8) this.f28982h.get();
        Intrinsics.checkNotNullParameter(dataContract, "dataContract");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        Intrinsics.checkNotNullParameter(authHandler, "authHandler");
        Intrinsics.checkNotNullParameter(setCookieHandler, "setCookieHandler");
        Intrinsics.checkNotNullParameter(seamlessAuthFeature, "seamlessAuthFeature");
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        return new Yc(dataContract, sPayStorage, featuresHandler, authHandler, setCookieHandler, seamlessAuthFeature, metricFacade, sPayRepository);
    }
}
