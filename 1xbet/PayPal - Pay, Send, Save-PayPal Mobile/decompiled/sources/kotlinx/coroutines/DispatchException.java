package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lkotlinx/coroutines/DispatchException;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "", "cause", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Ljava/lang/Throwable;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/CoroutineContext;)V", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DispatchException extends java.lang.Exception {
    private final java.lang.Throwable cause;

    @Override // java.lang.Throwable
    public final java.lang.Throwable getCause() {
        return this.cause;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DispatchException(java.lang.Throwable th, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlin.coroutines.CoroutineContext coroutineContext) {
        super(r0.toString(), th);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Coroutine dispatcher ");
        sb.append(coroutineDispatcher);
        sb.append(" threw an exception, context = ");
        sb.append(coroutineContext);
        this.cause = th;
    }
}
