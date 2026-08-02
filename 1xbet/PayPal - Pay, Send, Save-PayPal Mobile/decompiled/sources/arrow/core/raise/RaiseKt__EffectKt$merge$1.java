package arrow.core.raise;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "arrow.core.raise.RaiseKt__EffectKt", f = "Effect.kt", i = {0}, l = {676}, m = "merge", n = {"raise$iv$iv$iv"}, s = {"L$0"}, v = 1)
/* loaded from: classes.dex */
final class RaiseKt__EffectKt$merge$1<A> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return arrow.core.raise.RaiseKt.merge(null, this);
    }

    RaiseKt__EffectKt$merge$1(kotlin.coroutines.Continuation<? super arrow.core.raise.RaiseKt__EffectKt$merge$1> continuation) {
        super(continuation);
    }
}
