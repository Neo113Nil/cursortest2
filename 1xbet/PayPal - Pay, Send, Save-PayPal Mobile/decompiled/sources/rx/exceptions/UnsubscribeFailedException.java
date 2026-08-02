package rx.exceptions;

/* loaded from: classes18.dex */
public final class UnsubscribeFailedException extends java.lang.RuntimeException {
    private static final long serialVersionUID = 4594672310593167598L;

    public UnsubscribeFailedException(java.lang.Throwable th) {
        super(th == null ? new java.lang.NullPointerException() : th);
    }

    public UnsubscribeFailedException(java.lang.String str, java.lang.Throwable th) {
        super(str, th == null ? new java.lang.NullPointerException() : th);
    }
}
