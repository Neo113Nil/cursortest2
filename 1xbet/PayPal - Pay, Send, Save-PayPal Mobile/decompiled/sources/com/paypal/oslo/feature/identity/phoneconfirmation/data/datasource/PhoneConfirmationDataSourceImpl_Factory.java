package com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource;

/* loaded from: classes13.dex */
public final class PhoneConfirmationDataSourceImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSourceImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper> getHighResolutionOutputSizeshNQ4ISI;

    private PhoneConfirmationDataSourceImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSourceImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.Camera2StreamConfigurationMap), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSourceImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper> provider2) {
        return new com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSourceImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSourceImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper phoneConfirmationErrorMapper) {
        return new com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSourceImpl(lazy, phoneConfirmationErrorMapper);
    }
}
