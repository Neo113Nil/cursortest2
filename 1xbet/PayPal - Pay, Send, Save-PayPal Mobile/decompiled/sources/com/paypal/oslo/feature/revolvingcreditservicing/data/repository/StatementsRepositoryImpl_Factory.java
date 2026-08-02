package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

/* loaded from: classes14.dex */
public final class StatementsRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailsResponseMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.api.StatementService> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.storage.FileStorage> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private StatementsRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.api.StatementService> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.storage.FileStorage> provider3, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailsResponseMapper> provider4, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider5) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.api.StatementService> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.storage.FileStorage> provider3, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailsResponseMapper> provider4, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider5) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.revolvingcreditservicing.data.api.StatementService statementService, com.paypal.oslo.feature.revolvingcreditservicing.data.storage.FileStorage fileStorage, com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailsResponseMapper statementDetailsResponseMapper, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl(apolloClient, statementService, fileStorage, statementDetailsResponseMapper, coroutineDispatcher);
    }
}
