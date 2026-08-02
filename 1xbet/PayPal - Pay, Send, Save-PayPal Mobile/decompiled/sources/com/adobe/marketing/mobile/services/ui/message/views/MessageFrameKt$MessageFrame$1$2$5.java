package com.adobe.marketing.mobile.services.ui.message.views;

@kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt$MessageFrame$1$2$5", f = "MessageFrame.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class MessageFrameKt$MessageFrame$1$2$5 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Float, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ float Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Float> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Float> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.adobe.marketing.mobile.services.ui.message.GestureTracker getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Float> getHighSpeedVideoSizes;
    int getInputFormats;

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        float floatValue = f.floatValue();
        com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt$MessageFrame$1$2$5 messageFrameKt$MessageFrame$1$2$5 = new com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt$MessageFrame$1$2$5(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
        messageFrameKt$MessageFrame$1$2$5.Camera2StreamConfigurationMap = floatValue;
        return messageFrameKt$MessageFrame$1$2$5.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageFrameKt$MessageFrame$1$2$5(com.adobe.marketing.mobile.services.ui.message.GestureTracker gestureTracker, androidx.compose.runtime.MutableState<java.lang.Float> mutableState, androidx.compose.runtime.MutableState<java.lang.Float> mutableState2, androidx.compose.runtime.MutableState<java.lang.Float> mutableState3, kotlin.coroutines.Continuation<? super com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt$MessageFrame$1$2$5> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRangesFor = gestureTracker;
        this.getHighSpeedVideoFpsRanges = mutableState;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState2;
        this.getHighSpeedVideoSizes = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getInputFormats == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor.onDragFinished$core_phoneRelease(this.getHighSpeedVideoFpsRanges.getValue().floatValue(), this.getHighResolutionOutputSizeshNQ4ISI.getValue().floatValue(), this.Camera2StreamConfigurationMap);
            this.getHighSpeedVideoSizes.setValue(kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f));
            this.getHighResolutionOutputSizeshNQ4ISI.setValue(kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f));
            this.getHighSpeedVideoFpsRanges.setValue(kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f));
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
