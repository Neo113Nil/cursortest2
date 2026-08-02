package com.paypal.oslo.feature.taptopay.di;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/di/RepositoryProviderModule;", "", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/CardRepositoryWrapper;", "impl", "Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;", "bindCardRepository", "(Lcom/paypal/oslo/feature/taptopay/data/repository/card/CardRepositoryWrapper;)Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;", "Lcom/paypal/oslo/feature/taptopay/data/repository/payair/PayairPaymentManagerRepositoryImpl;", "Lcom/paypal/oslo/feature/taptopay/domain/repository/payair/PayairPaymentManagerRepository;", "bindPayairPaymentManagerRepository", "(Lcom/paypal/oslo/feature/taptopay/data/repository/payair/PayairPaymentManagerRepositoryImpl;)Lcom/paypal/oslo/feature/taptopay/domain/repository/payair/PayairPaymentManagerRepository;", "Lcom/paypal/oslo/feature/taptopay/data/repository/payment/PaymentRepositoryWrapper;", "Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/PaymentRepository;", "bindPaymentRepository", "(Lcom/paypal/oslo/feature/taptopay/data/repository/payment/PaymentRepositoryWrapper;)Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/PaymentRepository;", "Lcom/paypal/oslo/feature/taptopay/data/repository/payment/TransactionRepositoryWrapper;", "Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/TransactionRepository;", "bindTransactionRepository", "(Lcom/paypal/oslo/feature/taptopay/data/repository/payment/TransactionRepositoryWrapper;)Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/TransactionRepository;", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/device/WalletPartnerDeviceIdResolver;", "Lcom/paypal/oslo/feature/taptopay/domain/repository/device/DeviceIdResolver;", "bindDeviceIdResolver", "(Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/device/WalletPartnerDeviceIdResolver;)Lcom/paypal/oslo/feature/taptopay/domain/repository/device/DeviceIdResolver;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public interface RepositoryProviderModule {
    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository bindCardRepository(com.paypal.oslo.feature.taptopay.data.repository.card.CardRepositoryWrapper impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.taptopay.domain.repository.device.DeviceIdResolver bindDeviceIdResolver(com.paypal.oslo.feature.taptopay.data.repository.paypal.device.WalletPartnerDeviceIdResolver impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.taptopay.domain.repository.payair.PayairPaymentManagerRepository bindPayairPaymentManagerRepository(com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentManagerRepositoryImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository bindPaymentRepository(com.paypal.oslo.feature.taptopay.data.repository.payment.PaymentRepositoryWrapper impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository bindTransactionRepository(com.paypal.oslo.feature.taptopay.data.repository.payment.TransactionRepositoryWrapper impl);
}
