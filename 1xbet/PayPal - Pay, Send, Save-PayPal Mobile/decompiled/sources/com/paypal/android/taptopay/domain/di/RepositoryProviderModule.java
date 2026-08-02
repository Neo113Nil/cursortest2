package com.paypal.android.taptopay.domain.di;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/android/taptopay/domain/di/RepositoryProviderModule;", "", "<init>", "()V", "Lcom/paypal/android/taptopay/domain/repository/card/CardRepositoryWrapper;", "cardRepositoryWrapper", "Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;", "provideCardRepository", "(Lcom/paypal/android/taptopay/domain/repository/card/CardRepositoryWrapper;)Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;", "Lcom/paypal/android/taptopay/domain/repository/payment/PaymentRepositoryWrapper;", "paymentRepositoryWrapper", "Lcom/paypal/android/taptopay/domain/repository/payment/PaymentRepository;", "providePaymentRepository", "(Lcom/paypal/android/taptopay/domain/repository/payment/PaymentRepositoryWrapper;)Lcom/paypal/android/taptopay/domain/repository/payment/PaymentRepository;", "Lcom/paypal/android/taptopay/domain/repository/payment/TransactionRepositoryWrapper;", "transactionRepositoryWrapper", "Lcom/paypal/android/taptopay/domain/repository/payment/TransactionRepository;", "provideTransactionRepository", "(Lcom/paypal/android/taptopay/domain/repository/payment/TransactionRepositoryWrapper;)Lcom/paypal/android/taptopay/domain/repository/payment/TransactionRepository;"}, k = 1, mv = {1, 9, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public final class RepositoryProviderModule {
    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.android.taptopay.domain.repository.card.CardRepository provideCardRepository(com.paypal.android.taptopay.domain.repository.card.CardRepositoryWrapper cardRepositoryWrapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRepositoryWrapper, "");
        return cardRepositoryWrapper;
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.android.taptopay.domain.repository.payment.TransactionRepository provideTransactionRepository(com.paypal.android.taptopay.domain.repository.payment.TransactionRepositoryWrapper transactionRepositoryWrapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionRepositoryWrapper, "");
        return transactionRepositoryWrapper;
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.android.taptopay.domain.repository.payment.PaymentRepository providePaymentRepository(com.paypal.android.taptopay.domain.repository.payment.PaymentRepositoryWrapper paymentRepositoryWrapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRepositoryWrapper, "");
        return paymentRepositoryWrapper;
    }
}
