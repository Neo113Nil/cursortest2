package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

/* loaded from: classes15.dex */
public final class TermsAndConditionsHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler> {
    private final dagger.internal.Provider<com.payair.logic.managers.ConfigurationManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoSizes;

    private TermsAndConditionsHandler_Factory(dagger.internal.Provider<com.payair.logic.managers.ConfigurationManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler_Factory create(dagger.internal.Provider<com.payair.logic.managers.ConfigurationManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler newInstance(com.payair.logic.managers.ConfigurationManager configurationManager, com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler tokenizationCompletionHandler, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler(configurationManager, tokenizationCompletionHandler, coroutineDispatcher);
    }
}
