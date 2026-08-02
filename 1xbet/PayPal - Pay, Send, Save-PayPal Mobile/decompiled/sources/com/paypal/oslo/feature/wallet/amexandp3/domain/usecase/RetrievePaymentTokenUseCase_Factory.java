package com.paypal.oslo.feature.wallet.amexandp3.domain.usecase;

/* loaded from: classes15.dex */
public final class RetrievePaymentTokenUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.RetrievePaymentTokenUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.amexandp3.domain.repository.RetrievePaymentTokenRepository> getHighSpeedVideoFpsRanges;

    private RetrievePaymentTokenUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.amexandp3.domain.repository.RetrievePaymentTokenRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.RetrievePaymentTokenUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.RetrievePaymentTokenUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.amexandp3.domain.repository.RetrievePaymentTokenRepository> provider) {
        return new com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.RetrievePaymentTokenUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.RetrievePaymentTokenUseCase newInstance(com.paypal.oslo.feature.wallet.amexandp3.domain.repository.RetrievePaymentTokenRepository retrievePaymentTokenRepository) {
        return new com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.RetrievePaymentTokenUseCase(retrievePaymentTokenRepository);
    }
}
