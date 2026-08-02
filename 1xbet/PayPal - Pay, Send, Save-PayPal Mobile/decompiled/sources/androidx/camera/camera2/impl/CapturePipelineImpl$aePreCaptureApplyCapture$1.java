package androidx.camera.camera2.impl;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.CapturePipelineImpl", f = "CapturePipeline.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {887, 494, 499}, m = "aePreCaptureApplyCapture", n = {"this_$iv", "$this$invoke$iv", "mainCaptureParams$iv", "timeLimitNs", "captureMode", "this_$iv", "$this$invoke$iv", "mainCaptureParams$iv", "captureMode", "this_$iv", "$this$invoke$iv", "mainCaptureParams$iv", "captureMode"}, s = {"L$0", "L$1", "L$2", "J$0", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0"}, v = 1)
/* loaded from: classes6.dex */
final class CapturePipelineImpl$aePreCaptureApplyCapture$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    long Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.camera2.impl.CapturePipelineImpl getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getOutputFormats.getHighSpeedVideoSizes(null, 0L, 0, null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CapturePipelineImpl$aePreCaptureApplyCapture$1(androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.CapturePipelineImpl$aePreCaptureApplyCapture$1> continuation) {
        super(continuation);
        this.getOutputFormats = capturePipelineImpl;
    }
}
