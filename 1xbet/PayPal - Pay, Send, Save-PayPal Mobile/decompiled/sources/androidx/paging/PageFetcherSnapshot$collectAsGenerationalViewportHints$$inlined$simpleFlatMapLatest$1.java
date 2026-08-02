package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "androidx/paging/FlowExtKt$simpleFlatMapLatest$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1", f = "PageFetcherSnapshot.kt", i = {0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, 86}, m = "invokeSuspend", n = {"this_$iv", "$this$withLock_u24default$iv$iv", "generationId"}, s = {"L$1", "L$2", "I$0"}, v = 1)
/* loaded from: classes7.dex */
public final class PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super androidx.paging.GenerationalViewportHint>, java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.paging.LoadType getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ androidx.paging.PageFetcherSnapshot getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ce, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r7, r11, r10) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d9, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        if (r5.lock(null, r10) != r0) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        final int intValue;
        androidx.paging.PageFetcherSnapshotState.Holder holder;
        kotlinx.coroutines.sync.Mutex mutex;
        androidx.paging.HintHandler hintHandler;
        kotlinx.coroutines.flow.Flow<androidx.paging.GenerationalViewportHint> flow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getInputFormats;
                intValue = ((java.lang.Number) this.getHighResolutionOutputSizeshNQ4ISI).intValue();
                holder = this.getOutputMinFrameDuration.getInputFormats;
                mutex = holder.getHighSpeedVideoFpsRangesFor;
                this.getInputFormats = flowCollector;
                this.getHighResolutionOutputSizeshNQ4ISI = holder;
                this.Camera2StreamConfigurationMap = mutex;
                this.getHighSpeedVideoFpsRanges = intValue;
                this.getHighSpeedVideoSizes = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                intValue = this.getHighSpeedVideoFpsRanges;
                mutex = (kotlinx.coroutines.sync.Mutex) this.Camera2StreamConfigurationMap;
                holder = (androidx.paging.PageFetcherSnapshotState.Holder) this.getHighResolutionOutputSizeshNQ4ISI;
                flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getInputFormats;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            androidx.paging.PageFetcherSnapshotState pageFetcherSnapshotState = holder.getHighSpeedVideoFpsRanges;
            if (kotlin.jvm.internal.Intrinsics.areEqual(pageFetcherSnapshotState.getSourceLoadStates().get(this.getHighSpeedVideoFpsRangesFor), androidx.paging.LoadState.NotLoading.INSTANCE.getComplete$paging_common())) {
                flow = kotlinx.coroutines.flow.FlowKt.flowOf((java.lang.Object[]) new androidx.paging.GenerationalViewportHint[0]);
            } else {
                if (!(pageFetcherSnapshotState.getSourceLoadStates().get(this.getHighSpeedVideoFpsRangesFor) instanceof androidx.paging.LoadState.Error)) {
                    pageFetcherSnapshotState.getSourceLoadStates().set(this.getHighSpeedVideoFpsRangesFor, androidx.paging.LoadState.NotLoading.INSTANCE.getIncomplete$paging_common());
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                mutex.unlock(null);
                hintHandler = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges;
                final kotlinx.coroutines.flow.Flow drop = kotlinx.coroutines.flow.FlowKt.drop(hintHandler.hintFor(this.getHighSpeedVideoFpsRangesFor), intValue == 0 ? 0 : 1);
                flow = new kotlinx.coroutines.flow.Flow<androidx.paging.GenerationalViewportHint>() { // from class: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super androidx.paging.GenerationalViewportHint> flowCollector2, kotlin.coroutines.Continuation continuation) {
                        java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1.AnonymousClass2(flowCollector2, intValue), continuation);
                        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                    }

                    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                        final /* synthetic */ int Camera2StreamConfigurationMap;
                        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRangesFor;

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                            androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                            int i;
                            if (continuation instanceof androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                                anonymousClass1 = (androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                                if ((anonymousClass1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.getHighSpeedVideoFpsRanges -= 2147483648;
                                    java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.getHighSpeedVideoFpsRanges;
                                    if (i != 0) {
                                        kotlin.ResultKt.throwOnFailure(obj2);
                                        kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRangesFor;
                                        androidx.paging.GenerationalViewportHint generationalViewportHint = new androidx.paging.GenerationalViewportHint(this.Camera2StreamConfigurationMap, (androidx.paging.ViewportHint) obj);
                                        anonymousClass1.getHighSpeedVideoFpsRanges = 1;
                                        if (flowCollector.emit(generationalViewportHint, anonymousClass1) == coroutine_suspended) {
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
                            anonymousClass1 = new androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                            java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoFpsRanges;
                            if (i != 0) {
                            }
                            return kotlin.Unit.INSTANCE;
                        }

                        @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1$2", f = "PageFetcherSnapshot.kt", i = {}, l = {50}, m = "emit", n = {}, s = {}, v = 1)
                        /* renamed from: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                            int getHighSpeedVideoFpsRanges;
                            /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                this.getHighSpeedVideoFpsRangesFor = obj;
                                this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
                                return androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                            }

                            public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                super(continuation);
                            }
                        }

                        public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, int i) {
                            this.getHighSpeedVideoFpsRangesFor = flowCollector;
                            this.Camera2StreamConfigurationMap = i;
                        }
                    }
                };
            }
            this.getInputFormats = null;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoSizes = 2;
        } finally {
            mutex.unlock(null);
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super androidx.paging.GenerationalViewportHint> flowCollector, java.lang.Integer num, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 = new androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(continuation, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor);
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.getInputFormats = flowCollector;
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.getHighResolutionOutputSizeshNQ4ISI = num;
        return pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(kotlin.coroutines.Continuation continuation, androidx.paging.PageFetcherSnapshot pageFetcherSnapshot, androidx.paging.LoadType loadType) {
        super(3, continuation);
        this.getOutputMinFrameDuration = pageFetcherSnapshot;
        this.getHighSpeedVideoFpsRangesFor = loadType;
    }
}
