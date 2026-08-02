package R6;

/* loaded from: classes9.dex */
final class h extends n {

    /* renamed from: a, reason: collision with root package name */
    private final long f24740a;

    h(long j11) {
        this.f24740a = j11;
    }

    @Override // R6.n
    public final long b() {
        return this.f24740a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.f24740a == ((n) obj).b();
    }

    public final int hashCode() {
        long j11 = this.f24740a;
        return ((int) ((j11 >>> 32) ^ j11)) ^ 1000003;
    }

    public final String toString() {
        return P4.f.a(this.f24740a, "}", new StringBuilder("LogResponse{nextRequestWaitMillis="));
    }
}
