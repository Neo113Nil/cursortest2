package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1", f = "TimePicker.kt", i = {}, l = {1769}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class TimePickerKt$ClockText$2$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.material3.AnalogTimePickerState Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.ui.unit.IntOffset> getHighSpeedVideoFpsRanges;
    final /* synthetic */ float getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.ui.geometry.Offset> getHighSpeedVideoSizes;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long m5762unboximpl;
        long m5762unboximpl2;
        long m8738unboximpl;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.material3.AnalogTimePickerState analogTimePickerState = this.Camera2StreamConfigurationMap;
            m5762unboximpl = ((androidx.compose.ui.geometry.Offset) this.getHighSpeedVideoSizes.getValue()).m5762unboximpl();
            float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (m5762unboximpl >> 32));
            m5762unboximpl2 = ((androidx.compose.ui.geometry.Offset) this.getHighSpeedVideoSizes.getValue()).m5762unboximpl();
            float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (m5762unboximpl2 & 4294967295L));
            float f = this.getHighSpeedVideoFpsRangesFor;
            boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
            m8738unboximpl = ((androidx.compose.ui.unit.IntOffset) this.getHighSpeedVideoFpsRanges.getValue()).m8738unboximpl();
            this.getOutputMinFrameDuration = 1;
            if (androidx.compose.material3.TimePickerKt.m4040access$onTapuYHVD98(analogTimePickerState, intBitsToFloat, intBitsToFloat2, f, z, m8738unboximpl, new androidx.compose.animation.core.SnapSpec(0, 1, null), this) == coroutine_suspended) {
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
        return ((androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimePickerKt$ClockText$2$1$1$1(androidx.compose.material3.AnalogTimePickerState analogTimePickerState, float f, boolean z, androidx.compose.runtime.MutableState<androidx.compose.ui.geometry.Offset> mutableState, androidx.compose.runtime.MutableState<androidx.compose.ui.unit.IntOffset> mutableState2, kotlin.coroutines.Continuation<? super androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = analogTimePickerState;
        this.getHighSpeedVideoFpsRangesFor = f;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoSizes = mutableState;
        this.getHighSpeedVideoFpsRanges = mutableState2;
    }
}
