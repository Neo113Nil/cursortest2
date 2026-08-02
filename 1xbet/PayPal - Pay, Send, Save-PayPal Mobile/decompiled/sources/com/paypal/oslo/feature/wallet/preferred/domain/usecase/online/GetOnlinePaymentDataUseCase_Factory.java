package com.paypal.oslo.feature.wallet.preferred.domain.usecase.online;

/* loaded from: classes16.dex */
public final class GetOnlinePaymentDataUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.GetOnlinePaymentDataUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.preferred.domain.repository.online.OnlinePaymentRepository> getHighSpeedVideoFpsRangesFor;

    private GetOnlinePaymentDataUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.preferred.domain.repository.online.OnlinePaymentRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.GetOnlinePaymentDataUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.GetOnlinePaymentDataUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.preferred.domain.repository.online.OnlinePaymentRepository> provider) {
        return new com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.GetOnlinePaymentDataUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.GetOnlinePaymentDataUseCase newInstance(com.paypal.oslo.feature.wallet.preferred.domain.repository.online.OnlinePaymentRepository onlinePaymentRepository) {
        return new com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.GetOnlinePaymentDataUseCase(onlinePaymentRepository);
    }
}
