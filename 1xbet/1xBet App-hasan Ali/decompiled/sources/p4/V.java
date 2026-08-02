package p4;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class V extends CancellationException {

    /* renamed from: k, reason: collision with root package name */
    public final transient b0 f18766k;

    public V(String str, Throwable th, b0 b0Var) {
        super(str);
        this.f18766k = b0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v4 = (V) obj;
        return kotlin.jvm.internal.l.a(v4.getMessage(), getMessage()) && kotlin.jvm.internal.l.a(v4.f18766k, this.f18766k) && kotlin.jvm.internal.l.a(v4.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.l.c(message);
        int hashCode = (this.f18766k.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f18766k;
    }
}
