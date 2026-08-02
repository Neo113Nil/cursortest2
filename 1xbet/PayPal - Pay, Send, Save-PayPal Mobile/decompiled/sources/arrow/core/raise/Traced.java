package arrow.core.raise;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00008\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Larrow/core/raise/Traced;", "Larrow/core/raise/RaiseCancellationException;", "", "raised", "Larrow/core/raise/Raise;", "raise", "cause", "<init>", "(Ljava/lang/Object;Larrow/core/raise/Raise;Larrow/core/raise/Traced;)V", "Larrow/core/raise/Traced;", "getCause", "()Larrow/core/raise/Traced;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Traced extends arrow.core.raise.RaiseCancellationException {
    private final arrow.core.raise.Traced cause;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Traced(java.lang.Object obj, arrow.core.raise.Raise<java.lang.Object> raise, arrow.core.raise.Traced traced) {
        super(obj, raise, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raise, "");
        this.cause = traced;
    }

    public /* synthetic */ Traced(java.lang.Object obj, arrow.core.raise.Raise raise, arrow.core.raise.Traced traced, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, raise, (i & 4) != 0 ? null : traced);
    }

    @Override // java.lang.Throwable
    public final arrow.core.raise.Traced getCause() {
        return this.cause;
    }
}
