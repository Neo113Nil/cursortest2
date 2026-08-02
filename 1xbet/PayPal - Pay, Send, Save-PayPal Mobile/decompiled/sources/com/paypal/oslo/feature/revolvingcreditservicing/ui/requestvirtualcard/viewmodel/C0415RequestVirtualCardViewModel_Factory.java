package com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0415RequestVirtualCardViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.mapper.RequestVirtualCardArgsMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardMiddleware> getHighSpeedVideoSizes;

    private C0415RequestVirtualCardViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.mapper.RequestVirtualCardArgsMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardMiddleware> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel get(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RequestVirtualCardArgs requestVirtualCardArgs) {
        return newInstance(requestVirtualCardArgs, this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.C0415RequestVirtualCardViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.mapper.RequestVirtualCardArgsMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardMiddleware> provider3) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.C0415RequestVirtualCardViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel newInstance(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RequestVirtualCardArgs requestVirtualCardArgs, com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardReducer requestVirtualCardReducer, com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.mapper.RequestVirtualCardArgsMapper requestVirtualCardArgsMapper, com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardMiddleware requestVirtualCardMiddleware) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel(requestVirtualCardArgs, requestVirtualCardReducer, requestVirtualCardArgsMapper, requestVirtualCardMiddleware);
    }
}
