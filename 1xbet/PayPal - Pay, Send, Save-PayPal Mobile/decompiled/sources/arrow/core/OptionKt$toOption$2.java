package arrow.core;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "arrow.core.OptionKt", f = "Option.kt", i = {0}, l = {571}, m = "toOption", n = {"raise$iv$iv$iv$iv"}, s = {"L$0"}, v = 1)
/* loaded from: classes.dex */
final class OptionKt$toOption$2<A> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return arrow.core.OptionKt.toOption(null, this);
    }

    OptionKt$toOption$2(kotlin.coroutines.Continuation<? super arrow.core.OptionKt$toOption$2> continuation) {
        super(continuation);
    }
}
