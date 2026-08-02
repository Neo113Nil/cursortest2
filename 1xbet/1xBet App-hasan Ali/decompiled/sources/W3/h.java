package W3;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class h implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final Object f6036k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f6037l;

    public h(Object obj, Object obj2) {
        this.f6036k = obj;
        this.f6037l = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.l.a(this.f6036k, hVar.f6036k) && kotlin.jvm.internal.l.a(this.f6037l, hVar.f6037l);
    }

    public final int hashCode() {
        Object obj = this.f6036k;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f6037l;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f6036k + ", " + this.f6037l + ')';
    }
}
