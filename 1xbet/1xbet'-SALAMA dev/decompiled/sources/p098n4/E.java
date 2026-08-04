package p098n4;

/* JADX INFO: loaded from: classes2.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15374a;

    public E(long j) {
        this.f15374a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && E.class == obj.getClass() && this.f15374a == ((E) obj).f15374a;
    }

    public final int hashCode() {
        long j = this.f15374a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "Tag{tagNumber=" + this.f15374a + '}';
    }
}
