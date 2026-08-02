package com.paypal.oslo.feature.merchantbanking.domain.usecase;

/* loaded from: classes13.dex */
public final class CheckAccountRoutingNumberEligibilityUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.merchantbanking.domain.usecase.CheckAccountRoutingNumberEligibilityUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.domain.repository.MerchantAccountRoutingNumberRepository> getHighSpeedVideoFpsRanges;

    private CheckAccountRoutingNumberEligibilityUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.domain.repository.MerchantAccountRoutingNumberRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.merchantbanking.domain.usecase.CheckAccountRoutingNumberEligibilityUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.merchantbanking.domain.usecase.CheckAccountRoutingNumberEligibilityUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.domain.repository.MerchantAccountRoutingNumberRepository> provider) {
        return new com.paypal.oslo.feature.merchantbanking.domain.usecase.CheckAccountRoutingNumberEligibilityUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.merchantbanking.domain.usecase.CheckAccountRoutingNumberEligibilityUseCase newInstance(com.paypal.oslo.feature.merchantbanking.domain.repository.MerchantAccountRoutingNumberRepository merchantAccountRoutingNumberRepository) {
        return new com.paypal.oslo.feature.merchantbanking.domain.usecase.CheckAccountRoutingNumberEligibilityUseCase(merchantAccountRoutingNumberRepository);
    }
}
