package com.paypal.oslo.feature.xoom.domain.usecase;

/* loaded from: classes16.dex */
public final class SetUserAgreementAcceptedUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.xoom.domain.usecase.SetUserAgreementAcceptedUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.repository.XoomLocalRepository> getHighSpeedVideoFpsRanges;

    private SetUserAgreementAcceptedUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.repository.XoomLocalRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.xoom.domain.usecase.SetUserAgreementAcceptedUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.xoom.domain.usecase.SetUserAgreementAcceptedUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.repository.XoomLocalRepository> provider) {
        return new com.paypal.oslo.feature.xoom.domain.usecase.SetUserAgreementAcceptedUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.xoom.domain.usecase.SetUserAgreementAcceptedUseCase newInstance(com.paypal.oslo.feature.xoom.domain.repository.XoomLocalRepository xoomLocalRepository) {
        return new com.paypal.oslo.feature.xoom.domain.usecase.SetUserAgreementAcceptedUseCase(xoomLocalRepository);
    }
}
