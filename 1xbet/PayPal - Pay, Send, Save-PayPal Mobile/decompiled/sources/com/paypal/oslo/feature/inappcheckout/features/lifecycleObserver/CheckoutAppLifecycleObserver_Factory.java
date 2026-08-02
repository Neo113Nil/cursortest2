package com.paypal.oslo.feature.inappcheckout.features.lifecycleObserver;

/* loaded from: classes13.dex */
public final class CheckoutAppLifecycleObserver_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.features.lifecycleObserver.CheckoutAppLifecycleObserver> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.view.Lifecycle> getHighSpeedVideoSizes;

    private CheckoutAppLifecycleObserver_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> provider, dagger.internal.Provider<androidx.view.Lifecycle> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.features.lifecycleObserver.CheckoutAppLifecycleObserver get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.features.lifecycleObserver.CheckoutAppLifecycleObserver_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> provider, dagger.internal.Provider<androidx.view.Lifecycle> provider2) {
        return new com.paypal.oslo.feature.inappcheckout.features.lifecycleObserver.CheckoutAppLifecycleObserver_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.lifecycleObserver.CheckoutAppLifecycleObserver newInstance(com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer, androidx.view.Lifecycle lifecycle) {
        return new com.paypal.oslo.feature.inappcheckout.features.lifecycleObserver.CheckoutAppLifecycleObserver(analyticsTracer, lifecycle);
    }
}
