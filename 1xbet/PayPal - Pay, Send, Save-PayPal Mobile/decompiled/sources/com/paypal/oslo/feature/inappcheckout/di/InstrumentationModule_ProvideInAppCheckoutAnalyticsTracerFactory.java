package com.paypal.oslo.feature.inappcheckout.di;

/* loaded from: classes5.dex */
public final class InstrumentationModule_ProvideInAppCheckoutAnalyticsTracerFactory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> getHighSpeedVideoFpsRangesFor;

    private InstrumentationModule_ProvideInAppCheckoutAnalyticsTracerFactory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer get() {
        return provideInAppCheckoutAnalyticsTracer(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.di.InstrumentationModule_ProvideInAppCheckoutAnalyticsTracerFactory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider) {
        return new com.paypal.oslo.feature.inappcheckout.di.InstrumentationModule_ProvideInAppCheckoutAnalyticsTracerFactory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer provideInAppCheckoutAnalyticsTracer(com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger) {
        return (com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.inappcheckout.di.InstrumentationModule.INSTANCE.provideInAppCheckoutAnalyticsTracer(checkoutLogger));
    }
}
