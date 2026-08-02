package com.paypal.oslo.core.commonui.components.containers;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$1$1", f = "Deck.kt", i = {0, 0}, l = {421}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "animationJobs"}, nl = {androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_OFFSET}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes10.dex */
final class DeckKt$AnimatedCardWrapper$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.compose.animation.core.TweenSpec<java.lang.Float> getInputFormats;
    final /* synthetic */ boolean getInputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getOutputFormats;
    final /* synthetic */ com.paypal.oslo.core.commonui.components.containers.CardPositionState getOutputMinFrameDuration;
    int getOutputStallDuration;
    private /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job launch$default2;
        kotlinx.coroutines.Job launch$default3;
        kotlinx.coroutines.Job launch$default4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function0;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputStallDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$1$1$animationJobs$1(this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration, this.getInputFormats, null), 3, null);
            launch$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$1$1$animationJobs$2(this.getHighSpeedVideoFpsRangesFor, this.getOutputMinFrameDuration, this.getInputFormats, null), 3, null);
            launch$default3 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$1$1$animationJobs$3(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getInputFormats, null), 3, null);
            launch$default4 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$1$1$animationJobs$4(this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, this.getInputFormats, null), 3, null);
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlinx.coroutines.Job[]{launch$default, launch$default2, launch$default3, launch$default4});
            this.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(listOf);
            this.getOutputStallDuration = 1;
            if (kotlinx.coroutines.AwaitKt.joinAll(listOf, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (this.Camera2StreamConfigurationMap && this.getInputSizeshNQ4ISI && (function0 = this.getOutputFormats) != null) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$1$1 deckKt$AnimatedCardWrapper$1$1 = new com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$1$1(this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getOutputFormats, this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration, this.getInputFormats, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
        deckKt$AnimatedCardWrapper$1$1.getOutputStallDurationlomOqCM = obj;
        return deckKt$AnimatedCardWrapper$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeckKt$AnimatedCardWrapper$1$1(boolean z, boolean z2, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, com.paypal.oslo.core.commonui.components.containers.CardPositionState cardPositionState, androidx.compose.animation.core.TweenSpec<java.lang.Float> tweenSpec, androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable2, androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable3, androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable4, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = z;
        this.getInputSizeshNQ4ISI = z2;
        this.getOutputFormats = function0;
        this.getHighSpeedVideoSizes = animatable;
        this.getOutputMinFrameDuration = cardPositionState;
        this.getInputFormats = tweenSpec;
        this.getHighSpeedVideoFpsRangesFor = animatable2;
        this.getHighResolutionOutputSizeshNQ4ISI = animatable3;
        this.getHighSpeedVideoFpsRanges = animatable4;
    }
}
