package androidx.camera.camera2.pipe.internal;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.internal.GraphSessionLock", f = "GraphSessionLock.kt", i = {0}, l = {98}, m = "use", n = {"$this$use"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class GraphSessionLock$use$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.camera2.pipe.internal.GraphSessionLock getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(null, null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphSessionLock$use$1(androidx.camera.camera2.pipe.internal.GraphSessionLock graphSessionLock, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.internal.GraphSessionLock$use$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = graphSessionLock;
    }
}
