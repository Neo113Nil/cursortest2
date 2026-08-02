package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.animation.core.DeferredTargetAnimation$updateTarget$1", f = "DeferredTargetAnimation.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class DeferredTargetAnimation$updateTarget$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.animation.core.Animatable<T, V> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.animation.core.DeferredTargetAnimation<T, V> getHighSpeedVideoFpsRanges;
    final /* synthetic */ T getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<T> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Object targetValue = this.Camera2StreamConfigurationMap.getTargetValue();
            highSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(targetValue, highSpeedVideoSizes)) {
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (androidx.compose.animation.core.Animatable.animateTo$default(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
        return ((androidx.compose.animation.core.DeferredTargetAnimation$updateTarget$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.animation.core.DeferredTargetAnimation$updateTarget$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeferredTargetAnimation$updateTarget$1(androidx.compose.animation.core.Animatable<T, V> animatable, androidx.compose.animation.core.DeferredTargetAnimation<T, V> deferredTargetAnimation, T t, androidx.compose.animation.core.FiniteAnimationSpec<T> finiteAnimationSpec, kotlin.coroutines.Continuation<? super androidx.compose.animation.core.DeferredTargetAnimation$updateTarget$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = animatable;
        this.getHighSpeedVideoFpsRanges = deferredTargetAnimation;
        this.getHighSpeedVideoFpsRangesFor = t;
        this.getHighSpeedVideoSizes = finiteAnimationSpec;
    }
}
