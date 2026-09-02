package W;

import g0.h;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f389b;

    public c(Throwable th) {
        h.e(th, "exception");
        this.f389b = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return h.a(this.f389b, ((c) obj).f389b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f389b.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f389b + ')';
    }
}
