package com.apollographql.apollo.cache.normalized.internal;

@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006JD\u0010\t\u001a\u00020\n\"\b\b\u0000\u0010\u000b*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000e2\u001c\u0010\u000f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010H\u0082@¢\u0006\u0002\u0010\u0013JL\u0010\u0014\u001a\u00020\n\"\b\b\u0000\u0010\u000b*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0082@¢\u0006\u0002\u0010\u001cJ4\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u00160\u001e\"\b\b\u0000\u0010\u000b*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000e2\u0006\u0010\u001f\u001a\u00020 H\u0016J4\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u00160\u001e\"\b\b\u0000\u0010\u000b*\u00020\"2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000e2\u0006\u0010\u001f\u001a\u00020 H\u0002J4\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u00160\u001e\"\b\b\u0000\u0010\u000b*\u00020&2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000e2\u0006\u0010\u001f\u001a\u00020 H\u0002J4\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u00160\u001e\"\b\b\u0000\u0010\u000b*\u00020(2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000e2\u0006\u0010\u001f\u001a\u00020 H\u0002J.\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0016\"\b\b\u0000\u0010\u000b*\u00020(2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J<\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u00160\u001e\"\b\b\u0000\u0010\u000b*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\u0017\u001a\u00020\u0018\"\b\b\u0000\u0010\u000b*\u00020\f*\b\u0012\u0004\u0012\u0002H\u000b0\u000e8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006,"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/internal/ApolloCacheInterceptor;", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "Lcom/apollographql/apollo/cache/normalized/ApolloStoreInterceptor;", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "Lcom/apollographql/apollo/cache/normalized/ApolloStore;", "<init>", "(Lcom/apollographql/apollo/cache/normalized/ApolloStore;)V", "getStore", "()Lcom/apollographql/apollo/cache/normalized/ApolloStore;", "maybeAsync", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "request", "Lcom/apollographql/apollo/api/ApolloRequest;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lcom/apollographql/apollo/api/ApolloRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "maybeWriteToCache", "response", "Lcom/apollographql/apollo/api/ApolloResponse;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "extraKeys", "", "", "(Lcom/apollographql/apollo/api/ApolloRequest;Lcom/apollographql/apollo/api/ApolloResponse;Lcom/apollographql/apollo/api/CustomScalarAdapters;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercept", "Lkotlinx/coroutines/flow/Flow;", "chain", "Lcom/apollographql/apollo/interceptor/ApolloInterceptorChain;", "interceptSubscription", "Lcom/apollographql/apollo/api/Subscription$Data;", "getCustomScalarAdapters", "(Lcom/apollographql/apollo/api/ApolloRequest;)Lcom/apollographql/apollo/api/CustomScalarAdapters;", "interceptMutation", "Lcom/apollographql/apollo/api/Mutation$Data;", "interceptQuery", "Lcom/apollographql/apollo/api/Query$Data;", "readFromCache", "readFromNetwork", "Companion", "apollo-normalized-cache"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ApolloCacheInterceptor implements com.apollographql.apollo.interceptor.ApolloInterceptor, com.apollographql.apollo.cache.normalized.ApolloStoreInterceptor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor.Companion INSTANCE = new com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor.Companion(null);
    private final com.apollographql.apollo.cache.normalized.ApolloStore store;

    public ApolloCacheInterceptor(com.apollographql.apollo.cache.normalized.ApolloStore apolloStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloStore, "");
        this.store = apolloStore;
    }

    public final com.apollographql.apollo.cache.normalized.ApolloStore getStore() {
        return this.store;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <D extends com.apollographql.apollo.api.Operation.Data> java.lang.Object Camera2StreamConfigurationMap(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (com.apollographql.apollo.cache.normalized.NormalizedCache.getWriteToCacheAsynchronously(apolloRequest)) {
            com.apollographql.apollo.api.ExecutionContext.Element element = apolloRequest.getExecutionContext().get(com.apollographql.apollo.ConcurrencyInfo.INSTANCE);
            kotlin.jvm.internal.Intrinsics.checkNotNull(element);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(((com.apollographql.apollo.ConcurrencyInfo) element).getCoroutineScope(), null, null, new com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$maybeAsync$2(function1, null), 3, null);
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object invoke = function1.invoke(continuation);
        return invoke == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends com.apollographql.apollo.api.Operation.Data> java.lang.Object getHighSpeedVideoFpsRanges(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, com.apollographql.apollo.api.ApolloResponse<D> apolloResponse, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.util.Set<java.lang.String> set, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (com.apollographql.apollo.cache.normalized.NormalizedCache.getDoNotStore(apolloRequest)) {
            return kotlin.Unit.INSTANCE;
        }
        if (apolloResponse.data == null) {
            return kotlin.Unit.INSTANCE;
        }
        if (apolloResponse.hasErrors() && !com.apollographql.apollo.cache.normalized.NormalizedCache.getStorePartialResponses(apolloRequest)) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(apolloRequest, new com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$maybeWriteToCache$2(apolloResponse, apolloRequest, this, customScalarAdapters, set, null), continuation);
        return Camera2StreamConfigurationMap == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? Camera2StreamConfigurationMap : kotlin.Unit.INSTANCE;
    }

    @Override // com.apollographql.apollo.interceptor.ApolloInterceptor
    public final <D extends com.apollographql.apollo.api.Operation.Data> kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> intercept(com.apollographql.apollo.api.ApolloRequest<D> request, com.apollographql.apollo.interceptor.ApolloInterceptorChain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        com.apollographql.apollo.api.Operation<D> operation = request.getOperation();
        if (!(operation instanceof com.apollographql.apollo.api.Subscription)) {
            if (!(operation instanceof com.apollographql.apollo.api.Mutation)) {
                if (!(operation instanceof com.apollographql.apollo.api.Query)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown operation ");
                    sb.append(request.getOperation());
                    throw new java.lang.IllegalStateException(sb.toString().toString());
                }
                kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> flow = kotlinx.coroutines.flow.FlowKt.flow(new com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$interceptQuery$1(com.apollographql.apollo.cache.normalized.NormalizedCache.getFetchFromCache(request), this, request, getCustomScalarAdapters(request), chain, null));
                kotlin.jvm.internal.Intrinsics.checkNotNull(flow, "");
                return flow;
            }
            kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> flow2 = kotlinx.coroutines.flow.FlowKt.flow(new com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$interceptMutation$1(request, this, getCustomScalarAdapters(request), chain, null));
            kotlin.jvm.internal.Intrinsics.checkNotNull(flow2, "");
            return flow2;
        }
        kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> onEach = kotlinx.coroutines.flow.FlowKt.onEach(chain.proceed(request), new com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$interceptSubscription$1(this, request, getCustomScalarAdapters(request), null));
        kotlin.jvm.internal.Intrinsics.checkNotNull(onEach, "");
        return onEach;
    }

    public final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.api.CustomScalarAdapters getCustomScalarAdapters(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloRequest, "");
        com.apollographql.apollo.api.ExecutionContext.Element element = apolloRequest.getExecutionContext().get(com.apollographql.apollo.api.CustomScalarAdapters.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNull(element);
        return (com.apollographql.apollo.api.CustomScalarAdapters) element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends com.apollographql.apollo.api.Query.Data> com.apollographql.apollo.api.ApolloResponse<D> getHighResolutionOutputSizeshNQ4ISI(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        com.apollographql.apollo.api.Operation<D> operation = apolloRequest.getOperation();
        long currentTimeMillis = com.apollographql.apollo.mpp.UtilsKt.currentTimeMillis();
        try {
            com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders = com.apollographql.apollo.cache.normalized.NormalizedCache.getCacheHeaders(apolloRequest);
            if (com.apollographql.apollo.cache.normalized.NormalizedCache.getMemoryCacheOnly(apolloRequest)) {
                cacheHeaders = cacheHeaders.plus(new com.apollographql.apollo.cache.normalized.api.CacheHeaders.Builder().addHeader(com.apollographql.apollo.cache.normalized.api.ApolloCacheHeaders.MEMORY_CACHE_ONLY, "true").build());
            }
            return com.apollographql.apollo.cache.normalized.NormalizedCache.cacheInfo(new com.apollographql.apollo.api.ApolloResponse.Builder(operation, apolloRequest.getRequestUuid()).data((com.apollographql.apollo.api.Query.Data) this.store.readOperation(operation, customScalarAdapters, cacheHeaders)).addExecutionContext(apolloRequest.getExecutionContext()), new com.apollographql.apollo.cache.normalized.CacheInfo.Builder().cacheStartMillis(currentTimeMillis).cacheEndMillis(com.apollographql.apollo.mpp.UtilsKt.currentTimeMillis()).cacheHit(true).build()).isLast(true).build();
        } catch (com.apollographql.apollo.exception.CacheMissException e) {
            return com.apollographql.apollo.cache.normalized.NormalizedCache.cacheInfo(new com.apollographql.apollo.api.ApolloResponse.Builder(operation, apolloRequest.getRequestUuid()).exception(e).addExecutionContext(apolloRequest.getExecutionContext()), new com.apollographql.apollo.cache.normalized.CacheInfo.Builder().cacheStartMillis(currentTimeMillis).cacheEndMillis(com.apollographql.apollo.mpp.UtilsKt.currentTimeMillis()).cacheHit(false).cacheMissException(e).build()).isLast(true).build();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/internal/ApolloCacheInterceptor$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ kotlinx.coroutines.flow.Flow access$readFromNetwork(com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor apolloCacheInterceptor, com.apollographql.apollo.api.ApolloRequest apolloRequest, com.apollographql.apollo.interceptor.ApolloInterceptorChain apolloInterceptorChain, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        final long currentTimeMillis = com.apollographql.apollo.mpp.UtilsKt.currentTimeMillis();
        final kotlinx.coroutines.flow.Flow onEach = kotlinx.coroutines.flow.FlowKt.onEach(apolloInterceptorChain.proceed(apolloRequest), new com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$readFromNetwork$1(apolloCacheInterceptor, apolloRequest, customScalarAdapters, null));
        return new kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>>() { // from class: com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$readFromNetwork$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$readFromNetwork$$inlined$map$1.AnonymousClass2(flowCollector, currentTimeMillis), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$readFromNetwork$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ long Camera2StreamConfigurationMap;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighResolutionOutputSizeshNQ4ISI;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$readFromNetwork$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$readFromNetwork$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$readFromNetwork$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighSpeedVideoFpsRanges -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.Camera2StreamConfigurationMap;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoFpsRanges;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
                                com.apollographql.apollo.api.ApolloResponse apolloResponse = (com.apollographql.apollo.api.ApolloResponse) obj;
                                com.apollographql.apollo.api.ApolloResponse build = com.apollographql.apollo.cache.normalized.NormalizedCache.cacheInfo(apolloResponse.newBuilder(), new com.apollographql.apollo.cache.normalized.CacheInfo.Builder().networkStartMillis(this.Camera2StreamConfigurationMap).networkEndMillis(com.apollographql.apollo.mpp.UtilsKt.currentTimeMillis()).networkException(apolloResponse.exception).build()).build();
                                anonymousClass1.getHighSpeedVideoFpsRanges = 1;
                                if (flowCollector.emit(build, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$readFromNetwork$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$readFromNetwork$$inlined$map$1$2", f = "ApolloCacheInterceptor.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$readFromNetwork$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
                    int getHighSpeedVideoFpsRanges;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.Camera2StreamConfigurationMap = obj;
                        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
                        return com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$readFromNetwork$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, long j) {
                    this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                    this.Camera2StreamConfigurationMap = j;
                }
            }
        };
    }
}
