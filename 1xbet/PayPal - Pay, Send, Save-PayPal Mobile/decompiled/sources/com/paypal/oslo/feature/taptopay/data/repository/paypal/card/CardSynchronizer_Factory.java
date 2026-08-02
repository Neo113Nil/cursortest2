package com.paypal.oslo.feature.taptopay.data.repository.paypal.card;

/* loaded from: classes15.dex */
public final class CardSynchronizer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private CardSynchronizer_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer get() {
        return newInstance(this.getHighSpeedVideoFpsRanges);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer newInstance(javax.inject.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer(provider);
    }
}
