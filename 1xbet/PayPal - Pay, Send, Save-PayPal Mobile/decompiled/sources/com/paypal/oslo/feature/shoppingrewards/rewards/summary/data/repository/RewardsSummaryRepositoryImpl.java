package com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ*\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R.\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000f0\u00188\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/data/repository/RewardsSummaryRepositoryImpl;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/repository/RewardsSummaryRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/data/source/ActiveOffersCache;", "activeOffersCache", "<init>", "(Ldagger/Lazy;Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/data/source/ActiveOffersCache;)V", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/repository/RewardsSummaryRepository$RewardsSummaryGraphQLRequest;", "input", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/GetRewardsSummaryUseCase$Response;", "getRewardsSummary", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/repository/RewardsSummaryRepository$RewardsSummaryGraphQLRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Ldagger/Lazy;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/data/source/ActiveOffersCache;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsSummaryQuery$Data;", "mapper", "Lkotlin/jvm/functions/Function1;", "getMapper$shopping_rewards_prodRelease", "()Lkotlin/jvm/functions/Function1;", "setMapper$shopping_rewards_prodRelease", "(Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RewardsSummaryRepositoryImpl extends com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository implements com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.RewardsSummaryRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.source.ActiveOffersCache getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;
    private kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.Data, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response> mapper;

    @javax.inject.Inject
    public RewardsSummaryRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.source.ActiveOffersCache activeOffersCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeOffersCache, "");
        this.Camera2StreamConfigurationMap = lazy;
        this.getHighSpeedVideoFpsRangesFor = activeOffersCache;
        this.mapper = com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.mapper.RewardsSummaryMapperKt.getRewardsSummaryDataMapper();
    }

    public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.Data, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response> getMapper$shopping_rewards_prodRelease() {
        return this.mapper;
    }

    public final void setMapper$shopping_rewards_prodRelease(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.Data, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.mapper = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.RewardsSummaryRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getRewardsSummary(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.RewardsSummaryRepository.RewardsSummaryGraphQLRequest rewardsSummaryGraphQLRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response>>> continuation) {
        com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.RewardsSummaryRepositoryImpl$getRewardsSummary$1 rewardsSummaryRepositoryImpl$getRewardsSummary$1;
        int i;
        arrow.core.Ior ior;
        java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.models.ActiveOfferData> activeOffers;
        java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.models.ActiveOfferData> activeOffers2;
        if (continuation instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.RewardsSummaryRepositoryImpl$getRewardsSummary$1) {
            rewardsSummaryRepositoryImpl$getRewardsSummary$1 = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.RewardsSummaryRepositoryImpl$getRewardsSummary$1) continuation;
            if ((rewardsSummaryRepositoryImpl$getRewardsSummary$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                rewardsSummaryRepositoryImpl$getRewardsSummary$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.RewardsSummaryRepositoryImpl$getRewardsSummary$1 rewardsSummaryRepositoryImpl$getRewardsSummary$12 = rewardsSummaryRepositoryImpl$getRewardsSummary$1;
                java.lang.Object obj = rewardsSummaryRepositoryImpl$getRewardsSummary$12.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = rewardsSummaryRepositoryImpl$getRewardsSummary$12.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.ApolloClient apolloClient = this.Camera2StreamConfigurationMap.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                    com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery getRewardsSummaryQuery = new com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery(rewardsSummaryGraphQLRequest.getActivatedOffersInput(), rewardsSummaryGraphQLRequest.getActivatedCategoryOfferInput(), rewardsSummaryGraphQLRequest.getEligibleOffersInput(), rewardsSummaryGraphQLRequest.getInviteFriendInput());
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.Data, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response> function1 = this.mapper;
                    com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy = com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly;
                    rewardsSummaryRepositoryImpl$getRewardsSummary$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(rewardsSummaryGraphQLRequest);
                    rewardsSummaryRepositoryImpl$getRewardsSummary$12.getHighSpeedVideoFpsRangesFor = 1;
                    obj = com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository.fetchData$default(this, apolloClient, getRewardsSummaryQuery, function1, null, fetchPolicy, rewardsSummaryRepositoryImpl$getRewardsSummary$12, 4, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return ior;
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult dataResult = (com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult) ((arrow.core.Ior.Right) ior).getValue();
                    if (dataResult instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success) {
                        com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent earnContent = ((com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response) ((com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success) dataResult).getData()).getEarnContent();
                        if (earnContent != null && (activeOffers2 = earnContent.getActiveOffers()) != null) {
                            this.getHighSpeedVideoFpsRangesFor.setOffers(activeOffers2);
                        }
                    } else if (!(dataResult instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Empty)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    return new arrow.core.Ior.Right(dataResult);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult dataResult2 = (com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult) both.getRightValue();
                    if (dataResult2 instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success) {
                        com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent earnContent2 = ((com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response) ((com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success) dataResult2).getData()).getEarnContent();
                        if (earnContent2 != null && (activeOffers = earnContent2.getActiveOffers()) != null) {
                            this.getHighSpeedVideoFpsRangesFor.setOffers(activeOffers);
                        }
                    } else if (!(dataResult2 instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Empty)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    return new arrow.core.Ior.Both(leftValue, dataResult2);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        rewardsSummaryRepositoryImpl$getRewardsSummary$1 = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.RewardsSummaryRepositoryImpl$getRewardsSummary$1(this, continuation);
        com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.RewardsSummaryRepositoryImpl$getRewardsSummary$1 rewardsSummaryRepositoryImpl$getRewardsSummary$122 = rewardsSummaryRepositoryImpl$getRewardsSummary$1;
        java.lang.Object obj2 = rewardsSummaryRepositoryImpl$getRewardsSummary$122.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = rewardsSummaryRepositoryImpl$getRewardsSummary$122.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
