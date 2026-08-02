package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/getHighSpeedVideoFpsRangesFor;", "Lkotlinx/coroutines/CopyableThrowable;", "", "message", "", "cause", "Lkotlinx/coroutines/Job;", "job", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlinx/coroutines/Job;)V", "fillInStackTrace", "()Ljava/lang/Throwable;", "createCopy", "()Lkotlinx/coroutines/JobCancellationException;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/Job;", "getHighResolutionOutputSizeshNQ4ISI", "getJob$kotlinx_coroutines_core", "()Lkotlinx/coroutines/Job;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JobCancellationException extends java.util.concurrent.CancellationException implements kotlinx.coroutines.CopyableThrowable<kotlinx.coroutines.JobCancellationException> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final transient kotlinx.coroutines.Job getHighResolutionOutputSizeshNQ4ISI;

    public JobCancellationException(java.lang.String str, java.lang.Throwable th, kotlinx.coroutines.Job job) {
        super(str);
        this.getHighResolutionOutputSizeshNQ4ISI = job;
        if (th != null) {
            initCause(th);
        }
    }

    public final kotlinx.coroutines.Job getJob$kotlinx_coroutines_core() {
        kotlinx.coroutines.Job job = this.getHighResolutionOutputSizeshNQ4ISI;
        return job == null ? kotlinx.coroutines.NonCancellable.INSTANCE : job;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        if (kotlinx.coroutines.DebugKt.getDEBUG()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }

    @Override // kotlinx.coroutines.CopyableThrowable
    public final kotlinx.coroutines.JobCancellationException createCopy() {
        if (!kotlinx.coroutines.DebugKt.getDEBUG()) {
            return null;
        }
        java.lang.String message = getMessage();
        kotlin.jvm.internal.Intrinsics.checkNotNull(message);
        return new kotlinx.coroutines.JobCancellationException(message, this, getJob$kotlinx_coroutines_core());
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        sb.append(getJob$kotlinx_coroutines_core());
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof kotlinx.coroutines.JobCancellationException)) {
            return false;
        }
        kotlinx.coroutines.JobCancellationException jobCancellationException = (kotlinx.coroutines.JobCancellationException) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(jobCancellationException.getMessage(), getMessage()) && kotlin.jvm.internal.Intrinsics.areEqual(jobCancellationException.getJob$kotlinx_coroutines_core(), getJob$kotlinx_coroutines_core()) && kotlin.jvm.internal.Intrinsics.areEqual(jobCancellationException.getCause(), getCause());
    }

    public final int hashCode() {
        java.lang.String message = getMessage();
        kotlin.jvm.internal.Intrinsics.checkNotNull(message);
        int hashCode = message.hashCode();
        kotlinx.coroutines.Job job$kotlinx_coroutines_core = getJob$kotlinx_coroutines_core();
        int hashCode2 = job$kotlinx_coroutines_core != null ? job$kotlinx_coroutines_core.hashCode() : 0;
        java.lang.Throwable cause = getCause();
        return (((hashCode * 31) + hashCode2) * 31) + (cause != null ? cause.hashCode() : 0);
    }
}
