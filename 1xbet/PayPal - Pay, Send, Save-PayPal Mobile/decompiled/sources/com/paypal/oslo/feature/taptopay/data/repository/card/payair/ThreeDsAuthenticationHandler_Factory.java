package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

/* loaded from: classes15.dex */
public final class ThreeDsAuthenticationHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.payair.logic.managers.TokenManager> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler> getHighSpeedVideoSizes;

    private ThreeDsAuthenticationHandler_Factory(dagger.internal.Provider<com.payair.logic.managers.TokenManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimer> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher> provider4, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider5) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.Camera2StreamConfigurationMap = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler_Factory create(dagger.internal.Provider<com.payair.logic.managers.TokenManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimer> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher> provider4, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider5) {
        return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler newInstance(com.payair.logic.managers.TokenManager tokenManager, com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler cardProvisionHandler, com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimer tokenizationTimer, com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher payairCardPaymentKeysReplenisher, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler(tokenManager, cardProvisionHandler, tokenizationTimer, payairCardPaymentKeysReplenisher, coroutineDispatcher);
    }
}
