package com.paypal.oslo.core.session;

/* loaded from: classes10.dex */
public final class ApolloCacheClearer_Factory implements dagger.internal.Factory<com.paypal.oslo.core.session.ApolloCacheClearer> {
    private final dagger.internal.Provider<com.apollographql.apollo.cache.normalized.ApolloStore> getHighSpeedVideoFpsRangesFor;

    private ApolloCacheClearer_Factory(dagger.internal.Provider<com.apollographql.apollo.cache.normalized.ApolloStore> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.session.ApolloCacheClearer get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRangesFor));
    }

    public static com.paypal.oslo.core.session.ApolloCacheClearer_Factory create(dagger.internal.Provider<com.apollographql.apollo.cache.normalized.ApolloStore> provider) {
        return new com.paypal.oslo.core.session.ApolloCacheClearer_Factory(provider);
    }

    public static com.paypal.oslo.core.session.ApolloCacheClearer newInstance(dagger.Lazy<com.apollographql.apollo.cache.normalized.ApolloStore> lazy) {
        return new com.paypal.oslo.core.session.ApolloCacheClearer(lazy);
    }
}
