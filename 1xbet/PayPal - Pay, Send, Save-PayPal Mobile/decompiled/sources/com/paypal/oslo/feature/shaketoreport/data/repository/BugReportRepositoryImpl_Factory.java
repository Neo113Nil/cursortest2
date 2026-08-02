package com.paypal.oslo.feature.shaketoreport.data.repository;

/* loaded from: classes14.dex */
public final class BugReportRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shaketoreport.data.repository.BugReportRepositoryImpl> {
    private final dagger.internal.Provider<kotlinx.serialization.json.Json> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shaketoreport.network.PayPalJiraCredentialApi> getHighSpeedVideoFpsRanges;

    private BugReportRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shaketoreport.network.PayPalJiraCredentialApi> provider, dagger.internal.Provider<kotlinx.serialization.json.Json> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shaketoreport.data.repository.BugReportRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.shaketoreport.data.repository.BugReportRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shaketoreport.network.PayPalJiraCredentialApi> provider, dagger.internal.Provider<kotlinx.serialization.json.Json> provider2) {
        return new com.paypal.oslo.feature.shaketoreport.data.repository.BugReportRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.shaketoreport.data.repository.BugReportRepositoryImpl newInstance(com.paypal.oslo.feature.shaketoreport.network.PayPalJiraCredentialApi payPalJiraCredentialApi, kotlinx.serialization.json.Json json) {
        return new com.paypal.oslo.feature.shaketoreport.data.repository.BugReportRepositoryImpl(payPalJiraCredentialApi, json);
    }
}
