package com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel;

/* loaded from: classes14.dex */
public final class ContactUsViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.C0397ContactUsViewModel_Factory getHighSpeedVideoFpsRangesFor;

    private ContactUsViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.C0397ContactUsViewModel_Factory c0397ContactUsViewModel_Factory) {
        this.getHighSpeedVideoFpsRangesFor = c0397ContactUsViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ContactUsArgs contactUsArgs) {
        return this.getHighSpeedVideoFpsRangesFor.get(contactUsArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.C0397ContactUsViewModel_Factory c0397ContactUsViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsViewModel_Factory_Impl(c0397ContactUsViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.C0397ContactUsViewModel_Factory c0397ContactUsViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsViewModel_Factory_Impl(c0397ContactUsViewModel_Factory));
    }
}
