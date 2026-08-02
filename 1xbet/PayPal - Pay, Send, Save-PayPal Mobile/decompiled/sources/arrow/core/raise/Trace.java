package arrow.core.raise;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003"}, d2 = {"Larrow/core/raise/Trace;", "", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/getHighSpeedVideoFpsRanges;", "exception", "constructor-impl", "(Ljava/util/concurrent/CancellationException;)Ljava/util/concurrent/CancellationException;", "", "stackTraceToString-impl", "(Ljava/util/concurrent/CancellationException;)Ljava/lang/String;", "stackTraceToString", "", "printStackTrace-impl", "(Ljava/util/concurrent/CancellationException;)V", "printStackTrace", "", "", "suppressedExceptions-impl", "(Ljava/util/concurrent/CancellationException;)Ljava/util/List;", "suppressedExceptions", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/CancellationException;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class Trace {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.concurrent.CancellationException getHighSpeedVideoFpsRangesFor;

    private /* synthetic */ Trace(java.util.concurrent.CancellationException cancellationException) {
        this.getHighSpeedVideoFpsRangesFor = cancellationException;
    }

    /* renamed from: stackTraceToString-impl, reason: not valid java name */
    public static final java.lang.String m9714stackTraceToStringimpl(java.util.concurrent.CancellationException cancellationException) {
        java.util.concurrent.CancellationException cause = cancellationException.getCause();
        if (cause == null) {
            cause = cancellationException;
        }
        return kotlin.ExceptionsKt.stackTraceToString(cause);
    }

    /* renamed from: printStackTrace-impl, reason: not valid java name */
    public static final void m9713printStackTraceimpl(java.util.concurrent.CancellationException cancellationException) {
        java.util.concurrent.CancellationException cause = cancellationException.getCause();
        if (cause == null) {
            cause = cancellationException;
        }
        cause.printStackTrace();
    }

    /* renamed from: suppressedExceptions-impl, reason: not valid java name */
    public static final java.util.List<java.lang.Throwable> m9715suppressedExceptionsimpl(java.util.concurrent.CancellationException cancellationException) {
        java.lang.Throwable cause = cancellationException.getCause();
        java.util.List<java.lang.Throwable> suppressedExceptions = cause != null ? kotlin.ExceptionsKt.getSuppressedExceptions(cause) : null;
        if (suppressedExceptions == null) {
            suppressedExceptions = kotlin.collections.CollectionsKt.emptyList();
        }
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) suppressedExceptions, (java.lang.Iterable) kotlin.ExceptionsKt.getSuppressedExceptions(cancellationException));
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ java.util.concurrent.CancellationException getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String toString() {
        return m9716toStringimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    public final int hashCode() {
        return m9712hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean equals(java.lang.Object other) {
        return m9710equalsimpl(this.getHighSpeedVideoFpsRangesFor, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m9716toStringimpl(java.util.concurrent.CancellationException cancellationException) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Trace(exception=");
        sb.append(cancellationException);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9712hashCodeimpl(java.util.concurrent.CancellationException cancellationException) {
        return cancellationException.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9711equalsimpl0(java.util.concurrent.CancellationException cancellationException, java.util.concurrent.CancellationException cancellationException2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(cancellationException, cancellationException2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9710equalsimpl(java.util.concurrent.CancellationException cancellationException, java.lang.Object obj) {
        return (obj instanceof arrow.core.raise.Trace) && kotlin.jvm.internal.Intrinsics.areEqual(cancellationException, ((arrow.core.raise.Trace) obj).getGetHighSpeedVideoFpsRangesFor());
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static java.util.concurrent.CancellationException m9709constructorimpl(java.util.concurrent.CancellationException cancellationException) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancellationException, "");
        return cancellationException;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ arrow.core.raise.Trace m9708boximpl(java.util.concurrent.CancellationException cancellationException) {
        return new arrow.core.raise.Trace(cancellationException);
    }
}
