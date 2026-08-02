package androidx.camera.camera2.impl;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.CapturePipelineImpl", f = "CapturePipeline.kt", i = {}, l = {772}, m = "isPhysicalFlashRequired", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CapturePipelineImpl$isPhysicalFlashRequired$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.camera.camera2.impl.CapturePipelineImpl getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(0, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CapturePipelineImpl$isPhysicalFlashRequired$1(androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.CapturePipelineImpl$isPhysicalFlashRequired$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = capturePipelineImpl;
    }
}
