package com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0389AutopayViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.UpdateAutopayUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewObservabilityMiddleware.Factory> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAutopayOverviewUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper> getHighSpeedVideoSizes;

    private C0389AutopayViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAutopayOverviewUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.UpdateAutopayUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewObservabilityMiddleware.Factory> provider5) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayViewModel get(com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AutopayNavigationArgs autopayNavigationArgs) {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), autopayNavigationArgs);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.C0389AutopayViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAutopayOverviewUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.UpdateAutopayUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewObservabilityMiddleware.Factory> provider5) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.C0389AutopayViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayViewModel newInstance(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayReducer autopayReducer, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAutopayOverviewUseCase getAutopayOverviewUseCase, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.UpdateAutopayUseCase updateAutopayUseCase, com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper autopayOverviewToAutopayMapper, com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewObservabilityMiddleware.Factory factory, com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AutopayNavigationArgs autopayNavigationArgs) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayViewModel(autopayReducer, getAutopayOverviewUseCase, updateAutopayUseCase, autopayOverviewToAutopayMapper, factory, autopayNavigationArgs);
    }
}
