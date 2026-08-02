package com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0397ContactUsViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.phone.PhoneNumberFormatterFacade> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsObservabilityMiddleware.Factory> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsReducer> getHighSpeedVideoSizes;

    private C0397ContactUsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.phone.PhoneNumberFormatterFacade> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsReducer> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsObservabilityMiddleware.Factory> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsViewModel get(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ContactUsArgs contactUsArgs) {
        return newInstance(contactUsArgs, this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.C0397ContactUsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.phone.PhoneNumberFormatterFacade> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsReducer> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsObservabilityMiddleware.Factory> provider3) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.C0397ContactUsViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsViewModel newInstance(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ContactUsArgs contactUsArgs, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.phone.PhoneNumberFormatterFacade phoneNumberFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsReducer contactUsReducer, com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsObservabilityMiddleware.Factory factory) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsViewModel(contactUsArgs, phoneNumberFormatterFacade, contactUsReducer, factory);
    }
}
