package W;

import g0.h;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class b implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Object f387b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f388c;

    public b(Serializable serializable, Serializable serializable2) {
        this.f387b = serializable;
        this.f388c = serializable2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.a(this.f387b, bVar.f387b) && this.f388c.equals(bVar.f388c);
    }

    public final int hashCode() {
        Object obj = this.f387b;
        return this.f388c.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "(" + this.f387b + ", " + this.f388c + ')';
    }
}
