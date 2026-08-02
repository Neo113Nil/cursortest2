package com.paypal.oslo.feature.home.data;

/* loaded from: classes12.dex */
public final class ResourceStringProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.data.ResourceStringProvider> {
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;

    private ResourceStringProvider_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.data.ResourceStringProvider get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.home.data.ResourceStringProvider_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.home.data.ResourceStringProvider_Factory(provider);
    }

    public static com.paypal.oslo.feature.home.data.ResourceStringProvider newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.home.data.ResourceStringProvider(context);
    }
}
