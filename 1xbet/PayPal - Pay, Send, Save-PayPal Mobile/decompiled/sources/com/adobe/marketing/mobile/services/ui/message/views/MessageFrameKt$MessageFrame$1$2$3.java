package com.adobe.marketing.mobile.services.ui.message.views;

@kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt$MessageFrame$1$2$3", f = "MessageFrame.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class MessageFrameKt$MessageFrame$1$2$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Float, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Float> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Float> getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ float getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Float> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.adobe.marketing.mobile.services.ui.message.GestureTracker getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        float floatValue = f.floatValue();
        com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt$MessageFrame$1$2$3 messageFrameKt$MessageFrame$1$2$3 = new com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt$MessageFrame$1$2$3(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
        messageFrameKt$MessageFrame$1$2$3.getHighSpeedVideoFpsRanges = floatValue;
        return messageFrameKt$MessageFrame$1$2$3.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageFrameKt$MessageFrame$1$2$3(com.adobe.marketing.mobile.services.ui.message.GestureTracker gestureTracker, androidx.compose.runtime.MutableState<java.lang.Float> mutableState, androidx.compose.runtime.MutableState<java.lang.Float> mutableState2, androidx.compose.runtime.MutableState<java.lang.Float> mutableState3, kotlin.coroutines.Continuation<? super com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt$MessageFrame$1$2$3> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoSizes = gestureTracker;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState;
        this.Camera2StreamConfigurationMap = mutableState2;
        this.getHighSpeedVideoFpsRangesFor = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getInputSizeshNQ4ISI == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes.onDragFinished$core_phoneRelease(this.getHighResolutionOutputSizeshNQ4ISI.getValue().floatValue(), this.Camera2StreamConfigurationMap.getValue().floatValue(), this.getHighSpeedVideoFpsRanges);
            this.getHighSpeedVideoFpsRangesFor.setValue(kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f));
            this.Camera2StreamConfigurationMap.setValue(kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f));
            this.getHighResolutionOutputSizeshNQ4ISI.setValue(kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f));
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
