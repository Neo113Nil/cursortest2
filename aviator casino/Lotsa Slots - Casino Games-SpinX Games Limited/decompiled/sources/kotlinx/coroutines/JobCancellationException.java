package kotlinx.coroutines;

/* compiled from: Exceptions.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000f\u001a\u00020\u0007H\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0000H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0010\u0010\f\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/CopyableThrowable;", "message", "", "cause", "", "job", "Lkotlinx/coroutines/Job;", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlinx/coroutines/Job;)V", "_job", "getJob$kotlinx_coroutines_core", "()Lkotlinx/coroutines/Job;", "fillInStackTrace", "createCopy", "toString", "equals", "", "other", "", "hashCode", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JobCancellationException extends java.util.concurrent.CancellationException implements kotlinx.coroutines.CopyableThrowable<kotlinx.coroutines.JobCancellationException> {
    private final transient kotlinx.coroutines.Job _job;

    public JobCancellationException(java.lang.String str, java.lang.Throwable th, kotlinx.coroutines.Job job) {
        super(str);
        this._job = job;
        if (th != null) {
            initCause(th);
        }
    }

    public final kotlinx.coroutines.Job getJob$kotlinx_coroutines_core() {
        kotlinx.coroutines.Job job = this._job;
        return job == null ? kotlinx.coroutines.NonCancellable.INSTANCE : job;
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
        if (kotlinx.coroutines.DebugKt.getDEBUG()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }

    @Override // kotlinx.coroutines.CopyableThrowable
    public kotlinx.coroutines.JobCancellationException createCopy() {
        if (!kotlinx.coroutines.DebugKt.getDEBUG()) {
            return null;
        }
        java.lang.String message = getMessage();
        kotlin.jvm.internal.Intrinsics.checkNotNull(message);
        return new kotlinx.coroutines.JobCancellationException(message, this, getJob$kotlinx_coroutines_core());
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        return super.toString() + "; job=" + getJob$kotlinx_coroutines_core();
    }

    public boolean equals(java.lang.Object other) {
        if (other != this) {
            if (other instanceof kotlinx.coroutines.JobCancellationException) {
                kotlinx.coroutines.JobCancellationException jobCancellationException = (kotlinx.coroutines.JobCancellationException) other;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(jobCancellationException.getMessage(), getMessage()) || !kotlin.jvm.internal.Intrinsics.areEqual(jobCancellationException.getJob$kotlinx_coroutines_core(), getJob$kotlinx_coroutines_core()) || !kotlin.jvm.internal.Intrinsics.areEqual(jobCancellationException.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        java.lang.String message = getMessage();
        kotlin.jvm.internal.Intrinsics.checkNotNull(message);
        int hashCode = message.hashCode() * 31;
        kotlinx.coroutines.Job job$kotlinx_coroutines_core = getJob$kotlinx_coroutines_core();
        int hashCode2 = (hashCode + (job$kotlinx_coroutines_core != null ? job$kotlinx_coroutines_core.hashCode() : 0)) * 31;
        java.lang.Throwable cause = getCause();
        return hashCode2 + (cause != null ? cause.hashCode() : 0);
    }
}
