package com.paypal.oslo.feature.wallet.banks.data.repository;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/data/repository/InstantBankConfirmationRepositoryImpl;", "Lcom/paypal/oslo/feature/wallet/banks/domain/repository/InstantBankConfirmationRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams;", "params", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorError;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorResult;", "getInstantBankConfirmationAggregator", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/ApolloClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class InstantBankConfirmationRepositoryImpl implements com.paypal.oslo.feature.wallet.banks.domain.repository.InstantBankConfirmationRepository {
    public static final int $stable = 8;
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoSizes;

    @javax.inject.Inject
    public InstantBankConfirmationRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoSizes = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.paypal.oslo.feature.wallet.banks.domain.repository.InstantBankConfirmationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getInstantBankConfirmationAggregator(com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams instantBankConfirmationAggregatorParams, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorError, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorResult>> continuation) {
        com.paypal.oslo.feature.wallet.banks.data.repository.InstantBankConfirmationRepositoryImpl$getInstantBankConfirmationAggregator$1 instantBankConfirmationRepositoryImpl$getInstantBankConfirmationAggregator$1;
        int i;
        arrow.core.Ior ior;
        arrow.core.Either highSpeedVideoFpsRangesFor;
        arrow.core.Either highSpeedVideoSizes;
        if (continuation instanceof com.paypal.oslo.feature.wallet.banks.data.repository.InstantBankConfirmationRepositoryImpl$getInstantBankConfirmationAggregator$1) {
            instantBankConfirmationRepositoryImpl$getInstantBankConfirmationAggregator$1 = (com.paypal.oslo.feature.wallet.banks.data.repository.InstantBankConfirmationRepositoryImpl$getInstantBankConfirmationAggregator$1) continuation;
            if ((instantBankConfirmationRepositoryImpl$getInstantBankConfirmationAggregator$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                instantBankConfirmationRepositoryImpl$getInstantBankConfirmationAggregator$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = instantBankConfirmationRepositoryImpl$getInstantBankConfirmationAggregator$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = instantBankConfirmationRepositoryImpl$getInstantBankConfirmationAggregator$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
                    java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(instantBankConfirmationAggregatorParams.getClass()).getSimpleName();
                    if (simpleName == null) {
                        simpleName = "unknown";
                    }
                    com.paypal.android.logger.Logger.i$default(logger, "getInstantBankConfirmationAggregator: Starting API call", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paramsType", simpleName)), null, 4, null);
                    com.paypal.oslo.api.graphql.schema.type.OpenBankingCapabilityInput graphQLInput = com.paypal.oslo.feature.wallet.banks.data.repository.InstantBankConfirmationRepositoryImplKt.toGraphQLInput(instantBankConfirmationAggregatorParams);
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "getInstantBankConfirmationAggregator: GraphQL input prepared", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("isReconsentFlow", java.lang.String.valueOf(graphQLInput.isReconsentFlow().getOrNull()))), null, 4, null);
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery getOpenBankingCapabilityQuery = new com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery(graphQLInput);
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("get_open_banking_capability", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), null, 2, null);
                    instantBankConfirmationRepositoryImpl$getInstantBankConfirmationAggregator$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(instantBankConfirmationAggregatorParams);
                    instantBankConfirmationRepositoryImpl$getInstantBankConfirmationAggregator$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(graphQLInput);
                    instantBankConfirmationRepositoryImpl$getInstantBankConfirmationAggregator$1.getHighSpeedVideoFpsRanges = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(apolloClient, getOpenBankingCapabilityQuery, callConfig, instantBankConfirmationRepositoryImpl$getInstantBankConfirmationAggregator$1);
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
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.wallet.LoggerKt.log;
                    java.lang.String simpleName2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(callError.getClass()).getSimpleName();
                    com.paypal.android.logger.Logger.i$default(logger2, "getInstantBankConfirmationAggregator: API call failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", simpleName2 != null ? simpleName2 : "unknown")), null, 4, null);
                    highSpeedVideoSizes = com.paypal.oslo.feature.wallet.banks.data.repository.InstantBankConfirmationRepositoryImplKt.getHighSpeedVideoSizes(callError);
                    return highSpeedVideoSizes;
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "getInstantBankConfirmationAggregator: API call succeeded", null, null, 6, null);
                    com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Data data = (com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Data) graphQLData.getData();
                    highSpeedVideoFpsRangesFor = com.paypal.oslo.feature.wallet.banks.data.repository.InstantBankConfirmationRepositoryImplKt.getHighSpeedVideoFpsRangesFor(data != null ? data.getOpenBankingCapability() : null);
                    return highSpeedVideoFpsRangesFor;
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "getInstantBankConfirmationAggregator: Partial success - has errors but data present", null, null, 6, null);
                    return com.paypal.oslo.feature.wallet.banks.data.repository.InstantBankConfirmationRepositoryImplKt.access$handlePartialSuccess((com.paypal.oslo.core.network.graphql.error.CallError) leftValue, (com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Data) graphQLData2.getData());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        instantBankConfirmationRepositoryImpl$getInstantBankConfirmationAggregator$1 = new com.paypal.oslo.feature.wallet.banks.data.repository.InstantBankConfirmationRepositoryImpl$getInstantBankConfirmationAggregator$1(this, continuation);
        java.lang.Object obj2 = instantBankConfirmationRepositoryImpl$getInstantBankConfirmationAggregator$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = instantBankConfirmationRepositoryImpl$getInstantBankConfirmationAggregator$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
