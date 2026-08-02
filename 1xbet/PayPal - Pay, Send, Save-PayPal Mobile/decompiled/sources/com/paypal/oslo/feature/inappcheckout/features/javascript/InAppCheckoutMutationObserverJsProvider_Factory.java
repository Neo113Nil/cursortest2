package com.paypal.oslo.feature.inappcheckout.features.javascript;

/* loaded from: classes13.dex */
public final class InAppCheckoutMutationObserverJsProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.features.javascript.InAppCheckoutMutationObserverJsProvider> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoSizes;

    private InAppCheckoutMutationObserverJsProvider_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.features.javascript.InAppCheckoutMutationObserverJsProvider get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.features.javascript.InAppCheckoutMutationObserverJsProvider_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.inappcheckout.features.javascript.InAppCheckoutMutationObserverJsProvider_Factory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.javascript.InAppCheckoutMutationObserverJsProvider newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.inappcheckout.features.javascript.InAppCheckoutMutationObserverJsProvider(context);
    }
}
