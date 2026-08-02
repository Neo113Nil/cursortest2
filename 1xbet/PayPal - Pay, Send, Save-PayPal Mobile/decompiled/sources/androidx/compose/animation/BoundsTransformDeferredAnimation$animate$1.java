package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1", f = "AnimateBoundsModifier.kt", i = {}, l = {434}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class BoundsTransformDeferredAnimation$animate$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.animation.core.Animatable<androidx.compose.ui.geometry.Rect, androidx.compose.animation.core.AnimationVector4D> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.geometry.Rect getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.animation.BoundsTransformDeferredAnimation getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.animation.BoundsTransform getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.animation.core.Animatable<androidx.compose.ui.geometry.Rect, androidx.compose.animation.core.AnimationVector4D> animatable = this.Camera2StreamConfigurationMap;
            androidx.compose.ui.geometry.Rect rect = this.getHighSpeedVideoFpsRanges;
            androidx.compose.animation.BoundsTransform boundsTransform = this.getHighSpeedVideoSizes;
            androidx.compose.ui.geometry.Rect currentBounds = this.getHighSpeedVideoFpsRangesFor.getCurrentBounds();
            kotlin.jvm.internal.Intrinsics.checkNotNull(currentBounds);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (androidx.compose.animation.core.Animatable.animateTo$default(animatable, rect, boundsTransform.createAnimationSpec(currentBounds, this.getHighSpeedVideoFpsRanges), null, null, this, 12, null) == coroutine_suspended) {
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
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BoundsTransformDeferredAnimation$animate$1(androidx.compose.animation.core.Animatable<androidx.compose.ui.geometry.Rect, androidx.compose.animation.core.AnimationVector4D> animatable, androidx.compose.ui.geometry.Rect rect, androidx.compose.animation.BoundsTransform boundsTransform, androidx.compose.animation.BoundsTransformDeferredAnimation boundsTransformDeferredAnimation, kotlin.coroutines.Continuation<? super androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = animatable;
        this.getHighSpeedVideoFpsRanges = rect;
        this.getHighSpeedVideoSizes = boundsTransform;
        this.getHighSpeedVideoFpsRangesFor = boundsTransformDeferredAnimation;
    }
}
