package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class Z implements java.util.Map.Entry, java.lang.Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Comparable f2278a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object f2279b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.datastore.preferences.protobuf.Y f2280c;

    public Z(androidx.datastore.preferences.protobuf.Y y2, java.lang.Comparable comparable, java.lang.Object obj) {
        this.f2280c = y2;
        this.f2278a = comparable;
        this.f2279b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return this.f2278a.compareTo(((androidx.datastore.preferences.protobuf.Z) obj).f2278a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object key = entry.getKey();
        java.lang.Comparable comparable = this.f2278a;
        if (comparable == null ? key == null : comparable.equals(key)) {
            java.lang.Object obj2 = this.f2279b;
            java.lang.Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.f2278a;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.f2279b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        java.lang.Comparable comparable = this.f2278a;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        java.lang.Object obj = this.f2279b;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        this.f2280c.b();
        java.lang.Object obj2 = this.f2279b;
        this.f2279b = obj;
        return obj2;
    }

    public final java.lang.String toString() {
        return this.f2278a + "=" + this.f2279b;
    }
}
