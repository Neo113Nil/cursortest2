package coil3.content;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", i = {0, 0, 1, 1, 1}, l = {181, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, m = "writeToDiskCache", n = {"snapshot", "networkResponse", "networkResponse", "modifiedNetworkResponse", "editor"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"}, v = 1)
/* loaded from: classes.dex */
final class NetworkFetcher$writeToDiskCache$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ coil3.content.NetworkFetcher getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI(null, null, null, null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkFetcher$writeToDiskCache$1(coil3.content.NetworkFetcher networkFetcher, kotlin.coroutines.Continuation<? super coil3.content.NetworkFetcher$writeToDiskCache$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = networkFetcher;
    }
}
