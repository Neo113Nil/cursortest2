package com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore;

/* loaded from: classes16.dex */
public final class UpdateInstorePaymentPreferenceUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.UpdateInstorePaymentPreferenceUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.preferred.domain.repository.instore.InStorePaymentRepository> getHighSpeedVideoFpsRanges;

    private UpdateInstorePaymentPreferenceUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.preferred.domain.repository.instore.InStorePaymentRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.UpdateInstorePaymentPreferenceUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.UpdateInstorePaymentPreferenceUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.preferred.domain.repository.instore.InStorePaymentRepository> provider) {
        return new com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.UpdateInstorePaymentPreferenceUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.UpdateInstorePaymentPreferenceUseCase newInstance(com.paypal.oslo.feature.wallet.preferred.domain.repository.instore.InStorePaymentRepository inStorePaymentRepository) {
        return new com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.UpdateInstorePaymentPreferenceUseCase(inStorePaymentRepository);
    }
}
