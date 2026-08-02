package com.apollographql.apollo.cache.normalized.internal;

/* JADX INFO: Add missing generic type declarations: [D] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$interceptMutation$1", f = "ApolloCacheInterceptor.kt", i = {0, 0, 1, 1, 1, 2}, l = {144, 165, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE, 187}, m = "invokeSuspend", n = {"$this$flow", "optimisticData", "optimisticData", "networkException", "optimisticKeys", "optimisticKeys"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes3.dex */
final class ApolloCacheInterceptor$interceptMutation$1<D> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.apollographql.apollo.api.ApolloResponse<D>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.apollographql.apollo.api.ApolloRequest<D> Camera2StreamConfigurationMap;
    final /* synthetic */ com.apollographql.apollo.api.CustomScalarAdapters getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.apollographql.apollo.interceptor.ApolloInterceptorChain getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    final /* synthetic */ com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor getOutputMinFrameDuration;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        com.apollographql.apollo.api.Mutation.Data data;
        kotlinx.coroutines.flow.FlowCollector flowCollector2;
        com.apollographql.apollo.api.Mutation.Data data2;
        kotlinx.coroutines.flow.Flow onEach;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        com.apollographql.apollo.api.Mutation.Data data3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef4;
        java.lang.Object rollbackOptimisticUpdates;
        com.apollographql.apollo.cache.normalized.ApolloStore store;
        T t;
        T t2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) this.getInputSizeshNQ4ISI;
            com.apollographql.apollo.api.Mutation.Data optimisticData = com.apollographql.apollo.cache.normalized.NormalizedCache.getOptimisticData(this.Camera2StreamConfigurationMap);
            if (optimisticData != null) {
                this.getInputSizeshNQ4ISI = flowCollector3;
                this.getHighSpeedVideoFpsRanges = optimisticData;
                this.getOutputFormats = 1;
                if (this.getOutputMinFrameDuration.getStore().writeOptimisticUpdates(this.Camera2StreamConfigurationMap.getOperation(), optimisticData, this.Camera2StreamConfigurationMap.getRequestUuid(), this.getHighResolutionOutputSizeshNQ4ISI, true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                flowCollector2 = flowCollector3;
                data2 = optimisticData;
            } else {
                flowCollector = flowCollector3;
                data = optimisticData;
                kotlin.jvm.internal.Ref.ObjectRef objectRef5 = new kotlin.jvm.internal.Ref.ObjectRef();
                onEach = kotlinx.coroutines.flow.FlowKt.onEach(this.getHighSpeedVideoFpsRangesFor.proceed(this.Camera2StreamConfigurationMap), new com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$interceptMutation$1$networkResponses$1(objectRef5, null));
                objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                data3 = data;
                this.getInputSizeshNQ4ISI = data;
                this.getHighSpeedVideoFpsRanges = objectRef5;
                this.getHighSpeedVideoSizes = objectRef;
                this.getOutputFormats = 2;
                if (onEach.collect(new com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$interceptMutation$1.AnonymousClass1(data3, new kotlin.jvm.internal.Ref.ObjectRef(), objectRef, this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, flowCollector), this) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef2 = objectRef5;
                objectRef3 = objectRef;
                if (objectRef2.element != 0) {
                }
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighSpeedVideoFpsRanges;
                    objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) this.getInputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    rollbackOptimisticUpdates = obj;
                    t2 = (java.util.Set) rollbackOptimisticUpdates;
                    objectRef3.element = t2;
                    objectRef3 = objectRef4;
                    store = this.getOutputMinFrameDuration.getStore();
                    t = objectRef3.element;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(t);
                    this.getInputSizeshNQ4ISI = null;
                    this.getHighSpeedVideoFpsRanges = null;
                    this.getHighSpeedVideoSizes = null;
                    this.getOutputFormats = 4;
                    if (store.publish((java.util.Set) t, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighSpeedVideoSizes;
                objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighSpeedVideoFpsRanges;
                data = (com.apollographql.apollo.api.Mutation.Data) this.getInputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                if (objectRef2.element != 0) {
                    if (objectRef3.element == 0) {
                        if (data != null) {
                            this.getInputSizeshNQ4ISI = objectRef3;
                            this.getHighSpeedVideoFpsRanges = objectRef3;
                            this.getHighSpeedVideoSizes = null;
                            this.getOutputFormats = 3;
                            rollbackOptimisticUpdates = this.getOutputMinFrameDuration.getStore().rollbackOptimisticUpdates(this.Camera2StreamConfigurationMap.getRequestUuid(), false, this);
                            if (rollbackOptimisticUpdates == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            objectRef4 = objectRef3;
                            t2 = (java.util.Set) rollbackOptimisticUpdates;
                            objectRef3.element = t2;
                            objectRef3 = objectRef4;
                        } else {
                            objectRef4 = objectRef3;
                            t2 = kotlin.collections.SetsKt.emptySet();
                            objectRef3.element = t2;
                            objectRef3 = objectRef4;
                        }
                    }
                    store = this.getOutputMinFrameDuration.getStore();
                    t = objectRef3.element;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(t);
                    this.getInputSizeshNQ4ISI = null;
                    this.getHighSpeedVideoFpsRanges = null;
                    this.getHighSpeedVideoSizes = null;
                    this.getOutputFormats = 4;
                    if (store.publish((java.util.Set) t, this) == coroutine_suspended) {
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
            data2 = (com.apollographql.apollo.api.Mutation.Data) this.getHighSpeedVideoFpsRanges;
            flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getInputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        flowCollector = flowCollector2;
        data = data2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef52 = new kotlin.jvm.internal.Ref.ObjectRef();
        onEach = kotlinx.coroutines.flow.FlowKt.onEach(this.getHighSpeedVideoFpsRangesFor.proceed(this.Camera2StreamConfigurationMap), new com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$interceptMutation$1$networkResponses$1(objectRef52, null));
        objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        data3 = data;
        this.getInputSizeshNQ4ISI = data;
        this.getHighSpeedVideoFpsRanges = objectRef52;
        this.getHighSpeedVideoSizes = objectRef;
        this.getOutputFormats = 2;
        if (onEach.collect(new com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$interceptMutation$1.AnonymousClass1(data3, new kotlin.jvm.internal.Ref.ObjectRef(), objectRef, this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, flowCollector), this) != coroutine_suspended) {
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$interceptMutation$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.apollographql.apollo.api.Mutation.Data Camera2StreamConfigurationMap;
        final /* synthetic */ com.apollographql.apollo.api.CustomScalarAdapters getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<com.apollographql.apollo.api.ApolloResponse<D>> getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<com.apollographql.apollo.api.ApolloResponse<D>> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.util.Set<java.lang.String>> getHighSpeedVideoSizes;
        final /* synthetic */ com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor getOutputFormats;
        final /* synthetic */ com.apollographql.apollo.api.ApolloRequest<D> getOutputMinFrameDuration;

        /* JADX WARN: Code restructure failed: missing block: B:19:0x00c7, code lost:
        
            if (r13.emit(r12, r0) == r7) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00bb, code lost:
        
            if (r13 != r7) goto L37;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(com.apollographql.apollo.api.ApolloResponse<D> apolloResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$interceptMutation$1$1$emit$1 apolloCacheInterceptor$interceptMutation$1$1$emit$1;
            int i;
            kotlin.jvm.internal.Ref.ObjectRef<java.util.Set<java.lang.String>> objectRef;
            T t;
            com.apollographql.apollo.api.ApolloResponse apolloResponse2;
            kotlin.jvm.internal.Ref.ObjectRef<java.util.Set<java.lang.String>> objectRef2;
            com.apollographql.apollo.api.ApolloResponse apolloResponse3;
            java.lang.Object highSpeedVideoFpsRanges;
            com.apollographql.apollo.api.ApolloResponse apolloResponse4;
            com.apollographql.apollo.api.ApolloResponse apolloResponse5;
            if (continuation instanceof com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$interceptMutation$1$1$emit$1) {
                apolloCacheInterceptor$interceptMutation$1$1$emit$1 = (com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$interceptMutation$1$1$emit$1) continuation;
                if ((apolloCacheInterceptor$interceptMutation$1$1$emit$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    apolloCacheInterceptor$interceptMutation$1$1$emit$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj = apolloCacheInterceptor$interceptMutation$1$1$emit$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = apolloCacheInterceptor$interceptMutation$1$1$emit$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (this.Camera2StreamConfigurationMap != null && this.getHighSpeedVideoFpsRangesFor.element != null) {
                            throw new com.apollographql.apollo.exception.DefaultApolloException("Apollo: optimistic updates can only be applied with one network response", null, 2, null);
                        }
                        this.getHighSpeedVideoFpsRangesFor.element = apolloResponse;
                        apolloResponse3 = apolloResponse;
                        if (this.getHighSpeedVideoSizes.element == null) {
                            objectRef = this.getHighSpeedVideoSizes;
                            if (this.Camera2StreamConfigurationMap != null) {
                                com.apollographql.apollo.cache.normalized.ApolloStore store = this.getOutputFormats.getStore();
                                java.util.UUID requestUuid = this.getOutputMinFrameDuration.getRequestUuid();
                                apolloCacheInterceptor$interceptMutation$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = apolloResponse;
                                apolloCacheInterceptor$interceptMutation$1$1$emit$1.Camera2StreamConfigurationMap = objectRef;
                                apolloCacheInterceptor$interceptMutation$1$1$emit$1.getHighSpeedVideoSizes = 1;
                                java.lang.Object rollbackOptimisticUpdates = store.rollbackOptimisticUpdates(requestUuid, false, apolloCacheInterceptor$interceptMutation$1$1$emit$1);
                                if (rollbackOptimisticUpdates != coroutine_suspended) {
                                    apolloResponse2 = apolloResponse;
                                    objectRef2 = objectRef;
                                    obj = rollbackOptimisticUpdates;
                                }
                                return coroutine_suspended;
                            }
                            t = (T) kotlin.collections.SetsKt.emptySet();
                            apolloResponse4 = apolloResponse;
                            objectRef.element = t;
                            apolloResponse3 = apolloResponse4;
                        }
                        com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor apolloCacheInterceptor = this.getOutputFormats;
                        com.apollographql.apollo.api.ApolloRequest<D> apolloRequest = this.getOutputMinFrameDuration;
                        com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters = this.getHighResolutionOutputSizeshNQ4ISI;
                        java.util.Set<java.lang.String> set = this.getHighSpeedVideoSizes.element;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(set);
                        apolloCacheInterceptor$interceptMutation$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = apolloResponse3;
                        apolloCacheInterceptor$interceptMutation$1$1$emit$1.Camera2StreamConfigurationMap = null;
                        apolloCacheInterceptor$interceptMutation$1$1$emit$1.getHighSpeedVideoSizes = 2;
                        highSpeedVideoFpsRanges = apolloCacheInterceptor.getHighSpeedVideoFpsRanges(apolloRequest, apolloResponse3, customScalarAdapters, set, apolloCacheInterceptor$interceptMutation$1$1$emit$1);
                        apolloResponse5 = apolloResponse3;
                    } else if (i == 1) {
                        objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) apolloCacheInterceptor$interceptMutation$1$1$emit$1.Camera2StreamConfigurationMap;
                        apolloResponse2 = (com.apollographql.apollo.api.ApolloResponse) apolloCacheInterceptor$interceptMutation$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        com.apollographql.apollo.api.ApolloResponse apolloResponse6 = (com.apollographql.apollo.api.ApolloResponse) apolloCacheInterceptor$interceptMutation$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        apolloResponse5 = apolloResponse6;
                        kotlinx.coroutines.flow.FlowCollector<com.apollographql.apollo.api.ApolloResponse<D>> flowCollector = this.getHighSpeedVideoFpsRanges;
                        apolloCacheInterceptor$interceptMutation$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = null;
                        apolloCacheInterceptor$interceptMutation$1$1$emit$1.getHighSpeedVideoSizes = 3;
                    }
                    java.util.Set set2 = (java.util.Set) obj;
                    objectRef = objectRef2;
                    com.apollographql.apollo.api.ApolloResponse apolloResponse7 = (com.apollographql.apollo.api.ApolloResponse<D>) apolloResponse2;
                    t = (T) set2;
                    apolloResponse4 = apolloResponse7;
                    objectRef.element = t;
                    apolloResponse3 = apolloResponse4;
                    com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor apolloCacheInterceptor2 = this.getOutputFormats;
                    com.apollographql.apollo.api.ApolloRequest<D> apolloRequest2 = this.getOutputMinFrameDuration;
                    com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    java.util.Set<java.lang.String> set3 = this.getHighSpeedVideoSizes.element;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(set3);
                    apolloCacheInterceptor$interceptMutation$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = apolloResponse3;
                    apolloCacheInterceptor$interceptMutation$1$1$emit$1.Camera2StreamConfigurationMap = null;
                    apolloCacheInterceptor$interceptMutation$1$1$emit$1.getHighSpeedVideoSizes = 2;
                    highSpeedVideoFpsRanges = apolloCacheInterceptor2.getHighSpeedVideoFpsRanges(apolloRequest2, apolloResponse3, customScalarAdapters2, set3, apolloCacheInterceptor$interceptMutation$1$1$emit$1);
                    apolloResponse5 = apolloResponse3;
                }
            }
            apolloCacheInterceptor$interceptMutation$1$1$emit$1 = new com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$interceptMutation$1$1$emit$1(this, continuation);
            java.lang.Object obj2 = apolloCacheInterceptor$interceptMutation$1$1$emit$1.getHighSpeedVideoFpsRangesFor;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = apolloCacheInterceptor$interceptMutation$1$1$emit$1.getHighSpeedVideoSizes;
            if (i != 0) {
            }
            java.util.Set set22 = (java.util.Set) obj2;
            objectRef = objectRef2;
            com.apollographql.apollo.api.ApolloResponse apolloResponse72 = (com.apollographql.apollo.api.ApolloResponse<D>) apolloResponse2;
            t = (T) set22;
            apolloResponse4 = apolloResponse72;
            objectRef.element = t;
            apolloResponse3 = apolloResponse4;
            com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor apolloCacheInterceptor22 = this.getOutputFormats;
            com.apollographql.apollo.api.ApolloRequest<D> apolloRequest22 = this.getOutputMinFrameDuration;
            com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters22 = this.getHighResolutionOutputSizeshNQ4ISI;
            java.util.Set<java.lang.String> set32 = this.getHighSpeedVideoSizes.element;
            kotlin.jvm.internal.Intrinsics.checkNotNull(set32);
            apolloCacheInterceptor$interceptMutation$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = apolloResponse3;
            apolloCacheInterceptor$interceptMutation$1$1$emit$1.Camera2StreamConfigurationMap = null;
            apolloCacheInterceptor$interceptMutation$1$1$emit$1.getHighSpeedVideoSizes = 2;
            highSpeedVideoFpsRanges = apolloCacheInterceptor22.getHighSpeedVideoFpsRanges(apolloRequest22, apolloResponse3, customScalarAdapters22, set32, apolloCacheInterceptor$interceptMutation$1$1$emit$1);
            apolloResponse5 = apolloResponse3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.apollographql.apollo.api.Mutation.Data data, kotlin.jvm.internal.Ref.ObjectRef<com.apollographql.apollo.api.ApolloResponse<D>> objectRef, kotlin.jvm.internal.Ref.ObjectRef<java.util.Set<java.lang.String>> objectRef2, com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor apolloCacheInterceptor, com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, kotlinx.coroutines.flow.FlowCollector<? super com.apollographql.apollo.api.ApolloResponse<D>> flowCollector) {
            this.Camera2StreamConfigurationMap = data;
            this.getHighSpeedVideoFpsRangesFor = objectRef;
            this.getHighSpeedVideoSizes = objectRef2;
            this.getOutputFormats = apolloCacheInterceptor;
            this.getOutputMinFrameDuration = apolloRequest;
            this.getHighResolutionOutputSizeshNQ4ISI = customScalarAdapters;
            this.getHighSpeedVideoFpsRanges = flowCollector;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$interceptMutation$1) create((kotlinx.coroutines.flow.FlowCollector) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$interceptMutation$1 apolloCacheInterceptor$interceptMutation$1 = new com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$interceptMutation$1(this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
        apolloCacheInterceptor$interceptMutation$1.getInputSizeshNQ4ISI = obj;
        return apolloCacheInterceptor$interceptMutation$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ApolloCacheInterceptor$interceptMutation$1(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor apolloCacheInterceptor, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.apollographql.apollo.interceptor.ApolloInterceptorChain apolloInterceptorChain, kotlin.coroutines.Continuation<? super com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$interceptMutation$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = apolloRequest;
        this.getOutputMinFrameDuration = apolloCacheInterceptor;
        this.getHighResolutionOutputSizeshNQ4ISI = customScalarAdapters;
        this.getHighSpeedVideoFpsRangesFor = apolloInterceptorChain;
    }
}
