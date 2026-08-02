package com.paypal.oslo.feature.taptopay.di;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/di/ProdDeviceCapabilityModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/taptopay/api/domain/capability/TapToPayDeviceCapability;", "impl", "provideDefaultTapToPayDeviceCapability", "(Lcom/paypal/oslo/feature/taptopay/api/domain/capability/TapToPayDeviceCapability;)Lcom/paypal/oslo/feature/taptopay/api/domain/capability/TapToPayDeviceCapability;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class ProdDeviceCapabilityModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.taptopay.di.ProdDeviceCapabilityModule INSTANCE = new com.paypal.oslo.feature.taptopay.di.ProdDeviceCapabilityModule();

    private ProdDeviceCapabilityModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability provideDefaultTapToPayDeviceCapability(@javax.inject.Named("main") com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability impl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impl, "");
        return impl;
    }
}
