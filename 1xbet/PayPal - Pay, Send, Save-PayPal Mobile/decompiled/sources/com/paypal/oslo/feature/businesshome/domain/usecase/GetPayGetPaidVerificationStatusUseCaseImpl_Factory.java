package com.paypal.oslo.feature.businesshome.domain.usecase;

/* loaded from: classes11.dex */
public final class GetPayGetPaidVerificationStatusUseCaseImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesshome.domain.usecase.GetPayGetPaidVerificationStatusUseCaseImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository> getHighSpeedVideoFpsRanges;

    private GetPayGetPaidVerificationStatusUseCaseImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesshome.domain.usecase.GetPayGetPaidVerificationStatusUseCaseImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.businesshome.domain.usecase.GetPayGetPaidVerificationStatusUseCaseImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository> provider) {
        return new com.paypal.oslo.feature.businesshome.domain.usecase.GetPayGetPaidVerificationStatusUseCaseImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesshome.domain.usecase.GetPayGetPaidVerificationStatusUseCaseImpl newInstance(com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository accountSetupRepository) {
        return new com.paypal.oslo.feature.businesshome.domain.usecase.GetPayGetPaidVerificationStatusUseCaseImpl(accountSetupRepository);
    }
}
