package com.paypal.oslo.feature.xoom.domain.usecase;

/* loaded from: classes16.dex */
public final class ValidateUserUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.xoom.domain.usecase.ValidateUserUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.GetUsersMeUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.ValidateInactiveUserUseCase> getHighSpeedVideoSizes;

    private ValidateUserUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.GetUsersMeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.ValidateInactiveUserUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.xoom.domain.usecase.ValidateUserUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.xoom.domain.usecase.ValidateUserUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.GetUsersMeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.ValidateInactiveUserUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase> provider3) {
        return new com.paypal.oslo.feature.xoom.domain.usecase.ValidateUserUseCase_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.xoom.domain.usecase.ValidateUserUseCase newInstance(com.paypal.oslo.feature.xoom.domain.usecase.GetUsersMeUseCase getUsersMeUseCase, com.paypal.oslo.feature.xoom.domain.usecase.ValidateInactiveUserUseCase validateInactiveUserUseCase, com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase getForbiddenErrorPresentationUseCase) {
        return new com.paypal.oslo.feature.xoom.domain.usecase.ValidateUserUseCase(getUsersMeUseCase, validateInactiveUserUseCase, getForbiddenErrorPresentationUseCase);
    }
}
