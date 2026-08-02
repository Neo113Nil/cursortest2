package com.paypal.oslo.feature.taxanddocumentcenter.data.repository;

/* loaded from: classes15.dex */
public final class RequestStatementRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.data.repository.RequestStatementRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.customstatement.GenerateStatementRequestMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.customstatement.RequestStatementMapper> getHighSpeedVideoSizes;

    private RequestStatementRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.customstatement.GenerateStatementRequestMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.customstatement.RequestStatementMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper> provider4) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.data.repository.RequestStatementRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.repository.RequestStatementRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.customstatement.GenerateStatementRequestMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.customstatement.RequestStatementMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper> provider4) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.repository.RequestStatementRepositoryImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.repository.RequestStatementRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.customstatement.GenerateStatementRequestMapper generateStatementRequestMapper, com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.customstatement.RequestStatementMapper requestStatementMapper, com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper callErrorToTaxDocumentCenterErrorMapper) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.repository.RequestStatementRepositoryImpl(apolloClient, generateStatementRequestMapper, requestStatementMapper, callErrorToTaxDocumentCenterErrorMapper);
    }
}
