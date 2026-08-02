package com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.viewmodel;

/* loaded from: classes15.dex */
public final class GenericFailureViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.viewmodel.GenericFailureViewModel> {
    private final dagger.internal.Provider<androidx.view.SavedStateHandle> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.reducer.GenericFailureReducer> getHighResolutionOutputSizeshNQ4ISI;

    private GenericFailureViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.reducer.GenericFailureReducer> provider, dagger.internal.Provider<androidx.view.SavedStateHandle> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.viewmodel.GenericFailureViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.viewmodel.GenericFailureViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.reducer.GenericFailureReducer> provider, dagger.internal.Provider<androidx.view.SavedStateHandle> provider2) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.viewmodel.GenericFailureViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.viewmodel.GenericFailureViewModel newInstance(com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.reducer.GenericFailureReducer genericFailureReducer, androidx.view.SavedStateHandle savedStateHandle) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.viewmodel.GenericFailureViewModel(genericFailureReducer, savedStateHandle);
    }
}
