package com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview;

/* loaded from: classes11.dex */
public final class VirtualCardOverviewContentProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewContentProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewContentProvider get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewContentProvider_Factory create() {
        return com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewContentProvider_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewContentProvider newInstance() {
        return new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewContentProvider();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewContentProvider_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewContentProvider_Factory();

        private InstanceHolder() {
        }
    }
}
