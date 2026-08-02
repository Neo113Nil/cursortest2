package com.paypal.oslo.feature.identity.login.domain.usecase;

/* loaded from: classes12.dex */
public final class IsInContextLoginEnabledUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.login.domain.usecase.IsInContextLoginEnabledUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.repository.InContextLoginProvider> Camera2StreamConfigurationMap;

    private IsInContextLoginEnabledUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.repository.InContextLoginProvider> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.login.domain.usecase.IsInContextLoginEnabledUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.login.domain.usecase.IsInContextLoginEnabledUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.repository.InContextLoginProvider> provider) {
        return new com.paypal.oslo.feature.identity.login.domain.usecase.IsInContextLoginEnabledUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.login.domain.usecase.IsInContextLoginEnabledUseCase newInstance(com.paypal.oslo.feature.identity.login.domain.repository.InContextLoginProvider inContextLoginProvider) {
        return new com.paypal.oslo.feature.identity.login.domain.usecase.IsInContextLoginEnabledUseCase(inContextLoginProvider);
    }
}
