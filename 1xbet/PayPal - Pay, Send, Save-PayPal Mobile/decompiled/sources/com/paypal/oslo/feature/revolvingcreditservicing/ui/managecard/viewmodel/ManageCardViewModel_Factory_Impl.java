package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel;

/* loaded from: classes14.dex */
public final class ManageCardViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.C0409ManageCardViewModel_Factory Camera2StreamConfigurationMap;

    private ManageCardViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.C0409ManageCardViewModel_Factory c0409ManageCardViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0409ManageCardViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs manageCardArgs) {
        return this.Camera2StreamConfigurationMap.get(manageCardArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.C0409ManageCardViewModel_Factory c0409ManageCardViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel_Factory_Impl(c0409ManageCardViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.C0409ManageCardViewModel_Factory c0409ManageCardViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel_Factory_Impl(c0409ManageCardViewModel_Factory));
    }
}
