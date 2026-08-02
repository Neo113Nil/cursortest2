package rx.exceptions;

/* loaded from: classes18.dex */
public final class OnCompletedFailedException extends java.lang.RuntimeException {
    private static final long serialVersionUID = 8622579378868820554L;

    public OnCompletedFailedException(java.lang.Throwable th) {
        super(th == null ? new java.lang.NullPointerException() : th);
    }

    public OnCompletedFailedException(java.lang.String str, java.lang.Throwable th) {
        super(str, th == null ? new java.lang.NullPointerException() : th);
    }
}
