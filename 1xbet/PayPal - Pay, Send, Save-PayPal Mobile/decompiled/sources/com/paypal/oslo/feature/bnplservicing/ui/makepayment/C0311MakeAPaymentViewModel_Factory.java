package com.paypal.oslo.feature.bnplservicing.ui.makepayment;

/* renamed from: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C0311MakeAPaymentViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentOverviewUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.PostMakeAPaymentUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentReducer> getHighSpeedVideoSizes;

    private C0311MakeAPaymentViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentOverviewUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.PostMakeAPaymentUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentReducer> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage> provider5) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel get(java.lang.String str, java.lang.String str2) {
        return newInstance(str, str2, this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.makepayment.C0311MakeAPaymentViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentOverviewUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.PostMakeAPaymentUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentReducer> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage> provider5) {
        return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.C0311MakeAPaymentViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel newInstance(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentOverviewUseCase getMakeAPaymentOverviewUseCase, com.paypal.oslo.feature.bnplservicing.domain.usecase.PostMakeAPaymentUseCase postMakeAPaymentUseCase, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper makeAPaymentMapper, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentReducer makeAPaymentReducer, com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage bnplServicingSessionStorage) {
        return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel(str, str2, getMakeAPaymentOverviewUseCase, postMakeAPaymentUseCase, makeAPaymentMapper, makeAPaymentReducer, bnplServicingSessionStorage);
    }
}
