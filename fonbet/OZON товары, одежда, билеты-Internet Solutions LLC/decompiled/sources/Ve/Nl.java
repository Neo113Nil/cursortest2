package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Nl extends E {

    /* renamed from: a, reason: collision with root package name */
    public final Vm f29564a;

    /* renamed from: b, reason: collision with root package name */
    public final Ib f29565b;

    /* renamed from: c, reason: collision with root package name */
    public final T8 f29566c;

    public Nl(C4248fl featuresHandler, Vm sPayDataContract, Ib sPayStorage, T8 sPaySdkMerchantOptionsRepository) {
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(sPaySdkMerchantOptionsRepository, "sPaySdkMerchantOptionsRepository");
        this.f29564a = sPayDataContract;
        this.f29565b = sPayStorage;
        this.f29566c = sPaySdkMerchantOptionsRepository;
    }
}
