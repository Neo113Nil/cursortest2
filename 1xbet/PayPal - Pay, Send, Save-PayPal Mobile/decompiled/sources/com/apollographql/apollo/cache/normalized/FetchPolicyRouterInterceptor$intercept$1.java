package com.apollographql.apollo.cache.normalized;

/* JADX INFO: Add missing generic type declarations: [D] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.cache.normalized.FetchPolicyRouterInterceptor$intercept$1", f = "FetchPolicyInterceptors.kt", i = {0, 0, 0}, l = {148, 181}, m = "invokeSuspend", n = {"$this$flow", "exceptions", "hasEmitted"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
final class FetchPolicyRouterInterceptor$intercept$1<D> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.apollographql.apollo.api.ApolloResponse<D>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.apollographql.apollo.interceptor.ApolloInterceptorChain getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.apollographql.apollo.api.ApolloRequest<D> getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f6, code lost:
    
        if (r5.emit(new com.apollographql.apollo.api.ApolloResponse.Builder(r8.getHighSpeedVideoSizes.getOperation(), r8.getHighSpeedVideoSizes.getRequestUuid()).exception(r9).build(), r8) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fc, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        if (com.apollographql.apollo.cache.normalized.NormalizedCache.getFetchPolicyInterceptor(r8.getHighSpeedVideoSizes).intercept(r8.getHighSpeedVideoSizes, r8.getHighSpeedVideoFpsRangesFor).collect(new com.apollographql.apollo.cache.normalized.FetchPolicyRouterInterceptor$intercept$1.AnonymousClass1(r1, r4, r5), r8) != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        com.apollographql.apollo.exception.DefaultApolloException defaultApolloException;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getInputSizeshNQ4ISI;
            arrayList = new java.util.ArrayList();
            booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
            this.getInputSizeshNQ4ISI = flowCollector;
            this.getHighResolutionOutputSizeshNQ4ISI = arrayList;
            this.getHighSpeedVideoFpsRanges = booleanRef;
            this.Camera2StreamConfigurationMap = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) this.getHighSpeedVideoFpsRanges;
            arrayList = (java.util.List) this.getHighResolutionOutputSizeshNQ4ISI;
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getInputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (!booleanRef.element) {
            int size = arrayList.size();
            if (size == 0) {
                defaultApolloException = new com.apollographql.apollo.exception.DefaultApolloException("No response emitted", null, 2, null);
            } else if (size == 1) {
                defaultApolloException = (com.apollographql.apollo.exception.ApolloException) kotlin.collections.CollectionsKt.first(arrayList);
            } else if (size == 2) {
                defaultApolloException = new com.apollographql.apollo.exception.ApolloCompositeException((java.lang.Throwable) kotlin.collections.CollectionsKt.first(arrayList), (java.lang.Throwable) arrayList.get(1));
            } else {
                com.apollographql.apollo.exception.ApolloCompositeException apolloCompositeException = new com.apollographql.apollo.exception.ApolloCompositeException((java.lang.Throwable) kotlin.collections.CollectionsKt.first(arrayList), (java.lang.Throwable) arrayList.get(1));
                java.util.Iterator it = kotlin.collections.CollectionsKt.drop(arrayList, 2).iterator();
                while (it.hasNext()) {
                    kotlin.ExceptionsKt.addSuppressed(apolloCompositeException, (com.apollographql.apollo.exception.ApolloException) it.next());
                }
                defaultApolloException = apolloCompositeException;
            }
            this.getInputSizeshNQ4ISI = null;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoFpsRanges = null;
            this.Camera2StreamConfigurationMap = 2;
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.apollographql.apollo.cache.normalized.FetchPolicyRouterInterceptor$intercept$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<com.apollographql.apollo.api.ApolloResponse<D>> Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.util.List<com.apollographql.apollo.exception.ApolloException> getHighSpeedVideoSizes;

        /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(com.apollographql.apollo.api.ApolloResponse<D> apolloResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.apollographql.apollo.cache.normalized.FetchPolicyRouterInterceptor$intercept$1$1$emit$1 fetchPolicyRouterInterceptor$intercept$1$1$emit$1;
            int i;
            T t;
            if (continuation instanceof com.apollographql.apollo.cache.normalized.FetchPolicyRouterInterceptor$intercept$1$1$emit$1) {
                fetchPolicyRouterInterceptor$intercept$1$1$emit$1 = (com.apollographql.apollo.cache.normalized.FetchPolicyRouterInterceptor$intercept$1$1$emit$1) continuation;
                if ((fetchPolicyRouterInterceptor$intercept$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    fetchPolicyRouterInterceptor$intercept$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = fetchPolicyRouterInterceptor$intercept$1$1$emit$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = fetchPolicyRouterInterceptor$intercept$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (!this.getHighResolutionOutputSizeshNQ4ISI.element && apolloResponse.exception != null) {
                            java.util.List<com.apollographql.apollo.exception.ApolloException> list = this.getHighSpeedVideoSizes;
                            com.apollographql.apollo.exception.ApolloException apolloException = apolloResponse.exception;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(apolloException);
                            list.add(apolloException);
                            return kotlin.Unit.INSTANCE;
                        }
                        kotlinx.coroutines.flow.FlowCollector<com.apollographql.apollo.api.ApolloResponse<D>> flowCollector = this.Camera2StreamConfigurationMap;
                        com.apollographql.apollo.api.ApolloResponse.Builder<D> newBuilder = apolloResponse.newBuilder();
                        com.apollographql.apollo.cache.normalized.CacheInfo cacheInfo = com.apollographql.apollo.cache.normalized.NormalizedCache.getCacheInfo(apolloResponse);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(cacheInfo);
                        com.apollographql.apollo.cache.normalized.CacheInfo.Builder newBuilder2 = cacheInfo.newBuilder();
                        java.util.List<com.apollographql.apollo.exception.ApolloException> list2 = this.getHighSpeedVideoSizes;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (T t2 : list2) {
                            if (t2 instanceof com.apollographql.apollo.exception.CacheMissException) {
                                arrayList.add(t2);
                            }
                        }
                        com.apollographql.apollo.cache.normalized.CacheInfo.Builder cacheMissException = newBuilder2.cacheMissException((com.apollographql.apollo.exception.CacheMissException) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList));
                        java.util.Iterator<T> it = this.getHighSpeedVideoSizes.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t = (T) null;
                                break;
                            }
                            t = it.next();
                            if (!(((com.apollographql.apollo.exception.ApolloException) t) instanceof com.apollographql.apollo.exception.CacheMissException)) {
                                break;
                            }
                        }
                        com.apollographql.apollo.api.ApolloResponse<D> build = com.apollographql.apollo.cache.normalized.NormalizedCache.cacheInfo(newBuilder, cacheMissException.networkException(t).build()).build();
                        fetchPolicyRouterInterceptor$intercept$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        if (flowCollector.emit(build, fetchPolicyRouterInterceptor$intercept$1$1$emit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.element = true;
                    return kotlin.Unit.INSTANCE;
                }
            }
            fetchPolicyRouterInterceptor$intercept$1$1$emit$1 = new com.apollographql.apollo.cache.normalized.FetchPolicyRouterInterceptor$intercept$1$1$emit$1(this, continuation);
            java.lang.Object obj2 = fetchPolicyRouterInterceptor$intercept$1$1$emit$1.Camera2StreamConfigurationMap;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = fetchPolicyRouterInterceptor$intercept$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
            if (i != 0) {
            }
            this.getHighResolutionOutputSizeshNQ4ISI.element = true;
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.internal.Ref.BooleanRef booleanRef, java.util.List<com.apollographql.apollo.exception.ApolloException> list, kotlinx.coroutines.flow.FlowCollector<? super com.apollographql.apollo.api.ApolloResponse<D>> flowCollector) {
            this.getHighResolutionOutputSizeshNQ4ISI = booleanRef;
            this.getHighSpeedVideoSizes = list;
            this.Camera2StreamConfigurationMap = flowCollector;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.cache.normalized.FetchPolicyRouterInterceptor$intercept$1) create((kotlinx.coroutines.flow.FlowCollector) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.apollographql.apollo.cache.normalized.FetchPolicyRouterInterceptor$intercept$1 fetchPolicyRouterInterceptor$intercept$1 = new com.apollographql.apollo.cache.normalized.FetchPolicyRouterInterceptor$intercept$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
        fetchPolicyRouterInterceptor$intercept$1.getInputSizeshNQ4ISI = obj;
        return fetchPolicyRouterInterceptor$intercept$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FetchPolicyRouterInterceptor$intercept$1(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, com.apollographql.apollo.interceptor.ApolloInterceptorChain apolloInterceptorChain, kotlin.coroutines.Continuation<? super com.apollographql.apollo.cache.normalized.FetchPolicyRouterInterceptor$intercept$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = apolloRequest;
        this.getHighSpeedVideoFpsRangesFor = apolloInterceptorChain;
    }
}
