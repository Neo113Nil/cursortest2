package com.paypal.oslo.feature.cryptocurrency.ui.buy.review.mapper;

/* loaded from: classes12.dex */
public final class PaymentMethodMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.mapper.PaymentMethodMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.formatter.PaymentMethodFormatter> getHighResolutionOutputSizeshNQ4ISI;

    private PaymentMethodMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.formatter.PaymentMethodFormatter> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.mapper.PaymentMethodMapper get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.buy.review.mapper.PaymentMethodMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.formatter.PaymentMethodFormatter> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.mapper.PaymentMethodMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.buy.review.mapper.PaymentMethodMapper newInstance(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.formatter.PaymentMethodFormatter paymentMethodFormatter) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.mapper.PaymentMethodMapper(paymentMethodFormatter);
    }
}
