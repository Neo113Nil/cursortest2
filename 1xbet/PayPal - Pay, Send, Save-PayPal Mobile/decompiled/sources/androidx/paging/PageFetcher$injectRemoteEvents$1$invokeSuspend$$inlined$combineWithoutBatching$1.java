package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [Value] */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¨\u0006\u0004"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/paging/SimpleProducerScope;", "androidx/paging/FlowExtKt$combineWithoutBatching$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1", f = "PageFetcher.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
public final class PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1<Value> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.paging.SimpleProducerScope<androidx.paging.PageEvent<Value>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.paging.MutableLoadStateCollection getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.flow.Flow getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlinx.coroutines.flow.Flow getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "androidx/paging/FlowExtKt$combineWithoutBatching$2$1$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", f = "FlowExt.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.paging.UnbatchedFlowCombiner Camera2StreamConfigurationMap;
        final /* synthetic */ kotlinx.coroutines.flow.Flow getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.paging.SimpleProducerScope<androidx.paging.PageEvent<Value>> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ int getHighSpeedVideoSizes;
        int getOutputMinFrameDuration;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getOutputMinFrameDuration;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getOutputMinFrameDuration = 1;
                    if (this.getHighResolutionOutputSizeshNQ4ISI.collect(new androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.AnonymousClass2.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.getHighSpeedVideoFpsRangesFor, null, 1, null);
                }
                return kotlin.Unit.INSTANCE;
            } finally {
                if (this.getHighSpeedVideoFpsRanges.decrementAndGet() == 0) {
                    kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.getHighSpeedVideoFpsRangesFor, null, 1, null);
                }
            }
        }

        @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
            final /* synthetic */ int Camera2StreamConfigurationMap;
            final /* synthetic */ androidx.paging.UnbatchedFlowCombiner getHighSpeedVideoSizes;

            /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
            
                if (kotlinx.coroutines.YieldKt.yield(r0) != r1) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
            
                return r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
            
                if (r7.onNext(r2, r6, r0) != r1) goto L18;
             */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.AnonymousClass2.AnonymousClass1.C00451 c00451;
                int i;
                if (continuation instanceof androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.AnonymousClass2.AnonymousClass1.C00451) {
                    c00451 = (androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.AnonymousClass2.AnonymousClass1.C00451) continuation;
                    if ((c00451.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                        c00451.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                        java.lang.Object obj2 = c00451.Camera2StreamConfigurationMap;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c00451.getHighResolutionOutputSizeshNQ4ISI;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj2);
                            androidx.paging.UnbatchedFlowCombiner unbatchedFlowCombiner = this.getHighSpeedVideoSizes;
                            int i2 = this.Camera2StreamConfigurationMap;
                            c00451.getHighResolutionOutputSizeshNQ4ISI = 1;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                                return kotlin.Unit.INSTANCE;
                            }
                            kotlin.ResultKt.throwOnFailure(obj2);
                        }
                        c00451.getHighResolutionOutputSizeshNQ4ISI = 2;
                    }
                }
                c00451 = new androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.AnonymousClass2.AnonymousClass1.C00451(continuation);
                java.lang.Object obj22 = c00451.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c00451.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                }
                c00451.getHighResolutionOutputSizeshNQ4ISI = 2;
            }

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C00451 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
                int getHighResolutionOutputSizeshNQ4ISI;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    this.Camera2StreamConfigurationMap = obj;
                    this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
                    return androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.AnonymousClass2.AnonymousClass1.this.emit(null, this);
                }

                C00451(kotlin.coroutines.Continuation continuation) {
                    super(continuation);
                }
            }

            public AnonymousClass1(androidx.paging.UnbatchedFlowCombiner unbatchedFlowCombiner, int i) {
                this.getHighSpeedVideoSizes = unbatchedFlowCombiner;
                this.Camera2StreamConfigurationMap = i;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.AnonymousClass2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(kotlinx.coroutines.flow.Flow flow, java.util.concurrent.atomic.AtomicInteger atomicInteger, androidx.paging.SimpleProducerScope simpleProducerScope, androidx.paging.UnbatchedFlowCombiner unbatchedFlowCombiner, int i, kotlin.coroutines.Continuation continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = flow;
            this.getHighSpeedVideoFpsRanges = atomicInteger;
            this.Camera2StreamConfigurationMap = unbatchedFlowCombiner;
            this.getHighSpeedVideoSizes = i;
            this.getHighSpeedVideoFpsRangesFor = simpleProducerScope;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u0002H\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\n¨\u0006\b"}, d2 = {"<anonymous>", "", "T1", "T2", "t1", "t2", "updateFrom", "Landroidx/paging/CombineSource;", "androidx/paging/FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1", f = "PageFetcher.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function4<androidx.paging.LoadStates, androidx.paging.PageEvent<Value>, androidx.paging.CombineSource, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.paging.MutableLoadStateCollection getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.paging.SimpleProducerScope<androidx.paging.PageEvent<Value>> getHighSpeedVideoFpsRanges;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
        int getInputSizeshNQ4ISI;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getInputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.Object obj2 = this.Camera2StreamConfigurationMap;
                java.lang.Object obj3 = this.getHighSpeedVideoSizes;
                androidx.paging.CombineSource combineSource = (androidx.paging.CombineSource) this.getHighSpeedVideoFpsRangesFor;
                androidx.paging.SimpleProducerScope<androidx.paging.PageEvent<Value>> simpleProducerScope = this.getHighSpeedVideoFpsRanges;
                androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.AnonymousClass1 anonymousClass1 = this;
                androidx.paging.PageEvent.LoadStateUpdate loadStateUpdate = (androidx.paging.PageEvent) obj3;
                androidx.paging.LoadStates loadStates = (androidx.paging.LoadStates) obj2;
                if (combineSource != androidx.paging.CombineSource.RECEIVER) {
                    if (loadStateUpdate instanceof androidx.paging.PageEvent.Insert) {
                        androidx.paging.PageEvent.Insert insert = (androidx.paging.PageEvent.Insert) loadStateUpdate;
                        this.getHighResolutionOutputSizeshNQ4ISI.set(insert.getSourceLoadStates());
                        loadStateUpdate = androidx.paging.PageEvent.Insert.copy$default(insert, null, null, 0, 0, insert.getSourceLoadStates(), loadStates, 15, null);
                    } else if (loadStateUpdate instanceof androidx.paging.PageEvent.Drop) {
                        this.getHighResolutionOutputSizeshNQ4ISI.set(((androidx.paging.PageEvent.Drop) loadStateUpdate).getLoadType(), androidx.paging.LoadState.NotLoading.INSTANCE.getIncomplete$paging_common());
                    } else if (loadStateUpdate instanceof androidx.paging.PageEvent.LoadStateUpdate) {
                        androidx.paging.PageEvent.LoadStateUpdate loadStateUpdate2 = (androidx.paging.PageEvent.LoadStateUpdate) loadStateUpdate;
                        this.getHighResolutionOutputSizeshNQ4ISI.set(loadStateUpdate2.getSource());
                        loadStateUpdate = new androidx.paging.PageEvent.LoadStateUpdate(loadStateUpdate2.getSource(), loadStates);
                    } else {
                        if (!(loadStateUpdate instanceof androidx.paging.PageEvent.StaticList)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        throw new java.lang.IllegalStateException("Paging generated an event to display a static list that\n originated from a paginated source. If you see this\n exception, it is most likely a bug in the library.\n Please file a bug so we can fix it at:\n https://issuetracker.google.com/issues/new?component=413106");
                    }
                } else {
                    loadStateUpdate = new androidx.paging.PageEvent.LoadStateUpdate(this.getHighResolutionOutputSizeshNQ4ISI.snapshot(), loadStates);
                }
                this.getInputSizeshNQ4ISI = 1;
                if (simpleProducerScope.send(loadStateUpdate, anonymousClass1) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function4
        public final java.lang.Object invoke(androidx.paging.LoadStates loadStates, androidx.paging.PageEvent<Value> pageEvent, androidx.paging.CombineSource combineSource, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.AnonymousClass1 anonymousClass1 = new androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, continuation, this.getHighResolutionOutputSizeshNQ4ISI);
            anonymousClass1.Camera2StreamConfigurationMap = loadStates;
            anonymousClass1.getHighSpeedVideoSizes = pageEvent;
            anonymousClass1.getHighSpeedVideoFpsRangesFor = combineSource;
            return anonymousClass1.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(androidx.paging.SimpleProducerScope simpleProducerScope, kotlin.coroutines.Continuation continuation, androidx.paging.MutableLoadStateCollection mutableLoadStateCollection) {
            super(4, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = mutableLoadStateCollection;
            this.getHighSpeedVideoFpsRanges = simpleProducerScope;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final kotlinx.coroutines.CompletableJob Job$default;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.paging.SimpleProducerScope simpleProducerScope = (androidx.paging.SimpleProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
            java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(2);
            androidx.paging.UnbatchedFlowCombiner unbatchedFlowCombiner = new androidx.paging.UnbatchedFlowCombiner(new androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.AnonymousClass1(simpleProducerScope, null, this.getHighSpeedVideoFpsRanges));
            Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
            kotlinx.coroutines.flow.Flow[] flowArr = {this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor};
            int i2 = 0;
            int i3 = 0;
            while (i2 < 2) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(simpleProducerScope, Job$default, null, new androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.AnonymousClass2(flowArr[i2], atomicInteger, simpleProducerScope, unbatchedFlowCombiner, i3, null), 2, null);
                i2++;
                i3++;
            }
            this.Camera2StreamConfigurationMap = 1;
            if (simpleProducerScope.awaitClose(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.3
                @Override // kotlin.jvm.functions.Function0
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) kotlinx.coroutines.CompletableJob.this, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
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
    public final java.lang.Object invoke(androidx.paging.SimpleProducerScope<androidx.paging.PageEvent<Value>> simpleProducerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1) create(simpleProducerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1 pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1 = new androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation, this.getHighSpeedVideoFpsRanges);
        pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1(kotlinx.coroutines.flow.Flow flow, kotlinx.coroutines.flow.Flow flow2, kotlin.coroutines.Continuation continuation, androidx.paging.MutableLoadStateCollection mutableLoadStateCollection) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = flow;
        this.getHighSpeedVideoFpsRangesFor = flow2;
        this.getHighSpeedVideoFpsRanges = mutableLoadStateCollection;
    }
}
