package com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel;

/* loaded from: classes14.dex */
public final class SetPinMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.SetPinMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.utils.PinValidator> getHighSpeedVideoSizes;

    private SetPinMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.utils.PinValidator> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.SetPinMiddleware get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.SetPinMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.utils.PinValidator> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.SetPinMiddleware_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.SetPinMiddleware newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.utils.PinValidator pinValidator) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.SetPinMiddleware(pinValidator);
    }
}
