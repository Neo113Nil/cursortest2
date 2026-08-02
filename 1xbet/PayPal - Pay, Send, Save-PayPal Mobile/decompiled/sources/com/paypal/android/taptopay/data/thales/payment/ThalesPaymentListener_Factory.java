package com.paypal.android.taptopay.data.thales.payment;

/* loaded from: classes10.dex */
public final class ThalesPaymentListener_Factory implements dagger.internal.Factory<com.paypal.android.taptopay.data.thales.payment.ThalesPaymentListener> {
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode, com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode>> Camera2StreamConfigurationMap;
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.payment.CHVerificationMethod, com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod>> getHighResolutionOutputSizeshNQ4ISI;
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource> getHighSpeedVideoFpsRanges;
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.card.CardDataSource> getHighSpeedVideoFpsRangesFor;
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher> getHighSpeedVideoSizes;
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.payment.engine.TransactionContext, com.paypal.android.taptopay.domain.model.payment.TransactionContext>> getOutputMinFrameDuration;

    public ThalesPaymentListener_Factory(javax.inject.Provider<com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource> provider, javax.inject.Provider<com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher> provider2, javax.inject.Provider<com.paypal.android.taptopay.data.thales.card.CardDataSource> provider3, javax.inject.Provider<com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.payment.engine.TransactionContext, com.paypal.android.taptopay.domain.model.payment.TransactionContext>> provider4, javax.inject.Provider<com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode, com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode>> provider5, javax.inject.Provider<com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.payment.CHVerificationMethod, com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod>> provider6) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getOutputMinFrameDuration = provider4;
        this.Camera2StreamConfigurationMap = provider5;
        this.getHighResolutionOutputSizeshNQ4ISI = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.data.thales.payment.ThalesPaymentListener get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getOutputMinFrameDuration.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.android.taptopay.data.thales.payment.ThalesPaymentListener_Factory create(javax.inject.Provider<com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource> provider, javax.inject.Provider<com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher> provider2, javax.inject.Provider<com.paypal.android.taptopay.data.thales.card.CardDataSource> provider3, javax.inject.Provider<com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.payment.engine.TransactionContext, com.paypal.android.taptopay.domain.model.payment.TransactionContext>> provider4, javax.inject.Provider<com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode, com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode>> provider5, javax.inject.Provider<com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.payment.CHVerificationMethod, com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod>> provider6) {
        return new com.paypal.android.taptopay.data.thales.payment.ThalesPaymentListener_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.android.taptopay.data.thales.payment.ThalesPaymentListener newInstance(com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource thalesPaymentDataSource, com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher cardPaymentKeysReplenisher, com.paypal.android.taptopay.data.thales.card.CardDataSource cardDataSource, com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.payment.engine.TransactionContext, com.paypal.android.taptopay.domain.model.payment.TransactionContext> mapper, com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode, com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode> mapper2, com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.payment.CHVerificationMethod, com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod> mapper3) {
        return new com.paypal.android.taptopay.data.thales.payment.ThalesPaymentListener(thalesPaymentDataSource, cardPaymentKeysReplenisher, cardDataSource, mapper, mapper2, mapper3);
    }
}
