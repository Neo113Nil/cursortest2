package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain;

/* loaded from: classes15.dex */
public final class IabWebBaseUrlProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabWebBaseUrlProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.network.graphql.config.GraphQlConfig> getHighSpeedVideoFpsRanges;

    private IabWebBaseUrlProvider_Factory(dagger.internal.Provider<com.paypal.oslo.core.network.graphql.config.GraphQlConfig> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabWebBaseUrlProvider get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabWebBaseUrlProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.core.network.graphql.config.GraphQlConfig> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabWebBaseUrlProvider_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabWebBaseUrlProvider newInstance(com.paypal.oslo.core.network.graphql.config.GraphQlConfig graphQlConfig) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabWebBaseUrlProvider(graphQlConfig);
    }
}
