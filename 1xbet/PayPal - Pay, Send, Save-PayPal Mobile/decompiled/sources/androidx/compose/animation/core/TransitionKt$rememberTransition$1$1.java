package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1", f = "Transition.kt", i = {0}, l = {2174}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"}, v = 1)
/* loaded from: classes.dex */
final class TransitionKt$rememberTransition$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.animation.core.TransitionState<T> getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.sync.Mutex compositionContinuationMutex;
        androidx.compose.animation.core.TransitionState transitionState;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ((androidx.compose.animation.core.SeekableTransitionState) this.getHighSpeedVideoFpsRangesFor).observeTotalDuration$animation_core();
            compositionContinuationMutex = ((androidx.compose.animation.core.SeekableTransitionState) this.getHighSpeedVideoFpsRangesFor).getCompositionContinuationMutex();
            androidx.compose.animation.core.TransitionState transitionState2 = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRanges = compositionContinuationMutex;
            this.getHighSpeedVideoSizes = transitionState2;
            this.Camera2StreamConfigurationMap = 1;
            if (compositionContinuationMutex.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            transitionState = transitionState2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transitionState = (androidx.compose.animation.core.TransitionState) this.getHighSpeedVideoSizes;
            compositionContinuationMutex = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        try {
            ((androidx.compose.animation.core.SeekableTransitionState) transitionState).setComposedTargetState$animation_core(((androidx.compose.animation.core.SeekableTransitionState) transitionState).getTargetState());
            kotlinx.coroutines.CancellableContinuation compositionContinuation$animation_core = ((androidx.compose.animation.core.SeekableTransitionState) transitionState).getCompositionContinuation$animation_core();
            if (compositionContinuation$animation_core != null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                compositionContinuation$animation_core.resumeWith(kotlin.Result.m23436constructorimpl(((androidx.compose.animation.core.SeekableTransitionState) transitionState).getTargetState()));
            }
            ((androidx.compose.animation.core.SeekableTransitionState) transitionState).setCompositionContinuation$animation_core(null);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            compositionContinuationMutex.unlock(null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            compositionContinuationMutex.unlock(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.animation.core.TransitionKt$rememberTransition$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.animation.core.TransitionKt$rememberTransition$1$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransitionKt$rememberTransition$1$1(androidx.compose.animation.core.TransitionState<T> transitionState, kotlin.coroutines.Continuation<? super androidx.compose.animation.core.TransitionKt$rememberTransition$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = transitionState;
    }
}
