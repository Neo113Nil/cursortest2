package com.paypal.oslo.feature.wallet.amexandp3.domain.usecase;

/* loaded from: classes15.dex */
public final class RemovePaymentTokenUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.RemovePaymentTokenUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.amexandp3.domain.repository.RemovePaymentTokenRepository> getHighSpeedVideoSizes;

    private RemovePaymentTokenUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.amexandp3.domain.repository.RemovePaymentTokenRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.RemovePaymentTokenUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.RemovePaymentTokenUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.amexandp3.domain.repository.RemovePaymentTokenRepository> provider) {
        return new com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.RemovePaymentTokenUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.RemovePaymentTokenUseCase newInstance(com.paypal.oslo.feature.wallet.amexandp3.domain.repository.RemovePaymentTokenRepository removePaymentTokenRepository) {
        return new com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.RemovePaymentTokenUseCase(removePaymentTokenRepository);
    }
}
