package com.paypal.oslo.feature.identity.checkoutdataprovider.di;

/* loaded from: classes5.dex */
public final class CheckoutInputDataStoreModule_ProvideCheckoutOutputDataReferenceFactory implements dagger.internal.Factory<java.util.concurrent.atomic.AtomicReference<com.paypal.oslo.feature.identity.api.model.CheckoutData>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.util.concurrent.atomic.AtomicReference<com.paypal.oslo.feature.identity.api.model.CheckoutData> get() {
        return provideCheckoutOutputDataReference();
    }

    public static com.paypal.oslo.feature.identity.checkoutdataprovider.di.CheckoutInputDataStoreModule_ProvideCheckoutOutputDataReferenceFactory create() {
        return com.paypal.oslo.feature.identity.checkoutdataprovider.di.CheckoutInputDataStoreModule_ProvideCheckoutOutputDataReferenceFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static java.util.concurrent.atomic.AtomicReference<com.paypal.oslo.feature.identity.api.model.CheckoutData> provideCheckoutOutputDataReference() {
        return (java.util.concurrent.atomic.AtomicReference) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.identity.checkoutdataprovider.di.CheckoutInputDataStoreModule.INSTANCE.provideCheckoutOutputDataReference());
    }

    /* loaded from: classes12.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.checkoutdataprovider.di.CheckoutInputDataStoreModule_ProvideCheckoutOutputDataReferenceFactory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.identity.checkoutdataprovider.di.CheckoutInputDataStoreModule_ProvideCheckoutOutputDataReferenceFactory();

        private InstanceHolder() {
        }
    }
}
