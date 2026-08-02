package com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo;

/* loaded from: classes11.dex */
public final class AdditionalInfoReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoReducer_Factory create() {
        return com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoReducer_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoReducer newInstance() {
        return new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoReducer_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoReducer_Factory();

        private InstanceHolder() {
        }
    }
}
