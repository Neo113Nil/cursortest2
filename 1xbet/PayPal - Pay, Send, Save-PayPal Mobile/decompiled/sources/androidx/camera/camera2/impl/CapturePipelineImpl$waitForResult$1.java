package androidx.camera.camera2.impl;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.CapturePipelineImpl", f = "CapturePipeline.kt", i = {0}, l = {793}, m = "waitForResult", n = {"resultListener"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class CapturePipelineImpl$waitForResult$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.camera.camera2.impl.CapturePipelineImpl Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(0L, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CapturePipelineImpl$waitForResult$1(androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.CapturePipelineImpl$waitForResult$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = capturePipelineImpl;
    }
}
