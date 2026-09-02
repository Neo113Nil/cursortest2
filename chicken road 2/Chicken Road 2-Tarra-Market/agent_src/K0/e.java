package K0;

import java.io.Serializable;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f201a;

    public e(Throwable exception) {
        j.e(exception, "exception");
        this.f201a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (j.a(this.f201a, ((e) obj).f201a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f201a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f201a + ')';
    }
}
