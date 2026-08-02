package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.CardElevation$animateElevation$2$1", f = "Card.kt", i = {}, l = {727, 737}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class CardElevation$animateElevation$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.interaction.Interaction getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ float getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.material3.CardElevation getInputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r6.Camera2StreamConfigurationMap.snapTo(androidx.compose.ui.unit.Dp.m8599boximpl(r6.getHighSpeedVideoSizes), r6) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c3, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c1, code lost:
    
        if (androidx.compose.material3.internal.ElevationKt.m4300animateElevationrAjV9yQ(r6.Camera2StreamConfigurationMap, r6.getHighSpeedVideoSizes, r3, r6.getHighResolutionOutputSizeshNQ4ISI, r6) == r0) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        float f;
        float f2;
        float f3;
        float f4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (!androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.Camera2StreamConfigurationMap.getTargetValue().m8615unboximpl(), this.getHighSpeedVideoSizes)) {
                if (this.getHighSpeedVideoFpsRangesFor) {
                    float m8615unboximpl = this.Camera2StreamConfigurationMap.getTargetValue().m8615unboximpl();
                    f = this.getInputFormats.getHighSpeedVideoFpsRangesFor;
                    androidx.compose.foundation.interaction.DragInteraction.Start start = null;
                    if (androidx.compose.ui.unit.Dp.m8606equalsimpl0(m8615unboximpl, f)) {
                        start = new androidx.compose.foundation.interaction.PressInteraction.Press(androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0(), null);
                    } else {
                        f2 = this.getInputFormats.getHighSpeedVideoFpsRanges;
                        if (androidx.compose.ui.unit.Dp.m8606equalsimpl0(m8615unboximpl, f2)) {
                            start = new androidx.compose.foundation.interaction.HoverInteraction.Enter();
                        } else {
                            f3 = this.getInputFormats.Camera2StreamConfigurationMap;
                            if (androidx.compose.ui.unit.Dp.m8606equalsimpl0(m8615unboximpl, f3)) {
                                start = new androidx.compose.foundation.interaction.FocusInteraction.Focus();
                            } else {
                                f4 = this.getInputFormats.getHighSpeedVideoSizes;
                                if (androidx.compose.ui.unit.Dp.m8606equalsimpl0(m8615unboximpl, f4)) {
                                    start = new androidx.compose.foundation.interaction.DragInteraction.Start();
                                }
                            }
                        }
                    }
                    this.getHighSpeedVideoFpsRanges = 2;
                } else {
                    this.getHighSpeedVideoFpsRanges = 1;
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
        return ((androidx.compose.material3.CardElevation$animateElevation$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.CardElevation$animateElevation$2$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardElevation$animateElevation$2$1(androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> animatable, float f, boolean z, androidx.compose.material3.CardElevation cardElevation, androidx.compose.foundation.interaction.Interaction interaction, kotlin.coroutines.Continuation<? super androidx.compose.material3.CardElevation$animateElevation$2$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = animatable;
        this.getHighSpeedVideoSizes = f;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getInputFormats = cardElevation;
        this.getHighResolutionOutputSizeshNQ4ISI = interaction;
    }
}
