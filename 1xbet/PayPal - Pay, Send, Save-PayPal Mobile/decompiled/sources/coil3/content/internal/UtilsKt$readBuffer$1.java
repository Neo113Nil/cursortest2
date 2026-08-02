package coil3.content.internal;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.network.internal.UtilsKt", f = "utils.kt", i = {0}, l = {23}, m = "readBuffer", n = {"buffer"}, s = {"L$1"}, v = 1)
/* loaded from: classes.dex */
final class UtilsKt$readBuffer$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return coil3.content.internal.UtilsKt.readBuffer(null, this);
    }

    UtilsKt$readBuffer$1(kotlin.coroutines.Continuation<? super coil3.content.internal.UtilsKt$readBuffer$1> continuation) {
        super(continuation);
    }
}
