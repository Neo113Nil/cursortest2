package coil3.graphics;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", i = {0, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, 40}, m = "decode", n = {"$this$withPermit$iv", "$this$withPermit$iv"}, s = {"L$0", "L$0"}, v = 1)
/* loaded from: classes3.dex */
final class BitmapFactoryDecoder$decode$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ coil3.graphics.BitmapFactoryDecoder getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.decode(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BitmapFactoryDecoder$decode$1(coil3.graphics.BitmapFactoryDecoder bitmapFactoryDecoder, kotlin.coroutines.Continuation<? super coil3.graphics.BitmapFactoryDecoder$decode$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = bitmapFactoryDecoder;
    }
}
