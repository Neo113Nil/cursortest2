package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\f*\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/RedeemRewardsRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/RedeemRewardsRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;", "featureGateManager", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/RedeemRewardsError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RewardsSummaryResult;", "fetchRewardsSummary", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedeemRewardRequest;", "request", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionResult;", "redeemRewards", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedeemRewardRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/RedeemRewardsError;", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RedeemRewardsRepositoryImpl extends com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository implements com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public RedeemRewardsRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        this.getHighSpeedVideoFpsRangesFor = apolloClient;
        this.Camera2StreamConfigurationMap = featureGateManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchRewardsSummary(final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsSummaryResult>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl$fetchRewardsSummary$1 redeemRewardsRepositoryImpl$fetchRewardsSummary$1;
        int i;
        arrow.core.Ior ior;
        arrow.core.Ior rightIor;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl$fetchRewardsSummary$1) {
            redeemRewardsRepositoryImpl$fetchRewardsSummary$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl$fetchRewardsSummary$1) continuation;
            if ((redeemRewardsRepositoryImpl$fetchRewardsSummary$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                redeemRewardsRepositoryImpl$fetchRewardsSummary$1.Camera2StreamConfigurationMap -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl$fetchRewardsSummary$1 redeemRewardsRepositoryImpl$fetchRewardsSummary$12 = redeemRewardsRepositoryImpl$fetchRewardsSummary$1;
                java.lang.Object obj = redeemRewardsRepositoryImpl$fetchRewardsSummary$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = redeemRewardsRepositoryImpl$fetchRewardsSummary$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCRewardsSummaryQuery getCBMCRewardsSummaryQuery = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCRewardsSummaryQuery(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditProductIdentifierMapperKt.toGraphql(creditProductIdentifier), null, !this.Camera2StreamConfigurationMap.isPayPalPlusCbmcEnabled(), 2, null);
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl.$r8$lambda$U59EwjyBSe1hKLYEJvyZamQydqI(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl.this, (com.paypal.oslo.core.network.graphql.error.CallError) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl.$r8$lambda$Z2ltXLAxOcGeCpx1HM2fyLj_onw((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCRewardsSummaryQuery.Data) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl.m18043$r8$lambda$MYjBEtLS8nQjFuzIB6ORfGAq1g(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.this, (com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope) obj2);
                        }
                    };
                    redeemRewardsRepositoryImpl$fetchRewardsSummary$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier);
                    redeemRewardsRepositoryImpl$fetchRewardsSummary$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getCBMCRewardsSummaryQuery);
                    redeemRewardsRepositoryImpl$fetchRewardsSummary$12.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository.fetchData$default(this, this.getHighSpeedVideoFpsRangesFor, getCBMCRewardsSummaryQuery, function1, function12, null, function13, redeemRewardsRepositoryImpl$fetchRewardsSummary$12, 8, null);
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
                    return arrow.core.IorKt.leftIor((com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsError) ((arrow.core.Ior.Left) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    kotlin.Triple triple = (kotlin.Triple) ((arrow.core.Ior.Right) ior).getValue();
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary = triple != null ? (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary) triple.getFirst() : null;
                    return (rewardsSummary == null || (rightIor = arrow.core.IorKt.rightIor(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsSummaryResult(rewardsSummary, triple != null ? (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers) triple.getSecond() : null, triple != null ? (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls) triple.getThird() : null))) == null) ? arrow.core.IorKt.leftIor(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsError.Default.INSTANCE) : rightIor;
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    return arrow.core.IorKt.leftIor((com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsError) leftValue);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        redeemRewardsRepositoryImpl$fetchRewardsSummary$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl$fetchRewardsSummary$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl$fetchRewardsSummary$1 redeemRewardsRepositoryImpl$fetchRewardsSummary$122 = redeemRewardsRepositoryImpl$fetchRewardsSummary$1;
        java.lang.Object obj2 = redeemRewardsRepositoryImpl$fetchRewardsSummary$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = redeemRewardsRepositoryImpl$fetchRewardsSummary$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object redeemRewards(final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedeemRewardRequest redeemRewardRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionResult>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl$redeemRewards$1 redeemRewardsRepositoryImpl$redeemRewards$1;
        int i;
        arrow.core.Either either;
        arrow.core.Either right;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl$redeemRewards$1) {
            redeemRewardsRepositoryImpl$redeemRewards$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl$redeemRewards$1) continuation;
            if ((redeemRewardsRepositoryImpl$redeemRewards$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                redeemRewardsRepositoryImpl$redeemRewards$1.Camera2StreamConfigurationMap -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl$redeemRewards$1 redeemRewardsRepositoryImpl$redeemRewards$12 = redeemRewardsRepositoryImpl$redeemRewards$1;
                java.lang.Object obj = redeemRewardsRepositoryImpl$redeemRewards$12.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = redeemRewardsRepositoryImpl$redeemRewards$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation redeemRevolvingCreditRewardMutation = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.rewards.RedeemRewardsMapperKt.toGraphQLInput(redeemRewardRequest));
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl.$r8$lambda$IpK1pxXnjx4vSDnnsTK99feHjZk(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl.this, (com.paypal.oslo.core.network.graphql.error.CallError) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl.$r8$lambda$jx011lAFspHuCJ6TjXSGVmbjhgo(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedeemRewardRequest.this, (com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.Data) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl.$r8$lambda$ZFd_8J37qtC21a7SfreiPlHuZH8(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedeemRewardRequest.this, (com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope) obj2);
                        }
                    };
                    redeemRewardsRepositoryImpl$redeemRewards$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(redeemRewardRequest);
                    redeemRewardsRepositoryImpl$redeemRewards$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(redeemRevolvingCreditRewardMutation);
                    redeemRewardsRepositoryImpl$redeemRewards$12.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository.executeMutation$default(this, this.getHighSpeedVideoFpsRangesFor, redeemRevolvingCreditRewardMutation, function1, function12, null, function13, redeemRewardsRepositoryImpl$redeemRewards$12, 8, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionResult redemptionResult = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionResult) ((arrow.core.Either.Right) either).getValue();
                    return (redemptionResult == null || (right = arrow.core.EitherKt.right(redemptionResult)) == null) ? arrow.core.EitherKt.left(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsError.Default.INSTANCE) : right;
                }
                if (either instanceof arrow.core.Either.Left) {
                    return arrow.core.EitherKt.left((com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsError) ((arrow.core.Either.Left) either).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        redeemRewardsRepositoryImpl$redeemRewards$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl$redeemRewards$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl$redeemRewards$1 redeemRewardsRepositoryImpl$redeemRewards$122 = redeemRewardsRepositoryImpl$redeemRewards$1;
        java.lang.Object obj2 = redeemRewardsRepositoryImpl$redeemRewards$122.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = redeemRewardsRepositoryImpl$redeemRewards$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    private static com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsError getHighSpeedVideoSizes(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsError.Network.INSTANCE;
        }
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsError.Default.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsError $r8$lambda$IpK1pxXnjx4vSDnnsTK99feHjZk(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl redeemRewardsRepositoryImpl, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        return getHighSpeedVideoSizes(callError);
    }

    /* renamed from: $r8$lambda$MYjBEtLS8nQjFuz-IB6ORfGAq1g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18043$r8$lambda$MYjBEtLS8nQjFuzIB6ORfGAq1g(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope networkObservabilityAttributesScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkObservabilityAttributesScope, "");
        networkObservabilityAttributesScope.addCpi(creditProductIdentifier);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsError $r8$lambda$U59EwjyBSe1hKLYEJvyZamQydqI(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl redeemRewardsRepositoryImpl, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        return getHighSpeedVideoSizes(callError);
    }

    public static /* synthetic */ kotlin.Triple $r8$lambda$Z2ltXLAxOcGeCpx1HM2fyLj_onw(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCRewardsSummaryQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.RewardsSummaryMapperKt.toDomain(data);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZFd_8J37qtC21a7SfreiPlHuZH8(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedeemRewardRequest redeemRewardRequest, com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope networkObservabilityAttributesScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkObservabilityAttributesScope, "");
        networkObservabilityAttributesScope.addCpi(redeemRewardRequest.getCreditProductIdentifier());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionResult $r8$lambda$jx011lAFspHuCJ6TjXSGVmbjhgo(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedeemRewardRequest redeemRewardRequest, com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.rewards.RedeemRewardsMapperKt.toRedemptionResult(data, redeemRewardRequest);
    }
}
