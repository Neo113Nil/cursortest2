package com.paypal.oslo.feature.taptopay.di.data;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/di/data/MockRepositoryModule;", "", "Lcom/paypal/oslo/feature/taptopay/data/repository/mock/MockCardRepository;", "impl", "Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;", "bindMockCardRepository", "(Lcom/paypal/oslo/feature/taptopay/data/repository/mock/MockCardRepository;)Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;", "Lcom/paypal/oslo/feature/taptopay/data/repository/mock/MockPaymentRepository;", "Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/PaymentRepository;", "bindMockPaymentRepository", "(Lcom/paypal/oslo/feature/taptopay/data/repository/mock/MockPaymentRepository;)Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/PaymentRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public interface MockRepositoryModule {
    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository bindMockCardRepository(com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository bindMockPaymentRepository(com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository impl);
}
