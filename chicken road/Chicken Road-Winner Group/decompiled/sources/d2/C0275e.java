package d2;

import java.io.Serializable;
import kotlin.jvm.internal.j;

/* renamed from: d2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0275e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f4847a;

    public C0275e(Throwable exception) {
        j.e(exception, "exception");
        this.f4847a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0275e) {
            return j.a(this.f4847a, ((C0275e) obj).f4847a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4847a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f4847a + ')';
    }
}
