package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", i = {0, 0}, l = {1173}, m = "invokeSuspend", n = {"callingJob", "unregisterApplyObserver"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes6.dex */
final class Recomposer$recompositionRunner$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MonotonicFrameClock getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.Recomposer getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Job job;
        androidx.compose.runtime.Recomposer.RecomposerInfoImpl recomposerInfoImpl;
        androidx.compose.runtime.snapshots.ObserverHandle observerHandle;
        java.lang.Throwable th;
        java.lang.Object obj2;
        kotlinx.coroutines.Job job2;
        androidx.compose.runtime.Recomposer.RecomposerInfoImpl recomposerInfoImpl2;
        kotlinx.coroutines.Job job3;
        androidx.compose.runtime.Recomposer.RecomposerInfoImpl recomposerInfoImpl3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            job = kotlinx.coroutines.JobKt.getJob(((kotlinx.coroutines.CoroutineScope) this.getInputSizeshNQ4ISI).getCoroutineContext());
            this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(job);
            androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
            final androidx.compose.runtime.Recomposer recomposer = this.getHighSpeedVideoFpsRangesFor;
            androidx.compose.runtime.snapshots.ObserverHandle registerApplyObserver = companion.registerApplyObserver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.Recomposer$recompositionRunner$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    kotlin.Unit highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.runtime.Recomposer$recompositionRunner$2.getHighSpeedVideoSizes(androidx.compose.runtime.Recomposer.this, (java.util.Set) obj3);
                    return highSpeedVideoSizes;
                }
            });
            androidx.compose.runtime.Recomposer.Companion companion2 = androidx.compose.runtime.Recomposer.INSTANCE;
            recomposerInfoImpl = this.getHighSpeedVideoFpsRangesFor.coroutineBoundary;
            androidx.compose.runtime.Recomposer.Companion.getHighResolutionOutputSizeshNQ4ISI(recomposerInfoImpl);
            try {
                java.util.List outputStallDuration = this.getHighSpeedVideoFpsRangesFor.getOutputStallDuration();
                int size = outputStallDuration.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((androidx.compose.runtime.ControlledComposition) outputStallDuration.get(i2)).invalidateAll();
                }
                this.getInputSizeshNQ4ISI = job;
                this.getHighSpeedVideoFpsRanges = registerApplyObserver;
                this.Camera2StreamConfigurationMap = 1;
                if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.runtime.Recomposer$recompositionRunner$2.AnonymousClass2(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                observerHandle = registerApplyObserver;
            } catch (java.lang.Throwable th2) {
                observerHandle = registerApplyObserver;
                th = th2;
                observerHandle.dispose();
                obj2 = this.getHighSpeedVideoFpsRangesFor.b;
                androidx.compose.runtime.Recomposer recomposer2 = this.getHighSpeedVideoFpsRangesFor;
                synchronized (obj2) {
                    job2 = recomposer2._BOUNDARY;
                    if (job2 == job) {
                        recomposer2._BOUNDARY = null;
                    }
                    recomposer2.getHighSpeedVideoFpsRangesFor();
                }
                androidx.compose.runtime.Recomposer.Companion companion3 = androidx.compose.runtime.Recomposer.INSTANCE;
                recomposerInfoImpl2 = this.getHighSpeedVideoFpsRangesFor.coroutineBoundary;
                androidx.compose.runtime.Recomposer.Companion.getHighSpeedVideoSizes(recomposerInfoImpl2);
                throw th;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            observerHandle = (androidx.compose.runtime.snapshots.ObserverHandle) this.getHighSpeedVideoFpsRanges;
            job = (kotlinx.coroutines.Job) this.getInputSizeshNQ4ISI;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (java.lang.Throwable th3) {
                th = th3;
                observerHandle.dispose();
                obj2 = this.getHighSpeedVideoFpsRangesFor.b;
                androidx.compose.runtime.Recomposer recomposer22 = this.getHighSpeedVideoFpsRangesFor;
                synchronized (obj2) {
                }
            }
        }
        observerHandle.dispose();
        java.lang.Object obj3 = this.getHighSpeedVideoFpsRangesFor.b;
        androidx.compose.runtime.Recomposer recomposer3 = this.getHighSpeedVideoFpsRangesFor;
        synchronized (obj3) {
            job3 = recomposer3._BOUNDARY;
            if (job3 == job) {
                recomposer3._BOUNDARY = null;
            }
            recomposer3.getHighSpeedVideoFpsRangesFor();
        }
        androidx.compose.runtime.Recomposer.Companion companion4 = androidx.compose.runtime.Recomposer.INSTANCE;
        recomposerInfoImpl3 = this.getHighSpeedVideoFpsRangesFor.coroutineBoundary;
        androidx.compose.runtime.Recomposer.Companion.getHighSpeedVideoSizes(recomposerInfoImpl3);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.runtime.Recomposer recomposer, java.util.Set set) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.CancellableContinuation cancellableContinuation;
        androidx.collection.MutableScatterSet mutableScatterSet;
        synchronized (recomposer.b) {
            mutableStateFlow = recomposer.getHighResolutionOutputSizeshNQ4ISI;
            if (((androidx.compose.runtime.Recomposer.State) mutableStateFlow.getValue()).compareTo(androidx.compose.runtime.Recomposer.State.Idle) >= 0) {
                mutableScatterSet = recomposer.getARTIFICIAL_FRAME_PACKAGE_NAME;
                if (set instanceof androidx.compose.runtime.collection.ScatterSetWrapper) {
                    androidx.collection.ScatterSet set$runtime = ((androidx.compose.runtime.collection.ScatterSetWrapper) set).getSet$runtime();
                    java.lang.Object[] objArr = set$runtime.elements;
                    long[] jArr = set$runtime.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        java.lang.Object obj = objArr[(i << 3) + i3];
                                        if (obj instanceof androidx.compose.runtime.snapshots.StateObjectImpl) {
                                            androidx.compose.runtime.snapshots.ReaderKind.Companion companion = androidx.compose.runtime.snapshots.ReaderKind.INSTANCE;
                                            if (!((androidx.compose.runtime.snapshots.StateObjectImpl) obj).m5491isReadInh_f27i8$runtime(androidx.compose.runtime.snapshots.ReaderKind.m5475constructorimpl(1))) {
                                            }
                                        }
                                        mutableScatterSet.add(obj);
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                }
                            }
                            if (i == length) {
                                break;
                            }
                            i++;
                        }
                    }
                } else {
                    for (java.lang.Object obj2 : set) {
                        if (obj2 instanceof androidx.compose.runtime.snapshots.StateObjectImpl) {
                            androidx.compose.runtime.snapshots.ReaderKind.Companion companion2 = androidx.compose.runtime.snapshots.ReaderKind.INSTANCE;
                            if (!((androidx.compose.runtime.snapshots.StateObjectImpl) obj2).m5491isReadInh_f27i8$runtime(androidx.compose.runtime.snapshots.ReaderKind.m5475constructorimpl(1))) {
                            }
                        }
                        mutableScatterSet.add(obj2);
                    }
                }
                cancellableContinuation = recomposer.getHighSpeedVideoFpsRangesFor();
            } else {
                cancellableContinuation = null;
            }
        }
        if (cancellableContinuation != null) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", i = {}, l = {1173}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.compose.runtime.MonotonicFrameClock getHighSpeedVideoFpsRangesFor;
        private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizes;
                kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function3 = this.getHighSpeedVideoFpsRanges;
                androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock = this.getHighSpeedVideoFpsRangesFor;
                this.Camera2StreamConfigurationMap = 1;
                if (function3.invoke(coroutineScope, monotonicFrameClock, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
        public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.runtime.Recomposer$recompositionRunner$2.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.runtime.Recomposer$recompositionRunner$2.AnonymousClass2 anonymousClass2 = new androidx.compose.runtime.Recomposer$recompositionRunner$2.AnonymousClass2(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass2.getHighSpeedVideoSizes = obj;
            return anonymousClass2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.runtime.MonotonicFrameClock, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock, kotlin.coroutines.Continuation<? super androidx.compose.runtime.Recomposer$recompositionRunner$2.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = function3;
            this.getHighSpeedVideoFpsRangesFor = monotonicFrameClock;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.runtime.Recomposer$recompositionRunner$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.runtime.Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new androidx.compose.runtime.Recomposer$recompositionRunner$2(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        recomposer$recompositionRunner$2.getInputSizeshNQ4ISI = obj;
        return recomposer$recompositionRunner$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Recomposer$recompositionRunner$2(androidx.compose.runtime.Recomposer recomposer, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.runtime.MonotonicFrameClock, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock, kotlin.coroutines.Continuation<? super androidx.compose.runtime.Recomposer$recompositionRunner$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = recomposer;
        this.getHighSpeedVideoSizes = function3;
        this.getHighResolutionOutputSizeshNQ4ISI = monotonicFrameClock;
    }
}
