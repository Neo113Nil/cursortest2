package Z;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f1861a;

    public j(java.util.List list) {
        this.f1861a = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Z.j.class.equals(obj.getClass())) {
            return false;
        }
        return this.f1861a.equals(((Z.j) obj).f1861a);
    }

    public final int hashCode() {
        return this.f1861a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    public final java.lang.String toString() {
        return i1.AbstractC0190i.Q(this.f1861a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
