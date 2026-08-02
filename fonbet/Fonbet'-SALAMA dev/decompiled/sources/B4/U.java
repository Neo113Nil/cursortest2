package B4;

/* loaded from: classes2.dex */
public final class U implements T {

    /* renamed from: a, reason: collision with root package name */
    public V f1132a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || U.class != obj.getClass()) {
            return false;
        }
        return this.f1132a.equals(((U) obj).f1132a);
    }

    public final int hashCode() {
        return this.f1132a.hashCode();
    }

    public final String toString() {
        return "MemoryCacheSettings{gcSettings=" + this.f1132a + "}";
    }
}
