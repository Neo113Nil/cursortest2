package com.paypal.android.taptopay.data.thales.di;

/* loaded from: classes10.dex */
public final class ThalesRepositoryModule_ProvideThalesPaymentRepositoryFactory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.repository.payment.PaymentRepository> {
    private final com.paypal.android.taptopay.data.thales.di.ThalesRepositoryModule Camera2StreamConfigurationMap;
    private final javax.inject.Provider<android.content.Context> getHighSpeedVideoFpsRanges;
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource> getHighSpeedVideoSizes;

    public ThalesRepositoryModule_ProvideThalesPaymentRepositoryFactory(com.paypal.android.taptopay.data.thales.di.ThalesRepositoryModule thalesRepositoryModule, javax.inject.Provider<android.content.Context> provider, javax.inject.Provider<com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource> provider2) {
        this.Camera2StreamConfigurationMap = thalesRepositoryModule;
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.repository.payment.PaymentRepository get() {
        return provideThalesPaymentRepository(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.android.taptopay.data.thales.di.ThalesRepositoryModule_ProvideThalesPaymentRepositoryFactory create(com.paypal.android.taptopay.data.thales.di.ThalesRepositoryModule thalesRepositoryModule, javax.inject.Provider<android.content.Context> provider, javax.inject.Provider<com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource> provider2) {
        return new com.paypal.android.taptopay.data.thales.di.ThalesRepositoryModule_ProvideThalesPaymentRepositoryFactory(thalesRepositoryModule, provider, provider2);
    }

    public static com.paypal.android.taptopay.domain.repository.payment.PaymentRepository provideThalesPaymentRepository(com.paypal.android.taptopay.data.thales.di.ThalesRepositoryModule thalesRepositoryModule, android.content.Context context, com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource thalesPaymentDataSource) {
        return (com.paypal.android.taptopay.domain.repository.payment.PaymentRepository) dagger.internal.Preconditions.checkNotNullFromProvides(thalesRepositoryModule.provideThalesPaymentRepository(context, thalesPaymentDataSource));
    }
}
