package com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0412ViewPinViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinReducer> getHighResolutionOutputSizeshNQ4ISI;

    private C0412ViewPinViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinReducer> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinViewModel get(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ViewPinArgs viewPinArgs) {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), viewPinArgs);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.C0412ViewPinViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinReducer> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.C0412ViewPinViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinViewModel newInstance(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinReducer viewPinReducer, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ViewPinArgs viewPinArgs) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinViewModel(viewPinReducer, viewPinArgs);
    }
}
