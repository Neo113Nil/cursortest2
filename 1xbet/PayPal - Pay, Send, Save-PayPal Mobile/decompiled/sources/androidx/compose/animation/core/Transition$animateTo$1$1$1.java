package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", i = {0, 0}, l = {1202}, m = "invokeSuspend", n = {"$this$launch", "durationScale"}, s = {"L$0", "F$0"}, v = 1)
/* loaded from: classes.dex */
final class Transition$animateTo$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    float Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.animation.core.Transition<S> getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        final float durationScale;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRangesFor;
            durationScale = androidx.compose.animation.core.SuspendAnimationKt.getDurationScale(coroutineScope.getCoroutineContext());
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            durationScale = this.Camera2StreamConfigurationMap;
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
            final androidx.compose.animation.core.Transition<S> transition = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = coroutineScope;
            this.Camera2StreamConfigurationMap = durationScale;
            this.getHighSpeedVideoSizes = 1;
            if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.Transition$animateTo$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.animation.core.Transition$animateTo$1$1$1.Camera2StreamConfigurationMap(androidx.compose.animation.core.Transition.this, durationScale, ((java.lang.Long) obj2).longValue());
                    return Camera2StreamConfigurationMap;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.animation.core.Transition transition, float f, long j) {
        if (!transition.isSeeking()) {
            transition.onFrame$animation_core(j, f);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.animation.core.Transition$animateTo$1$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.animation.core.Transition$animateTo$1$1$1 transition$animateTo$1$1$1 = new androidx.compose.animation.core.Transition$animateTo$1$1$1(this.getHighSpeedVideoFpsRanges, continuation);
        transition$animateTo$1$1$1.getHighSpeedVideoFpsRangesFor = obj;
        return transition$animateTo$1$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Transition$animateTo$1$1$1(androidx.compose.animation.core.Transition<S> transition, kotlin.coroutines.Continuation<? super androidx.compose.animation.core.Transition$animateTo$1$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = transition;
    }
}
