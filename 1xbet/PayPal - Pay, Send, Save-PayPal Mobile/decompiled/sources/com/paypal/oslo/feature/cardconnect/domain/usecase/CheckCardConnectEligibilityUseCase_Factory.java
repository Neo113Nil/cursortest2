package com.paypal.oslo.feature.cardconnect.domain.usecase;

/* loaded from: classes11.dex */
public final class CheckCardConnectEligibilityUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cardconnect.domain.usecase.CheckCardConnectEligibilityUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cardconnect.domain.repository.CardConnectRepository> getHighSpeedVideoFpsRanges;

    private CheckCardConnectEligibilityUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cardconnect.domain.repository.CardConnectRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cardconnect.domain.usecase.CheckCardConnectEligibilityUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.cardconnect.domain.usecase.CheckCardConnectEligibilityUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cardconnect.domain.repository.CardConnectRepository> provider) {
        return new com.paypal.oslo.feature.cardconnect.domain.usecase.CheckCardConnectEligibilityUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.cardconnect.domain.usecase.CheckCardConnectEligibilityUseCase newInstance(com.paypal.oslo.feature.cardconnect.domain.repository.CardConnectRepository cardConnectRepository) {
        return new com.paypal.oslo.feature.cardconnect.domain.usecase.CheckCardConnectEligibilityUseCase(cardConnectRepository);
    }
}
