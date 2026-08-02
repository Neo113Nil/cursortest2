package arrow.core.raise;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "arrow.core.raise.RaiseKt__FoldKt", f = "Fold.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {39, 39, 39, 39}, m = "fold", n = {"catch", "recover", "transform", "raise$iv", "catch", "recover", "raise$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"}, v = 1)
/* loaded from: classes.dex */
final class RaiseKt__FoldKt$fold$1<Error, A, B> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return arrow.core.raise.RaiseKt.fold(null, null, null, null, this);
    }

    RaiseKt__FoldKt$fold$1(kotlin.coroutines.Continuation<? super arrow.core.raise.RaiseKt__FoldKt$fold$1> continuation) {
        super(continuation);
    }
}
