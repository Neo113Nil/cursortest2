package D6;

import java.util.concurrent.CancellationException;

/* renamed from: D6.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0120f0 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient InterfaceC0118e0 f1834a;

    public C0120f0(String str, Throwable th, InterfaceC0118e0 interfaceC0118e0) {
        super(str);
        this.f1834a = interfaceC0118e0;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0120f0) {
                C0120f0 c0120f0 = (C0120f0) obj;
                if (!t6.h.a(c0120f0.getMessage(), getMessage()) || !t6.h.a(c0120f0.f1834a, this.f1834a) || !t6.h.a(c0120f0.getCause(), getCause())) {
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
        t6.h.b(message);
        int hashCode = (this.f1834a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f1834a;
    }
}
