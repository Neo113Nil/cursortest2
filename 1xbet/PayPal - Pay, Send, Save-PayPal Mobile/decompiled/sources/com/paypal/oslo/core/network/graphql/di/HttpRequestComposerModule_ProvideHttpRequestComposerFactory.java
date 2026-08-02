package com.paypal.oslo.core.network.graphql.di;

/* loaded from: classes4.dex */
public final class HttpRequestComposerModule_ProvideHttpRequestComposerFactory implements dagger.internal.Factory<com.apollographql.apollo.api.http.HttpRequestComposer> {
    private final dagger.internal.Provider<com.paypal.oslo.core.security.RiskDataProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.apollographql.apollo.api.http.DefaultHttpRequestComposer> getHighSpeedVideoFpsRangesFor;

    private HttpRequestComposerModule_ProvideHttpRequestComposerFactory(dagger.internal.Provider<com.apollographql.apollo.api.http.DefaultHttpRequestComposer> provider, dagger.internal.Provider<com.paypal.oslo.core.security.RiskDataProvider> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.apollographql.apollo.api.http.HttpRequestComposer get() {
        return provideHttpRequestComposer(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.core.network.graphql.di.HttpRequestComposerModule_ProvideHttpRequestComposerFactory create(dagger.internal.Provider<com.apollographql.apollo.api.http.DefaultHttpRequestComposer> provider, dagger.internal.Provider<com.paypal.oslo.core.security.RiskDataProvider> provider2) {
        return new com.paypal.oslo.core.network.graphql.di.HttpRequestComposerModule_ProvideHttpRequestComposerFactory(provider, provider2);
    }

    public static com.apollographql.apollo.api.http.HttpRequestComposer provideHttpRequestComposer(com.apollographql.apollo.api.http.DefaultHttpRequestComposer defaultHttpRequestComposer, com.paypal.oslo.core.security.RiskDataProvider riskDataProvider) {
        return (com.apollographql.apollo.api.http.HttpRequestComposer) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.network.graphql.di.HttpRequestComposerModule.INSTANCE.provideHttpRequestComposer(defaultHttpRequestComposer, riskDataProvider));
    }
}
