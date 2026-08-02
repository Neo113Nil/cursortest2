package com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0399LegacyServicingLandingViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingReducer> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetLegacyWebViewServicingUrlUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingObservabilityMiddleware.Factory> getHighSpeedVideoSizes;

    private C0399LegacyServicingLandingViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetLegacyWebViewServicingUrlUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingReducer> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingObservabilityMiddleware.Factory> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel get(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.LegacyServicingLandingArgs legacyServicingLandingArgs) {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), legacyServicingLandingArgs);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.C0399LegacyServicingLandingViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetLegacyWebViewServicingUrlUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingReducer> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingObservabilityMiddleware.Factory> provider3) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.C0399LegacyServicingLandingViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetLegacyWebViewServicingUrlUseCase getLegacyWebViewServicingUrlUseCase, com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingReducer legacyServicingLandingReducer, com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingObservabilityMiddleware.Factory factory, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.LegacyServicingLandingArgs legacyServicingLandingArgs) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel(getLegacyWebViewServicingUrlUseCase, legacyServicingLandingReducer, factory, legacyServicingLandingArgs);
    }
}
