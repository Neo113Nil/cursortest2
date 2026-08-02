package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

/* loaded from: classes15.dex */
public final class ActivationCodeSubmissionHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimer> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.payair.logic.managers.TokenManager> getHighSpeedVideoSizes;

    private ActivationCodeSubmissionHandler_Factory(dagger.internal.Provider<com.payair.logic.managers.TokenManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimer> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher> provider4, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider5) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler_Factory create(dagger.internal.Provider<com.payair.logic.managers.TokenManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimer> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher> provider4, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider5) {
        return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler newInstance(com.payair.logic.managers.TokenManager tokenManager, com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler cardProvisionHandler, com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimer tokenizationTimer, com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher payairCardPaymentKeysReplenisher, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler(tokenManager, cardProvisionHandler, tokenizationTimer, payairCardPaymentKeysReplenisher, coroutineDispatcher);
    }
}
