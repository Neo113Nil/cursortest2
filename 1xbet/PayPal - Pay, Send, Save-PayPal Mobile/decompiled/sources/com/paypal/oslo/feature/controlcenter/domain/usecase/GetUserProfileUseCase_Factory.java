package com.paypal.oslo.feature.controlcenter.domain.usecase;

/* loaded from: classes12.dex */
public final class GetUserProfileUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.controlcenter.domain.usecase.GetUserProfileUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.controlcenter.domain.repository.IUserProfileRepository> getHighResolutionOutputSizeshNQ4ISI;

    private GetUserProfileUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.controlcenter.domain.repository.IUserProfileRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.controlcenter.domain.usecase.GetUserProfileUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.controlcenter.domain.usecase.GetUserProfileUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.controlcenter.domain.repository.IUserProfileRepository> provider) {
        return new com.paypal.oslo.feature.controlcenter.domain.usecase.GetUserProfileUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.controlcenter.domain.usecase.GetUserProfileUseCase newInstance(com.paypal.oslo.feature.controlcenter.domain.repository.IUserProfileRepository iUserProfileRepository) {
        return new com.paypal.oslo.feature.controlcenter.domain.usecase.GetUserProfileUseCase(iUserProfileRepository);
    }
}
