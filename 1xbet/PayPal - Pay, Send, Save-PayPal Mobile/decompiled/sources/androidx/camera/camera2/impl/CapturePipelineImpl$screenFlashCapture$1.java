package androidx.camera.camera2.impl;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.CapturePipelineImpl", f = "CapturePipeline.kt", i = {0, 0, 0, 0}, l = {528}, m = "screenFlashCapture", n = {"this_$iv", "$this$invoke$iv", "mainCaptureParams$iv", "captureMode"}, s = {"L$0", "L$1", "L$2", "I$0"}, v = 1)
/* loaded from: classes6.dex */
final class CapturePipelineImpl$screenFlashCapture$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.camera.camera2.impl.CapturePipelineImpl getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges(null, 0, null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CapturePipelineImpl$screenFlashCapture$1(androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.CapturePipelineImpl$screenFlashCapture$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = capturePipelineImpl;
    }
}
