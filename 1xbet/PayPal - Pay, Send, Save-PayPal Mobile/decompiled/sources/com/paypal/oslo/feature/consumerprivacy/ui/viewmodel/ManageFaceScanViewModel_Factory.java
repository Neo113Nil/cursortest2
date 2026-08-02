package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

/* loaded from: classes12.dex */
public final class ManageFaceScanViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.DeleteFaceScanUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetFaceScanStatusUseCase> getHighSpeedVideoSizes;

    private ManageFaceScanViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetFaceScanStatusUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.DeleteFaceScanUseCase> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetFaceScanStatusUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.DeleteFaceScanUseCase> provider2) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel newInstance(com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetFaceScanStatusUseCase getFaceScanStatusUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.DeleteFaceScanUseCase deleteFaceScanUseCase) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel(getFaceScanStatusUseCase, deleteFaceScanUseCase);
    }
}
