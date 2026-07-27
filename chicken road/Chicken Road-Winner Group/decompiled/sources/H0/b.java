package H0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f490a;

    /* renamed from: b, reason: collision with root package name */
    public final A0.k f491b;

    /* renamed from: c, reason: collision with root package name */
    public final A0.i f492c;

    public b(long j3, A0.k kVar, A0.i iVar) {
        this.f490a = j3;
        this.f491b = kVar;
        this.f492c = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f490a == bVar.f490a && this.f491b.equals(bVar.f491b) && this.f492c.equals(bVar.f492c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f490a;
        return ((((((int) ((j3 >>> 32) ^ j3)) ^ 1000003) * 1000003) ^ this.f491b.hashCode()) * 1000003) ^ this.f492c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f490a + ", transportContext=" + this.f491b + ", event=" + this.f492c + "}";
    }
}
