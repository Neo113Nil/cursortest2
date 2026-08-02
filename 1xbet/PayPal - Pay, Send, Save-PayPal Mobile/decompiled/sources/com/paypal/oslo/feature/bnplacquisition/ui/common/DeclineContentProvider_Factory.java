package com.paypal.oslo.feature.bnplacquisition.ui.common;

/* loaded from: classes11.dex */
public final class DeclineContentProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.common.DeclineContentProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.common.DeclineContentProvider get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.common.DeclineContentProvider_Factory create() {
        return com.paypal.oslo.feature.bnplacquisition.ui.common.DeclineContentProvider_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.common.DeclineContentProvider newInstance() {
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.DeclineContentProvider();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplacquisition.ui.common.DeclineContentProvider_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.bnplacquisition.ui.common.DeclineContentProvider_Factory();

        private InstanceHolder() {
        }
    }
}
