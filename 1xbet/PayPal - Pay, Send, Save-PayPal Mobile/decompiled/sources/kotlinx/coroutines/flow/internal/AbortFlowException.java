package kotlinx.coroutines.flow.internal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0004\u0010\n"}, d2 = {"Lkotlinx/coroutines/flow/internal/AbortFlowException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/getHighSpeedVideoFpsRangesFor;", "", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "<init>", "(Ljava/lang/Object;)V", "", "fillInStackTrace", "()Ljava/lang/Throwable;", "Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AbortFlowException extends java.util.concurrent.CancellationException {
    public final transient java.lang.Object owner;

    public AbortFlowException(java.lang.Object obj) {
        super("Flow was aborted, no more elements needed");
        this.owner = obj;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        if (kotlinx.coroutines.DebugKt.getDEBUG()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }
}
