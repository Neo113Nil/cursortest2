package com.paypal.oslo.feature.dataprivacy.data.repository;

/* loaded from: classes12.dex */
public final class UserAccountRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.dataprivacy.data.repository.UserAccountRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource> getHighSpeedVideoFpsRangesFor;

    private UserAccountRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.dataprivacy.data.repository.UserAccountRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.dataprivacy.data.repository.UserAccountRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2) {
        return new com.paypal.oslo.feature.dataprivacy.data.repository.UserAccountRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.dataprivacy.data.repository.UserAccountRepositoryImpl newInstance(com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource dataPrivacyGraphQLDataSource, com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.dataprivacy.data.repository.UserAccountRepositoryImpl(dataPrivacyGraphQLDataSource, userStore);
    }
}
