package com.paypal.oslo.feature.balance.domain.usecase.nba;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/usecase/nba/GetNbaDomainRecommendationsUseCase;", "", "Lcom/paypal/oslo/feature/balance/domain/repository/nba/NbaRepository;", "nbaRepository", "<init>", "(Lcom/paypal/oslo/feature/balance/domain/repository/nba/NbaRepository;)V", "", "surface", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/balance/api/errors/NbaError;", "", "Lcom/paypal/oslo/feature/balance/domain/model/nba/NbaRecommendation;", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/balance/domain/repository/nba/NbaRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetNbaDomainRecommendationsUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.balance.domain.repository.nba.NbaRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public GetNbaDomainRecommendationsUseCase(com.paypal.oslo.feature.balance.domain.repository.nba.NbaRepository nbaRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nbaRepository, "");
        this.Camera2StreamConfigurationMap = nbaRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.balance.api.errors.NbaError, ? extends java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation>>> continuation) {
        return this.Camera2StreamConfigurationMap.fetchNbaRecommendations(str, continuation);
    }
}
