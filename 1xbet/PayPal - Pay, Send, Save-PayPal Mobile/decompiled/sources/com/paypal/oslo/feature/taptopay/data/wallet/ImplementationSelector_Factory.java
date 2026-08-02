package com.paypal.oslo.feature.taptopay.data.wallet;

/* loaded from: classes15.dex */
public final class ImplementationSelector_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.wallet.ImplementationSelector> {
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> Camera2StreamConfigurationMap;

    private ImplementationSelector_Factory(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.wallet.ImplementationSelector get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.wallet.ImplementationSelector_Factory create(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        return new com.paypal.oslo.feature.taptopay.data.wallet.ImplementationSelector_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.wallet.ImplementationSelector newInstance(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        return new com.paypal.oslo.feature.taptopay.data.wallet.ImplementationSelector(appStorage);
    }
}
