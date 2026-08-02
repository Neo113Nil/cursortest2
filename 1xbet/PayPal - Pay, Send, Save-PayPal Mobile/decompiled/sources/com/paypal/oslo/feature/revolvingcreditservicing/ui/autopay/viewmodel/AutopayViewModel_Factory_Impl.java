package com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel;

/* loaded from: classes14.dex */
public final class AutopayViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.C0389AutopayViewModel_Factory Camera2StreamConfigurationMap;

    private AutopayViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.C0389AutopayViewModel_Factory c0389AutopayViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0389AutopayViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AutopayNavigationArgs autopayNavigationArgs) {
        return this.Camera2StreamConfigurationMap.get(autopayNavigationArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.C0389AutopayViewModel_Factory c0389AutopayViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayViewModel_Factory_Impl(c0389AutopayViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.C0389AutopayViewModel_Factory c0389AutopayViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayViewModel_Factory_Impl(c0389AutopayViewModel_Factory));
    }
}
