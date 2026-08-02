package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.ButtonElevation$animateElevation$2$1", f = "Button.kt", i = {}, l = {998, 1007}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class ButtonElevation$animateElevation$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ float getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.interaction.Interaction getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.material3.ButtonElevation getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r6.getHighSpeedVideoFpsRangesFor.snapTo(androidx.compose.ui.unit.Dp.m8599boximpl(r6.getHighSpeedVideoFpsRanges), r6) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ad, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
    
        if (androidx.compose.material3.internal.ElevationKt.m4300animateElevationrAjV9yQ(r6.getHighSpeedVideoFpsRangesFor, r6.getHighSpeedVideoFpsRanges, r3, r6.getHighSpeedVideoSizes, r6) == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        float f;
        float f2;
        float f3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (!androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighSpeedVideoFpsRangesFor.getTargetValue().m8615unboximpl(), this.getHighSpeedVideoFpsRanges)) {
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    float m8615unboximpl = this.getHighSpeedVideoFpsRangesFor.getTargetValue().m8615unboximpl();
                    f = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap;
                    androidx.compose.foundation.interaction.FocusInteraction.Focus focus = null;
                    if (androidx.compose.ui.unit.Dp.m8606equalsimpl0(m8615unboximpl, f)) {
                        focus = new androidx.compose.foundation.interaction.PressInteraction.Press(androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0(), null);
                    } else {
                        f2 = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges;
                        if (androidx.compose.ui.unit.Dp.m8606equalsimpl0(m8615unboximpl, f2)) {
                            focus = new androidx.compose.foundation.interaction.HoverInteraction.Enter();
                        } else {
                            f3 = this.getOutputMinFrameDuration.getHighSpeedVideoSizes;
                            if (androidx.compose.ui.unit.Dp.m8606equalsimpl0(m8615unboximpl, f3)) {
                                focus = new androidx.compose.foundation.interaction.FocusInteraction.Focus();
                            }
                        }
                    }
                    this.Camera2StreamConfigurationMap = 2;
                } else {
                    this.Camera2StreamConfigurationMap = 1;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material3.ButtonElevation$animateElevation$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.ButtonElevation$animateElevation$2$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonElevation$animateElevation$2$1(androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> animatable, float f, boolean z, androidx.compose.material3.ButtonElevation buttonElevation, androidx.compose.foundation.interaction.Interaction interaction, kotlin.coroutines.Continuation<? super androidx.compose.material3.ButtonElevation$animateElevation$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = animatable;
        this.getHighSpeedVideoFpsRanges = f;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getOutputMinFrameDuration = buttonElevation;
        this.getHighSpeedVideoSizes = interaction;
    }
}
