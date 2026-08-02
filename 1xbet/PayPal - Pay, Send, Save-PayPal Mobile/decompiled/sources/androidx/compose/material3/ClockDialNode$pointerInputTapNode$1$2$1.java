package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1", f = "TimePicker.kt", i = {}, l = {1509}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ClockDialNode$pointerInputTapNode$1$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.material3.ClockDialNode Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.geometry.Offset getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.material3.AnalogTimePickerState analogTimePickerState;
        boolean z;
        long highSpeedVideoFpsRanges;
        androidx.compose.animation.core.AnimationSpec animationSpec;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            analogTimePickerState = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (this.getHighSpeedVideoFpsRangesFor.m5762unboximpl() >> 32));
            float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (this.getHighSpeedVideoFpsRangesFor.m5762unboximpl() & 4294967295L));
            float access$getMaxDist = androidx.compose.material3.ClockDialNode.access$getMaxDist(this.Camera2StreamConfigurationMap);
            z = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            highSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges();
            animationSpec = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = 1;
            if (androidx.compose.material3.TimePickerKt.m4040access$onTapuYHVD98(analogTimePickerState, intBitsToFloat, intBitsToFloat2, access$getMaxDist, z, highSpeedVideoFpsRanges, animationSpec, this) == coroutine_suspended) {
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
        return ((androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClockDialNode$pointerInputTapNode$1$2$1(androidx.compose.material3.ClockDialNode clockDialNode, androidx.compose.ui.geometry.Offset offset, kotlin.coroutines.Continuation<? super androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = clockDialNode;
        this.getHighSpeedVideoFpsRangesFor = offset;
    }
}
