package com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel;

/* loaded from: classes14.dex */
public final class EnterCvvViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.C0411EnterCvvViewModel_Factory getHighSpeedVideoSizes;

    private EnterCvvViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.C0411EnterCvvViewModel_Factory c0411EnterCvvViewModel_Factory) {
        this.getHighSpeedVideoSizes = c0411EnterCvvViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.EnterCvvArgs enterCvvArgs) {
        return this.getHighSpeedVideoSizes.get(enterCvvArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.C0411EnterCvvViewModel_Factory c0411EnterCvvViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvViewModel_Factory_Impl(c0411EnterCvvViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.C0411EnterCvvViewModel_Factory c0411EnterCvvViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvViewModel_Factory_Impl(c0411EnterCvvViewModel_Factory));
    }
}
