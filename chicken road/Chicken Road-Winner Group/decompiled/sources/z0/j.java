package z0;

/* loaded from: classes.dex */
public final class j extends q {

    /* renamed from: a, reason: collision with root package name */
    public final h f10677a;

    public j(h hVar) {
        this.f10677a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        Object obj2 = p.f10692a;
        ((j) qVar).getClass();
        return obj2.equals(obj2) && this.f10677a.equals(((j) qVar).f10677a);
    }

    public final int hashCode() {
        return ((p.f10692a.hashCode() ^ 1000003) * 1000003) ^ this.f10677a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f10692a + ", androidClientInfo=" + this.f10677a + "}";
    }
}
