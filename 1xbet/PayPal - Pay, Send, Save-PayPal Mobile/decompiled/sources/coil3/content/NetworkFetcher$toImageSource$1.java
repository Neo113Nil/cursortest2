package coil3.content;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", i = {0}, l = {270}, m = "toImageSource", n = {"buffer"}, s = {"L$0"}, v = 1)
/* loaded from: classes.dex */
final class NetworkFetcher$toImageSource$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ coil3.content.NetworkFetcher getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return coil3.content.NetworkFetcher.access$toImageSource(this.getHighSpeedVideoFpsRanges, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkFetcher$toImageSource$1(coil3.content.NetworkFetcher networkFetcher, kotlin.coroutines.Continuation<? super coil3.content.NetworkFetcher$toImageSource$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = networkFetcher;
    }
}
