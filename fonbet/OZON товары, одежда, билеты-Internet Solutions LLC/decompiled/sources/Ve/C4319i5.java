package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.i5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4319i5 implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Pc.a f31264a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f31265b;

    /* renamed from: c, reason: collision with root package name */
    public final Pc.a f31266c;

    /* renamed from: d, reason: collision with root package name */
    public final Pc.a f31267d;

    public C4319i5(Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4) {
        this.f31264a = aVar;
        this.f31265b = aVar2;
        this.f31266c = aVar3;
        this.f31267d = aVar4;
    }

    @Override // Pc.a
    public final Object get() {
        C4248fl featuresHandler = (C4248fl) this.f31264a.get();
        Vm sPayDataContract = (Vm) this.f31265b.get();
        Ib sPayStorage = (Ib) this.f31266c.get();
        T8 sPaySdkMerchantOptionsRepository = (T8) this.f31267d.get();
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(sPaySdkMerchantOptionsRepository, "sPaySdkMerchantOptionsRepository");
        return new H4(featuresHandler, sPayDataContract, sPayStorage, sPaySdkMerchantOptionsRepository);
    }
}
