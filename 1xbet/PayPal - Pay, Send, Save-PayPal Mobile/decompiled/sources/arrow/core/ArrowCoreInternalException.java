package arrow.core;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Larrow/core/ArrowCoreInternalException;", "Ljava/lang/RuntimeException;", "Lkotlin/getHighSpeedVideoFpsRangesFor;", "<init>", "()V", "", "fillInStackTrace", "()Ljava/lang/Throwable;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ArrowCoreInternalException extends java.lang.RuntimeException {
    public static final arrow.core.ArrowCoreInternalException INSTANCE = new arrow.core.ArrowCoreInternalException();

    private ArrowCoreInternalException() {
        super("Arrow-Core internal error. Please let us know and create a ticket at https://github.com/arrow-kt/arrow-core/issues/new/choose", null);
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        return this;
    }
}
