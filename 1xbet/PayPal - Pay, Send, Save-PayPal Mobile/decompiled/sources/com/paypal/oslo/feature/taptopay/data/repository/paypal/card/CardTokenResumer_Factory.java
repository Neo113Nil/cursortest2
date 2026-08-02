package com.paypal.oslo.feature.taptopay.data.repository.paypal.card;

/* loaded from: classes15.dex */
public final class CardTokenResumer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenResumer> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private CardTokenResumer_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenResumer get() {
        return newInstance(this.getHighSpeedVideoSizes);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenResumer_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenResumer_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenResumer newInstance(javax.inject.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenResumer(provider);
    }
}
