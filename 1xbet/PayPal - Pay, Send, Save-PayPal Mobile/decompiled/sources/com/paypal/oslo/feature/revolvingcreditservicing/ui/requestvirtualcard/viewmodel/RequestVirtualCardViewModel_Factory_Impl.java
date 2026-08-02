package com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel;

/* loaded from: classes14.dex */
public final class RequestVirtualCardViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.C0415RequestVirtualCardViewModel_Factory Camera2StreamConfigurationMap;

    private RequestVirtualCardViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.C0415RequestVirtualCardViewModel_Factory c0415RequestVirtualCardViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0415RequestVirtualCardViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RequestVirtualCardArgs requestVirtualCardArgs) {
        return this.Camera2StreamConfigurationMap.get(requestVirtualCardArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.C0415RequestVirtualCardViewModel_Factory c0415RequestVirtualCardViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel_Factory_Impl(c0415RequestVirtualCardViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.C0415RequestVirtualCardViewModel_Factory c0415RequestVirtualCardViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel_Factory_Impl(c0415RequestVirtualCardViewModel_Factory));
    }
}
