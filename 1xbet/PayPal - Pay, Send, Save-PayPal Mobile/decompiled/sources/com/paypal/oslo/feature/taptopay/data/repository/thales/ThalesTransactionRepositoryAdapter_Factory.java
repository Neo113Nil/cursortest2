package com.paypal.oslo.feature.taptopay.data.repository.thales;

/* loaded from: classes15.dex */
public final class ThalesTransactionRepositoryAdapter_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesTransactionRepositoryAdapter> {
    private final dagger.internal.Provider<com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository> getHighResolutionOutputSizeshNQ4ISI;

    private ThalesTransactionRepositoryAdapter_Factory(dagger.internal.Provider<com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesTransactionRepositoryAdapter get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesTransactionRepositoryAdapter_Factory create(dagger.internal.Provider<com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository> provider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesTransactionRepositoryAdapter_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesTransactionRepositoryAdapter newInstance(com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository thalesTransactionRepository) {
        return new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesTransactionRepositoryAdapter(thalesTransactionRepository);
    }
}
