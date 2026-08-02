package Z6;

/* loaded from: classes9.dex */
final class b extends j {

    /* renamed from: a, reason: collision with root package name */
    private final long f35619a;

    /* renamed from: b, reason: collision with root package name */
    private final S6.r f35620b;

    /* renamed from: c, reason: collision with root package name */
    private final S6.m f35621c;

    b(long j11, S6.r rVar, S6.m mVar) {
        this.f35619a = j11;
        if (rVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f35620b = rVar;
        if (mVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f35621c = mVar;
    }

    @Override // Z6.j
    public final S6.m a() {
        return this.f35621c;
    }

    @Override // Z6.j
    public final long b() {
        return this.f35619a;
    }

    @Override // Z6.j
    public final S6.r c() {
        return this.f35620b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f35619a == jVar.b() && this.f35620b.equals(jVar.c()) && this.f35621c.equals(jVar.a());
    }

    public final int hashCode() {
        long j11 = this.f35619a;
        return ((((((int) ((j11 >>> 32) ^ j11)) ^ 1000003) * 1000003) ^ this.f35620b.hashCode()) * 1000003) ^ this.f35621c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f35619a + ", transportContext=" + this.f35620b + ", event=" + this.f35621c + "}";
    }
}
