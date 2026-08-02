package com.paypal.oslo.core.network.graphql.error;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00070\u00050\u00042\u0006\u0010\b\u001a\u00020\tH\n"}, d2 = {"<anonymous>", "", "T", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "e", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor$toFlow$2", f = "ApolloQueryExecutor.kt", i = {0, 0}, l = {96}, m = "invokeSuspend", n = {"$this$catch", "e"}, nl = {97}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes4.dex */
final class ApolloQueryExecutor$toFlow$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, ? extends com.paypal.oslo.core.network.graphql.GraphQLData<T>>>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.network.http.error.NetworkError highSpeedVideoFpsRangesFor;
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Throwable th = (java.lang.Throwable) this.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            highSpeedVideoFpsRangesFor = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(th);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(th);
            this.Camera2StreamConfigurationMap = 1;
            if (flowCollector.emit(new arrow.core.Ior.Left(new com.paypal.oslo.core.network.graphql.error.CallError.Network(highSpeedVideoFpsRangesFor)), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor$toFlow$2 apolloQueryExecutor$toFlow$2 = new com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor$toFlow$2(this.getHighSpeedVideoSizes, continuation);
        apolloQueryExecutor$toFlow$2.getHighResolutionOutputSizeshNQ4ISI = (kotlinx.coroutines.flow.FlowCollector) obj;
        apolloQueryExecutor$toFlow$2.getHighSpeedVideoFpsRangesFor = th;
        return apolloQueryExecutor$toFlow$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ApolloQueryExecutor$toFlow$2(com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor apolloQueryExecutor, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor$toFlow$2> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoSizes = apolloQueryExecutor;
    }
}
