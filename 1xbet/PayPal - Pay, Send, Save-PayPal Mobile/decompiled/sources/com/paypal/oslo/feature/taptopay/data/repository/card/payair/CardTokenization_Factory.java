package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

/* loaded from: classes15.dex */
public final class CardTokenization_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.payair.logic.managers.TokenManager> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.init.HceConfigurationProvider> getHighSpeedVideoSizes;

    private CardTokenization_Factory(dagger.internal.Provider<com.payair.logic.managers.TokenManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.init.HceConfigurationProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken> provider4, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider5) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization_Factory create(dagger.internal.Provider<com.payair.logic.managers.TokenManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.init.HceConfigurationProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken> provider4, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider5) {
        return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization newInstance(com.payair.logic.managers.TokenManager tokenManager, com.paypal.oslo.feature.taptopay.data.payair.init.HceConfigurationProvider hceConfigurationProvider, com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler termsAndConditionsHandler, com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken authToken, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization(tokenManager, hceConfigurationProvider, termsAndConditionsHandler, authToken, coroutineDispatcher);
    }
}
