package M7;

/* loaded from: classes9.dex */
final class f extends g {

    /* renamed from: a, reason: collision with root package name */
    private final long f17513a;

    f(long j11) {
        this.f17513a = j11;
    }

    @Override // M7.g
    public final long a() {
        return this.f17513a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.getClass();
        return this.f17513a == gVar.a();
    }

    public final int hashCode() {
        long j11 = this.f17513a;
        return ((int) ((j11 >>> 32) ^ j11)) ^ (-724379968);
    }

    public final String toString() {
        return P4.f.a(this.f17513a, "}", new StringBuilder("EventRecord{eventType=3, eventTimestamp="));
    }
}
