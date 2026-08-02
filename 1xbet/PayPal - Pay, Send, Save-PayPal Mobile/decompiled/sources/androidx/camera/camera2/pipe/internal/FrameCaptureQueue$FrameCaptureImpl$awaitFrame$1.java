package androidx.camera.camera2.pipe.internal;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.internal.FrameCaptureQueue$FrameCaptureImpl", f = "FrameCaptureQueue.kt", i = {}, l = {165}, m = "awaitFrame", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class FrameCaptureQueue$FrameCaptureImpl$awaitFrame$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.camera2.pipe.internal.FrameCaptureQueue.FrameCaptureImpl getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.awaitFrame(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FrameCaptureQueue$FrameCaptureImpl$awaitFrame$1(androidx.camera.camera2.pipe.internal.FrameCaptureQueue.FrameCaptureImpl frameCaptureImpl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.internal.FrameCaptureQueue$FrameCaptureImpl$awaitFrame$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = frameCaptureImpl;
    }
}
