package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1", f = "TimePicker.kt", i = {}, l = {1539}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ClockDialNode$pointerInputDragNode$1$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.ui.geometry.Offset Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material3.ClockDialNode getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        float f;
        float f2;
        androidx.compose.material3.AnalogTimePickerState analogTimePickerState;
        float f3;
        long highSpeedVideoFpsRanges;
        float f4;
        long highSpeedVideoFpsRanges2;
        float highSpeedVideoFpsRangesFor;
        androidx.compose.animation.core.AnimationSpec animationSpec;
        androidx.compose.material3.AnalogTimePickerState analogTimePickerState2;
        float f5;
        float f6;
        long highSpeedVideoFpsRanges3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.material3.ClockDialNode clockDialNode = this.getHighSpeedVideoSizes;
            f = clockDialNode.getHighSpeedVideoFpsRanges;
            clockDialNode.getHighSpeedVideoFpsRanges = f + java.lang.Float.intBitsToFloat((int) (this.Camera2StreamConfigurationMap.m5762unboximpl() >> 32));
            androidx.compose.material3.ClockDialNode clockDialNode2 = this.getHighSpeedVideoSizes;
            f2 = clockDialNode2.getOutputFormats;
            clockDialNode2.getOutputFormats = f2 + java.lang.Float.intBitsToFloat((int) (this.Camera2StreamConfigurationMap.m5762unboximpl() & 4294967295L));
            analogTimePickerState = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
            f3 = this.getHighSpeedVideoSizes.getOutputFormats;
            highSpeedVideoFpsRanges = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges();
            float m8730getYimpl = f3 - androidx.compose.ui.unit.IntOffset.m8730getYimpl(highSpeedVideoFpsRanges);
            f4 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            highSpeedVideoFpsRanges2 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges();
            highSpeedVideoFpsRangesFor = androidx.compose.material3.TimePickerKt.getHighSpeedVideoFpsRangesFor(m8730getYimpl, f4 - androidx.compose.ui.unit.IntOffset.m8729getXimpl(highSpeedVideoFpsRanges2));
            animationSpec = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (androidx.compose.material3.AnalogTimePickerState.rotateTo$default(analogTimePickerState, highSpeedVideoFpsRangesFor, animationSpec, false, this, 4, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        analogTimePickerState2 = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
        f5 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
        f6 = this.getHighSpeedVideoSizes.getOutputFormats;
        float access$getMaxDist = androidx.compose.material3.ClockDialNode.access$getMaxDist(this.getHighSpeedVideoSizes);
        highSpeedVideoFpsRanges3 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges();
        androidx.compose.material3.TimePickerKt.getHighSpeedVideoFpsRangesFor(analogTimePickerState2, f5, f6, access$getMaxDist, highSpeedVideoFpsRanges3);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClockDialNode$pointerInputDragNode$1$2$1(androidx.compose.material3.ClockDialNode clockDialNode, androidx.compose.ui.geometry.Offset offset, kotlin.coroutines.Continuation<? super androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = clockDialNode;
        this.Camera2StreamConfigurationMap = offset;
    }
}
