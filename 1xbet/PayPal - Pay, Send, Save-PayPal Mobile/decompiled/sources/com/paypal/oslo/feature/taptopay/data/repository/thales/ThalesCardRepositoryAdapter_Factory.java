package com.paypal.oslo.feature.taptopay.data.repository.thales;

/* loaded from: classes15.dex */
public final class ThalesCardRepositoryAdapter_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter> {
    private final dagger.internal.Provider<com.paypal.android.taptopay.data.thales.card.ThalesCardRepository> Camera2StreamConfigurationMap;

    private ThalesCardRepositoryAdapter_Factory(dagger.internal.Provider<com.paypal.android.taptopay.data.thales.card.ThalesCardRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter_Factory create(dagger.internal.Provider<com.paypal.android.taptopay.data.thales.card.ThalesCardRepository> provider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter newInstance(com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository) {
        return new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter(thalesCardRepository);
    }
}
