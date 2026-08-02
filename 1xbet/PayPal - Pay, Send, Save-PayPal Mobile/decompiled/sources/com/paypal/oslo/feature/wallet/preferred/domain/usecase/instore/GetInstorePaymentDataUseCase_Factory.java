package com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore;

/* loaded from: classes16.dex */
public final class GetInstorePaymentDataUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.GetInstorePaymentDataUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.preferred.domain.repository.instore.InStorePaymentRepository> getHighSpeedVideoFpsRangesFor;

    private GetInstorePaymentDataUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.preferred.domain.repository.instore.InStorePaymentRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.GetInstorePaymentDataUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.GetInstorePaymentDataUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.preferred.domain.repository.instore.InStorePaymentRepository> provider) {
        return new com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.GetInstorePaymentDataUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.GetInstorePaymentDataUseCase newInstance(com.paypal.oslo.feature.wallet.preferred.domain.repository.instore.InStorePaymentRepository inStorePaymentRepository) {
        return new com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.GetInstorePaymentDataUseCase(inStorePaymentRepository);
    }
}
