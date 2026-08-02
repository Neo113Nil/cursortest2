package com.apollographql.apollo.network.http;

/* JADX INFO: Add missing generic type declarations: [D] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.http.HttpNetworkTransport$execute$1", f = "HttpNetworkTransport.kt", i = {0, 0}, l = {71, 107}, m = "invokeSuspend", n = {"$this$flow", "millisStart"}, s = {"L$0", "J$0"})
/* loaded from: classes3.dex */
final class HttpNetworkTransport$execute$1<D> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.apollographql.apollo.api.ApolloResponse<D>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.apollographql.apollo.api.http.HttpRequest Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.apollographql.apollo.api.CustomScalarAdapters getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.apollographql.apollo.api.ApolloRequest<D> getHighSpeedVideoFpsRangesFor;
    long getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.apollographql.apollo.network.http.HttpNetworkTransport getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e6, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r4, new com.apollographql.apollo.network.http.HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1<>(r10, r11, r12, r13, r14), r16) != r2) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        long currentTimeMillis;
        com.apollographql.apollo.network.http.HttpNetworkTransport.EngineInterceptor engineInterceptor;
        java.lang.Object proceed;
        kotlinx.coroutines.flow.FlowCollector flowCollector2;
        long j;
        final com.apollographql.apollo.api.http.HttpResponse httpResponse;
        final long j2;
        kotlinx.coroutines.flow.Flow access$errorResponse;
        com.apollographql.apollo.api.ApolloResponse Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getInputSizeshNQ4ISI;
            currentTimeMillis = com.apollographql.apollo.mpp.UtilsKt.currentTimeMillis();
            try {
                java.util.List<com.apollographql.apollo.network.http.HttpInterceptor> interceptors = this.getOutputMinFrameDuration.getInterceptors();
                engineInterceptor = this.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI;
                this.getInputSizeshNQ4ISI = flowCollector;
                this.getHighSpeedVideoSizes = currentTimeMillis;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                proceed = new com.apollographql.apollo.network.http.DefaultHttpInterceptorChain(kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.apollographql.apollo.network.http.HttpNetworkTransport.EngineInterceptor>) interceptors, engineInterceptor), 0).proceed(this.Camera2StreamConfigurationMap, this);
                if (proceed != coroutine_suspended) {
                    flowCollector2 = flowCollector;
                    j = currentTimeMillis;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                if (!(th instanceof java.util.concurrent.CancellationException)) {
                }
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        j = this.getHighSpeedVideoSizes;
        flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getInputSizeshNQ4ISI;
        try {
            kotlin.ResultKt.throwOnFailure(obj);
            proceed = obj;
        } catch (java.lang.Throwable th2) {
            th = th2;
            currentTimeMillis = j;
            flowCollector = flowCollector2;
            if (!(th instanceof java.util.concurrent.CancellationException)) {
                throw th;
            }
            httpResponse = null;
            flowCollector2 = flowCollector;
            j2 = currentTimeMillis;
            if (httpResponse != null) {
            }
            final kotlinx.coroutines.flow.Flow flow = access$errorResponse;
            final com.apollographql.apollo.network.http.HttpNetworkTransport httpNetworkTransport = this.getOutputMinFrameDuration;
            final com.apollographql.apollo.api.ApolloRequest<D> apolloRequest = this.getHighSpeedVideoFpsRangesFor;
            this.getInputSizeshNQ4ISI = null;
            this.getHighResolutionOutputSizeshNQ4ISI = 2;
        }
        httpResponse = (com.apollographql.apollo.api.http.HttpResponse) proceed;
        th = null;
        j2 = j;
        if (httpResponse != null) {
            com.apollographql.apollo.network.http.HttpNetworkTransport httpNetworkTransport2 = this.getOutputMinFrameDuration;
            com.apollographql.apollo.api.Operation<D> operation = this.getHighSpeedVideoFpsRangesFor.getOperation();
            kotlin.jvm.internal.Intrinsics.checkNotNull(th);
            Camera2StreamConfigurationMap = com.apollographql.apollo.network.http.HttpNetworkTransport.Camera2StreamConfigurationMap(operation, th);
            access$errorResponse = kotlinx.coroutines.flow.FlowKt.flowOf(Camera2StreamConfigurationMap);
        } else {
            int statusCode = httpResponse.getStatusCode();
            if ((200 > statusCode || statusCode >= 300) && !com.apollographql.apollo.internal.MultipartKt.isGraphQLResponse(httpResponse)) {
                access$errorResponse = com.apollographql.apollo.network.http.HttpNetworkTransport.access$errorResponse(this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor.getOperation(), httpResponse);
            } else if (com.apollographql.apollo.internal.MultipartKt.isMultipart(httpResponse)) {
                access$errorResponse = com.apollographql.apollo.network.http.HttpNetworkTransport.access$multipleResponses(this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor.getOperation(), this.getHighSpeedVideoFpsRanges, httpResponse);
            } else {
                access$errorResponse = com.apollographql.apollo.network.http.HttpNetworkTransport.access$singleResponse(this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor.getOperation(), this.getHighSpeedVideoFpsRanges, httpResponse);
            }
        }
        final kotlinx.coroutines.flow.Flow flow2 = access$errorResponse;
        final com.apollographql.apollo.network.http.HttpNetworkTransport httpNetworkTransport3 = this.getOutputMinFrameDuration;
        final com.apollographql.apollo.api.ApolloRequest<D> apolloRequest2 = this.getHighSpeedVideoFpsRangesFor;
        this.getInputSizeshNQ4ISI = null;
        this.getHighResolutionOutputSizeshNQ4ISI = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.network.http.HttpNetworkTransport$execute$1) create((kotlinx.coroutines.flow.FlowCollector) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.apollographql.apollo.network.http.HttpNetworkTransport$execute$1 httpNetworkTransport$execute$1 = new com.apollographql.apollo.network.http.HttpNetworkTransport$execute$1(this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
        httpNetworkTransport$execute$1.getInputSizeshNQ4ISI = obj;
        return httpNetworkTransport$execute$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpNetworkTransport$execute$1(com.apollographql.apollo.network.http.HttpNetworkTransport httpNetworkTransport, com.apollographql.apollo.api.http.HttpRequest httpRequest, com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.http.HttpNetworkTransport$execute$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = httpNetworkTransport;
        this.Camera2StreamConfigurationMap = httpRequest;
        this.getHighSpeedVideoFpsRangesFor = apolloRequest;
        this.getHighSpeedVideoFpsRanges = customScalarAdapters;
    }
}
