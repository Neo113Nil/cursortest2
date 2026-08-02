package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0409ManageCardViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardReducer> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardObservabilityMiddleware.Factory> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware> getHighSpeedVideoSizes;

    private C0409ManageCardViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardObservabilityMiddleware.Factory> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel get(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs manageCardArgs) {
        return newInstance(manageCardArgs, this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.C0409ManageCardViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardObservabilityMiddleware.Factory> provider3) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.C0409ManageCardViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel newInstance(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs manageCardArgs, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardReducer manageCardReducer, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware manageCardSideEffectMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardObservabilityMiddleware.Factory factory) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel(manageCardArgs, manageCardReducer, manageCardSideEffectMiddleware, factory);
    }
}
