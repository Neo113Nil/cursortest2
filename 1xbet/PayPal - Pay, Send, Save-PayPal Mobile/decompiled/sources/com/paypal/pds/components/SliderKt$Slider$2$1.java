package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.pds.components.SliderKt$Slider$2$1", f = "Slider.kt", i = {0, 1, 1, 1}, l = {409, 415}, m = "invokeSuspend", n = {"press", "press", "release", "$i$a$-let-SliderKt$Slider$2$1$1"}, nl = {410, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_PATH_ROTATE}, s = {"L$0", "L$1", "L$2", "I$0"}, v = 2)
/* loaded from: classes16.dex */
final class SliderKt$Slider$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.pds.components.SliderDraggableState Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSource getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction.Press> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction.Press> mutableState;
        androidx.compose.foundation.interaction.PressInteraction.Press press;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.Camera2StreamConfigurationMap.isDragging()) {
                androidx.compose.foundation.interaction.PressInteraction.Press press2 = new androidx.compose.foundation.interaction.PressInteraction.Press(androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0(), null);
                this.getHighSpeedVideoFpsRanges = press2;
                this.getOutputFormats = 1;
                if (this.getHighResolutionOutputSizeshNQ4ISI.emit(press2, this) != coroutine_suspended) {
                    press = press2;
                    this.getHighSpeedVideoFpsRangesFor.setValue(press);
                }
            } else {
                androidx.compose.foundation.interaction.PressInteraction.Press value = this.getHighSpeedVideoFpsRangesFor.getValue();
                if (value != null) {
                    androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.getHighResolutionOutputSizeshNQ4ISI;
                    androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction.Press> mutableState2 = this.getHighSpeedVideoFpsRangesFor;
                    androidx.compose.foundation.interaction.PressInteraction.Release release = new androidx.compose.foundation.interaction.PressInteraction.Release(value);
                    this.getHighSpeedVideoFpsRanges = mutableState2;
                    this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(value);
                    this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(release);
                    this.getHighSpeedVideoSizes = 0;
                    this.getOutputFormats = 2;
                    if (mutableInteractionSource.emit(release, this) != coroutine_suspended) {
                        mutableState = mutableState2;
                        mutableState.setValue(null);
                    }
                }
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            press = (androidx.compose.foundation.interaction.PressInteraction.Press) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor.setValue(press);
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableState = (androidx.compose.runtime.MutableState) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            mutableState.setValue(null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.pds.components.SliderKt$Slider$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.pds.components.SliderKt$Slider$2$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SliderKt$Slider$2$1(com.paypal.pds.components.SliderDraggableState sliderDraggableState, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction.Press> mutableState, kotlin.coroutines.Continuation<? super com.paypal.pds.components.SliderKt$Slider$2$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = sliderDraggableState;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableInteractionSource;
        this.getHighSpeedVideoFpsRangesFor = mutableState;
    }
}
