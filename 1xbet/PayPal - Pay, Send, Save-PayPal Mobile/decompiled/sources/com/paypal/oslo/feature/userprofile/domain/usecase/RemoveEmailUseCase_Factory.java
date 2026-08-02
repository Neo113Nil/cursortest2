package com.paypal.oslo.feature.userprofile.domain.usecase;

/* loaded from: classes15.dex */
public final class RemoveEmailUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.domain.usecase.RemoveEmailUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository> Camera2StreamConfigurationMap;

    private RemoveEmailUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.domain.usecase.RemoveEmailUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.userprofile.domain.usecase.RemoveEmailUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository> provider) {
        return new com.paypal.oslo.feature.userprofile.domain.usecase.RemoveEmailUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.userprofile.domain.usecase.RemoveEmailUseCase newInstance(com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository emailRepository) {
        return new com.paypal.oslo.feature.userprofile.domain.usecase.RemoveEmailUseCase(emailRepository);
    }
}
