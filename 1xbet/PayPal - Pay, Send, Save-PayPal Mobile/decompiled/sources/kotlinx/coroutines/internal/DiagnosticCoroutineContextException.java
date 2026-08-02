package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlinx/coroutines/internal/DiagnosticCoroutineContextException;", "Ljava/lang/RuntimeException;", "Lkotlin/getHighSpeedVideoFpsRangesFor;", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "", "getLocalizedMessage", "()Ljava/lang/String;", "", "fillInStackTrace", "()Ljava/lang/Throwable;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/coroutines/CoroutineContext;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DiagnosticCoroutineContextException extends java.lang.RuntimeException {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final transient kotlin.coroutines.CoroutineContext getHighResolutionOutputSizeshNQ4ISI;

    public DiagnosticCoroutineContextException(kotlin.coroutines.CoroutineContext coroutineContext) {
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineContext;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getLocalizedMessage() {
        return java.lang.String.valueOf(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }
}
