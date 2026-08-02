package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.CaptureSessionState", f = "CaptureSessionState.kt", i = {0, 0}, l = {567}, m = "tryCreateCaptureSession", n = {"surfaces", "device"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes6.dex */
final class CaptureSessionState$tryCreateCaptureSession$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.CaptureSessionState getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CaptureSessionState$tryCreateCaptureSession$1(androidx.camera.camera2.pipe.compat.CaptureSessionState captureSessionState, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.CaptureSessionState$tryCreateCaptureSession$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = captureSessionState;
    }
}
