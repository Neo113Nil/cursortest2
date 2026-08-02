package com.paypal.oslo.feature.debitcard.shared.util;

/* loaded from: classes12.dex */
public final class DebitCardDeepLinkMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.shared.util.DebitCardDeepLinkMapper> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.shared.util.DebitCardDeepLinkMapper get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.debitcard.shared.util.DebitCardDeepLinkMapper_Factory create() {
        return com.paypal.oslo.feature.debitcard.shared.util.DebitCardDeepLinkMapper_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.debitcard.shared.util.DebitCardDeepLinkMapper newInstance() {
        return new com.paypal.oslo.feature.debitcard.shared.util.DebitCardDeepLinkMapper();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.debitcard.shared.util.DebitCardDeepLinkMapper_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.debitcard.shared.util.DebitCardDeepLinkMapper_Factory();

        private InstanceHolder() {
        }
    }
}
