package androidx.camera.camera2.impl;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.StillCaptureRequestControl", f = "StillCaptureRequestControl.kt", i = {0, 0}, l = {144}, m = "submitRequest", n = {"request", "requestControl"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes6.dex */
final class StillCaptureRequestControl$submitRequest$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.camera.camera2.impl.StillCaptureRequestControl getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return androidx.camera.camera2.impl.StillCaptureRequestControl.access$submitRequest(this.getHighSpeedVideoFpsRangesFor, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StillCaptureRequestControl$submitRequest$1(androidx.camera.camera2.impl.StillCaptureRequestControl stillCaptureRequestControl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.StillCaptureRequestControl$submitRequest$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = stillCaptureRequestControl;
    }
}
