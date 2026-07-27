package w2;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class Q extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient Z f10477a;

    public Q(String str, Throwable th, Z z3) {
        super(str);
        this.f10477a = z3;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q3 = (Q) obj;
        return kotlin.jvm.internal.j.a(q3.getMessage(), getMessage()) && kotlin.jvm.internal.j.a(q3.f10477a, this.f10477a) && kotlin.jvm.internal.j.a(q3.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.j.b(message);
        int hashCode = (this.f10477a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f10477a;
    }
}
