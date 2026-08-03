package kotlinx.coroutines.flow.internal;

/* compiled from: FlowExceptions.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/flow/internal/AbortFlowException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "owner", "", "<init>", "(Ljava/lang/Object;)V", "fillInStackTrace", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AbortFlowException extends java.util.concurrent.CancellationException {
    public final transient java.lang.Object owner;

    public AbortFlowException(java.lang.Object obj) {
        super("Flow was aborted, no more elements needed");
        this.owner = obj;
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
        if (kotlinx.coroutines.DebugKt.getDEBUG()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }
}
