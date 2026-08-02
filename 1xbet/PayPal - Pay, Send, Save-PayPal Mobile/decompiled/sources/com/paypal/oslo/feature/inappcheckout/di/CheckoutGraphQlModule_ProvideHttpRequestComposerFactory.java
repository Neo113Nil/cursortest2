package com.paypal.oslo.feature.inappcheckout.di;

/* loaded from: classes5.dex */
public final class CheckoutGraphQlModule_ProvideHttpRequestComposerFactory implements dagger.internal.Factory<com.apollographql.apollo.api.http.HttpRequestComposer> {
    private final dagger.internal.Provider<com.apollographql.apollo.api.http.DefaultHttpRequestComposer> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.security.RiskDataProvider> getHighSpeedVideoFpsRangesFor;

    private CheckoutGraphQlModule_ProvideHttpRequestComposerFactory(dagger.internal.Provider<com.apollographql.apollo.api.http.DefaultHttpRequestComposer> provider, dagger.internal.Provider<com.paypal.oslo.core.security.RiskDataProvider> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.apollographql.apollo.api.http.HttpRequestComposer get() {
        return provideHttpRequestComposer(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.di.CheckoutGraphQlModule_ProvideHttpRequestComposerFactory create(dagger.internal.Provider<com.apollographql.apollo.api.http.DefaultHttpRequestComposer> provider, dagger.internal.Provider<com.paypal.oslo.core.security.RiskDataProvider> provider2) {
        return new com.paypal.oslo.feature.inappcheckout.di.CheckoutGraphQlModule_ProvideHttpRequestComposerFactory(provider, provider2);
    }

    public static com.apollographql.apollo.api.http.HttpRequestComposer provideHttpRequestComposer(com.apollographql.apollo.api.http.DefaultHttpRequestComposer defaultHttpRequestComposer, com.paypal.oslo.core.security.RiskDataProvider riskDataProvider) {
        return (com.apollographql.apollo.api.http.HttpRequestComposer) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.inappcheckout.di.CheckoutGraphQlModule.INSTANCE.provideHttpRequestComposer(defaultHttpRequestComposer, riskDataProvider));
    }
}
