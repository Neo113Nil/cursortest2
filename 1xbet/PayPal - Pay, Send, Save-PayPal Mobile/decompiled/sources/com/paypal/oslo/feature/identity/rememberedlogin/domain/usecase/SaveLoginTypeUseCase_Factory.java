package com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase;

/* loaded from: classes13.dex */
public final class SaveLoginTypeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.SaveLoginTypeUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository> Camera2StreamConfigurationMap;

    private SaveLoginTypeUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.SaveLoginTypeUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.SaveLoginTypeUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository> provider) {
        return new com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.SaveLoginTypeUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.SaveLoginTypeUseCase newInstance(com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository rememberedLoginRepository) {
        return new com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.SaveLoginTypeUseCase(rememberedLoginRepository);
    }
}
