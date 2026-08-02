package com.paypal.oslo.feature.bnplservicing.ui.changefi;

/* renamed from: com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C0310ChangeFiViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.UpdateAutopayUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentEligibleFiUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiReducer> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.GetAutoPaySetupOverviewUseCase> getHighSpeedVideoSizes;

    private C0310ChangeFiViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.GetAutoPaySetupOverviewUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentEligibleFiUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.UpdateAutopayUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiMapper> provider5) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.Camera2StreamConfigurationMap = provider5;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel get(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiArgs changeFiArgs) {
        return newInstance(changeFiArgs, this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.changefi.C0310ChangeFiViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.GetAutoPaySetupOverviewUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentEligibleFiUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.UpdateAutopayUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiMapper> provider5) {
        return new com.paypal.oslo.feature.bnplservicing.ui.changefi.C0310ChangeFiViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel newInstance(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiArgs changeFiArgs, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiReducer changeFiReducer, com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.GetAutoPaySetupOverviewUseCase getAutoPaySetupOverviewUseCase, com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentEligibleFiUseCase getMakeAPaymentEligibleFiUseCase, com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.UpdateAutopayUseCase updateAutopayUseCase, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiMapper changeFiMapper) {
        return new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel(changeFiArgs, changeFiReducer, getAutoPaySetupOverviewUseCase, getMakeAPaymentEligibleFiUseCase, updateAutopayUseCase, changeFiMapper);
    }
}
