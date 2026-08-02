package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc;

/* loaded from: classes15.dex */
public final class TermsAndConditionsDeleter_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsDeleter> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository> getHighSpeedVideoSizes;

    private TermsAndConditionsDeleter_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsDeleter get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsDeleter_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository> provider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsDeleter_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsDeleter newInstance(com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository payPalLocalCardDataRepository) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsDeleter(payPalLocalCardDataRepository);
    }
}
