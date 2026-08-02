package com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel;

/* renamed from: com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.DebitPinViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0359DebitPinViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SetDebitPinUseCase> getHighSpeedVideoFpsRanges;

    private C0359DebitPinViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SetDebitPinUseCase> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.DebitPinViewModel get(java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType setDebitPinFlowType, com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.DebitPinMode debitPinMode) {
        return newInstance(str, setDebitPinFlowType, debitPinMode, this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.C0359DebitPinViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SetDebitPinUseCase> provider2) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.C0359DebitPinViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.DebitPinViewModel newInstance(java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType setDebitPinFlowType, com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.DebitPinMode debitPinMode, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer debitPinReducer, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SetDebitPinUseCase setDebitPinUseCase) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.DebitPinViewModel(str, setDebitPinFlowType, debitPinMode, debitPinReducer, setDebitPinUseCase);
    }
}
