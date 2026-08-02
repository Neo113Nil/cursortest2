package com.apollographql.apollo;

/* JADX INFO: Add missing generic type declarations: [D] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.ApolloClient$executeAsFlowInternal$flow$1", f = "ApolloClient.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ApolloClient$executeAsFlowInternal$flow$1<D> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.apollographql.apollo.api.ApolloResponse<D>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.apollographql.apollo.api.ApolloRequest<D> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List list;
        com.apollographql.apollo.api.ApolloRequest<D> apolloRequest;
        java.util.Iterator it;
        java.util.List list2;
        com.apollographql.apollo.ConcurrencyInfo concurrencyInfo;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.Camera2StreamConfigurationMap;
                list2 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizesFor;
                com.apollographql.apollo.api.ApolloRequest<D> apolloRequest2 = this.getHighResolutionOutputSizeshNQ4ISI;
                java.util.Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    ((com.apollographql.apollo.internal.ApolloClientListener) it2.next()).requestStarted(apolloRequest2);
                }
                concurrencyInfo = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoSizes = 1;
                if (kotlinx.coroutines.BuildersKt.withContext(concurrencyInfo.getDispatcher(), new com.apollographql.apollo.ApolloClient$executeAsFlowInternal$flow$1.AnonymousClass2(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, producerScope, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            while (it.hasNext()) {
                ((com.apollographql.apollo.internal.ApolloClientListener) it.next()).requestCompleted(apolloRequest);
            }
            return kotlin.Unit.INSTANCE;
        } finally {
            list = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizesFor;
            apolloRequest = this.getHighResolutionOutputSizeshNQ4ISI;
            it = list.iterator();
            while (it.hasNext()) {
                ((com.apollographql.apollo.internal.ApolloClientListener) it.next()).requestCompleted(apolloRequest);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.ApolloClient$executeAsFlowInternal$flow$1$2", f = "ApolloClient.kt", i = {}, l = {263}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.apollographql.apollo.ApolloClient$executeAsFlowInternal$flow$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.apollographql.apollo.api.ApolloResponse<D>> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.apollographql.apollo.api.ApolloRequest<D> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.apollographql.apollo.ApolloClient getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.Flow apolloResponses$apollo_runtime_release = this.getHighSpeedVideoSizes.apolloResponses$apollo_runtime_release(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
                final kotlinx.coroutines.channels.ProducerScope<com.apollographql.apollo.api.ApolloResponse<D>> producerScope = this.getHighResolutionOutputSizeshNQ4ISI;
                this.Camera2StreamConfigurationMap = 1;
                if (apolloResponses$apollo_runtime_release.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.apollographql.apollo.ApolloClient.executeAsFlowInternal.flow.1.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        java.lang.Object send = producerScope.send((com.apollographql.apollo.api.ApolloResponse) obj2, continuation);
                        return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.apollographql.apollo.ApolloClient$executeAsFlowInternal$flow$1.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.apollographql.apollo.ApolloClient$executeAsFlowInternal$flow$1.AnonymousClass2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(com.apollographql.apollo.ApolloClient apolloClient, com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, boolean z, kotlinx.coroutines.channels.ProducerScope<? super com.apollographql.apollo.api.ApolloResponse<D>> producerScope, kotlin.coroutines.Continuation<? super com.apollographql.apollo.ApolloClient$executeAsFlowInternal$flow$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = apolloClient;
            this.getHighSpeedVideoFpsRangesFor = apolloRequest;
            this.getHighSpeedVideoFpsRanges = z;
            this.getHighResolutionOutputSizeshNQ4ISI = producerScope;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.ApolloClient$executeAsFlowInternal$flow$1) create((kotlinx.coroutines.channels.ProducerScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.apollographql.apollo.ApolloClient$executeAsFlowInternal$flow$1 apolloClient$executeAsFlowInternal$flow$1 = new com.apollographql.apollo.ApolloClient$executeAsFlowInternal$flow$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
        apolloClient$executeAsFlowInternal$flow$1.Camera2StreamConfigurationMap = obj;
        return apolloClient$executeAsFlowInternal$flow$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ApolloClient$executeAsFlowInternal$flow$1(com.apollographql.apollo.ApolloClient apolloClient, com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, boolean z, kotlin.coroutines.Continuation<? super com.apollographql.apollo.ApolloClient$executeAsFlowInternal$flow$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = apolloClient;
        this.getHighResolutionOutputSizeshNQ4ISI = apolloRequest;
        this.getHighSpeedVideoFpsRangesFor = z;
    }
}
