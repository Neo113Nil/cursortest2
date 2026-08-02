package androidx.camera.camera2.pipe.graph;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.graph.CameraGraphImpl", f = "CameraGraphImpl.kt", i = {0}, l = {188, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE}, m = "useSession", n = {"action"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class CameraGraphImpl$useSession$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.camera.camera2.pipe.graph.CameraGraphImpl Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.useSession(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraGraphImpl$useSession$1(androidx.camera.camera2.pipe.graph.CameraGraphImpl cameraGraphImpl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSession$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = cameraGraphImpl;
    }
}
