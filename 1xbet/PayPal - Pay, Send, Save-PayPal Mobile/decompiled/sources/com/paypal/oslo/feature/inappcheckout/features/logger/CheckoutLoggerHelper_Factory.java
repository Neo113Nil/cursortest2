package com.paypal.oslo.feature.inappcheckout.features.logger;

/* loaded from: classes13.dex */
public final class CheckoutLoggerHelper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> getHighSpeedVideoFpsRangesFor;

    private CheckoutLoggerHelper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider) {
        return new com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper_Factory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper newInstance(com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession) {
        return new com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper(appSwitchSession);
    }
}
