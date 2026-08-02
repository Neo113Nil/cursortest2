package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

/* loaded from: classes15.dex */
public final class TokenizationTimer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimer> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimeProvider> getHighSpeedVideoFpsRangesFor;

    private TokenizationTimer_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimeProvider> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimer get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimer_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimeProvider> provider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimer_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimer newInstance(com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimeProvider timeProvider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimer(timeProvider);
    }
}
