package com.paypal.oslo.feature.p2p.ui.success.viewmodel;

/* loaded from: classes13.dex */
public final class SuccessViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.ui.success.viewmodel.SuccessViewModel> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.ui.success.viewmodel.SuccessViewModel get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.p2p.ui.success.viewmodel.SuccessViewModel_Factory create() {
        return com.paypal.oslo.feature.p2p.ui.success.viewmodel.SuccessViewModel_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.p2p.ui.success.viewmodel.SuccessViewModel newInstance() {
        return new com.paypal.oslo.feature.p2p.ui.success.viewmodel.SuccessViewModel();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.p2p.ui.success.viewmodel.SuccessViewModel_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.p2p.ui.success.viewmodel.SuccessViewModel_Factory();

        private InstanceHolder() {
        }
    }
}
