package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Qp implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Pc.a f29806a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f29807b;

    /* renamed from: c, reason: collision with root package name */
    public final Pc.a f29808c;

    /* renamed from: d, reason: collision with root package name */
    public final Pc.a f29809d;

    public Qp(Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4) {
        this.f29806a = aVar;
        this.f29807b = aVar2;
        this.f29808c = aVar3;
        this.f29809d = aVar4;
    }

    @Override // Pc.a
    public final Object get() {
        C4248fl featuresHandler = (C4248fl) this.f29806a.get();
        Vm sPayDataContract = (Vm) this.f29807b.get();
        Ib sPayStorage = (Ib) this.f29808c.get();
        T8 sPaySdkMerchantOptionsRepository = (T8) this.f29809d.get();
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(sPaySdkMerchantOptionsRepository, "sPaySdkMerchantOptionsRepository");
        return new Nl(featuresHandler, sPayDataContract, sPayStorage, sPaySdkMerchantOptionsRepository);
    }
}
