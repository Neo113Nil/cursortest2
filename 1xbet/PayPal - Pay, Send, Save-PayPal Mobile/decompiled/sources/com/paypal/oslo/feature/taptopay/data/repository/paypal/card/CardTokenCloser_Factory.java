package com.paypal.oslo.feature.taptopay.data.repository.paypal.card;

/* loaded from: classes15.dex */
public final class CardTokenCloser_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenCloser> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private CardTokenCloser_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenCloser get() {
        return newInstance(this.getHighSpeedVideoSizes);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenCloser_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenCloser_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenCloser newInstance(javax.inject.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenCloser(provider);
    }
}
