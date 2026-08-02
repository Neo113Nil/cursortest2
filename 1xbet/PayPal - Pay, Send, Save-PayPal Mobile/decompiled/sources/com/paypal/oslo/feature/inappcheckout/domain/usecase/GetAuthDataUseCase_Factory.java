package com.paypal.oslo.feature.inappcheckout.domain.usecase;

/* loaded from: classes13.dex */
public final class GetAuthDataUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetAuthDataUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository> getHighResolutionOutputSizeshNQ4ISI;

    private GetAuthDataUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.usecase.GetAuthDataUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.GetAuthDataUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository> provider) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.GetAuthDataUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.GetAuthDataUseCase newInstance(com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository authRepository) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.GetAuthDataUseCase(authRepository);
    }
}
