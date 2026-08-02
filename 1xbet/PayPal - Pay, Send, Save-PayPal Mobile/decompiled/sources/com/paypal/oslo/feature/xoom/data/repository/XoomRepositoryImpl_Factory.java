package com.paypal.oslo.feature.xoom.data.repository;

/* loaded from: classes16.dex */
public final class XoomRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.xoom.data.repository.XoomRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.xoom.data.XoomApiService> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.security.RiskDataProvider> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoSizes;

    private XoomRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.xoom.data.XoomApiService> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider2, dagger.internal.Provider<com.paypal.oslo.core.security.RiskDataProvider> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighSpeedVideoSizes = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.xoom.data.repository.XoomRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.xoom.data.repository.XoomRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.xoom.data.XoomApiService> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider2, dagger.internal.Provider<com.paypal.oslo.core.security.RiskDataProvider> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4) {
        return new com.paypal.oslo.feature.xoom.data.repository.XoomRepositoryImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.xoom.data.repository.XoomRepositoryImpl newInstance(com.paypal.oslo.feature.xoom.data.XoomApiService xoomApiService, com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.core.security.RiskDataProvider riskDataProvider, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.xoom.data.repository.XoomRepositoryImpl(xoomApiService, localeInformation, riskDataProvider, coroutineDispatcher);
    }
}
