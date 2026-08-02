package com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.viewmodel;

/* loaded from: classes12.dex */
public final class RequestPhysicalCardViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.viewmodel.RequestPhysicalCardViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.util.DebitCardDateFormatter> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.RequestPhysicalCardUseCase> getHighSpeedVideoFpsRanges;

    private RequestPhysicalCardViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.RequestPhysicalCardUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.util.DebitCardDateFormatter> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.viewmodel.RequestPhysicalCardViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.viewmodel.RequestPhysicalCardViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.RequestPhysicalCardUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.util.DebitCardDateFormatter> provider3) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.viewmodel.RequestPhysicalCardViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.viewmodel.RequestPhysicalCardViewModel newInstance(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardReducer requestPhysicalCardReducer, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.RequestPhysicalCardUseCase requestPhysicalCardUseCase, com.paypal.oslo.feature.debitcard.shared.util.DebitCardDateFormatter debitCardDateFormatter) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.viewmodel.RequestPhysicalCardViewModel(requestPhysicalCardReducer, requestPhysicalCardUseCase, debitCardDateFormatter);
    }
}
