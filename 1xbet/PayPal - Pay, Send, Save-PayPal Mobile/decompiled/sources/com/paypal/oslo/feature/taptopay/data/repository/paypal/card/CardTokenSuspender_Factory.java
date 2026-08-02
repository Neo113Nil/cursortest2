package com.paypal.oslo.feature.taptopay.data.repository.paypal.card;

/* loaded from: classes15.dex */
public final class CardTokenSuspender_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenSuspender> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private CardTokenSuspender_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenSuspender get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenSuspender_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenSuspender_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenSuspender newInstance(javax.inject.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenSuspender(provider);
    }
}
