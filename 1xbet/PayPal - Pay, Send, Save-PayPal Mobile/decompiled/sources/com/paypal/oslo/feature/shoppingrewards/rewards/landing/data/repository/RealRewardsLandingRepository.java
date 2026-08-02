package com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.repository;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0096@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00118\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/data/repository/RealRewardsLandingRepository;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/repository/RewardsLandingRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/models/RewardsLandingData;", "getRewardsLandingData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Ldagger/Lazy;", "Camera2StreamConfigurationMap", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Data;", "mapper", "Lkotlin/jvm/functions/Function1;", "getMapper$shopping_rewards_prodRelease", "()Lkotlin/jvm/functions/Function1;", "setMapper$shopping_rewards_prodRelease", "(Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RealRewardsLandingRepository extends com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository implements com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.repository.RewardsLandingRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;
    private kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Data, com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.RewardsLandingData> mapper;

    public RealRewardsLandingRepository(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.Camera2StreamConfigurationMap = lazy;
        this.mapper = com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.mapper.RewardsLandingDataMapperKt.getRewardsLandingDataMapper();
    }

    public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Data, com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.RewardsLandingData> getMapper$shopping_rewards_prodRelease() {
        return this.mapper;
    }

    public final void setMapper$shopping_rewards_prodRelease(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Data, com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.RewardsLandingData> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.mapper = function1;
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.repository.RewardsLandingRepository
    public final java.lang.Object getRewardsLandingData(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.RewardsLandingData>>> continuation) {
        com.apollographql.apollo.ApolloClient apolloClient = this.Camera2StreamConfigurationMap.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
        return com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository.fetchData$default(this, apolloClient, new com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery(com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.LoyaltyMembershipsInput(com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.api.graphql.schema.type.LoyaltyProgramCode.PAYPAL_PLUS_UK))))), this.mapper, null, com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly, continuation, 4, null);
    }
}
