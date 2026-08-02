package H4;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f3308a;

    /* renamed from: b, reason: collision with root package name */
    public final b f3309b;

    public c(long j, b bVar) {
        this.f3308a = j;
        if (bVar == null) {
            throw new NullPointerException("Null offset");
        }
        this.f3309b = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f3308a == cVar.f3308a && this.f3309b.equals(cVar.f3309b);
    }

    public final int hashCode() {
        long j = this.f3308a;
        return ((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f3309b.hashCode();
    }

    public final String toString() {
        return "IndexState{sequenceNumber=" + this.f3308a + ", offset=" + this.f3309b + "}";
    }
}
