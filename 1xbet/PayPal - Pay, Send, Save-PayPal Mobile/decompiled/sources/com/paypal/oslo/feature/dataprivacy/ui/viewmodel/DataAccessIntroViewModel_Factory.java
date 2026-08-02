package com.paypal.oslo.feature.dataprivacy.ui.viewmodel;

/* loaded from: classes12.dex */
public final class DataAccessIntroViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessIntroViewModel> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessIntroViewModel get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessIntroViewModel_Factory create() {
        return com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessIntroViewModel_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessIntroViewModel newInstance() {
        return new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessIntroViewModel();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessIntroViewModel_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessIntroViewModel_Factory();

        private InstanceHolder() {
        }
    }
}
