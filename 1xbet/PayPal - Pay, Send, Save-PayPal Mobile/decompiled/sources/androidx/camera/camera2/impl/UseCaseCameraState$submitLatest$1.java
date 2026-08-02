package androidx.camera.camera2.impl;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.UseCaseCameraState", f = "UseCaseCameraState.kt", i = {0}, l = {400}, m = "submitLatest", n = {"signalToComplete"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class UseCaseCameraState$submitLatest$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.camera.camera2.impl.UseCaseCameraState getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UseCaseCameraState$submitLatest$1(androidx.camera.camera2.impl.UseCaseCameraState useCaseCameraState, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.UseCaseCameraState$submitLatest$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = useCaseCameraState;
    }
}
