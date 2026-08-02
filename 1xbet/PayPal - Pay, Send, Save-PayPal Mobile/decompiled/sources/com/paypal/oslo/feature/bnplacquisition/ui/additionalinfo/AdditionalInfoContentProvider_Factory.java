package com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo;

/* loaded from: classes11.dex */
public final class AdditionalInfoContentProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoContentProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoContentProvider get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoContentProvider_Factory create() {
        return com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoContentProvider_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoContentProvider newInstance() {
        return new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoContentProvider();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoContentProvider_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoContentProvider_Factory();

        private InstanceHolder() {
        }
    }
}
