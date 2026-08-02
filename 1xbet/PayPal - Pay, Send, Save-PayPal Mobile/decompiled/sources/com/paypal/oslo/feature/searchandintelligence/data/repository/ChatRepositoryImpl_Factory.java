package com.paypal.oslo.feature.searchandintelligence.data.repository;

/* loaded from: classes14.dex */
public final class ChatRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.data.repository.ChatRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase<com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse>> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private ChatRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase<com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse>> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.data.repository.ChatRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.searchandintelligence.data.repository.ChatRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase<com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse>> provider2) {
        return new com.paypal.oslo.feature.searchandintelligence.data.repository.ChatRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.searchandintelligence.data.repository.ChatRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase<com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse> subscribeToSseUseCase) {
        return new com.paypal.oslo.feature.searchandintelligence.data.repository.ChatRepositoryImpl(apolloClient, subscribeToSseUseCase);
    }
}
