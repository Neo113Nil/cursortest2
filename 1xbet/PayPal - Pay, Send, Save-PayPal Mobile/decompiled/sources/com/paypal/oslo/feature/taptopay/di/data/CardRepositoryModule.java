package com.paypal.oslo.feature.taptopay.di.data;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/di/data/CardRepositoryModule;", "", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/PayairCardRepository;", "impl", "Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;", "bindPayairCardRepository", "(Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/PayairCardRepository;)Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;", "Lcom/paypal/oslo/feature/taptopay/data/repository/thales/ThalesCardRepositoryAdapter;", "bindThalesCardRepository", "(Lcom/paypal/oslo/feature/taptopay/data/repository/thales/ThalesCardRepositoryAdapter;)Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public interface CardRepositoryModule {
    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository bindPayairCardRepository(com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository bindThalesCardRepository(com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter impl);
}
