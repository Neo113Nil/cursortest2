package com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount;

/* loaded from: classes14.dex */
public final class PpwEnterAmountViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.view.SavedStateHandle> getHighSpeedVideoFpsRangesFor;

    private PpwEnterAmountViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountReducer> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2, dagger.internal.Provider<androidx.view.SavedStateHandle> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountReducer> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2, dagger.internal.Provider<androidx.view.SavedStateHandle> provider3) {
        return new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountViewModel newInstance(com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountReducer ppwEnterAmountReducer, com.paypal.oslo.core.userstore.UserStore userStore, androidx.view.SavedStateHandle savedStateHandle) {
        return new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountViewModel(ppwEnterAmountReducer, userStore, savedStateHandle);
    }
}
