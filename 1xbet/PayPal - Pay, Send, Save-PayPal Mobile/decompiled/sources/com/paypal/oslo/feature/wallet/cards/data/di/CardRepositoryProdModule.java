package com.paypal.oslo.feature.wallet.cards.data.di;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/data/di/CardRepositoryProdModule;", "", "Lcom/paypal/oslo/feature/wallet/cards/domain/repository/CardRepository;", "repository", "bindsCardRepository", "(Lcom/paypal/oslo/feature/wallet/cards/domain/repository/CardRepository;)Lcom/paypal/oslo/feature/wallet/cards/domain/repository/CardRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public interface CardRepositoryProdModule {
    @dagger.Binds
    com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository bindsCardRepository(@javax.inject.Named("main") com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository repository);
}
