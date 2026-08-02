package com.apollographql.apollo.interceptor;

/* JADX INFO: Add missing generic type declarations: [D] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1", f = "AutoPersistedQueryInterceptor.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class AutoPersistedQueryInterceptor$intercept$1<D> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.apollographql.apollo.api.ApolloResponse<D>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.apollographql.apollo.api.ApolloRequest<D> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.apollographql.apollo.interceptor.ApolloInterceptorChain getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getInputFormats;
            kotlinx.coroutines.flow.Flow proceed = this.getHighSpeedVideoFpsRanges.proceed(this.Camera2StreamConfigurationMap);
            final com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor autoPersistedQueryInterceptor = this.getHighSpeedVideoSizes;
            final com.apollographql.apollo.api.ApolloRequest<D> apolloRequest = this.Camera2StreamConfigurationMap;
            final boolean z = this.getHighSpeedVideoFpsRangesFor;
            final com.apollographql.apollo.interceptor.ApolloInterceptorChain apolloInterceptorChain = this.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (proceed.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.apollographql.apollo.api.ApolloResponse<D> build;
                    com.apollographql.apollo.api.ApolloResponse apolloResponse = (com.apollographql.apollo.api.ApolloResponse) obj2;
                    if (com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor.access$isPersistedQueryNotFound(com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor.this, apolloResponse.errors)) {
                        com.apollographql.apollo.api.ApolloRequest<D> build2 = apolloRequest.newBuilder().httpMethod(z ? com.apollographql.apollo.api.http.HttpMethod.Post : com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor.this.getHighSpeedVideoSizes).sendDocument(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true)).sendApqExtensions(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true)).build();
                        kotlinx.coroutines.flow.FlowCollector<com.apollographql.apollo.api.ApolloResponse<D>> flowCollector2 = flowCollector;
                        final kotlinx.coroutines.flow.Flow proceed2 = apolloInterceptorChain.proceed(build2);
                        final com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor autoPersistedQueryInterceptor2 = com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor.this;
                        java.lang.Object emitAll = kotlinx.coroutines.flow.FlowKt.emitAll(flowCollector2, new kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>>() { // from class: com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1$1$emit$$inlined$map$1

                            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            /* renamed from: com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1$1$emit$$inlined$map$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector Camera2StreamConfigurationMap;
                                final /* synthetic */ com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor getHighSpeedVideoFpsRanges;

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                                    com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1$1$emit$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                                    int i;
                                    com.apollographql.apollo.api.ApolloResponse build;
                                    if (continuation instanceof com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1$1$emit$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                                        anonymousClass1 = (com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1$1$emit$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                                        if ((anonymousClass1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                                            anonymousClass1.Camera2StreamConfigurationMap -= 2147483648;
                                            java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoSizes;
                                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            i = anonymousClass1.Camera2StreamConfigurationMap;
                                            if (i != 0) {
                                                kotlin.ResultKt.throwOnFailure(obj2);
                                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.Camera2StreamConfigurationMap;
                                                com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor autoPersistedQueryInterceptor = this.getHighSpeedVideoFpsRanges;
                                                build = ((com.apollographql.apollo.api.ApolloResponse) obj).newBuilder().addExecutionContext(new com.apollographql.apollo.AutoPersistedQueryInfo(false)).build();
                                                anonymousClass1.Camera2StreamConfigurationMap = 1;
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
                                    anonymousClass1 = new com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1$1$emit$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                                    java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoSizes;
                                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.Camera2StreamConfigurationMap;
                                    if (i != 0) {
                                    }
                                    return kotlin.Unit.INSTANCE;
                                }

                                @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1$1$emit$$inlined$map$1$2", f = "AutoPersistedQueryInterceptor.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                                /* renamed from: com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1$1$emit$$inlined$map$1$2$1, reason: invalid class name */
                                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                                    int Camera2StreamConfigurationMap;
                                    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                        this.getHighSpeedVideoSizes = obj;
                                        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
                                        return com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1$1$emit$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                                    }

                                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                        super(continuation);
                                    }
                                }

                                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor autoPersistedQueryInterceptor) {
                                    this.Camera2StreamConfigurationMap = flowCollector;
                                    this.getHighSpeedVideoFpsRanges = autoPersistedQueryInterceptor;
                                }
                            }

                            @Override // kotlinx.coroutines.flow.Flow
                            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector3, kotlin.coroutines.Continuation continuation2) {
                                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1$1$emit$$inlined$map$1.AnonymousClass2(flowCollector3, autoPersistedQueryInterceptor2), continuation2);
                                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                            }
                        }, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
                        return emitAll == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emitAll : kotlin.Unit.INSTANCE;
                    }
                    if (com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor.access$isPersistedQueryNotSupported(com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor.this, apolloResponse.errors)) {
                        java.lang.Object emit = flowCollector.emit(new com.apollographql.apollo.api.ApolloResponse.Builder(apolloRequest.getOperation(), apolloRequest.getRequestUuid()).exception(new com.apollographql.apollo.exception.AutoPersistedQueriesNotSupported()).build(), continuation);
                        return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
                    }
                    kotlinx.coroutines.flow.FlowCollector<com.apollographql.apollo.api.ApolloResponse<D>> flowCollector3 = flowCollector;
                    com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor autoPersistedQueryInterceptor3 = com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor.this;
                    build = apolloResponse.newBuilder().addExecutionContext(new com.apollographql.apollo.AutoPersistedQueryInfo(true)).build();
                    java.lang.Object emit2 = flowCollector3.emit(build, continuation);
                    return emit2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit2 : kotlin.Unit.INSTANCE;
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
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1) create((kotlinx.coroutines.flow.FlowCollector) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1 autoPersistedQueryInterceptor$intercept$1 = new com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
        autoPersistedQueryInterceptor$intercept$1.getInputFormats = obj;
        return autoPersistedQueryInterceptor$intercept$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoPersistedQueryInterceptor$intercept$1(com.apollographql.apollo.interceptor.ApolloInterceptorChain apolloInterceptorChain, com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor autoPersistedQueryInterceptor, boolean z, kotlin.coroutines.Continuation<? super com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = apolloInterceptorChain;
        this.Camera2StreamConfigurationMap = apolloRequest;
        this.getHighSpeedVideoSizes = autoPersistedQueryInterceptor;
        this.getHighSpeedVideoFpsRangesFor = z;
    }
}
