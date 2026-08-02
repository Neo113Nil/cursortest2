package com.paypal.oslo.core.commonui.components.containers;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$1$1$animationJobs$4", f = "Deck.kt", i = {}, l = {417}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class DeckKt$AnimatedCardWrapper$1$1$animationJobs$4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.animation.core.TweenSpec<java.lang.Float> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.commonui.components.containers.CardPositionState getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            if (androidx.compose.animation.core.Animatable.animateTo$default(this.getHighSpeedVideoFpsRangesFor, kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.getHighSpeedVideoFpsRanges.getRotation()), this.Camera2StreamConfigurationMap, null, null, this, 12, null) == coroutine_suspended) {
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
        return ((com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$1$1$animationJobs$4) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$1$1$animationJobs$4(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeckKt$AnimatedCardWrapper$1$1$animationJobs$4(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, com.paypal.oslo.core.commonui.components.containers.CardPositionState cardPositionState, androidx.compose.animation.core.TweenSpec<java.lang.Float> tweenSpec, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$1$1$animationJobs$4> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = animatable;
        this.getHighSpeedVideoFpsRanges = cardPositionState;
        this.Camera2StreamConfigurationMap = tweenSpec;
    }
}
