package z1;

/* loaded from: classes.dex */
public final class Q extends java.util.concurrent.CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient z1.Z f8539a;

    public Q(java.lang.String str, java.lang.Throwable th, z1.Z z2) {
        super(str);
        this.f8539a = z2;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            if (obj instanceof z1.Q) {
                z1.Q q2 = (z1.Q) obj;
                if (!kotlin.jvm.internal.i.a(q2.getMessage(), getMessage()) || !kotlin.jvm.internal.i.a(q2.f8539a, this.f8539a) || !kotlin.jvm.internal.i.a(q2.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        java.lang.String message = getMessage();
        kotlin.jvm.internal.i.b(message);
        int hashCode = (this.f8539a.hashCode() + (message.hashCode() * 31)) * 31;
        java.lang.Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        return super.toString() + "; job=" + this.f8539a;
    }
}
