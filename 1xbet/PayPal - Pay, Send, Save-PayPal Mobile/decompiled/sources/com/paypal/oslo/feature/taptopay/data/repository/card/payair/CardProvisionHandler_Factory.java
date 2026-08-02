package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

/* loaded from: classes15.dex */
public final class CardProvisionHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource> getHighSpeedVideoFpsRanges;

    private CardProvisionHandler_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource> provider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler newInstance(com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource cardStateDataSource) {
        return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler(cardStateDataSource);
    }
}
