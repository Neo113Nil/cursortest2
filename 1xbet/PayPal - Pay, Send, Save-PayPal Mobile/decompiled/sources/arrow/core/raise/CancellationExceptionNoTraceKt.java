package arrow.core.raise;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "raised", "Larrow/core/raise/Raise;", "raise", "Larrow/core/raise/RaiseCancellationException;", "NoTrace", "(Ljava/lang/Object;Larrow/core/raise/Raise;)Larrow/core/raise/RaiseCancellationException;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CancellationExceptionNoTraceKt {
    public static final arrow.core.raise.RaiseCancellationException NoTrace(java.lang.Object obj, arrow.core.raise.Raise<java.lang.Object> raise) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raise, "");
        return new arrow.core.raise.NoTraceImpl(obj, raise);
    }
}
