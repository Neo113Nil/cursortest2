package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.IndicatorLineNode$invalidateIndicator$1", f = "TextField.kt", i = {}, l = {1599}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class IndicatorLineNode$invalidateIndicator$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material3.IndicatorLineNode getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.animation.core.Animatable animatable;
        androidx.compose.material3.TextFieldColors Camera2StreamConfigurationMap;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        androidx.compose.animation.core.SnapSpec snap$default;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            animatable = this.getHighSpeedVideoFpsRangesFor.getOutputFormats;
            if (animatable != null) {
                Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap();
                z = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
                z2 = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
                z3 = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
                androidx.compose.ui.graphics.Color m5986boximpl = androidx.compose.ui.graphics.Color.m5986boximpl(Camera2StreamConfigurationMap.m3939indicatorColorXeAY9LY$material3(z, z2, z3));
                z4 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
                if (z4) {
                    snap$default = androidx.compose.material3.MotionSchemeKt.fromToken((androidx.compose.material3.MotionScheme) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this.getHighSpeedVideoFpsRangesFor, androidx.compose.material3.MaterialTheme.INSTANCE.getLocalMotionScheme$material3()), androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastEffects);
                } else {
                    snap$default = androidx.compose.animation.core.AnimationSpecKt.snap$default(0, 1, null);
                }
                this.Camera2StreamConfigurationMap = 1;
                obj = androidx.compose.animation.core.Animatable.animateTo$default(animatable, m5986boximpl, snap$default, null, null, this, 12, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material3.IndicatorLineNode$invalidateIndicator$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.IndicatorLineNode$invalidateIndicator$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IndicatorLineNode$invalidateIndicator$1(androidx.compose.material3.IndicatorLineNode indicatorLineNode, kotlin.coroutines.Continuation<? super androidx.compose.material3.IndicatorLineNode$invalidateIndicator$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = indicatorLineNode;
    }
}
