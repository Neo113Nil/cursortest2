package com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview;

/* loaded from: classes11.dex */
public final class VccAnalyticsHelper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsHelper> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsHelper get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsHelper_Factory create() {
        return com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsHelper_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsHelper newInstance() {
        return new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsHelper();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsHelper_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsHelper_Factory();

        private InstanceHolder() {
        }
    }
}
