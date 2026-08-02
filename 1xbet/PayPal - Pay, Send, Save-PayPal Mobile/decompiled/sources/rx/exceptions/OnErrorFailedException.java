package rx.exceptions;

/* loaded from: classes18.dex */
public class OnErrorFailedException extends java.lang.RuntimeException {
    private static final long serialVersionUID = -419289748403337611L;

    public OnErrorFailedException(java.lang.String str, java.lang.Throwable th) {
        super(str, th == null ? new java.lang.NullPointerException() : th);
    }

    public OnErrorFailedException(java.lang.Throwable th) {
        super(th != null ? th.getMessage() : null, th == null ? new java.lang.NullPointerException() : th);
    }
}
