package O;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4825b;

    public b(Object obj, Object obj2) {
        this.f4824a = obj;
        this.f4825b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(bVar.f4824a, this.f4824a) && Objects.equals(bVar.f4825b, this.f4825b);
    }

    public final int hashCode() {
        Object obj = this.f4824a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f4825b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f4824a + " " + this.f4825b + "}";
    }
}
