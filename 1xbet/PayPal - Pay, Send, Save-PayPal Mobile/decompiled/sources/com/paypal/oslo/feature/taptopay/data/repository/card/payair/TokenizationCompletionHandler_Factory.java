package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

/* loaded from: classes15.dex */
public final class TokenizationCompletionHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.payair.logic.managers.TokenManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoSizes;

    private TokenizationCompletionHandler_Factory(dagger.internal.Provider<com.payair.logic.managers.TokenManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler> provider4, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider5) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighSpeedVideoSizes = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler_Factory create(dagger.internal.Provider<com.payair.logic.managers.TokenManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler> provider4, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider5) {
        return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler newInstance(com.payair.logic.managers.TokenManager tokenManager, com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource cardDataSource, com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler activationCodeRequestHandler, com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler cardProvisionHandler, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler(tokenManager, cardDataSource, activationCodeRequestHandler, cardProvisionHandler, coroutineDispatcher);
    }
}
