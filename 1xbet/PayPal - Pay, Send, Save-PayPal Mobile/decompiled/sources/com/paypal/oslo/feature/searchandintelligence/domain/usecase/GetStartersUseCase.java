package com.paypal.oslo.feature.searchandintelligence.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/usecase/GetStartersUseCase;", "", "Lcom/paypal/oslo/feature/searchandintelligence/domain/repository/StartersRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/repository/StartersRepository;)V", "", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/Starters$Surface;", "surfaces", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/Starters;", "invoke", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/searchandintelligence/domain/repository/StartersRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetStartersUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.searchandintelligence.domain.repository.StartersRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GetStartersUseCase(com.paypal.oslo.feature.searchandintelligence.domain.repository.StartersRepository startersRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startersRepository, "");
        this.getHighSpeedVideoSizes = startersRepository;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetStartersUseCase getStartersUseCase, java.util.List list, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        return getStartersUseCase.invoke(list, continuation);
    }

    public final java.lang.Object invoke(java.util.List<? extends com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface> list, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, com.paypal.oslo.feature.searchandintelligence.domain.model.Starters>> continuation) {
        return this.getHighSpeedVideoSizes.getStarters(list, continuation);
    }
}
