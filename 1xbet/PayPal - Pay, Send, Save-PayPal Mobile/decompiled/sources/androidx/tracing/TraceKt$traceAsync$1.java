package androidx.tracing;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.tracing.TraceKt", f = "Trace.android.kt", i = {0, 0}, l = {365}, m = "traceAsync", n = {"methodName", "cookie"}, s = {"L$0", "I$0"})
/* loaded from: classes7.dex */
final class TraceKt$traceAsync$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return androidx.tracing.TraceKt.traceAsync(null, 0, null, this);
    }

    TraceKt$traceAsync$1(kotlin.coroutines.Continuation<? super androidx.tracing.TraceKt$traceAsync$1> continuation) {
        super(continuation);
    }
}
