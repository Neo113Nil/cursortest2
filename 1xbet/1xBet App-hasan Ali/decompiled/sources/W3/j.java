package W3;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class j implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final Throwable f6038k;

    public j(Throwable th) {
        kotlin.jvm.internal.l.f("exception", th);
        this.f6038k = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return kotlin.jvm.internal.l.a(this.f6038k, ((j) obj).f6038k);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6038k.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f6038k + ')';
    }
}
