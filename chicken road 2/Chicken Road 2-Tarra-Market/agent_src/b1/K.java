package b1;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class K extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient S f631a;

    public K(String str, Throwable th, S s2) {
        super(str);
        this.f631a = s2;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof K) {
                K k2 = (K) obj;
                if (!kotlin.jvm.internal.j.a(k2.getMessage(), getMessage()) || !kotlin.jvm.internal.j.a(k2.f631a, this.f631a) || !kotlin.jvm.internal.j.a(k2.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.j.b(message);
        int hashCode = (this.f631a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f631a;
    }
}
