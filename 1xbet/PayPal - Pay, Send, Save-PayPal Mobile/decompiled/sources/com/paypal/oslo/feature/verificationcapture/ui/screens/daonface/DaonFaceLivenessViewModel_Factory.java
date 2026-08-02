package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

/* loaded from: classes15.dex */
public final class DaonFaceLivenessViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel_Factory create() {
        return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel newInstance() {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel_Factory();

        private InstanceHolder() {
        }
    }
}
