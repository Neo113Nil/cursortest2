package n4;

/* loaded from: classes2.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final long f15368a;

    public E(long j) {
        this.f15368a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && E.class == obj.getClass() && this.f15368a == ((E) obj).f15368a;
    }

    public final int hashCode() {
        long j = this.f15368a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "Tag{tagNumber=" + this.f15368a + '}';
    }
}
