package com.paypal.oslo.feature.identity.accountswitch.domain.usecase;

/* loaded from: classes12.dex */
public final class ProcessAuthIntentUseCaseImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ProcessAuthIntentUseCaseImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.RefreshUserStoreUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ObserveLinkAccountCompletionUseCase> getHighSpeedVideoSizes;

    private ProcessAuthIntentUseCaseImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.RefreshUserStoreUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ObserveLinkAccountCompletionUseCase> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ProcessAuthIntentUseCaseImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ProcessAuthIntentUseCaseImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.RefreshUserStoreUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ObserveLinkAccountCompletionUseCase> provider2) {
        return new com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ProcessAuthIntentUseCaseImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ProcessAuthIntentUseCaseImpl newInstance(com.paypal.oslo.feature.identity.accountswitch.domain.usecase.RefreshUserStoreUseCase refreshUserStoreUseCase, com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ObserveLinkAccountCompletionUseCase observeLinkAccountCompletionUseCase) {
        return new com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ProcessAuthIntentUseCaseImpl(refreshUserStoreUseCase, observeLinkAccountCompletionUseCase);
    }
}
