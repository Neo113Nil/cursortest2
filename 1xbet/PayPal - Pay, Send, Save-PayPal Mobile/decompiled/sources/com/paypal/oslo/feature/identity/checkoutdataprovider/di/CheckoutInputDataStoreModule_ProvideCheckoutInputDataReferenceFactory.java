package com.paypal.oslo.feature.identity.checkoutdataprovider.di;

/* loaded from: classes5.dex */
public final class CheckoutInputDataStoreModule_ProvideCheckoutInputDataReferenceFactory implements dagger.internal.Factory<java.util.concurrent.atomic.AtomicReference<com.paypal.oslo.feature.identity.api.CheckoutInputData>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.util.concurrent.atomic.AtomicReference<com.paypal.oslo.feature.identity.api.CheckoutInputData> get() {
        return provideCheckoutInputDataReference();
    }

    public static com.paypal.oslo.feature.identity.checkoutdataprovider.di.CheckoutInputDataStoreModule_ProvideCheckoutInputDataReferenceFactory create() {
        return com.paypal.oslo.feature.identity.checkoutdataprovider.di.CheckoutInputDataStoreModule_ProvideCheckoutInputDataReferenceFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static java.util.concurrent.atomic.AtomicReference<com.paypal.oslo.feature.identity.api.CheckoutInputData> provideCheckoutInputDataReference() {
        return (java.util.concurrent.atomic.AtomicReference) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.identity.checkoutdataprovider.di.CheckoutInputDataStoreModule.INSTANCE.provideCheckoutInputDataReference());
    }

    /* loaded from: classes12.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.checkoutdataprovider.di.CheckoutInputDataStoreModule_ProvideCheckoutInputDataReferenceFactory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.identity.checkoutdataprovider.di.CheckoutInputDataStoreModule_ProvideCheckoutInputDataReferenceFactory();

        private InstanceHolder() {
        }
    }
}
