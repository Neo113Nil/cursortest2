package com.paypal.oslo.feature.dataprivacy.ui.viewmodel;

/* loaded from: classes12.dex */
public final class ErasureReasonViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.usecase.CreateErasureRequestUseCase> getHighSpeedVideoFpsRangesFor;

    private ErasureReasonViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.usecase.CreateErasureRequestUseCase> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.usecase.CreateErasureRequestUseCase> provider) {
        return new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonViewModel newInstance(com.paypal.oslo.feature.dataprivacy.domain.usecase.CreateErasureRequestUseCase createErasureRequestUseCase) {
        return new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonViewModel(createErasureRequestUseCase);
    }
}
