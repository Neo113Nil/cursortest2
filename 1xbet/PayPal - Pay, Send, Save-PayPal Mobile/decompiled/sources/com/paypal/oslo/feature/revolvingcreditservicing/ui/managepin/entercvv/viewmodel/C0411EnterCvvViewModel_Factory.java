package com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0411EnterCvvViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.FetchPinMiddleware> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvReducer> getHighSpeedVideoFpsRangesFor;

    private C0411EnterCvvViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.FetchPinMiddleware> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvViewModel get(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.EnterCvvArgs enterCvvArgs) {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), enterCvvArgs);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.C0411EnterCvvViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.FetchPinMiddleware> provider2) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.C0411EnterCvvViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvViewModel newInstance(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvReducer enterCvvReducer, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.FetchPinMiddleware fetchPinMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.EnterCvvArgs enterCvvArgs) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvViewModel(enterCvvReducer, fetchPinMiddleware, enterCvvArgs);
    }
}
