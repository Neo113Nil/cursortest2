package com.paypal.oslo.feature.inappcheckout.data.repository;

/* loaded from: classes13.dex */
public final class AuthorizeBillingAgreementRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.data.repository.AuthorizeBillingAgreementRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper> getHighSpeedVideoFpsRangesFor;

    private AuthorizeBillingAgreementRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider4) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.data.repository.AuthorizeBillingAgreementRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.AuthorizeBillingAgreementRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider4) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.AuthorizeBillingAgreementRepositoryImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.AuthorizeBillingAgreementRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper contingencyMapper, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.AuthorizeBillingAgreementRepositoryImpl(apolloClient, contingencyMapper, checkoutLogger, appSwitchSession);
    }
}
