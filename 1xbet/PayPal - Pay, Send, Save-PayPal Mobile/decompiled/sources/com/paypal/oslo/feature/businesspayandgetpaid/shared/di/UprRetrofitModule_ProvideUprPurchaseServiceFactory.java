package com.paypal.oslo.feature.businesspayandgetpaid.shared.di;

/* loaded from: classes5.dex */
public final class UprRetrofitModule_ProvideUprPurchaseServiceFactory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.api.UprPurchaseService> {
    private final dagger.internal.Provider<retrofit2.Retrofit> getHighSpeedVideoFpsRanges;

    private UprRetrofitModule_ProvideUprPurchaseServiceFactory(dagger.internal.Provider<retrofit2.Retrofit> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.data.api.UprPurchaseService get() {
        return provideUprPurchaseService(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprRetrofitModule_ProvideUprPurchaseServiceFactory create(dagger.internal.Provider<retrofit2.Retrofit> provider) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprRetrofitModule_ProvideUprPurchaseServiceFactory(provider);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.data.api.UprPurchaseService provideUprPurchaseService(retrofit2.Retrofit retrofit) {
        return (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.api.UprPurchaseService) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprRetrofitModule.INSTANCE.provideUprPurchaseService(retrofit));
    }
}
