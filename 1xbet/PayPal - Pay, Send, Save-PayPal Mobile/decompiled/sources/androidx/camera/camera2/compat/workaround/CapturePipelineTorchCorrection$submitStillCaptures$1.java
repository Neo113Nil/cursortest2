package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection", f = "CapturePipelineTorchCorrection.kt", i = {0}, l = {75}, m = "submitStillCaptures-BvXKQx0", n = {"needCorrectTorchState"}, s = {"Z$0"}, v = 1)
/* loaded from: classes6.dex */
final class CapturePipelineTorchCorrection$submitStillCaptures$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.mo73submitStillCapturesBvXKQx0(null, 0, null, 0, 0, 0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CapturePipelineTorchCorrection$submitStillCaptures$1(androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection capturePipelineTorchCorrection, kotlin.coroutines.Continuation<? super androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection$submitStillCaptures$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = capturePipelineTorchCorrection;
    }
}
