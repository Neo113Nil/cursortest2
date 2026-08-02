package com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel;

/* loaded from: classes13.dex */
public final class InterstitialViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel_Factory create() {
        return com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel newInstance() {
        return new com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel_Factory();

        private InstanceHolder() {
        }
    }
}
