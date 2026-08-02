package com.paypal.oslo.feature.directdeposit.ui.intro.viewmodel;

/* loaded from: classes12.dex */
public final class DirectDepositIntroViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.directdeposit.ui.intro.viewmodel.DirectDepositIntroViewModel> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.directdeposit.ui.intro.viewmodel.DirectDepositIntroViewModel get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.directdeposit.ui.intro.viewmodel.DirectDepositIntroViewModel_Factory create() {
        return com.paypal.oslo.feature.directdeposit.ui.intro.viewmodel.DirectDepositIntroViewModel_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.directdeposit.ui.intro.viewmodel.DirectDepositIntroViewModel newInstance() {
        return new com.paypal.oslo.feature.directdeposit.ui.intro.viewmodel.DirectDepositIntroViewModel();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.directdeposit.ui.intro.viewmodel.DirectDepositIntroViewModel_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.directdeposit.ui.intro.viewmodel.DirectDepositIntroViewModel_Factory();

        private InstanceHolder() {
        }
    }
}
