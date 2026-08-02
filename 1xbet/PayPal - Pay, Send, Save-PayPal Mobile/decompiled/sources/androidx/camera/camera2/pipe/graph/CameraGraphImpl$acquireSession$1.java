package androidx.camera.camera2.pipe.graph;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.graph.CameraGraphImpl", f = "CameraGraphImpl.kt", i = {}, l = {175}, m = "acquireSession", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CameraGraphImpl$acquireSession$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.camera.camera2.pipe.graph.CameraGraphImpl Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.acquireSession(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraGraphImpl$acquireSession$1(androidx.camera.camera2.pipe.graph.CameraGraphImpl cameraGraphImpl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.graph.CameraGraphImpl$acquireSession$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = cameraGraphImpl;
    }
}
