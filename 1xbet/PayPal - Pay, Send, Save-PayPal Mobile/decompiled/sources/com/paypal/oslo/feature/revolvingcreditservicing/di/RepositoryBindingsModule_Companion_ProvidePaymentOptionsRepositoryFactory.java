package com.paypal.oslo.feature.revolvingcreditservicing.di;

/* loaded from: classes14.dex */
public final class RepositoryBindingsModule_Companion_ProvidePaymentOptionsRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentOptionsRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentOptionsRepositoryImpl> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentOptionsRepository> getHighSpeedVideoSizes;

    private RepositoryBindingsModule_Companion_ProvidePaymentOptionsRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentOptionsRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentOptionsRepositoryImpl> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentOptionsRepository get() {
        return providePaymentOptionsRepository(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.di.RepositoryBindingsModule_Companion_ProvidePaymentOptionsRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentOptionsRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentOptionsRepositoryImpl> provider3) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.di.RepositoryBindingsModule_Companion_ProvidePaymentOptionsRepositoryFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentOptionsRepository providePaymentOptionsRepository(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentOptionsRepository mockPaymentOptionsRepository, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentOptionsRepositoryImpl paymentOptionsRepositoryImpl) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentOptionsRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.revolvingcreditservicing.di.RepositoryBindingsModule.INSTANCE.providePaymentOptionsRepository(featureGateManager, mockPaymentOptionsRepository, paymentOptionsRepositoryImpl));
    }
}
