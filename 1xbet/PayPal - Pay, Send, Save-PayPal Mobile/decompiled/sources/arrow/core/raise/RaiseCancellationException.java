package arrow.core.raise;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00060\u0001j\u0002`\u0002B#\b\u0004\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0011\u0012"}, d2 = {"Larrow/core/raise/RaiseCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/getHighSpeedVideoFpsRanges;", "", "p0", "Larrow/core/raise/Raise;", "p1", "<init>", "(Ljava/lang/Object;Larrow/core/raise/Raise;)V", "raised", "Ljava/lang/Object;", "getRaised$arrow_core", "()Ljava/lang/Object;", "raise", "Larrow/core/raise/Raise;", "getRaise$arrow_core", "()Larrow/core/raise/Raise;", "Larrow/core/raise/NoTraceImpl;", "Larrow/core/raise/Traced;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class RaiseCancellationException extends java.util.concurrent.CancellationException {
    private final arrow.core.raise.Raise<java.lang.Object> raise;
    private final java.lang.Object raised;

    private RaiseCancellationException(java.lang.Object obj, arrow.core.raise.Raise<java.lang.Object> raise) {
        super(arrow.core.raise.RaiseKt.RaiseCancellationExceptionCaptured);
        this.raised = obj;
        this.raise = raise;
    }

    /* renamed from: getRaised$arrow_core, reason: from getter */
    public final java.lang.Object getRaised() {
        return this.raised;
    }

    public final arrow.core.raise.Raise<java.lang.Object> getRaise$arrow_core() {
        return this.raise;
    }

    public /* synthetic */ RaiseCancellationException(java.lang.Object obj, arrow.core.raise.Raise raise, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, raise);
    }
}
