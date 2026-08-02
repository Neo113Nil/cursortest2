package com.paypal.oslo.core.appidentity.data;

/* loaded from: classes10.dex */
public final class DistributionChannelProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.core.appidentity.data.DistributionChannelProvider> {
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;

    private DistributionChannelProvider_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.appidentity.data.DistributionChannelProvider get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.appidentity.data.DistributionChannelProvider_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.core.appidentity.data.DistributionChannelProvider_Factory(provider);
    }

    public static com.paypal.oslo.core.appidentity.data.DistributionChannelProvider newInstance(android.content.Context context) {
        return new com.paypal.oslo.core.appidentity.data.DistributionChannelProvider(context);
    }
}
