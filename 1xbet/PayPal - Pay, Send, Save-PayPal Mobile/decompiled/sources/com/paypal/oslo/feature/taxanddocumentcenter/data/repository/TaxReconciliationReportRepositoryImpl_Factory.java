package com.paypal.oslo.feature.taxanddocumentcenter.data.repository;

/* loaded from: classes15.dex */
public final class TaxReconciliationReportRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReconciliationReportRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.reconciliation.CreateTaxReconciliationReportResultMapper> getHighSpeedVideoSizes;

    private TaxReconciliationReportRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.reconciliation.CreateTaxReconciliationReportResultMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReconciliationReportRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReconciliationReportRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.reconciliation.CreateTaxReconciliationReportResultMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper> provider3) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReconciliationReportRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReconciliationReportRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.reconciliation.CreateTaxReconciliationReportResultMapper createTaxReconciliationReportResultMapper, com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper callErrorToTaxDocumentCenterErrorMapper) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReconciliationReportRepositoryImpl(apolloClient, createTaxReconciliationReportResultMapper, callErrorToTaxDocumentCenterErrorMapper);
    }
}
