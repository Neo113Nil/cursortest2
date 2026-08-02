package com.paypal.oslo.feature.merchantbanking.domain.usecase;

/* loaded from: classes13.dex */
public final class EnrollForAccountRoutingNumbersUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.merchantbanking.domain.usecase.EnrollForAccountRoutingNumbersUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.domain.repository.MerchantAccountRoutingNumberRepository> getHighSpeedVideoFpsRangesFor;

    private EnrollForAccountRoutingNumbersUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.domain.repository.MerchantAccountRoutingNumberRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.merchantbanking.domain.usecase.EnrollForAccountRoutingNumbersUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.merchantbanking.domain.usecase.EnrollForAccountRoutingNumbersUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.domain.repository.MerchantAccountRoutingNumberRepository> provider) {
        return new com.paypal.oslo.feature.merchantbanking.domain.usecase.EnrollForAccountRoutingNumbersUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.merchantbanking.domain.usecase.EnrollForAccountRoutingNumbersUseCase newInstance(com.paypal.oslo.feature.merchantbanking.domain.repository.MerchantAccountRoutingNumberRepository merchantAccountRoutingNumberRepository) {
        return new com.paypal.oslo.feature.merchantbanking.domain.usecase.EnrollForAccountRoutingNumbersUseCase(merchantAccountRoutingNumberRepository);
    }
}
