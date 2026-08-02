package arrow.core.raise;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "arrow.core.raise.RaiseKt__ErrorHandlersKt", f = "ErrorHandlers.kt", i = {0, 0}, l = {101}, m = "getOrElse", n = {"recover", "raise$iv$iv"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes.dex */
final class RaiseKt__ErrorHandlersKt$getOrElse$1<Error, A> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return arrow.core.raise.RaiseKt__ErrorHandlersKt.getOrElse(null, null, this);
    }

    RaiseKt__ErrorHandlersKt$getOrElse$1(kotlin.coroutines.Continuation<? super arrow.core.raise.RaiseKt__ErrorHandlersKt$getOrElse$1> continuation) {
        super(continuation);
    }
}
