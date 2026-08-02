package coil3.graphics;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.gif.AnimatedImageDecoder", f = "AnimatedImageDecoder.kt", i = {0}, l = {137}, m = "wrapDrawable", n = {"baseDrawable"}, s = {"L$0"}, v = 1)
/* loaded from: classes7.dex */
final class AnimatedImageDecoder$wrapDrawable$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ coil3.graphics.AnimatedImageDecoder getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnimatedImageDecoder$wrapDrawable$1(coil3.graphics.AnimatedImageDecoder animatedImageDecoder, kotlin.coroutines.Continuation<? super coil3.graphics.AnimatedImageDecoder$wrapDrawable$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = animatedImageDecoder;
    }
}
