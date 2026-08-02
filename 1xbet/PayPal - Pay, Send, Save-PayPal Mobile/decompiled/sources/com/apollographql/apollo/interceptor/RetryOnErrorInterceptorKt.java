package com.apollographql.apollo.interceptor;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0005\u001aZ\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b2-\u0010\r\u001a)\b\u0001\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\n\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\tH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0006*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/apollographql/apollo/network/NetworkMonitor;", "networkMonitor", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "RetryOnErrorInterceptor", "(Lcom/apollographql/apollo/network/NetworkMonitor;)Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "()Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "transform", "flatMapConcatPolyfill", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "flattenConcatPolyfill", "(Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/exception/ApolloNetworkException;", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/exception/ApolloNetworkException;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RetryOnErrorInterceptorKt {
    private static final com.apollographql.apollo.exception.ApolloNetworkException getHighSpeedVideoSizes = new com.apollographql.apollo.exception.ApolloNetworkException("The device is offline", com.apollographql.apollo.exception.OfflineException.INSTANCE);

    public static final com.apollographql.apollo.interceptor.ApolloInterceptor RetryOnErrorInterceptor(com.apollographql.apollo.network.NetworkMonitor networkMonitor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkMonitor, "");
        return new com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl(networkMonitor);
    }

    public static final com.apollographql.apollo.interceptor.ApolloInterceptor RetryOnErrorInterceptor() {
        return new com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl(null);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> flattenConcatPolyfill(kotlinx.coroutines.flow.Flow<? extends kotlinx.coroutines.flow.Flow<? extends T>> flow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        return kotlinx.coroutines.flow.FlowKt.flow(new com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt$flattenConcatPolyfill$1(flow, null));
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> flatMapConcatPolyfill(final kotlinx.coroutines.flow.Flow<? extends T> flow, final kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, ? extends java.lang.Object> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        return flattenConcatPolyfill(new kotlinx.coroutines.flow.Flow<kotlinx.coroutines.flow.Flow<? extends R>>() { // from class: com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt$flatMapConcatPolyfill$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt$flatMapConcatPolyfill$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlin.jvm.functions.Function2 Camera2StreamConfigurationMap;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRangesFor;

                /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
                
                    if (r7.emit(r8, r0) != r1) goto L22;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt$flatMapConcatPolyfill$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    if (continuation instanceof com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt$flatMapConcatPolyfill$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt$flatMapConcatPolyfill$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighSpeedVideoSizes -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoSizes;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector2 = this.getHighSpeedVideoFpsRangesFor;
                                kotlin.jvm.functions.Function2 function2 = this.Camera2StreamConfigurationMap;
                                anonymousClass1.Camera2StreamConfigurationMap = flowCollector2;
                                anonymousClass1.getHighSpeedVideoSizes = 1;
                                java.lang.Object invoke = function2.invoke(obj, anonymousClass1);
                                if (invoke != coroutine_suspended) {
                                    obj2 = invoke;
                                    flowCollector = flowCollector2;
                                }
                                return coroutine_suspended;
                            }
                            if (i != 1) {
                                if (i != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                                return kotlin.Unit.INSTANCE;
                            }
                            kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.Camera2StreamConfigurationMap;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            flowCollector = flowCollector3;
                            anonymousClass1.Camera2StreamConfigurationMap = null;
                            anonymousClass1.getHighSpeedVideoSizes = 2;
                        }
                    }
                    anonymousClass1 = new com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt$flatMapConcatPolyfill$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoSizes;
                    if (i != 0) {
                    }
                    anonymousClass1.Camera2StreamConfigurationMap = null;
                    anonymousClass1.getHighSpeedVideoSizes = 2;
                }

                @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt$flatMapConcatPolyfill$$inlined$map$1$2", f = "RetryOnErrorInterceptor.kt", i = {}, l = {50, 50}, m = "emit", n = {}, s = {})
                /* renamed from: com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt$flatMapConcatPolyfill$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
                    int getHighSpeedVideoSizes;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoFpsRangesFor = obj;
                        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
                        return com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt$flatMapConcatPolyfill$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.jvm.functions.Function2 function2) {
                    this.getHighSpeedVideoFpsRangesFor = flowCollector;
                    this.Camera2StreamConfigurationMap = function2;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt$flatMapConcatPolyfill$$inlined$map$1.AnonymousClass2(flowCollector, function2), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        });
    }

    public static final /* synthetic */ boolean access$isRecoverable(com.apollographql.apollo.exception.ApolloException apolloException) {
        return apolloException instanceof com.apollographql.apollo.exception.ApolloNetworkException;
    }
}
