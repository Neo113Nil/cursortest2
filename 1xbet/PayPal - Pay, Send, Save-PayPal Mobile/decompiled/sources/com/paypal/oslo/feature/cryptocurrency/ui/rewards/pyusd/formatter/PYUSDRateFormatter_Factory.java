package com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.formatter;

/* loaded from: classes12.dex */
public final class PYUSDRateFormatter_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.formatter.PYUSDRateFormatter> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.formatter.PYUSDRateFormatter get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.formatter.PYUSDRateFormatter_Factory create() {
        return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.formatter.PYUSDRateFormatter_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.formatter.PYUSDRateFormatter newInstance() {
        return new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.formatter.PYUSDRateFormatter();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.formatter.PYUSDRateFormatter_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.formatter.PYUSDRateFormatter_Factory();

        private InstanceHolder() {
        }
    }
}
