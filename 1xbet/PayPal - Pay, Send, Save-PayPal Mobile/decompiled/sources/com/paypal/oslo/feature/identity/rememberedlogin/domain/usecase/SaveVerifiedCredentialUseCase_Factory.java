package com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase;

/* loaded from: classes13.dex */
public final class SaveVerifiedCredentialUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.SaveVerifiedCredentialUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository> getHighSpeedVideoFpsRangesFor;

    private SaveVerifiedCredentialUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.SaveVerifiedCredentialUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.SaveVerifiedCredentialUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository> provider) {
        return new com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.SaveVerifiedCredentialUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.SaveVerifiedCredentialUseCase newInstance(com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository rememberedLoginRepository) {
        return new com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.SaveVerifiedCredentialUseCase(rememberedLoginRepository);
    }
}
