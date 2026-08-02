package com.paypal.oslo.feature.consumerprivacy.data.apollo;

/* loaded from: classes11.dex */
public final class AccountVisibilityLabelApiImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityLabelApiImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private AccountVisibilityLabelApiImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityLabelApiImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityLabelApiImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityLabelApiImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityLabelApiImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityLabelApiImpl(apolloClient);
    }
}
