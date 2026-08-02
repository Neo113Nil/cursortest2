package androidx.camera.camera2.impl;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.CapturePipelineImpl", f = "CapturePipeline.kt", i = {1, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE}, m = "invokeCaptureTasks", n = {"pipelineTasks", "mainCaptureParams", "captureMode", "flashMode"}, s = {"L$0", "L$1", "I$0", "I$1"}, v = 1)
/* loaded from: classes6.dex */
final class CapturePipelineImpl$invokeCaptureTasks$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getOutputFormats;
    final /* synthetic */ androidx.camera.camera2.impl.CapturePipelineImpl getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getOutputFormats = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getOutputMinFrameDuration.getHighSpeedVideoSizes(null, 0, 0, 0, null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CapturePipelineImpl$invokeCaptureTasks$1(androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.CapturePipelineImpl$invokeCaptureTasks$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = capturePipelineImpl;
    }
}
