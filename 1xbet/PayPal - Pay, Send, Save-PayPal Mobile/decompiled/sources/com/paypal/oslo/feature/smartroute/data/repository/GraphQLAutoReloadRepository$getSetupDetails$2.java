package com.paypal.oslo.feature.smartroute.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRouteSavingsAutoReloadSetupDetailsQuery$Data;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$getSetupDetails$2", f = "GraphQLAutoReloadRepository.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class GraphQLAutoReloadRepository$getSetupDetails$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, ? extends com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Data>>>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.apollographql.apollo.ApolloClient apolloClient;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        apolloClient = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = 1;
        java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default((com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(apolloClient.query(this.getHighSpeedVideoFpsRanges), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly), null, this, 2, null);
        return execute$default == coroutine_suspended ? coroutine_suspended : execute$default;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, ? extends com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Data>>> continuation) {
        return ((com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$getSetupDetails$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$getSetupDetails$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphQLAutoReloadRepository$getSetupDetails$2(com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository graphQLAutoReloadRepository, com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery getSmartRouteSavingsAutoReloadSetupDetailsQuery, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$getSetupDetails$2> continuation) {
        super(1, continuation);
        this.Camera2StreamConfigurationMap = graphQLAutoReloadRepository;
        this.getHighSpeedVideoFpsRanges = getSmartRouteSavingsAutoReloadSetupDetailsQuery;
    }
}
