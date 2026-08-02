package androidx.camera.camera2.impl;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.CapturePipelineImpl", f = "CapturePipeline.kt", i = {0, 0, 0}, l = {com.visa.cbp.getCertUsage.setAucAID, com.visa.cbp.getCertUsage.getAucAID, 341}, m = "torchAsFlashCapture", n = {"mainCaptureParams", "pipelineTasks", "captureMode"}, s = {"L$0", "L$1", "I$0"}, v = 1)
/* loaded from: classes6.dex */
final class CapturePipelineImpl$torchAsFlashCapture$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ androidx.camera.camera2.impl.CapturePipelineImpl getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getInputFormats.Camera2StreamConfigurationMap(null, 0, 0, null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CapturePipelineImpl$torchAsFlashCapture$1(androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.CapturePipelineImpl$torchAsFlashCapture$1> continuation) {
        super(continuation);
        this.getInputFormats = capturePipelineImpl;
    }
}
