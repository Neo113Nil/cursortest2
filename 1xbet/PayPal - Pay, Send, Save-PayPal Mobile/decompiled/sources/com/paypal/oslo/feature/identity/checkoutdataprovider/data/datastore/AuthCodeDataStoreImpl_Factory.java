package com.paypal.oslo.feature.identity.checkoutdataprovider.data.datastore;

/* loaded from: classes12.dex */
public final class AuthCodeDataStoreImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.checkoutdataprovider.data.datastore.AuthCodeDataStoreImpl> {
    private final dagger.internal.Provider<java.util.concurrent.atomic.AtomicReference<java.lang.String>> getHighSpeedVideoFpsRangesFor;

    private AuthCodeDataStoreImpl_Factory(dagger.internal.Provider<java.util.concurrent.atomic.AtomicReference<java.lang.String>> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.checkoutdataprovider.data.datastore.AuthCodeDataStoreImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.checkoutdataprovider.data.datastore.AuthCodeDataStoreImpl_Factory create(dagger.internal.Provider<java.util.concurrent.atomic.AtomicReference<java.lang.String>> provider) {
        return new com.paypal.oslo.feature.identity.checkoutdataprovider.data.datastore.AuthCodeDataStoreImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.checkoutdataprovider.data.datastore.AuthCodeDataStoreImpl newInstance(java.util.concurrent.atomic.AtomicReference<java.lang.String> atomicReference) {
        return new com.paypal.oslo.feature.identity.checkoutdataprovider.data.datastore.AuthCodeDataStoreImpl(atomicReference);
    }
}
