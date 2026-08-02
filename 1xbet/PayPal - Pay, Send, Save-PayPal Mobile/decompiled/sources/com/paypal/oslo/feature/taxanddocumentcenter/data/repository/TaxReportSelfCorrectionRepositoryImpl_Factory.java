package com.paypal.oslo.feature.taxanddocumentcenter.data.repository;

/* loaded from: classes15.dex */
public final class TaxReportSelfCorrectionRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSelfCorrectionRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.selfcorrection.RequestTaxReportSelfCorrectionResultMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private TaxReportSelfCorrectionRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.selfcorrection.RequestTaxReportSelfCorrectionResultMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSelfCorrectionRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSelfCorrectionRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.selfcorrection.RequestTaxReportSelfCorrectionResultMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper> provider3) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSelfCorrectionRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSelfCorrectionRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.selfcorrection.RequestTaxReportSelfCorrectionResultMapper requestTaxReportSelfCorrectionResultMapper, com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper callErrorToTaxDocumentCenterErrorMapper) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSelfCorrectionRepositoryImpl(apolloClient, requestTaxReportSelfCorrectionResultMapper, callErrorToTaxDocumentCenterErrorMapper);
    }
}
