package com.paypal.oslo.feature.identity.checkoutdataprovider.data.datastore;

/* loaded from: classes12.dex */
public final class CheckoutInputDataStoreImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.checkoutdataprovider.data.datastore.CheckoutInputDataStoreImpl> {
    private final dagger.internal.Provider<java.util.concurrent.atomic.AtomicReference<com.paypal.oslo.feature.identity.api.CheckoutInputData>> getHighResolutionOutputSizeshNQ4ISI;

    private CheckoutInputDataStoreImpl_Factory(dagger.internal.Provider<java.util.concurrent.atomic.AtomicReference<com.paypal.oslo.feature.identity.api.CheckoutInputData>> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.checkoutdataprovider.data.datastore.CheckoutInputDataStoreImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.checkoutdataprovider.data.datastore.CheckoutInputDataStoreImpl_Factory create(dagger.internal.Provider<java.util.concurrent.atomic.AtomicReference<com.paypal.oslo.feature.identity.api.CheckoutInputData>> provider) {
        return new com.paypal.oslo.feature.identity.checkoutdataprovider.data.datastore.CheckoutInputDataStoreImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.checkoutdataprovider.data.datastore.CheckoutInputDataStoreImpl newInstance(java.util.concurrent.atomic.AtomicReference<com.paypal.oslo.feature.identity.api.CheckoutInputData> atomicReference) {
        return new com.paypal.oslo.feature.identity.checkoutdataprovider.data.datastore.CheckoutInputDataStoreImpl(atomicReference);
    }
}
