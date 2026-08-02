package com.apollographql.apollo.network.http;

/* JADX INFO: Add missing generic type declarations: [D] */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/api/ApolloResponse;", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$2", f = "HttpNetworkTransport.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class HttpNetworkTransport$multipleResponses$2<D> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super com.apollographql.apollo.api.ApolloResponse<D>>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.apollographql.apollo.network.http.HttpNetworkTransport getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.apollographql.apollo.api.Operation<D> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Throwable th = (java.lang.Throwable) this.getHighSpeedVideoFpsRangesFor;
            com.apollographql.apollo.api.Operation<D> operation = this.getHighSpeedVideoSizes;
            java.util.UUID randomUUID = java.util.UUID.randomUUID();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(randomUUID, "");
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.Camera2StreamConfigurationMap = 1;
            if (flowCollector.emit(new com.apollographql.apollo.api.ApolloResponse.Builder(operation, randomUUID).exception(com.apollographql.apollo.network.http.HttpNetworkTransport.access$wrapIfNeeded(this.getHighSpeedVideoFpsRanges, th)).build(), this) == coroutine_suspended) {
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
        com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$2 httpNetworkTransport$multipleResponses$2 = new com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
        httpNetworkTransport$multipleResponses$2.getHighResolutionOutputSizeshNQ4ISI = (kotlinx.coroutines.flow.FlowCollector) obj;
        httpNetworkTransport$multipleResponses$2.getHighSpeedVideoFpsRangesFor = th;
        return httpNetworkTransport$multipleResponses$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpNetworkTransport$multipleResponses$2(com.apollographql.apollo.api.Operation<D> operation, com.apollographql.apollo.network.http.HttpNetworkTransport httpNetworkTransport, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$2> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoSizes = operation;
        this.getHighSpeedVideoFpsRanges = httpNetworkTransport;
    }
}
