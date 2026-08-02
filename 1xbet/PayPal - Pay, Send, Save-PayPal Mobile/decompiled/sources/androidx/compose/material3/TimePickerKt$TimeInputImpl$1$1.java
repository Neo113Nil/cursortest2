package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1", f = "TimePicker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class TimePickerKt$TimeInputImpl$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.node.Ref<java.lang.Boolean> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.material3.TimePickerState getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges.getValue(), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true))) {
            this.getHighSpeedVideoFpsRangesFor.setValue(androidx.compose.material3.TimePickerKt.access$TimeInputImpl$hourTextValue(this.getHighSpeedVideoSizes));
            this.getHighResolutionOutputSizeshNQ4ISI.setValue(androidx.compose.material3.TimePickerKt.access$TimeInputImpl$minuteTextValue(this.getHighSpeedVideoSizes));
        }
        this.getHighSpeedVideoFpsRanges.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimePickerKt$TimeInputImpl$1$1(androidx.compose.ui.node.Ref<java.lang.Boolean> ref, androidx.compose.material3.TimePickerState timePickerState, androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> mutableState, androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> mutableState2, kotlin.coroutines.Continuation<? super androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = ref;
        this.getHighSpeedVideoSizes = timePickerState;
        this.getHighSpeedVideoFpsRangesFor = mutableState;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState2;
    }
}
