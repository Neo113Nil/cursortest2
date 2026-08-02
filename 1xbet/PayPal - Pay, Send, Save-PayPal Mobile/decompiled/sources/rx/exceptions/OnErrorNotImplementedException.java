package rx.exceptions;

/* loaded from: classes18.dex */
public class OnErrorNotImplementedException extends java.lang.RuntimeException {
    private static final long serialVersionUID = -6298857009889503852L;

    public OnErrorNotImplementedException(java.lang.String str, java.lang.Throwable th) {
        super(str, th == null ? new java.lang.NullPointerException() : th);
    }

    public OnErrorNotImplementedException(java.lang.Throwable th) {
        super(th != null ? th.getMessage() : null, th == null ? new java.lang.NullPointerException() : th);
    }
}
