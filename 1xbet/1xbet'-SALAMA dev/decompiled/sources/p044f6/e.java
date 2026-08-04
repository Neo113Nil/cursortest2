package p044f6;

import io.sentry.SentryEvent;
import java.io.Serializable;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f13008a;

    public e(Throwable th) {
        h.e(th, SentryEvent.JsonKeys.EXCEPTION);
        this.f13008a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (h.a(this.f13008a, ((e) obj).f13008a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13008a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f13008a + ')';
    }
}
