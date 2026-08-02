package f6;

import io.sentry.SentryEvent;
import java.io.Serializable;

/* renamed from: f6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1112e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f13002a;

    public C1112e(Throwable th) {
        t6.h.e(th, SentryEvent.JsonKeys.EXCEPTION);
        this.f13002a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1112e) {
            if (t6.h.a(this.f13002a, ((C1112e) obj).f13002a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13002a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f13002a + ')';
    }
}
