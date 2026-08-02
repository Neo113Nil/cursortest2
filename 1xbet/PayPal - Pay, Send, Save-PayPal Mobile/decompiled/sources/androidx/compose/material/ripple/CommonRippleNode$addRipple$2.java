package androidx.compose.material.ripple;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.ripple.CommonRippleNode$addRipple$2", f = "CommonRipple.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CommonRippleNode$addRipple$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.material.ripple.RippleAnimation Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.interaction.PressInteraction.Press getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.material.ripple.CommonRippleNode getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.collection.MutableScatterMap mutableScatterMap;
        androidx.collection.MutableScatterMap mutableScatterMap2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (this.Camera2StreamConfigurationMap.animate(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            mutableScatterMap2 = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
            mutableScatterMap2.remove(this.getHighSpeedVideoFpsRanges);
            androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(this.getHighSpeedVideoSizes);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutableScatterMap = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
            mutableScatterMap.remove(this.getHighSpeedVideoFpsRanges);
            androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(this.getHighSpeedVideoSizes);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material.ripple.CommonRippleNode$addRipple$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material.ripple.CommonRippleNode$addRipple$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonRippleNode$addRipple$2(androidx.compose.material.ripple.RippleAnimation rippleAnimation, androidx.compose.material.ripple.CommonRippleNode commonRippleNode, androidx.compose.foundation.interaction.PressInteraction.Press press, kotlin.coroutines.Continuation<? super androidx.compose.material.ripple.CommonRippleNode$addRipple$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = rippleAnimation;
        this.getHighSpeedVideoSizes = commonRippleNode;
        this.getHighSpeedVideoFpsRanges = press;
    }
}
