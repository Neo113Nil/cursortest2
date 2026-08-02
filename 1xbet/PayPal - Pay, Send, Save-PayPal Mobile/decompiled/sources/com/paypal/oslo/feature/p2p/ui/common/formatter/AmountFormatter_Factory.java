package com.paypal.oslo.feature.p2p.ui.common.formatter;

/* loaded from: classes13.dex */
public final class AmountFormatter_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter_Factory create() {
        return com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter newInstance() {
        return new com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter_Factory();

        private InstanceHolder() {
        }
    }
}
