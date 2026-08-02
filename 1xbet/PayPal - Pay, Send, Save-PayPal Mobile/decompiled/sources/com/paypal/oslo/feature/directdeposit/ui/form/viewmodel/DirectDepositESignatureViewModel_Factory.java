package com.paypal.oslo.feature.directdeposit.ui.form.viewmodel;

/* loaded from: classes12.dex */
public final class DirectDepositESignatureViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel_Factory create() {
        return com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel newInstance() {
        return new com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel_Factory();

        private InstanceHolder() {
        }
    }
}
