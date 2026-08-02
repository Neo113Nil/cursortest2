package com.paypal.oslo.feature.dataprivacy.data.repository;

/* loaded from: classes12.dex */
public final class DataAccessRequestRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoSizes;

    private DataAccessRequestRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2) {
        return new com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl newInstance(com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource dataPrivacyGraphQLDataSource, com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl(dataPrivacyGraphQLDataSource, userStore);
    }
}
