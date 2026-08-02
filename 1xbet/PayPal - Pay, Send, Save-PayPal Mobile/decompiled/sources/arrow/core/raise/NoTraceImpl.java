package arrow.core.raise;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Larrow/core/raise/NoTraceImpl;", "Larrow/core/raise/RaiseCancellationException;", "", "p0", "Larrow/core/raise/Raise;", "p1", "<init>", "(Ljava/lang/Object;Larrow/core/raise/Raise;)V", "", "fillInStackTrace", "()Ljava/lang/Throwable;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class NoTraceImpl extends arrow.core.raise.RaiseCancellationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoTraceImpl(java.lang.Object obj, arrow.core.raise.Raise<java.lang.Object> raise) {
        super(obj, raise, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raise, "");
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }
}
