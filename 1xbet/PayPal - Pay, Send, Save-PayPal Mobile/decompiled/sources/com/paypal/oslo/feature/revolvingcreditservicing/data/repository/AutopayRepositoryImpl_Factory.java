package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

/* loaded from: classes14.dex */
public final class AutopayRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.DynamicConfigManager> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private AutopayRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.DynamicConfigManager> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.DynamicConfigManager> provider2) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.DynamicConfigManager dynamicConfigManager) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl(apolloClient, dynamicConfigManager);
    }
}
