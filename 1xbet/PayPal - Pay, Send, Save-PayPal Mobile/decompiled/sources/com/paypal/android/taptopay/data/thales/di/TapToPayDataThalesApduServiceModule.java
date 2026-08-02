package com.paypal.android.taptopay.data.thales.di;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/di/TapToPayDataThalesApduServiceModule;", "", "<init>", "()V", "Lcom/paypal/android/taptopay/data/thales/payment/ThalesPaymentDataSource;", "paymentDataSource", "Lcom/paypal/android/taptopay/data/thales/replenishment/CardPaymentKeysReplenisher;", "cardPaymentKeysReplenisher", "Lcom/paypal/android/taptopay/data/thales/card/CardDataSource;", "cardDataSource", "Lcom/gemalto/mfs/mwsdk/payment/PaymentServiceListener;", "providePaymentServiceListener", "(Lcom/paypal/android/taptopay/data/thales/payment/ThalesPaymentDataSource;Lcom/paypal/android/taptopay/data/thales/replenishment/CardPaymentKeysReplenisher;Lcom/paypal/android/taptopay/data/thales/card/CardDataSource;)Lcom/gemalto/mfs/mwsdk/payment/PaymentServiceListener;"}, k = 1, mv = {1, 9, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public final class TapToPayDataThalesApduServiceModule {
    @dagger.Provides
    public final com.gemalto.mfs.mwsdk.payment.PaymentServiceListener providePaymentServiceListener(com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource paymentDataSource, com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher cardPaymentKeysReplenisher, com.paypal.android.taptopay.data.thales.card.CardDataSource cardDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardPaymentKeysReplenisher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDataSource, "");
        return new com.paypal.android.taptopay.data.thales.payment.ThalesPaymentListener(paymentDataSource, cardPaymentKeysReplenisher, cardDataSource, null, null, null, 56, null);
    }
}
