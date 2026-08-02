package coil3.content;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", i = {0, 0, 1, 2}, l = {86, 105, 136}, m = "doFetch", n = {"snapshot", "cacheResponse", "snapshot", "snapshot"}, s = {"L$0", "L$1", "L$0", "L$0"}, v = 1)
/* loaded from: classes.dex */
final class NetworkFetcher$doFetch$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ coil3.content.NetworkFetcher getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkFetcher$doFetch$1(coil3.content.NetworkFetcher networkFetcher, kotlin.coroutines.Continuation<? super coil3.content.NetworkFetcher$doFetch$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = networkFetcher;
    }
}
