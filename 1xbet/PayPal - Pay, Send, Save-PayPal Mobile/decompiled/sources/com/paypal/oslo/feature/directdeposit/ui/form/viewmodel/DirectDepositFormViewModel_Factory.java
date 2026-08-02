package com.paypal.oslo.feature.directdeposit.ui.form.viewmodel;

/* loaded from: classes12.dex */
public final class DirectDepositFormViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel_Factory create() {
        return com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel newInstance() {
        return new com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel_Factory();

        private InstanceHolder() {
        }
    }
}
