package com.paypal.oslo.feature.identity.checkoutdataprovider.di;

/* loaded from: classes5.dex */
public final class CheckoutInputDataStoreModule_ProvideAuthCodeReferenceFactory implements dagger.internal.Factory<java.util.concurrent.atomic.AtomicReference<java.lang.String>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.util.concurrent.atomic.AtomicReference<java.lang.String> get() {
        return provideAuthCodeReference();
    }

    public static com.paypal.oslo.feature.identity.checkoutdataprovider.di.CheckoutInputDataStoreModule_ProvideAuthCodeReferenceFactory create() {
        return com.paypal.oslo.feature.identity.checkoutdataprovider.di.CheckoutInputDataStoreModule_ProvideAuthCodeReferenceFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static java.util.concurrent.atomic.AtomicReference<java.lang.String> provideAuthCodeReference() {
        return (java.util.concurrent.atomic.AtomicReference) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.identity.checkoutdataprovider.di.CheckoutInputDataStoreModule.INSTANCE.provideAuthCodeReference());
    }

    /* loaded from: classes12.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.checkoutdataprovider.di.CheckoutInputDataStoreModule_ProvideAuthCodeReferenceFactory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.identity.checkoutdataprovider.di.CheckoutInputDataStoreModule_ProvideAuthCodeReferenceFactory();

        private InstanceHolder() {
        }
    }
}
