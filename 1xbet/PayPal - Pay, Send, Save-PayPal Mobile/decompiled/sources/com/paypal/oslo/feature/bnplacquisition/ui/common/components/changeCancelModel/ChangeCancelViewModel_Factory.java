package com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel;

/* loaded from: classes11.dex */
public final class ChangeCancelViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelReducer> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelSideEffectMiddleware> getHighSpeedVideoFpsRanges;

    private ChangeCancelViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelSideEffectMiddleware> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelSideEffectMiddleware> provider2) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelViewModel newInstance(com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelReducer changeCancelReducer, com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelSideEffectMiddleware changeCancelSideEffectMiddleware) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelViewModel(changeCancelReducer, changeCancelSideEffectMiddleware);
    }
}
