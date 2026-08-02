package B4;

/* loaded from: classes2.dex */
public final class W implements T {

    /* renamed from: a, reason: collision with root package name */
    public final long f1134a;

    public W(long j) {
        this.f1134a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && W.class == obj.getClass() && this.f1134a == ((W) obj).f1134a;
    }

    public final int hashCode() {
        long j = this.f1134a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "PersistentCacheSettings{sizeBytes=" + this.f1134a + '}';
    }
}
