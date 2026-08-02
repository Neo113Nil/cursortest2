package com.paypal.oslo.feature.identity.login;

/* loaded from: classes12.dex */
public final class IdentityLoginFlowStoreImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutor> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.repository.InContextLoginProvider> getHighSpeedVideoSizes;

    private IdentityLoginFlowStoreImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutor> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.repository.InContextLoginProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase> provider4) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutor> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.repository.InContextLoginProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase> provider4) {
        return new com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl newInstance(com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer identityLoginFlowReducer, com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutor identityLoginFlowEffectExecutor, com.paypal.oslo.feature.identity.login.domain.repository.InContextLoginProvider inContextLoginProvider, com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getRememberedUserUseCase) {
        return new com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl(identityLoginFlowReducer, identityLoginFlowEffectExecutor, inContextLoginProvider, getRememberedUserUseCase);
    }
}
