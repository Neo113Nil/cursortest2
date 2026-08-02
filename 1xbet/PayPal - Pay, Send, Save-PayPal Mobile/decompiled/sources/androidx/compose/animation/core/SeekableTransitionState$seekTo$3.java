package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3", f = "Transition.kt", i = {}, l = {489}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class SeekableTransitionState$seekTo$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ S Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.animation.core.Transition<S> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ float getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ S getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.animation.core.SeekableTransitionState<S> getOutputFormats;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1", f = "Transition.kt", i = {}, l = {511}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ S Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.animation.core.Transition<S> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ S getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ float getHighSpeedVideoSizes;
        final /* synthetic */ androidx.compose.animation.core.SeekableTransitionState<S> getOutputFormats;
        private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            androidx.collection.MutableObjectList mutableObjectList;
            java.lang.Object highResolutionOutputSizeshNQ4ISI;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputMinFrameDuration;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges)) {
                    this.getOutputFormats.getHighSpeedVideoSizes();
                } else {
                    ((androidx.compose.animation.core.SeekableTransitionState) this.getOutputFormats).getOutputFormats = null;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputFormats.getCurrentState(), this.Camera2StreamConfigurationMap)) {
                        return kotlin.Unit.INSTANCE;
                    }
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges)) {
                    this.getHighResolutionOutputSizeshNQ4ISI.updateTarget$animation_core(this.Camera2StreamConfigurationMap);
                    this.getHighResolutionOutputSizeshNQ4ISI.setPlayTimeNanos(0L);
                    this.getOutputFormats.setTargetState$animation_core(this.Camera2StreamConfigurationMap);
                    this.getHighResolutionOutputSizeshNQ4ISI.resetAnimationFraction$animation_core(this.getHighSpeedVideoSizes);
                }
                this.getOutputFormats.setFraction(this.getHighSpeedVideoSizes);
                mutableObjectList = ((androidx.compose.animation.core.SeekableTransitionState) this.getOutputFormats).getHighSpeedVideoFpsRanges;
                if (mutableObjectList.isNotEmpty()) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.animation.core.SeekableTransitionState$seekTo$3.AnonymousClass1.C00081(this.getOutputFormats, null), 3, null);
                } else {
                    ((androidx.compose.animation.core.SeekableTransitionState) this.getOutputFormats).Camera2StreamConfigurationMap = Long.MIN_VALUE;
                }
                this.getHighSpeedVideoFpsRangesFor = 1;
                highResolutionOutputSizeshNQ4ISI = this.getOutputFormats.getHighResolutionOutputSizeshNQ4ISI(this);
                if (highResolutionOutputSizeshNQ4ISI == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            this.getOutputFormats.getHighSpeedVideoFpsRanges();
            return kotlin.Unit.INSTANCE;
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1", f = "Transition.kt", i = {}, l = {507}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00081 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ androidx.compose.animation.core.SeekableTransitionState<S> getHighSpeedVideoFpsRangesFor;
            int getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object highSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.getHighSpeedVideoSizes;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getHighSpeedVideoSizes = 1;
                    highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(this);
                    if (highSpeedVideoFpsRanges == coroutine_suspended) {
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
                return ((androidx.compose.animation.core.SeekableTransitionState$seekTo$3.AnonymousClass1.C00081) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new androidx.compose.animation.core.SeekableTransitionState$seekTo$3.AnonymousClass1.C00081(this.getHighSpeedVideoFpsRangesFor, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00081(androidx.compose.animation.core.SeekableTransitionState<S> seekableTransitionState, kotlin.coroutines.Continuation<? super androidx.compose.animation.core.SeekableTransitionState$seekTo$3.AnonymousClass1.C00081> continuation) {
                super(2, continuation);
                this.getHighSpeedVideoFpsRangesFor = seekableTransitionState;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.animation.core.SeekableTransitionState$seekTo$3.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.animation.core.SeekableTransitionState$seekTo$3.AnonymousClass1 anonymousClass1 = new androidx.compose.animation.core.SeekableTransitionState$seekTo$3.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
            anonymousClass1.getOutputMinFrameDuration = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(S s, S s2, androidx.compose.animation.core.SeekableTransitionState<S> seekableTransitionState, androidx.compose.animation.core.Transition<S> transition, float f, kotlin.coroutines.Continuation<? super androidx.compose.animation.core.SeekableTransitionState$seekTo$3.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = s;
            this.getHighSpeedVideoFpsRanges = s2;
            this.getOutputFormats = seekableTransitionState;
            this.getHighResolutionOutputSizeshNQ4ISI = transition;
            this.getHighSpeedVideoSizes = f;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.animation.core.SeekableTransitionState$seekTo$3.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
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
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.animation.core.SeekableTransitionState$seekTo$3) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.animation.core.SeekableTransitionState$seekTo$3(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SeekableTransitionState$seekTo$3(S s, S s2, androidx.compose.animation.core.SeekableTransitionState<S> seekableTransitionState, androidx.compose.animation.core.Transition<S> transition, float f, kotlin.coroutines.Continuation<? super androidx.compose.animation.core.SeekableTransitionState$seekTo$3> continuation) {
        super(1, continuation);
        this.Camera2StreamConfigurationMap = s;
        this.getHighSpeedVideoSizes = s2;
        this.getOutputFormats = seekableTransitionState;
        this.getHighResolutionOutputSizeshNQ4ISI = transition;
        this.getHighSpeedVideoFpsRanges = f;
    }
}
