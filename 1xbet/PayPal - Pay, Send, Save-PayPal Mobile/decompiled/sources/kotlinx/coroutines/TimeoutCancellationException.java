package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u001b\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r"}, d2 = {"Lkotlinx/coroutines/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/getHighSpeedVideoFpsRangesFor;", "Lkotlinx/coroutines/CopyableThrowable;", "", "message", "Lkotlinx/coroutines/Job;", "coroutine", "<init>", "(Ljava/lang/String;Lkotlinx/coroutines/Job;)V", "(Ljava/lang/String;)V", "createCopy", "()Lkotlinx/coroutines/TimeoutCancellationException;", "Lkotlinx/coroutines/Job;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TimeoutCancellationException extends java.util.concurrent.CancellationException implements kotlinx.coroutines.CopyableThrowable<kotlinx.coroutines.TimeoutCancellationException> {
    public final transient kotlinx.coroutines.Job coroutine;

    public TimeoutCancellationException(java.lang.String str, kotlinx.coroutines.Job job) {
        super(str);
        this.coroutine = job;
    }

    public TimeoutCancellationException(java.lang.String str) {
        this(str, null);
    }

    @Override // kotlinx.coroutines.CopyableThrowable
    public final kotlinx.coroutines.TimeoutCancellationException createCopy() {
        java.lang.String message = getMessage();
        if (message == null) {
            message = "";
        }
        kotlinx.coroutines.TimeoutCancellationException timeoutCancellationException = new kotlinx.coroutines.TimeoutCancellationException(message, this.coroutine);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }
}
