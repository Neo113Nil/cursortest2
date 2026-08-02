package com.paypal.oslo.feature.inappcheckout.di;

/* loaded from: classes5.dex */
public final class InstrumentationModule_ProvideInAppCheckoutLoggerHelperFactory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> getHighSpeedVideoFpsRanges;

    private InstrumentationModule_ProvideInAppCheckoutLoggerHelperFactory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper get() {
        return provideInAppCheckoutLoggerHelper(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.di.InstrumentationModule_ProvideInAppCheckoutLoggerHelperFactory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider) {
        return new com.paypal.oslo.feature.inappcheckout.di.InstrumentationModule_ProvideInAppCheckoutLoggerHelperFactory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper provideInAppCheckoutLoggerHelper(com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession) {
        return (com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.inappcheckout.di.InstrumentationModule.INSTANCE.provideInAppCheckoutLoggerHelper(appSwitchSession));
    }
}
