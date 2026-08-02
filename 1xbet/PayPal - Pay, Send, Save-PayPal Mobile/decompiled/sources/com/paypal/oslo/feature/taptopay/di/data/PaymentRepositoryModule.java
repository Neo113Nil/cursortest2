package com.paypal.oslo.feature.taptopay.di.data;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH'¢\u0006\u0004\b\u000f\u0010\u0010À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/di/data/PaymentRepositoryModule;", "", "Lcom/paypal/oslo/feature/taptopay/data/repository/payair/PayairPaymentRepository;", "impl", "Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/PaymentRepository;", "bindPayairPaymentRepository", "(Lcom/paypal/oslo/feature/taptopay/data/repository/payair/PayairPaymentRepository;)Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/PaymentRepository;", "Lcom/paypal/oslo/feature/taptopay/data/repository/thales/ThalesPaymentRepositoryAdapter;", "bindThalesPaymentRepository", "(Lcom/paypal/oslo/feature/taptopay/data/repository/thales/ThalesPaymentRepositoryAdapter;)Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/PaymentRepository;", "Lcom/paypal/oslo/feature/taptopay/data/repository/payair/PayairTransactionRepository;", "Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/TransactionRepository;", "bindPayairTransactionRepository", "(Lcom/paypal/oslo/feature/taptopay/data/repository/payair/PayairTransactionRepository;)Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/TransactionRepository;", "Lcom/paypal/oslo/feature/taptopay/data/repository/thales/ThalesTransactionRepositoryAdapter;", "bindThalesTransactionRepository", "(Lcom/paypal/oslo/feature/taptopay/data/repository/thales/ThalesTransactionRepositoryAdapter;)Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/TransactionRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public interface PaymentRepositoryModule {
    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository bindPayairPaymentRepository(com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentRepository impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository bindPayairTransactionRepository(com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepository impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository bindThalesPaymentRepository(com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesPaymentRepositoryAdapter impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository bindThalesTransactionRepository(com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesTransactionRepositoryAdapter impl);
}
