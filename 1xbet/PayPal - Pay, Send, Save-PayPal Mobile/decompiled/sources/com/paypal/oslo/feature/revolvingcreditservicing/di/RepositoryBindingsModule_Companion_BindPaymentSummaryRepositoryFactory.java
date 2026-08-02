package com.paypal.oslo.feature.revolvingcreditservicing.di;

/* loaded from: classes14.dex */
public final class RepositoryBindingsModule_Companion_BindPaymentSummaryRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentSummaryRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentSummaryRepositoryImpl> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl> getHighSpeedVideoFpsRangesFor;

    private RepositoryBindingsModule_Companion_BindPaymentSummaryRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentSummaryRepositoryImpl> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentSummaryRepository get() {
        return bindPaymentSummaryRepository(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.di.RepositoryBindingsModule_Companion_BindPaymentSummaryRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentSummaryRepositoryImpl> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl> provider3) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.di.RepositoryBindingsModule_Companion_BindPaymentSummaryRepositoryFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentSummaryRepository bindPaymentSummaryRepository(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentSummaryRepositoryImpl mockPaymentSummaryRepositoryImpl, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl paymentSummaryRepositoryImpl) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentSummaryRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.revolvingcreditservicing.di.RepositoryBindingsModule.INSTANCE.bindPaymentSummaryRepository(featureGateManager, mockPaymentSummaryRepositoryImpl, paymentSummaryRepositoryImpl));
    }
}
