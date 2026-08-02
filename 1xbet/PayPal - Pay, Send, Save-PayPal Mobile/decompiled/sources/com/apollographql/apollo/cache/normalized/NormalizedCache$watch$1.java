package com.apollographql.apollo.cache.normalized;

/* JADX INFO: Add missing generic type declarations: [D] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Query$Data;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.cache.normalized.NormalizedCache$watch$1", f = "ClientCacheExtensions.kt", i = {0, 0, 0}, l = {171, 200}, m = "invokeSuspend", n = {"$this$flow", "lastResponse", "response"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes7.dex */
final class NormalizedCache$watch$1<D> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.apollographql.apollo.api.ApolloResponse<D>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.apollographql.apollo.ApolloCall<D> getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0099, code lost:
    
        if (com.apollographql.apollo.cache.normalized.NormalizedCache.watchInternal(r9, r1).collect(new com.apollographql.apollo.cache.normalized.NormalizedCache$watch$1.AnonymousClass2(r3, r4), r8) == r0) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.Camera2StreamConfigurationMap;
            kotlin.jvm.internal.Ref.ObjectRef objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
            objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            this.Camera2StreamConfigurationMap = flowCollector;
            this.getHighSpeedVideoFpsRangesFor = objectRef3;
            this.getHighResolutionOutputSizeshNQ4ISI = objectRef;
            this.getHighSpeedVideoSizes = 1;
            if (this.getHighSpeedVideoFpsRanges.toFlow().collect(new com.apollographql.apollo.cache.normalized.NormalizedCache$watch$1.AnonymousClass1(objectRef, objectRef3, flowCollector), this) != coroutine_suspended) {
                objectRef2 = objectRef3;
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
        objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighResolutionOutputSizeshNQ4ISI;
        objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighSpeedVideoFpsRangesFor;
        flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.Camera2StreamConfigurationMap;
        kotlin.ResultKt.throwOnFailure(obj);
        com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicyInterceptor(this.getHighSpeedVideoFpsRanges.copy(), com.apollographql.apollo.cache.normalized.NormalizedCache.access$getRefetchPolicyInterceptor(this.getHighSpeedVideoFpsRanges));
        com.apollographql.apollo.api.ApolloResponse apolloResponse = (com.apollographql.apollo.api.ApolloResponse) objectRef.element;
        com.apollographql.apollo.api.Query.Data data = apolloResponse != null ? (com.apollographql.apollo.api.Query.Data) apolloResponse.data : null;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoSizes = 2;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.apollographql.apollo.cache.normalized.NormalizedCache$watch$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<com.apollographql.apollo.api.ApolloResponse<D>> getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<com.apollographql.apollo.api.ApolloResponse<D>> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<com.apollographql.apollo.api.ApolloResponse<D>> getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        
            if (r7.emit(r2, r0) != r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
        
            if (r7.emit(r6, r0) == r1) goto L26;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(com.apollographql.apollo.api.ApolloResponse<D> apolloResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.apollographql.apollo.cache.normalized.NormalizedCache$watch$1$1$emit$1 normalizedCache$watch$1$1$emit$1;
            int i;
            T t;
            if (continuation instanceof com.apollographql.apollo.cache.normalized.NormalizedCache$watch$1$1$emit$1) {
                normalizedCache$watch$1$1$emit$1 = (com.apollographql.apollo.cache.normalized.NormalizedCache$watch$1$1$emit$1) continuation;
                if ((normalizedCache$watch$1$1$emit$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    normalizedCache$watch$1$1$emit$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = normalizedCache$watch$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = normalizedCache$watch$1$1$emit$1.getHighSpeedVideoFpsRanges;
                    if (i == 0) {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        T t2 = (T) ((com.apollographql.apollo.api.ApolloResponse) normalizedCache$watch$1$1$emit$1.Camera2StreamConfigurationMap);
                        kotlin.ResultKt.throwOnFailure(obj);
                        t = t2;
                        this.getHighSpeedVideoSizes.element = t;
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getHighSpeedVideoFpsRangesFor.element = apolloResponse;
                    if (apolloResponse.isLast) {
                        t = apolloResponse;
                        if (this.getHighSpeedVideoSizes.element != null) {
                            java.lang.System.out.println((java.lang.Object) "ApolloGraphQL: extra response received after the last one");
                            kotlinx.coroutines.flow.FlowCollector<com.apollographql.apollo.api.ApolloResponse<D>> flowCollector = this.getHighSpeedVideoFpsRanges;
                            T t3 = this.getHighSpeedVideoSizes.element;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(t3);
                            normalizedCache$watch$1$1$emit$1.Camera2StreamConfigurationMap = apolloResponse;
                            normalizedCache$watch$1$1$emit$1.getHighSpeedVideoFpsRanges = 1;
                            t = apolloResponse;
                        }
                        this.getHighSpeedVideoSizes.element = t;
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlinx.coroutines.flow.FlowCollector<com.apollographql.apollo.api.ApolloResponse<D>> flowCollector2 = this.getHighSpeedVideoFpsRanges;
                    normalizedCache$watch$1$1$emit$1.getHighSpeedVideoFpsRanges = 2;
                    return coroutine_suspended;
                }
            }
            normalizedCache$watch$1$1$emit$1 = new com.apollographql.apollo.cache.normalized.NormalizedCache$watch$1$1$emit$1(this, continuation);
            java.lang.Object obj2 = normalizedCache$watch$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = normalizedCache$watch$1$1$emit$1.getHighSpeedVideoFpsRanges;
            if (i == 0) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.internal.Ref.ObjectRef<com.apollographql.apollo.api.ApolloResponse<D>> objectRef, kotlin.jvm.internal.Ref.ObjectRef<com.apollographql.apollo.api.ApolloResponse<D>> objectRef2, kotlinx.coroutines.flow.FlowCollector<? super com.apollographql.apollo.api.ApolloResponse<D>> flowCollector) {
            this.getHighSpeedVideoFpsRangesFor = objectRef;
            this.getHighSpeedVideoSizes = objectRef2;
            this.getHighSpeedVideoFpsRanges = flowCollector;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.apollographql.apollo.cache.normalized.NormalizedCache$watch$1$2, reason: invalid class name */
    static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<com.apollographql.apollo.api.ApolloResponse<D>> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<com.apollographql.apollo.api.ApolloResponse<D>> getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
        
            if (r6.emit(r7, r0) != r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
        
            if (r7.emit(r6, r0) == r1) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(com.apollographql.apollo.api.ApolloResponse<D> apolloResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.apollographql.apollo.cache.normalized.NormalizedCache$watch$1$2$emit$1 normalizedCache$watch$1$2$emit$1;
            int i;
            if (continuation instanceof com.apollographql.apollo.cache.normalized.NormalizedCache$watch$1$2$emit$1) {
                normalizedCache$watch$1$2$emit$1 = (com.apollographql.apollo.cache.normalized.NormalizedCache$watch$1$2$emit$1) continuation;
                if ((normalizedCache$watch$1$2$emit$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    normalizedCache$watch$1$2$emit$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj = normalizedCache$watch$1$2$emit$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = normalizedCache$watch$1$2$emit$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (apolloResponse.exception == com.apollographql.apollo.cache.normalized.internal.WatcherInterceptorKt.getWatcherSentinel()) {
                            if (this.getHighSpeedVideoSizes.element != null) {
                                kotlinx.coroutines.flow.FlowCollector<com.apollographql.apollo.api.ApolloResponse<D>> flowCollector = this.getHighSpeedVideoFpsRangesFor;
                                T t = this.getHighSpeedVideoSizes.element;
                                kotlin.jvm.internal.Intrinsics.checkNotNull(t);
                                normalizedCache$watch$1$2$emit$1.getHighSpeedVideoSizes = 1;
                            }
                        } else {
                            kotlinx.coroutines.flow.FlowCollector<com.apollographql.apollo.api.ApolloResponse<D>> flowCollector2 = this.getHighSpeedVideoFpsRangesFor;
                            normalizedCache$watch$1$2$emit$1.getHighSpeedVideoSizes = 2;
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
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getHighSpeedVideoSizes.element = null;
                    return kotlin.Unit.INSTANCE;
                }
            }
            normalizedCache$watch$1$2$emit$1 = new com.apollographql.apollo.cache.normalized.NormalizedCache$watch$1$2$emit$1(this, continuation);
            java.lang.Object obj2 = normalizedCache$watch$1$2$emit$1.getHighSpeedVideoFpsRanges;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = normalizedCache$watch$1$2$emit$1.getHighSpeedVideoSizes;
            if (i != 0) {
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlin.jvm.internal.Ref.ObjectRef<com.apollographql.apollo.api.ApolloResponse<D>> objectRef, kotlinx.coroutines.flow.FlowCollector<? super com.apollographql.apollo.api.ApolloResponse<D>> flowCollector) {
            this.getHighSpeedVideoSizes = objectRef;
            this.getHighSpeedVideoFpsRangesFor = flowCollector;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.cache.normalized.NormalizedCache$watch$1) create((kotlinx.coroutines.flow.FlowCollector) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.apollographql.apollo.cache.normalized.NormalizedCache$watch$1 normalizedCache$watch$1 = new com.apollographql.apollo.cache.normalized.NormalizedCache$watch$1(this.getHighSpeedVideoFpsRanges, continuation);
        normalizedCache$watch$1.Camera2StreamConfigurationMap = obj;
        return normalizedCache$watch$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NormalizedCache$watch$1(com.apollographql.apollo.ApolloCall<D> apolloCall, kotlin.coroutines.Continuation<? super com.apollographql.apollo.cache.normalized.NormalizedCache$watch$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = apolloCall;
    }
}
