package m0;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class L extends CancellationException {

    /* renamed from: b, reason: collision with root package name */
    public final transient T f897b;

    public L(String str, Throwable th, T t2) {
        super(str);
        this.f897b = t2;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l2 = (L) obj;
        return g0.h.a(l2.getMessage(), getMessage()) && g0.h.a(l2.f897b, this.f897b) && g0.h.a(l2.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        g0.h.b(message);
        int hashCode = (this.f897b.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f897b;
    }
}
