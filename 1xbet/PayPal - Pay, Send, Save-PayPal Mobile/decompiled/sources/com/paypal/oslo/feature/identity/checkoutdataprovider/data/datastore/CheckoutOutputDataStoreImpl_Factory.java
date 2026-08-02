package com.paypal.oslo.feature.identity.checkoutdataprovider.data.datastore;

/* loaded from: classes12.dex */
public final class CheckoutOutputDataStoreImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.checkoutdataprovider.data.datastore.CheckoutOutputDataStoreImpl> {
    private final dagger.internal.Provider<java.util.concurrent.atomic.AtomicReference<com.paypal.oslo.feature.identity.api.model.CheckoutData>> getHighResolutionOutputSizeshNQ4ISI;

    private CheckoutOutputDataStoreImpl_Factory(dagger.internal.Provider<java.util.concurrent.atomic.AtomicReference<com.paypal.oslo.feature.identity.api.model.CheckoutData>> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.checkoutdataprovider.data.datastore.CheckoutOutputDataStoreImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.checkoutdataprovider.data.datastore.CheckoutOutputDataStoreImpl_Factory create(dagger.internal.Provider<java.util.concurrent.atomic.AtomicReference<com.paypal.oslo.feature.identity.api.model.CheckoutData>> provider) {
        return new com.paypal.oslo.feature.identity.checkoutdataprovider.data.datastore.CheckoutOutputDataStoreImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.checkoutdataprovider.data.datastore.CheckoutOutputDataStoreImpl newInstance(java.util.concurrent.atomic.AtomicReference<com.paypal.oslo.feature.identity.api.model.CheckoutData> atomicReference) {
        return new com.paypal.oslo.feature.identity.checkoutdataprovider.data.datastore.CheckoutOutputDataStoreImpl(atomicReference);
    }
}
