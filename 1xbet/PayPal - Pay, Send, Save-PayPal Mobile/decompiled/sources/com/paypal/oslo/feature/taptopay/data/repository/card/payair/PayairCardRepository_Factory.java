package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

/* loaded from: classes15.dex */
public final class PayairCardRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimerStateHandler> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager> getInputSizeshNQ4ISI;

    private PayairCardRepository_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler> provider5, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimerStateHandler> provider6, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider7) {
        this.getInputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoSizes = provider5;
        this.getInputFormats = provider6;
        this.getHighResolutionOutputSizeshNQ4ISI = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository get() {
        return newInstance(this.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getInputFormats.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler> provider5, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimerStateHandler> provider6, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider7) {
        return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository newInstance(com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager sdkTokenManager, com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource cardDataSource, com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource cardStateDataSource, com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization cardTokenization, com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler activationCodeRequestHandler, com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimerStateHandler tokenizationTimerStateHandler, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository(sdkTokenManager, cardDataSource, cardStateDataSource, cardTokenization, activationCodeRequestHandler, tokenizationTimerStateHandler, coroutineDispatcher);
    }
}
