package com.paypal.oslo.feature.identity.shared.data.provider;

/* loaded from: classes13.dex */
public final class AndroidStringProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.shared.data.provider.AndroidStringProvider> {
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;

    private AndroidStringProvider_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.shared.data.provider.AndroidStringProvider get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.shared.data.provider.AndroidStringProvider_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.identity.shared.data.provider.AndroidStringProvider_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.shared.data.provider.AndroidStringProvider newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.identity.shared.data.provider.AndroidStringProvider(context);
    }
}
