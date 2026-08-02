package com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase;

/* loaded from: classes13.dex */
public final class HasRememberedUserUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.HasRememberedUserUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository> getHighSpeedVideoFpsRanges;

    private HasRememberedUserUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.HasRememberedUserUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.HasRememberedUserUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository> provider) {
        return new com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.HasRememberedUserUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.HasRememberedUserUseCase newInstance(com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository rememberedLoginRepository) {
        return new com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.HasRememberedUserUseCase(rememberedLoginRepository);
    }
}
