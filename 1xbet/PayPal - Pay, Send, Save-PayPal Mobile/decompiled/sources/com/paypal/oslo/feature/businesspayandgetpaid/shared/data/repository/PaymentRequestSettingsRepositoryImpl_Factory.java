package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository;

/* loaded from: classes11.dex */
public final class PaymentRequestSettingsRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> getHighResolutionOutputSizeshNQ4ISI;

    private PaymentRequestSettingsRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl newInstance(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl(appStorage);
    }
}
