package com.paypal.oslo.feature.dataprivacy.ui.viewmodel;

/* loaded from: classes12.dex */
public final class DataAccessConfirmationViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessConfirmationViewModel> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessConfirmationViewModel get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessConfirmationViewModel_Factory create() {
        return com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessConfirmationViewModel_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessConfirmationViewModel newInstance() {
        return new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessConfirmationViewModel();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessConfirmationViewModel_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessConfirmationViewModel_Factory();

        private InstanceHolder() {
        }
    }
}
