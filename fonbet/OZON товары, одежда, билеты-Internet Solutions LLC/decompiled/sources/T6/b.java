package T6;

import T6.g;

/* loaded from: classes9.dex */
final class b extends g {

    /* renamed from: a, reason: collision with root package name */
    private final g.a f26676a;

    /* renamed from: b, reason: collision with root package name */
    private final long f26677b;

    b(g.a aVar, long j11) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f26676a = aVar;
        this.f26677b = j11;
    }

    @Override // T6.g
    public final long b() {
        return this.f26677b;
    }

    @Override // T6.g
    public final g.a c() {
        return this.f26676a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f26676a.equals(gVar.c()) && this.f26677b == gVar.b();
    }

    public final int hashCode() {
        int hashCode = (this.f26676a.hashCode() ^ 1000003) * 1000003;
        long j11 = this.f26677b;
        return hashCode ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        sb2.append(this.f26676a);
        sb2.append(", nextRequestWaitMillis=");
        return P4.f.a(this.f26677b, "}", sb2);
    }
}
