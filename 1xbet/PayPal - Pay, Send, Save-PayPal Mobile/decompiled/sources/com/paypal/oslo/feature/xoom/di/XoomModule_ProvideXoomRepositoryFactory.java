package com.paypal.oslo.feature.xoom.di;

/* loaded from: classes16.dex */
public final class XoomModule_ProvideXoomRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.xoom.domain.repository.XoomRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.security.RiskDataProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.xoom.data.XoomApiService> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoSizes;

    private XoomModule_ProvideXoomRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.xoom.data.XoomApiService> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider2, dagger.internal.Provider<com.paypal.oslo.core.security.RiskDataProvider> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoSizes = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.xoom.domain.repository.XoomRepository get() {
        return provideXoomRepository(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.xoom.di.XoomModule_ProvideXoomRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.xoom.data.XoomApiService> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider2, dagger.internal.Provider<com.paypal.oslo.core.security.RiskDataProvider> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4) {
        return new com.paypal.oslo.feature.xoom.di.XoomModule_ProvideXoomRepositoryFactory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.xoom.domain.repository.XoomRepository provideXoomRepository(com.paypal.oslo.feature.xoom.data.XoomApiService xoomApiService, com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.core.security.RiskDataProvider riskDataProvider, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return (com.paypal.oslo.feature.xoom.domain.repository.XoomRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.xoom.di.XoomModule.INSTANCE.provideXoomRepository(xoomApiService, localeInformation, riskDataProvider, coroutineDispatcher));
    }
}
