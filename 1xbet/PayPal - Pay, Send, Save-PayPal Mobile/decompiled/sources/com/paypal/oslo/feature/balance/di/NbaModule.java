package com.paypal.oslo.feature.balance.di;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/balance/di/NbaModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/balance/domain/repository/nba/NbaRepository;", "repository", "Lcom/paypal/oslo/feature/balance/api/usecase/GetNbaRecommendationsUseCase;", "provideGetNbaRecommendationsUseCase", "(Lcom/paypal/oslo/feature/balance/domain/repository/nba/NbaRepository;)Lcom/paypal/oslo/feature/balance/api/usecase/GetNbaRecommendationsUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes11.dex */
public final class NbaModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.balance.di.NbaModule INSTANCE = new com.paypal.oslo.feature.balance.di.NbaModule();

    private NbaModule() {
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.balance.api.usecase.GetNbaRecommendationsUseCase provideGetNbaRecommendationsUseCase(com.paypal.oslo.feature.balance.domain.repository.nba.NbaRepository repository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repository, "");
        return new com.paypal.oslo.feature.balance.data.usecase.nba.GetNbaRecommendationsUseCaseImpl(repository);
    }
}
