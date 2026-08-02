package com.apollographql.apollo.cache.normalized.internal;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\r\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/internal/WatcherInterceptor;", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "Lcom/apollographql/apollo/cache/normalized/ApolloStoreInterceptor;", "Lcom/apollographql/apollo/cache/normalized/ApolloStore;", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "<init>", "(Lcom/apollographql/apollo/cache/normalized/ApolloStore;)V", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ApolloRequest;", "request", "Lcom/apollographql/apollo/interceptor/ApolloInterceptorChain;", "chain", "Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/api/ApolloResponse;", "intercept", "(Lcom/apollographql/apollo/api/ApolloRequest;Lcom/apollographql/apollo/interceptor/ApolloInterceptorChain;)Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/cache/normalized/ApolloStore;", "getStore", "()Lcom/apollographql/apollo/cache/normalized/ApolloStore;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WatcherInterceptor implements com.apollographql.apollo.interceptor.ApolloInterceptor, com.apollographql.apollo.cache.normalized.ApolloStoreInterceptor {
    private final com.apollographql.apollo.cache.normalized.ApolloStore store;

    public WatcherInterceptor(com.apollographql.apollo.cache.normalized.ApolloStore apolloStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloStore, "");
        this.store = apolloStore;
    }

    public final com.apollographql.apollo.cache.normalized.ApolloStore getStore() {
        return this.store;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.apollographql.apollo.interceptor.ApolloInterceptor
    public final <D extends com.apollographql.apollo.api.Operation.Data> kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> intercept(final com.apollographql.apollo.api.ApolloRequest<D> request, final com.apollographql.apollo.interceptor.ApolloInterceptorChain chain) {
        kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> flow;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        com.apollographql.apollo.cache.normalized.WatchContext watchContext = com.apollographql.apollo.cache.normalized.NormalizedCache.getWatchContext(request);
        if (watchContext == null) {
            return chain.proceed(request);
        }
        if (!(request.getOperation() instanceof com.apollographql.apollo.api.Query)) {
            throw new java.lang.IllegalStateException("It's impossible to watch a mutation or subscription".toString());
        }
        com.apollographql.apollo.api.ExecutionContext.Element element = request.getExecutionContext().get(com.apollographql.apollo.api.CustomScalarAdapters.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNull(element);
        final com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters = (com.apollographql.apollo.api.CustomScalarAdapters) element;
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        com.apollographql.apollo.api.Query.Data data = watchContext.getData();
        objectRef.element = data != null ? com.apollographql.apollo.cache.normalized.api.OperationCacheExtensionsKt.dependentKeys(this.store.normalize(request.getOperation(), data, customScalarAdapters).values()) : 0;
        kotlinx.coroutines.flow.SharedFlow<java.util.Set<java.lang.String>> changedKeys = this.store.getChangedKeys();
        kotlin.jvm.internal.Intrinsics.checkNotNull(changedKeys, "");
        final kotlinx.coroutines.flow.SharedFlow onSubscription = kotlinx.coroutines.flow.FlowKt.onSubscription(changedKeys, new com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$2(null));
        final kotlinx.coroutines.flow.Flow<java.lang.Object> flow2 = new kotlinx.coroutines.flow.Flow<java.lang.Object>() { // from class: com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$filter$1

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector Camera2StreamConfigurationMap;
                final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef getHighSpeedVideoFpsRangesFor;

                /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
                
                    if (kotlin.collections.CollectionsKt.intersect((java.lang.Iterable) r6, (java.lang.Iterable) r4).isEmpty() == false) goto L22;
                 */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.Camera2StreamConfigurationMap;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.Camera2StreamConfigurationMap;
                                if ((obj instanceof java.util.Set) && obj != com.apollographql.apollo.cache.normalized.ApolloStore.INSTANCE.getALL_KEYS() && this.getHighSpeedVideoFpsRangesFor.element != null) {
                                    T t = this.getHighSpeedVideoFpsRangesFor.element;
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(t);
                                }
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
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
                    anonymousClass1 = new com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$filter$1$2", f = "WatcherInterceptor.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
                    int getHighSpeedVideoFpsRangesFor;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.Camera2StreamConfigurationMap = obj;
                        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
                        return com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.jvm.internal.Ref.ObjectRef objectRef) {
                    this.Camera2StreamConfigurationMap = flowCollector;
                    this.getHighSpeedVideoFpsRangesFor = objectRef;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$filter$1.AnonymousClass2(flowCollector, objectRef), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
        flow = kotlinx.coroutines.flow.FlowKt.flow(new com.apollographql.apollo.cache.normalized.internal.WatcherInterceptorKt$flattenConcatPolyfill$1(new kotlinx.coroutines.flow.Flow<kotlinx.coroutines.flow.Flow<? extends com.apollographql.apollo.api.ApolloResponse<D>>>() { // from class: com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ com.apollographql.apollo.interceptor.ApolloInterceptorChain Camera2StreamConfigurationMap;
                final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ com.apollographql.apollo.api.ApolloRequest getHighSpeedVideoFpsRanges;
                final /* synthetic */ com.apollographql.apollo.api.CustomScalarAdapters getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoSizes;
                final /* synthetic */ com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor getHighSpeedVideoSizesFor;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    kotlinx.coroutines.flow.Flow onEach;
                    if (continuation instanceof com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighSpeedVideoFpsRanges -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoFpsRanges;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoSizes;
                                if (kotlin.jvm.internal.Intrinsics.areEqual(obj, kotlin.Unit.INSTANCE)) {
                                    onEach = kotlinx.coroutines.flow.FlowKt.flowOf(new com.apollographql.apollo.api.ApolloResponse.Builder(this.getHighSpeedVideoFpsRanges.getOperation(), this.getHighSpeedVideoFpsRanges.getRequestUuid()).exception(com.apollographql.apollo.cache.normalized.internal.WatcherInterceptorKt.getWatcherSentinel()).build());
                                } else {
                                    onEach = kotlinx.coroutines.flow.FlowKt.onEach(this.Camera2StreamConfigurationMap.proceed(this.getHighSpeedVideoFpsRanges), new com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$4$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, null));
                                }
                                anonymousClass1.getHighSpeedVideoFpsRanges = 1;
                                if (flowCollector.emit(onEach, anonymousClass1) == coroutine_suspended) {
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
                    anonymousClass1 = new com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$map$1$2", f = "WatcherInterceptor.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    int getHighSpeedVideoFpsRanges;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighResolutionOutputSizeshNQ4ISI = obj;
                        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
                        return com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.apollographql.apollo.api.ApolloRequest apolloRequest, com.apollographql.apollo.interceptor.ApolloInterceptorChain apolloInterceptorChain, kotlin.jvm.internal.Ref.ObjectRef objectRef, com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor watcherInterceptor, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
                    this.getHighSpeedVideoSizes = flowCollector;
                    this.getHighSpeedVideoFpsRanges = apolloRequest;
                    this.Camera2StreamConfigurationMap = apolloInterceptorChain;
                    this.getHighResolutionOutputSizeshNQ4ISI = objectRef;
                    this.getHighSpeedVideoSizesFor = watcherInterceptor;
                    this.getHighSpeedVideoFpsRangesFor = customScalarAdapters;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$map$1.AnonymousClass2(flowCollector, request, chain, objectRef, this, customScalarAdapters), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }, null));
        return flow;
    }
}
