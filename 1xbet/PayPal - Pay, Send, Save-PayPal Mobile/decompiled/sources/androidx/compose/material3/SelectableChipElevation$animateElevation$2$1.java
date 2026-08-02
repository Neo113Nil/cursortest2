package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.SelectableChipElevation$animateElevation$2$1", f = "Chip.kt", i = {}, l = {2562, 2564}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class SelectableChipElevation$animateElevation$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.Interaction> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.interaction.Interaction getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ float getHighSpeedVideoSizes;
    int getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (r6.getHighResolutionOutputSizeshNQ4ISI.snapTo(androidx.compose.ui.unit.Dp.m8599boximpl(r6.getHighSpeedVideoSizes), r6) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (androidx.compose.material3.internal.ElevationKt.m4300animateElevationrAjV9yQ(r6.getHighResolutionOutputSizeshNQ4ISI, r6.getHighSpeedVideoSizes, r7, r6.getHighSpeedVideoFpsRangesFor, r6) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (!androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighResolutionOutputSizeshNQ4ISI.getTargetValue().m8615unboximpl(), this.getHighSpeedVideoSizes)) {
                if (this.getHighSpeedVideoFpsRanges) {
                    androidx.compose.foundation.interaction.Interaction access$animateElevation$lambda$2 = androidx.compose.material3.SelectableChipElevation.access$animateElevation$lambda$2(this.Camera2StreamConfigurationMap);
                    this.getOutputMinFrameDuration = 2;
                } else {
                    this.getOutputMinFrameDuration = 1;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1 && i != 2) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.Camera2StreamConfigurationMap.setValue(this.getHighSpeedVideoFpsRangesFor);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material3.SelectableChipElevation$animateElevation$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.SelectableChipElevation$animateElevation$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectableChipElevation$animateElevation$2$1(androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> animatable, float f, boolean z, androidx.compose.foundation.interaction.Interaction interaction, androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.Interaction> mutableState, kotlin.coroutines.Continuation<? super androidx.compose.material3.SelectableChipElevation$animateElevation$2$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = animatable;
        this.getHighSpeedVideoSizes = f;
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighSpeedVideoFpsRangesFor = interaction;
        this.Camera2StreamConfigurationMap = mutableState;
    }
}
