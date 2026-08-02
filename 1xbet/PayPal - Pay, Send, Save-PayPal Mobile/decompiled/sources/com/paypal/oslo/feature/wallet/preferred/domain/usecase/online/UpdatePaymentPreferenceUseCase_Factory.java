package com.paypal.oslo.feature.wallet.preferred.domain.usecase.online;

/* loaded from: classes16.dex */
public final class UpdatePaymentPreferenceUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.UpdatePaymentPreferenceUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.preferred.domain.repository.online.OnlinePaymentRepository> getHighSpeedVideoFpsRanges;

    private UpdatePaymentPreferenceUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.preferred.domain.repository.online.OnlinePaymentRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.UpdatePaymentPreferenceUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.UpdatePaymentPreferenceUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.preferred.domain.repository.online.OnlinePaymentRepository> provider) {
        return new com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.UpdatePaymentPreferenceUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.UpdatePaymentPreferenceUseCase newInstance(com.paypal.oslo.feature.wallet.preferred.domain.repository.online.OnlinePaymentRepository onlinePaymentRepository) {
        return new com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.UpdatePaymentPreferenceUseCase(onlinePaymentRepository);
    }
}
