package com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal;

/* loaded from: classes15.dex */
public final class PayPalGetTransactionHistoryUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalGetTransactionHistoryUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.transaction.CachedTransactionRepository> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.GetTransactionHistoryUseCase> getHighSpeedVideoSizes;

    private PayPalGetTransactionHistoryUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.GetTransactionHistoryUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.transaction.CachedTransactionRepository> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalGetTransactionHistoryUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalGetTransactionHistoryUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.GetTransactionHistoryUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.transaction.CachedTransactionRepository> provider3) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalGetTransactionHistoryUseCase_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalGetTransactionHistoryUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.payment.GetTransactionHistoryUseCase getTransactionHistoryUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase payPalGetCardIdGroupUseCase, com.paypal.oslo.feature.taptopay.domain.repository.paypal.transaction.CachedTransactionRepository cachedTransactionRepository) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalGetTransactionHistoryUseCase(getTransactionHistoryUseCase, payPalGetCardIdGroupUseCase, cachedTransactionRepository);
    }
}
