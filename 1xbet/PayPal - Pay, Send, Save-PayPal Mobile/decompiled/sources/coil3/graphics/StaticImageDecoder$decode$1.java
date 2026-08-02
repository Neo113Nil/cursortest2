package coil3.graphics;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.decode.StaticImageDecoder", f = "StaticImageDecoder.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE}, m = "decode", n = {"$this$withPermit$iv"}, s = {"L$0"}, v = 1)
/* loaded from: classes3.dex */
final class StaticImageDecoder$decode$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ coil3.graphics.StaticImageDecoder Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.decode(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StaticImageDecoder$decode$1(coil3.graphics.StaticImageDecoder staticImageDecoder, kotlin.coroutines.Continuation<? super coil3.graphics.StaticImageDecoder$decode$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = staticImageDecoder;
    }
}
