package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/getHighSpeedVideoFpsRangesFor;", "", "time", "<init>", "(J)V", "", "fillInStackTrace", "()Ljava/lang/Throwable;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PointerEventTimeoutCancellationException extends java.util.concurrent.CancellationException {
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PointerEventTimeoutCancellationException(long j) {
        super(r0.toString());
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Timed out waiting for ");
        sb.append(j);
        sb.append(" ms");
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        java.lang.StackTraceElement[] stackTraceElementArr;
        stackTraceElementArr = androidx.compose.ui.input.pointer.SuspendingPointerInputFilter_jvmKt.getHighResolutionOutputSizeshNQ4ISI;
        setStackTrace(stackTraceElementArr);
        return this;
    }
}
