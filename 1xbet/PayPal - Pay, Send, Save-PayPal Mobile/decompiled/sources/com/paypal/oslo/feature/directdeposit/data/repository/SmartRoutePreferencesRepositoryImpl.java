package com.paypal.oslo.feature.directdeposit.data.repository;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/data/repository/SmartRoutePreferencesRepositoryImpl;", "Lcom/paypal/oslo/feature/directdeposit/domain/repository/SmartRoutePreferencesRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/directdeposit/domain/model/SmartRoutePreferences;", "getSmartRoutePreferences", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/ApolloClient;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SmartRoutePreferencesRepositoryImpl implements com.paypal.oslo.feature.directdeposit.domain.repository.SmartRoutePreferencesRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public SmartRoutePreferencesRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.Camera2StreamConfigurationMap = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.directdeposit.domain.repository.SmartRoutePreferencesRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getSmartRoutePreferences(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences>> continuation) {
        com.paypal.oslo.feature.directdeposit.data.repository.SmartRoutePreferencesRepositoryImpl$getSmartRoutePreferences$1 smartRoutePreferencesRepositoryImpl$getSmartRoutePreferences$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Data data;
        com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.SmartRoutePreferences smartRoutePreferences;
        com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences smartRoutePreferences2;
        com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Data data2;
        com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.SmartRoutePreferences smartRoutePreferences3;
        com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences smartRoutePreferences4;
        if (continuation instanceof com.paypal.oslo.feature.directdeposit.data.repository.SmartRoutePreferencesRepositoryImpl$getSmartRoutePreferences$1) {
            smartRoutePreferencesRepositoryImpl$getSmartRoutePreferences$1 = (com.paypal.oslo.feature.directdeposit.data.repository.SmartRoutePreferencesRepositoryImpl$getSmartRoutePreferences$1) continuation;
            if ((smartRoutePreferencesRepositoryImpl$getSmartRoutePreferences$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                smartRoutePreferencesRepositoryImpl$getSmartRoutePreferences$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = smartRoutePreferencesRepositoryImpl$getSmartRoutePreferences$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = smartRoutePreferencesRepositoryImpl$getSmartRoutePreferences$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery getDirectDepositSmartRoutePreferencesQuery = new com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery();
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.Camera2StreamConfigurationMap.query(getDirectDepositSmartRoutePreferencesQuery), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                    smartRoutePreferencesRepositoryImpl$getSmartRoutePreferences$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getDirectDepositSmartRoutePreferencesQuery);
                    smartRoutePreferencesRepositoryImpl$getSmartRoutePreferences$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, smartRoutePreferencesRepositoryImpl$getSmartRoutePreferences$1, 2, null);
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
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Fetch smart route preferences failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(callError.getClass()).getSimpleName())), null, 4, null);
                    return new arrow.core.Ior.Left(callError);
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    if (graphQLData != null && (data2 = (com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Data) graphQLData.getData()) != null && (smartRoutePreferences3 = data2.getSmartRoutePreferences()) != null && (smartRoutePreferences4 = com.paypal.oslo.feature.directdeposit.data.repository.SmartRoutePreferencesRepositoryImplKt.toSmartRoutePreferences(smartRoutePreferences3)) != null) {
                        return new arrow.core.Ior.Right(smartRoutePreferences4);
                    }
                    java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("No smart route preferences data returned");
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "GraphQL response missing smart route preferences data", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("exception", illegalStateException.getMessage())), null, null, 12, null);
                    return new arrow.core.Ior.Left(new com.paypal.oslo.core.network.graphql.error.CallError.Network(new com.paypal.oslo.core.network.http.error.NetworkError.UnknownError(illegalStateException)));
                }
                if (!(ior instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                java.lang.Object leftValue = both.getLeftValue();
                com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                if (graphQLData2 != null && (data = (com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Data) graphQLData2.getData()) != null && (smartRoutePreferences = data.getSmartRoutePreferences()) != null && (smartRoutePreferences2 = com.paypal.oslo.feature.directdeposit.data.repository.SmartRoutePreferencesRepositoryImplKt.toSmartRoutePreferences(smartRoutePreferences)) != null) {
                    return new arrow.core.Ior.Both(callError2, smartRoutePreferences2);
                }
                return new arrow.core.Ior.Left(callError2);
            }
        }
        smartRoutePreferencesRepositoryImpl$getSmartRoutePreferences$1 = new com.paypal.oslo.feature.directdeposit.data.repository.SmartRoutePreferencesRepositoryImpl$getSmartRoutePreferences$1(this, continuation);
        java.lang.Object obj2 = smartRoutePreferencesRepositoryImpl$getSmartRoutePreferences$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = smartRoutePreferencesRepositoryImpl$getSmartRoutePreferences$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
