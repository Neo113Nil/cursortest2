package com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel;

/* loaded from: classes14.dex */
public final class EnterCvvReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvReducer> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.utils.CvvLengthValidator> Camera2StreamConfigurationMap;

    private EnterCvvReducer_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.utils.CvvLengthValidator> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvReducer get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvReducer_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.utils.CvvLengthValidator> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvReducer_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvReducer newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.utils.CvvLengthValidator cvvLengthValidator) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvReducer(cvvLengthValidator);
    }
}
