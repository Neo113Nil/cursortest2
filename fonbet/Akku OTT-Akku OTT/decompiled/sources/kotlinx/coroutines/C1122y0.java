package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlinx.coroutines.y0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1122y0 extends CancellationException {

    @JvmField
    public final transient C0 a;

    public C1122y0(String str, Throwable th, C0 c0) {
        super(str);
        this.a = c0;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1122y0)) {
            return false;
        }
        C1122y0 c1122y0 = (C1122y0) obj;
        return Intrinsics.areEqual(c1122y0.getMessage(), getMessage()) && Intrinsics.areEqual(c1122y0.a, this.a) && Intrinsics.areEqual(c1122y0.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        Intrinsics.checkNotNull(message);
        int hashCode = (this.a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.a;
    }
}
