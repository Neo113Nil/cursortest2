package androidx.camera.camera2.pipe.internal;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.internal.GraphSessionLock", f = "GraphSessionLock.kt", i = {0}, l = {105}, m = "acquireToken$camera_camera2_pipe", n = {"$this$acquireToken$iv"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class GraphSessionLock$acquireToken$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.camera.camera2.pipe.internal.GraphSessionLock getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.acquireToken$camera_camera2_pipe(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphSessionLock$acquireToken$1(androidx.camera.camera2.pipe.internal.GraphSessionLock graphSessionLock, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.internal.GraphSessionLock$acquireToken$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = graphSessionLock;
    }
}
