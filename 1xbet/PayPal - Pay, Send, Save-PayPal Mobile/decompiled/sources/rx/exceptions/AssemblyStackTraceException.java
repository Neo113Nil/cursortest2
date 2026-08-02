package rx.exceptions;

/* loaded from: classes18.dex */
public final class AssemblyStackTraceException extends java.lang.RuntimeException {
    private static final long serialVersionUID = 2038859767182585852L;

    public AssemblyStackTraceException(java.lang.String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        synchronized (this) {
        }
        return this;
    }

    public final void attachTo(java.lang.Throwable th) {
        java.util.HashSet hashSet = new java.util.HashSet();
        while (th.getCause() != null) {
            th = th.getCause();
            if (!hashSet.add(th)) {
                rx.plugins.RxJavaHooks.onError(this);
                return;
            }
        }
        try {
            th.initCause(this);
        } catch (java.lang.IllegalStateException unused) {
            rx.plugins.RxJavaHooks.onError(new java.lang.RuntimeException("Received an exception with a cause set to null, instead of being unset. To fix this, look down the chain of causes. The last exception had a cause explicitly set to null. It should be unset instead.", th));
        }
    }

    public static rx.exceptions.AssemblyStackTraceException find(java.lang.Throwable th) {
        java.util.HashSet hashSet = new java.util.HashSet();
        while (!(th instanceof rx.exceptions.AssemblyStackTraceException)) {
            if (th == null || th.getCause() == null) {
                return null;
            }
            th = th.getCause();
            if (!hashSet.add(th)) {
                return null;
            }
        }
        return (rx.exceptions.AssemblyStackTraceException) th;
    }
}
