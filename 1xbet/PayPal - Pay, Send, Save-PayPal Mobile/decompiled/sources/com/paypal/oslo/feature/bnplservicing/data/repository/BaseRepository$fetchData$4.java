package com.paypal.oslo.feature.bnplservicing.data.repository;

/* JADX INFO: Add missing generic type declarations: [D] */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u0001\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "D", "Lcom/apollographql/apollo/api/Mutation$Data;", "config", "Lcom/paypal/oslo/core/network/graphql/CallConfig;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository$fetchData$4", f = "BaseRepository.kt", i = {0}, l = {193}, m = "invokeSuspend", n = {"config"}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class BaseRepository$fetchData$4<D> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.core.network.graphql.CallConfig, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, ? extends com.paypal.oslo.core.network.graphql.GraphQLData<D>>>, java.lang.Object> {
    final /* synthetic */ com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.apollographql.apollo.cache.normalized.FetchPolicy getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.apollographql.apollo.api.Mutation<D> getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.network.graphql.CallConfig callConfig = (com.paypal.oslo.core.network.graphql.CallConfig) this.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        java.lang.Object execute = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute((com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.Camera2StreamConfigurationMap.mutation(this.getHighSpeedVideoFpsRangesFor), this.getHighSpeedVideoFpsRanges), callConfig, this);
        return execute == coroutine_suspended ? coroutine_suspended : execute;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.core.network.graphql.CallConfig callConfig, java.lang.Object obj) {
        return ((com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository$fetchData$4) create(callConfig, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository$fetchData$4 baseRepository$fetchData$4 = new com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository$fetchData$4(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
        baseRepository$fetchData$4.getHighSpeedVideoSizes = obj;
        return baseRepository$fetchData$4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseRepository$fetchData$4(com.apollographql.apollo.ApolloClient apolloClient, com.apollographql.apollo.api.Mutation<D> mutation, com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository$fetchData$4> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = apolloClient;
        this.getHighSpeedVideoFpsRangesFor = mutation;
        this.getHighSpeedVideoFpsRanges = fetchPolicy;
    }
}
