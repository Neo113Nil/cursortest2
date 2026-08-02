package com.paypal.oslo.feature.inappcheckout.di;

/* loaded from: classes13.dex */
public final class InAppCheckoutViewModelScopedRepositoryModule_ProvideAuthorizeBillingAgreementRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.repository.AuthorizeBillingAgreementRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.AuthorizeBillingAgreementRepositoryImpl> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthorizeBillingAgreementRepositoryImpl> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> getHighSpeedVideoFpsRanges;

    private InAppCheckoutViewModelScopedRepositoryModule_ProvideAuthorizeBillingAgreementRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.AuthorizeBillingAgreementRepositoryImpl> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthorizeBillingAgreementRepositoryImpl> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.repository.AuthorizeBillingAgreementRepository get() {
        return provideAuthorizeBillingAgreementRepository(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutViewModelScopedRepositoryModule_ProvideAuthorizeBillingAgreementRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.AuthorizeBillingAgreementRepositoryImpl> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthorizeBillingAgreementRepositoryImpl> provider3) {
        return new com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutViewModelScopedRepositoryModule_ProvideAuthorizeBillingAgreementRepositoryFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.repository.AuthorizeBillingAgreementRepository provideAuthorizeBillingAgreementRepository(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager featureGateManager, com.paypal.oslo.feature.inappcheckout.data.repository.AuthorizeBillingAgreementRepositoryImpl authorizeBillingAgreementRepositoryImpl, com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthorizeBillingAgreementRepositoryImpl mockAuthorizeBillingAgreementRepositoryImpl) {
        return (com.paypal.oslo.feature.inappcheckout.domain.repository.AuthorizeBillingAgreementRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutViewModelScopedRepositoryModule.INSTANCE.provideAuthorizeBillingAgreementRepository(featureGateManager, authorizeBillingAgreementRepositoryImpl, mockAuthorizeBillingAgreementRepositoryImpl));
    }
}
