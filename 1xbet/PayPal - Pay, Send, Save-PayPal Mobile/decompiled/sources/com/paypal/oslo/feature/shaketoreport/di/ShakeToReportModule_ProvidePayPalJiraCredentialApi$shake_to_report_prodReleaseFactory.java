package com.paypal.oslo.feature.shaketoreport.di;

/* loaded from: classes5.dex */
public final class ShakeToReportModule_ProvidePayPalJiraCredentialApi$shake_to_report_prodReleaseFactory implements dagger.internal.Factory<com.paypal.oslo.feature.shaketoreport.network.PayPalJiraCredentialApi> {
    private final dagger.internal.Provider<retrofit2.Retrofit> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shaketoreport.di.JiraOkHttpClientProvider> getHighSpeedVideoSizes;

    private ShakeToReportModule_ProvidePayPalJiraCredentialApi$shake_to_report_prodReleaseFactory(dagger.internal.Provider<retrofit2.Retrofit> provider, dagger.internal.Provider<com.paypal.oslo.feature.shaketoreport.di.JiraOkHttpClientProvider> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shaketoreport.network.PayPalJiraCredentialApi get() {
        return providePayPalJiraCredentialApi$shake_to_report_prodRelease(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.shaketoreport.di.ShakeToReportModule_ProvidePayPalJiraCredentialApi$shake_to_report_prodReleaseFactory create(dagger.internal.Provider<retrofit2.Retrofit> provider, dagger.internal.Provider<com.paypal.oslo.feature.shaketoreport.di.JiraOkHttpClientProvider> provider2) {
        return new com.paypal.oslo.feature.shaketoreport.di.ShakeToReportModule_ProvidePayPalJiraCredentialApi$shake_to_report_prodReleaseFactory(provider, provider2);
    }

    public static com.paypal.oslo.feature.shaketoreport.network.PayPalJiraCredentialApi providePayPalJiraCredentialApi$shake_to_report_prodRelease(retrofit2.Retrofit retrofit, com.paypal.oslo.feature.shaketoreport.di.JiraOkHttpClientProvider jiraOkHttpClientProvider) {
        return (com.paypal.oslo.feature.shaketoreport.network.PayPalJiraCredentialApi) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.shaketoreport.di.ShakeToReportModule.INSTANCE.providePayPalJiraCredentialApi$shake_to_report_prodRelease(retrofit, jiraOkHttpClientProvider));
    }
}
