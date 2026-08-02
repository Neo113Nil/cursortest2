package com.paypal.oslo.feature.xoom.domain.usecase;

/* loaded from: classes16.dex */
public final class CreateAccountLinkingInitialUrlUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.xoom.domain.usecase.CreateAccountLinkingInitialUrlUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.encoder.Base64Encoder> getHighSpeedVideoSizes;

    private CreateAccountLinkingInitialUrlUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.encoder.Base64Encoder> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.xoom.domain.usecase.CreateAccountLinkingInitialUrlUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.xoom.domain.usecase.CreateAccountLinkingInitialUrlUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.encoder.Base64Encoder> provider2) {
        return new com.paypal.oslo.feature.xoom.domain.usecase.CreateAccountLinkingInitialUrlUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.xoom.domain.usecase.CreateAccountLinkingInitialUrlUseCase newInstance(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration, com.paypal.oslo.feature.xoom.domain.encoder.Base64Encoder base64Encoder) {
        return new com.paypal.oslo.feature.xoom.domain.usecase.CreateAccountLinkingInitialUrlUseCase(dynamicConfiguration, base64Encoder);
    }
}
