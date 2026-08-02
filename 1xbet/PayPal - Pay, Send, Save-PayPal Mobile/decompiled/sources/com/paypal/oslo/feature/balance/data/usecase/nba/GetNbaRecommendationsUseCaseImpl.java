package com.paypal.oslo.feature.balance.data.usecase.nba;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/balance/data/usecase/nba/GetNbaRecommendationsUseCaseImpl;", "Lcom/paypal/oslo/feature/balance/api/usecase/GetNbaRecommendationsUseCase;", "Lcom/paypal/oslo/feature/balance/domain/repository/nba/NbaRepository;", "nbaRepository", "<init>", "(Lcom/paypal/oslo/feature/balance/domain/repository/nba/NbaRepository;)V", "", "surface", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/balance/api/errors/NbaError;", "", "Lcom/paypal/oslo/feature/balance/api/models/nba/NbaRecommendation;", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/balance/domain/repository/nba/NbaRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetNbaRecommendationsUseCaseImpl implements com.paypal.oslo.feature.balance.api.usecase.GetNbaRecommendationsUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.balance.domain.repository.nba.NbaRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetNbaRecommendationsUseCaseImpl(com.paypal.oslo.feature.balance.domain.repository.nba.NbaRepository nbaRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nbaRepository, "");
        this.getHighSpeedVideoFpsRangesFor = nbaRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.balance.api.usecase.GetNbaRecommendationsUseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.balance.api.errors.NbaError, ? extends java.util.List<com.paypal.oslo.feature.balance.api.models.nba.NbaRecommendation>>> continuation) {
        com.paypal.oslo.feature.balance.data.usecase.nba.GetNbaRecommendationsUseCaseImpl$invoke$1 getNbaRecommendationsUseCaseImpl$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.balance.data.usecase.nba.GetNbaRecommendationsUseCaseImpl$invoke$1) {
            getNbaRecommendationsUseCaseImpl$invoke$1 = (com.paypal.oslo.feature.balance.data.usecase.nba.GetNbaRecommendationsUseCaseImpl$invoke$1) continuation;
            if ((getNbaRecommendationsUseCaseImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                getNbaRecommendationsUseCaseImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = getNbaRecommendationsUseCaseImpl$invoke$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getNbaRecommendationsUseCaseImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.balance.domain.repository.nba.NbaRepository nbaRepository = this.getHighSpeedVideoFpsRangesFor;
                    getNbaRecommendationsUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    getNbaRecommendationsUseCaseImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = nbaRepository.fetchNbaRecommendations(str, getNbaRecommendationsUseCaseImpl$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> list = (java.util.List) ((arrow.core.Either.Right) either).getValue();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation nbaRecommendation : list) {
                        java.lang.String trackingId = nbaRecommendation.getTrackingId();
                        java.lang.String title = nbaRecommendation.getTitle();
                        java.lang.String description = nbaRecommendation.getDescription();
                        com.paypal.oslo.feature.balance.api.models.nba.NbaIcon icon = nbaRecommendation.getIcon();
                        arrayList.add(new com.paypal.oslo.feature.balance.api.models.nba.NbaRecommendation(trackingId, title, description, icon != null ? new com.paypal.oslo.feature.balance.api.models.nba.NbaIcon(icon.getIdentifier(), icon.getAlt()) : null, nbaRecommendation.getDestinationId(), nbaRecommendation.getUrl()));
                    }
                    return new arrow.core.Either.Right(arrayList);
                }
                if (either instanceof arrow.core.Either.Left) {
                    return either;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        getNbaRecommendationsUseCaseImpl$invoke$1 = new com.paypal.oslo.feature.balance.data.usecase.nba.GetNbaRecommendationsUseCaseImpl$invoke$1(this, continuation);
        java.lang.Object obj2 = getNbaRecommendationsUseCaseImpl$invoke$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getNbaRecommendationsUseCaseImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
