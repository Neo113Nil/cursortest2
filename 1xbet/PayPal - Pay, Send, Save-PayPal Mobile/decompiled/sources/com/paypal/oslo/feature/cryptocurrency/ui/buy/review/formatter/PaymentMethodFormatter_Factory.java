package com.paypal.oslo.feature.cryptocurrency.ui.buy.review.formatter;

/* loaded from: classes12.dex */
public final class PaymentMethodFormatter_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.formatter.PaymentMethodFormatter> {
    private final dagger.internal.Provider<android.content.Context> Camera2StreamConfigurationMap;

    private PaymentMethodFormatter_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.formatter.PaymentMethodFormatter get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.buy.review.formatter.PaymentMethodFormatter_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.formatter.PaymentMethodFormatter_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.buy.review.formatter.PaymentMethodFormatter newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.formatter.PaymentMethodFormatter(context);
    }
}
