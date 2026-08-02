package com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0410CreatePinViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.SetPinMiddleware> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinReducer> getHighSpeedVideoSizes;

    private C0410CreatePinViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.SetPinMiddleware> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinViewModel get(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.CreatePinArgs createPinArgs) {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), createPinArgs);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.C0410CreatePinViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.SetPinMiddleware> provider2) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.C0410CreatePinViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinViewModel newInstance(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinReducer createPinReducer, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.SetPinMiddleware setPinMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.CreatePinArgs createPinArgs) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinViewModel(createPinReducer, setPinMiddleware, createPinArgs);
    }
}
