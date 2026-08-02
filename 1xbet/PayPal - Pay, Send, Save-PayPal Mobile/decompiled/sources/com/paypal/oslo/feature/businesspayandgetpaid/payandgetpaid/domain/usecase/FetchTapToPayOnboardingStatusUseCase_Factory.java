package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase;

/* loaded from: classes11.dex */
public final class FetchTapToPayOnboardingStatusUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.FetchTapToPayOnboardingStatusUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.repository.MerchantTtpServiceRepository> getHighSpeedVideoFpsRanges;

    private FetchTapToPayOnboardingStatusUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.repository.MerchantTtpServiceRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.FetchTapToPayOnboardingStatusUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.FetchTapToPayOnboardingStatusUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.repository.MerchantTtpServiceRepository> provider) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.FetchTapToPayOnboardingStatusUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.FetchTapToPayOnboardingStatusUseCase newInstance(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.repository.MerchantTtpServiceRepository merchantTtpServiceRepository) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.FetchTapToPayOnboardingStatusUseCase(merchantTtpServiceRepository);
    }
}
