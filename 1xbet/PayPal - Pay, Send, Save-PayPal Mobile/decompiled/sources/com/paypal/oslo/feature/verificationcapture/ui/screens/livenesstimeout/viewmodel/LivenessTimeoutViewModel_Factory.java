package com.paypal.oslo.feature.verificationcapture.ui.screens.livenesstimeout.viewmodel;

/* loaded from: classes15.dex */
public final class LivenessTimeoutViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.ui.screens.livenesstimeout.viewmodel.LivenessTimeoutViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.livenesstimeout.reducer.LivenessTimeoutReducer> Camera2StreamConfigurationMap;

    private LivenessTimeoutViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.livenesstimeout.reducer.LivenessTimeoutReducer> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.ui.screens.livenesstimeout.viewmodel.LivenessTimeoutViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.livenesstimeout.viewmodel.LivenessTimeoutViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.livenesstimeout.reducer.LivenessTimeoutReducer> provider) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.livenesstimeout.viewmodel.LivenessTimeoutViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.livenesstimeout.viewmodel.LivenessTimeoutViewModel newInstance(com.paypal.oslo.feature.verificationcapture.ui.screens.livenesstimeout.reducer.LivenessTimeoutReducer livenessTimeoutReducer) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.livenesstimeout.viewmodel.LivenessTimeoutViewModel(livenessTimeoutReducer);
    }
}
