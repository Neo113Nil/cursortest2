package com.paypal.oslo.feature.xoom.domain.usecase;

/* loaded from: classes16.dex */
public final class GetUserAgreementAcceptedUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.xoom.domain.usecase.GetUserAgreementAcceptedUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.repository.XoomLocalRepository> getHighSpeedVideoSizes;

    private GetUserAgreementAcceptedUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.repository.XoomLocalRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.xoom.domain.usecase.GetUserAgreementAcceptedUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.xoom.domain.usecase.GetUserAgreementAcceptedUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.repository.XoomLocalRepository> provider) {
        return new com.paypal.oslo.feature.xoom.domain.usecase.GetUserAgreementAcceptedUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.xoom.domain.usecase.GetUserAgreementAcceptedUseCase newInstance(com.paypal.oslo.feature.xoom.domain.repository.XoomLocalRepository xoomLocalRepository) {
        return new com.paypal.oslo.feature.xoom.domain.usecase.GetUserAgreementAcceptedUseCase(xoomLocalRepository);
    }
}
