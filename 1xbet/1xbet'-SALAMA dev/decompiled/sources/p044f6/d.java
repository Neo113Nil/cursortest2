package p044f6;

import java.io.Serializable;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13007b;

    public d(Object obj, Object obj2) {
        this.f13006a = obj;
        this.f13007b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return h.a(this.f13006a, dVar.f13006a) && h.a(this.f13007b, dVar.f13007b);
    }

    public final int hashCode() {
        Object obj = this.f13006a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f13007b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f13006a + ", " + this.f13007b + ')';
    }
}
