package com.paypal.android.taptopay.data.thales.di;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/di/ThalesRepositoryModule;", "", "<init>", "()V", "Lcom/paypal/android/taptopay/data/thales/card/CardStateDataSource;", "cardStateDataSource", "Lcom/paypal/android/taptopay/data/thales/card/CardDataSource;", "cardDataSource", "Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationTokenDataSource;", "pushNotificationTokenDataSource", "Landroid/content/Context;", "appContext", "Lcom/paypal/android/taptopay/data/thales/card/CardChangeHandler;", "cardChangeHandler", "Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;", "provideThalesCardRepository", "(Lcom/paypal/android/taptopay/data/thales/card/CardStateDataSource;Lcom/paypal/android/taptopay/data/thales/card/CardDataSource;Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationTokenDataSource;Landroid/content/Context;Lcom/paypal/android/taptopay/data/thales/card/CardChangeHandler;)Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;", "context", "Lcom/paypal/android/taptopay/data/thales/payment/ThalesPaymentDataSource;", "thalesPaymentDataSource", "Lcom/paypal/android/taptopay/domain/repository/payment/PaymentRepository;", "provideThalesPaymentRepository", "(Landroid/content/Context;Lcom/paypal/android/taptopay/data/thales/payment/ThalesPaymentDataSource;)Lcom/paypal/android/taptopay/domain/repository/payment/PaymentRepository;", "Lcom/paypal/android/taptopay/data/thales/payment/TransactionDataSource;", "transactionDataSource", "Lcom/paypal/android/taptopay/domain/repository/payment/TransactionRepository;", "provideThalesTransactionRepository", "(Lcom/paypal/android/taptopay/data/thales/payment/TransactionDataSource;)Lcom/paypal/android/taptopay/domain/repository/payment/TransactionRepository;"}, k = 1, mv = {1, 9, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public final class ThalesRepositoryModule {
    /* JADX WARN: Multi-variable type inference failed */
    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.android.taptopay.domain.repository.card.CardRepository provideThalesCardRepository(com.paypal.android.taptopay.data.thales.card.CardStateDataSource cardStateDataSource, com.paypal.android.taptopay.data.thales.card.CardDataSource cardDataSource, com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource pushNotificationTokenDataSource, @dagger.hilt.android.qualifiers.ApplicationContext android.content.Context appContext, com.paypal.android.taptopay.data.thales.card.CardChangeHandler cardChangeHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardStateDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationTokenDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardChangeHandler, "");
        int i = 4;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        new com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler(appContext, pushNotificationTokenDataSource, null, i, defaultConstructorMarker);
        return new com.paypal.android.taptopay.data.thales.card.ThalesCardRepository(cardStateDataSource, cardDataSource, new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase(pushNotificationTokenDataSource, cardDataSource, 0 == true ? 1 : 0, i, defaultConstructorMarker), null, 0 == true ? 1 : 0, appContext, 24, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.android.taptopay.domain.repository.payment.TransactionRepository provideThalesTransactionRepository(com.paypal.android.taptopay.data.thales.payment.TransactionDataSource transactionDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionDataSource, "");
        return new com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository(transactionDataSource, null, 2, 0 == true ? 1 : 0);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.android.taptopay.domain.repository.payment.PaymentRepository provideThalesPaymentRepository(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource thalesPaymentDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thalesPaymentDataSource, "");
        return new com.paypal.android.taptopay.data.thales.payment.ThalesPaymentRepository(context, thalesPaymentDataSource);
    }
}
