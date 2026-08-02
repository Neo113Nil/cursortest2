package com.paypal.oslo.feature.taptopay.ui.core.util;

/* loaded from: classes15.dex */
public final class PayLaterExpiryChecker_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker_Factory create() {
        return com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker newInstance() {
        return new com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker_Factory();

        private InstanceHolder() {
        }
    }
}
