package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc;

/* loaded from: classes15.dex */
public final class TermsAndConditionsRetriever_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsRetriever> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository> getHighSpeedVideoFpsRangesFor;

    private TermsAndConditionsRetriever_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsRetriever get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsRetriever_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository> provider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsRetriever_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsRetriever newInstance(com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository payPalLocalCardDataRepository) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsRetriever(payPalLocalCardDataRepository);
    }
}
