package coil3;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.RealImageLoader", f = "RealImageLoader.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {118, 130, 134}, m = "execute", n = {"requestDelegate", "request", "eventListener", "requestDelegate", "request", "eventListener", "cachedPlaceholder", "requestDelegate", "request", "eventListener"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"}, v = 1)
/* loaded from: classes3.dex */
final class RealImageLoader$execute$3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ coil3.RealImageLoader getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getInputFormats = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap(null, 0, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealImageLoader$execute$3(coil3.RealImageLoader realImageLoader, kotlin.coroutines.Continuation<? super coil3.RealImageLoader$execute$3> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = realImageLoader;
    }
}
