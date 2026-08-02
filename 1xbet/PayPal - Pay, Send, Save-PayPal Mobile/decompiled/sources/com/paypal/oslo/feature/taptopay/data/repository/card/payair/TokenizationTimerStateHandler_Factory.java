package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

/* loaded from: classes15.dex */
public final class TokenizationTimerStateHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimerStateHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimer> getHighSpeedVideoFpsRangesFor;

    private TokenizationTimerStateHandler_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimer> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimerStateHandler get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimerStateHandler_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimer> provider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimerStateHandler_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimerStateHandler newInstance(com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimer tokenizationTimer) {
        return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimerStateHandler(tokenizationTimer);
    }
}
