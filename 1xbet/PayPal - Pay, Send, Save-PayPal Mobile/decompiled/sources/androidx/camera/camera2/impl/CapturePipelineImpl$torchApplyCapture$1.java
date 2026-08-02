package androidx.camera.camera2.impl;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.CapturePipelineImpl", f = "CapturePipeline.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5}, l = {408, 895, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_PATH_ROTATE, 421, 436, 440}, m = "torchApplyCapture", n = {"this_$iv", "$this$invoke$iv", "mainCaptureParams$iv", "captureMode", "timeLimitNs", "triggerAePreCapture", "torchOnRequired", "lock3ARequired", "this_$iv", "$this$invoke$iv", "mainCaptureParams$iv", "captureMode", "timeLimitNs", "triggerAePreCapture", "torchOnRequired", "lock3ARequired", "this_$iv", "$this$invoke$iv", "mainCaptureParams$iv", "captureMode", "triggerAePreCapture", "torchOnRequired", "lock3ARequired", "this_$iv", "$this$invoke$iv", "mainCaptureParams$iv", "captureMode", "triggerAePreCapture", "torchOnRequired", "lock3ARequired", "this_$iv", "$this$invoke$iv", "mainCaptureParams$iv", "captureMode", "triggerAePreCapture", "torchOnRequired", "lock3ARequired", "this_$iv", "$this$invoke$iv", "mainCaptureParams$iv", "captureMode", "triggerAePreCapture", "torchOnRequired", "lock3ARequired"}, s = {"L$0", "L$1", "L$2", "I$0", "J$0", "Z$0", "I$1", "I$2", "L$0", "L$1", "L$2", "I$0", "J$0", "Z$0", "I$1", "I$2", "L$0", "L$1", "L$2", "I$0", "Z$0", "I$1", "I$2", "L$0", "L$1", "L$2", "I$0", "Z$0", "I$1", "I$2", "L$0", "L$1", "L$2", "I$0", "Z$0", "I$1", "I$2", "L$0", "L$1", "L$2", "I$0", "Z$0", "I$1", "I$2"}, v = 1)
/* loaded from: classes6.dex */
final class CapturePipelineImpl$torchApplyCapture$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    long getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    boolean getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ androidx.camera.camera2.impl.CapturePipelineImpl getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getOutputStallDurationlomOqCM.getHighSpeedVideoFpsRanges(null, 0, 0L, null, false, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CapturePipelineImpl$torchApplyCapture$1(androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.CapturePipelineImpl$torchApplyCapture$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = capturePipelineImpl;
    }
}
