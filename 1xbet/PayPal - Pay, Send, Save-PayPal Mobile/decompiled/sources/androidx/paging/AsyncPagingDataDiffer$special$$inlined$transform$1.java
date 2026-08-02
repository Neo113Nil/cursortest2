package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¨\u0006\u0004"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1", f = "AsyncPagingDataDiffer.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
public final class AsyncPagingDataDiffer$special$$inlined$transform$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super androidx.paging.CombinedLoadStates>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.paging.AsyncPagingDataDiffer getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<androidx.paging.CombinedLoadStates> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.paging.AsyncPagingDataDiffer getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
        
            if (r9.emit(r8, r0) != r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0095, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.firstOrNull(r9, r5, r0) == r1) goto L28;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1.AnonymousClass1.C00441 c00441;
            int i;
            kotlinx.coroutines.flow.FlowCollector<androidx.paging.CombinedLoadStates> flowCollector;
            androidx.paging.CombinedLoadStates combinedLoadStates;
            androidx.paging.CombinedLoadStates combinedLoadStates2;
            kotlinx.coroutines.flow.FlowCollector<androidx.paging.CombinedLoadStates> flowCollector2;
            if (continuation instanceof androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1.AnonymousClass1.C00441) {
                c00441 = (androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1.AnonymousClass1.C00441) continuation;
                if ((c00441.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    c00441.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = c00441.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c00441.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
                        combinedLoadStates = (androidx.paging.CombinedLoadStates) t;
                        if (this.getHighSpeedVideoFpsRangesFor.getInGetItem$paging_runtime().getValue().booleanValue()) {
                            c00441.getHighResolutionOutputSizeshNQ4ISI = combinedLoadStates;
                            c00441.getHighSpeedVideoFpsRangesFor = flowCollector;
                            c00441.Camera2StreamConfigurationMap = 1;
                            if (kotlinx.coroutines.YieldKt.yield(c00441) != coroutine_suspended) {
                                combinedLoadStates2 = combinedLoadStates;
                                flowCollector2 = flowCollector;
                            }
                            return coroutine_suspended;
                        }
                        c00441.getHighResolutionOutputSizeshNQ4ISI = null;
                        c00441.getHighSpeedVideoFpsRangesFor = null;
                        c00441.Camera2StreamConfigurationMap = 3;
                    } else if (i == 1) {
                        flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) c00441.getHighSpeedVideoFpsRangesFor;
                        combinedLoadStates2 = (androidx.paging.CombinedLoadStates) c00441.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) c00441.getHighSpeedVideoFpsRangesFor;
                        combinedLoadStates2 = (androidx.paging.CombinedLoadStates) c00441.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        flowCollector = flowCollector2;
                        combinedLoadStates = combinedLoadStates2;
                        c00441.getHighResolutionOutputSizeshNQ4ISI = null;
                        c00441.getHighSpeedVideoFpsRangesFor = null;
                        c00441.Camera2StreamConfigurationMap = 3;
                    }
                    kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> inGetItem$paging_runtime = this.getHighSpeedVideoFpsRangesFor.getInGetItem$paging_runtime();
                    androidx.paging.AsyncPagingDataDiffer$loadStateFlow$1$1 asyncPagingDataDiffer$loadStateFlow$1$1 = new androidx.paging.AsyncPagingDataDiffer$loadStateFlow$1$1(null);
                    c00441.getHighResolutionOutputSizeshNQ4ISI = combinedLoadStates2;
                    c00441.getHighSpeedVideoFpsRangesFor = flowCollector2;
                    c00441.Camera2StreamConfigurationMap = 2;
                }
            }
            c00441 = new androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1.AnonymousClass1.C00441(continuation);
            java.lang.Object obj2 = c00441.getHighSpeedVideoFpsRanges;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c00441.Camera2StreamConfigurationMap;
            if (i != 0) {
            }
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> inGetItem$paging_runtime2 = this.getHighSpeedVideoFpsRangesFor.getInGetItem$paging_runtime();
            androidx.paging.AsyncPagingDataDiffer$loadStateFlow$1$1 asyncPagingDataDiffer$loadStateFlow$1$12 = new androidx.paging.AsyncPagingDataDiffer$loadStateFlow$1$1(null);
            c00441.getHighResolutionOutputSizeshNQ4ISI = combinedLoadStates2;
            c00441.getHighSpeedVideoFpsRangesFor = flowCollector2;
            c00441.Camera2StreamConfigurationMap = 2;
        }

        @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1", f = "AsyncPagingDataDiffer.kt", i = {0, 0, 1, 1}, l = {40, 41, 43}, m = "emit", n = {"it", "$this$loadStateFlow_u24lambda_u240", "it", "$this$loadStateFlow_u24lambda_u240"}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 1)
        /* renamed from: androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00441 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
            int Camera2StreamConfigurationMap;
            java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
            /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
            java.lang.Object getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                this.getHighSpeedVideoFpsRanges = obj;
                this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
                return androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1.AnonymousClass1.this.emit(null, this);
            }

            public C00441(kotlin.coroutines.Continuation continuation) {
                super(continuation);
            }
        }

        public AnonymousClass1(kotlinx.coroutines.flow.FlowCollector flowCollector, androidx.paging.AsyncPagingDataDiffer asyncPagingDataDiffer) {
            this.getHighSpeedVideoFpsRangesFor = asyncPagingDataDiffer;
            this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (this.Camera2StreamConfigurationMap.collect(new androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1.AnonymousClass1(flowCollector, this.getHighSpeedVideoFpsRanges), this) == coroutine_suspended) {
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
    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super androidx.paging.CombinedLoadStates> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1 asyncPagingDataDiffer$special$$inlined$transform$1 = new androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1(this.Camera2StreamConfigurationMap, continuation, this.getHighSpeedVideoFpsRanges);
        asyncPagingDataDiffer$special$$inlined$transform$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return asyncPagingDataDiffer$special$$inlined$transform$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncPagingDataDiffer$special$$inlined$transform$1(kotlinx.coroutines.flow.Flow flow, kotlin.coroutines.Continuation continuation, androidx.paging.AsyncPagingDataDiffer asyncPagingDataDiffer) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = flow;
        this.getHighSpeedVideoFpsRanges = asyncPagingDataDiffer;
    }
}
