package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.data.repository;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007JB\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/data/repository/RedeemPointsToCharityRepositoryImpl;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/repository/RedeemPointsToCharityRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "charityId", "idempotencyKey", "", "shareContactConsent", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/repository/RedeemPointsResponse;", "redeemPointsToCharity", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Ldagger/Lazy;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RedeemPointsToCharityRepositoryImpl extends com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository implements com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsToCharityRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public RedeemPointsToCharityRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighSpeedVideoFpsRanges = lazy;
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsToCharityRepository
    public final java.lang.Object redeemPointsToCharity(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsResponse>>> continuation) {
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.data.repository.RedeemPointsToCharityRepositoryImpl redeemPointsToCharityRepositoryImpl = this;
        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRanges.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
        com.apollographql.apollo.ApolloClient apolloClient2 = apolloClient;
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        com.apollographql.apollo.api.Optional.Present present = com.apollographql.apollo.api.Optional.INSTANCE.present(str2);
        com.apollographql.apollo.api.Optional.Present present2 = com.apollographql.apollo.api.Optional.INSTANCE.present(str3);
        com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
        if (!boxBoolean.booleanValue()) {
            boxBoolean = null;
        }
        return com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository.fetchData$default(redeemPointsToCharityRepositoryImpl, apolloClient2, new com.paypal.oslo.feature.shoppingrewards.graphql.RedeemPointsToCharityMutation(new com.paypal.oslo.api.graphql.schema.type.CurrencyInput(null, null, companion.present(new com.paypal.oslo.api.graphql.schema.type.RewardPointsInput(str, present, present2, companion2.presentIfNotNull(boxBoolean))), 3, null)), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.data.repository.RedeemPointsToCharityRepositoryImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.data.repository.RedeemPointsToCharityRepositoryImpl.$r8$lambda$fUsC4noEMJz_UtBfgVtpPedpCnU((com.paypal.oslo.feature.shoppingrewards.graphql.RedeemPointsToCharityMutation.Data) obj);
            }
        }, null, continuation, 4, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsResponse $r8$lambda$fUsC4noEMJz_UtBfgVtpPedpCnU(com.paypal.oslo.feature.shoppingrewards.graphql.RedeemPointsToCharityMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.data.mapper.RedeemPointsMapperKt.toRedeemPointsToCharityResponse(data);
    }
}
