package coil3.graphics;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.gif.AnimatedImageDecoder", f = "AnimatedImageDecoder.kt", i = {0, 1}, l = {59, 101}, m = "decode", n = {"isSampled", "isSampled"}, s = {"L$0", "L$0"}, v = 1)
/* loaded from: classes7.dex */
final class AnimatedImageDecoder$decode$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ coil3.graphics.AnimatedImageDecoder getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.decode(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnimatedImageDecoder$decode$1(coil3.graphics.AnimatedImageDecoder animatedImageDecoder, kotlin.coroutines.Continuation<? super coil3.graphics.AnimatedImageDecoder$decode$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = animatedImageDecoder;
    }
}
