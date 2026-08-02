package arrow.core;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a>\u0010\u0005\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000H\u0086\u0004\u0082\u0002\u0019\n\u0017\b\u0000\u0012\r\u0010ÿÿÿÿÿÿÿÿÿ\u0001\u0018\u0002\u001a\u0004\b\u0002\u0010\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "throwIfNotNull", "(Ljava/lang/Throwable;)V", "other", "mergeSuppressed", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThrowableUtilsKt {
    public static final void throwIfNotNull(java.lang.Throwable th) {
        if (th != null) {
            throw th;
        }
    }

    public static final java.lang.Throwable mergeSuppressed(java.lang.Throwable th, java.lang.Throwable th2) {
        if (th2 == null) {
            return th;
        }
        if (th == null) {
            return th2;
        }
        if (th2 instanceof java.util.concurrent.CancellationException) {
            kotlin.ExceptionsKt.addSuppressed(th, th2);
            return th;
        }
        kotlin.ExceptionsKt.addSuppressed(th, arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th2));
        return th;
    }
}
