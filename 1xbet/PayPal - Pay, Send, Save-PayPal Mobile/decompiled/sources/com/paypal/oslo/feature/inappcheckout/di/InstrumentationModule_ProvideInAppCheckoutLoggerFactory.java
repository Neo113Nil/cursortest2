package com.paypal.oslo.feature.inappcheckout.di;

/* loaded from: classes5.dex */
public final class InstrumentationModule_ProvideInAppCheckoutLoggerFactory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> getHighSpeedVideoSizes;

    private InstrumentationModule_ProvideInAppCheckoutLoggerFactory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger get() {
        return provideInAppCheckoutLogger(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.di.InstrumentationModule_ProvideInAppCheckoutLoggerFactory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper> provider2) {
        return new com.paypal.oslo.feature.inappcheckout.di.InstrumentationModule_ProvideInAppCheckoutLoggerFactory(provider, provider2);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger provideInAppCheckoutLogger(com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper checkoutLoggerHelper) {
        return (com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.inappcheckout.di.InstrumentationModule.INSTANCE.provideInAppCheckoutLogger(appSwitchSession, checkoutLoggerHelper));
    }
}
