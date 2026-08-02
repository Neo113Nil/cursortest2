package com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.viewmodel;

/* loaded from: classes15.dex */
public final class IdCaptureTimeoutViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.viewmodel.IdCaptureTimeoutViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.reducer.IdCaptureTimeoutReducer> getHighSpeedVideoSizes;

    private IdCaptureTimeoutViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.reducer.IdCaptureTimeoutReducer> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.viewmodel.IdCaptureTimeoutViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.viewmodel.IdCaptureTimeoutViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.reducer.IdCaptureTimeoutReducer> provider) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.viewmodel.IdCaptureTimeoutViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.viewmodel.IdCaptureTimeoutViewModel newInstance(com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.reducer.IdCaptureTimeoutReducer idCaptureTimeoutReducer) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.viewmodel.IdCaptureTimeoutViewModel(idCaptureTimeoutReducer);
    }
}
