package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2", f = "Transition.kt", i = {}, l = {600}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class SeekableTransitionState$animateTo$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.animation.core.SeekableTransitionState<S> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ S getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.animation.core.Transition<S> getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1", f = "Transition.kt", i = {0}, l = {2174, 613, 615, 669, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.MIGRATION_SYSTEM_ERROR}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"}, v = 1)
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.animation.core.Transition<S> Camera2StreamConfigurationMap;
        final /* synthetic */ S getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> getHighSpeedVideoFpsRangesFor;
        java.lang.Object getHighSpeedVideoSizes;
        final /* synthetic */ androidx.compose.animation.core.SeekableTransitionState<S> getInputFormats;
        int getOutputFormats;

        /* JADX WARN: Code restructure failed: missing block: B:17:0x01fc, code lost:
        
            if (r2 == r0) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x01e8, code lost:
        
            if (r2 != r0) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00bc, code lost:
        
            if (r2 != r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00af, code lost:
        
            if (r2 != r0) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00cc  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.sync.Mutex mutex;
            androidx.compose.animation.core.SeekableTransitionState seekableTransitionState;
            java.lang.Object highSpeedVideoSizes;
            java.lang.Object highResolutionOutputSizeshNQ4ISI;
            java.lang.Object highSpeedVideoFpsRanges;
            androidx.compose.animation.core.SeekableTransitionState.SeekingAnimationState seekingAnimationState;
            androidx.compose.animation.core.AnimationVector1D highSpeedVideoSizes2;
            long roundToLong;
            java.lang.Object highSpeedVideoFpsRangesFor;
            androidx.compose.animation.core.SeekableTransitionState.Companion unused;
            androidx.compose.animation.core.SeekableTransitionState.Companion unused2;
            androidx.compose.animation.core.SeekableTransitionState.Companion unused3;
            androidx.compose.animation.core.SeekableTransitionState.Companion unused4;
            androidx.compose.animation.core.SeekableTransitionState.Companion unused5;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getOutputFormats;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.Object targetState = this.getInputFormats.getTargetState();
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, targetState)) {
                        this.getInputFormats.getHighSpeedVideoSizes();
                        this.getInputFormats.setFraction(0.0f);
                        this.Camera2StreamConfigurationMap.updateTarget$animation_core(this.getHighResolutionOutputSizeshNQ4ISI);
                        this.Camera2StreamConfigurationMap.setPlayTimeNanos(0L);
                        this.getInputFormats.setCurrentState$animation_core(targetState);
                        this.getInputFormats.setTargetState$animation_core(this.getHighResolutionOutputSizeshNQ4ISI);
                    }
                    kotlinx.coroutines.sync.Mutex compositionContinuationMutex = this.getInputFormats.getCompositionContinuationMutex();
                    androidx.compose.animation.core.SeekableTransitionState seekableTransitionState2 = this.getInputFormats;
                    this.getHighSpeedVideoFpsRanges = compositionContinuationMutex;
                    this.getHighSpeedVideoSizes = seekableTransitionState2;
                    this.getOutputFormats = 1;
                    if (compositionContinuationMutex.lock(null, this) != coroutine_suspended) {
                        mutex = compositionContinuationMutex;
                        seekableTransitionState = seekableTransitionState2;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    seekableTransitionState = (androidx.compose.animation.core.SeekableTransitionState) this.getHighSpeedVideoSizes;
                    mutex = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getOutputFormats = 3;
                    highResolutionOutputSizeshNQ4ISI = this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(this);
                } else {
                    if (i == 3) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.getInputFormats.getCurrentState(), this.getHighResolutionOutputSizeshNQ4ISI)) {
                            if (this.getInputFormats.getFraction() < 1.0f) {
                                seekingAnimationState = ((androidx.compose.animation.core.SeekableTransitionState) this.getInputFormats).getOutputFormats;
                                androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec = this.getHighSpeedVideoFpsRangesFor;
                                androidx.compose.animation.core.VectorizedAnimationSpec vectorize = finiteAnimationSpec != null ? finiteAnimationSpec.vectorize((androidx.compose.animation.core.TwoWayConverter<java.lang.Float, V>) androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE)) : null;
                                if (seekingAnimationState == null || !kotlin.jvm.internal.Intrinsics.areEqual(vectorize, seekingAnimationState.getAnimationSpec())) {
                                    androidx.compose.animation.core.VectorizedAnimationSpec animationSpec = seekingAnimationState != null ? seekingAnimationState.getAnimationSpec() : null;
                                    if (animationSpec != null) {
                                        long progressNanos = seekingAnimationState.getProgressNanos();
                                        androidx.compose.animation.core.AnimationVector1D start = seekingAnimationState.getStart();
                                        unused = androidx.compose.animation.core.SeekableTransitionState.Companion;
                                        androidx.compose.animation.core.AnimationVector1D highSpeedVideoFpsRanges2 = androidx.compose.animation.core.SeekableTransitionState.Companion.getHighSpeedVideoFpsRanges();
                                        androidx.compose.animation.core.AnimationVector1D initialVelocity = seekingAnimationState.getInitialVelocity();
                                        if (initialVelocity == null) {
                                            unused2 = androidx.compose.animation.core.SeekableTransitionState.Companion;
                                            initialVelocity = androidx.compose.animation.core.SeekableTransitionState.Companion.getHighSpeedVideoSizes();
                                        }
                                        highSpeedVideoSizes2 = (androidx.compose.animation.core.AnimationVector1D) animationSpec.getVelocityFromNanos(progressNanos, start, highSpeedVideoFpsRanges2, initialVelocity);
                                    } else if (seekingAnimationState == null || seekingAnimationState.getProgressNanos() == 0) {
                                        unused5 = androidx.compose.animation.core.SeekableTransitionState.Companion;
                                        highSpeedVideoSizes2 = androidx.compose.animation.core.SeekableTransitionState.Companion.getHighSpeedVideoSizes();
                                    } else {
                                        long durationNanos = seekingAnimationState.getDurationNanos();
                                        if (durationNanos == Long.MIN_VALUE) {
                                            durationNanos = this.getInputFormats.getTotalDurationNanos();
                                        }
                                        float f = durationNanos / 1.0E9f;
                                        if (f <= 0.0f) {
                                            unused4 = androidx.compose.animation.core.SeekableTransitionState.Companion;
                                            highSpeedVideoSizes2 = androidx.compose.animation.core.SeekableTransitionState.Companion.getHighSpeedVideoSizes();
                                        } else {
                                            highSpeedVideoSizes2 = new androidx.compose.animation.core.AnimationVector1D(1.0f / f);
                                        }
                                    }
                                    if (seekingAnimationState == null) {
                                        seekingAnimationState = new androidx.compose.animation.core.SeekableTransitionState.SeekingAnimationState();
                                    }
                                    seekingAnimationState.setAnimationSpec(vectorize);
                                    seekingAnimationState.setComplete(false);
                                    seekingAnimationState.setValue(this.getInputFormats.getFraction());
                                    seekingAnimationState.getStart().set$animation_core(0, this.getInputFormats.getFraction());
                                    seekingAnimationState.setDurationNanos(this.getInputFormats.getTotalDurationNanos());
                                    seekingAnimationState.setProgressNanos(0L);
                                    seekingAnimationState.setInitialVelocity(highSpeedVideoSizes2);
                                    if (vectorize != null) {
                                        androidx.compose.animation.core.AnimationVector1D start2 = seekingAnimationState.getStart();
                                        unused3 = androidx.compose.animation.core.SeekableTransitionState.Companion;
                                        roundToLong = vectorize.getDurationNanos(start2, androidx.compose.animation.core.SeekableTransitionState.Companion.getHighSpeedVideoFpsRanges(), highSpeedVideoSizes2);
                                    } else {
                                        roundToLong = kotlin.math.MathKt.roundToLong(this.getInputFormats.getTotalDurationNanos() * (1.0d - this.getInputFormats.getFraction()));
                                    }
                                    seekingAnimationState.setAnimationSpecDuration(roundToLong);
                                    ((androidx.compose.animation.core.SeekableTransitionState) this.getInputFormats).getOutputFormats = seekingAnimationState;
                                }
                            }
                            this.getHighSpeedVideoFpsRanges = null;
                            this.getHighSpeedVideoSizes = null;
                            this.getOutputFormats = 4;
                            highSpeedVideoFpsRanges = this.getInputFormats.getHighSpeedVideoFpsRanges(this);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.getInputFormats.setFraction(0.0f);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getInputFormats.setCurrentState$animation_core(this.getHighResolutionOutputSizeshNQ4ISI);
                    this.getOutputFormats = 5;
                    highSpeedVideoFpsRangesFor = this.getInputFormats.getHighSpeedVideoFpsRangesFor(this);
                }
                java.lang.Object composedTargetState$animation_core = seekableTransitionState.getComposedTargetState$animation_core();
                mutex.unlock(null);
                if (!kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, composedTargetState$animation_core)) {
                    this.getHighSpeedVideoFpsRanges = null;
                    this.getHighSpeedVideoSizes = null;
                    this.getOutputFormats = 2;
                    highSpeedVideoSizes = this.getInputFormats.getHighSpeedVideoSizes((kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(this.getInputFormats.getCurrentState(), this.getHighResolutionOutputSizeshNQ4ISI)) {
                }
                return kotlin.Unit.INSTANCE;
            } catch (java.lang.Throwable th) {
                mutex.unlock(null);
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.animation.core.SeekableTransitionState$animateTo$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.compose.animation.core.SeekableTransitionState$animateTo$2.AnonymousClass1(this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.animation.core.SeekableTransitionState<S> seekableTransitionState, S s, androidx.compose.animation.core.Transition<S> transition, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec, kotlin.coroutines.Continuation<? super androidx.compose.animation.core.SeekableTransitionState$animateTo$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getInputFormats = seekableTransitionState;
            this.getHighResolutionOutputSizeshNQ4ISI = s;
            this.Camera2StreamConfigurationMap = transition;
            this.getHighSpeedVideoFpsRangesFor = finiteAnimationSpec;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.animation.core.SeekableTransitionState$animateTo$2.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighSpeedVideoSizes.onTransitionEnd$animation_core();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.animation.core.SeekableTransitionState$animateTo$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.animation.core.SeekableTransitionState$animateTo$2(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SeekableTransitionState$animateTo$2(androidx.compose.animation.core.Transition<S> transition, androidx.compose.animation.core.SeekableTransitionState<S> seekableTransitionState, S s, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec, kotlin.coroutines.Continuation<? super androidx.compose.animation.core.SeekableTransitionState$animateTo$2> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoSizes = transition;
        this.Camera2StreamConfigurationMap = seekableTransitionState;
        this.getHighSpeedVideoFpsRanges = s;
        this.getHighSpeedVideoFpsRangesFor = finiteAnimationSpec;
    }
}
