package com.paypal.oslo.feature.xoom.di;

/* loaded from: classes16.dex */
public final class XoomModule_ProvideEndpointApiServiceFactory implements dagger.internal.Factory<com.paypal.oslo.feature.xoom.data.XoomApiService> {
    private final dagger.internal.Provider<retrofit2.Retrofit> getHighSpeedVideoFpsRangesFor;

    private XoomModule_ProvideEndpointApiServiceFactory(dagger.internal.Provider<retrofit2.Retrofit> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.xoom.data.XoomApiService get() {
        return provideEndpointApiService(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.xoom.di.XoomModule_ProvideEndpointApiServiceFactory create(dagger.internal.Provider<retrofit2.Retrofit> provider) {
        return new com.paypal.oslo.feature.xoom.di.XoomModule_ProvideEndpointApiServiceFactory(provider);
    }

    public static com.paypal.oslo.feature.xoom.data.XoomApiService provideEndpointApiService(retrofit2.Retrofit retrofit) {
        return (com.paypal.oslo.feature.xoom.data.XoomApiService) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.xoom.di.XoomModule.INSTANCE.provideEndpointApiService(retrofit));
    }
}
