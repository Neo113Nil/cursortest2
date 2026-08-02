package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", f = "AnimationModifier.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class SizeAnimationModifierNode$animateTo$data$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.animation.SizeAnimationModifierNode Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.animation.SizeAnimationModifierNode.AnimData getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ long getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.IntSize, ? super androidx.compose.ui.unit.IntSize, kotlin.Unit> function2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = 1;
            obj = androidx.compose.animation.core.Animatable.animateTo$default(this.getHighResolutionOutputSizeshNQ4ISI.getAnim(), androidx.compose.ui.unit.IntSize.m8764boximpl(this.getHighSpeedVideoSizes), this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges, null, null, this, 12, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.compose.animation.core.AnimationResult animationResult = (androidx.compose.animation.core.AnimationResult) obj;
        if (animationResult.getEndReason() == androidx.compose.animation.core.AnimationEndReason.Finished && (function2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor) != null) {
            function2.invoke(androidx.compose.ui.unit.IntSize.m8764boximpl(this.getHighResolutionOutputSizeshNQ4ISI.m1154getStartSizeYbymL2g()), animationResult.getEndState().getValue());
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SizeAnimationModifierNode$animateTo$data$1$1(androidx.compose.animation.SizeAnimationModifierNode.AnimData animData, long j, androidx.compose.animation.SizeAnimationModifierNode sizeAnimationModifierNode, kotlin.coroutines.Continuation<? super androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = animData;
        this.getHighSpeedVideoSizes = j;
        this.Camera2StreamConfigurationMap = sizeAnimationModifierNode;
    }
}
