package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.IndicatorLineNode$invalidateIndicator$2", f = "TextField.kt", i = {}, l = {1611}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class IndicatorLineNode$invalidateIndicator$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material3.IndicatorLineNode getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.animation.core.Animatable animatable;
        boolean z;
        float f;
        androidx.compose.ui.unit.Dp m8599boximpl;
        boolean z2;
        androidx.compose.animation.core.SnapSpec snap$default;
        boolean z3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            animatable = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDurationlomOqCM;
            z = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
            if (z) {
                z3 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
                if (z3) {
                    f = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
                    m8599boximpl = androidx.compose.ui.unit.Dp.m8599boximpl(f);
                    z2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
                    if (!z2) {
                        snap$default = androidx.compose.material3.MotionSchemeKt.fromToken((androidx.compose.material3.MotionScheme) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this.getHighSpeedVideoFpsRangesFor, androidx.compose.material3.MaterialTheme.INSTANCE.getLocalMotionScheme$material3()), androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastSpatial);
                    } else {
                        snap$default = androidx.compose.animation.core.AnimationSpecKt.snap$default(0, 1, null);
                    }
                    this.Camera2StreamConfigurationMap = 1;
                    if (androidx.compose.animation.core.Animatable.animateTo$default(animatable, m8599boximpl, snap$default, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            f = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
            m8599boximpl = androidx.compose.ui.unit.Dp.m8599boximpl(f);
            z2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
            if (!z2) {
            }
            this.Camera2StreamConfigurationMap = 1;
            if (androidx.compose.animation.core.Animatable.animateTo$default(animatable, m8599boximpl, snap$default, null, null, this, 12, null) == coroutine_suspended) {
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
        return ((androidx.compose.material3.IndicatorLineNode$invalidateIndicator$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.IndicatorLineNode$invalidateIndicator$2(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IndicatorLineNode$invalidateIndicator$2(androidx.compose.material3.IndicatorLineNode indicatorLineNode, kotlin.coroutines.Continuation<? super androidx.compose.material3.IndicatorLineNode$invalidateIndicator$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = indicatorLineNode;
    }
}
